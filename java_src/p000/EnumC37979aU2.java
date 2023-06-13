package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
/* renamed from: aU2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC37979aU2 implements WZ3 {
    YOTTA("Y", 24),
    ZETTA("Z", 21),
    EXA("E", 18),
    PETA("P", 15),
    TERA("T", 12),
    GIGA("G", 9),
    MEGA("M", 6),
    KILO("k", 3),
    HECTO("h", 2),
    DEKA("da", 1),
    DECI(DateTokenConverter.CONVERTER_KEY, -1),
    CENTI("c", -2),
    MILLI("m", -3),
    MICRO("µ", -6),
    NANO("n", -9),
    PICO("p", -12),
    FEMTO("f", -15),
    ATTO(C17296a.f69688o, -18),
    ZEPTO("z", -21),
    YOCTO("y", -24);
    

    /* renamed from: b */
    public final String f50541b;

    /* renamed from: c */
    public final int f50542c;

    EnumC37979aU2(String str, int i) {
        this.f50541b = str;
        this.f50542c = i;
    }

    /* renamed from: c */
    public static <Q> InterfaceC35858Sd6<Q> m71319c(InterfaceC35858Sd6<Q> interfaceC35858Sd6) {
        return interfaceC35858Sd6.mo11082e(MICRO);
    }

    @Override // p000.WZ3
    /* renamed from: a */
    public String mo71321a() {
        return this.f50541b;
    }

    @Override // p000.WZ3
    /* renamed from: b */
    public int mo71320b() {
        return this.f50542c;
    }

    @Override // p000.WZ3
    /* renamed from: d */
    public Integer getValue() {
        return 10;
    }
}
