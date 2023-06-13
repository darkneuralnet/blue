package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPollingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollingScreen.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,261:1\n62#2,5:262\n*S KotlinDebug\n*F\n+ 1 PollingScreen.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1\n*L\n60#1:262,5\n*E\n"})
/* loaded from: classes7.dex */
public final class PollingScreenKt$PollingScreen$1 extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ PollingViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollingScreenKt$PollingScreen$1(PollingViewModel pollingViewModel, LifecycleOwner lifecycleOwner) {
        super(1);
        this.$viewModel = pollingViewModel;
        this.$lifecycleOwner = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final PollingLifecycleObserver pollingLifecycleObserver = new PollingLifecycleObserver(this.$viewModel);
        this.$lifecycleOwner.getLifecycle().mo67008a(pollingLifecycleObserver);
        final LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
        return new InterfaceC44288l51() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreenKt$PollingScreen$1$invoke$$inlined$onDispose$1
            @Override // p000.InterfaceC44288l51
            public void dispose() {
                LifecycleOwner.this.getLifecycle().mo67006d(pollingLifecycleObserver);
            }
        };
    }
}
