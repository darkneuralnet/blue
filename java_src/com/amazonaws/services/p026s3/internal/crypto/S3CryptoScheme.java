package com.amazonaws.services.p026s3.internal.crypto;

import com.amazonaws.services.p026s3.model.CryptoMode;
import java.security.SecureRandom;
@Deprecated
/* renamed from: com.amazonaws.services.s3.internal.crypto.S3CryptoScheme */
/* loaded from: classes3.dex */
final class S3CryptoScheme {
    static final String AES = "AES";
    static final String RSA = "RSA";
    private static final SecureRandom SRAND = new SecureRandom();
    private final ContentCryptoScheme contentCryptoScheme;
    private final S3KeyWrapScheme kwScheme;

    /* renamed from: com.amazonaws.services.s3.internal.crypto.S3CryptoScheme$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C169161 {
        static final /* synthetic */ int[] $SwitchMap$com$amazonaws$services$s3$model$CryptoMode;

        static {
            int[] iArr = new int[CryptoMode.values().length];
            $SwitchMap$com$amazonaws$services$s3$model$CryptoMode = iArr;
            try {
                iArr[CryptoMode.EncryptionOnly.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazonaws$services$s3$model$CryptoMode[CryptoMode.AuthenticatedEncryption.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazonaws$services$s3$model$CryptoMode[CryptoMode.StrictAuthenticatedEncryption.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public S3CryptoScheme(ContentCryptoScheme contentCryptoScheme) {
        this.contentCryptoScheme = contentCryptoScheme;
        this.kwScheme = new S3KeyWrapScheme();
    }

    public static S3CryptoScheme from(CryptoMode cryptoMode) {
        int i = C169161.$SwitchMap$com$amazonaws$services$s3$model$CryptoMode[cryptoMode.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new IllegalStateException();
            }
            return new S3CryptoScheme(ContentCryptoScheme.AES_GCM, new S3KeyWrapScheme());
        }
        return new S3CryptoScheme(ContentCryptoScheme.AES_CBC, S3KeyWrapScheme.NONE);
    }

    public static boolean isAesGcm(String str) {
        return ContentCryptoScheme.AES_GCM.getCipherAlgorithm().equals(str);
    }

    public ContentCryptoScheme getContentCryptoScheme() {
        return this.contentCryptoScheme;
    }

    public S3KeyWrapScheme getKeyWrapScheme() {
        return this.kwScheme;
    }

    public SecureRandom getSecureRandom() {
        return SRAND;
    }

    private S3CryptoScheme(ContentCryptoScheme contentCryptoScheme, S3KeyWrapScheme s3KeyWrapScheme) {
        this.contentCryptoScheme = contentCryptoScheme;
        this.kwScheme = s3KeyWrapScheme;
    }
}
