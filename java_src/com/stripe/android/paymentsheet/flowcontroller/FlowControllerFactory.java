package com.stripe.android.paymentsheet.flowcontroller;

import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.stripe.android.paymentsheet.PaymentOptionCallback;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetResultCallback;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018B!\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u001bB!\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;", "", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;", "create", "LXr6;", "viewModelStoreOwner", "LXr6;", "LLifecycleOwner;", "lifecycleOwner", "LLifecycleOwner;", "Lu5;", "activityResultCaller", "Lu5;", "Lkotlin/Function0;", "", "statusBarColor", "Lkotlin/jvm/functions/Function0;", "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;", "paymentOptionCallback", "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "paymentResultCallback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "<init>", "(LXr6;LLifecycleOwner;Lu5;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "Landroidx/activity/ComponentActivity;", "activity", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class FlowControllerFactory {
    private final InterfaceC29050u5 activityResultCaller;
    private final LifecycleOwner lifecycleOwner;
    private final PaymentOptionCallback paymentOptionCallback;
    private final PaymentSheetResultCallback paymentResultCallback;
    private final Function0<Integer> statusBarColor;
    private final InterfaceC37154Xr6 viewModelStoreOwner;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory$1 */
    /* loaded from: classes7.dex */
    public static final class C191961 extends Lambda implements Function0<Integer> {
        final /* synthetic */ ComponentActivity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191961(ComponentActivity componentActivity) {
            super(0);
            this.$activity = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(this.$activity.getWindow().getStatusBarColor());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory$2 */
    /* loaded from: classes7.dex */
    public static final class C191972 extends Lambda implements Function0<Integer> {
        final /* synthetic */ Fragment $fragment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191972(Fragment fragment) {
            super(0);
            this.$fragment = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            Window window;
            FragmentActivity activity = this.$fragment.getActivity();
            if (activity == null || (window = activity.getWindow()) == null) {
                return null;
            }
            return Integer.valueOf(window.getStatusBarColor());
        }
    }

    public FlowControllerFactory(InterfaceC37154Xr6 viewModelStoreOwner, LifecycleOwner lifecycleOwner, InterfaceC29050u5 activityResultCaller, Function0<Integer> statusBarColor, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentResultCallback) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(statusBarColor, "statusBarColor");
        Intrinsics.checkNotNullParameter(paymentOptionCallback, "paymentOptionCallback");
        Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
        this.viewModelStoreOwner = viewModelStoreOwner;
        this.lifecycleOwner = lifecycleOwner;
        this.activityResultCaller = activityResultCaller;
        this.statusBarColor = statusBarColor;
        this.paymentOptionCallback = paymentOptionCallback;
        this.paymentResultCallback = paymentResultCallback;
    }

    public final PaymentSheet.FlowController create() {
        return DefaultFlowController.Companion.getInstance(this.viewModelStoreOwner, this.lifecycleOwner, this.activityResultCaller, this.statusBarColor, this.paymentOptionCallback, this.paymentResultCallback);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlowControllerFactory(ComponentActivity activity, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentResultCallback) {
        this(activity, activity, activity, new C191961(activity), paymentOptionCallback, paymentResultCallback);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(paymentOptionCallback, "paymentOptionCallback");
        Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlowControllerFactory(Fragment fragment, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentResultCallback) {
        this(fragment, fragment, fragment, new C191972(fragment), paymentOptionCallback, paymentResultCallback);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(paymentOptionCallback, "paymentOptionCallback");
        Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
    }
}
