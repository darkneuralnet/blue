package com.stripe.android.paymentsheet;

import android.app.Application;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultRegistry;
import androidx.fragment.app.Fragment;
import com.stripe.android.IntentConfirmationInterceptor;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.core.injection.WeakMapInjectorRegistry;
import com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.PaymentSheetResult;
import com.stripe.android.paymentsheet.PaymentSheetResultCallback;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.forms.FormViewModel;
import com.stripe.android.paymentsheet.injection.DaggerPaymentSheetLauncherComponent;
import com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001%B%\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u0019\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u0018\u0010\u001eB\u0019\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u0018\u0010!B!\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u0018\u0010$J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006&"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;", "Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;", "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;", "mode", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "configuration", "", "present", "LB5;", "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;", "activityResultLauncher", "LB5;", "", "injectorKey", "Ljava/lang/String;", "getInjectorKey$annotations", "()V", "Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;", "paymentSheetLauncherComponent", "Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;", "LLifecycleOwner;", "lifecycleOwner", "Landroid/app/Application;", "application", "<init>", "(LB5;LLifecycleOwner;Landroid/app/Application;)V", "Landroidx/activity/ComponentActivity;", "activity", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "callback", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "(Landroidx/fragment/app/Fragment;Landroidx/activity/result/ActivityResultRegistry;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "Injector", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class DefaultPaymentSheetLauncher implements PaymentSheetLauncher {
    private final AbstractC0407B5<PaymentSheetContractV2.Args> activityResultLauncher;
    private final String injectorKey;
    private final PaymentSheetLauncherComponent paymentSheetLauncherComponent;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$Injector;", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "paymentSheetLauncherComponent", "Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;", "(Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;)V", "inject", "", "injectable", "Lcom/stripe/android/core/injection/Injectable;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Injector implements NonFallbackInjector {
        private final PaymentSheetLauncherComponent paymentSheetLauncherComponent;

        public Injector(PaymentSheetLauncherComponent paymentSheetLauncherComponent) {
            Intrinsics.checkNotNullParameter(paymentSheetLauncherComponent, "paymentSheetLauncherComponent");
            this.paymentSheetLauncherComponent = paymentSheetLauncherComponent;
        }

        @Override // com.stripe.android.core.injection.Injector
        public void inject(Injectable<?> injectable) {
            Intrinsics.checkNotNullParameter(injectable, "injectable");
            if (injectable instanceof PaymentSheetViewModel.Factory) {
                this.paymentSheetLauncherComponent.inject((PaymentSheetViewModel.Factory) injectable);
            } else if (injectable instanceof FormViewModel.Factory) {
                this.paymentSheetLauncherComponent.inject((FormViewModel.Factory) injectable);
            } else {
                throw new IllegalArgumentException("invalid Injectable " + injectable + " requested in " + this);
            }
        }
    }

    public DefaultPaymentSheetLauncher(AbstractC0407B5<PaymentSheetContractV2.Args> activityResultLauncher, LifecycleOwner lifecycleOwner, Application application) {
        Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(application, "application");
        this.activityResultLauncher = activityResultLauncher;
        WeakMapInjectorRegistry weakMapInjectorRegistry = WeakMapInjectorRegistry.INSTANCE;
        String simpleName = Reflection.getOrCreateKotlinClass(PaymentSheetLauncher.class).getSimpleName();
        if (simpleName != null) {
            String nextKey = weakMapInjectorRegistry.nextKey(simpleName);
            this.injectorKey = nextKey;
            PaymentSheetLauncherComponent build = DaggerPaymentSheetLauncherComponent.builder().application(application).injectorKey(nextKey).build();
            this.paymentSheetLauncherComponent = build;
            weakMapInjectorRegistry.register(new Injector(build), nextKey);
            lifecycleOwner.getLifecycle().mo67008a(new VX0() { // from class: com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher.1
                @Override // p000.VX0
                public /* bridge */ /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner2) {
                    super.onCreate(lifecycleOwner2);
                }

                @Override // p000.VX0
                public void onDestroy(LifecycleOwner owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    IntentConfirmationInterceptor.Companion.setCreateIntentCallback(null);
                    super.onDestroy(owner);
                }

                @Override // p000.VX0
                public /* bridge */ /* synthetic */ void onPause(LifecycleOwner lifecycleOwner2) {
                    super.onPause(lifecycleOwner2);
                }

                @Override // p000.VX0
                public /* bridge */ /* synthetic */ void onResume(LifecycleOwner lifecycleOwner2) {
                    super.onResume(lifecycleOwner2);
                }

                @Override // p000.VX0
                public /* bridge */ /* synthetic */ void onStart(LifecycleOwner lifecycleOwner2) {
                    super.onStart(lifecycleOwner2);
                }

                @Override // p000.VX0
                public /* bridge */ /* synthetic */ void onStop(LifecycleOwner lifecycleOwner2) {
                    super.onStop(lifecycleOwner2);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(PaymentSheetResultCallback callback, PaymentSheetResult it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        callback.onPaymentSheetResult(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(PaymentSheetResultCallback callback, PaymentSheetResult it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        callback.onPaymentSheetResult(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(PaymentSheetResultCallback callback, PaymentSheetResult it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        callback.onPaymentSheetResult(it);
    }

    @InjectorKey
    private static /* synthetic */ void getInjectorKey$annotations() {
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheetLauncher
    public void present(PaymentSheet.InitializationMode mode, PaymentSheet.Configuration configuration) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.activityResultLauncher.m114705a(new PaymentSheetContractV2.Args(mode, configuration, null, this.injectorKey, 4, null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DefaultPaymentSheetLauncher(ComponentActivity activity, final PaymentSheetResultCallback callback) {
        this(r4, activity, r0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC0407B5 registerForActivityResult = activity.registerForActivityResult(new PaymentSheetContractV2(), new InterfaceC28515t5() { // from class: oY0
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                DefaultPaymentSheetLauncher._init_$lambda$0(PaymentSheetResultCallback.this, (PaymentSheetResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "activity.registerForActi…SheetResult(it)\n        }");
        Application application = activity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DefaultPaymentSheetLauncher(Fragment fragment, final PaymentSheetResultCallback callback) {
        this(r4, fragment, r0);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC0407B5 registerForActivityResult = fragment.registerForActivityResult(new PaymentSheetContractV2(), new InterfaceC28515t5() { // from class: nY0
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                DefaultPaymentSheetLauncher._init_$lambda$1(PaymentSheetResultCallback.this, (PaymentSheetResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "fragment.registerForActi…SheetResult(it)\n        }");
        Application application = fragment.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "fragment.requireActivity().application");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DefaultPaymentSheetLauncher(Fragment fragment, ActivityResultRegistry registry, final PaymentSheetResultCallback callback) {
        this(r4, fragment, r5);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC0407B5 registerForActivityResult = fragment.registerForActivityResult(new PaymentSheetContractV2(), registry, new InterfaceC28515t5() { // from class: pY0
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                DefaultPaymentSheetLauncher._init_$lambda$2(PaymentSheetResultCallback.this, (PaymentSheetResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "fragment.registerForActi…SheetResult(it)\n        }");
        Application application = fragment.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "fragment.requireActivity().application");
    }
}
