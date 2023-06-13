package com.stripe.android.view;

import com.stripe.android.view.AddPaymentMethodActivityStarter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "args", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentMethodsActivity$onCreate$6 extends Lambda implements Function1<AddPaymentMethodActivityStarter.Args, Unit> {
    final /* synthetic */ AbstractC0407B5<AddPaymentMethodActivityStarter.Args> $addPaymentMethodLauncher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivity$onCreate$6(AbstractC0407B5<AddPaymentMethodActivityStarter.Args> abstractC0407B5) {
        super(1);
        this.$addPaymentMethodLauncher = abstractC0407B5;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddPaymentMethodActivityStarter.Args args) {
        invoke2(args);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AddPaymentMethodActivityStarter.Args args) {
        if (args != null) {
            this.$addPaymentMethodLauncher.m114705a(args);
        }
    }
}
