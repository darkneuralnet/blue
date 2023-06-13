package com.amazonaws.services.p026s3.internal.crypto;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.kms.AWSKMSClient;
import com.amazonaws.services.p026s3.internal.S3Direct;
import com.amazonaws.services.p026s3.model.CryptoConfiguration;
import com.amazonaws.services.p026s3.model.CryptoMode;
import com.amazonaws.services.p026s3.model.EncryptionMaterialsProvider;
@Deprecated
/* renamed from: com.amazonaws.services.s3.internal.crypto.S3CryptoModuleAEStrict */
/* loaded from: classes3.dex */
class S3CryptoModuleAEStrict extends S3CryptoModuleAE {
    public S3CryptoModuleAEStrict(AWSKMSClient aWSKMSClient, S3Direct s3Direct, AWSCredentialsProvider aWSCredentialsProvider, EncryptionMaterialsProvider encryptionMaterialsProvider, CryptoConfiguration cryptoConfiguration) {
        super(aWSKMSClient, s3Direct, aWSCredentialsProvider, encryptionMaterialsProvider, cryptoConfiguration);
        if (cryptoConfiguration.getCryptoMode() == CryptoMode.StrictAuthenticatedEncryption) {
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.amazonaws.services.p026s3.internal.crypto.S3CryptoModuleAE
    public final boolean isStrict() {
        return true;
    }

    @Override // com.amazonaws.services.p026s3.internal.crypto.S3CryptoModuleBase
    public void securityCheck(ContentCryptoMaterial contentCryptoMaterial, S3ObjectWrapper s3ObjectWrapper) {
        if (ContentCryptoScheme.AES_GCM.equals(contentCryptoMaterial.getContentCryptoScheme())) {
            return;
        }
        throw new SecurityException("S3 object [bucket: " + s3ObjectWrapper.getBucketName() + ", key: " + s3ObjectWrapper.getKey() + "] not encrypted using authenticated encryption");
    }
}
