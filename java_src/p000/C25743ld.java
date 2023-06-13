package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC44199kw1;
import p000.C1577Df;
import p000.W06;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aP\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\"\u0018\u0010\u001a\u001a\u00020\u0017*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, m28432d2 = {"LW06;", "textDirection", "Luv2;", "localeList", "", DateTokenConverter.CONVERTER_KEY, "(LW06;Luv2;)I", "", Entry.TYPE_TEXT, "LG26;", "style", "", "LDf$b;", "LGN5;", "spanStyles", "LTU3;", "placeholders", "Lg01;", "density", "Lkw1$b;", "fontFamilyResolver", "LAE3;", C17296a.f69688o, "", "c", "(LG26;)Z", "hasEmojiCompat", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: ld */
/* loaded from: classes.dex */
public final class C25743ld {
    /* renamed from: a */
    public static final AE3 m27086a(String text, G26 style, List<C1577Df.C1580b<GN5>> spanStyles, List<C1577Df.C1580b<TU3>> placeholders, InterfaceC41273g01 density, AbstractC44199kw1.InterfaceC25559b fontFamilyResolver) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        return new C25194kd(text, style, spanStyles, placeholders, fontFamilyResolver, density);
    }

    /* renamed from: c */
    public static final boolean m27084c(G26 g26) {
        ZV3 m27191a;
        C44538lW3 m105900y = g26.m105900y();
        C33252Ha1 m103714c = (m105900y == null || (m27191a = m105900y.m27191a()) == null) ? null : C33252Ha1.m103714c(m27191a.m73002b());
        return !(m103714c == null ? false : C33252Ha1.m103711f(m103714c.m103708i(), C33252Ha1.f13558b.m103706b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (r6 == null) goto L28;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m27083d(W06 w06, C50119uv2 c50119uv2) {
        int m78946a;
        Locale locale;
        if (w06 != null) {
            m78946a = w06.m78947l();
        } else {
            m78946a = W06.f40244b.m78946a();
        }
        W06.C8909a c8909a = W06.f40244b;
        if (W06.m78950i(m78946a, c8909a.m78945b())) {
            return 2;
        }
        if (!W06.m78950i(m78946a, c8909a.m78944c())) {
            if (W06.m78950i(m78946a, c8909a.m78943d())) {
                return 0;
            }
            if (W06.m78950i(m78946a, c8909a.m78942e())) {
                return 1;
            }
            if (W06.m78950i(m78946a, c8909a.m78946a())) {
                if (c50119uv2 != null) {
                    BV3 m16787b = c50119uv2.m9495b(0).m16787b();
                    Intrinsics.checkNotNull(m16787b, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
                    locale = ((C9819Yc) m16787b).m74815c();
                }
                locale = Locale.getDefault();
                int m91040a = P26.m91040a(locale);
                if (m91040a == 0 || m91040a != 1) {
                    return 2;
                }
            } else {
                throw new IllegalStateException("Invalid TextDirection.".toString());
            }
        }
        return 3;
    }
}
