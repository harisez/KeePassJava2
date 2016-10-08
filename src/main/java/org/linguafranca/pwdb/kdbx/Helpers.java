/*
 * Copyright 2015 Jo Rabin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.linguafranca.pwdb.kdbx;

import com.google.common.io.ByteStreams;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.jetbrains.annotations.Nullable;
import org.linguafranca.pwdb.kdbx.jaxb.binding.ObjectFactory;
import org.linguafranca.pwdb.kdbx.jaxb.binding.StringField;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * @author jo
 */
public class Helpers {
    public static String base64FromUuid(UUID uuid) {
        byte[] buffer = new byte[16];
        ByteBuffer b = ByteBuffer.wrap(buffer);
        b.putLong(uuid.getMostSignificantBits());
        b.putLong(8, uuid.getLeastSignificantBits());
        // round the houses for Android
        return new String(Base64.encodeBase64(buffer));
    }

    public static String hexStringFromUuid(UUID uuid) {
        byte[] buffer = new byte[16];
        ByteBuffer b = ByteBuffer.wrap(buffer);
        b.putLong(uuid.getMostSignificantBits());
        b.putLong(8, uuid.getLeastSignificantBits());
        // round the houses for Android
        return new String(Hex.encodeHex(buffer));
    }

    public static String hexStringFromBase64(String base64) {
        // round the houses for Android
        byte[] buffer = Base64.decodeBase64(base64.getBytes());
        return new String(Hex.encodeHex(buffer));
    }

    public static UUID uuidFromBase64(String base64) {
        // round the houses for Android
        byte[] buffer = Base64.decodeBase64(base64.getBytes());
        ByteBuffer b = ByteBuffer.wrap(buffer);
        return new UUID(b.getLong(), b.getLong(8));
    }

    public static Boolean toBoolean(String value) {
        return value.toLowerCase().equals("true") || value.toLowerCase().equals("Yes") || value.equals("1");
    }

    public static String fromBoolean(Boolean value) {
        return value==null? "False" : value ? "True" : "False";
    }

    private static SimpleDateFormat inFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

    public static Date toDate(String value) {
        try {
            return inFormat.parse(value);
        } catch (ParseException e) {
            throw new IllegalStateException(e);
        }
    }

    public static String fromDate(Date value) {
        return inFormat.format(value);
    }

    @Nullable
    public static byte[] getBinaryBase64Content(byte[] content, boolean isCompressed) {
        byte[] value = Base64.decodeBase64(content);

        return getBinaryContent(value, isCompressed);
    }
    @Nullable
    public static byte[] getBinaryContent(byte[] content, boolean isCompressed) {
        if (isCompressed) {
            ByteArrayInputStream bais = new ByteArrayInputStream(content);
            try {
                GZIPInputStream g = new GZIPInputStream(bais);
                content = ByteStreams.toByteArray(g);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        return content;
    }

    public static String SetBinaryBase64Content(byte[] value) {
        // render as base64
        return Base64.encodeBase64String(setBinaryContent(value));
    }

    public static byte[] setBinaryContent(byte[] value) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // zip up the content
        try {
            GZIPOutputStream g = new GZIPOutputStream(baos);
            g.write(value, 0, value.length);
            g.flush();
            g.close();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        return baos.toByteArray();
    }
}
