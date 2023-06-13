package p000;

import java.util.UUID;
import kotlin.KotlinVersion;
/* renamed from: aO1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37924aO1 extends C19649d {
    private static final long serialVersionUID = 2;

    /* renamed from: f */
    public UUID f50381f;

    /* renamed from: g */
    public int f50382g;

    /* renamed from: h */
    public int f50383h;

    /* renamed from: i */
    public int f50384i;

    public C37924aO1() {
        this(26, KotlinVersion.MAX_COMPONENT_VALUE, new byte[]{76, 0, 2, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 76);
    }

    /* renamed from: i */
    public static C37924aO1 m71508i(int i, int i2, byte[] bArr, int i3) {
        if (bArr != null && bArr.length >= 25) {
            return new C37924aO1(i, i2, bArr, i3);
        }
        return null;
    }

    /* renamed from: e */
    public final int m71512e(byte[] bArr) {
        return R70.m87308c(bArr, 20);
    }

    /* renamed from: f */
    public final int m71511f(byte[] bArr) {
        return R70.m87308c(bArr, 22);
    }

    /* renamed from: g */
    public final int m71510g(byte[] bArr) {
        return bArr[24];
    }

    /* renamed from: h */
    public final UUID m71509h(byte[] bArr) {
        return C46979pd6.m19041c(bArr, 4, false);
    }

    /* renamed from: j */
    public final void m71507j(byte[] bArr) {
        if (bArr != null && bArr.length >= 25) {
            this.f50381f = m71509h(bArr);
            this.f50382g = m71512e(bArr);
            this.f50383h = m71511f(bArr);
            this.f50384i = m71510g(bArr);
            return;
        }
        throw new IllegalArgumentException("The byte sequence cannot be parsed as an iBeacon.");
    }

    @Override // p000.C19649d, p000.C20674g
    public String toString() {
        return String.format("iBeacon(UUID=%s,Major=%d,Minor=%d,Power=%d)", this.f50381f, Integer.valueOf(this.f50382g), Integer.valueOf(this.f50383h), Integer.valueOf(this.f50384i));
    }

    public C37924aO1(int i, int i2, byte[] bArr, int i3) {
        super(i, i2, bArr, i3);
        m71507j(bArr);
    }
}
