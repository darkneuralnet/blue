package com.stripe.android.googlepaylauncher;

import android.app.Application;
import androidx.lifecycle.C11747p;
import androidx.lifecycle.C11750q;
import androidx.lifecycle.C11759u;
import androidx.lifecycle.LiveData;
import co.bird.android.model.LegacyRepairType;
import com.adyen.checkout.components.model.payments.response.Action;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.injection.InjectWithFallbackKt;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.googlepaylauncher.injection.DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.utils.CreationExtrasKtxKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0002;<BA\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b9\u0010:J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0007\u001a\u00020\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0007J\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\bJ\u001b\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R(\u0010/\u001a\u0010\u0012\f\u0012\n .*\u0004\u0018\u00010\u00020\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R$\u00108\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00068@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006="}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel;", "LOr6;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "updateResult", "", "isReadyToPay", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/json/JSONObject;", "createPaymentDataRequest", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "args", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "createTransactionInfo$payments_core_release", "(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;)Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "createTransactionInfo", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "createLoadPaymentDataTask", Action.PAYMENT_DATA, "createPaymentMethod", "(Lcom/google/android/gms/wallet/PaymentData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LEP3;", "paymentsClient", "LEP3;", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "Lcom/stripe/android/GooglePayJsonFactory;", "googlePayJsonFactory", "Lcom/stripe/android/GooglePayJsonFactory;", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "googlePayRepository", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "Landroidx/lifecycle/p;", "savedStateHandle", "Landroidx/lifecycle/p;", "LuX2;", "_googleResult", "LuX2;", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "googlePayResult", "Landroidx/lifecycle/LiveData;", "getGooglePayResult$payments_core_release", "()Landroidx/lifecycle/LiveData;", "value", "getHasLaunched$payments_core_release", "()Z", "setHasLaunched$payments_core_release", "(Z)V", "hasLaunched", "<init>", "(LEP3;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/GooglePayJsonFactory;Lcom/stripe/android/googlepaylauncher/GooglePayRepository;Landroidx/lifecycle/p;)V", "Companion", "Factory", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGooglePayPaymentMethodLauncherViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayPaymentMethodLauncherViewModel.kt\ncom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel\n+ 2 Transformations.kt\nandroidx/lifecycle/TransformationsKt\n*L\n1#1,188:1\n92#2:189\n*S KotlinDebug\n*F\n+ 1 GooglePayPaymentMethodLauncherViewModel.kt\ncom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel\n*L\n52#1:189\n*E\n"})
/* loaded from: classes7.dex */
public final class GooglePayPaymentMethodLauncherViewModel extends AbstractC35048Or6 {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String HAS_LAUNCHED_KEY = "has_launched";
    private final C49882uX2<GooglePayPaymentMethodLauncher.Result> _googleResult;
    private final GooglePayPaymentMethodLauncherContract.Args args;
    private final GooglePayJsonFactory googlePayJsonFactory;
    private final GooglePayRepository googlePayRepository;
    private final LiveData<GooglePayPaymentMethodLauncher.Result> googlePayResult;
    private final EP3 paymentsClient;
    private final ApiRequest.Options requestOptions;
    private final C11747p savedStateHandle;
    private final StripeRepository stripeRepository;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel$Companion;", "", "()V", "HAS_LAUNCHED_KEY", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001bB\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel$Factory;", "Landroidx/lifecycle/u$b;", "Lcom/stripe/android/core/injection/Injectable;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel$Factory$FallbackInjectionParams;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "LFE0;", "extras", "create", "(Ljava/lang/Class;LFE0;)LOr6;", "arg", "Lcom/stripe/android/core/injection/Injector;", "fallbackInitialize", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "args", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelSubcomponent$Builder;", "subComponentBuilder", "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelSubcomponent$Builder;", "getSubComponentBuilder", "()Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelSubcomponent$Builder;", "setSubComponentBuilder", "(Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelSubcomponent$Builder;)V", "<init>", "(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;)V", "FallbackInjectionParams", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b, Injectable<FallbackInjectionParams> {
        private final GooglePayPaymentMethodLauncherContract.Args args;
        public GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder subComponentBuilder;

        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\nHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel$Factory$FallbackInjectionParams;", "", "application", "Landroid/app/Application;", NamedConstantsKt.ENABLE_LOGGING, "", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE, "", "(Landroid/app/Application;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getApplication", "()Landroid/app/Application;", "getEnableLogging", "()Z", "getProductUsage", "()Ljava/util/Set;", "getPublishableKey", "()Ljava/lang/String;", "getStripeAccountId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class FallbackInjectionParams {
            private final Application application;
            private final boolean enableLogging;
            private final Set<String> productUsage;
            private final String publishableKey;
            private final String stripeAccountId;

            public FallbackInjectionParams(Application application, boolean z, String publishableKey, String str, Set<String> productUsage) {
                Intrinsics.checkNotNullParameter(application, "application");
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                this.application = application;
                this.enableLogging = z;
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.productUsage = productUsage;
            }

            public static /* synthetic */ FallbackInjectionParams copy$default(FallbackInjectionParams fallbackInjectionParams, Application application, boolean z, String str, String str2, Set set, int i, Object obj) {
                if ((i & 1) != 0) {
                    application = fallbackInjectionParams.application;
                }
                if ((i & 2) != 0) {
                    z = fallbackInjectionParams.enableLogging;
                }
                boolean z2 = z;
                if ((i & 4) != 0) {
                    str = fallbackInjectionParams.publishableKey;
                }
                String str3 = str;
                if ((i & 8) != 0) {
                    str2 = fallbackInjectionParams.stripeAccountId;
                }
                String str4 = str2;
                Set<String> set2 = set;
                if ((i & 16) != 0) {
                    set2 = fallbackInjectionParams.productUsage;
                }
                return fallbackInjectionParams.copy(application, z2, str3, str4, set2);
            }

            public final Application component1() {
                return this.application;
            }

            public final boolean component2() {
                return this.enableLogging;
            }

            public final String component3() {
                return this.publishableKey;
            }

            public final String component4() {
                return this.stripeAccountId;
            }

            public final Set<String> component5() {
                return this.productUsage;
            }

            public final FallbackInjectionParams copy(Application application, boolean z, String publishableKey, String str, Set<String> productUsage) {
                Intrinsics.checkNotNullParameter(application, "application");
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                return new FallbackInjectionParams(application, z, publishableKey, str, productUsage);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof FallbackInjectionParams) {
                    FallbackInjectionParams fallbackInjectionParams = (FallbackInjectionParams) obj;
                    return Intrinsics.areEqual(this.application, fallbackInjectionParams.application) && this.enableLogging == fallbackInjectionParams.enableLogging && Intrinsics.areEqual(this.publishableKey, fallbackInjectionParams.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, fallbackInjectionParams.stripeAccountId) && Intrinsics.areEqual(this.productUsage, fallbackInjectionParams.productUsage);
                }
                return false;
            }

            public final Application getApplication() {
                return this.application;
            }

            public final boolean getEnableLogging() {
                return this.enableLogging;
            }

            public final Set<String> getProductUsage() {
                return this.productUsage;
            }

            public final String getPublishableKey() {
                return this.publishableKey;
            }

            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = this.application.hashCode() * 31;
                boolean z = this.enableLogging;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                int hashCode2 = (((hashCode + i) * 31) + this.publishableKey.hashCode()) * 31;
                String str = this.stripeAccountId;
                return ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.productUsage.hashCode();
            }

            public String toString() {
                Application application = this.application;
                boolean z = this.enableLogging;
                String str = this.publishableKey;
                String str2 = this.stripeAccountId;
                Set<String> set = this.productUsage;
                return "FallbackInjectionParams(application=" + application + ", enableLogging=" + z + ", publishableKey=" + str + ", stripeAccountId=" + str2 + ", productUsage=" + set + ")";
            }
        }

        public Factory(GooglePayPaymentMethodLauncherContract.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.args = args;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls) {
            return super.create(cls);
        }

        public final GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder getSubComponentBuilder() {
            GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder builder = this.subComponentBuilder;
            if (builder != null) {
                return builder;
            }
            Intrinsics.throwUninitializedPropertyAccessException("subComponentBuilder");
            return null;
        }

        public final void setSubComponentBuilder(GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "<set-?>");
            this.subComponentBuilder = builder;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass, FE0 extras) {
            String publishableKey;
            String stripeAccountId;
            Set<String> of;
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Application requireApplication = CreationExtrasKtxKt.requireApplication(extras);
            C11747p m66936a = C11750q.m66936a(extras);
            GooglePayPaymentMethodLauncherContract.Args.InjectionParams injectionParams$payments_core_release = this.args.getInjectionParams$payments_core_release();
            String injectorKey = injectionParams$payments_core_release != null ? injectionParams$payments_core_release.getInjectorKey() : null;
            GooglePayPaymentMethodLauncherContract.Args.InjectionParams injectionParams$payments_core_release2 = this.args.getInjectionParams$payments_core_release();
            boolean enableLogging = injectionParams$payments_core_release2 != null ? injectionParams$payments_core_release2.getEnableLogging() : false;
            GooglePayPaymentMethodLauncherContract.Args.InjectionParams injectionParams$payments_core_release3 = this.args.getInjectionParams$payments_core_release();
            if (injectionParams$payments_core_release3 == null || (publishableKey = injectionParams$payments_core_release3.getPublishableKey()) == null) {
                publishableKey = PaymentConfiguration.Companion.getInstance(requireApplication).getPublishableKey();
            }
            String str = publishableKey;
            if (this.args.getInjectionParams$payments_core_release() != null) {
                stripeAccountId = this.args.getInjectionParams$payments_core_release().getStripeAccountId();
            } else {
                stripeAccountId = PaymentConfiguration.Companion.getInstance(requireApplication).getStripeAccountId();
            }
            String str2 = stripeAccountId;
            GooglePayPaymentMethodLauncherContract.Args.InjectionParams injectionParams$payments_core_release4 = this.args.getInjectionParams$payments_core_release();
            if (injectionParams$payments_core_release4 == null || (of = injectionParams$payments_core_release4.getProductUsage()) == null) {
                of = SetsKt__SetsJVMKt.setOf(GooglePayPaymentMethodLauncher.PRODUCT_USAGE_TOKEN);
            }
            InjectWithFallbackKt.injectWithFallback(this, injectorKey, new FallbackInjectionParams(requireApplication, enableLogging, str, str2, of));
            GooglePayPaymentMethodLauncherViewModel viewModel = getSubComponentBuilder().args(this.args).savedStateHandle(m66936a).build().getViewModel();
            Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel.Factory.create");
            return viewModel;
        }

        @Override // com.stripe.android.core.injection.Injectable
        public Injector fallbackInitialize(FallbackInjectionParams arg) {
            Intrinsics.checkNotNullParameter(arg, "arg");
            DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent.builder().context(arg.getApplication()).enableLogging(arg.getEnableLogging()).publishableKeyProvider(new C18951xc46f15d1(arg)).stripeAccountIdProvider(new C18952xc46f15d2(arg)).productUsage(arg.getProductUsage()).googlePayConfig(this.args.getConfig$payments_core_release()).build().inject(this);
            return null;
        }
    }

    public GooglePayPaymentMethodLauncherViewModel(EP3 paymentsClient, ApiRequest.Options requestOptions, GooglePayPaymentMethodLauncherContract.Args args, StripeRepository stripeRepository, GooglePayJsonFactory googlePayJsonFactory, GooglePayRepository googlePayRepository, C11747p savedStateHandle) {
        Intrinsics.checkNotNullParameter(paymentsClient, "paymentsClient");
        Intrinsics.checkNotNullParameter(requestOptions, "requestOptions");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(googlePayJsonFactory, "googlePayJsonFactory");
        Intrinsics.checkNotNullParameter(googlePayRepository, "googlePayRepository");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.paymentsClient = paymentsClient;
        this.requestOptions = requestOptions;
        this.args = args;
        this.stripeRepository = stripeRepository;
        this.googlePayJsonFactory = googlePayJsonFactory;
        this.googlePayRepository = googlePayRepository;
        this.savedStateHandle = savedStateHandle;
        C49882uX2<GooglePayPaymentMethodLauncher.Result> c49882uX2 = new C49882uX2<>();
        this._googleResult = c49882uX2;
        LiveData<GooglePayPaymentMethodLauncher.Result> m10730a = C49669u96.m10730a(c49882uX2);
        Intrinsics.checkNotNullExpressionValue(m10730a, "distinctUntilChanged(this)");
        this.googlePayResult = m10730a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createLoadPaymentDataTask(Continuation<? super Task<PaymentData>> continuation) {
        C18953xf31ea2a8 c18953xf31ea2a8;
        Object obj;
        Object coroutine_suspended;
        int i;
        GooglePayPaymentMethodLauncherViewModel googlePayPaymentMethodLauncherViewModel;
        if (continuation instanceof C18953xf31ea2a8) {
            c18953xf31ea2a8 = (C18953xf31ea2a8) continuation;
            int i2 = c18953xf31ea2a8.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c18953xf31ea2a8.label = i2 - Integer.MIN_VALUE;
                obj = c18953xf31ea2a8.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c18953xf31ea2a8.label;
                if (i == 0) {
                    if (i == 1) {
                        googlePayPaymentMethodLauncherViewModel = (GooglePayPaymentMethodLauncherViewModel) c18953xf31ea2a8.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    c18953xf31ea2a8.L$0 = this;
                    c18953xf31ea2a8.label = 1;
                    obj = isReadyToPay(c18953xf31ea2a8);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    googlePayPaymentMethodLauncherViewModel = this;
                }
                if (!((Boolean) obj).booleanValue()) {
                    Task<PaymentData> m109034j = googlePayPaymentMethodLauncherViewModel.paymentsClient.m109034j(PaymentDataRequest.m50523s(googlePayPaymentMethodLauncherViewModel.createPaymentDataRequest().toString()));
                    Intrinsics.checkNotNullExpressionValue(m109034j, "paymentsClient.loadPayme…t().toString())\n        )");
                    return m109034j;
                }
                throw new IllegalStateException("Google Pay is unavailable.".toString());
            }
        }
        c18953xf31ea2a8 = new C18953xf31ea2a8(this, continuation);
        obj = c18953xf31ea2a8.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c18953xf31ea2a8.label;
        if (i == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public final JSONObject createPaymentDataRequest() {
        return GooglePayJsonFactory.createPaymentDataRequest$default(this.googlePayJsonFactory, createTransactionInfo$payments_core_release(this.args), ConvertKt.convert(this.args.getConfig$payments_core_release().getBillingAddressConfig()), null, this.args.getConfig$payments_core_release().isEmailRequired(), new GooglePayJsonFactory.MerchantInfo(this.args.getConfig$payments_core_release().getMerchantName()), Boolean.valueOf(this.args.getConfig$payments_core_release().getAllowCreditCards()), 4, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(5:5|6|7|(1:(1:10)(2:28|29))(3:30|31|(1:33))|(3:12|13|(2:15|16)(4:18|(1:20)(2:23|(1:25))|21|22))(2:26|27)))|36|6|7|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
        r6 = kotlin.Result.Companion;
        r5 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:11:0x0025, B:20:0x0054, B:21:0x005b, B:22:0x0066, B:16:0x0043), top: B:36:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:11:0x0025, B:20:0x0054, B:21:0x005b, B:22:0x0066, B:16:0x0043), top: B:36:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createPaymentMethod(PaymentData paymentData, Continuation<? super GooglePayPaymentMethodLauncher.Result> continuation) {
        GooglePayPaymentMethodLauncherViewModel$createPaymentMethod$1 googlePayPaymentMethodLauncherViewModel$createPaymentMethod$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof GooglePayPaymentMethodLauncherViewModel$createPaymentMethod$1) {
            googlePayPaymentMethodLauncherViewModel$createPaymentMethod$1 = (GooglePayPaymentMethodLauncherViewModel$createPaymentMethod$1) continuation;
            int i2 = googlePayPaymentMethodLauncherViewModel$createPaymentMethod$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googlePayPaymentMethodLauncherViewModel$createPaymentMethod$1.label = i2 - Integer.MIN_VALUE;
                obj = googlePayPaymentMethodLauncherViewModel$createPaymentMethod$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = googlePayPaymentMethodLauncherViewModel$createPaymentMethod$1.label;
                int i3 = 1;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    PaymentMethodCreateParams createFromGooglePay = PaymentMethodCreateParams.Companion.createFromGooglePay(new JSONObject(paymentData.m50524u()));
                    Result.Companion companion = Result.Companion;
                    StripeRepository stripeRepository = this.stripeRepository;
                    ApiRequest.Options options = this.requestOptions;
                    googlePayPaymentMethodLauncherViewModel$createPaymentMethod$1.label = 1;
                    obj = stripeRepository.createPaymentMethod(createFromGooglePay, options, googlePayPaymentMethodLauncherViewModel$createPaymentMethod$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (obj == null) {
                    Object m116783constructorimpl = Result.m116783constructorimpl((PaymentMethod) obj);
                    Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        return new GooglePayPaymentMethodLauncher.Result.Completed((PaymentMethod) m116783constructorimpl);
                    }
                    if (m116786exceptionOrNullimpl instanceof APIConnectionException) {
                        i3 = 3;
                    } else if (m116786exceptionOrNullimpl instanceof InvalidRequestException) {
                        i3 = 2;
                    }
                    return new GooglePayPaymentMethodLauncher.Result.Failed(m116786exceptionOrNullimpl, i3);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        googlePayPaymentMethodLauncherViewModel$createPaymentMethod$1 = new GooglePayPaymentMethodLauncherViewModel$createPaymentMethod$1(this, continuation);
        obj = googlePayPaymentMethodLauncherViewModel$createPaymentMethod$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = googlePayPaymentMethodLauncherViewModel$createPaymentMethod$1.label;
        int i32 = 1;
        if (i == 0) {
        }
        if (obj == null) {
        }
    }

    public final GooglePayJsonFactory.TransactionInfo createTransactionInfo$payments_core_release(GooglePayPaymentMethodLauncherContract.Args args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return new GooglePayJsonFactory.TransactionInfo(args.getCurrencyCode$payments_core_release(), GooglePayJsonFactory.TransactionInfo.TotalPriceStatus.Estimated, args.getConfig$payments_core_release().getMerchantCountryCode(), args.getTransactionId$payments_core_release(), Integer.valueOf(args.getAmount$payments_core_release()), null, GooglePayJsonFactory.TransactionInfo.CheckoutOption.Default, 32, null);
    }

    public final LiveData<GooglePayPaymentMethodLauncher.Result> getGooglePayResult$payments_core_release() {
        return this.googlePayResult;
    }

    public final boolean getHasLaunched$payments_core_release() {
        return Intrinsics.areEqual(this.savedStateHandle.m66947f("has_launched"), Boolean.TRUE);
    }

    public final Object isReadyToPay(Continuation<? super Boolean> continuation) {
        return C36708Vu1.m79248w(this.googlePayRepository.isReady(), continuation);
    }

    public final void setHasLaunched$payments_core_release(boolean z) {
        this.savedStateHandle.m66940m("has_launched", Boolean.valueOf(z));
    }

    public final void updateResult(GooglePayPaymentMethodLauncher.Result result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this._googleResult.setValue(result);
    }
}
