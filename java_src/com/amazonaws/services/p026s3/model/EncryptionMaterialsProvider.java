package com.amazonaws.services.p026s3.model;
@Deprecated
/* renamed from: com.amazonaws.services.s3.model.EncryptionMaterialsProvider */
/* loaded from: classes3.dex */
public interface EncryptionMaterialsProvider extends EncryptionMaterialsAccessor {
    EncryptionMaterials getEncryptionMaterials();

    void refresh();
}
