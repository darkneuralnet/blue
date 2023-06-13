package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.financialconnections.C18634R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "", "invoke", "(ZLEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.financialconnections.features.accountpicker.ComposableSingletons$AccountPickerScreenKt$lambda-2$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$AccountPickerScreenKt$lambda2$1 extends Lambda implements Function3<Boolean, InterfaceC32720Et0, Integer, Unit> {
    public static final ComposableSingletons$AccountPickerScreenKt$lambda2$1 INSTANCE = new ComposableSingletons$AccountPickerScreenKt$lambda2$1();

    public ComposableSingletons$AccountPickerScreenKt$lambda2$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(bool.booleanValue(), interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        if ((i & 14) == 0) {
            i2 = (interfaceC32720Et0.mo89536o(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1911767262, i, -1, "com.stripe.android.financialconnections.features.accountpicker.ComposableSingletons$AccountPickerScreenKt.lambda-2.<anonymous> (AccountPickerScreen.kt:358)");
        }
        if (z) {
            i3 = C18634R.C18635drawable.stripe_ic_radio_yes;
        } else {
            i3 = C18634R.C18635drawable.stripe_ic_radio_no;
        }
        C51659xX1.m5069a(C46748pE3.m19793d(i3, interfaceC32720Et0, 0), null, null, null, null, 0.0f, null, interfaceC32720Et0, 56, 124);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
