package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/AddressTextFieldController;", "controller", "Lkotlin/Function0;", "", "onClick", "AddressTextFieldUI", "(Lcom/stripe/android/uicore/elements/AddressTextFieldController;Lkotlin/jvm/functions/Function0;LEt0;II)V", "stripe-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddressTextFieldUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressTextFieldUI.kt\ncom/stripe/android/uicore/elements/AddressTextFieldUIKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,26:1\n36#2:27\n1057#3,6:28\n*S KotlinDebug\n*F\n+ 1 AddressTextFieldUI.kt\ncom/stripe/android/uicore/elements/AddressTextFieldUIKt\n*L\n21#1:27\n21#1:28,6\n*E\n"})
/* loaded from: classes7.dex */
public final class AddressTextFieldUIKt {
    public static final void AddressTextFieldUI(AddressTextFieldController controller, Function0<Unit> function0, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(controller, "controller");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-2118013992);
        if ((i2 & 2) != 0) {
            function0 = new AddressTextFieldUIKt$AddressTextFieldUI$1(controller);
            i3 = i & (-113);
        } else {
            i3 = i;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-2118013992, i3, -1, "com.stripe.android.uicore.elements.AddressTextFieldUI (AddressTextFieldUI.kt:10)");
        }
        int m107000d = FY1.f9619b.m107000d();
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        mo89518u.mo89638F(1157296644);
        boolean mo89539n = mo89518u.mo89539n(function0);
        Object mo89635G = mo89518u.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new AddressTextFieldUIKt$AddressTextFieldUI$2$1(function0);
            mo89518u.mo89503z(mo89635G);
        }
        mo89518u.mo89605Q();
        TextFieldUIKt.m116750TextFieldndPIYpw(controller, false, m107000d, C38131ak0.m70814e(c20912a, false, null, null, (Function0) mo89635G, 7, null), null, 0, 0, mo89518u, 56, 112);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new AddressTextFieldUIKt$AddressTextFieldUI$3(controller, function0, i, i2));
        }
    }
}
