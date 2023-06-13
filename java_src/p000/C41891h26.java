package p000;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0005*\u00020\u0004H\u0002\u001a-\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0005*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00000\u0005*\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0000H\u0000\"\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\" \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m28432d2 = {"", "textDirectionHeuristic", "Landroid/text/TextDirectionHeuristic;", "i", "Le26;", "Lkotlin/Pair;", "j", "", "Lpr2;", "lineHeightSpans", "g", "(Le26;[Lpr2;)Lkotlin/Pair;", "Landroid/text/TextPaint;", "textPaint", "frameworkTextDir", "Landroid/graphics/Paint$FontMetricsInt;", "f", "(Le26;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;[Lpr2;)Lkotlin/Pair;", "h", "(Le26;)[Lpr2;", "Landroid/text/Layout;", "lineIndex", "", "k", "LL06;", C17296a.f69688o, "LL06;", "SharedTextAndroidCanvas", "b", "Lkotlin/Pair;", "EmptyPair", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/TextLayoutKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,1035:1\n26#2:1036\n26#2:1037\n*S KotlinDebug\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/TextLayoutKt\n*L\n1027#1:1036\n1031#1:1037\n*E\n"})
/* renamed from: h26  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41891h26 {

    /* renamed from: a */
    public static final L06 f84642a = new L06();

    /* renamed from: b */
    public static final Pair<Integer, Integer> f84643b = new Pair<>(0, 0);

    /* renamed from: f */
    public static final Pair<Paint.FontMetricsInt, Integer> m36889f(C40112e26 c40112e26, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, C47115pr2[] c47115pr2Arr) {
        boolean z;
        Object first;
        boolean m18633e;
        StaticLayout m44299a;
        int m43336k = c40112e26.m43336k() - 1;
        if (c40112e26.m43340g().getLineStart(m43336k) == c40112e26.m43340g().getLineEnd(m43336k)) {
            if (c47115pr2Arr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (true ^ z) {
                SpannableString spannableString = new SpannableString("\u200b");
                first = ArraysKt___ArraysKt.first(c47115pr2Arr);
                C47115pr2 c47115pr2 = (C47115pr2) first;
                int length = spannableString.length();
                if (m43336k != 0 && c47115pr2.m18633e()) {
                    m18633e = false;
                } else {
                    m18633e = c47115pr2.m18633e();
                }
                spannableString.setSpan(c47115pr2.m18636b(0, length, m18633e), 0, spannableString.length(), 33);
                m44299a = C39743dQ5.f76579a.m44299a(spannableString, (r47 & 2) != 0 ? 0 : 0, (r47 & 4) != 0 ? spannableString.length() : spannableString.length(), textPaint, Integer.MAX_VALUE, (r47 & 32) != 0 ? C44693lm2.f96670a.m26843b() : textDirectionHeuristic, (r47 & 64) != 0 ? C44693lm2.f96670a.m26844a() : null, (r47 & 128) != 0 ? Integer.MAX_VALUE : 0, (r47 & 256) != 0 ? null : null, (r47 & 512) != 0 ? Integer.MAX_VALUE : 0, (r47 & 1024) != 0 ? 1.0f : 0.0f, (r47 & 2048) != 0 ? 0.0f : 0.0f, (r47 & 4096) != 0 ? 0 : 0, (r47 & 8192) != 0 ? false : c40112e26.m43341f(), (r47 & 16384) != 0 ? true : c40112e26.m43344c(), (32768 & r47) != 0 ? 0 : 0, (65536 & r47) != 0 ? 0 : 0, (131072 & r47) != 0 ? 0 : 0, (262144 & r47) != 0 ? 0 : 0, (524288 & r47) != 0 ? null : null, (r47 & 1048576) != 0 ? null : null);
                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = m44299a.getLineAscent(0);
                fontMetricsInt.descent = m44299a.getLineDescent(0);
                fontMetricsInt.top = m44299a.getLineTop(0);
                int lineBottom = m44299a.getLineBottom(0);
                fontMetricsInt.bottom = lineBottom;
                return new Pair<>(fontMetricsInt, Integer.valueOf(lineBottom - ((int) c40112e26.m43330q(m43336k))));
            }
        }
        return new Pair<>(null, 0);
    }

    /* renamed from: g */
    public static final Pair<Integer, Integer> m36888g(C40112e26 c40112e26, C47115pr2[] c47115pr2Arr) {
        int i = 0;
        int i2 = 0;
        for (C47115pr2 c47115pr2 : c47115pr2Arr) {
            if (c47115pr2.m18635c() < 0) {
                i = Math.max(i, Math.abs(c47115pr2.m18635c()));
            }
            if (c47115pr2.m18634d() < 0) {
                i2 = Math.max(i, Math.abs(c47115pr2.m18634d()));
            }
        }
        if (i == 0 && i2 == 0) {
            return f84643b;
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: h */
    public static final C47115pr2[] m36887h(C40112e26 c40112e26) {
        boolean z;
        if (!(c40112e26.m43350D() instanceof Spanned)) {
            return new C47115pr2[0];
        }
        CharSequence m43350D = c40112e26.m43350D();
        Intrinsics.checkNotNull(m43350D, "null cannot be cast to non-null type android.text.Spanned");
        C47115pr2[] lineHeightStyleSpans = (C47115pr2[]) ((Spanned) m43350D).getSpans(0, c40112e26.m43350D().length(), C47115pr2.class);
        Intrinsics.checkNotNullExpressionValue(lineHeightStyleSpans, "lineHeightStyleSpans");
        if (lineHeightStyleSpans.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C47115pr2[0];
        }
        return lineHeightStyleSpans;
    }

    /* renamed from: i */
    public static final TextDirectionHeuristic m36886i(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                TextDirectionHeuristic FIRSTSTRONG_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                                Intrinsics.checkNotNullExpressionValue(FIRSTSTRONG_LTR, "FIRSTSTRONG_LTR");
                                return FIRSTSTRONG_LTR;
                            }
                            TextDirectionHeuristic LOCALE = TextDirectionHeuristics.LOCALE;
                            Intrinsics.checkNotNullExpressionValue(LOCALE, "LOCALE");
                            return LOCALE;
                        }
                        TextDirectionHeuristic ANYRTL_LTR = TextDirectionHeuristics.ANYRTL_LTR;
                        Intrinsics.checkNotNullExpressionValue(ANYRTL_LTR, "ANYRTL_LTR");
                        return ANYRTL_LTR;
                    }
                    TextDirectionHeuristic FIRSTSTRONG_RTL = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    Intrinsics.checkNotNullExpressionValue(FIRSTSTRONG_RTL, "FIRSTSTRONG_RTL");
                    return FIRSTSTRONG_RTL;
                }
                TextDirectionHeuristic FIRSTSTRONG_LTR2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                Intrinsics.checkNotNullExpressionValue(FIRSTSTRONG_LTR2, "FIRSTSTRONG_LTR");
                return FIRSTSTRONG_LTR2;
            }
            TextDirectionHeuristic RTL = TextDirectionHeuristics.RTL;
            Intrinsics.checkNotNullExpressionValue(RTL, "RTL");
            return RTL;
        }
        TextDirectionHeuristic LTR = TextDirectionHeuristics.LTR;
        Intrinsics.checkNotNullExpressionValue(LTR, "LTR");
        return LTR;
    }

    /* renamed from: j */
    public static final Pair<Integer, Integer> m36885j(C40112e26 c40112e26) {
        int topPadding;
        int bottomPadding;
        if (!c40112e26.m43341f() && !c40112e26.m43349E()) {
            TextPaint paint = c40112e26.m43340g().getPaint();
            CharSequence text = c40112e26.m43340g().getText();
            Intrinsics.checkNotNullExpressionValue(paint, "paint");
            Intrinsics.checkNotNullExpressionValue(text, "text");
            Rect m25919c = C44969mE3.m25919c(paint, text, c40112e26.m43340g().getLineStart(0), c40112e26.m43340g().getLineEnd(0));
            int lineAscent = c40112e26.m43340g().getLineAscent(0);
            int i = m25919c.top;
            if (i < lineAscent) {
                topPadding = lineAscent - i;
            } else {
                topPadding = c40112e26.m43340g().getTopPadding();
            }
            if (c40112e26.m43336k() != 1) {
                int m43336k = c40112e26.m43336k() - 1;
                m25919c = C44969mE3.m25919c(paint, text, c40112e26.m43340g().getLineStart(m43336k), c40112e26.m43340g().getLineEnd(m43336k));
            }
            int lineDescent = c40112e26.m43340g().getLineDescent(c40112e26.m43336k() - 1);
            int i2 = m25919c.bottom;
            if (i2 > lineDescent) {
                bottomPadding = i2 - lineDescent;
            } else {
                bottomPadding = c40112e26.m43340g().getBottomPadding();
            }
            if (topPadding == 0 && bottomPadding == 0) {
                return f84643b;
            }
            return new Pair<>(Integer.valueOf(topPadding), Integer.valueOf(bottomPadding));
        }
        return new Pair<>(0, 0);
    }

    /* renamed from: k */
    public static final boolean m36884k(Layout layout, int i) {
        Intrinsics.checkNotNullParameter(layout, "<this>");
        if (layout.getEllipsisCount(i) > 0) {
            return true;
        }
        return false;
    }
}
