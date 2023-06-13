package com.stripe.android.view;

import android.util.AttributeSet;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.C18606R;
import com.stripe.android.databinding.BankListPaymentMethodBinding;
import com.stripe.android.model.BankStatuses;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.AddPaymentMethodFpxView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB%\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/view/AddPaymentMethodFpxView;", "Lcom/stripe/android/view/AddPaymentMethodView;", "activity", "Landroidx/fragment/app/FragmentActivity;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroidx/fragment/app/FragmentActivity;Landroid/util/AttributeSet;I)V", "createParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "fpxAdapter", "Lcom/stripe/android/view/AddPaymentMethodListAdapter;", "fpxBankStatuses", "Lcom/stripe/android/model/BankStatuses;", "viewModel", "Lcom/stripe/android/view/FpxViewModel;", "getViewModel", "()Lcom/stripe/android/view/FpxViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getItem", "Lcom/stripe/android/view/FpxBank;", "position", "onFpxBankStatusesUpdated", "", "updateStatuses", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nAddPaymentMethodFpxView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddPaymentMethodFpxView.kt\ncom/stripe/android/view/AddPaymentMethodFpxView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1#2:105\n819#3:106\n847#3,2:107\n1855#3,2:109\n*S KotlinDebug\n*F\n+ 1 AddPaymentMethodFpxView.kt\ncom/stripe/android/view/AddPaymentMethodFpxView\n*L\n85#1:106\n85#1:107,2\n88#1:109,2\n*E\n"})
/* loaded from: classes7.dex */
public final class AddPaymentMethodFpxView extends AddPaymentMethodView {
    public static final Companion Companion = new Companion(null);
    private final AddPaymentMethodListAdapter fpxAdapter;
    private BankStatuses fpxBankStatuses;
    private final Lazy viewModel$delegate;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/view/AddPaymentMethodFpxView$Companion;", "", "()V", "create", "Lcom/stripe/android/view/AddPaymentMethodFpxView;", "activity", "Landroidx/fragment/app/FragmentActivity;", "create$payments_core_release", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AddPaymentMethodFpxView create$payments_core_release(FragmentActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new AddPaymentMethodFpxView(activity, null, 0, 6, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AddPaymentMethodFpxView(FragmentActivity activity) {
        this(activity, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    private final FpxBank getItem(int i) {
        return FpxBank.values()[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FpxViewModel getViewModel() {
        return (FpxViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFpxBankStatusesUpdated(BankStatuses bankStatuses) {
        if (bankStatuses != null) {
            updateStatuses(bankStatuses);
        }
    }

    private final void updateStatuses(BankStatuses bankStatuses) {
        IntRange indices;
        this.fpxBankStatuses = bankStatuses;
        this.fpxAdapter.setBankStatuses$payments_core_release(bankStatuses);
        indices = ArraysKt___ArraysKt.getIndices(FpxBank.values());
        ArrayList<Number> arrayList = new ArrayList();
        for (Integer num : indices) {
            if (!bankStatuses.isOnline$payments_core_release(getItem(num.intValue()))) {
                arrayList.add(num);
            }
        }
        for (Number number : arrayList) {
            this.fpxAdapter.notifyAdapterItemChanged(number.intValue());
        }
    }

    @Override // com.stripe.android.view.AddPaymentMethodView
    public PaymentMethodCreateParams getCreateParams() {
        boolean z;
        Integer valueOf = Integer.valueOf(this.fpxAdapter.getSelectedPosition());
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
        return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, new PaymentMethodCreateParams.Fpx(FpxBank.values()[valueOf.intValue()].getCode()), (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AddPaymentMethodFpxView(FragmentActivity activity, AttributeSet attributeSet) {
        this(activity, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public /* synthetic */ AddPaymentMethodFpxView(FragmentActivity fragmentActivity, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AddPaymentMethodFpxView(FragmentActivity activity, AttributeSet attributeSet, int i) {
        super(activity, attributeSet, i);
        List list;
        Lazy lazy;
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.fpxBankStatuses = new BankStatuses(null, 1, null);
        ThemeConfig themeConfig = new ThemeConfig(activity);
        list = ArraysKt___ArraysKt.toList(FpxBank.values());
        AddPaymentMethodListAdapter addPaymentMethodListAdapter = new AddPaymentMethodListAdapter(themeConfig, list, new AddPaymentMethodFpxView$fpxAdapter$1(this));
        this.fpxAdapter = addPaymentMethodListAdapter;
        lazy = LazyKt__LazyJVMKt.lazy(new AddPaymentMethodFpxView$viewModel$2(activity));
        this.viewModel$delegate = lazy;
        BankListPaymentMethodBinding inflate = BankListPaymentMethodBinding.inflate(activity.getLayoutInflater(), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            act…           true\n        )");
        setId(C18606R.C18608id.stripe_payment_methods_add_fpx);
        getViewModel().getFpxBankStatues$payments_core_release().observe(activity, new InterfaceC41056fe3() { // from class: q7
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                AddPaymentMethodFpxView.this.onFpxBankStatusesUpdated((BankStatuses) obj);
            }
        });
        RecyclerView recyclerView = inflate.bankList;
        recyclerView.setAdapter(addPaymentMethodListAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new C11894g());
        Integer selectedPosition$payments_core_release = getViewModel().getSelectedPosition$payments_core_release();
        if (selectedPosition$payments_core_release != null) {
            addPaymentMethodListAdapter.updateSelected$payments_core_release(selectedPosition$payments_core_release.intValue());
        }
    }
}
