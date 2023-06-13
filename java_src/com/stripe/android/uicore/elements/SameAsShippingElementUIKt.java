package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/SameAsShippingController;", "controller", "", "SameAsShippingElementUI", "(Lcom/stripe/android/uicore/elements/SameAsShippingController;LEt0;I)V", "", SameAsShippingElementUIKt.SAME_AS_SHIPPING_CHECKBOX_TEST_TAG, "Ljava/lang/String;", "stripe-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSameAsShippingElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SameAsShippingElementUI.kt\ncom/stripe/android/uicore/elements/SameAsShippingElementUIKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,29:1\n1#2:30\n76#3:31\n76#3:32\n*S KotlinDebug\n*F\n+ 1 SameAsShippingElementUI.kt\ncom/stripe/android/uicore/elements/SameAsShippingElementUIKt\n*L\n16#1:31\n17#1:32\n*E\n"})
/* loaded from: classes7.dex */
public final class SameAsShippingElementUIKt {
    public static final String SAME_AS_SHIPPING_CHECKBOX_TEST_TAG = "SAME_AS_SHIPPING_CHECKBOX_TEST_TAG";

    public static final void SameAsShippingElementUI(SameAsShippingController controller, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        String str;
        Intrinsics.checkNotNullParameter(controller, "controller");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(2120438239);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(2120438239, i, -1, "com.stripe.android.uicore.elements.SameAsShippingElementUI (SameAsShippingElementUI.kt:12)");
        }
        InterfaceC48627sP5 m105206a = GM5.m105206a(controller.getValue(), Boolean.FALSE, null, mo89518u, 56, 2);
        InterfaceC48627sP5 m105206a2 = GM5.m105206a(controller.getLabel(), null, null, mo89518u, 56, 2);
        boolean SameAsShippingElementUI$lambda$0 = SameAsShippingElementUI$lambda$0(m105206a);
        Integer SameAsShippingElementUI$lambda$1 = SameAsShippingElementUI$lambda$1(m105206a2);
        if (SameAsShippingElementUI$lambda$1 != null) {
            str = C40946fS5.m41310c(SameAsShippingElementUI$lambda$1.intValue(), mo89518u, 0);
        } else {
            str = null;
        }
        CheckboxElementUIKt.CheckboxElementUI(null, SAME_AS_SHIPPING_CHECKBOX_TEST_TAG, SameAsShippingElementUI$lambda$0, str, true, new SameAsShippingElementUIKt$SameAsShippingElementUI$2(controller, m105206a), mo89518u, 24624, 1);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new SameAsShippingElementUIKt$SameAsShippingElementUI$3(controller, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SameAsShippingElementUI$lambda$0(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    private static final Integer SameAsShippingElementUI$lambda$1(InterfaceC48627sP5<Integer> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }
}
