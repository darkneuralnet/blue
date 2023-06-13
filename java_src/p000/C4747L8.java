package p000;

import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import p000.V46;
/* renamed from: L8 */
/* loaded from: classes6.dex */
public final class C4747L8 implements InterfaceC27152p8 {

    /* renamed from: e */
    public static final V46.EnumC8541b f20791e = V46.EnumC8541b.f38570b;

    /* renamed from: f */
    public static final ThreadLocal<Cipher> f20792f = new C4748a();

    /* renamed from: g */
    public static final ThreadLocal<Cipher> f20793g = new C4749b();

    /* renamed from: a */
    public final byte[] f20794a;

    /* renamed from: b */
    public final byte[] f20795b;

    /* renamed from: c */
    public final SecretKeySpec f20796c;

    /* renamed from: d */
    public final int f20797d;

    /* renamed from: L8$a */
    /* loaded from: classes6.dex */
    public class C4748a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return C32577Ed1.f7880e.m108639a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: L8$b */
    /* loaded from: classes6.dex */
    public class C4749b extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return C32577Ed1.f7880e.m108639a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C4747L8(byte[] bArr, int i) throws GeneralSecurityException {
        if (f20791e.mo80443a()) {
            if (i != 12 && i != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            this.f20797d = i;
            C31700Aj6.m115338a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            this.f20796c = secretKeySpec;
            Cipher cipher = f20792f.get();
            cipher.init(1, secretKeySpec);
            byte[] m97679c = m97679c(cipher.doFinal(new byte[16]));
            this.f20794a = m97679c;
            this.f20795b = m97679c(m97679c);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    /* renamed from: c */
    public static byte[] m97679c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            int i2 = i + 1;
            bArr2[i] = (byte) (((bArr[i] << 1) ^ ((bArr[i2] & UByte.MAX_VALUE) >>> 7)) & KotlinVersion.MAX_COMPONENT_VALUE);
            i = i2;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    /* renamed from: f */
    public static byte[] m97676f(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // p000.InterfaceC27152p8
    /* renamed from: a */
    public byte[] mo3716a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        int length = bArr.length;
        int i = this.f20797d;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            byte[] bArr4 = new byte[bArr.length + i + 16];
            byte[] m43714c = C39961dn4.m43714c(i);
            System.arraycopy(m43714c, 0, bArr4, 0, this.f20797d);
            Cipher cipher = f20792f.get();
            cipher.init(1, this.f20796c);
            byte[] m97678d = m97678d(cipher, 0, m43714c, 0, m43714c.length);
            if (bArr2 == null) {
                bArr3 = new byte[0];
            } else {
                bArr3 = bArr2;
            }
            byte[] m97678d2 = m97678d(cipher, 1, bArr3, 0, bArr3.length);
            Cipher cipher2 = f20793g.get();
            cipher2.init(1, this.f20796c, new IvParameterSpec(m97678d));
            cipher2.doFinal(bArr, 0, bArr.length, bArr4, this.f20797d);
            byte[] m97678d3 = m97678d(cipher, 2, bArr4, this.f20797d, bArr.length);
            int length2 = bArr.length + this.f20797d;
            for (int i2 = 0; i2 < 16; i2++) {
                bArr4[length2 + i2] = (byte) ((m97678d2[i2] ^ m97678d[i2]) ^ m97678d3[i2]);
            }
            return bArr4;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // p000.InterfaceC27152p8
    /* renamed from: b */
    public byte[] mo3715b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = (bArr.length - this.f20797d) - 16;
        if (length >= 0) {
            Cipher cipher = f20792f.get();
            cipher.init(1, this.f20796c);
            byte[] m97678d = m97678d(cipher, 0, bArr, 0, this.f20797d);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] m97678d2 = m97678d(cipher, 1, bArr3, 0, bArr3.length);
            byte[] m97678d3 = m97678d(cipher, 2, bArr, this.f20797d, length);
            int length2 = bArr.length - 16;
            byte b = 0;
            for (int i = 0; i < 16; i++) {
                b = (byte) (b | (((bArr[length2 + i] ^ m97678d2[i]) ^ m97678d[i]) ^ m97678d3[i]));
            }
            if (b == 0) {
                Cipher cipher2 = f20793g.get();
                cipher2.init(1, this.f20796c, new IvParameterSpec(m97678d));
                return cipher2.doFinal(bArr, this.f20797d, length);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: d */
    public final byte[] m97678d(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m97676f(bArr2, this.f20794a));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                doFinal[i5] = (byte) (doFinal[i5] ^ bArr[(i2 + i4) + i5]);
            }
            doFinal = cipher.doFinal(doFinal);
            i4 += 16;
        }
        return cipher.doFinal(m97676f(doFinal, m97677e(Arrays.copyOfRange(bArr, i4 + i2, i2 + i3))));
    }

    /* renamed from: e */
    public final byte[] m97677e(byte[] bArr) {
        if (bArr.length == 16) {
            return m97676f(bArr, this.f20794a);
        }
        byte[] copyOf = Arrays.copyOf(this.f20795b, 16);
        for (int i = 0; i < bArr.length; i++) {
            copyOf[i] = (byte) (copyOf[i] ^ bArr[i]);
        }
        copyOf[bArr.length] = (byte) (copyOf[bArr.length] ^ ByteCompanionObject.MIN_VALUE);
        return copyOf;
    }
}
