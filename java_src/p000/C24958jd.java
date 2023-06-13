package p000;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.emoji2.text.C11581c;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import p000.C1577Df;
@Metadata(m28433d1 = {"\u0000[\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u001a\u001a\u0083\u0001\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\r\u001a\u00020\f2&\u0010\u0014\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000ø\u0001\u0000\u001a\f\u0010\u0019\u001a\u00020\u0015*\u00020\u0004H\u0000\"\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m28432d2 = {"", Entry.TYPE_TEXT, "", "contextFontSize", "LG26;", "contextTextStyle", "", "LDf$b;", "LGN5;", "spanStyles", "LTU3;", "placeholders", "Lg01;", "density", "Lkotlin/Function4;", "Lkw1;", "LJw1;", "LEw1;", "LFw1;", "Landroid/graphics/Typeface;", "resolveTypeface", "", "useEmojiCompat", "", C17296a.f69688o, "b", "jd$a", "Ljd$a;", "NoopSpan", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: jd */
/* loaded from: classes.dex */
public final class C24958jd {

    /* renamed from: a */
    public static final C24959a f93031a = new C24959a();

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"jd$a", "Landroid/text/style/CharacterStyle;", "Landroid/text/TextPaint;", "p0", "", "updateDrawState", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: jd$a */
    /* loaded from: classes.dex */
    public static final class C24959a extends CharacterStyle {
        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    /* renamed from: a */
    public static final CharSequence m30197a(String text, float f, G26 contextTextStyle, List<C1577Df.C1580b<GN5>> spanStyles, List<C1577Df.C1580b<TU3>> placeholders, InterfaceC41273g01 density, Function4<? super AbstractC44199kw1, ? super C33918Jw1, ? super C32748Ew1, ? super C32982Fw1, ? extends Typeface> resolveTypeface, boolean z) {
        CharSequence charSequence;
        Spannable spannableString;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contextTextStyle, "contextTextStyle");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        if (z && C11581c.m67521k()) {
            charSequence = C11581c.m67529c().m67514r(text);
            Intrinsics.checkNotNull(charSequence);
        } else {
            charSequence = text;
        }
        Intrinsics.checkNotNullExpressionValue(charSequence, "if (useEmojiCompat && Em…else {\n        text\n    }");
        if (spanStyles.isEmpty() && placeholders.isEmpty() && Intrinsics.areEqual(contextTextStyle.m105931F(), N16.f23977c.m94448a()) && N26.m94413g(contextTextStyle.m105904u())) {
            return charSequence;
        }
        if (charSequence instanceof Spannable) {
            spannableString = (Spannable) charSequence;
        } else {
            spannableString = new SpannableString(charSequence);
        }
        if (Intrinsics.areEqual(contextTextStyle.m105934C(), R06.f31395b.m87427d())) {
            JN5.m100570t(spannableString, f93031a, 0, text.length());
        }
        if (m30196b(contextTextStyle) && contextTextStyle.m105903v() == null) {
            JN5.m100573q(spannableString, contextTextStyle.m105904u(), f, density);
        } else {
            C46522or2 m105903v = contextTextStyle.m105903v();
            if (m105903v == null) {
                m105903v = C46522or2.f102564c.m20447a();
            }
            Spannable spannable = spannableString;
            JN5.m100574p(spannable, contextTextStyle.m105904u(), f, density, m105903v);
        }
        JN5.m100566x(spannableString, contextTextStyle.m105931F(), f, density);
        JN5.m100568v(spannableString, contextTextStyle, spanStyles, density, resolveTypeface);
        UU3.m81463d(spannableString, placeholders, density);
        return spannableString;
    }

    /* renamed from: b */
    public static final boolean m30196b(G26 g26) {
        ZV3 m27191a;
        Intrinsics.checkNotNullParameter(g26, "<this>");
        C44538lW3 m105900y = g26.m105900y();
        if (m105900y != null && (m27191a = m105900y.m27191a()) != null) {
            return m27191a.m73001c();
        }
        return true;
    }
}
