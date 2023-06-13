package p000;

import android.graphics.PointF;
/* renamed from: N51 */
/* loaded from: classes2.dex */
public class N51 {

    /* renamed from: a */
    public String f24120a;

    /* renamed from: b */
    public String f24121b;

    /* renamed from: c */
    public float f24122c;

    /* renamed from: d */
    public EnumC5475a f24123d;

    /* renamed from: e */
    public int f24124e;

    /* renamed from: f */
    public float f24125f;

    /* renamed from: g */
    public float f24126g;

    /* renamed from: h */
    public int f24127h;

    /* renamed from: i */
    public int f24128i;

    /* renamed from: j */
    public float f24129j;

    /* renamed from: k */
    public boolean f24130k;

    /* renamed from: l */
    public PointF f24131l;

    /* renamed from: m */
    public PointF f24132m;

    /* renamed from: N51$a */
    /* loaded from: classes2.dex */
    public enum EnumC5475a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public N51(String str, String str2, float f, EnumC5475a enumC5475a, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        m94388a(str, str2, f, enumC5475a, i, f2, f3, i2, i3, f4, z, pointF, pointF2);
    }

    /* renamed from: a */
    public void m94388a(String str, String str2, float f, EnumC5475a enumC5475a, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        this.f24120a = str;
        this.f24121b = str2;
        this.f24122c = f;
        this.f24123d = enumC5475a;
        this.f24124e = i;
        this.f24125f = f2;
        this.f24126g = f3;
        this.f24127h = i2;
        this.f24128i = i3;
        this.f24129j = f4;
        this.f24130k = z;
        this.f24131l = pointF;
        this.f24132m = pointF2;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.f24120a.hashCode() * 31) + this.f24121b.hashCode()) * 31) + this.f24122c)) * 31) + this.f24123d.ordinal()) * 31) + this.f24124e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f24125f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f24127h;
    }

    public N51() {
    }
}
