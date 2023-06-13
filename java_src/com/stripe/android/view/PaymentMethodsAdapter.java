package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.C18606R;
import com.stripe.android.databinding.AddPaymentMethodRowBinding;
import com.stripe.android.databinding.GooglePayRowBinding;
import com.stripe.android.databinding.MaskedCardRowBinding;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.AddPaymentMethodActivityStarter;
import com.stripe.android.view.PaymentMethodsActivityStarter;
import com.stripe.android.view.PaymentMethodsAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import p000.InterfaceC28996u2;
@Metadata(m28433d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004defgBI\u0012\u0006\u0010`\u001a\u00020_\u0012\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0016\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010=\u0012\b\b\u0002\u00106\u001a\u00020\u0005\u0012\b\b\u0002\u00108\u001a\u00020\u0005\u0012\b\b\u0002\u00109\u001a\u00020\u0005¢\u0006\u0004\bb\u0010cJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001d\u0010\u001b\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001c\u001a\u00020\u0003H\u0016J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0017\u0010$\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\"\u0010#J\u0018\u0010&\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0003H\u0016J\u0017\u0010*\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u0017H\u0000¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u0017H\u0000¢\u0006\u0004\b+\u0010)J\u0017\u0010/\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b-\u0010.J\u0019\u00102\u001a\u0004\u0018\u00010\u00032\u0006\u0010'\u001a\u00020\u0017H\u0000¢\u0006\u0004\b0\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u00109\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u00105\u001a\u0004\b;\u0010<R$\u0010>\u001a\u0004\u0018\u00010=8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010E\u001a\u0004\u0018\u00010D8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020N0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020N0Q8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010V\u001a\u00020N8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010Z\u001a\u00020N8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010W\u001a\u0004\b[\u0010YR\u0016\u0010^\u001a\u0004\u0018\u00010\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006h"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$D;", "", "position", "", "isGooglePayPosition", "isPaymentMethodsPosition", "", "updateSelectedPaymentMethod", "Landroid/view/ViewGroup;", "parent", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddCardPaymentMethodViewHolder;", "createAddCardPaymentMethodViewHolder", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddFpxPaymentMethodViewHolder;", "createAddFpxPaymentMethodViewHolder", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;", "createPaymentMethodViewHolder", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$GooglePayViewHolder;", "createGooglePayViewHolder", "getPaymentMethodIndex", "getAddableTypesPosition", "", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethods", "setPaymentMethods$payments_core_release", "(Ljava/util/List;)V", "setPaymentMethods", "getItemCount", "getItemViewType", "", "getItemId", "holder", "onBindViewHolder", "onPositionClicked$payments_core_release", "(I)V", "onPositionClicked", "viewType", "onCreateViewHolder", "paymentMethod", "deletePaymentMethod$payments_core_release", "(Lcom/stripe/android/model/PaymentMethod;)V", "deletePaymentMethod", "resetPaymentMethod$payments_core_release", "resetPaymentMethod", "getPaymentMethodAtPosition$payments_core_release", "(I)Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethodAtPosition", "getPosition$payments_core_release", "(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/Integer;", "getPosition", "Lcom/stripe/android/model/PaymentMethod$Type;", "addableTypes", "Ljava/util/List;", "shouldShowGooglePay", "Z", "useGooglePay", "canDeletePaymentMethods", "", "getPaymentMethods$payments_core_release", "()Ljava/util/List;", "", "selectedPaymentMethodId", "Ljava/lang/String;", "getSelectedPaymentMethodId$payments_core_release", "()Ljava/lang/String;", "setSelectedPaymentMethodId$payments_core_release", "(Ljava/lang/String;)V", "Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;", "getListener$payments_core_release", "()Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;", "setListener$payments_core_release", "(Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;)V", "googlePayCount", "I", "LuX2;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "_addPaymentMethodArgs", "LuX2;", "Landroidx/lifecycle/LiveData;", "addPaymentMethodArgs", "Landroidx/lifecycle/LiveData;", "getAddPaymentMethodArgs", "()Landroidx/lifecycle/LiveData;", "addCardArgs", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "getAddCardArgs$payments_core_release", "()Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "addFpxArgs", "getAddFpxArgs$payments_core_release", "getSelectedPaymentMethod$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod;", "selectedPaymentMethod", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "intentArgs", "initiallySelectedPaymentMethodId", "<init>", "(Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;Ljava/util/List;Ljava/lang/String;ZZZ)V", "Companion", "Listener", "ViewHolder", "ViewType", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentMethodsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsAdapter.kt\ncom/stripe/android/view/PaymentMethodsAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,387:1\n1#2:388\n288#3,2:389\n350#3,7:391\n*S KotlinDebug\n*F\n+ 1 PaymentMethodsAdapter.kt\ncom/stripe/android/view/PaymentMethodsAdapter\n*L\n37#1:389,2\n165#1:391,7\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentMethodsAdapter extends RecyclerView.AbstractC11843h<RecyclerView.AbstractC11834D> {
    public static final Companion Companion = new Companion(null);
    private static final long GOOGLE_PAY_ITEM_ID = -2057760476;
    private final C49882uX2<AddPaymentMethodActivityStarter.Args> _addPaymentMethodArgs;
    private final AddPaymentMethodActivityStarter.Args addCardArgs;
    private final AddPaymentMethodActivityStarter.Args addFpxArgs;
    private final LiveData<AddPaymentMethodActivityStarter.Args> addPaymentMethodArgs;
    private final List<PaymentMethod.Type> addableTypes;
    private final boolean canDeletePaymentMethods;
    private final int googlePayCount;
    private Listener listener;
    private final List<PaymentMethod> paymentMethods;
    private String selectedPaymentMethodId;
    private final boolean shouldShowGooglePay;
    private final boolean useGooglePay;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$Companion;", "", "()V", "GOOGLE_PAY_ITEM_ID", "", "getGOOGLE_PAY_ITEM_ID$payments_core_release", "()J", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getGOOGLE_PAY_ITEM_ID$payments_core_release() {
            return PaymentMethodsAdapter.GOOGLE_PAY_ITEM_ID;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;", "", "onDeletePaymentMethodAction", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "onGooglePayClick", "onPaymentMethodClick", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface Listener {
        void onDeletePaymentMethodAction(PaymentMethod paymentMethod);

        void onGooglePayClick();

        void onPaymentMethodClick(PaymentMethod paymentMethod);
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\n¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$D;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "AddCardPaymentMethodViewHolder", "AddFpxPaymentMethodViewHolder", "GooglePayViewHolder", "PaymentMethodViewHolder", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static abstract class ViewHolder extends RecyclerView.AbstractC11834D {
        public /* synthetic */ ViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "viewBinding", "Lcom/stripe/android/databinding/MaskedCardRowBinding;", "(Lcom/stripe/android/databinding/MaskedCardRowBinding;)V", "setPaymentMethod", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "setSelected", "selected", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class PaymentMethodViewHolder extends ViewHolder {
            private final MaskedCardRowBinding viewBinding;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PaymentMethodViewHolder(MaskedCardRowBinding viewBinding) {
                super(r0, null);
                Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
                FrameLayout root = viewBinding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "viewBinding.root");
                this.viewBinding = viewBinding;
            }

            public final void setPaymentMethod(PaymentMethod paymentMethod) {
                Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                this.viewBinding.maskedCardItem.setPaymentMethod(paymentMethod);
            }

            public final void setSelected(boolean z) {
                this.viewBinding.maskedCardItem.setSelected(z);
                this.itemView.setSelected(z);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PaymentMethodViewHolder(ViewGroup parent) {
                this(r3);
                Intrinsics.checkNotNullParameter(parent, "parent");
                MaskedCardRowBinding inflate = MaskedCardRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n               …  false\n                )");
            }
        }

        private ViewHolder(View view) {
            super(view);
        }

        @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\f\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$GooglePayViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$D;", "", "isSelected", "", "bind", "Lcom/stripe/android/databinding/GooglePayRowBinding;", "viewBinding", "Lcom/stripe/android/databinding/GooglePayRowBinding;", "Lcom/stripe/android/view/ThemeConfig;", "themeConfig", "Lcom/stripe/android/view/ThemeConfig;", "<init>", "(Lcom/stripe/android/databinding/GooglePayRowBinding;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/ViewGroup;", "parent", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final class GooglePayViewHolder extends RecyclerView.AbstractC11834D {
            private final ThemeConfig themeConfig;
            private final GooglePayRowBinding viewBinding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GooglePayViewHolder(GooglePayRowBinding viewBinding) {
                super(viewBinding.getRoot());
                Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
                this.viewBinding = viewBinding;
                Context context = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                ThemeConfig themeConfig = new ThemeConfig(context);
                this.themeConfig = themeConfig;
                C51668xY1.m5035c(viewBinding.checkIcon, ColorStateList.valueOf(themeConfig.getTintColor$payments_core_release(true)));
            }

            public final void bind(boolean z) {
                int i;
                this.viewBinding.label.setTextColor(ColorStateList.valueOf(this.themeConfig.getTextColor$payments_core_release(z)));
                AppCompatImageView appCompatImageView = this.viewBinding.checkIcon;
                if (z) {
                    i = 0;
                } else {
                    i = 4;
                }
                appCompatImageView.setVisibility(i);
                this.itemView.setSelected(z);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public GooglePayViewHolder(Context context, ViewGroup parent) {
                this(r2);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(parent, "parent");
                GooglePayRowBinding inflate = GooglePayRowBinding.inflate(LayoutInflater.from(context), parent, false);
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n               …  false\n                )");
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddCardPaymentMethodViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$D;", "Lcom/stripe/android/databinding/AddPaymentMethodRowBinding;", "viewBinding", "<init>", "(Lcom/stripe/android/databinding/AddPaymentMethodRowBinding;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/ViewGroup;", "parent", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final class AddCardPaymentMethodViewHolder extends RecyclerView.AbstractC11834D {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddCardPaymentMethodViewHolder(AddPaymentMethodRowBinding viewBinding) {
                super(viewBinding.getRoot());
                Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
                this.itemView.setId(C18606R.C18608id.stripe_payment_methods_add_card);
                View view = this.itemView;
                Resources resources = view.getResources();
                int i = C18606R.string.payment_method_add_new_card;
                view.setContentDescription(resources.getString(i));
                viewBinding.label.setText(this.itemView.getResources().getString(i));
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public AddCardPaymentMethodViewHolder(Context context, ViewGroup parent) {
                this(r2);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(parent, "parent");
                AddPaymentMethodRowBinding inflate = AddPaymentMethodRowBinding.inflate(LayoutInflater.from(context), parent, false);
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n               …  false\n                )");
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddFpxPaymentMethodViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$D;", "Lcom/stripe/android/databinding/AddPaymentMethodRowBinding;", "viewBinding", "<init>", "(Lcom/stripe/android/databinding/AddPaymentMethodRowBinding;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/ViewGroup;", "parent", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* loaded from: classes7.dex */
        public static final class AddFpxPaymentMethodViewHolder extends RecyclerView.AbstractC11834D {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddFpxPaymentMethodViewHolder(AddPaymentMethodRowBinding viewBinding) {
                super(viewBinding.getRoot());
                Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
                this.itemView.setId(C18606R.C18608id.stripe_payment_methods_add_fpx);
                View view = this.itemView;
                Resources resources = view.getResources();
                int i = C18606R.string.payment_method_add_new_fpx;
                view.setContentDescription(resources.getString(i));
                viewBinding.label.setText(this.itemView.getResources().getString(i));
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public AddFpxPaymentMethodViewHolder(Context context, ViewGroup parent) {
                this(r2);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(parent, "parent");
                AddPaymentMethodRowBinding inflate = AddPaymentMethodRowBinding.inflate(LayoutInflater.from(context), parent, false);
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n               …  false\n                )");
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewType;", "", "(Ljava/lang/String;I)V", "Card", "AddCard", "AddFpx", "GooglePay", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum ViewType {
        Card,
        AddCard,
        AddFpx,
        GooglePay
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaymentMethod.Type.values().length];
            try {
                iArr[PaymentMethod.Type.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.Type.Fpx.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ViewType.values().length];
            try {
                iArr2[ViewType.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ViewType.AddCard.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ViewType.AddFpx.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ViewType.GooglePay.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ PaymentMethodsAdapter(PaymentMethodsActivityStarter.Args args, List list, String str, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(args, (i & 2) != 0 ? CollectionsKt__CollectionsJVMKt.listOf(PaymentMethod.Type.Card) : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? true : z3);
    }

    private final ViewHolder.AddCardPaymentMethodViewHolder createAddCardPaymentMethodViewHolder(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        return new ViewHolder.AddCardPaymentMethodViewHolder(context, viewGroup);
    }

    private final ViewHolder.AddFpxPaymentMethodViewHolder createAddFpxPaymentMethodViewHolder(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        return new ViewHolder.AddFpxPaymentMethodViewHolder(context, viewGroup);
    }

    private final ViewHolder.GooglePayViewHolder createGooglePayViewHolder(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        return new ViewHolder.GooglePayViewHolder(context, viewGroup);
    }

    private final ViewHolder.PaymentMethodViewHolder createPaymentMethodViewHolder(ViewGroup viewGroup) {
        final ViewHolder.PaymentMethodViewHolder paymentMethodViewHolder = new ViewHolder.PaymentMethodViewHolder(viewGroup);
        if (this.canDeletePaymentMethods) {
            C38790bq6.m62496c(paymentMethodViewHolder.itemView, viewGroup.getContext().getString(C18606R.string.delete_payment_method), new InterfaceC28996u2() { // from class: vO3
                @Override // p000.InterfaceC28996u2
                /* renamed from: a */
                public final boolean mo8762a(View view, InterfaceC28996u2.AbstractC28997a abstractC28997a) {
                    boolean createPaymentMethodViewHolder$lambda$8;
                    createPaymentMethodViewHolder$lambda$8 = PaymentMethodsAdapter.createPaymentMethodViewHolder$lambda$8(PaymentMethodsAdapter.this, paymentMethodViewHolder, view, abstractC28997a);
                    return createPaymentMethodViewHolder$lambda$8;
                }
            });
        }
        return paymentMethodViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createPaymentMethodViewHolder$lambda$8(PaymentMethodsAdapter this$0, ViewHolder.PaymentMethodViewHolder viewHolder, View view, InterfaceC28996u2.AbstractC28997a abstractC28997a) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
        Listener listener = this$0.listener;
        if (listener != null) {
            listener.onDeletePaymentMethodAction(this$0.getPaymentMethodAtPosition$payments_core_release(viewHolder.getBindingAdapterPosition()));
            return true;
        }
        return true;
    }

    private final int getAddableTypesPosition(int i) {
        return (i - this.paymentMethods.size()) - this.googlePayCount;
    }

    private final int getPaymentMethodIndex(int i) {
        return i - this.googlePayCount;
    }

    private final boolean isGooglePayPosition(int i) {
        return this.shouldShowGooglePay && i == 0;
    }

    private final boolean isPaymentMethodsPosition(int i) {
        IntRange until;
        if (this.shouldShowGooglePay) {
            until = new IntRange(1, this.paymentMethods.size());
        } else {
            until = RangesKt___RangesKt.until(0, this.paymentMethods.size());
        }
        int first = until.getFirst();
        if (i <= until.getLast() && first <= i) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$3(PaymentMethodsAdapter this$0, RecyclerView.AbstractC11834D holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        this$0.onPositionClicked$payments_core_release(((ViewHolder.PaymentMethodViewHolder) holder).getBindingAdapterPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$4(PaymentMethodsAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectedPaymentMethodId = null;
        Listener listener = this$0.listener;
        if (listener != null) {
            listener.onGooglePayClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$5(PaymentMethodsAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0._addPaymentMethodArgs.setValue(this$0.addCardArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$6(PaymentMethodsAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0._addPaymentMethodArgs.setValue(this$0.addFpxArgs);
    }

    private final void updateSelectedPaymentMethod(int i) {
        Object orNull;
        String str;
        Iterator<PaymentMethod> it = this.paymentMethods.iterator();
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                if (Intrinsics.areEqual(it.next().f75358id, this.selectedPaymentMethodId)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 != i) {
            notifyItemChanged(i2);
            orNull = CollectionsKt___CollectionsKt.getOrNull(this.paymentMethods, i);
            PaymentMethod paymentMethod = (PaymentMethod) orNull;
            if (paymentMethod != null) {
                str = paymentMethod.f75358id;
            } else {
                str = null;
            }
            this.selectedPaymentMethodId = str;
        }
        notifyItemChanged(i);
    }

    public final /* synthetic */ void deletePaymentMethod$payments_core_release(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Integer position$payments_core_release = getPosition$payments_core_release(paymentMethod);
        if (position$payments_core_release != null) {
            int intValue = position$payments_core_release.intValue();
            this.paymentMethods.remove(paymentMethod);
            notifyItemRemoved(intValue);
        }
    }

    public final AddPaymentMethodActivityStarter.Args getAddCardArgs$payments_core_release() {
        return this.addCardArgs;
    }

    public final AddPaymentMethodActivityStarter.Args getAddFpxArgs$payments_core_release() {
        return this.addFpxArgs;
    }

    public final LiveData<AddPaymentMethodActivityStarter.Args> getAddPaymentMethodArgs() {
        return this.addPaymentMethodArgs;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.paymentMethods.size() + this.addableTypes.size() + this.googlePayCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public long getItemId(int i) {
        int hashCode;
        if (isGooglePayPosition(i)) {
            return GOOGLE_PAY_ITEM_ID;
        }
        if (isPaymentMethodsPosition(i)) {
            hashCode = getPaymentMethodAtPosition$payments_core_release(i).hashCode();
        } else {
            hashCode = this.addableTypes.get(getAddableTypesPosition(i)).code.hashCode();
        }
        return hashCode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemViewType(int i) {
        if (isGooglePayPosition(i)) {
            return ViewType.GooglePay.ordinal();
        }
        if (isPaymentMethodsPosition(i)) {
            if (PaymentMethod.Type.Card == getPaymentMethodAtPosition$payments_core_release(i).type) {
                return ViewType.Card.ordinal();
            }
            return super.getItemViewType(i);
        }
        PaymentMethod.Type type = this.addableTypes.get(getAddableTypesPosition(i));
        int i2 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return ViewType.AddFpx.ordinal();
            }
            String str = type.code;
            throw new IllegalArgumentException("Unsupported PaymentMethod type: " + str);
        }
        return ViewType.AddCard.ordinal();
    }

    public final Listener getListener$payments_core_release() {
        return this.listener;
    }

    public final /* synthetic */ PaymentMethod getPaymentMethodAtPosition$payments_core_release(int i) {
        return this.paymentMethods.get(getPaymentMethodIndex(i));
    }

    public final List<PaymentMethod> getPaymentMethods$payments_core_release() {
        return this.paymentMethods;
    }

    public final Integer getPosition$payments_core_release(PaymentMethod paymentMethod) {
        boolean z;
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Integer valueOf = Integer.valueOf(this.paymentMethods.indexOf(paymentMethod));
        if (valueOf.intValue() >= 0) {
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
        return Integer.valueOf(valueOf.intValue() + this.googlePayCount);
    }

    public final PaymentMethod getSelectedPaymentMethod$payments_core_release() {
        String str = this.selectedPaymentMethodId;
        Object obj = null;
        if (str == null) {
            return null;
        }
        Iterator<T> it = this.paymentMethods.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((PaymentMethod) next).f75358id, str)) {
                obj = next;
                break;
            }
        }
        return (PaymentMethod) obj;
    }

    public final String getSelectedPaymentMethodId$payments_core_release() {
        return this.selectedPaymentMethodId;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(final RecyclerView.AbstractC11834D holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof ViewHolder.PaymentMethodViewHolder) {
            PaymentMethod paymentMethodAtPosition$payments_core_release = getPaymentMethodAtPosition$payments_core_release(i);
            ViewHolder.PaymentMethodViewHolder paymentMethodViewHolder = (ViewHolder.PaymentMethodViewHolder) holder;
            paymentMethodViewHolder.setPaymentMethod(paymentMethodAtPosition$payments_core_release);
            paymentMethodViewHolder.setSelected(Intrinsics.areEqual(paymentMethodAtPosition$payments_core_release.f75358id, this.selectedPaymentMethodId));
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: wO3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaymentMethodsAdapter.onBindViewHolder$lambda$3(PaymentMethodsAdapter.this, holder, view);
                }
            });
        } else if (holder instanceof ViewHolder.GooglePayViewHolder) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: xO3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaymentMethodsAdapter.onBindViewHolder$lambda$4(PaymentMethodsAdapter.this, view);
                }
            });
            ((ViewHolder.GooglePayViewHolder) holder).bind(this.useGooglePay);
        } else if (holder instanceof ViewHolder.AddCardPaymentMethodViewHolder) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: yO3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaymentMethodsAdapter.onBindViewHolder$lambda$5(PaymentMethodsAdapter.this, view);
                }
            });
        } else if (holder instanceof ViewHolder.AddFpxPaymentMethodViewHolder) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: zO3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaymentMethodsAdapter.onBindViewHolder$lambda$6(PaymentMethodsAdapter.this, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public RecyclerView.AbstractC11834D onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i2 = WhenMappings.$EnumSwitchMapping$1[ViewType.values()[i].ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        return createGooglePayViewHolder(parent);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return createAddFpxPaymentMethodViewHolder(parent);
            }
            return createAddCardPaymentMethodViewHolder(parent);
        }
        return createPaymentMethodViewHolder(parent);
    }

    public final /* synthetic */ void onPositionClicked$payments_core_release(int i) {
        updateSelectedPaymentMethod(i);
        Listener listener = this.listener;
        if (listener != null) {
            listener.onPaymentMethodClick(getPaymentMethodAtPosition$payments_core_release(i));
        }
    }

    public final /* synthetic */ void resetPaymentMethod$payments_core_release(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Integer position$payments_core_release = getPosition$payments_core_release(paymentMethod);
        if (position$payments_core_release != null) {
            notifyItemChanged(position$payments_core_release.intValue());
        }
    }

    public final void setListener$payments_core_release(Listener listener) {
        this.listener = listener;
    }

    public final /* synthetic */ void setPaymentMethods$payments_core_release(List paymentMethods) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        this.paymentMethods.clear();
        this.paymentMethods.addAll(paymentMethods);
        notifyDataSetChanged();
    }

    public final void setSelectedPaymentMethodId$payments_core_release(String str) {
        this.selectedPaymentMethodId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodsAdapter(PaymentMethodsActivityStarter.Args intentArgs, List<? extends PaymentMethod.Type> addableTypes, String str, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(intentArgs, "intentArgs");
        Intrinsics.checkNotNullParameter(addableTypes, "addableTypes");
        this.addableTypes = addableTypes;
        this.shouldShowGooglePay = z;
        this.useGooglePay = z2;
        this.canDeletePaymentMethods = z3;
        this.paymentMethods = new ArrayList();
        this.selectedPaymentMethodId = str;
        r4.intValue();
        r4 = z ? 1 : null;
        this.googlePayCount = r4 != null ? r4.intValue() : 0;
        C49882uX2<AddPaymentMethodActivityStarter.Args> c49882uX2 = new C49882uX2<>();
        this._addPaymentMethodArgs = c49882uX2;
        this.addPaymentMethodArgs = c49882uX2;
        this.addCardArgs = new AddPaymentMethodActivityStarter.Args.Builder().setBillingAddressFields(intentArgs.getBillingAddressFields$payments_core_release()).setShouldAttachToCustomer(true).setIsPaymentSessionActive$payments_core_release(intentArgs.isPaymentSessionActive$payments_core_release()).setPaymentMethodType(PaymentMethod.Type.Card).setAddPaymentMethodFooter(intentArgs.getAddPaymentMethodFooterLayoutId()).setPaymentConfiguration(intentArgs.getPaymentConfiguration$payments_core_release()).setWindowFlags(intentArgs.getWindowFlags$payments_core_release()).build();
        this.addFpxArgs = new AddPaymentMethodActivityStarter.Args.Builder().setIsPaymentSessionActive$payments_core_release(intentArgs.isPaymentSessionActive$payments_core_release()).setPaymentMethodType(PaymentMethod.Type.Fpx).setPaymentConfiguration(intentArgs.getPaymentConfiguration$payments_core_release()).build();
        setHasStableIds(true);
    }
}
