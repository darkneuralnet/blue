package p000;

import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import p000.AbstractC43142j91;
/* renamed from: m91  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C44921m91 extends AbstractC43142j91 {
    private static final long serialVersionUID = 1;

    /* renamed from: g */
    public final int f97418g;

    /* renamed from: h */
    public final int f97419h;

    /* renamed from: i */
    public final float f97420i;

    /* renamed from: j */
    public final long f97421j;

    /* renamed from: k */
    public final long f97422k;

    /* renamed from: l */
    public transient String f97423l;

    public C44921m91() {
        this(17, 22, new byte[]{-86, -2, 32, 0, 0, 0, ByteCompanionObject.MIN_VALUE, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    }

    /* renamed from: e */
    public final long m26251e(byte[] bArr) {
        if (bArr.length < 12) {
            return 0L;
        }
        return R70.m87307d(bArr, 8);
    }

    /* renamed from: f */
    public final int m26250f(byte[] bArr) {
        if (bArr.length < 6) {
            return 0;
        }
        return R70.m87308c(bArr, 4);
    }

    /* renamed from: g */
    public final float m26249g(byte[] bArr) {
        if (bArr.length < 8) {
            return -128.0f;
        }
        return R70.m87310a(bArr, 6);
    }

    /* renamed from: h */
    public final long m26248h(byte[] bArr) {
        if (bArr.length < 16) {
            return 0L;
        }
        return R70.m87307d(bArr, 12) * 100;
    }

    /* renamed from: i */
    public final int m26247i(byte[] bArr) {
        if (bArr.length < 4) {
            return 0;
        }
        return bArr[3] & UByte.MAX_VALUE;
    }

    @Override // p000.AbstractC43142j91, p000.C35533Qt5, p000.C20674g
    public String toString() {
        String str = this.f97423l;
        if (str != null) {
            return str;
        }
        String format = String.format("EddystoneTLM(Version=%d,BatteryVoltage=%d,BeaconTemperature=%f,AdvertisementCount=%d,ElapsedTime=%d)", Integer.valueOf(this.f97418g), Integer.valueOf(this.f97419h), Float.valueOf(this.f97420i), Long.valueOf(this.f97421j), Long.valueOf(this.f97422k));
        this.f97423l = format;
        return format;
    }

    public C44921m91(int i, int i2, byte[] bArr) {
        super(i, i2, bArr, AbstractC43142j91.EnumC24725a.TLM);
        this.f97418g = m26247i(bArr);
        this.f97419h = m26250f(bArr);
        this.f97420i = m26249g(bArr);
        this.f97421j = m26251e(bArr);
        this.f97422k = m26248h(bArr);
    }
}
