package com.amazonaws.services.p026s3.internal.crypto;
@Deprecated
/* renamed from: com.amazonaws.services.s3.internal.crypto.MultipartUploadCbcContext */
/* loaded from: classes3.dex */
final class MultipartUploadCbcContext extends MultipartUploadCryptoContext {
    private byte[] nextIV;

    public MultipartUploadCbcContext(String str, String str2, ContentCryptoMaterial contentCryptoMaterial) {
        super(str, str2, contentCryptoMaterial);
    }

    public byte[] getNextInitializationVector() {
        return this.nextIV;
    }

    public void setNextInitializationVector(byte[] bArr) {
        this.nextIV = bArr;
    }
}
