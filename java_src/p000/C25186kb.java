package p000;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC44199kw1;
import p000.C1577Df;
import p000.R06;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a4\u0010\r\u001a\u00020\f*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u000e"}, m28432d2 = {"LDf;", "Lg01;", "density", "Lkw1$b;", "fontFamilyResolver", "Landroid/text/SpannableString;", "b", "LGN5;", "spanStyle", "", "start", "end", "", C17296a.f69688o, "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidAccessibilitySpannableString.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,198:1\n33#2,6:199\n33#2,6:205\n33#2,6:211\n*S KotlinDebug\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n*L\n75#1:199,6\n82#1:205,6\n91#1:211,6\n*E\n"})
/* renamed from: kb */
/* loaded from: classes.dex */
public final class C25186kb {
    /* renamed from: a */
    public static final void m28813a(SpannableString spannableString, GN5 gn5, int i, int i2, InterfaceC41273g01 interfaceC41273g01, AbstractC44199kw1.InterfaceC25559b interfaceC25559b) {
        int m108201b;
        int m106232a;
        JN5.m100580j(spannableString, gn5.m105168g(), i, i2);
        JN5.m100576n(spannableString, gn5.m105164k(), interfaceC41273g01, i, i2);
        if (gn5.m105161n() != null || gn5.m105163l() != null) {
            C33918Jw1 m105161n = gn5.m105161n();
            if (m105161n == null) {
                m105161n = C33918Jw1.f18784c.m99540d();
            }
            C32748Ew1 m105163l = gn5.m105163l();
            if (m105163l != null) {
                m108201b = m105163l.m108203i();
            } else {
                m108201b = C32748Ew1.f8309b.m108201b();
            }
            spannableString.setSpan(new StyleSpan(C5319Mc.m95135c(m105161n, m108201b)), i, i2, 33);
        }
        if (gn5.m105166i() != null) {
            if (gn5.m105166i() instanceof C49090tB1) {
                spannableString.setSpan(new TypefaceSpan(((C49090tB1) gn5.m105166i()).m12920b()), i, i2, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                AbstractC44199kw1 m105166i = gn5.m105166i();
                C32982Fw1 m105162m = gn5.m105162m();
                if (m105162m != null) {
                    m106232a = m105162m.m106233m();
                } else {
                    m106232a = C32982Fw1.f10526b.m106232a();
                }
                Object value = AbstractC44199kw1.InterfaceC25559b.m28151b(interfaceC25559b, m105166i, null, 0, m106232a, 6, null).getValue();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(C10812ah.f50936a.m70873a((Typeface) value), i, i2, 33);
            }
        }
        if (gn5.m105156s() != null) {
            R06 m105156s = gn5.m105156s();
            R06.C7050a c7050a = R06.f31395b;
            if (m105156s.m87432d(c7050a.m87427d())) {
                spannableString.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (gn5.m105156s().m87432d(c7050a.m87429b())) {
                spannableString.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
        }
        if (gn5.m105154u() != null) {
            spannableString.setSpan(new ScaleXSpan(gn5.m105154u().m97920b()), i, i2, 33);
        }
        JN5.m100572r(spannableString, gn5.m105159p(), i, i2);
        JN5.m100583g(spannableString, gn5.m105171d(), i, i2);
    }

    /* renamed from: b */
    public static final SpannableString m28812b(C1577Df c1577Df, InterfaceC41273g01 density, AbstractC44199kw1.InterfaceC25559b fontFamilyResolver) {
        GN5 m105174a;
        Intrinsics.checkNotNullParameter(c1577Df, "<this>");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        SpannableString spannableString = new SpannableString(c1577Df.m110052j());
        List<C1577Df.C1580b<GN5>> m110055g = c1577Df.m110055g();
        if (m110055g != null) {
            int size = m110055g.size();
            for (int i = 0; i < size; i++) {
                C1577Df.C1580b<GN5> c1580b = m110055g.get(i);
                int m110031b = c1580b.m110031b();
                int m110030c = c1580b.m110030c();
                m105174a = r14.m105174a((r35 & 1) != 0 ? r14.m105168g() : 0L, (r35 & 2) != 0 ? r14.f11830b : 0L, (r35 & 4) != 0 ? r14.f11831c : null, (r35 & 8) != 0 ? r14.f11832d : null, (r35 & 16) != 0 ? r14.f11833e : null, (r35 & 32) != 0 ? r14.f11834f : null, (r35 & 64) != 0 ? r14.f11835g : null, (r35 & 128) != 0 ? r14.f11836h : 0L, (r35 & 256) != 0 ? r14.f11837i : null, (r35 & 512) != 0 ? r14.f11838j : null, (r35 & 1024) != 0 ? r14.f11839k : null, (r35 & 2048) != 0 ? r14.f11840l : 0L, (r35 & 4096) != 0 ? r14.f11841m : null, (r35 & 8192) != 0 ? c1580b.m110032a().f11842n : null);
                m28813a(spannableString, m105174a, m110031b, m110030c, density, fontFamilyResolver);
            }
        }
        List<C1577Df.C1580b<AbstractC31619Aa6>> m110051k = c1577Df.m110051k(0, c1577Df.length());
        int size2 = m110051k.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C1577Df.C1580b<AbstractC31619Aa6> c1580b2 = m110051k.get(i2);
            spannableString.setSpan(C31853Ba6.m113841a(c1580b2.m110032a()), c1580b2.m110031b(), c1580b2.m110030c(), 33);
        }
        List<C1577Df.C1580b<C34004Kf6>> m110050l = c1577Df.m110050l(0, c1577Df.length());
        int size3 = m110050l.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C1577Df.C1580b<C34004Kf6> c1580b3 = m110050l.get(i3);
            spannableString.setSpan(C34238Lf6.m96510a(c1580b3.m110032a()), c1580b3.m110031b(), c1580b3.m110030c(), 33);
        }
        return spannableString;
    }
}
