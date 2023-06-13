package com.stripe.android.uicore.text;

import android.content.Context;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.p003ui.platform.C11411h;
import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.uicore.image.StripeImageLoader;
import com.stripe.android.uicore.image.UiUtilsKt;
import com.stripe.android.uicore.text.EmbeddableImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import net.danlew.android.joda.DateUtils;
import p000.C1577Df;
import p000.InterfaceC32720Et0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u0080\u0001\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a=\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\b\u001aa\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00000\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u007f\u0010)\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\u001a7\u0010,\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u00012\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u00002\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b,\u0010-\u001a\u0095\u0001\u00109\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0014\b\u0002\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00002\b\b\u0002\u0010/\u001a\u00020\"2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\u0014\b\u0002\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0015042\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001504H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108\"\u0014\u0010:\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010;\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006<"}, m28432d2 = {"", "", "Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;", "drawableImageLoader", "LXU3;", "imageAlign", "LL22;", "rememberDrawableImages-0fZqiVQ", "(Ljava/util/Map;ILEt0;I)Ljava/util/Map;", "rememberDrawableImages", "Lcom/stripe/android/uicore/text/EmbeddableImage$Bitmap;", "bitmapImageLoader", "rememberBitmapImages-0fZqiVQ", "rememberBitmapImages", "LDf;", "annotatedText", "Lcom/stripe/android/uicore/text/EmbeddableImage;", "imageLoader", "Lcom/stripe/android/uicore/image/StripeImageLoader;", "stripeImageLoader", "Lkotlin/Function0;", "", "onLoaded", "LsP5;", "rememberRemoteImages-XiPi2c8", "(LDf;Ljava/util/Map;Lcom/stripe/android/uicore/image/StripeImageLoader;ILkotlin/jvm/functions/Function0;LEt0;I)LsP5;", "rememberRemoteImages", "html", "LgV2;", "modifier", "Lpm0;", "color", "LG26;", "style", "", "enabled", "LGN5;", "urlSpanStyle", "onClick", "Html-m4MizFo", "(Ljava/lang/String;LgV2;Ljava/util/Map;JLG26;ZLGN5;ILkotlin/jvm/functions/Function0;LEt0;II)V", "Html", Entry.TYPE_TEXT, "imageGetter", "annotatedStringResource", "(Ljava/lang/String;Ljava/util/Map;LGN5;LEt0;II)LDf;", "inlineContent", "softWrap", "Ln26;", "overflow", "", "maxLines", "Lkotlin/Function1;", "Li26;", "onTextLayout", "ClickableText-mZk19tU", "(LDf;JLG26;LgV2;Ljava/util/Map;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LEt0;II)V", "ClickableText", "LINK_TAG", "Ljava/lang/String;", "stripe-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHtml.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Html.kt\ncom/stripe/android/uicore/text/HtmlKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 8 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 9 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,433:1\n1179#2,2:434\n1253#2,2:436\n1256#2:440\n1179#2,2:441\n1253#2,2:443\n1256#2:446\n766#2:447\n857#2,2:448\n141#3,2:438\n76#4:445\n76#4:456\n76#4:457\n76#4:458\n1057#5,6:450\n1057#5,6:460\n1057#5,6:467\n1057#5,6:488\n1057#5,6:494\n1057#5,3:500\n1060#5,3:506\n1057#5,6:509\n1057#5,6:515\n1057#5,6:523\n25#6:459\n25#6:466\n36#6:487\n50#6:521\n49#6:522\n483#7,7:473\n483#7,7:480\n916#8:503\n13579#9,2:504\n*S KotlinDebug\n*F\n+ 1 Html.kt\ncom/stripe/android/uicore/text/HtmlKt\n*L\n82#1:434,2\n82#1:436,2\n82#1:440\n115#1:441,2\n115#1:443,2\n115#1:446\n150#1:447\n150#1:448,2\n86#1:438,2\n116#1:445\n157#1:456\n226#1:457\n232#1:458\n156#1:450,6\n234#1:460,6\n235#1:467,6\n263#1:488,6\n308#1:494,6\n311#1:500,3\n311#1:506,3\n397#1:509,6\n398#1:515,6\n426#1:523,6\n234#1:459\n235#1:466\n263#1:487\n426#1:521\n426#1:522\n244#1:473,7\n252#1:480,7\n312#1:503\n314#1:504,2\n*E\n"})
/* loaded from: classes7.dex */
public final class HtmlKt {
    private static final String LINK_TAG = "URL";

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010e  */
    /* renamed from: ClickableText-mZk19tU  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m116768ClickableTextmZk19tU(C1577Df c1577Df, long j, G26 g26, InterfaceC41563gV2 interfaceC41563gV2, Map<String, L22> map, boolean z, int i, int i2, Function1<? super C42484i26, Unit> function1, Function1<? super Integer, Unit> function12, InterfaceC32720Et0 interfaceC32720Et0, int i3, int i4) {
        int i5;
        int i6;
        Object obj;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Function1<? super C42484i26, Unit> function13;
        Object mo89635G;
        InterfaceC32720Et0.C2012a c2012a;
        boolean mo89539n;
        Object mo89635G2;
        G26 m105921d;
        boolean mo89539n2;
        Object mo89635G3;
        InterfaceC41563gV2 interfaceC41563gV22;
        boolean z2;
        int i13;
        Function1<? super C42484i26, Unit> function14;
        int i14;
        Map<String, L22> map2;
        InterfaceC36874Wm5 mo89512w;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1952998280);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (mo89518u.mo89539n(c1577Df) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= mo89518u.mo89524s(j) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i3 & 896) == 0) {
            i5 |= mo89518u.mo89539n(g26) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i3 & 7168) == 0) {
                obj = interfaceC41563gV2;
                i5 |= mo89518u.mo89539n(obj) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 8192;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= ImageMetadata.EDGE_MODE;
                } else if ((i3 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                    i5 |= mo89518u.mo89536o(z) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    i5 |= mo89518u.mo89527r(i) ? 1048576 : 524288;
                }
                i10 = i4 & 128;
                if (i10 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i5 |= mo89518u.mo89527r(i2) ? 8388608 : 4194304;
                }
                i11 = i4 & 256;
                if (i11 != 0) {
                    i5 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    i5 |= mo89518u.mo89539n(function1) ? 67108864 : 33554432;
                }
                if ((i4 & 512) == 0) {
                    if ((1879048192 & i3) == 0) {
                        i12 = mo89518u.mo89539n(function12) ? 536870912 : 268435456;
                    }
                    if (i7 != 16 && (1533916891 & i5) == 306783378 && mo89518u.mo89575b()) {
                        mo89518u.mo89548k();
                        map2 = map;
                        z2 = z;
                        i13 = i;
                        i14 = i2;
                        interfaceC41563gV22 = obj;
                        function14 = function1;
                    } else {
                        InterfaceC41563gV2 interfaceC41563gV23 = i6 == 0 ? InterfaceC41563gV2.f82354b0 : obj;
                        Map<String, L22> emptyMap = i7 == 0 ? MapsKt__MapsKt.emptyMap() : map;
                        boolean z3 = i8 == 0 ? true : z;
                        int m24540a = i9 == 0 ? C45449n26.f99264a.m24540a() : i;
                        int i15 = i10 == 0 ? Integer.MAX_VALUE : i2;
                        function13 = i11 == 0 ? HtmlKt$ClickableText$1.INSTANCE : function1;
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87816Z(-1952998280, i5, -1, "com.stripe.android.uicore.text.ClickableText (Html.kt:384)");
                        }
                        mo89635G = mo89518u.mo89635G();
                        c2012a = InterfaceC32720Et0.f8257a;
                        if (mo89635G == c2012a.m108267a()) {
                            mo89635G = LM5.m97025e(null, null, 2, null);
                            mo89518u.mo89503z(mo89635G);
                        }
                        EX2 ex2 = (EX2) mo89635G;
                        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                        mo89539n = mo89518u.mo89539n(ex2) | mo89518u.mo89539n(function12);
                        mo89635G2 = mo89518u.mo89635G();
                        if (!mo89539n || mo89635G2 == c2012a.m108267a()) {
                            mo89635G2 = new HtmlKt$ClickableText$pressIndicator$1$1(ex2, function12, null);
                            mo89518u.mo89503z(mo89635G2);
                        }
                        InterfaceC41563gV2 mo39266t0 = interfaceC41563gV23.mo39266t0(C52840zW5.m1270c(c20912a, function12, (Function2) mo89635G2));
                        m105921d = g26.m105921d((r42 & 1) != 0 ? g26.f10827a.m105168g() : j, (r42 & 2) != 0 ? g26.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? g26.f10827a.m105161n() : null, (r42 & 8) != 0 ? g26.f10827a.m105163l() : null, (r42 & 16) != 0 ? g26.f10827a.m105162m() : null, (r42 & 32) != 0 ? g26.f10827a.m105166i() : null, (r42 & 64) != 0 ? g26.f10827a.m105165j() : null, (r42 & 128) != 0 ? g26.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? g26.f10827a.m105170e() : null, (r42 & 512) != 0 ? g26.f10827a.m105154u() : null, (r42 & 1024) != 0 ? g26.f10827a.m105159p() : null, (r42 & 2048) != 0 ? g26.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? g26.f10827a.m105156s() : null, (r42 & 8192) != 0 ? g26.f10827a.m105157r() : null, (r42 & 16384) != 0 ? g26.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? g26.f10828b.m110650l() : null, (r42 & 65536) != 0 ? g26.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? g26.f10828b.m110649m() : null);
                        mo89518u.mo89638F(511388516);
                        mo89539n2 = mo89518u.mo89539n(ex2) | mo89518u.mo89539n(function13);
                        mo89635G3 = mo89518u.mo89635G();
                        if (!mo89539n2 || mo89635G3 == c2012a.m108267a()) {
                            mo89635G3 = new HtmlKt$ClickableText$2$1(ex2, function13);
                            mo89518u.mo89503z(mo89635G3);
                        }
                        mo89518u.mo89605Q();
                        C8222UE.m81805a(c1577Df, mo39266t0, m105921d, (Function1) mo89635G3, m24540a, z3, i15, emptyMap, mo89518u, 16777216 | (i5 & 14) | (57344 & (i5 >> 6)) | (i5 & ImageMetadata.JPEG_GPS_COORDINATES) | ((i5 >> 3) & 3670016), 0);
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87817Y();
                        }
                        interfaceC41563gV22 = interfaceC41563gV23;
                        z2 = z3;
                        i13 = m24540a;
                        function14 = function13;
                        i14 = i15;
                        map2 = emptyMap;
                    }
                    mo89512w = mo89518u.mo89512w();
                    if (mo89512w != null) {
                        return;
                    }
                    mo89512w.mo20405a(new HtmlKt$ClickableText$3(c1577Df, j, g26, interfaceC41563gV22, map2, z2, i13, i14, function14, function12, i3, i4));
                    return;
                }
                i12 = 805306368;
                i5 |= i12;
                if (i7 != 16) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (C35528Qt0.m87827O()) {
                }
                mo89635G = mo89518u.mo89635G();
                c2012a = InterfaceC32720Et0.f8257a;
                if (mo89635G == c2012a.m108267a()) {
                }
                EX2 ex22 = (EX2) mo89635G;
                InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
                mo89539n = mo89518u.mo89539n(ex22) | mo89518u.mo89539n(function12);
                mo89635G2 = mo89518u.mo89635G();
                if (!mo89539n) {
                }
                mo89635G2 = new HtmlKt$ClickableText$pressIndicator$1$1(ex22, function12, null);
                mo89518u.mo89503z(mo89635G2);
                InterfaceC41563gV2 mo39266t02 = interfaceC41563gV23.mo39266t0(C52840zW5.m1270c(c20912a2, function12, (Function2) mo89635G2));
                m105921d = g26.m105921d((r42 & 1) != 0 ? g26.f10827a.m105168g() : j, (r42 & 2) != 0 ? g26.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? g26.f10827a.m105161n() : null, (r42 & 8) != 0 ? g26.f10827a.m105163l() : null, (r42 & 16) != 0 ? g26.f10827a.m105162m() : null, (r42 & 32) != 0 ? g26.f10827a.m105166i() : null, (r42 & 64) != 0 ? g26.f10827a.m105165j() : null, (r42 & 128) != 0 ? g26.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? g26.f10827a.m105170e() : null, (r42 & 512) != 0 ? g26.f10827a.m105154u() : null, (r42 & 1024) != 0 ? g26.f10827a.m105159p() : null, (r42 & 2048) != 0 ? g26.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? g26.f10827a.m105156s() : null, (r42 & 8192) != 0 ? g26.f10827a.m105157r() : null, (r42 & 16384) != 0 ? g26.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? g26.f10828b.m110650l() : null, (r42 & 65536) != 0 ? g26.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? g26.f10828b.m110649m() : null);
                mo89518u.mo89638F(511388516);
                mo89539n2 = mo89518u.mo89539n(ex22) | mo89518u.mo89539n(function13);
                mo89635G3 = mo89518u.mo89635G();
                if (!mo89539n2) {
                }
                mo89635G3 = new HtmlKt$ClickableText$2$1(ex22, function13);
                mo89518u.mo89503z(mo89635G3);
                mo89518u.mo89605Q();
                C8222UE.m81805a(c1577Df, mo39266t02, m105921d, (Function1) mo89635G3, m24540a, z3, i15, emptyMap, mo89518u, 16777216 | (i5 & 14) | (57344 & (i5 >> 6)) | (i5 & ImageMetadata.JPEG_GPS_COORDINATES) | ((i5 >> 3) & 3670016), 0);
                if (C35528Qt0.m87827O()) {
                }
                interfaceC41563gV22 = interfaceC41563gV23;
                z2 = z3;
                i13 = m24540a;
                function14 = function13;
                i14 = i15;
                map2 = emptyMap;
                mo89512w = mo89518u.mo89512w();
                if (mo89512w != null) {
                }
            }
            obj = interfaceC41563gV2;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            i8 = i4 & 32;
            if (i8 != 0) {
            }
            i9 = i4 & 64;
            if (i9 != 0) {
            }
            i10 = i4 & 128;
            if (i10 != 0) {
            }
            i11 = i4 & 256;
            if (i11 != 0) {
            }
            if ((i4 & 512) == 0) {
            }
            i5 |= i12;
            if (i7 != 16) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            mo89635G = mo89518u.mo89635G();
            c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
            }
            EX2 ex222 = (EX2) mo89635G;
            InterfaceC41563gV2.C20912a c20912a22 = InterfaceC41563gV2.f82354b0;
            mo89539n = mo89518u.mo89539n(ex222) | mo89518u.mo89539n(function12);
            mo89635G2 = mo89518u.mo89635G();
            if (!mo89539n) {
            }
            mo89635G2 = new HtmlKt$ClickableText$pressIndicator$1$1(ex222, function12, null);
            mo89518u.mo89503z(mo89635G2);
            InterfaceC41563gV2 mo39266t022 = interfaceC41563gV23.mo39266t0(C52840zW5.m1270c(c20912a22, function12, (Function2) mo89635G2));
            m105921d = g26.m105921d((r42 & 1) != 0 ? g26.f10827a.m105168g() : j, (r42 & 2) != 0 ? g26.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? g26.f10827a.m105161n() : null, (r42 & 8) != 0 ? g26.f10827a.m105163l() : null, (r42 & 16) != 0 ? g26.f10827a.m105162m() : null, (r42 & 32) != 0 ? g26.f10827a.m105166i() : null, (r42 & 64) != 0 ? g26.f10827a.m105165j() : null, (r42 & 128) != 0 ? g26.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? g26.f10827a.m105170e() : null, (r42 & 512) != 0 ? g26.f10827a.m105154u() : null, (r42 & 1024) != 0 ? g26.f10827a.m105159p() : null, (r42 & 2048) != 0 ? g26.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? g26.f10827a.m105156s() : null, (r42 & 8192) != 0 ? g26.f10827a.m105157r() : null, (r42 & 16384) != 0 ? g26.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? g26.f10828b.m110650l() : null, (r42 & 65536) != 0 ? g26.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? g26.f10828b.m110649m() : null);
            mo89518u.mo89638F(511388516);
            mo89539n2 = mo89518u.mo89539n(ex222) | mo89518u.mo89539n(function13);
            mo89635G3 = mo89518u.mo89635G();
            if (!mo89539n2) {
            }
            mo89635G3 = new HtmlKt$ClickableText$2$1(ex222, function13);
            mo89518u.mo89503z(mo89635G3);
            mo89518u.mo89605Q();
            C8222UE.m81805a(c1577Df, mo39266t022, m105921d, (Function1) mo89635G3, m24540a, z3, i15, emptyMap, mo89518u, 16777216 | (i5 & 14) | (57344 & (i5 >> 6)) | (i5 & ImageMetadata.JPEG_GPS_COORDINATES) | ((i5 >> 3) & 3670016), 0);
            if (C35528Qt0.m87827O()) {
            }
            interfaceC41563gV22 = interfaceC41563gV23;
            z2 = z3;
            i13 = m24540a;
            function14 = function13;
            i14 = i15;
            map2 = emptyMap;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
            }
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        obj = interfaceC41563gV2;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        i8 = i4 & 32;
        if (i8 != 0) {
        }
        i9 = i4 & 64;
        if (i9 != 0) {
        }
        i10 = i4 & 128;
        if (i10 != 0) {
        }
        i11 = i4 & 256;
        if (i11 != 0) {
        }
        if ((i4 & 512) == 0) {
        }
        i5 |= i12;
        if (i7 != 16) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        mo89635G = mo89518u.mo89635G();
        c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
        }
        EX2 ex2222 = (EX2) mo89635G;
        InterfaceC41563gV2.C20912a c20912a222 = InterfaceC41563gV2.f82354b0;
        mo89539n = mo89518u.mo89539n(ex2222) | mo89518u.mo89539n(function12);
        mo89635G2 = mo89518u.mo89635G();
        if (!mo89539n) {
        }
        mo89635G2 = new HtmlKt$ClickableText$pressIndicator$1$1(ex2222, function12, null);
        mo89518u.mo89503z(mo89635G2);
        InterfaceC41563gV2 mo39266t0222 = interfaceC41563gV23.mo39266t0(C52840zW5.m1270c(c20912a222, function12, (Function2) mo89635G2));
        m105921d = g26.m105921d((r42 & 1) != 0 ? g26.f10827a.m105168g() : j, (r42 & 2) != 0 ? g26.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? g26.f10827a.m105161n() : null, (r42 & 8) != 0 ? g26.f10827a.m105163l() : null, (r42 & 16) != 0 ? g26.f10827a.m105162m() : null, (r42 & 32) != 0 ? g26.f10827a.m105166i() : null, (r42 & 64) != 0 ? g26.f10827a.m105165j() : null, (r42 & 128) != 0 ? g26.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? g26.f10827a.m105170e() : null, (r42 & 512) != 0 ? g26.f10827a.m105154u() : null, (r42 & 1024) != 0 ? g26.f10827a.m105159p() : null, (r42 & 2048) != 0 ? g26.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? g26.f10827a.m105156s() : null, (r42 & 8192) != 0 ? g26.f10827a.m105157r() : null, (r42 & 16384) != 0 ? g26.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? g26.f10828b.m110650l() : null, (r42 & 65536) != 0 ? g26.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? g26.f10828b.m110649m() : null);
        mo89518u.mo89638F(511388516);
        mo89539n2 = mo89518u.mo89539n(ex2222) | mo89518u.mo89539n(function13);
        mo89635G3 = mo89518u.mo89635G();
        if (!mo89539n2) {
        }
        mo89635G3 = new HtmlKt$ClickableText$2$1(ex2222, function13);
        mo89518u.mo89503z(mo89635G3);
        mo89518u.mo89605Q();
        C8222UE.m81805a(c1577Df, mo39266t0222, m105921d, (Function1) mo89635G3, m24540a, z3, i15, emptyMap, mo89518u, 16777216 | (i5 & 14) | (57344 & (i5 >> 6)) | (i5 & ImageMetadata.JPEG_GPS_COORDINATES) | ((i5 >> 3) & 3670016), 0);
        if (C35528Qt0.m87827O()) {
        }
        interfaceC41563gV22 = interfaceC41563gV23;
        z2 = z3;
        i13 = m24540a;
        function14 = function13;
        i14 = i15;
        map2 = emptyMap;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012d  */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* renamed from: Html-m4MizFo  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m116769Htmlm4MizFo(String html, InterfaceC41563gV2 interfaceC41563gV2, Map<String, ? extends EmbeddableImage> map, long j, G26 g26, boolean z, GN5 gn5, int i, Function0<Unit> function0, InterfaceC32720Et0 interfaceC32720Et0, int i2, int i3) {
        int i4;
        InterfaceC41563gV2.C20912a c20912a;
        int i5;
        int i6;
        long j2;
        G26 g262;
        int i7;
        boolean z2;
        int i8;
        int i9;
        int i10;
        Map<String, ? extends EmbeddableImage> emptyMap;
        long m18726g;
        G26 g263;
        GN5 gn52;
        int i11;
        int i12;
        HtmlKt$Html$1 htmlKt$Html$1;
        int i13;
        Context context;
        Object mo89635G;
        InterfaceC32720Et0.C2012a c2012a;
        EX2 ex2;
        Object mo89635G2;
        Iterator<Map.Entry<String, ? extends EmbeddableImage>> it;
        boolean mo89539n;
        Object mo89635G3;
        Map<String, L22> value;
        Map plus;
        Map plus2;
        G26 g264;
        GN5 gn53;
        int i14;
        Function0<Unit> function02;
        boolean z3;
        long j3;
        Map<String, ? extends EmbeddableImage> map2;
        int i15;
        int i16;
        Intrinsics.checkNotNullParameter(html, "html");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-9822761);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (mo89518u.mo89539n(html) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i17 = i3 & 2;
        if (i17 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            Object obj = interfaceC41563gV2;
            i4 |= mo89518u.mo89539n(obj) ? 32 : 16;
            c20912a = obj;
            i5 = i3 & 4;
            if (i5 != 0) {
                i4 |= 128;
            }
            i6 = i3 & 8;
            if (i6 == 0) {
                i4 |= 3072;
                j2 = j;
            } else {
                j2 = j;
                if ((i2 & 7168) == 0) {
                    i4 |= mo89518u.mo89524s(j2) ? 2048 : 1024;
                }
            }
            if ((57344 & i2) != 0) {
                if ((i3 & 16) == 0) {
                    g262 = g26;
                    if (mo89518u.mo89539n(g262)) {
                        i16 = 16384;
                        i4 |= i16;
                    }
                } else {
                    g262 = g26;
                }
                i16 = 8192;
                i4 |= i16;
            } else {
                g262 = g26;
            }
            i7 = i3 & 32;
            if (i7 == 0) {
                i4 |= ImageMetadata.EDGE_MODE;
                z2 = z;
            } else {
                z2 = z;
                if ((i2 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                    i4 |= mo89518u.mo89536o(z2) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
                }
            }
            i8 = i3 & 64;
            if (i8 == 0) {
                i4 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                i4 |= mo89518u.mo89539n(gn5) ? 1048576 : 524288;
            }
            if ((i2 & 29360128) == 0) {
                if ((i3 & 128) == 0 && mo89518u.mo89527r(i)) {
                    i15 = 8388608;
                    i4 |= i15;
                }
                i15 = 4194304;
                i4 |= i15;
            }
            i9 = i3 & 256;
            if (i9 != 0) {
                if ((i2 & 234881024) == 0) {
                    i10 = mo89518u.mo89539n(function0) ? 67108864 : 33554432;
                }
                if (i5 != 4 && (191739611 & i4) == 38347922 && mo89518u.mo89575b()) {
                    mo89518u.mo89548k();
                    map2 = map;
                    gn53 = gn5;
                    function02 = function0;
                    z3 = z2;
                    g264 = g262;
                    j3 = j2;
                    i14 = i;
                } else {
                    mo89518u.mo89626J();
                    if ((i2 & 1) == 0 && !mo89518u.mo89545l()) {
                        mo89518u.mo89548k();
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        emptyMap = map;
                        i12 = i;
                        g263 = g262;
                        m18726g = j2;
                        gn52 = gn5;
                    } else {
                        if (i17 != 0) {
                            c20912a = InterfaceC41563gV2.f82354b0;
                        }
                        emptyMap = i5 != 0 ? MapsKt__MapsKt.emptyMap() : map;
                        m18726g = i6 != 0 ? C47063pm0.f104050b.m18726g() : j2;
                        if ((i3 & 16) != 0) {
                            g263 = (G26) mo89518u.mo89572c(C38909c26.m61999f());
                            i4 &= -57345;
                        } else {
                            g263 = g262;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        gn52 = i8 != 0 ? new GN5(0L, 0L, (C33918Jw1) null, (C32748Ew1) null, (C32982Fw1) null, (AbstractC44199kw1) null, (String) null, 0L, (C3091HE) null, (L16) null, (C50119uv2) null, 0L, R06.f31395b.m87427d(), (C35335Px5) null, 12287, (DefaultConstructorMarker) null) : gn5;
                        if ((i3 & 128) != 0) {
                            i11 = XU3.f43296a.m76954a();
                            i4 &= -29360129;
                        } else {
                            i11 = i;
                        }
                        if (i9 != 0) {
                            int i18 = i4;
                            htmlKt$Html$1 = HtmlKt$Html$1.INSTANCE;
                            i12 = i11;
                            i13 = i18;
                            mo89518u.mo89650B();
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87816Z(-9822761, i13, -1, "com.stripe.android.uicore.text.Html (Html.kt:220)");
                            }
                            context = (Context) mo89518u.mo89572c(C11411h.m68324g());
                            int i19 = i13 >> 12;
                            C1577Df annotatedStringResource = annotatedStringResource(html, emptyMap, gn52, mo89518u, (i19 & 896) | (i13 & 14) | 64, 0);
                            mo89518u.mo89638F(-492369756);
                            mo89635G = mo89518u.mo89635G();
                            c2012a = InterfaceC32720Et0.f8257a;
                            GN5 gn54 = gn52;
                            if (mo89635G == c2012a.m108267a()) {
                                mo89635G = LM5.m97025e(Boolean.FALSE, null, 2, null);
                                mo89518u.mo89503z(mo89635G);
                            }
                            mo89518u.mo89605Q();
                            ex2 = (EX2) mo89635G;
                            mo89518u.mo89638F(-492369756);
                            mo89635G2 = mo89518u.mo89635G();
                            if (mo89635G2 == c2012a.m108267a()) {
                                mo89635G2 = new StripeImageLoader(context, null, null, null, null, 14, null);
                                mo89518u.mo89503z(mo89635G2);
                            }
                            mo89518u.mo89605Q();
                            StripeImageLoader stripeImageLoader = (StripeImageLoader) mo89635G2;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry<String, ? extends EmbeddableImage> entry : emptyMap.entrySet()) {
                                G26 g265 = g263;
                                if (entry.getValue() instanceof EmbeddableImage.Drawable) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                    g263 = g265;
                                    m18726g = m18726g;
                                } else {
                                    g263 = g265;
                                }
                            }
                            G26 g266 = g263;
                            long j4 = m18726g;
                            int i20 = ((i13 >> 18) & 112) | 8;
                            Map<String, L22> m116772rememberDrawableImages0fZqiVQ = m116772rememberDrawableImages0fZqiVQ(linkedHashMap, i12, mo89518u, i20);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            it = emptyMap.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry<String, ? extends EmbeddableImage> next = it.next();
                                Iterator<Map.Entry<String, ? extends EmbeddableImage>> it2 = it;
                                if (next.getValue() instanceof EmbeddableImage.Bitmap) {
                                    linkedHashMap2.put(next.getKey(), next.getValue());
                                    it = it2;
                                    i13 = i13;
                                } else {
                                    it = it2;
                                }
                            }
                            int i21 = i13;
                            Map<String, L22> m116771rememberBitmapImages0fZqiVQ = m116771rememberBitmapImages0fZqiVQ(linkedHashMap2, i12, mo89518u, i20);
                            mo89518u.mo89638F(1157296644);
                            mo89539n = mo89518u.mo89539n(ex2);
                            mo89635G3 = mo89518u.mo89635G();
                            if (!mo89539n || mo89635G3 == InterfaceC32720Et0.f8257a.m108267a()) {
                                mo89635G3 = new HtmlKt$Html$remoteImages$1$1(ex2);
                                mo89518u.mo89503z(mo89635G3);
                            }
                            mo89518u.mo89605Q();
                            value = m116773rememberRemoteImagesXiPi2c8(annotatedStringResource, emptyMap, stripeImageLoader, i12, mo89635G3, mo89518u, (i19 & 7168) | 576).getValue();
                            if (!value.isEmpty() || ((Boolean) ex2.getValue()).booleanValue()) {
                                InterfaceC41563gV2 m40621a = C41198fs5.m40621a(c20912a, true, HtmlKt$Html$2.INSTANCE);
                                plus = MapsKt__MapsKt.plus(m116772rememberDrawableImages0fZqiVQ, m116771rememberBitmapImages0fZqiVQ);
                                plus2 = MapsKt__MapsKt.plus(plus, value);
                                HtmlKt$Html$3 htmlKt$Html$3 = new HtmlKt$Html$3(z2, htmlKt$Html$1, annotatedStringResource, context);
                                int i22 = i21 >> 6;
                                m116768ClickableTextmZk19tU(annotatedStringResource, j4, g266, m40621a, plus2, false, 0, 0, null, htmlKt$Html$3, mo89518u, (i22 & 112) | DateUtils.FORMAT_ABBREV_WEEKDAY | (i22 & 896), 480);
                            }
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87817Y();
                            }
                            g264 = g266;
                            gn53 = gn54;
                            i14 = i12;
                            function02 = htmlKt$Html$1;
                            z3 = z2;
                            j3 = j4;
                            map2 = emptyMap;
                        } else {
                            i12 = i11;
                        }
                    }
                    i13 = i4;
                    htmlKt$Html$1 = function0;
                    mo89518u.mo89650B();
                    if (C35528Qt0.m87827O()) {
                    }
                    context = (Context) mo89518u.mo89572c(C11411h.m68324g());
                    int i192 = i13 >> 12;
                    C1577Df annotatedStringResource2 = annotatedStringResource(html, emptyMap, gn52, mo89518u, (i192 & 896) | (i13 & 14) | 64, 0);
                    mo89518u.mo89638F(-492369756);
                    mo89635G = mo89518u.mo89635G();
                    c2012a = InterfaceC32720Et0.f8257a;
                    GN5 gn542 = gn52;
                    if (mo89635G == c2012a.m108267a()) {
                    }
                    mo89518u.mo89605Q();
                    ex2 = (EX2) mo89635G;
                    mo89518u.mo89638F(-492369756);
                    mo89635G2 = mo89518u.mo89635G();
                    if (mo89635G2 == c2012a.m108267a()) {
                    }
                    mo89518u.mo89605Q();
                    StripeImageLoader stripeImageLoader2 = (StripeImageLoader) mo89635G2;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    while (r17.hasNext()) {
                    }
                    G26 g2662 = g263;
                    long j42 = m18726g;
                    int i202 = ((i13 >> 18) & 112) | 8;
                    Map<String, L22> m116772rememberDrawableImages0fZqiVQ2 = m116772rememberDrawableImages0fZqiVQ(linkedHashMap3, i12, mo89518u, i202);
                    LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                    it = emptyMap.entrySet().iterator();
                    while (it.hasNext()) {
                    }
                    int i212 = i13;
                    Map<String, L22> m116771rememberBitmapImages0fZqiVQ2 = m116771rememberBitmapImages0fZqiVQ(linkedHashMap22, i12, mo89518u, i202);
                    mo89518u.mo89638F(1157296644);
                    mo89539n = mo89518u.mo89539n(ex2);
                    mo89635G3 = mo89518u.mo89635G();
                    if (!mo89539n) {
                    }
                    mo89635G3 = new HtmlKt$Html$remoteImages$1$1(ex2);
                    mo89518u.mo89503z(mo89635G3);
                    mo89518u.mo89605Q();
                    value = m116773rememberRemoteImagesXiPi2c8(annotatedStringResource2, emptyMap, stripeImageLoader2, i12, mo89635G3, mo89518u, (i192 & 7168) | 576).getValue();
                    if (!value.isEmpty()) {
                    }
                    InterfaceC41563gV2 m40621a2 = C41198fs5.m40621a(c20912a, true, HtmlKt$Html$2.INSTANCE);
                    plus = MapsKt__MapsKt.plus(m116772rememberDrawableImages0fZqiVQ2, m116771rememberBitmapImages0fZqiVQ2);
                    plus2 = MapsKt__MapsKt.plus(plus, value);
                    HtmlKt$Html$3 htmlKt$Html$32 = new HtmlKt$Html$3(z2, htmlKt$Html$1, annotatedStringResource2, context);
                    int i222 = i212 >> 6;
                    m116768ClickableTextmZk19tU(annotatedStringResource2, j42, g2662, m40621a2, plus2, false, 0, 0, null, htmlKt$Html$32, mo89518u, (i222 & 112) | DateUtils.FORMAT_ABBREV_WEEKDAY | (i222 & 896), 480);
                    if (C35528Qt0.m87827O()) {
                    }
                    g264 = g2662;
                    gn53 = gn542;
                    i14 = i12;
                    function02 = htmlKt$Html$1;
                    z3 = z2;
                    j3 = j42;
                    map2 = emptyMap;
                }
                InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
                if (mo89512w == null) {
                    return;
                }
                mo89512w.mo20405a(new HtmlKt$Html$4(html, c20912a, map2, j3, g264, z3, gn53, i14, function02, i2, i3));
                return;
            }
            i10 = 100663296;
            i4 |= i10;
            if (i5 != 4) {
            }
            mo89518u.mo89626J();
            if ((i2 & 1) == 0) {
            }
            if (i17 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if (i9 != 0) {
            }
        }
        c20912a = interfaceC41563gV2;
        i5 = i3 & 4;
        if (i5 != 0) {
        }
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        if ((57344 & i2) != 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i2 & 29360128) == 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i4 |= i10;
        if (i5 != 4) {
        }
        mo89518u.mo89626J();
        if ((i2 & 1) == 0) {
        }
        if (i17 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if (i9 != 0) {
        }
    }

    public static final C1577Df annotatedStringResource(String text, Map<String, ? extends EmbeddableImage> map, GN5 gn5, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Map<String, ? extends EmbeddableImage> map2;
        GN5 gn52;
        Intrinsics.checkNotNullParameter(text, "text");
        interfaceC32720Et0.mo89638F(1962487584);
        if ((i2 & 2) != 0) {
            map2 = MapsKt__MapsKt.emptyMap();
        } else {
            map2 = map;
        }
        if ((i2 & 4) != 0) {
            gn52 = new GN5(0L, 0L, (C33918Jw1) null, (C32748Ew1) null, (C32982Fw1) null, (AbstractC44199kw1) null, (String) null, 0L, (C3091HE) null, (L16) null, (C50119uv2) null, 0L, R06.f31395b.m87427d(), (C35335Px5) null, 12287, (DefaultConstructorMarker) null);
        } else {
            gn52 = gn5;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1962487584, i, -1, "com.stripe.android.uicore.text.annotatedStringResource (Html.kt:302)");
        }
        boolean mo89539n = interfaceC32720Et0.mo89539n(text);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = C50976wN1.m6966a(text, 0);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        Intrinsics.checkNotNullExpressionValue(mo89635G, "remember(text) {\n       …M_HTML_MODE_LEGACY)\n    }");
        Spanned spanned = (Spanned) mo89635G;
        boolean mo89539n2 = interfaceC32720Et0.mo89539n(spanned);
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            C1577Df.C1578a c1578a = new C1577Df.C1578a(0, 1, null);
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            Intrinsics.checkNotNullExpressionValue(spans, "spanned.getSpans(0, span….length, Any::class.java)");
            int i3 = 0;
            for (Object obj : spans) {
                int spanStart = spanned.getSpanStart(obj);
                int spanEnd = spanned.getSpanEnd(obj);
                if (i3 < spanned.toString().length() && spanStart < spanned.toString().length() && spanStart - i3 >= 0) {
                    String substring = spanned.toString().substring(i3, spanStart);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    c1578a.m110038i(substring);
                    if (obj instanceof StyleSpan) {
                        int style = ((StyleSpan) obj).getStyle();
                        if (style != 1) {
                            if (style != 2) {
                                if (style == 3) {
                                    c1578a.m110044c(new GN5(0L, 0L, C33918Jw1.f18784c.m99543a(), C32748Ew1.m108209c(C32748Ew1.f8309b.m108202a()), (C32982Fw1) null, (AbstractC44199kw1) null, (String) null, 0L, (C3091HE) null, (L16) null, (C50119uv2) null, 0L, (R06) null, (C35335Px5) null, 16371, (DefaultConstructorMarker) null), spanStart, spanEnd);
                                }
                            } else {
                                c1578a.m110044c(new GN5(0L, 0L, (C33918Jw1) null, C32748Ew1.m108209c(C32748Ew1.f8309b.m108202a()), (C32982Fw1) null, (AbstractC44199kw1) null, (String) null, 0L, (C3091HE) null, (L16) null, (C50119uv2) null, 0L, (R06) null, (C35335Px5) null, 16375, (DefaultConstructorMarker) null), spanStart, spanEnd);
                            }
                        } else {
                            c1578a.m110044c(new GN5(0L, 0L, C33918Jw1.f18784c.m99543a(), (C32748Ew1) null, (C32982Fw1) null, (AbstractC44199kw1) null, (String) null, 0L, (C3091HE) null, (L16) null, (C50119uv2) null, 0L, (R06) null, (C35335Px5) null, 16379, (DefaultConstructorMarker) null), spanStart, spanEnd);
                        }
                    } else if (obj instanceof UnderlineSpan) {
                        c1578a.m110044c(new GN5(0L, 0L, (C33918Jw1) null, (C32748Ew1) null, (C32982Fw1) null, (AbstractC44199kw1) null, (String) null, 0L, (C3091HE) null, (L16) null, (C50119uv2) null, 0L, R06.f31395b.m87427d(), (C35335Px5) null, 12287, (DefaultConstructorMarker) null), spanStart, spanEnd);
                    } else if (obj instanceof ForegroundColorSpan) {
                        c1578a.m110044c(new GN5(C50619vm0.m8179b(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (C33918Jw1) null, (C32748Ew1) null, (C32982Fw1) null, (AbstractC44199kw1) null, (String) null, 0L, (C3091HE) null, (L16) null, (C50119uv2) null, 0L, (R06) null, (C35335Px5) null, 16382, (DefaultConstructorMarker) null), spanStart, spanEnd);
                    } else if (obj instanceof ImageSpan) {
                        ImageSpan imageSpan = (ImageSpan) obj;
                        if (imageSpan.getSource() != null) {
                            if (!map2.isEmpty()) {
                                String source = imageSpan.getSource();
                                Intrinsics.checkNotNull(source);
                                map2.containsKey(source);
                            }
                            String source2 = imageSpan.getSource();
                            Intrinsics.checkNotNull(source2);
                            M22.m95986b(c1578a, source2, null, 2, null);
                        }
                        i3 = spanEnd;
                    } else if (obj instanceof URLSpan) {
                        c1578a.m110044c(gn52, spanStart, spanEnd);
                        String url = ((URLSpan) obj).getURL();
                        Intrinsics.checkNotNullExpressionValue(url, "span.url");
                        c1578a.m110046a(LINK_TAG, url, spanStart, spanEnd);
                    }
                    i3 = spanStart;
                }
            }
            if (i3 != spanned.toString().length()) {
                String substring2 = spanned.toString().substring(i3);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                c1578a.m110038i(substring2);
            }
            mo89635G2 = c1578a.m110035l();
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        C1577Df c1577Df = (C1577Df) mo89635G2;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return c1577Df;
    }

    /* renamed from: rememberBitmapImages-0fZqiVQ  reason: not valid java name */
    private static final Map<String, L22> m116771rememberBitmapImages0fZqiVQ(Map<String, EmbeddableImage.Bitmap> map, int i, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
        int collectionSizeOrDefault;
        int mapCapacity;
        int coerceAtLeast;
        interfaceC32720Et0.mo89638F(1925244042);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1925244042, i2, -1, "com.stripe.android.uicore.text.rememberBitmapImages (Html.kt:110)");
        }
        Set<Map.Entry<String, EmbeddableImage.Bitmap>> entrySet = map.entrySet();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10);
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            EmbeddableImage.Bitmap bitmap = (EmbeddableImage.Bitmap) entry.getValue();
            long m5727l = C51465xB5.m5727l(CB5.m112663a(bitmap.getBitmap().getWidth(), bitmap.getBitmap().getHeight()), 1 / ((InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g())).mo3408b());
            Pair m28425to = TuplesKt.m28425to((String) entry.getKey(), new L22(new TU3(N26.m94415e(C51465xB5.m5730i(m5727l)), N26.m94415e(C51465xB5.m5732g(m5727l)), i, null), C43575jt0.m29791b(interfaceC32720Et0, -560842123, true, new HtmlKt$rememberBitmapImages$1$1(bitmap))));
            linkedHashMap.put(m28425to.getFirst(), m28425to.getSecond());
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return linkedHashMap;
    }

    /* renamed from: rememberDrawableImages-0fZqiVQ  reason: not valid java name */
    private static final Map<String, L22> m116772rememberDrawableImages0fZqiVQ(Map<String, EmbeddableImage.Drawable> map, int i, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
        int collectionSizeOrDefault;
        int mapCapacity;
        int coerceAtLeast;
        interfaceC32720Et0.mo89638F(389303035);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(389303035, i2, -1, "com.stripe.android.uicore.text.rememberDrawableImages (Html.kt:77)");
        }
        Set<Map.Entry<String, EmbeddableImage.Drawable>> entrySet = map.entrySet();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10);
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            EmbeddableImage.Drawable drawable = (EmbeddableImage.Drawable) entry.getValue();
            AbstractC45562nE3 m19793d = C46748pE3.m19793d(drawable.getId(), interfaceC32720Et0, 0);
            float m5732g = C51465xB5.m5732g(m19793d.mo116236getIntrinsicSizeNHjbRc());
            float m5730i = C51465xB5.m5730i(m19793d.mo116236getIntrinsicSizeNHjbRc());
            TM2 tm2 = TM2.f35372a;
            int i3 = TM2.f35373b;
            long m105911n = tm2.m83729c(interfaceC32720Et0, i3).m104965c().m105911n();
            N26.m94418b(m105911n);
            Pair m28425to = TuplesKt.m28425to((String) entry.getKey(), new L22(new TU3(N26.m94411i(M26.m95974f(m105911n), M26.m95972h(m105911n) * (m5730i / m5732g)), tm2.m83729c(interfaceC32720Et0, i3).m104965c().m105911n(), i, null), C43575jt0.m29791b(interfaceC32720Et0, -737684954, true, new HtmlKt$rememberDrawableImages$1$1(drawable, m19793d))));
            linkedHashMap.put(m28425to.getFirst(), m28425to.getSecond());
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return linkedHashMap;
    }

    /* renamed from: rememberRemoteImages-XiPi2c8  reason: not valid java name */
    private static final InterfaceC48627sP5<Map<String, L22>> m116773rememberRemoteImagesXiPi2c8(C1577Df c1577Df, Map<String, ? extends EmbeddableImage> map, StripeImageLoader stripeImageLoader, int i, Function0<Unit> function0, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
        Map emptyMap;
        interfaceC32720Et0.mo89638F(-1863307166);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1863307166, i2, -1, "com.stripe.android.uicore.text.rememberRemoteImages (Html.kt:139)");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = c1577Df.m110054h(0, c1577Df.length()).iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str = (String) ((C1577Df.C1580b) next).m110028e();
            if (!UiUtilsKt.isSupportedImageUrl(str) || map.keySet().contains(str)) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            emptyMap = MapsKt__MapsKt.emptyMap();
            mo89635G = C50405vP5.m8742a(emptyMap);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        GX2 gx2 = (GX2) mo89635G;
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        interfaceC32720Et0.mo89638F(-61417607);
        if (!arrayList.isEmpty()) {
            Y91.m75533f(c1577Df, new HtmlKt$rememberRemoteImages$1(arrayList, gx2, function0, stripeImageLoader, interfaceC41273g01, i, null), interfaceC32720Et0, (i2 & 14) | 64);
        }
        interfaceC32720Et0.mo89605Q();
        InterfaceC48627sP5<Map<String, L22>> m105205b = GM5.m105205b(gx2, null, interfaceC32720Et0, 8, 1);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m105205b;
    }
}
