//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.08 at 07:00:39 PM BST 
//


package org.linguafranca.pwdb.kdbx.jaxb.binding;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.linguafranca.pwdb.kdbx.jaxb.binding package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AutoTypeAssociationWindow_QNAME = new QName("", "Window");
    private final static QName _AutoTypeAssociationKeystrokeSequence_QNAME = new QName("", "KeystrokeSequence");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.linguafranca.pwdb.kdbx.jaxb.binding
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link KeePassFile }
     * 
     */
    public KeePassFile createKeePassFile() {
        return new KeePassFile();
    }

    /**
     * Create an instance of {@link Binaries }
     * 
     */
    public Binaries createBinaries() {
        return new Binaries();
    }

    /**
     * Create an instance of {@link CustomIcons }
     * 
     */
    public CustomIcons createCustomIcons() {
        return new CustomIcons();
    }

    /**
     * Create an instance of {@link AutoType }
     * 
     */
    public AutoType createAutoType() {
        return new AutoType();
    }

    /**
     * Create an instance of {@link BinaryField }
     * 
     */
    public BinaryField createBinaryField() {
        return new BinaryField();
    }

    /**
     * Create an instance of {@link StringField }
     * 
     */
    public StringField createStringField() {
        return new StringField();
    }

    /**
     * Create an instance of {@link KeePassFile.Meta }
     * 
     */
    public KeePassFile.Meta createKeePassFileMeta() {
        return new KeePassFile.Meta();
    }

    /**
     * Create an instance of {@link KeePassFile.Root }
     * 
     */
    public KeePassFile.Root createKeePassFileRoot() {
        return new KeePassFile.Root();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link Times }
     * 
     */
    public Times createTimes() {
        return new Times();
    }

    /**
     * Create an instance of {@link Entry }
     * 
     */
    public Entry createEntry() {
        return new Entry();
    }

    /**
     * Create an instance of {@link History }
     * 
     */
    public History createHistory() {
        return new History();
    }

    /**
     * Create an instance of {@link CustomData }
     * 
     */
    public CustomData createCustomData() {
        return new CustomData();
    }

    /**
     * Create an instance of {@link Binaries.Binary }
     * 
     */
    public Binaries.Binary createBinariesBinary() {
        return new Binaries.Binary();
    }

    /**
     * Create an instance of {@link CustomIcons.Icon }
     * 
     */
    public CustomIcons.Icon createCustomIconsIcon() {
        return new CustomIcons.Icon();
    }

    /**
     * Create an instance of {@link AutoType.Association }
     * 
     */
    public AutoType.Association createAutoTypeAssociation() {
        return new AutoType.Association();
    }

    /**
     * Create an instance of {@link BinaryField.Value }
     * 
     */
    public BinaryField.Value createBinaryFieldValue() {
        return new BinaryField.Value();
    }

    /**
     * Create an instance of {@link StringField.Value }
     * 
     */
    public StringField.Value createStringFieldValue() {
        return new StringField.Value();
    }

    /**
     * Create an instance of {@link KeePassFile.Meta.MemoryProtection }
     * 
     */
    public KeePassFile.Meta.MemoryProtection createKeePassFileMetaMemoryProtection() {
        return new KeePassFile.Meta.MemoryProtection();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Window", scope = AutoType.Association.class)
    public JAXBElement<String> createAutoTypeAssociationWindow(String value) {
        return new JAXBElement<String>(_AutoTypeAssociationWindow_QNAME, String.class, AutoType.Association.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "KeystrokeSequence", scope = AutoType.Association.class)
    public JAXBElement<String> createAutoTypeAssociationKeystrokeSequence(String value) {
        return new JAXBElement<String>(_AutoTypeAssociationKeystrokeSequence_QNAME, String.class, AutoType.Association.class, value);
    }

}
