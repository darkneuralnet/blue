package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"", "label", "", "LabelUI", "(Ljava/lang/String;LEt0;I)V", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.paymentsheet.ui.PrimaryButtonKt */
/* loaded from: classes7.dex */
public final class PrimaryButtonKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void LabelUI(String str, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1415476771);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(str)) {
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
                C35528Qt0.m87816Z(-1415476771, i2, -1, "com.stripe.android.paymentsheet.ui.LabelUI (PrimaryButton.kt:242)");
            }
            StripeThemeKt.StripeTheme(null, null, null, C43575jt0.m29791b(mo89518u, 52319215, true, new PrimaryButtonKt$LabelUI$1(str, i2)), mo89518u, 3072, 7);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PrimaryButtonKt$LabelUI$2(str, i));
        }
    }

    public static final /* synthetic */ void access$LabelUI(String str, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        LabelUI(str, interfaceC32720Et0, i);
    }
}
