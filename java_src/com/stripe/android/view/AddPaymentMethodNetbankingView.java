package com.stripe.android.view;

import android.util.AttributeSet;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.C18606R;
import com.stripe.android.databinding.BankListPaymentMethodBinding;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B%\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/view/AddPaymentMethodNetbankingView;", "Lcom/stripe/android/view/AddPaymentMethodView;", "activity", "Landroidx/fragment/app/FragmentActivity;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroidx/fragment/app/FragmentActivity;Landroid/util/AttributeSet;I)V", "createParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "netbankingAdapter", "Lcom/stripe/android/view/AddPaymentMethodListAdapter;", "selectedPosition", "Ljava/lang/Integer;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nAddPaymentMethodNetbankingView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddPaymentMethodNetbankingView.kt\ncom/stripe/android/view/AddPaymentMethodNetbankingView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
/* loaded from: classes7.dex */
public final class AddPaymentMethodNetbankingView extends AddPaymentMethodView {
    public static final Companion Companion = new Companion(null);
    private final AddPaymentMethodListAdapter netbankingAdapter;
    private Integer selectedPosition;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/view/AddPaymentMethodNetbankingView$Companion;", "", "()V", "create", "Lcom/stripe/android/view/AddPaymentMethodNetbankingView;", "activity", "Landroidx/fragment/app/FragmentActivity;", "create$payments_core_release", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AddPaymentMethodNetbankingView create$payments_core_release(FragmentActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new AddPaymentMethodNetbankingView(activity, null, 0, 6, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AddPaymentMethodNetbankingView(FragmentActivity activity) {
        this(activity, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.stripe.android.view.AddPaymentMethodView
    public PaymentMethodCreateParams getCreateParams() {
        boolean z;
        Integer valueOf = Integer.valueOf(this.netbankingAdapter.getSelectedPosition());
        if (valueOf.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        valueOf.intValue();
        return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, new PaymentMethodCreateParams.Netbanking(NetbankingBank.values()[this.netbankingAdapter.getSelectedPosition()].getCode()), (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AddPaymentMethodNetbankingView(FragmentActivity activity, AttributeSet attributeSet) {
        this(activity, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public /* synthetic */ AddPaymentMethodNetbankingView(FragmentActivity fragmentActivity, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AddPaymentMethodNetbankingView(FragmentActivity activity, AttributeSet attributeSet, int i) {
        super(activity, attributeSet, i);
        List list;
        Intrinsics.checkNotNullParameter(activity, "activity");
        ThemeConfig themeConfig = new ThemeConfig(activity);
        list = ArraysKt___ArraysKt.toList(NetbankingBank.values());
        AddPaymentMethodListAdapter addPaymentMethodListAdapter = new AddPaymentMethodListAdapter(themeConfig, list, new AddPaymentMethodNetbankingView$netbankingAdapter$1(this));
        this.netbankingAdapter = addPaymentMethodListAdapter;
        BankListPaymentMethodBinding inflate = BankListPaymentMethodBinding.inflate(activity.getLayoutInflater(), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            act…           true\n        )");
        setId(C18606R.C18608id.stripe_payment_methods_add_netbanking);
        RecyclerView recyclerView = inflate.bankList;
        recyclerView.setAdapter(addPaymentMethodListAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new C11894g());
        Integer num = this.selectedPosition;
        if (num != null) {
            addPaymentMethodListAdapter.updateSelected$payments_core_release(num.intValue());
        }
    }
}
