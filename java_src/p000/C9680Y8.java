package p000;

import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.ByteCompanionObject;
import p000.V46;
/* renamed from: Y8 */
/* loaded from: classes6.dex */
public final class C9680Y8 implements InterfaceC40107e21 {

    /* renamed from: c */
    public static final V46.EnumC8541b f44659c = V46.EnumC8541b.f38570b;

    /* renamed from: d */
    public static final Collection<Integer> f44660d = Arrays.asList(64);

    /* renamed from: e */
    public static final byte[] f44661e = new byte[16];

    /* renamed from: f */
    public static final byte[] f44662f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a */
    public final C46040o24 f44663a;

    /* renamed from: b */
    public final byte[] f44664b;

    public C9680Y8(byte[] bArr) throws GeneralSecurityException {
        if (f44659c.mo80443a()) {
            if (f44660d.contains(Integer.valueOf(bArr.length))) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
                this.f44664b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
                this.f44663a = new C46040o24(copyOfRange);
                return;
            }
            throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    @Override // p000.InterfaceC40107e21
    /* renamed from: a */
    public byte[] mo40276a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 16) {
            Cipher m108639a = C32577Ed1.f7880e.m108639a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & ByteCompanionObject.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & ByteCompanionObject.MAX_VALUE);
            m108639a.init(2, new SecretKeySpec(this.f44664b, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = m108639a.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && C50441vT5.m8617b()) {
                doFinal = new byte[0];
            }
            if (T70.m84296b(copyOfRange, m75557c(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }

    @Override // p000.InterfaceC40107e21
    /* renamed from: b */
    public byte[] mo40275b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483631) {
            Cipher m108639a = C32577Ed1.f7880e.m108639a("AES/CTR/NoPadding");
            byte[] m75557c = m75557c(bArr2, bArr);
            byte[] bArr3 = (byte[]) m75557c.clone();
            bArr3[8] = (byte) (bArr3[8] & ByteCompanionObject.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & ByteCompanionObject.MAX_VALUE);
            m108639a.init(1, new SecretKeySpec(this.f44664b, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(bArr3));
            return T70.m84297a(m75557c, m108639a.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: c */
    public final byte[] m75557c(byte[]... bArr) throws GeneralSecurityException {
        byte[] m84293e;
        if (bArr.length == 0) {
            return this.f44663a.mo20026a(f44662f, 16);
        }
        byte[] mo20026a = this.f44663a.mo20026a(f44661e, 16);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            mo20026a = T70.m84293e(C13411c9.m61907b(mo20026a), this.f44663a.mo20026a(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            m84293e = T70.m84292f(bArr3, mo20026a);
        } else {
            m84293e = T70.m84293e(C13411c9.m61908a(bArr3), C13411c9.m61907b(mo20026a));
        }
        return this.f44663a.mo20026a(m84293e, 16);
    }
}
