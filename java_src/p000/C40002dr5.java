package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00150*\u0012\u0006\u00104\u001a\u000200¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0001H\u0016J\u0017\u0010\f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0016J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ(\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000eH\u0016J(\u0010\"\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000eH\u0016J\u000f\u0010#\u001a\u00020\u0015H\u0010¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020 2\b\u0010\u001e\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010'\u001a\u00020\u000eH\u0016J\b\u0010(\u001a\u00020\u0006H\u0016J\b\u0010)\u001a\u00020\u0001H\u0002R \u0010/\u001a\b\u0012\u0004\u0012\u00020\u00150*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00104\u001a\u0002008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u00101\u001a\u0004\b2\u00103¨\u00067"}, m28432d2 = {"Ldr5;", "LM70;", "Ljava/lang/Object;", "writeReplace", "Ljava/nio/charset/Charset;", "charset", "", "u", C17296a.f69688o, "j", "v", "algorithm", "c", "(Ljava/lang/String;)LM70;", "", "pos", "", "l", "(I)B", "h", "()I", "", "J", "Li30;", "buffer", "offset", "byteCount", "", "E", "(Li30;II)V", LegacyRepairType.OTHER_KEY, "otherOffset", "", "n", "o", "k", "()[B", "", "equals", "hashCode", "toString", "K", "", "g", "[[B", "H", "()[[B", "segments", "", "[I", "F", "()[I", "directory", "<init>", "([[B[I)V", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: dr5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C40002dr5 extends M70 {

    /* renamed from: g */
    public final transient byte[][] f77311g;

    /* renamed from: h */
    public final transient int[] f77312h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40002dr5(byte[][] segments, int[] directory) {
        super(M70.f22645f.m95807f());
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f77311g = segments;
        this.f77312h = directory;
    }

    private final Object writeReplace() {
        return m43601K();
    }

    @Override // p000.M70
    /* renamed from: E */
    public void mo43605E(C42488i30 buffer, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i4 = i + i2;
        int m109181b = EJ6.m109181b(this, i);
        while (i < i4) {
            if (m109181b == 0) {
                i3 = 0;
            } else {
                i3 = m43604F()[m109181b - 1];
            }
            int i5 = m43604F()[m43603H().length + m109181b];
            int min = Math.min(i4, (m43604F()[m109181b] - i3) + i3) - i;
            int i6 = i5 + (i - i3);
            C36208Tq5 c36208Tq5 = new C36208Tq5(m43603H()[m109181b], i6, i6 + min, true, false);
            C36208Tq5 c36208Tq52 = buffer.f86657b;
            if (c36208Tq52 == null) {
                c36208Tq5.f36332g = c36208Tq5;
                c36208Tq5.f36331f = c36208Tq5;
                buffer.f86657b = c36208Tq5;
            } else {
                Intrinsics.checkNotNull(c36208Tq52);
                C36208Tq5 c36208Tq53 = c36208Tq52.f36332g;
                Intrinsics.checkNotNull(c36208Tq53);
                c36208Tq53.m82374c(c36208Tq5);
            }
            i += min;
            m109181b++;
        }
        buffer.m34571O(buffer.size() + i2);
    }

    /* renamed from: F */
    public final int[] m43604F() {
        return this.f77312h;
    }

    /* renamed from: H */
    public final byte[][] m43603H() {
        return this.f77311g;
    }

    /* renamed from: J */
    public byte[] m43602J() {
        byte[] bArr = new byte[size()];
        int length = m43603H().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = m43604F()[length + i];
            int i5 = m43604F()[i];
            int i6 = i5 - i2;
            ArraysKt___ArraysJvmKt.copyInto(m43603H()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    /* renamed from: K */
    public final M70 m43601K() {
        return new M70(m43602J());
    }

    @Override // p000.M70
    /* renamed from: a */
    public String mo43600a() {
        return m43601K().mo43600a();
    }

    @Override // p000.M70
    /* renamed from: c */
    public M70 mo43599c(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = m43603H().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = m43604F()[length + i];
            int i4 = m43604F()[i];
            messageDigest.update(m43603H()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digestBytes = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digestBytes, "digestBytes");
        return new M70(digestBytes);
    }

    @Override // p000.M70
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof M70) {
            M70 m70 = (M70) obj;
            if (m70.size() == size() && mo43594n(0, m70, 0, size())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.M70
    /* renamed from: h */
    public int mo43598h() {
        return m43604F()[m43603H().length - 1];
    }

    @Override // p000.M70
    public int hashCode() {
        int m95806g = m95806g();
        if (m95806g == 0) {
            int length = m43603H().length;
            int i = 0;
            int i2 = 1;
            int i3 = 0;
            while (i < length) {
                int i4 = m43604F()[length + i];
                int i5 = m43604F()[i];
                byte[] bArr = m43603H()[i];
                int i6 = (i5 - i3) + i4;
                while (i4 < i6) {
                    i2 = (i2 * 31) + bArr[i4];
                    i4++;
                }
                i++;
                i3 = i5;
            }
            m95803p(i2);
            return i2;
        }
        return m95806g;
    }

    @Override // p000.M70
    /* renamed from: j */
    public String mo43597j() {
        return m43601K().mo43597j();
    }

    @Override // p000.M70
    /* renamed from: k */
    public byte[] mo43596k() {
        return m43602J();
    }

    @Override // p000.M70
    /* renamed from: l */
    public byte mo43595l(int i) {
        int i2;
        FJ6.m107320b(m43604F()[m43603H().length - 1], i, 1L);
        int m109181b = EJ6.m109181b(this, i);
        if (m109181b == 0) {
            i2 = 0;
        } else {
            i2 = m43604F()[m109181b - 1];
        }
        return m43603H()[m109181b][(i - i2) + m43604F()[m43603H().length + m109181b]];
    }

    @Override // p000.M70
    /* renamed from: n */
    public boolean mo43594n(int i, M70 other, int i2, int i3) {
        int i4;
        Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0 || i > size() - i3) {
            return false;
        }
        int i5 = i3 + i;
        int m109181b = EJ6.m109181b(this, i);
        while (i < i5) {
            if (m109181b == 0) {
                i4 = 0;
            } else {
                i4 = m43604F()[m109181b - 1];
            }
            int i6 = m43604F()[m43603H().length + m109181b];
            int min = Math.min(i5, (m43604F()[m109181b] - i4) + i4) - i;
            if (!other.mo43593o(i2, m43603H()[m109181b], i6 + (i - i4), min)) {
                return false;
            }
            i2 += min;
            i += min;
            m109181b++;
        }
        return true;
    }

    @Override // p000.M70
    /* renamed from: o */
    public boolean mo43593o(int i, byte[] other, int i2, int i3) {
        int i4;
        Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0 || i > size() - i3 || i2 < 0 || i2 > other.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int m109181b = EJ6.m109181b(this, i);
        while (i < i5) {
            if (m109181b == 0) {
                i4 = 0;
            } else {
                i4 = m43604F()[m109181b - 1];
            }
            int i6 = m43604F()[m43603H().length + m109181b];
            int min = Math.min(i5, (m43604F()[m109181b] - i4) + i4) - i;
            if (!FJ6.m107321a(m43603H()[m109181b], i6 + (i - i4), other, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            m109181b++;
        }
        return true;
    }

    @Override // p000.M70
    public String toString() {
        return m43601K().toString();
    }

    @Override // p000.M70
    /* renamed from: u */
    public String mo43592u(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return m43601K().mo43592u(charset);
    }

    @Override // p000.M70
    /* renamed from: v */
    public M70 mo43591v() {
        return m43601K().mo43591v();
    }
}
