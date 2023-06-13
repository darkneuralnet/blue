package com.stripe.android.link.p042ui.forms;

import com.stripe.android.p049ui.core.FormController;
import com.stripe.android.p049ui.core.FormUIKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/ui/core/FormController;", "formController", "LEu1;", "", "enabledFlow", "", "Form", "(Lcom/stripe/android/ui/core/FormController;LEu1;LEt0;I)V", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.link.ui.forms.FormKt */
/* loaded from: classes7.dex */
public final class FormKt {
    public static final void Form(FormController formController, InterfaceC32730Eu1<Boolean> enabledFlow, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(formController, "formController");
        Intrinsics.checkNotNullParameter(enabledFlow, "enabledFlow");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-786167116);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-786167116, i, -1, "com.stripe.android.link.ui.forms.Form (Form.kt:8)");
        }
        FormUIKt.FormUI(formController.getHiddenIdentifiers(), enabledFlow, formController.getElements(), formController.getLastTextFieldIdentifier(), (InterfaceC41563gV2) null, mo89518u, 4680, 16);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new FormKt$Form$1(formController, enabledFlow, i));
        }
    }
}
