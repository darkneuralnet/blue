package com.amazonaws.mobileconnectors.p025s3.transfermanager;

import com.amazonaws.mobileconnectors.p025s3.transfermanager.exception.PauseException;
import com.amazonaws.services.p026s3.model.ObjectMetadata;
import java.io.IOException;
@Deprecated
/* renamed from: com.amazonaws.mobileconnectors.s3.transfermanager.Download */
/* loaded from: classes2.dex */
public interface Download extends Transfer {
    void abort() throws IOException;

    String getBucketName();

    String getKey();

    ObjectMetadata getObjectMetadata();

    PersistableDownload pause() throws PauseException;
}
