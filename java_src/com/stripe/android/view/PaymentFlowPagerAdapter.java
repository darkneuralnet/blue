package com.stripe.android.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.databinding.ShippingInfoPageBinding;
import com.stripe.android.databinding.ShippingMethodPageBinding;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001:\u0001HB=\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\"¢\u0006\u0004\bF\u0010GJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0006H\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R.\u0010(\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u0010.\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00128\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010/R7\u0010=\u001a\b\u0012\u0004\u0012\u00020#052\f\u00106\u001a\b\u0012\u0004\u0012\u00020#058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R/\u0010C\u001a\u0004\u0018\u00010#2\b\u00106\u001a\u0004\u0018\u00010#8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b>\u00108\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\f058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010:¨\u0006I"}, m28432d2 = {"Lcom/stripe/android/view/PaymentFlowPagerAdapter;", "LcE3;", "Landroid/view/ViewGroup;", "collection", "", "position", "", "instantiateItem", "view", "", "destroyItem", "getCount", "Lcom/stripe/android/view/PaymentFlowPage;", "getPageAt$payments_core_release", "(I)Lcom/stripe/android/view/PaymentFlowPage;", "getPageAt", "Landroid/view/View;", "o", "", "isViewFromObject", "", "getPageTitle", "obj", "getItemPosition", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "Lcom/stripe/android/PaymentSessionConfig;", "paymentSessionConfig", "Lcom/stripe/android/PaymentSessionConfig;", "", "", "allowedShippingCountryCodes", "Ljava/util/Set;", "Lkotlin/Function1;", "Lcom/stripe/android/model/ShippingMethod;", "onShippingMethodSelectedCallback", "Lkotlin/jvm/functions/Function1;", "Lcom/stripe/android/model/ShippingInformation;", "value", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "getShippingInformation$payments_core_release", "()Lcom/stripe/android/model/ShippingInformation;", "setShippingInformation$payments_core_release", "(Lcom/stripe/android/model/ShippingInformation;)V", "isShippingInfoSubmitted", "Z", "isShippingInfoSubmitted$payments_core_release", "()Z", "setShippingInfoSubmitted$payments_core_release", "(Z)V", "shouldRecreateShippingMethodsScreen", "", "<set-?>", "shippingMethods$delegate", "Lkotlin/properties/ReadWriteProperty;", "getShippingMethods$payments_core_release", "()Ljava/util/List;", "setShippingMethods$payments_core_release", "(Ljava/util/List;)V", "shippingMethods", "selectedShippingMethod$delegate", "getSelectedShippingMethod$payments_core_release", "()Lcom/stripe/android/model/ShippingMethod;", "setSelectedShippingMethod$payments_core_release", "(Lcom/stripe/android/model/ShippingMethod;)V", "selectedShippingMethod", "getPages", "pages", "<init>", "(Landroid/content/Context;Lcom/stripe/android/PaymentSessionConfig;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V", "PaymentFlowViewHolder", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentFlowPagerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentFlowPagerAdapter.kt\ncom/stripe/android/view/PaymentFlowPagerAdapter\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,189:1\n33#2,3:190\n33#2,3:193\n*S KotlinDebug\n*F\n+ 1 PaymentFlowPagerAdapter.kt\ncom/stripe/android/view/PaymentFlowPagerAdapter\n*L\n49#1:190,3\n55#1:193,3\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentFlowPagerAdapter extends AbstractC39022cE3 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(PaymentFlowPagerAdapter.class, "shippingMethods", "getShippingMethods$payments_core_release()Ljava/util/List;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(PaymentFlowPagerAdapter.class, "selectedShippingMethod", "getSelectedShippingMethod$payments_core_release()Lcom/stripe/android/model/ShippingMethod;", 0))};
    private final Set<String> allowedShippingCountryCodes;
    private final Context context;
    private boolean isShippingInfoSubmitted;
    private final Function1<ShippingMethod, Unit> onShippingMethodSelectedCallback;
    private final PaymentSessionConfig paymentSessionConfig;
    private final ReadWriteProperty selectedShippingMethod$delegate;
    private ShippingInformation shippingInformation;
    private final ReadWriteProperty shippingMethods$delegate;
    private boolean shouldRecreateShippingMethodsScreen;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/model/ShippingMethod;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.view.PaymentFlowPagerAdapter$1 */
    /* loaded from: classes7.dex */
    public static final class C195191 extends Lambda implements Function1<ShippingMethod, Unit> {
        public static final C195191 INSTANCE = new C195191();

        public C195191() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(ShippingMethod it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ShippingMethod shippingMethod) {
            invoke2(shippingMethod);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$D;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "ShippingInformationViewHolder", "ShippingMethodViewHolder", "Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingInformationViewHolder;", "Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingMethodViewHolder;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static abstract class PaymentFlowViewHolder extends RecyclerView.AbstractC11834D {
        public /* synthetic */ PaymentFlowViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingInformationViewHolder;", "Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder;", "root", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "viewBinding", "Lcom/stripe/android/databinding/ShippingInfoPageBinding;", "(Lcom/stripe/android/databinding/ShippingInfoPageBinding;)V", "shippingInfoWidget", "Lcom/stripe/android/view/ShippingInfoWidget;", "bind", "", "paymentSessionConfig", "Lcom/stripe/android/PaymentSessionConfig;", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "allowedShippingCountryCodes", "", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class ShippingInformationViewHolder extends PaymentFlowViewHolder {
            public static final int $stable = 8;
            private final ShippingInfoWidget shippingInfoWidget;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public ShippingInformationViewHolder(ShippingInfoPageBinding viewBinding) {
                super(r0, null);
                Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
                ScrollView root = viewBinding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "viewBinding.root");
                ShippingInfoWidget shippingInfoWidget = viewBinding.shippingInfoWidget;
                Intrinsics.checkNotNullExpressionValue(shippingInfoWidget, "viewBinding.shippingInfoWidget");
                this.shippingInfoWidget = shippingInfoWidget;
            }

            public final void bind(PaymentSessionConfig paymentSessionConfig, ShippingInformation shippingInformation, Set<String> allowedShippingCountryCodes) {
                Intrinsics.checkNotNullParameter(paymentSessionConfig, "paymentSessionConfig");
                Intrinsics.checkNotNullParameter(allowedShippingCountryCodes, "allowedShippingCountryCodes");
                this.shippingInfoWidget.setHiddenFields(paymentSessionConfig.getHiddenShippingInfoFields());
                this.shippingInfoWidget.setOptionalFields(paymentSessionConfig.getOptionalShippingInfoFields());
                this.shippingInfoWidget.setAllowedCountryCodes(allowedShippingCountryCodes);
                this.shippingInfoWidget.populateShippingInfo(shippingInformation);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public ShippingInformationViewHolder(ViewGroup root) {
                this(r3);
                Intrinsics.checkNotNullParameter(root, "root");
                ShippingInfoPageBinding inflate = ShippingInfoPageBinding.inflate(LayoutInflater.from(root.getContext()), root, false);
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n               …  false\n                )");
            }
        }

        @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J2\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingMethodViewHolder;", "Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder;", "root", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "viewBinding", "Lcom/stripe/android/databinding/ShippingMethodPageBinding;", "(Lcom/stripe/android/databinding/ShippingMethodPageBinding;)V", "shippingMethodWidget", "Lcom/stripe/android/view/SelectShippingMethodWidget;", "bind", "", "shippingMethods", "", "Lcom/stripe/android/model/ShippingMethod;", "selectedShippingMethod", "onShippingMethodSelectedCallback", "Lkotlin/Function1;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class ShippingMethodViewHolder extends PaymentFlowViewHolder {
            public static final int $stable = 8;
            private final SelectShippingMethodWidget shippingMethodWidget;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public ShippingMethodViewHolder(ShippingMethodPageBinding viewBinding) {
                super(r0, null);
                Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
                FrameLayout root = viewBinding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "viewBinding.root");
                SelectShippingMethodWidget selectShippingMethodWidget = viewBinding.selectShippingMethodWidget;
                Intrinsics.checkNotNullExpressionValue(selectShippingMethodWidget, "viewBinding.selectShippingMethodWidget");
                this.shippingMethodWidget = selectShippingMethodWidget;
            }

            public final void bind(List<ShippingMethod> shippingMethods, ShippingMethod shippingMethod, Function1<? super ShippingMethod, Unit> onShippingMethodSelectedCallback) {
                Intrinsics.checkNotNullParameter(shippingMethods, "shippingMethods");
                Intrinsics.checkNotNullParameter(onShippingMethodSelectedCallback, "onShippingMethodSelectedCallback");
                this.shippingMethodWidget.setShippingMethods(shippingMethods);
                this.shippingMethodWidget.setShippingMethodSelectedCallback(onShippingMethodSelectedCallback);
                if (shippingMethod != null) {
                    this.shippingMethodWidget.setSelectedShippingMethod(shippingMethod);
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public ShippingMethodViewHolder(ViewGroup root) {
                this(r3);
                Intrinsics.checkNotNullParameter(root, "root");
                ShippingMethodPageBinding inflate = ShippingMethodPageBinding.inflate(LayoutInflater.from(root.getContext()), root, false);
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n               …  false\n                )");
            }
        }

        private PaymentFlowViewHolder(View view) {
            super(view);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentFlowPage.values().length];
            try {
                iArr[PaymentFlowPage.ShippingInfo.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentFlowPage.ShippingMethod.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ PaymentFlowPagerAdapter(Context context, PaymentSessionConfig paymentSessionConfig, Set set, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, paymentSessionConfig, (i & 4) != 0 ? SetsKt__SetsKt.emptySet() : set, (i & 8) != 0 ? C195191.INSTANCE : function1);
    }

    private final List<PaymentFlowPage> getPages() {
        List<PaymentFlowPage> listOfNotNull;
        PaymentFlowPage[] paymentFlowPageArr = new PaymentFlowPage[2];
        PaymentFlowPage paymentFlowPage = PaymentFlowPage.ShippingInfo;
        PaymentFlowPage paymentFlowPage2 = null;
        if (!this.paymentSessionConfig.isShippingInfoRequired()) {
            paymentFlowPage = null;
        }
        boolean z = false;
        paymentFlowPageArr[0] = paymentFlowPage;
        PaymentFlowPage paymentFlowPage3 = PaymentFlowPage.ShippingMethod;
        if (this.paymentSessionConfig.isShippingMethodRequired() && (!this.paymentSessionConfig.isShippingInfoRequired() || this.isShippingInfoSubmitted)) {
            z = true;
        }
        if (z) {
            paymentFlowPage2 = paymentFlowPage3;
        }
        paymentFlowPageArr[1] = paymentFlowPage2;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) paymentFlowPageArr);
        return listOfNotNull;
    }

    @Override // p000.AbstractC39022cE3
    public void destroyItem(ViewGroup collection, int i, Object view) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(view, "view");
        collection.removeView((View) view);
    }

    @Override // p000.AbstractC39022cE3
    public int getCount() {
        return getPages().size();
    }

    @Override // p000.AbstractC39022cE3
    public int getItemPosition(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if ((obj instanceof View) && ((View) obj).getTag() == PaymentFlowPage.ShippingMethod && this.shouldRecreateShippingMethodsScreen) {
            this.shouldRecreateShippingMethodsScreen = false;
            return -2;
        }
        return super.getItemPosition(obj);
    }

    public final PaymentFlowPage getPageAt$payments_core_release(int i) {
        Object orNull;
        orNull = CollectionsKt___CollectionsKt.getOrNull(getPages(), i);
        return (PaymentFlowPage) orNull;
    }

    @Override // p000.AbstractC39022cE3
    public CharSequence getPageTitle(int i) {
        return this.context.getString(getPages().get(i).getTitleResId());
    }

    public final ShippingMethod getSelectedShippingMethod$payments_core_release() {
        return (ShippingMethod) this.selectedShippingMethod$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final ShippingInformation getShippingInformation$payments_core_release() {
        return this.shippingInformation;
    }

    public final List<ShippingMethod> getShippingMethods$payments_core_release() {
        return (List) this.shippingMethods$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // p000.AbstractC39022cE3
    public Object instantiateItem(ViewGroup collection, int i) {
        RecyclerView.AbstractC11834D shippingInformationViewHolder;
        Intrinsics.checkNotNullParameter(collection, "collection");
        PaymentFlowPage paymentFlowPage = getPages().get(i);
        int i2 = WhenMappings.$EnumSwitchMapping$0[paymentFlowPage.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                shippingInformationViewHolder = new PaymentFlowViewHolder.ShippingMethodViewHolder(collection);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            shippingInformationViewHolder = new PaymentFlowViewHolder.ShippingInformationViewHolder(collection);
        }
        if (shippingInformationViewHolder instanceof PaymentFlowViewHolder.ShippingInformationViewHolder) {
            ((PaymentFlowViewHolder.ShippingInformationViewHolder) shippingInformationViewHolder).bind(this.paymentSessionConfig, this.shippingInformation, this.allowedShippingCountryCodes);
        } else if (shippingInformationViewHolder instanceof PaymentFlowViewHolder.ShippingMethodViewHolder) {
            ((PaymentFlowViewHolder.ShippingMethodViewHolder) shippingInformationViewHolder).bind(getShippingMethods$payments_core_release(), getSelectedShippingMethod$payments_core_release(), this.onShippingMethodSelectedCallback);
        }
        collection.addView(shippingInformationViewHolder.itemView);
        shippingInformationViewHolder.itemView.setTag(paymentFlowPage);
        View view = shippingInformationViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "viewHolder.itemView");
        return view;
    }

    public final boolean isShippingInfoSubmitted$payments_core_release() {
        return this.isShippingInfoSubmitted;
    }

    @Override // p000.AbstractC39022cE3
    public boolean isViewFromObject(View view, Object o) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(o, "o");
        return view == o;
    }

    public final void setSelectedShippingMethod$payments_core_release(ShippingMethod shippingMethod) {
        this.selectedShippingMethod$delegate.setValue(this, $$delegatedProperties[1], shippingMethod);
    }

    public final void setShippingInfoSubmitted$payments_core_release(boolean z) {
        this.isShippingInfoSubmitted = z;
        notifyDataSetChanged();
    }

    public final void setShippingInformation$payments_core_release(ShippingInformation shippingInformation) {
        this.shippingInformation = shippingInformation;
        notifyDataSetChanged();
    }

    public final void setShippingMethods$payments_core_release(List<ShippingMethod> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.shippingMethods$delegate.setValue(this, $$delegatedProperties[0], list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentFlowPagerAdapter(Context context, PaymentSessionConfig paymentSessionConfig, Set<String> allowedShippingCountryCodes, Function1<? super ShippingMethod, Unit> onShippingMethodSelectedCallback) {
        final List emptyList;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(paymentSessionConfig, "paymentSessionConfig");
        Intrinsics.checkNotNullParameter(allowedShippingCountryCodes, "allowedShippingCountryCodes");
        Intrinsics.checkNotNullParameter(onShippingMethodSelectedCallback, "onShippingMethodSelectedCallback");
        this.context = context;
        this.paymentSessionConfig = paymentSessionConfig;
        this.allowedShippingCountryCodes = allowedShippingCountryCodes;
        this.onShippingMethodSelectedCallback = onShippingMethodSelectedCallback;
        Delegates delegates = Delegates.INSTANCE;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.shippingMethods$delegate = new ObservableProperty<List<? extends ShippingMethod>>(emptyList) { // from class: com.stripe.android.view.PaymentFlowPagerAdapter$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, List<? extends ShippingMethod> list, List<? extends ShippingMethod> list2) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.shouldRecreateShippingMethodsScreen = !Intrinsics.areEqual(list2, list);
            }
        };
        this.selectedShippingMethod$delegate = new ObservableProperty<ShippingMethod>(null) { // from class: com.stripe.android.view.PaymentFlowPagerAdapter$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, ShippingMethod shippingMethod, ShippingMethod shippingMethod2) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.shouldRecreateShippingMethodsScreen = !Intrinsics.areEqual(shippingMethod2, shippingMethod);
            }
        };
    }
}
