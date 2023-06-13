package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.C11925l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodsRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/l$h;", "callback", "", "attachItemTouchHelper$payments_core_release", "(Landroidx/recyclerview/widget/l$h;)V", "attachItemTouchHelper", "Lkotlin/Function1;", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethodSelectedCallback", "Lkotlin/jvm/functions/Function1;", "getPaymentMethodSelectedCallback$payments_core_release", "()Lkotlin/jvm/functions/Function1;", "setPaymentMethodSelectedCallback$payments_core_release", "(Lkotlin/jvm/functions/Function1;)V", "tappedPaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "getTappedPaymentMethod$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod;", "setTappedPaymentMethod$payments_core_release", "(Lcom/stripe/android/model/PaymentMethod;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PaymentMethodsRecyclerView extends RecyclerView {
    private Function1<? super PaymentMethod, Unit> paymentMethodSelectedCallback;
    private PaymentMethod tappedPaymentMethod;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PaymentMethodsRecyclerView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final /* synthetic */ void attachItemTouchHelper$payments_core_release(C11925l.AbstractC11936h callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        new C11925l(callback).m66204g(this);
    }

    public final Function1<PaymentMethod, Unit> getPaymentMethodSelectedCallback$payments_core_release() {
        return this.paymentMethodSelectedCallback;
    }

    public final PaymentMethod getTappedPaymentMethod$payments_core_release() {
        return this.tappedPaymentMethod;
    }

    public final void setPaymentMethodSelectedCallback$payments_core_release(Function1<? super PaymentMethod, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.paymentMethodSelectedCallback = function1;
    }

    public final void setTappedPaymentMethod$payments_core_release(PaymentMethod paymentMethod) {
        this.tappedPaymentMethod = paymentMethod;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PaymentMethodsRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PaymentMethodsRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PaymentMethodsRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.paymentMethodSelectedCallback = PaymentMethodsRecyclerView$paymentMethodSelectedCallback$1.INSTANCE;
        setHasFixedSize(false);
        setLayoutManager(new LinearLayoutManager(context));
        setItemAnimator(new C11894g() { // from class: com.stripe.android.view.PaymentMethodsRecyclerView.1
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11849m
            public void onAnimationFinished(RecyclerView.AbstractC11834D viewHolder) {
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                super.onAnimationFinished(viewHolder);
                PaymentMethod tappedPaymentMethod$payments_core_release = PaymentMethodsRecyclerView.this.getTappedPaymentMethod$payments_core_release();
                if (tappedPaymentMethod$payments_core_release != null) {
                    PaymentMethodsRecyclerView.this.getPaymentMethodSelectedCallback$payments_core_release().invoke(tappedPaymentMethod$payments_core_release);
                }
                PaymentMethodsRecyclerView.this.setTappedPaymentMethod$payments_core_release(null);
            }
        });
    }
}
