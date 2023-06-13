package com.amazonaws.services.p026s3.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.p026s3.internal.XmlWriter;
import com.amazonaws.services.p026s3.model.DeleteObjectsRequest;
/* renamed from: com.amazonaws.services.s3.model.transform.MultiObjectDeleteXmlFactory */
/* loaded from: classes3.dex */
public class MultiObjectDeleteXmlFactory {
    private void writeKeyVersion(XmlWriter xmlWriter, DeleteObjectsRequest.KeyVersion keyVersion) {
        xmlWriter.start("Object");
        xmlWriter.start("Key").value(keyVersion.getKey()).end();
        if (keyVersion.getVersion() != null) {
            xmlWriter.start("VersionId").value(keyVersion.getVersion()).end();
        }
        xmlWriter.end();
    }

    public byte[] convertToXmlByteArray(DeleteObjectsRequest deleteObjectsRequest) throws AmazonClientException {
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.start("Delete");
        if (deleteObjectsRequest.getQuiet()) {
            xmlWriter.start("Quiet").value("true").end();
        }
        for (DeleteObjectsRequest.KeyVersion keyVersion : deleteObjectsRequest.getKeys()) {
            writeKeyVersion(xmlWriter, keyVersion);
        }
        xmlWriter.end();
        return xmlWriter.getBytes();
    }
}
