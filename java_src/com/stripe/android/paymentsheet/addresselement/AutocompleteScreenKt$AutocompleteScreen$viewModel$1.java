package com.stripe.android.paymentsheet.addresselement;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AutocompleteScreenKt$AutocompleteScreen$viewModel$1 extends Lambda implements Function0<Application> {
    final /* synthetic */ Application $application;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutocompleteScreenKt$AutocompleteScreen$viewModel$1(Application application) {
        super(0);
        this.$application = application;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Application invoke() {
        return this.$application;
    }
}
