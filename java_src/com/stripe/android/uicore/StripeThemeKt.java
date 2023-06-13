package com.stripe.android.uicore;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.C47063pm0;
import p000.G26;
@Metadata(m28433d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a;\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0011\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001e\u0010\u0017\u001a\u00020\u0016*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001e\u0010\u001a\u001a\u00020\u0019*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001d\u001a\u00020\u001c*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\f\u0010 \u001a\u00020\u0014*\u00020\u001fH\u0007\u001a!\u0010%\u001a\u00020\"*\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001aC\u00100\u001a\u00020-2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00192\n\b\u0001\u0010,\u001a\u0004\u0018\u00010+H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a\u0019\u00103\u001a\u00020\u0014*\u00020\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a\u0014\u00105\u001a\u00020+*\u0002042\u0006\u0010(\u001a\u00020\u001fH\u0007\u001a\u0014\u00106\u001a\u00020+*\u0002042\u0006\u0010(\u001a\u00020\u001fH\u0007\u001a\u0014\u0010\u001a\u001a\u00020+*\u0002042\u0006\u0010(\u001a\u00020\u001fH\u0007\u001a\u0013\u00108\u001a\u000207*\u000204H\u0007¢\u0006\u0004\b8\u00109\u001a\u0014\u0010;\u001a\u00020\"*\u00020\u001f2\u0006\u0010:\u001a\u00020+H\u0007\u001a!\u0010?\u001a\u00020\u0019*\u00020\u00192\u0006\u0010<\u001a\u00020\"H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a!\u0010A\u001a\u00020\u0019*\u00020\u00192\u0006\u0010<\u001a\u00020\"H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010>\u001a-\u0010F\u001a\u00020\u0019*\u00020\u00192\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0BH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010E\"\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020\b0G8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00000G8\u0006¢\u0006\f\n\u0004\bL\u0010I\u001a\u0004\bM\u0010K\"\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00040G8\u0006¢\u0006\f\n\u0004\bN\u0010I\u001a\u0004\bO\u0010K\"\u0015\u0010R\u001a\u00020\b*\u00020\u00138G¢\u0006\u0006\u001a\u0004\bP\u0010Q\"\u0015\u0010U\u001a\u00020\u0000*\u00020\u00138G¢\u0006\u0006\u001a\u0004\bS\u0010T\"\u0015\u0010X\u001a\u00020\u0004*\u00020\u00138G¢\u0006\u0006\u001a\u0004\bV\u0010W\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006Y"}, m28432d2 = {"Lcom/stripe/android/uicore/StripeShapes;", "Lcom/stripe/android/uicore/StripeComposeShapes;", "toComposeShapes", "(Lcom/stripe/android/uicore/StripeShapes;LEt0;I)Lcom/stripe/android/uicore/StripeComposeShapes;", "Lcom/stripe/android/uicore/StripeTypography;", "LGc6;", "toComposeTypography", "(Lcom/stripe/android/uicore/StripeTypography;LEt0;I)LGc6;", "Lcom/stripe/android/uicore/StripeColors;", "colors", "shapes", "typography", "Lkotlin/Function0;", "", "content", "StripeTheme", "(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Lkotlin/jvm/functions/Function2;LEt0;II)V", "DefaultStripeTheme", "(Lkotlin/jvm/functions/Function2;LEt0;I)V", "LTM2;", "", "isSelected", "Lk61;", "getBorderStrokeWidth", "(LTM2;ZLEt0;I)F", "Lpm0;", "getBorderStrokeColor", "(LTM2;ZLEt0;I)J", "LeZ;", "getBorderStroke", "(LTM2;ZLEt0;I)LeZ;", "Landroid/content/Context;", "isSystemDarkTheme", "dp", "", "convertDpToPx-3ABfNKs", "(Landroid/content/Context;F)F", "convertDpToPx", "", Entry.TYPE_TEXT, CoreConstants.CONTEXT_SCOPE_VALUE, "fontSizeDp", "color", "", "fontFamily", "Landroid/text/SpannableString;", "createTextSpanFromTextStyle-qhTmNto", "(Ljava/lang/String;Landroid/content/Context;FJLjava/lang/Integer;)Landroid/text/SpannableString;", "createTextSpanFromTextStyle", "shouldUseDarkDynamicColor-8_81llA", "(J)Z", "shouldUseDarkDynamicColor", "Lcom/stripe/android/uicore/PrimaryButtonStyle;", "getBackgroundColor", "getOnBackgroundColor", "LG26;", "getComposeTextStyle", "(Lcom/stripe/android/uicore/PrimaryButtonStyle;LEt0;I)LG26;", "resource", "getRawValueFromDimenResource", "amount", "lighten-DxMtmZc", "(JF)J", "lighten", "darken-DxMtmZc", "darken", "Lkotlin/Function1;", "transform", "modifyBrightness-DxMtmZc", "(JLkotlin/jvm/functions/Function1;)J", "modifyBrightness", "LU94;", "LocalColors", "LU94;", "getLocalColors", "()LU94;", "LocalShapes", "getLocalShapes", "LocalTypography", "getLocalTypography", "getStripeColors", "(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;", "stripeColors", "getStripeShapes", "(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeShapes;", "stripeShapes", "getStripeTypography", "(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeTypography;", "stripeTypography", "stripe-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStripeTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeTheme.kt\ncom/stripe/android/uicore/StripeThemeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,548:1\n174#2:549\n174#2:550\n174#2:551\n174#2:552\n174#2:572\n1#3:553\n141#4,2:554\n141#4,2:556\n141#4,2:558\n141#4,2:560\n141#4,2:562\n141#4,2:564\n141#4,2:566\n76#5:568\n76#5:569\n76#5:570\n76#5:571\n*S KotlinDebug\n*F\n+ 1 StripeTheme.kt\ncom/stripe/android/uicore/StripeThemeKt\n*L\n212#1:549\n213#1:550\n215#1:551\n216#1:552\n382#1:572\n230#1:554,2\n238#1:556,2\n247#1:558,2\n256#1:560,2\n264#1:562,2\n273#1:564,2\n281#1:566,2\n318#1:568\n365#1:569\n370#1:570\n376#1:571\n*E\n"})
/* loaded from: classes7.dex */
public final class StripeThemeKt {
    private static final U94<StripeColors> LocalColors = C41806gu0.m37350d(StripeThemeKt$LocalColors$1.INSTANCE);
    private static final U94<StripeShapes> LocalShapes = C41806gu0.m37350d(StripeThemeKt$LocalShapes$1.INSTANCE);
    private static final U94<StripeTypography> LocalTypography = C41806gu0.m37350d(StripeThemeKt$LocalTypography$1.INSTANCE);

    public static final void DefaultStripeTheme(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-237224793);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(content)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-237224793, i2, -1, "com.stripe.android.uicore.DefaultStripeTheme (StripeTheme.kt:340)");
            }
            StripeThemeDefaults stripeThemeDefaults = StripeThemeDefaults.INSTANCE;
            StripeColors colors = stripeThemeDefaults.colors(C51020wS0.m6823a(mo89518u, 0));
            StripeShapes shapes = stripeThemeDefaults.getShapes();
            StripeTypography typography = stripeThemeDefaults.getTypography();
            C41806gu0.m37353a(new W94[]{LocalColors.m81907c(colors), LocalShapes.m81907c(shapes), LocalTypography.m81907c(typography)}, C43575jt0.m29791b(mo89518u, 2080792935, true, new StripeThemeKt$DefaultStripeTheme$1(colors, typography, shapes, content, i2)), mo89518u, 56);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new StripeThemeKt$DefaultStripeTheme$2(content, i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b0, code lost:
        if ((r22 & 4) != 0) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StripeTheme(StripeColors stripeColors, StripeShapes stripeShapes, StripeTypography stripeTypography, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        StripeColors stripeColors2;
        int i3;
        StripeShapes stripeShapes2;
        StripeTypography stripeTypography2;
        int i4;
        Boolean m116783constructorimpl;
        boolean z;
        StripeColors stripeColors3;
        StripeShapes stripeShapes3;
        StripeTypography stripeTypography3;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1508960192);
        if ((i & 14) == 0) {
            if ((i2 & 1) == 0) {
                stripeColors2 = stripeColors;
                if (mo89518u.mo89539n(stripeColors2)) {
                    i7 = 4;
                    i3 = i7 | i;
                }
            } else {
                stripeColors2 = stripeColors;
            }
            i7 = 2;
            i3 = i7 | i;
        } else {
            stripeColors2 = stripeColors;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                stripeShapes2 = stripeShapes;
                if (mo89518u.mo89539n(stripeShapes2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                stripeShapes2 = stripeShapes;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            stripeShapes2 = stripeShapes;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                stripeTypography2 = stripeTypography;
                if (mo89518u.mo89539n(stripeTypography2)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                stripeTypography2 = stripeTypography;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            stripeTypography2 = stripeTypography;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (mo89518u.mo89539n(content)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 5851) == 1170 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            stripeColors3 = stripeColors2;
            stripeShapes3 = stripeShapes2;
            stripeTypography3 = stripeTypography2;
        } else {
            mo89518u.mo89626J();
            if ((i & 1) != 0 && !mo89518u.mo89545l()) {
                mo89518u.mo89548k();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            } else {
                if ((i2 & 1) != 0) {
                    stripeColors2 = StripeTheme.INSTANCE.getColors(C51020wS0.m6823a(mo89518u, 0));
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    stripeShapes2 = StripeTheme.INSTANCE.getShapesMutable();
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    stripeTypography2 = StripeTheme.INSTANCE.getTypographyMutable();
                    i3 &= -897;
                }
                StripeColors stripeColors4 = stripeColors2;
                StripeShapes stripeShapes4 = stripeShapes2;
                StripeTypography stripeTypography4 = stripeTypography2;
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(1508960192, i3, -1, "com.stripe.android.uicore.StripeTheme (StripeTheme.kt:307)");
                }
                try {
                    Result.Companion companion = Result.Companion;
                    String FINGERPRINT = Build.FINGERPRINT;
                    Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                    String lowerCase = FINGERPRINT.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    m116783constructorimpl = Result.m116783constructorimpl(Boolean.valueOf(Intrinsics.areEqual(lowerCase, "robolectric")));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                }
                Boolean bool = Boolean.FALSE;
                if (Result.m116789isFailureimpl(m116783constructorimpl)) {
                    m116783constructorimpl = bool;
                }
                boolean booleanValue = ((Boolean) m116783constructorimpl).booleanValue();
                if (!((Boolean) mo89518u.mo89572c(T32.m84395a())).booleanValue() && !booleanValue) {
                    z = false;
                } else {
                    z = true;
                }
                C41806gu0.m37353a(new W94[]{LocalColors.m81907c(stripeColors4), LocalShapes.m81907c(stripeShapes4), LocalTypography.m81907c(stripeTypography4), T32.m84395a().m81907c(Boolean.valueOf(z))}, C43575jt0.m29791b(mo89518u, -289952640, true, new StripeThemeKt$StripeTheme$1(stripeColors4, stripeTypography4, i3, stripeShapes4, content)), mo89518u, 56);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                stripeColors3 = stripeColors4;
                stripeShapes3 = stripeShapes4;
                stripeTypography3 = stripeTypography4;
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new StripeThemeKt$StripeTheme$2(stripeColors3, stripeShapes3, stripeTypography3, content, i, i2));
        }
    }

    /* renamed from: convertDpToPx-3ABfNKs  reason: not valid java name */
    public static final float m116708convertDpToPx3ABfNKs(Context convertDpToPx, float f) {
        Intrinsics.checkNotNullParameter(convertDpToPx, "$this$convertDpToPx");
        return f * convertDpToPx.getResources().getDisplayMetrics().density;
    }

    /* renamed from: createTextSpanFromTextStyle-qhTmNto  reason: not valid java name */
    public static final SpannableString m116709createTextSpanFromTextStyleqhTmNto(String str, Context context, float f, long j, Integer num) {
        Typeface typeface;
        Intrinsics.checkNotNullParameter(context, "context");
        if (str == null) {
            str = "";
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new AbsoluteSizeSpan((int) m116708convertDpToPx3ABfNKs(context, f)), 0, spannableString.length(), 0);
        spannableString.setSpan(new ForegroundColorSpan(C50619vm0.m8173h(j)), 0, spannableString.length(), 0);
        if (num != null) {
            typeface = C49785uM4.m10395h(context, num.intValue());
        } else {
            typeface = Typeface.DEFAULT;
        }
        if (typeface != null) {
            spannableString.setSpan(new CustomTypefaceSpan(typeface), 0, spannableString.length(), 0);
        }
        return spannableString;
    }

    /* renamed from: darken-DxMtmZc  reason: not valid java name */
    public static final long m116710darkenDxMtmZc(long j, float f) {
        return m116712modifyBrightnessDxMtmZc(j, new StripeThemeKt$darken$1(f));
    }

    public static final int getBackgroundColor(PrimaryButtonStyle primaryButtonStyle, Context context) {
        PrimaryButtonColors colorsLight;
        Intrinsics.checkNotNullParameter(primaryButtonStyle, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (isSystemDarkTheme(context)) {
            colorsLight = primaryButtonStyle.getColorsDark();
        } else {
            colorsLight = primaryButtonStyle.getColorsLight();
        }
        return C50619vm0.m8173h(colorsLight.m116677getBackground0d7_KjU());
    }

    public static final C20064eZ getBorderStroke(TM2 tm2, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(tm2, "<this>");
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(983266912, i, -1, "com.stripe.android.uicore.getBorderStroke (StripeTheme.kt:392)");
        }
        int i2 = TM2.f35373b;
        int i3 = i & 14;
        int i4 = i & 112;
        C20064eZ m41178a = C20466fZ.m41178a(getBorderStrokeWidth(tm2, z, interfaceC32720Et0, i2 | i3 | i4), getBorderStrokeColor(tm2, z, interfaceC32720Et0, i4 | i2 | i3));
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        return m41178a;
    }

    public static final long getBorderStrokeColor(TM2 tm2, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        long m116696getComponentBorder0d7_KjU;
        Intrinsics.checkNotNullParameter(tm2, "<this>");
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-782836080, i, -1, "com.stripe.android.uicore.getBorderStrokeColor (StripeTheme.kt:386)");
        }
        if (z) {
            interfaceC32720Et0.mo89638F(-126998177);
            m116696getComponentBorder0d7_KjU = getStripeColors(tm2, interfaceC32720Et0, TM2.f35373b | (i & 14)).getMaterialColors().m94900j();
        } else {
            interfaceC32720Et0.mo89638F(-126998151);
            m116696getComponentBorder0d7_KjU = getStripeColors(tm2, interfaceC32720Et0, TM2.f35373b | (i & 14)).m116696getComponentBorder0d7_KjU();
        }
        interfaceC32720Et0.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        return m116696getComponentBorder0d7_KjU;
    }

    public static final float getBorderStrokeWidth(TM2 tm2, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        float borderStrokeWidth;
        Intrinsics.checkNotNullParameter(tm2, "<this>");
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(522405058, i, -1, "com.stripe.android.uicore.getBorderStrokeWidth (StripeTheme.kt:380)");
        }
        if (z) {
            interfaceC32720Et0.mo89638F(439809655);
            borderStrokeWidth = getStripeShapes(tm2, interfaceC32720Et0, TM2.f35373b | (i & 14)).getBorderStrokeWidthSelected();
        } else {
            interfaceC32720Et0.mo89638F(439809694);
            borderStrokeWidth = getStripeShapes(tm2, interfaceC32720Et0, TM2.f35373b | (i & 14)).getBorderStrokeWidth();
        }
        float m29303g = C43705k61.m29303g(borderStrokeWidth);
        interfaceC32720Et0.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        return m29303g;
    }

    public static final G26 getComposeTextStyle(PrimaryButtonStyle primaryButtonStyle, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PrimaryButtonColors colorsLight;
        G26 m105921d;
        Intrinsics.checkNotNullParameter(primaryButtonStyle, "<this>");
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-2057860207, i, -1, "com.stripe.android.uicore.getComposeTextStyle (StripeTheme.kt:508)");
        }
        G26 m104959i = TM2.f35372a.m83729c(interfaceC32720Et0, TM2.f35373b).m104959i();
        if (C51020wS0.m6823a(interfaceC32720Et0, 0)) {
            colorsLight = primaryButtonStyle.getColorsDark();
        } else {
            colorsLight = primaryButtonStyle.getColorsLight();
        }
        m105921d = m104959i.m105921d((r42 & 1) != 0 ? m104959i.f10827a.m105168g() : colorsLight.m116679getOnBackground0d7_KjU(), (r42 & 2) != 0 ? m104959i.f10827a.m105164k() : primaryButtonStyle.getTypography().m116683getFontSizeXSAIIZE(), (r42 & 4) != 0 ? m104959i.f10827a.m105161n() : null, (r42 & 8) != 0 ? m104959i.f10827a.m105163l() : null, (r42 & 16) != 0 ? m104959i.f10827a.m105162m() : null, (r42 & 32) != 0 ? m104959i.f10827a.m105166i() : null, (r42 & 64) != 0 ? m104959i.f10827a.m105165j() : null, (r42 & 128) != 0 ? m104959i.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? m104959i.f10827a.m105170e() : null, (r42 & 512) != 0 ? m104959i.f10827a.m105154u() : null, (r42 & 1024) != 0 ? m104959i.f10827a.m105159p() : null, (r42 & 2048) != 0 ? m104959i.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? m104959i.f10827a.m105156s() : null, (r42 & 8192) != 0 ? m104959i.f10827a.m105157r() : null, (r42 & 16384) != 0 ? m104959i.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? m104959i.f10828b.m110650l() : null, (r42 & 65536) != 0 ? m104959i.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? m104959i.f10828b.m110649m() : null);
        if (primaryButtonStyle.getTypography().getFontFamily() != null) {
            m105921d = m105921d.m105921d((r42 & 1) != 0 ? m105921d.f10827a.m105168g() : 0L, (r42 & 2) != 0 ? m105921d.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? m105921d.f10827a.m105161n() : null, (r42 & 8) != 0 ? m105921d.f10827a.m105163l() : null, (r42 & 16) != 0 ? m105921d.f10827a.m105162m() : null, (r42 & 32) != 0 ? m105921d.f10827a.m105166i() : C44792lw1.m26659b(C47757qw1.m16775b(primaryButtonStyle.getTypography().getFontFamily().intValue(), null, 0, 0, 14, null)), (r42 & 64) != 0 ? m105921d.f10827a.m105165j() : null, (r42 & 128) != 0 ? m105921d.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? m105921d.f10827a.m105170e() : null, (r42 & 512) != 0 ? m105921d.f10827a.m105154u() : null, (r42 & 1024) != 0 ? m105921d.f10827a.m105159p() : null, (r42 & 2048) != 0 ? m105921d.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? m105921d.f10827a.m105156s() : null, (r42 & 8192) != 0 ? m105921d.f10827a.m105157r() : null, (r42 & 16384) != 0 ? m105921d.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? m105921d.f10828b.m110650l() : null, (r42 & 65536) != 0 ? m105921d.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? m105921d.f10828b.m110649m() : null);
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        return m105921d;
    }

    public static final U94<StripeColors> getLocalColors() {
        return LocalColors;
    }

    public static final U94<StripeShapes> getLocalShapes() {
        return LocalShapes;
    }

    public static final U94<StripeTypography> getLocalTypography() {
        return LocalTypography;
    }

    public static final int getOnBackgroundColor(PrimaryButtonStyle primaryButtonStyle, Context context) {
        PrimaryButtonColors colorsLight;
        Intrinsics.checkNotNullParameter(primaryButtonStyle, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (isSystemDarkTheme(context)) {
            colorsLight = primaryButtonStyle.getColorsDark();
        } else {
            colorsLight = primaryButtonStyle.getColorsLight();
        }
        return C50619vm0.m8173h(colorsLight.m116679getOnBackground0d7_KjU());
    }

    public static final float getRawValueFromDimenResource(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getDimension(i) / context.getResources().getDisplayMetrics().density;
    }

    @JvmName(name = "getStripeColors")
    public static final StripeColors getStripeColors(TM2 tm2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(tm2, "<this>");
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1304104896, i, -1, "com.stripe.android.uicore.<get-stripeColors> (StripeTheme.kt:364)");
        }
        StripeColors stripeColors = (StripeColors) interfaceC32720Et0.mo89572c(LocalColors);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        return stripeColors;
    }

    @JvmName(name = "getStripeShapes")
    public static final StripeShapes getStripeShapes(TM2 tm2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(tm2, "<this>");
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1758187266, i, -1, "com.stripe.android.uicore.<get-stripeShapes> (StripeTheme.kt:369)");
        }
        StripeShapes stripeShapes = (StripeShapes) interfaceC32720Et0.mo89572c(LocalShapes);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        return stripeShapes;
    }

    @JvmName(name = "getStripeTypography")
    public static final StripeTypography getStripeTypography(TM2 tm2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(tm2, "<this>");
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-589352801, i, -1, "com.stripe.android.uicore.<get-stripeTypography> (StripeTheme.kt:375)");
        }
        StripeTypography stripeTypography = (StripeTypography) interfaceC32720Et0.mo89572c(LocalTypography);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        return stripeTypography;
    }

    public static final boolean isSystemDarkTheme(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    /* renamed from: lighten-DxMtmZc  reason: not valid java name */
    public static final long m116711lightenDxMtmZc(long j, float f) {
        return m116712modifyBrightnessDxMtmZc(j, new StripeThemeKt$lighten$1(f));
    }

    /* renamed from: modifyBrightness-DxMtmZc  reason: not valid java name */
    private static final long m116712modifyBrightnessDxMtmZc(long j, Function1<? super Float, Float> function1) {
        float[] fArr = new float[3];
        C33827Jm0.m99853h(C50619vm0.m8173h(j), fArr);
        return C47063pm0.C27386a.m18723j(C47063pm0.f104050b, fArr[0], fArr[1], function1.invoke(Float.valueOf(fArr[2])).floatValue(), 0.0f, null, 24, null);
    }

    /* renamed from: shouldUseDarkDynamicColor-8_81llA  reason: not valid java name */
    public static final boolean m116713shouldUseDarkDynamicColor8_81llA(long j) {
        int m8173h = C50619vm0.m8173h(j);
        C47063pm0.C27386a c27386a = C47063pm0.f104050b;
        double m99856e = C33827Jm0.m99856e(m8173h, C50619vm0.m8173h(c27386a.m18732a()));
        double m99856e2 = C33827Jm0.m99856e(C50619vm0.m8173h(j), C50619vm0.m8173h(c27386a.m18725h()));
        if (m99856e2 > 2.2d || m99856e <= m99856e2) {
            return false;
        }
        return true;
    }

    public static final StripeComposeShapes toComposeShapes(StripeShapes stripeShapes, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(stripeShapes, "<this>");
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-530823679, i, -1, "com.stripe.android.uicore.toComposeShapes (StripeTheme.kt:209)");
        }
        StripeComposeShapes stripeComposeShapes = new StripeComposeShapes(C43705k61.m29303g(stripeShapes.getBorderStrokeWidth()), C43705k61.m29303g(stripeShapes.getBorderStrokeWidthSelected()), C32536Dy5.m109567b(TM2.f35372a.m83730b(interfaceC32720Et0, TM2.f35373b), C39242cc5.m61172d(C43705k61.m29303g(stripeShapes.getCornerRadius())), C39242cc5.m61172d(C43705k61.m29303g(stripeShapes.getCornerRadius())), null, 4, null), null);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        return stripeComposeShapes;
    }

    public static final C33041Gc6 toComposeTypography(StripeTypography stripeTypography, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        AbstractC44199kw1 abstractC44199kw1;
        G26 m105921d;
        AbstractC44199kw1 abstractC44199kw12;
        G26 m105921d2;
        AbstractC44199kw1 abstractC44199kw13;
        G26 m105921d3;
        AbstractC44199kw1 abstractC44199kw14;
        G26 m105921d4;
        AbstractC44199kw1 abstractC44199kw15;
        G26 m105921d5;
        AbstractC44199kw1 abstractC44199kw16;
        G26 m105921d6;
        G26 m105921d7;
        Intrinsics.checkNotNullParameter(stripeTypography, "<this>");
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1580579333, i, -1, "com.stripe.android.uicore.toComposeTypography (StripeTheme.kt:223)");
        }
        Integer fontFamily = stripeTypography.getFontFamily();
        AbstractC44199kw1 m26659b = fontFamily != null ? C44792lw1.m26659b(C47757qw1.m16775b(fontFamily.intValue(), null, 0, 0, 14, null)) : null;
        G26.C2620a c2620a = G26.f10825d;
        G26 m105898a = c2620a.m105898a();
        if (m26659b == null) {
            AbstractC44199kw1 h4FontFamily = stripeTypography.getH4FontFamily();
            if (h4FontFamily == null) {
                h4FontFamily = AbstractC44199kw1.f95230c.m28152a();
            }
            abstractC44199kw1 = h4FontFamily;
        } else {
            abstractC44199kw1 = m26659b;
        }
        long m116725getXLargeFontSizeXSAIIZE = stripeTypography.m116725getXLargeFontSizeXSAIIZE();
        float fontSizeMultiplier = stripeTypography.getFontSizeMultiplier();
        N26.m94418b(m116725getXLargeFontSizeXSAIIZE);
        m105921d = m105898a.m105921d((r42 & 1) != 0 ? m105898a.f10827a.m105168g() : 0L, (r42 & 2) != 0 ? m105898a.f10827a.m105164k() : N26.m94411i(M26.m95974f(m116725getXLargeFontSizeXSAIIZE), M26.m95972h(m116725getXLargeFontSizeXSAIIZE) * fontSizeMultiplier), (r42 & 4) != 0 ? m105898a.f10827a.m105161n() : new C33918Jw1(stripeTypography.getFontWeightBold()), (r42 & 8) != 0 ? m105898a.f10827a.m105163l() : null, (r42 & 16) != 0 ? m105898a.f10827a.m105162m() : null, (r42 & 32) != 0 ? m105898a.f10827a.m105166i() : abstractC44199kw1, (r42 & 64) != 0 ? m105898a.f10827a.m105165j() : null, (r42 & 128) != 0 ? m105898a.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? m105898a.f10827a.m105170e() : null, (r42 & 512) != 0 ? m105898a.f10827a.m105154u() : null, (r42 & 1024) != 0 ? m105898a.f10827a.m105159p() : null, (r42 & 2048) != 0 ? m105898a.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? m105898a.f10827a.m105156s() : null, (r42 & 8192) != 0 ? m105898a.f10827a.m105157r() : null, (r42 & 16384) != 0 ? m105898a.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? m105898a.f10828b.m110650l() : null, (r42 & 65536) != 0 ? m105898a.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? m105898a.f10828b.m110649m() : null);
        G26 m105898a2 = c2620a.m105898a();
        if (m26659b == null) {
            AbstractC44199kw1 h5FontFamily = stripeTypography.getH5FontFamily();
            if (h5FontFamily == null) {
                h5FontFamily = AbstractC44199kw1.f95230c.m28152a();
            }
            abstractC44199kw12 = h5FontFamily;
        } else {
            abstractC44199kw12 = m26659b;
        }
        long m116722getLargeFontSizeXSAIIZE = stripeTypography.m116722getLargeFontSizeXSAIIZE();
        float fontSizeMultiplier2 = stripeTypography.getFontSizeMultiplier();
        N26.m94418b(m116722getLargeFontSizeXSAIIZE);
        m105921d2 = m105898a2.m105921d((r42 & 1) != 0 ? m105898a2.f10827a.m105168g() : 0L, (r42 & 2) != 0 ? m105898a2.f10827a.m105164k() : N26.m94411i(M26.m95974f(m116722getLargeFontSizeXSAIIZE), M26.m95972h(m116722getLargeFontSizeXSAIIZE) * fontSizeMultiplier2), (r42 & 4) != 0 ? m105898a2.f10827a.m105161n() : new C33918Jw1(stripeTypography.getFontWeightMedium()), (r42 & 8) != 0 ? m105898a2.f10827a.m105163l() : null, (r42 & 16) != 0 ? m105898a2.f10827a.m105162m() : null, (r42 & 32) != 0 ? m105898a2.f10827a.m105166i() : abstractC44199kw12, (r42 & 64) != 0 ? m105898a2.f10827a.m105165j() : null, (r42 & 128) != 0 ? m105898a2.f10827a.m105160o() : N26.m94416d(-0.32d), (r42 & 256) != 0 ? m105898a2.f10827a.m105170e() : null, (r42 & 512) != 0 ? m105898a2.f10827a.m105154u() : null, (r42 & 1024) != 0 ? m105898a2.f10827a.m105159p() : null, (r42 & 2048) != 0 ? m105898a2.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? m105898a2.f10827a.m105156s() : null, (r42 & 8192) != 0 ? m105898a2.f10827a.m105157r() : null, (r42 & 16384) != 0 ? m105898a2.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? m105898a2.f10828b.m110650l() : null, (r42 & 65536) != 0 ? m105898a2.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? m105898a2.f10828b.m110649m() : null);
        G26 m105898a3 = c2620a.m105898a();
        if (m26659b == null) {
            AbstractC44199kw1 h6FontFamily = stripeTypography.getH6FontFamily();
            if (h6FontFamily == null) {
                h6FontFamily = AbstractC44199kw1.f95230c.m28152a();
            }
            abstractC44199kw13 = h6FontFamily;
        } else {
            abstractC44199kw13 = m26659b;
        }
        long m116724getSmallFontSizeXSAIIZE = stripeTypography.m116724getSmallFontSizeXSAIIZE();
        float fontSizeMultiplier3 = stripeTypography.getFontSizeMultiplier();
        N26.m94418b(m116724getSmallFontSizeXSAIIZE);
        m105921d3 = m105898a3.m105921d((r42 & 1) != 0 ? m105898a3.f10827a.m105168g() : 0L, (r42 & 2) != 0 ? m105898a3.f10827a.m105164k() : N26.m94411i(M26.m95974f(m116724getSmallFontSizeXSAIIZE), M26.m95972h(m116724getSmallFontSizeXSAIIZE) * fontSizeMultiplier3), (r42 & 4) != 0 ? m105898a3.f10827a.m105161n() : new C33918Jw1(stripeTypography.getFontWeightMedium()), (r42 & 8) != 0 ? m105898a3.f10827a.m105163l() : null, (r42 & 16) != 0 ? m105898a3.f10827a.m105162m() : null, (r42 & 32) != 0 ? m105898a3.f10827a.m105166i() : abstractC44199kw13, (r42 & 64) != 0 ? m105898a3.f10827a.m105165j() : null, (r42 & 128) != 0 ? m105898a3.f10827a.m105160o() : N26.m94416d(-0.15d), (r42 & 256) != 0 ? m105898a3.f10827a.m105170e() : null, (r42 & 512) != 0 ? m105898a3.f10827a.m105154u() : null, (r42 & 1024) != 0 ? m105898a3.f10827a.m105159p() : null, (r42 & 2048) != 0 ? m105898a3.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? m105898a3.f10827a.m105156s() : null, (r42 & 8192) != 0 ? m105898a3.f10827a.m105157r() : null, (r42 & 16384) != 0 ? m105898a3.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? m105898a3.f10828b.m110650l() : null, (r42 & 65536) != 0 ? m105898a3.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? m105898a3.f10828b.m110649m() : null);
        G26 m105898a4 = c2620a.m105898a();
        if (m26659b == null) {
            AbstractC44199kw1 body1FontFamily = stripeTypography.getBody1FontFamily();
            if (body1FontFamily == null) {
                body1FontFamily = AbstractC44199kw1.f95230c.m28152a();
            }
            abstractC44199kw14 = body1FontFamily;
        } else {
            abstractC44199kw14 = m26659b;
        }
        long m116723getMediumFontSizeXSAIIZE = stripeTypography.m116723getMediumFontSizeXSAIIZE();
        float fontSizeMultiplier4 = stripeTypography.getFontSizeMultiplier();
        N26.m94418b(m116723getMediumFontSizeXSAIIZE);
        m105921d4 = m105898a4.m105921d((r42 & 1) != 0 ? m105898a4.f10827a.m105168g() : 0L, (r42 & 2) != 0 ? m105898a4.f10827a.m105164k() : N26.m94411i(M26.m95974f(m116723getMediumFontSizeXSAIIZE), M26.m95972h(m116723getMediumFontSizeXSAIIZE) * fontSizeMultiplier4), (r42 & 4) != 0 ? m105898a4.f10827a.m105161n() : new C33918Jw1(stripeTypography.getFontWeightNormal()), (r42 & 8) != 0 ? m105898a4.f10827a.m105163l() : null, (r42 & 16) != 0 ? m105898a4.f10827a.m105162m() : null, (r42 & 32) != 0 ? m105898a4.f10827a.m105166i() : abstractC44199kw14, (r42 & 64) != 0 ? m105898a4.f10827a.m105165j() : null, (r42 & 128) != 0 ? m105898a4.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? m105898a4.f10827a.m105170e() : null, (r42 & 512) != 0 ? m105898a4.f10827a.m105154u() : null, (r42 & 1024) != 0 ? m105898a4.f10827a.m105159p() : null, (r42 & 2048) != 0 ? m105898a4.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? m105898a4.f10827a.m105156s() : null, (r42 & 8192) != 0 ? m105898a4.f10827a.m105157r() : null, (r42 & 16384) != 0 ? m105898a4.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? m105898a4.f10828b.m110650l() : null, (r42 & 65536) != 0 ? m105898a4.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? m105898a4.f10828b.m110649m() : null);
        G26 m105898a5 = c2620a.m105898a();
        if (m26659b == null) {
            AbstractC44199kw1 subtitle1FontFamily = stripeTypography.getSubtitle1FontFamily();
            if (subtitle1FontFamily == null) {
                subtitle1FontFamily = AbstractC44199kw1.f95230c.m28152a();
            }
            abstractC44199kw15 = subtitle1FontFamily;
        } else {
            abstractC44199kw15 = m26659b;
        }
        long m116723getMediumFontSizeXSAIIZE2 = stripeTypography.m116723getMediumFontSizeXSAIIZE();
        float fontSizeMultiplier5 = stripeTypography.getFontSizeMultiplier();
        N26.m94418b(m116723getMediumFontSizeXSAIIZE2);
        m105921d5 = m105898a5.m105921d((r42 & 1) != 0 ? m105898a5.f10827a.m105168g() : 0L, (r42 & 2) != 0 ? m105898a5.f10827a.m105164k() : N26.m94411i(M26.m95974f(m116723getMediumFontSizeXSAIIZE2), M26.m95972h(m116723getMediumFontSizeXSAIIZE2) * fontSizeMultiplier5), (r42 & 4) != 0 ? m105898a5.f10827a.m105161n() : new C33918Jw1(stripeTypography.getFontWeightNormal()), (r42 & 8) != 0 ? m105898a5.f10827a.m105163l() : null, (r42 & 16) != 0 ? m105898a5.f10827a.m105162m() : null, (r42 & 32) != 0 ? m105898a5.f10827a.m105166i() : abstractC44199kw15, (r42 & 64) != 0 ? m105898a5.f10827a.m105165j() : null, (r42 & 128) != 0 ? m105898a5.f10827a.m105160o() : N26.m94416d(-0.15d), (r42 & 256) != 0 ? m105898a5.f10827a.m105170e() : null, (r42 & 512) != 0 ? m105898a5.f10827a.m105154u() : null, (r42 & 1024) != 0 ? m105898a5.f10827a.m105159p() : null, (r42 & 2048) != 0 ? m105898a5.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? m105898a5.f10827a.m105156s() : null, (r42 & 8192) != 0 ? m105898a5.f10827a.m105157r() : null, (r42 & 16384) != 0 ? m105898a5.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? m105898a5.f10828b.m110650l() : null, (r42 & 65536) != 0 ? m105898a5.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? m105898a5.f10828b.m110649m() : null);
        G26 m105898a6 = c2620a.m105898a();
        if (m26659b == null) {
            AbstractC44199kw1 captionFontFamily = stripeTypography.getCaptionFontFamily();
            if (captionFontFamily == null) {
                captionFontFamily = AbstractC44199kw1.f95230c.m28152a();
            }
            abstractC44199kw16 = captionFontFamily;
        } else {
            abstractC44199kw16 = m26659b;
        }
        long m116726getXSmallFontSizeXSAIIZE = stripeTypography.m116726getXSmallFontSizeXSAIIZE();
        float fontSizeMultiplier6 = stripeTypography.getFontSizeMultiplier();
        N26.m94418b(m116726getXSmallFontSizeXSAIIZE);
        m105921d6 = m105898a6.m105921d((r42 & 1) != 0 ? m105898a6.f10827a.m105168g() : 0L, (r42 & 2) != 0 ? m105898a6.f10827a.m105164k() : N26.m94411i(M26.m95974f(m116726getXSmallFontSizeXSAIIZE), M26.m95972h(m116726getXSmallFontSizeXSAIIZE) * fontSizeMultiplier6), (r42 & 4) != 0 ? m105898a6.f10827a.m105161n() : new C33918Jw1(stripeTypography.getFontWeightMedium()), (r42 & 8) != 0 ? m105898a6.f10827a.m105163l() : null, (r42 & 16) != 0 ? m105898a6.f10827a.m105162m() : null, (r42 & 32) != 0 ? m105898a6.f10827a.m105166i() : abstractC44199kw16, (r42 & 64) != 0 ? m105898a6.f10827a.m105165j() : null, (r42 & 128) != 0 ? m105898a6.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? m105898a6.f10827a.m105170e() : null, (r42 & 512) != 0 ? m105898a6.f10827a.m105154u() : null, (r42 & 1024) != 0 ? m105898a6.f10827a.m105159p() : null, (r42 & 2048) != 0 ? m105898a6.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? m105898a6.f10827a.m105156s() : null, (r42 & 8192) != 0 ? m105898a6.f10827a.m105157r() : null, (r42 & 16384) != 0 ? m105898a6.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? m105898a6.f10828b.m110650l() : null, (r42 & 65536) != 0 ? m105898a6.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? m105898a6.f10828b.m110649m() : null);
        G26 m105898a7 = c2620a.m105898a();
        if (m26659b == null && (m26659b = stripeTypography.getBody2FontFamily()) == null) {
            m26659b = AbstractC44199kw1.f95230c.m28152a();
        }
        AbstractC44199kw1 abstractC44199kw17 = m26659b;
        long m116727getXxSmallFontSizeXSAIIZE = stripeTypography.m116727getXxSmallFontSizeXSAIIZE();
        float fontSizeMultiplier7 = stripeTypography.getFontSizeMultiplier();
        N26.m94418b(m116727getXxSmallFontSizeXSAIIZE);
        m105921d7 = m105898a7.m105921d((r42 & 1) != 0 ? m105898a7.f10827a.m105168g() : 0L, (r42 & 2) != 0 ? m105898a7.f10827a.m105164k() : N26.m94411i(M26.m95974f(m116727getXxSmallFontSizeXSAIIZE), M26.m95972h(m116727getXxSmallFontSizeXSAIIZE) * fontSizeMultiplier7), (r42 & 4) != 0 ? m105898a7.f10827a.m105161n() : new C33918Jw1(stripeTypography.getFontWeightNormal()), (r42 & 8) != 0 ? m105898a7.f10827a.m105163l() : null, (r42 & 16) != 0 ? m105898a7.f10827a.m105162m() : null, (r42 & 32) != 0 ? m105898a7.f10827a.m105166i() : abstractC44199kw17, (r42 & 64) != 0 ? m105898a7.f10827a.m105165j() : null, (r42 & 128) != 0 ? m105898a7.f10827a.m105160o() : N26.m94416d(-0.15d), (r42 & 256) != 0 ? m105898a7.f10827a.m105170e() : null, (r42 & 512) != 0 ? m105898a7.f10827a.m105154u() : null, (r42 & 1024) != 0 ? m105898a7.f10827a.m105159p() : null, (r42 & 2048) != 0 ? m105898a7.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? m105898a7.f10827a.m105156s() : null, (r42 & 8192) != 0 ? m105898a7.f10827a.m105157r() : null, (r42 & 16384) != 0 ? m105898a7.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? m105898a7.f10828b.m110650l() : null, (r42 & 65536) != 0 ? m105898a7.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? m105898a7.f10828b.m110649m() : null);
        C33041Gc6 m104966b = C33041Gc6.m104966b(TM2.f35372a.m83729c(interfaceC32720Et0, TM2.f35373b), null, null, null, m105921d, m105921d2, m105921d3, m105921d5, null, m105921d4, m105921d7, null, m105921d6, null, 5255, null);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        return m104966b;
    }

    public static final int getBorderStrokeColor(PrimaryButtonStyle primaryButtonStyle, Context context) {
        Intrinsics.checkNotNullParameter(primaryButtonStyle, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return C50619vm0.m8173h((isSystemDarkTheme(context) ? primaryButtonStyle.getColorsDark() : primaryButtonStyle.getColorsLight()).m116678getBorder0d7_KjU());
    }
}
