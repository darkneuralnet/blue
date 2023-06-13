package p000;

import ch.qos.logback.core.CoreConstants;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: N */
/* loaded from: classes8.dex */
public class C5448N extends AbstractC7305S {

    /* renamed from: d */
    public static final ConcurrentMap<C5449a, C5448N> f23925d = new ConcurrentHashMap();

    /* renamed from: b */
    public final String f23926b;

    /* renamed from: c */
    public byte[] f23927c;

    /* renamed from: N$a */
    /* loaded from: classes8.dex */
    public static class C5449a {

        /* renamed from: a */
        public final int f23928a;

        /* renamed from: b */
        public final byte[] f23929b;

        public C5449a(byte[] bArr) {
            this.f23928a = C0210Ao.m115244k(bArr);
            this.f23929b = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C5449a) {
                return C0210Ao.m115254a(this.f23929b, ((C5449a) obj).f23929b);
            }
            return false;
        }

        public int hashCode() {
            return this.f23928a;
        }
    }

    public C5448N(C5448N c5448n, String str) {
        if (!m94512H(str, 0)) {
            throw new IllegalArgumentException("string " + str + " not a valid OID branch");
        }
        this.f23926b = c5448n.m94515E() + InstructionFileId.DOT + str;
    }

    /* renamed from: C */
    public static C5448N m94517C(byte[] bArr) {
        C5448N c5448n = f23925d.get(new C5449a(bArr));
        return c5448n == null ? new C5448N(bArr) : c5448n;
    }

    /* renamed from: F */
    public static C5448N m94514F(Object obj) {
        if (obj == null || (obj instanceof C5448N)) {
            return (C5448N) obj;
        }
        if (obj instanceof InterfaceC1693E) {
            AbstractC7305S mo13850c = ((InterfaceC1693E) obj).mo13850c();
            if (mo13850c instanceof C5448N) {
                return (C5448N) mo13850c;
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (C5448N) AbstractC7305S.m86134v((byte[]) obj);
        } catch (IOException e) {
            throw new IllegalArgumentException("failed to construct object identifier from byte[]: " + e.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r7.charAt(r0 + 1) != '0') goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r2 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r2 <= 1) goto L25;
     */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m94512H(String str, int i) {
        int length = str.length();
        loop0: while (true) {
            int i2 = 0;
            while (true) {
                length--;
                if (length < i) {
                    return i2 != 0 && (i2 <= 1 || str.charAt(length + 1) != '0');
                }
                char charAt = str.charAt(length);
                if (charAt == '.') {
                    break;
                } else if ('0' > charAt || charAt > '9') {
                    break loop0;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    /* renamed from: I */
    public static boolean m94511I(String str) {
        char charAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2') {
            return false;
        }
        return m94512H(str, 2);
    }

    /* renamed from: A */
    public final void m94518A(ByteArrayOutputStream byteArrayOutputStream) {
        C31643Ad3 c31643Ad3 = new C31643Ad3(this.f23926b);
        int parseInt = Integer.parseInt(c31643Ad3.m115427b()) * 40;
        String m115427b = c31643Ad3.m115427b();
        if (m115427b.length() <= 18) {
            m94509K(byteArrayOutputStream, parseInt + Long.parseLong(m115427b));
        } else {
            m94508L(byteArrayOutputStream, new BigInteger(m115427b).add(BigInteger.valueOf(parseInt)));
        }
        while (c31643Ad3.m115428a()) {
            String m115427b2 = c31643Ad3.m115427b();
            if (m115427b2.length() <= 18) {
                m94509K(byteArrayOutputStream, Long.parseLong(m115427b2));
            } else {
                m94508L(byteArrayOutputStream, new BigInteger(m115427b2));
            }
        }
    }

    /* renamed from: D */
    public final synchronized byte[] m94516D() {
        if (this.f23927c == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            m94518A(byteArrayOutputStream);
            this.f23927c = byteArrayOutputStream.toByteArray();
        }
        return this.f23927c;
    }

    /* renamed from: E */
    public String m94515E() {
        return this.f23926b;
    }

    /* renamed from: G */
    public C5448N m94513G() {
        C5449a c5449a = new C5449a(m94516D());
        ConcurrentMap<C5449a, C5448N> concurrentMap = f23925d;
        C5448N c5448n = concurrentMap.get(c5449a);
        if (c5448n == null) {
            C5448N putIfAbsent = concurrentMap.putIfAbsent(c5449a, this);
            return putIfAbsent == null ? this : putIfAbsent;
        }
        return c5448n;
    }

    /* renamed from: J */
    public boolean m94510J(C5448N c5448n) {
        String m94515E = m94515E();
        String m94515E2 = c5448n.m94515E();
        return m94515E.length() > m94515E2.length() && m94515E.charAt(m94515E2.length()) == '.' && m94515E.startsWith(m94515E2);
    }

    /* renamed from: K */
    public final void m94509K(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    /* renamed from: L */
    public final void m94508L(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & ByteCompanionObject.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        return this.f23926b.hashCode();
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        if (abstractC7305S == this) {
            return true;
        }
        if (abstractC7305S instanceof C5448N) {
            return this.f23926b.equals(((C5448N) abstractC7305S).f23926b);
        }
        return false;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89159n(z, 6, m94516D());
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() throws IOException {
        int length = m94516D().length;
        return ER5.m109017a(length) + 1 + length;
    }

    public String toString() {
        return m94515E();
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return false;
    }

    /* renamed from: z */
    public C5448N m94507z(String str) {
        return new C5448N(this, str);
    }

    public C5448N(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (m94511I(str)) {
            this.f23926b = str;
            return;
        }
        throw new IllegalArgumentException("string " + str + " not an OID");
    }

    public C5448N(byte[] bArr) {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        BigInteger bigInteger = null;
        int i2 = 0;
        long j = 0;
        while (i2 != bArr.length) {
            int i3 = bArr[i2] & UByte.MAX_VALUE;
            if (j <= 72057594037927808L) {
                i = i2;
                long j2 = j + (i3 & 127);
                if ((i3 & 128) == 0) {
                    if (z) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z = false;
                    }
                    stringBuffer.append(CoreConstants.DOT);
                    stringBuffer.append(j2);
                    j = 0;
                    i2 = i + 1;
                } else {
                    j = j2 << 7;
                    i2 = i + 1;
                }
            } else {
                i = i2;
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf(i3 & 127));
                if ((i3 & 128) == 0) {
                    if (z) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80L));
                        z = false;
                    }
                    stringBuffer.append(CoreConstants.DOT);
                    stringBuffer.append(or);
                    bigInteger = null;
                    j = 0;
                    i2 = i + 1;
                } else {
                    bigInteger = or.shiftLeft(7);
                    i2 = i + 1;
                }
            }
        }
        this.f23926b = stringBuffer.toString();
        this.f23927c = C0210Ao.m115251d(bArr);
    }
}
