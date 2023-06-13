package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC39873de5;
import p000.InterfaceC5225MD;
import p000.ZN1;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0000\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0007¨\u0006\n"}, m28432d2 = {"LTk5;", "", "b", "c", C17296a.f69688o, "LZN1;", DateTokenConverter.CONVERTER_KEY, "Lde5$a;", "LMD$b;", "e", "bluetooth_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: bE */
/* loaded from: classes4.dex */
public final class C12325bE {
    /* renamed from: a */
    public static final boolean m64815a(C36154Tk5 c36154Tk5) {
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        if (m64812d(c36154Tk5) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m64814b(C36154Tk5 c36154Tk5) {
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        return C36388Uk5.m80902w(c36154Tk5, InterfaceC46193oI5.f101755a.m21393a());
    }

    /* renamed from: c */
    public static final boolean m64813c(C36154Tk5 c36154Tk5) {
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        byte[] mo106631a = c36154Tk5.m83014c().mo106631a();
        Intrinsics.checkNotNullExpressionValue(mo106631a, "scanRecord.bytes");
        Integer m80917h = C36388Uk5.m80917h(mo106631a);
        if (m80917h != null && m80917h.intValue() == 769) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final ZN1 m64812d(C36154Tk5 c36154Tk5) {
        Intrinsics.checkNotNullParameter(c36154Tk5, "<this>");
        ZN1.C10245a c10245a = ZN1.f48401g;
        byte[] mo106631a = c36154Tk5.m83014c().mo106631a();
        Intrinsics.checkNotNullExpressionValue(mo106631a, "scanRecord.bytes");
        return c10245a.m73224b(mo106631a, c36154Tk5.m83015b(), c36154Tk5.m83016a().mo17281d());
    }

    /* renamed from: e */
    public static final InterfaceC5225MD.EnumC5227b m64811e(AbstractC39873de5.EnumC19828a enumC19828a) {
        Intrinsics.checkNotNullParameter(enumC19828a, "<this>");
        try {
            return InterfaceC5225MD.EnumC5227b.valueOf(enumC19828a.name());
        } catch (Exception e) {
            C41318g46.m40159e(e);
            return InterfaceC5225MD.EnumC5227b.UNKNOWN;
        }
    }
}
