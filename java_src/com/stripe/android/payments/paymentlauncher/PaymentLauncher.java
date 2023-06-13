package com.stripe.android.payments.paymentlauncher;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.compose.p003ui.platform.C11411h;
import androidx.fragment.app.Fragment;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;", "", "confirm", "", "params", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "handleNextActionForPaymentIntent", "clientSecret", "", "handleNextActionForSetupIntent", "Companion", "PaymentResultCallback", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface PaymentLauncher {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007J+\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;", "", "Landroidx/activity/ComponentActivity;", "activity", "", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;", "callback", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;", "create", "Landroidx/fragment/app/Fragment;", "fragment", "createForCompose", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;LEt0;II)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;", "rememberLauncher", "<init>", "()V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPaymentLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentLauncher.kt\ncom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,134:1\n76#2:135\n76#2:136\n50#3:137\n49#3:138\n955#4,6:139\n*S KotlinDebug\n*F\n+ 1 PaymentLauncher.kt\ncom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion\n*L\n97#1:135\n119#1:136\n125#1:137\n125#1:138\n125#1:139,6\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ PaymentLauncher create$default(Companion companion, ComponentActivity componentActivity, String str, String str2, PaymentResultCallback paymentResultCallback, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.create(componentActivity, str, str2, paymentResultCallback);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentLauncher create(ComponentActivity activity, String publishableKey, PaymentResultCallback callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(callback, "callback");
            return create$default(this, activity, publishableKey, (String) null, callback, 4, (Object) null);
        }

        @Deprecated(message = "This method creates a new PaymentLauncher object every time it is called, evenduring recompositions.", replaceWith = @ReplaceWith(expression = "PaymentLauncher.rememberLauncher(publishableKey, stripeAccountId, callback)", imports = {}))
        public final PaymentLauncher createForCompose(String publishableKey, String str, PaymentResultCallback callback, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(callback, "callback");
            interfaceC32720Et0.mo89638F(1395685941);
            if ((i2 & 2) != 0) {
                str = null;
            }
            PaymentLauncher create = new PaymentLauncherFactory((Context) interfaceC32720Et0.mo89572c(C11411h.m68324g()), C1362D5.m110957a(new PaymentLauncherContract(), new PaymentLauncher$Companion$createForCompose$1(callback), interfaceC32720Et0, 0)).create(publishableKey, str);
            interfaceC32720Et0.mo89605Q();
            return create;
        }

        public final PaymentLauncher rememberLauncher(String publishableKey, String str, PaymentResultCallback callback, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(callback, "callback");
            interfaceC32720Et0.mo89638F(27599581);
            if ((i2 & 2) != 0) {
                str = null;
            }
            Context context = (Context) interfaceC32720Et0.mo89572c(C11411h.m68324g());
            TH2 m110957a = C1362D5.m110957a(new PaymentLauncherContract(), new C19131xefe21b1a(callback), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(-3686552);
            boolean mo89539n = interfaceC32720Et0.mo89539n(publishableKey) | interfaceC32720Et0.mo89539n(str);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new PaymentLauncherFactory(context, m110957a).create(publishableKey, str);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            PaymentLauncher paymentLauncher = (PaymentLauncher) mo89635G;
            interfaceC32720Et0.mo89605Q();
            return paymentLauncher;
        }

        public static /* synthetic */ PaymentLauncher create$default(Companion companion, Fragment fragment, String str, String str2, PaymentResultCallback paymentResultCallback, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.create(fragment, str, str2, paymentResultCallback);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentLauncher create(Fragment fragment, String publishableKey, PaymentResultCallback callback) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(callback, "callback");
            return create$default(this, fragment, publishableKey, (String) null, callback, 4, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentLauncher create(ComponentActivity activity, String publishableKey, String str, PaymentResultCallback callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(callback, "callback");
            return new PaymentLauncherFactory(activity, callback).create(publishableKey, str);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentLauncher create(Fragment fragment, String publishableKey, String str, PaymentResultCallback callback) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(callback, "callback");
            return new PaymentLauncherFactory(fragment, callback).create(publishableKey, str);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;", "", "onPaymentResult", "", "paymentResult", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface PaymentResultCallback {
        void onPaymentResult(PaymentResult paymentResult);
    }

    @JvmStatic
    @JvmOverloads
    static PaymentLauncher create(ComponentActivity componentActivity, String str, PaymentResultCallback paymentResultCallback) {
        return Companion.create(componentActivity, str, paymentResultCallback);
    }

    void confirm(ConfirmPaymentIntentParams confirmPaymentIntentParams);

    void confirm(ConfirmSetupIntentParams confirmSetupIntentParams);

    void handleNextActionForPaymentIntent(String str);

    void handleNextActionForSetupIntent(String str);

    @JvmStatic
    @JvmOverloads
    static PaymentLauncher create(ComponentActivity componentActivity, String str, String str2, PaymentResultCallback paymentResultCallback) {
        return Companion.create(componentActivity, str, str2, paymentResultCallback);
    }

    @JvmStatic
    @JvmOverloads
    static PaymentLauncher create(Fragment fragment, String str, PaymentResultCallback paymentResultCallback) {
        return Companion.create(fragment, str, paymentResultCallback);
    }

    @JvmStatic
    @JvmOverloads
    static PaymentLauncher create(Fragment fragment, String str, String str2, PaymentResultCallback paymentResultCallback) {
        return Companion.create(fragment, str, str2, paymentResultCallback);
    }
}
