package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b#\u0010$J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, m28432d2 = {"LPX0;", "LvO2;", "Lkz0;", "constraints", "LOU3;", "P0", "(J)LOU3;", "", "height", "p0", "t0", "width", "g0", "B", "LX62;", "b", "LX62;", "getMeasurable", "()LX62;", "measurable", "La72;", "c", "La72;", "getMinMax", "()La72;", "minMax", "Ld72;", DateTokenConverter.CONVERTER_KEY, "Ld72;", "getWidthHeight", "()Ld72;", "widthHeight", "", "()Ljava/lang/Object;", "parentData", "<init>", "(LX62;La72;Ld72;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: PX0 */
/* loaded from: classes.dex */
public final class PX0 implements InterfaceC50393vO2 {

    /* renamed from: b */
    public final X62 f28629b;

    /* renamed from: c */
    public final EnumC37769a72 f28630c;

    /* renamed from: d */
    public final EnumC39566d72 f28631d;

    public PX0(X62 measurable, EnumC37769a72 minMax, EnumC39566d72 widthHeight) {
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Intrinsics.checkNotNullParameter(minMax, "minMax");
        Intrinsics.checkNotNullParameter(widthHeight, "widthHeight");
        this.f28629b = measurable;
        this.f28630c = minMax;
        this.f28631d = widthHeight;
    }

    @Override // p000.X62
    /* renamed from: B */
    public int mo77402B(int i) {
        return this.f28629b.mo77402B(i);
    }

    @Override // p000.InterfaceC50393vO2
    /* renamed from: P0 */
    public OU3 mo8763P0(long j) {
        int mo77400g0;
        int mo77399p0;
        if (this.f28631d == EnumC39566d72.Width) {
            if (this.f28630c == EnumC37769a72.Max) {
                mo77399p0 = this.f28629b.mo77398t0(C44228kz0.m28064m(j));
            } else {
                mo77399p0 = this.f28629b.mo77399p0(C44228kz0.m28064m(j));
            }
            return new C42340ho1(mo77399p0, C44228kz0.m28064m(j));
        }
        if (this.f28630c == EnumC37769a72.Max) {
            mo77400g0 = this.f28629b.mo77402B(C44228kz0.m28063n(j));
        } else {
            mo77400g0 = this.f28629b.mo77400g0(C44228kz0.m28063n(j));
        }
        return new C42340ho1(C44228kz0.m28063n(j), mo77400g0);
    }

    @Override // p000.X62
    /* renamed from: c */
    public Object mo77401c() {
        return this.f28629b.mo77401c();
    }

    @Override // p000.X62
    /* renamed from: g0 */
    public int mo77400g0(int i) {
        return this.f28629b.mo77400g0(i);
    }

    @Override // p000.X62
    /* renamed from: p0 */
    public int mo77399p0(int i) {
        return this.f28629b.mo77399p0(i);
    }

    @Override // p000.X62
    /* renamed from: t0 */
    public int mo77398t0(int i) {
        return this.f28629b.mo77398t0(i);
    }
}
