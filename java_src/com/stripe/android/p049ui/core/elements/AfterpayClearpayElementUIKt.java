package com.stripe.android.p049ui.core.elements;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p003ui.platform.C11411h;
import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.p049ui.core.C19369R;
import com.stripe.android.p049ui.core.elements.AfterpayClearpayHeaderElement;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.text.EmbeddableImage;
import com.stripe.android.uicore.text.HtmlKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C48841sm0;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"", "enabled", "Lcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement;", "element", "", "AfterpayClearpayElementUI", "(ZLcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement;LEt0;I)V", "payments-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAfterpayClearpayElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AfterpayClearpayElementUI.kt\ncom/stripe/android/ui/core/elements/AfterpayClearpayElementUIKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,60:1\n76#2:61\n154#3:62\n*S KotlinDebug\n*F\n+ 1 AfterpayClearpayElementUI.kt\ncom/stripe/android/ui/core/elements/AfterpayClearpayElementUIKt\n*L\n27#1:61\n53#1:62\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.AfterpayClearpayElementUIKt */
/* loaded from: classes7.dex */
public final class AfterpayClearpayElementUIKt {
    public static final void AfterpayClearpayElementUI(boolean z, AfterpayClearpayHeaderElement element, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        String replace$default;
        int i2;
        int i3;
        C48841sm0 m13699b;
        Map mapOf;
        Intrinsics.checkNotNullParameter(element, "element");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1959271317);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1959271317, i, -1, "com.stripe.android.ui.core.elements.AfterpayClearpayElementUI (AfterpayClearpayElementUI.kt:22)");
        }
        Resources resources = ((Context) mo89518u.mo89572c(C11411h.m68324g())).getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        replace$default = StringsKt__StringsJVMKt.replace$default(element.getLabel(resources), "<img/>", "<img src=\"afterpay\"/>", false, 4, (Object) null);
        AfterpayClearpayHeaderElement.Companion companion = AfterpayClearpayHeaderElement.Companion;
        if (companion.isClearpay$payments_ui_core_release()) {
            i2 = C19369R.C19370drawable.stripe_ic_clearpay_logo;
        } else {
            i2 = C19369R.C19370drawable.stripe_ic_afterpay_logo;
        }
        if (companion.isClearpay$payments_ui_core_release()) {
            i3 = C19369R.string.stripe_paymentsheet_payment_method_clearpay;
        } else {
            i3 = C19369R.string.stripe_paymentsheet_payment_method_afterpay;
        }
        TM2 tm2 = TM2.f35372a;
        int i4 = TM2.f35373b;
        if (StripeThemeKt.m116713shouldUseDarkDynamicColor8_81llA(tm2.m83731a(mo89518u, i4).m94896n())) {
            m13699b = null;
        } else {
            m13699b = C48841sm0.C28383a.m13699b(C48841sm0.f109227b, C47063pm0.f104050b.m18725h(), 0, 2, null);
        }
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("afterpay", new EmbeddableImage.Drawable(i2, i3, m13699b)));
        float f = 4;
        HtmlKt.m116769Htmlm4MizFo(replace$default, ND3.m94181l(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(f), C43705k61.m29303g(8), C43705k61.m29303g(f), C43705k61.m29303g(f)), mapOf, StripeThemeKt.getStripeColors(tm2, mo89518u, i4).m116700getSubtitle0d7_KjU(), tm2.m83729c(mo89518u, i4).m104958j(), z, new GN5(0L, 0L, (C33918Jw1) null, (C32748Ew1) null, (C32982Fw1) null, (AbstractC44199kw1) null, (String) null, 0L, (C3091HE) null, (L16) null, (C50119uv2) null, 0L, (R06) null, (C35335Px5) null, 16383, (DefaultConstructorMarker) null), XU3.f43296a.m76953b(), null, mo89518u, ((EmbeddableImage.Drawable.$stable | 0) << 6) | 1572912 | ((i << 15) & ImageMetadata.JPEG_GPS_COORDINATES), 256);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AfterpayClearpayElementUIKt$AfterpayClearpayElementUI$1(z, element, i));
        }
    }
}
