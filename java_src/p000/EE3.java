package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a&\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0000\"\u0017\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m28432d2 = {"LDE3;", "start", "stop", "", "fraction", C17296a.f69688o, "LZV3;", "b", "style", "Lpm2;", "direction", "c", "LM26;", "J", "DefaultLineHeight", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: EE3 */
/* loaded from: classes.dex */
public final class EE3 {

    /* renamed from: a */
    public static final long f7135a = M26.f22473b.m95968a();

    /* renamed from: a */
    public static final DE3 m109281a(DE3 start, DE3 stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        C47801r06 c47801r06 = (C47801r06) HN5.m103925c(start.m110652j(), stop.m110652j(), f);
        W06 w06 = (W06) HN5.m103925c(start.m110650l(), stop.m110650l(), f);
        long m103923e = HN5.m103923e(start.m110655g(), stop.m110655g(), f);
        N16 m110649m = start.m110649m();
        if (m110649m == null) {
            m110649m = N16.f23977c.m94448a();
        }
        N16 m110649m2 = stop.m110649m();
        if (m110649m2 == null) {
            m110649m2 = N16.f23977c.m94448a();
        }
        return new DE3(c47801r06, w06, m103923e, O16.m92991a(m110649m, m110649m2, f), m109280b(start.m110653i(), stop.m110653i(), f), (C46522or2) HN5.m103925c(start.m110654h(), stop.m110654h(), f), (C41185fr2) HN5.m103925c(start.m110657e(), stop.m110657e(), f), (UN1) HN5.m103925c(start.m110659c(), stop.m110659c(), f), (C44263l26) HN5.m103925c(start.m110648n(), stop.m110648n(), f), (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static final ZV3 m109280b(ZV3 zv3, ZV3 zv32, float f) {
        if (zv3 == null && zv32 == null) {
            return null;
        }
        if (zv3 == null) {
            zv3 = ZV3.f48693c.m72999a();
        }
        if (zv32 == null) {
            zv32 = ZV3.f48693c.m72999a();
        }
        return C7488Sd.m85182b(zv3, zv32, f);
    }

    /* renamed from: c */
    public static final DE3 m109279c(DE3 style, EnumC47065pm2 direction) {
        long m110655g;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(direction, "direction");
        C47801r06 m16685g = C47801r06.m16685g(style.m110651k());
        W06 m78953f = W06.m78953f(H26.m104476e(direction, style.m110650l()));
        if (N26.m94413g(style.m110655g())) {
            m110655g = f7135a;
        } else {
            m110655g = style.m110655g();
        }
        N16 m110649m = style.m110649m();
        if (m110649m == null) {
            m110649m = N16.f23977c.m94448a();
        }
        N16 n16 = m110649m;
        ZV3 m110653i = style.m110653i();
        C46522or2 m110654h = style.m110654h();
        C41185fr2 m40751b = C41185fr2.m40751b(style.m110656f());
        UN1 m81581c = UN1.m81581c(style.m110658d());
        C44263l26 m110648n = style.m110648n();
        if (m110648n == null) {
            m110648n = C44263l26.f95382c.m28005a();
        }
        return new DE3(m16685g, m78953f, m110655g, n16, m110653i, m110654h, m40751b, m81581c, m110648n, (DefaultConstructorMarker) null);
    }
}
