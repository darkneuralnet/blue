package com.stripe.android.view;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.DialogInterfaceC10997b;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.C18606R;
import com.stripe.android.CustomerSession;
import com.stripe.android.core.StripeError;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.view.DeletePaymentMethodDialogFactory;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001 BT\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u001bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;", "", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "Landroidx/appcompat/app/b;", "create", "", "onDeletedPaymentMethod$payments_core_release", "(Lcom/stripe/android/model/PaymentMethod;)V", "onDeletedPaymentMethod", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "Lcom/stripe/android/view/PaymentMethodsAdapter;", "adapter", "Lcom/stripe/android/view/PaymentMethodsAdapter;", "Lcom/stripe/android/view/CardDisplayTextFactory;", "cardDisplayTextFactory", "Lcom/stripe/android/view/CardDisplayTextFactory;", "Lkotlin/Result;", "Lcom/stripe/android/CustomerSession;", "customerSession", "Ljava/lang/Object;", "", "", NamedConstantsKt.PRODUCT_USAGE, "Ljava/util/Set;", "Lkotlin/Function1;", "onDeletedPaymentMethodCallback", "Lkotlin/jvm/functions/Function1;", "<init>", "(Landroid/content/Context;Lcom/stripe/android/view/PaymentMethodsAdapter;Lcom/stripe/android/view/CardDisplayTextFactory;Ljava/lang/Object;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V", "PaymentMethodDeleteListener", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class DeletePaymentMethodDialogFactory {
    private final PaymentMethodsAdapter adapter;
    private final CardDisplayTextFactory cardDisplayTextFactory;
    private final Context context;
    private final Object customerSession;
    private final Function1<PaymentMethod, Unit> onDeletedPaymentMethodCallback;
    private final Set<String> productUsage;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/view/DeletePaymentMethodDialogFactory$PaymentMethodDeleteListener;", "Lcom/stripe/android/CustomerSession$PaymentMethodRetrievalListener;", "()V", "onError", "", "errorCode", "", "errorMessage", "", "stripeError", "Lcom/stripe/android/core/StripeError;", "onPaymentMethodRetrieved", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class PaymentMethodDeleteListener implements CustomerSession.PaymentMethodRetrievalListener {
        @Override // com.stripe.android.CustomerSession.RetrievalListener
        public void onError(int i, String errorMessage, StripeError stripeError) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        }

        @Override // com.stripe.android.CustomerSession.PaymentMethodRetrievalListener
        public void onPaymentMethodRetrieved(PaymentMethod paymentMethod) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeletePaymentMethodDialogFactory(Context context, PaymentMethodsAdapter adapter, CardDisplayTextFactory cardDisplayTextFactory, Object obj, Set<String> productUsage, Function1<? super PaymentMethod, Unit> onDeletedPaymentMethodCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(cardDisplayTextFactory, "cardDisplayTextFactory");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        Intrinsics.checkNotNullParameter(onDeletedPaymentMethodCallback, "onDeletedPaymentMethodCallback");
        this.context = context;
        this.adapter = adapter;
        this.cardDisplayTextFactory = cardDisplayTextFactory;
        this.customerSession = obj;
        this.productUsage = productUsage;
        this.onDeletedPaymentMethodCallback = onDeletedPaymentMethodCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void create$lambda$1(DeletePaymentMethodDialogFactory this$0, PaymentMethod paymentMethod, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(paymentMethod, "$paymentMethod");
        this$0.onDeletedPaymentMethod$payments_core_release(paymentMethod);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void create$lambda$2(DeletePaymentMethodDialogFactory this$0, PaymentMethod paymentMethod, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(paymentMethod, "$paymentMethod");
        this$0.adapter.resetPaymentMethod$payments_core_release(paymentMethod);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void create$lambda$3(DeletePaymentMethodDialogFactory this$0, PaymentMethod paymentMethod, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(paymentMethod, "$paymentMethod");
        this$0.adapter.resetPaymentMethod$payments_core_release(paymentMethod);
    }

    public final /* synthetic */ DialogInterfaceC10997b create(final PaymentMethod paymentMethod) {
        String str;
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        PaymentMethod.Card card = paymentMethod.card;
        if (card != null) {
            str = this.cardDisplayTextFactory.createUnstyled$payments_core_release(card);
        } else {
            str = null;
        }
        DialogInterfaceC10997b mo70301a = new DialogInterfaceC10997b.C10998a(this.context, C18606R.style.AlertDialogStyle).mo70286p(C18606R.string.delete_payment_method_prompt_title).mo70294h(str).mo70289m(17039370, new DialogInterface.OnClickListener() { // from class: VZ0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DeletePaymentMethodDialogFactory.create$lambda$1(DeletePaymentMethodDialogFactory.this, paymentMethod, dialogInterface, i);
            }
        }).mo70293i(17039360, new DialogInterface.OnClickListener() { // from class: WZ0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DeletePaymentMethodDialogFactory.create$lambda$2(DeletePaymentMethodDialogFactory.this, paymentMethod, dialogInterface, i);
            }
        }).mo70291k(new DialogInterface.OnCancelListener() { // from class: XZ0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                DeletePaymentMethodDialogFactory.create$lambda$3(DeletePaymentMethodDialogFactory.this, paymentMethod, dialogInterface);
            }
        }).mo70301a();
        Intrinsics.checkNotNullExpressionValue(mo70301a, "Builder(context, R.style…  }\n            .create()");
        return mo70301a;
    }

    public final /* synthetic */ void onDeletedPaymentMethod$payments_core_release(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.adapter.deletePaymentMethod$payments_core_release(paymentMethod);
        String str = paymentMethod.f75358id;
        if (str != null) {
            Object obj = this.customerSession;
            if (Result.m116789isFailureimpl(obj)) {
                obj = null;
            }
            CustomerSession customerSession = (CustomerSession) obj;
            if (customerSession != null) {
                customerSession.detachPaymentMethod$payments_core_release(str, this.productUsage, new PaymentMethodDeleteListener());
            }
        }
        this.onDeletedPaymentMethodCallback.invoke(paymentMethod);
    }
}
