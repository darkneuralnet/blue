package com.amazonaws.services.p026s3.model;

import java.io.Serializable;
@Deprecated
/* renamed from: com.amazonaws.services.s3.model.KMSEncryptionMaterialsProvider */
/* loaded from: classes3.dex */
public class KMSEncryptionMaterialsProvider extends StaticEncryptionMaterialsProvider implements Serializable {
    public KMSEncryptionMaterialsProvider(String str) {
        this(new KMSEncryptionMaterials(str));
    }

    public KMSEncryptionMaterialsProvider(KMSEncryptionMaterials kMSEncryptionMaterials) {
        super(kMSEncryptionMaterials);
    }
}
