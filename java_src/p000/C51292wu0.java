package p000;

import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import com.nimbusds.jose.JOSEException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: wu0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C51292wu0 implements InterfaceC31669Ag2<C31903Bg2> {

    /* renamed from: a */
    public final String f116793a;

    /* renamed from: b */
    public final C31903Bg2 f116794b = new C31903Bg2();

    public C51292wu0(String str) {
        if (str != null) {
            this.f116793a = str;
            return;
        }
        throw new IllegalArgumentException("The JCA hash algorithm must not be null");
    }

    /* renamed from: c */
    public static byte[] m6138c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return N70.m94357d(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    /* renamed from: d */
    public static int m6137d(int i, int i2) {
        return ((i2 + i) - 1) / i;
    }

    /* renamed from: g */
    public static byte[] m6134g(C3824Iy c3824Iy) {
        byte[] bArr;
        if (c3824Iy != null) {
            bArr = c3824Iy.m104549a();
        } else {
            bArr = null;
        }
        return m6133h(bArr);
    }

    /* renamed from: h */
    public static byte[] m6133h(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        return N70.m94357d(P52.m90872a(bArr.length), bArr);
    }

    /* renamed from: i */
    public static byte[] m6132i(int i) {
        return P52.m90872a(i);
    }

    /* renamed from: j */
    public static byte[] m6131j() {
        return new byte[0];
    }

    /* renamed from: k */
    public static byte[] m6130k(String str) {
        byte[] bArr;
        if (str != null) {
            bArr = str.getBytes(C48618sO5.f108725a);
        } else {
            bArr = null;
        }
        return m6133h(bArr);
    }

    /* renamed from: e */
    public SecretKey m6136e(SecretKey secretKey, int i, byte[] bArr) throws JOSEException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        MessageDigest m6129l = m6129l();
        for (int i2 = 1; i2 <= m6137d(N70.m94356e(m6129l.getDigestLength()), i); i2++) {
            m6129l.update(P52.m90872a(i2));
            m6129l.update(secretKey.getEncoded());
            if (bArr != null) {
                m6129l.update(bArr);
            }
            try {
                byteArrayOutputStream.write(m6129l.digest());
            } catch (IOException e) {
                throw new JOSEException("Couldn't write derived key: " + e.getMessage(), e);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int m94358c = N70.m94358c(i);
        if (byteArray.length == m94358c) {
            return new SecretKeySpec(byteArray, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        }
        return new SecretKeySpec(N70.m94354g(byteArray, 0, m94358c), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
    }

    /* renamed from: f */
    public SecretKey m6135f(SecretKey secretKey, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) throws JOSEException {
        return m6136e(secretKey, i, m6138c(bArr, bArr2, bArr3, bArr4, bArr5));
    }

    @Override // p000.InterfaceC31669Ag2
    public C31903Bg2 getJCAContext() {
        return this.f116794b;
    }

    /* renamed from: l */
    public final MessageDigest m6129l() throws JOSEException {
        Provider m113690a = getJCAContext().m113690a();
        try {
            if (m113690a == null) {
                return MessageDigest.getInstance(this.f116793a);
            }
            return MessageDigest.getInstance(this.f116793a, m113690a);
        } catch (NoSuchAlgorithmException e) {
            throw new JOSEException("Couldn't get message digest for KDF: " + e.getMessage(), e);
        }
    }
}
