package com.amazonaws.services.p026s3.internal.crypto;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.kms.AWSKMSClient;
import com.amazonaws.services.p026s3.internal.S3Direct;
import com.amazonaws.services.p026s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.p026s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.p026s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.p026s3.model.CopyPartRequest;
import com.amazonaws.services.p026s3.model.CopyPartResult;
import com.amazonaws.services.p026s3.model.CryptoConfiguration;
import com.amazonaws.services.p026s3.model.CryptoMode;
import com.amazonaws.services.p026s3.model.EncryptionMaterialsProvider;
import com.amazonaws.services.p026s3.model.GetObjectRequest;
import com.amazonaws.services.p026s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.p026s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.p026s3.model.ObjectMetadata;
import com.amazonaws.services.p026s3.model.PutInstructionFileRequest;
import com.amazonaws.services.p026s3.model.PutObjectRequest;
import com.amazonaws.services.p026s3.model.PutObjectResult;
import com.amazonaws.services.p026s3.model.S3Object;
import com.amazonaws.services.p026s3.model.UploadObjectRequest;
import com.amazonaws.services.p026s3.model.UploadPartRequest;
import com.amazonaws.services.p026s3.model.UploadPartResult;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
@Deprecated
/* renamed from: com.amazonaws.services.s3.internal.crypto.CryptoModuleDispatcher */
/* loaded from: classes3.dex */
public class CryptoModuleDispatcher extends S3CryptoModule<MultipartUploadContext> {

    /* renamed from: ae */
    private final S3CryptoModuleAE f68585ae;
    private final CryptoMode defaultCryptoMode;

    /* renamed from: eo */
    private final S3CryptoModuleEO f68586eo;

    /* renamed from: com.amazonaws.services.s3.internal.crypto.CryptoModuleDispatcher$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C169151 {
        static final /* synthetic */ int[] $SwitchMap$com$amazonaws$services$s3$model$CryptoMode;

        static {
            int[] iArr = new int[CryptoMode.values().length];
            $SwitchMap$com$amazonaws$services$s3$model$CryptoMode = iArr;
            try {
                iArr[CryptoMode.StrictAuthenticatedEncryption.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazonaws$services$s3$model$CryptoMode[CryptoMode.AuthenticatedEncryption.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazonaws$services$s3$model$CryptoMode[CryptoMode.EncryptionOnly.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public CryptoModuleDispatcher(AWSKMSClient aWSKMSClient, S3Direct s3Direct, AWSCredentialsProvider aWSCredentialsProvider, EncryptionMaterialsProvider encryptionMaterialsProvider, CryptoConfiguration cryptoConfiguration) {
        CryptoConfiguration mo116301clone = cryptoConfiguration.mo116301clone();
        if (mo116301clone.getCryptoMode() == null) {
            mo116301clone.setCryptoMode(CryptoMode.EncryptionOnly);
        }
        CryptoConfiguration readOnly = mo116301clone.readOnly();
        CryptoMode cryptoMode = readOnly.getCryptoMode();
        this.defaultCryptoMode = cryptoMode;
        int i = C169151.$SwitchMap$com$amazonaws$services$s3$model$CryptoMode[cryptoMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.f68586eo = new S3CryptoModuleEO(aWSKMSClient, s3Direct, aWSCredentialsProvider, encryptionMaterialsProvider, readOnly);
                    CryptoConfiguration mo116301clone2 = readOnly.mo116301clone();
                    try {
                        mo116301clone2.setCryptoMode(CryptoMode.AuthenticatedEncryption);
                    } catch (UnsupportedOperationException unused) {
                    }
                    this.f68585ae = new S3CryptoModuleAE(aWSKMSClient, s3Direct, aWSCredentialsProvider, encryptionMaterialsProvider, mo116301clone2.readOnly());
                    return;
                }
                throw new IllegalStateException();
            }
            this.f68585ae = new S3CryptoModuleAE(aWSKMSClient, s3Direct, aWSCredentialsProvider, encryptionMaterialsProvider, readOnly);
            this.f68586eo = null;
            return;
        }
        this.f68585ae = new S3CryptoModuleAEStrict(aWSKMSClient, s3Direct, aWSCredentialsProvider, encryptionMaterialsProvider, readOnly);
        this.f68586eo = null;
    }

    @Override // com.amazonaws.services.p026s3.internal.crypto.S3CryptoModule
    public void abortMultipartUploadSecurely(AbortMultipartUploadRequest abortMultipartUploadRequest) {
        if (this.defaultCryptoMode == CryptoMode.EncryptionOnly) {
            this.f68586eo.abortMultipartUploadSecurely(abortMultipartUploadRequest);
        } else {
            this.f68585ae.abortMultipartUploadSecurely(abortMultipartUploadRequest);
        }
    }

    @Override // com.amazonaws.services.p026s3.internal.crypto.S3CryptoModule
    public CompleteMultipartUploadResult completeMultipartUploadSecurely(CompleteMultipartUploadRequest completeMultipartUploadRequest) {
        if (this.defaultCryptoMode == CryptoMode.EncryptionOnly) {
            return this.f68586eo.completeMultipartUploadSecurely(completeMultipartUploadRequest);
        }
        return this.f68585ae.completeMultipartUploadSecurely(completeMultipartUploadRequest);
    }

    @Override // com.amazonaws.services.p026s3.internal.crypto.S3CryptoModule
    public CopyPartResult copyPartSecurely(CopyPartRequest copyPartRequest) {
        if (this.defaultCryptoMode == CryptoMode.EncryptionOnly) {
            return this.f68586eo.copyPartSecurely(copyPartRequest);
        }
        return this.f68585ae.copyPartSecurely(copyPartRequest);
    }

    @Override // com.amazonaws.services.p026s3.internal.crypto.S3CryptoModule
    public S3Object getObjectSecurely(GetObjectRequest getObjectRequest) {
        return this.f68585ae.getObjectSecurely(getObjectRequest);
    }

    @Override // com.amazonaws.services.p026s3.internal.crypto.S3CryptoModule
    public InitiateMultipartUploadResult initiateMultipartUploadSecurely(InitiateMultipartUploadRequest initiateMultipartUploadRequest) {
        if (this.defaultCryptoMode == CryptoMode.EncryptionOnly) {
            return this.f68586eo.initiateMultipartUploadSecurely(initiateMultipartUploadRequest);
        }
        return this.f68585ae.initiateMultipartUploadSecurely(initiateMultipartUploadRequest);
    }

    @Override // com.amazonaws.services.p026s3.internal.crypto.S3CryptoModule
    public PutObjectResult putInstructionFileSecurely(PutInstructionFileRequest putInstructionFileRequest) {
        if (this.defaultCryptoMode == CryptoMode.EncryptionOnly) {
            return this.f68586eo.putInstructionFileSecurely(putInstructionFileRequest);
        }
        return this.f68585ae.putInstructionFileSecurely(putInstructionFileRequest);
    }

    @Override // com.amazonaws.services.p026s3.internal.crypto.S3CryptoModule
    public void putLocalObjectSecurely(UploadObjectRequest uploadObjectRequest, String str, OutputStream outputStream) throws IOException {
        if (this.defaultCryptoMode == CryptoMode.EncryptionOnly) {
            this.f68586eo.putLocalObjectSecurely(uploadObjectRequest, str, outputStream);
        } else {
            this.f68585ae.putLocalObjectSecurely(uploadObjectRequest, str, outputStream);
        }
    }

    @Override // com.amazonaws.services.p026s3.internal.crypto.S3CryptoModule
    public PutObjectResult putObjectSecurely(PutObjectRequest putObjectRequest) {
        if (this.defaultCryptoMode == CryptoMode.EncryptionOnly) {
            return this.f68586eo.putObjectSecurely(putObjectRequest);
        }
        return this.f68585ae.putObjectSecurely(putObjectRequest);
    }

    @Override // com.amazonaws.services.p026s3.internal.crypto.S3CryptoModule
    public UploadPartResult uploadPartSecurely(UploadPartRequest uploadPartRequest) {
        if (this.defaultCryptoMode == CryptoMode.EncryptionOnly) {
            return this.f68586eo.uploadPartSecurely(uploadPartRequest);
        }
        return this.f68585ae.uploadPartSecurely(uploadPartRequest);
    }

    @Override // com.amazonaws.services.p026s3.internal.crypto.S3CryptoModule
    public ObjectMetadata getObjectSecurely(GetObjectRequest getObjectRequest, File file) {
        return this.f68585ae.getObjectSecurely(getObjectRequest, file);
    }
}
