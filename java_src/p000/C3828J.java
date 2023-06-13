package p000;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
import org.bouncycastle.asn1.ASN1Exception;
/* renamed from: J */
/* loaded from: classes8.dex */
public class C3828J extends FilterInputStream {

    /* renamed from: b */
    public final int f16553b;

    /* renamed from: c */
    public final boolean f16554c;

    /* renamed from: d */
    public final byte[][] f16555d;

    public C3828J(InputStream inputStream) {
        this(inputStream, ER5.m109015c(inputStream));
    }

    /* renamed from: b */
    public static AbstractC7305S m101411b(int i, C44562lZ0 c44562lZ0, byte[][] bArr) throws IOException {
        if (i != 10) {
            if (i != 12) {
                if (i != 30) {
                    switch (i) {
                        case 1:
                            return C1267D.m111175z(m101409d(c44562lZ0, bArr));
                        case 2:
                            return new C4295K(c44562lZ0.m27154f(), false);
                        case 3:
                            return AbstractC0808C.m113146z(c44562lZ0.m27156c(), c44562lZ0);
                        case 4:
                            return new VF0(c44562lZ0.m27154f());
                        case 5:
                            return TF0.f35039b;
                        case 6:
                            return C5448N.m94517C(m101409d(c44562lZ0, bArr));
                        default:
                            switch (i) {
                                case 18:
                                    return new UF0(c44562lZ0.m27154f());
                                case 19:
                                    return new YF0(c44562lZ0.m27154f());
                                case 20:
                                    return new C38444bG0(c44562lZ0.m27154f());
                                case 21:
                                    return new C40833fG0(c44562lZ0.m27154f());
                                case 22:
                                    return new SF0(c44562lZ0.m27154f());
                                case 23:
                                    return new C10484a0(c44562lZ0.m27154f());
                                case 24:
                                    return new C3309I(c44562lZ0.m27154f());
                                case 25:
                                    return new RF0(c44562lZ0.m27154f());
                                case 26:
                                    return new C41426gG0(c44562lZ0.m27154f());
                                case 27:
                                    return new PF0(c44562lZ0.m27154f());
                                case 28:
                                    return new C40240eG0(c44562lZ0.m27154f());
                                default:
                                    throw new IOException("unknown tag " + i + " encountered");
                            }
                    }
                }
                return new LF0(m101410c(c44562lZ0));
            }
            return new C39648dG0(c44562lZ0.m27154f());
        }
        return C2595G.m106015z(m101409d(c44562lZ0, bArr));
    }

    /* renamed from: c */
    public static char[] m101410c(C44562lZ0 c44562lZ0) throws IOException {
        int i;
        int m27156c = c44562lZ0.m27156c();
        if ((m27156c & 1) == 0) {
            int i2 = m27156c / 2;
            char[] cArr = new char[i2];
            byte[] bArr = new byte[8];
            int i3 = 0;
            int i4 = 0;
            while (m27156c >= 8) {
                if (LR5.m96937d(c44562lZ0, bArr, 0, 8) != 8) {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
                cArr[i4] = (char) ((bArr[0] << 8) | (bArr[1] & UByte.MAX_VALUE));
                cArr[i4 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & UByte.MAX_VALUE));
                cArr[i4 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & UByte.MAX_VALUE));
                cArr[i4 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & UByte.MAX_VALUE));
                i4 += 4;
                m27156c -= 8;
            }
            if (m27156c > 0) {
                if (LR5.m96937d(c44562lZ0, bArr, 0, m27156c) != m27156c) {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
                while (true) {
                    int i5 = i3 + 1;
                    int i6 = i5 + 1;
                    i = i4 + 1;
                    cArr[i4] = (char) ((bArr[i3] << 8) | (bArr[i5] & UByte.MAX_VALUE));
                    if (i6 >= m27156c) {
                        break;
                    }
                    i3 = i6;
                    i4 = i;
                }
                i4 = i;
            }
            if (c44562lZ0.m27156c() == 0 && i2 == i4) {
                return cArr;
            }
            throw new IllegalStateException();
        }
        throw new IOException("malformed BMPString encoding encountered");
    }

    /* renamed from: d */
    public static byte[] m101409d(C44562lZ0 c44562lZ0, byte[][] bArr) throws IOException {
        int m27156c = c44562lZ0.m27156c();
        if (m27156c >= bArr.length) {
            return c44562lZ0.m27154f();
        }
        byte[] bArr2 = bArr[m27156c];
        if (bArr2 == null) {
            bArr2 = new byte[m27156c];
            bArr[m27156c] = bArr2;
        }
        c44562lZ0.m27155d(bArr2);
        return bArr2;
    }

    /* renamed from: i */
    public static int m101406i(InputStream inputStream, int i, boolean z) throws IOException {
        int read = inputStream.read();
        if (read >= 0) {
            if (read == 128) {
                return -1;
            }
            if (read > 127) {
                int i2 = read & 127;
                if (i2 > 4) {
                    throw new IOException("DER length more than 4 bytes: " + i2);
                }
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    int read2 = inputStream.read();
                    if (read2 < 0) {
                        throw new EOFException("EOF found reading length");
                    }
                    i3 = (i3 << 8) + read2;
                }
                if (i3 >= 0) {
                    if (i3 < i || z) {
                        return i3;
                    }
                    throw new IOException("corrupted stream - out of bounds length found: " + i3 + " >= " + i);
                }
                throw new IOException("corrupted stream - negative length found");
            }
            return read;
        }
        throw new EOFException("EOF found when length expected");
    }

    /* renamed from: l */
    public static int m101404l(InputStream inputStream, int i) throws IOException {
        int i2 = i & 31;
        if (i2 == 31) {
            int read = inputStream.read();
            if ((read & 127) != 0) {
                int i3 = 0;
                while (read >= 0 && (read & 128) != 0) {
                    i3 = ((read & 127) | i3) << 7;
                    read = inputStream.read();
                }
                if (read >= 0) {
                    return i3 | (read & 127);
                }
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        return i2;
    }

    /* renamed from: a */
    public AbstractC7305S m101412a(int i, int i2, int i3) throws IOException {
        boolean z = (i & 32) != 0;
        C44562lZ0 c44562lZ0 = new C44562lZ0(this, i3, this.f16553b);
        if ((i & 192) == 192) {
            return new C44984mG0(z, i2, c44562lZ0.m27154f());
        }
        if ((i & 64) != 0) {
            return new C42019hG0(z, i2, c44562lZ0.m27154f());
        }
        if ((i & 128) != 0) {
            return new C9585Y(c44562lZ0).m75887c(z, i2);
        }
        if (z) {
            if (i2 != 4) {
                if (i2 != 8) {
                    if (i2 == 16) {
                        return this.f16554c ? new C42331hn2(c44562lZ0.m27154f()) : C43798kG0.m29115a(m101403m(c44562lZ0));
                    } else if (i2 == 17) {
                        return C43798kG0.m29114b(m101403m(c44562lZ0));
                    } else {
                        throw new IOException("unknown tag " + i2 + " encountered");
                    }
                }
                return new C43205jG0(m101403m(c44562lZ0));
            }
            C2042F m101403m = m101403m(c44562lZ0);
            int m108146f = m101403m.m108146f();
            AbstractC5803O[] abstractC5803OArr = new AbstractC5803O[m108146f];
            for (int i4 = 0; i4 != m108146f; i4++) {
                InterfaceC1693E m108148d = m101403m.m108148d(i4);
                if (!(m108148d instanceof AbstractC5803O)) {
                    throw new ASN1Exception("unknown object encountered in constructed OCTET STRING: " + m108148d.getClass());
                }
                abstractC5803OArr[i4] = (AbstractC5803O) m108148d;
            }
            return new C3812Iv(abstractC5803OArr);
        }
        return m101411b(i2, c44562lZ0, this.f16555d);
    }

    /* renamed from: f */
    public int m101408f() {
        return this.f16553b;
    }

    /* renamed from: g */
    public int m101407g() throws IOException {
        return m101406i(this, this.f16553b, false);
    }

    /* renamed from: k */
    public AbstractC7305S m101405k() throws IOException {
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int m101404l = m101404l(this, read);
        boolean z = (read & 32) != 0;
        int m101407g = m101407g();
        if (m101407g >= 0) {
            try {
                return m101412a(read, m101404l, m101407g);
            } catch (IllegalArgumentException e) {
                throw new ASN1Exception("corrupted stream detected", e);
            }
        } else if (z) {
            C9585Y c9585y = new C9585Y(new C44249l12(this, this.f16553b), this.f16553b);
            if ((read & 192) == 192) {
                return new C5126Lv(m101404l, c9585y).mo17712a();
            }
            if ((read & 64) != 0) {
                return new C2986Gv(m101404l, c9585y).mo17712a();
            }
            if ((read & 128) != 0) {
                return new C7291Rv(true, m101404l, c9585y).mo17712a();
            }
            if (m101404l != 4) {
                if (m101404l != 8) {
                    if (m101404l != 16) {
                        if (m101404l == 17) {
                            return new C6562Pv(c9585y).mo17712a();
                        }
                        throw new IOException("unknown BER object encountered");
                    }
                    return new C5741Nv(c9585y).mo17712a();
                }
                return new OF0(c9585y).mo17712a();
            }
            return new C4278Jv(c9585y).mo17712a();
        } else {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
    }

    /* renamed from: m */
    public C2042F m101403m(C44562lZ0 c44562lZ0) throws IOException {
        if (c44562lZ0.m27156c() < 1) {
            return new C2042F(0);
        }
        C3828J c3828j = new C3828J(c44562lZ0);
        C2042F c2042f = new C2042F();
        while (true) {
            AbstractC7305S m101405k = c3828j.m101405k();
            if (m101405k == null) {
                return c2042f;
            }
            c2042f.m108151a(m101405k);
        }
    }

    public C3828J(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    public C3828J(InputStream inputStream, int i, boolean z) {
        super(inputStream);
        this.f16553b = i;
        this.f16554c = z;
        this.f16555d = new byte[11];
    }

    public C3828J(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public C3828J(byte[] bArr, boolean z) {
        this(new ByteArrayInputStream(bArr), bArr.length, z);
    }
}
