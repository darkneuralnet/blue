package com.stripe.android.paymentsheet.p047ui;

import android.view.View;
import com.stripe.android.paymentsheet.p047ui.PrimaryButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.GooglePayButtonKt$GooglePayButton$2$1 */
/* loaded from: classes7.dex */
public final class GooglePayButtonKt$GooglePayButton$2$1 extends Lambda implements Function1<GooglePayButton, Unit> {
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ Function0<Unit> $onPressed;
    final /* synthetic */ PrimaryButton.State $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayButtonKt$GooglePayButton$2$1(boolean z, PrimaryButton.State state, Function0<Unit> function0) {
        super(1);
        this.$isEnabled = z;
        this.$state = state;
        this.$onPressed = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GooglePayButton googlePayButton) {
        invoke2(googlePayButton);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GooglePayButton googlePayButton) {
        Intrinsics.checkNotNullParameter(googlePayButton, "googlePayButton");
        googlePayButton.setEnabled(this.$isEnabled);
        googlePayButton.updateState(this.$state);
        final Function0<Unit> function0 = this.$onPressed;
        googlePayButton.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.paymentsheet.ui.GooglePayButtonKt$GooglePayButton$2$1.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                function0.invoke();
            }
        });
    }
}
