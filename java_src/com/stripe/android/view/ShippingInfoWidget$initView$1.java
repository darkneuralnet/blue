package com.stripe.android.view;

import com.stripe.android.core.model.Country;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class ShippingInfoWidget$initView$1 extends FunctionReferenceImpl implements Function1<Country, Unit> {
    public ShippingInfoWidget$initView$1(Object obj) {
        super(1, obj, ShippingInfoWidget.class, "updateConfigForCountry", "updateConfigForCountry(Lcom/stripe/android/core/model/Country;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Country country) {
        invoke2(country);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Country p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((ShippingInfoWidget) this.receiver).updateConfigForCountry(p0);
    }
}
