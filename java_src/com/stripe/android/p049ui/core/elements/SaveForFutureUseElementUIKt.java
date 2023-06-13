package com.stripe.android.p049ui.core.elements;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p003ui.platform.C11411h;
import com.stripe.android.uicore.elements.CheckboxElementUIKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m28432d2 = {"", "enabled", "Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;", "element", "LgV2;", "modifier", "", "SaveForFutureUseElementUI", "(ZLcom/stripe/android/ui/core/elements/SaveForFutureUseElement;LgV2;LEt0;II)V", "", SaveForFutureUseElementUIKt.SAVE_FOR_FUTURE_CHECKBOX_TEST_TAG, "Ljava/lang/String;", "payments-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSaveForFutureUseElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveForFutureUseElementUI.kt\ncom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,36:1\n76#2:37\n1#3:38\n76#4:39\n76#4:40\n*S KotlinDebug\n*F\n+ 1 SaveForFutureUseElementUI.kt\ncom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt\n*L\n23#1:37\n21#1:39\n22#1:40\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.SaveForFutureUseElementUIKt */
/* loaded from: classes7.dex */
public final class SaveForFutureUseElementUIKt {
    public static final String SAVE_FOR_FUTURE_CHECKBOX_TEST_TAG = "SAVE_FOR_FUTURE_CHECKBOX_TEST_TAG";

    public static final void SaveForFutureUseElementUI(boolean z, SaveForFutureUseElement element, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        String str;
        Intrinsics.checkNotNullParameter(element, "element");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1061070076);
        if ((i2 & 4) != 0) {
            interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1061070076, i, -1, "com.stripe.android.ui.core.elements.SaveForFutureUseElementUI (SaveForFutureUseElementUI.kt:14)");
        }
        SaveForFutureUseController controller = element.getController();
        InterfaceC48627sP5 m105206a = GM5.m105206a(controller.getSaveForFutureUse(), Boolean.TRUE, null, mo89518u, 56, 2);
        InterfaceC48627sP5 m105206a2 = GM5.m105206a(controller.getLabel(), null, null, mo89518u, 56, 2);
        Resources resources = ((Context) mo89518u.mo89572c(C11411h.m68324g())).getResources();
        boolean SaveForFutureUseElementUI$lambda$0 = SaveForFutureUseElementUI$lambda$0(m105206a);
        Integer SaveForFutureUseElementUI$lambda$1 = SaveForFutureUseElementUI$lambda$1(m105206a2);
        if (SaveForFutureUseElementUI$lambda$1 != null) {
            str = resources.getString(SaveForFutureUseElementUI$lambda$1.intValue(), element.getMerchantName());
        } else {
            str = null;
        }
        CheckboxElementUIKt.CheckboxElementUI(interfaceC41563gV2, SAVE_FOR_FUTURE_CHECKBOX_TEST_TAG, SaveForFutureUseElementUI$lambda$0, str, z, new SaveForFutureUseElementUIKt$SaveForFutureUseElementUI$2(controller, m105206a), mo89518u, ((i >> 6) & 14) | 48 | ((i << 12) & 57344), 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new SaveForFutureUseElementUIKt$SaveForFutureUseElementUI$3(z, element, interfaceC41563gV2, i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SaveForFutureUseElementUI$lambda$0(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    private static final Integer SaveForFutureUseElementUI$lambda$1(InterfaceC48627sP5<Integer> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }
}
