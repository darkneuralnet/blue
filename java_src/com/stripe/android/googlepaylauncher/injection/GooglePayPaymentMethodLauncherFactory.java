package com.stripe.android.googlepaylauncher.injection;

import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH&¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;", "", "LZC0;", "lifecycleScope", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;", "readyCallback", "LB5;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "activityResultLauncher", "", "skipReadyCheck", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;", "create", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public interface GooglePayPaymentMethodLauncherFactory {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ GooglePayPaymentMethodLauncher create$default(GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory, ZC0 zc0, GooglePayPaymentMethodLauncher.Config config, GooglePayPaymentMethodLauncher.ReadyCallback readyCallback, AbstractC0407B5 abstractC0407B5, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 16) != 0) {
                    z = false;
                }
                return googlePayPaymentMethodLauncherFactory.create(zc0, config, readyCallback, abstractC0407B5, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
        }
    }

    GooglePayPaymentMethodLauncher create(ZC0 zc0, GooglePayPaymentMethodLauncher.Config config, GooglePayPaymentMethodLauncher.ReadyCallback readyCallback, AbstractC0407B5<GooglePayPaymentMethodLauncherContract.Args> abstractC0407B5, boolean z);
}
