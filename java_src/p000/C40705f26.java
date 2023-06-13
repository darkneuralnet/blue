package p000;

import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC44199kw1;
import p000.C1577Df;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001au\u0010\u0017\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, m28432d2 = {"Li26;", "LDf;", Entry.TYPE_TEXT, "LG26;", "style", "", "LDf$b;", "LTU3;", "placeholders", "", "maxLines", "", "softWrap", "Ln26;", "overflow", "Lg01;", "density", "Lpm2;", "layoutDirection", "Lkw1$b;", "fontFamilyResolver", "Lkz0;", "constraints", C17296a.f69688o, "(Li26;LDf;LG26;Ljava/util/List;IZILg01;Lpm2;Lkw1$b;J)Z", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: f26  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40705f26 {
    /* renamed from: a */
    public static final boolean m42259a(C42484i26 canReuse, C1577Df text, G26 style, List<C1577Df.C1580b<TU3>> placeholders, int i, boolean z, int i2, InterfaceC41273g01 density, EnumC47065pm2 layoutDirection, AbstractC44199kw1.InterfaceC25559b fontFamilyResolver, long j) {
        Intrinsics.checkNotNullParameter(canReuse, "$this$canReuse");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        C41298g26 m34597k = canReuse.m34597k();
        if (canReuse.m34586v().m86662i().mo28728b() || !Intrinsics.areEqual(m34597k.m40259j(), text) || !m34597k.m40260i().m105929H(style) || !Intrinsics.areEqual(m34597k.m40262g(), placeholders) || m34597k.m40264e() != i || m34597k.m40261h() != z || !C45449n26.m24543e(m34597k.m40263f(), i2) || !Intrinsics.areEqual(m34597k.m40267b(), density) || m34597k.m40265d() != layoutDirection || !Intrinsics.areEqual(m34597k.m40266c(), fontFamilyResolver) || C44228kz0.m28061p(j) != C44228kz0.m28061p(m34597k.m40268a())) {
            return false;
        }
        if (!z && !C45449n26.m24543e(i2, C45449n26.f99264a.m24539b())) {
            return true;
        }
        if (C44228kz0.m28063n(j) != C44228kz0.m28063n(m34597k.m40268a()) || C44228kz0.m28064m(j) != C44228kz0.m28064m(m34597k.m40268a())) {
            return false;
        }
        return true;
    }
}
