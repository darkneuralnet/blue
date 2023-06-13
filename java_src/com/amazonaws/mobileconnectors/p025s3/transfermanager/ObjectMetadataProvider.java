package com.amazonaws.mobileconnectors.p025s3.transfermanager;

import com.amazonaws.services.p026s3.model.ObjectMetadata;
import java.io.File;
@Deprecated
/* renamed from: com.amazonaws.mobileconnectors.s3.transfermanager.ObjectMetadataProvider */
/* loaded from: classes2.dex */
public interface ObjectMetadataProvider {
    void provideObjectMetadata(File file, ObjectMetadata objectMetadata);
}
