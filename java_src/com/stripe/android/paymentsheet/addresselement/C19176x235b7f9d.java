package com.stripe.android.paymentsheet.addresselement;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.addresselement.AddressLauncherKt$rememberAddressLauncher$activityResultLauncher$1 */
/* loaded from: classes7.dex */
public /* synthetic */ class C19176x235b7f9d extends FunctionReferenceImpl implements Function1<AddressLauncherResult, Unit> {
    public C19176x235b7f9d(Object obj) {
        super(1, obj, AddressLauncherResultCallback.class, "onAddressLauncherResult", "onAddressLauncherResult(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddressLauncherResult addressLauncherResult) {
        invoke2(addressLauncherResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AddressLauncherResult p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((AddressLauncherResultCallback) this.receiver).onAddressLauncherResult(p0);
    }
}
