package p000;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
/* renamed from: Vc */
/* loaded from: classes6.dex */
public final class C8706Vc implements InterfaceC27152p8 {

    /* renamed from: b */
    public static final String f39333b = "Vc";

    /* renamed from: a */
    public final SecretKey f39334a;

    public C8706Vc(String str, KeyStore keyStore) throws GeneralSecurityException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f39334a = secretKey;
        if (secretKey != null) {
            return;
        }
        throw new InvalidKeyException("Keystore cannot load the key with ID: " + str);
    }

    /* renamed from: e */
    public static void m79664e() {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }

    @Override // p000.InterfaceC27152p8
    /* renamed from: a */
    public byte[] mo3716a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            return m79665d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(f39333b, "encountered a potentially transient KeyStore error, will wait and retry", e);
            m79664e();
            return m79665d(bArr, bArr2);
        }
    }

    @Override // p000.InterfaceC27152p8
    /* renamed from: b */
    public byte[] mo3715b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            return m79666c(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(f39333b, "encountered a potentially transient KeyStore error, will wait and retry", e);
            m79664e();
            return m79666c(bArr, bArr2);
        }
    }

    /* renamed from: c */
    public final byte[] m79666c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 28) {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, this.f39334a, gCMParameterSpec);
            cipher.updateAAD(bArr2);
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: d */
    public final byte[] m79665d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 12 + 16];
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, this.f39334a);
            cipher.updateAAD(bArr2);
            cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
            System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
