package com.stripe.android.view;

import com.stripe.android.C18606R;
import com.stripe.android.view.AddPaymentMethodActivityStarter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/view/AddPaymentMethodView;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AddPaymentMethodActivity$addPaymentMethodView$2 extends Lambda implements Function0<AddPaymentMethodView> {
    final /* synthetic */ AddPaymentMethodActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodActivity$addPaymentMethodView$2(AddPaymentMethodActivity addPaymentMethodActivity) {
        super(0);
        this.this$0 = addPaymentMethodActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AddPaymentMethodView invoke() {
        AddPaymentMethodActivityStarter.Args args;
        AddPaymentMethodView createPaymentMethodView;
        AddPaymentMethodActivity addPaymentMethodActivity = this.this$0;
        args = addPaymentMethodActivity.getArgs();
        createPaymentMethodView = addPaymentMethodActivity.createPaymentMethodView(args);
        createPaymentMethodView.setId(C18606R.C18608id.stripe_add_payment_method_form);
        return createPaymentMethodView;
    }
}
