package com.stripe.android.payments.paymentlauncher;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.payments.paymentlauncher.PaymentLauncher;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u000e\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u000e\u0010\u0017J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;", "", "", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;", "create", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "LB5;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "hostActivityLauncher", "LB5;", "<init>", "(Landroid/content/Context;LB5;)V", "Landroidx/activity/ComponentActivity;", "activity", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;", "callback", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PaymentLauncherFactory {
    public static final int $stable = 8;
    private final Context context;
    private final AbstractC0407B5<PaymentLauncherContract.Args> hostActivityLauncher;

    public PaymentLauncherFactory(Context context, AbstractC0407B5<PaymentLauncherContract.Args> hostActivityLauncher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hostActivityLauncher, "hostActivityLauncher");
        this.context = context;
        this.hostActivityLauncher = hostActivityLauncher;
    }

    public static /* synthetic */ PaymentLauncher create$default(PaymentLauncherFactory paymentLauncherFactory, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return paymentLauncherFactory.create(str, str2);
    }

    public final PaymentLauncher create(String publishableKey, String str) {
        Set of;
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        of = SetsKt__SetsJVMKt.setOf("PaymentLauncher");
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = new PaymentAnalyticsRequestFactory(this.context, new PaymentLauncherFactory$create$analyticsRequestFactory$1(publishableKey), of);
        return new StripePaymentLauncher(new PaymentLauncherFactory$create$1(publishableKey), new PaymentLauncherFactory$create$2(str), this.hostActivityLauncher, this.context, false, T41.m84377b(), T41.m84376c(), new StripeApiRepository(this.context, new PaymentLauncherFactory$create$3(publishableKey), null, null, null, null, null, null, null, null, paymentAnalyticsRequestFactory, null, null, null, null, 31740, null), paymentAnalyticsRequestFactory, of);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaymentLauncherFactory(ComponentActivity activity, final PaymentLauncher.PaymentResultCallback callback) {
        this(r0, r4);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "activity.applicationContext");
        AbstractC0407B5 registerForActivityResult = activity.registerForActivityResult(new PaymentLauncherContract(), new InterfaceC28515t5() { // from class: yM3
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                PaymentLauncher.PaymentResultCallback.this.onPaymentResult((PaymentResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "activity.registerForActi…onPaymentResult\n        )");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaymentLauncherFactory(Fragment fragment, final PaymentLauncher.PaymentResultCallback callback) {
        this(r0, r4);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Context applicationContext = fragment.requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "fragment.requireActivity().applicationContext");
        AbstractC0407B5 registerForActivityResult = fragment.registerForActivityResult(new PaymentLauncherContract(), new InterfaceC28515t5() { // from class: yM3
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                PaymentLauncher.PaymentResultCallback.this.onPaymentResult((PaymentResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "fragment.registerForActi…onPaymentResult\n        )");
    }
}
