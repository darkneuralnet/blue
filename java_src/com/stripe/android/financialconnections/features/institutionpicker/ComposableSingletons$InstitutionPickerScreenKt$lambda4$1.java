package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.features.common.LoadingContentKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lrn2;", "", "invoke", "(Lrn2;LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.financialconnections.features.institutionpicker.ComposableSingletons$InstitutionPickerScreenKt$lambda-4$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$InstitutionPickerScreenKt$lambda4$1 extends Lambda implements Function3<InterfaceC48261rn2, InterfaceC32720Et0, Integer, Unit> {
    public static final ComposableSingletons$InstitutionPickerScreenKt$lambda4$1 INSTANCE = new ComposableSingletons$InstitutionPickerScreenKt$lambda4$1();

    public ComposableSingletons$InstitutionPickerScreenKt$lambda4$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48261rn2 interfaceC48261rn2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC48261rn2, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC48261rn2 item, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-357450060, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.ComposableSingletons$InstitutionPickerScreenKt.lambda-4.<anonymous> (InstitutionPickerScreen.kt:422)");
        }
        LoadingContentKt.LoadingSpinner(interfaceC32720Et0, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
