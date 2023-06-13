package com.stripe.android.paymentsheet.flowcontroller;
/* loaded from: classes7.dex */
public final class FlowControllerModule_ProvideViewModelScopeFactory implements InterfaceC48812sj1<ZC0> {
    private final Y94<FlowControllerViewModel> viewModelProvider;

    public FlowControllerModule_ProvideViewModelScopeFactory(Y94<FlowControllerViewModel> y94) {
        this.viewModelProvider = y94;
    }

    public static FlowControllerModule_ProvideViewModelScopeFactory create(Y94<FlowControllerViewModel> y94) {
        return new FlowControllerModule_ProvideViewModelScopeFactory(y94);
    }

    public static ZC0 provideViewModelScope(FlowControllerViewModel flowControllerViewModel) {
        return (ZC0) C51679xZ3.m5002e(FlowControllerModule.INSTANCE.provideViewModelScope(flowControllerViewModel));
    }

    @Override // p000.Y94
    public ZC0 get() {
        return provideViewModelScope(this.viewModelProvider.get());
    }
}
