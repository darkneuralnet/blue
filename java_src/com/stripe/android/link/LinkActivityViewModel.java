package com.stripe.android.link;

import android.app.Application;
import androidx.lifecycle.C11759u;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.injection.InjectWithFallbackKt;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.confirmation.ConfirmationManager;
import com.stripe.android.link.injection.DaggerLinkViewModelFactoryComponent;
import com.stripe.android.link.injection.LinkViewModelFactoryComponent;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.model.Navigator;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.utils.CreationExtrasKtxKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001*B)\b\u0001\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006+"}, m28432d2 = {"Lcom/stripe/android/link/LinkActivityViewModel;", "LOr6;", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "", "assertStripeIntentIsValid", "Lu5;", "activityResultCaller", "setupPaymentLauncher", "onBackPressed", "logout", "unregisterFromActivity", "Lcom/stripe/android/link/account/LinkAccountManager;", "linkAccountManager", "Lcom/stripe/android/link/account/LinkAccountManager;", "getLinkAccountManager", "()Lcom/stripe/android/link/account/LinkAccountManager;", "Lcom/stripe/android/link/model/Navigator;", "navigator", "Lcom/stripe/android/link/model/Navigator;", "getNavigator", "()Lcom/stripe/android/link/model/Navigator;", "Lcom/stripe/android/link/confirmation/ConfirmationManager;", "confirmationManager", "Lcom/stripe/android/link/confirmation/ConfirmationManager;", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "injector", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "getInjector", "()Lcom/stripe/android/core/injection/NonFallbackInjector;", "setInjector", "(Lcom/stripe/android/core/injection/NonFallbackInjector;)V", "LtP5;", "Lcom/stripe/android/link/model/LinkAccount;", "linkAccount", "LtP5;", "getLinkAccount", "()LtP5;", "Lcom/stripe/android/link/LinkActivityContract$Args;", "args", "<init>", "(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/link/confirmation/ConfirmationManager;)V", "Factory", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class LinkActivityViewModel extends AbstractC35048Or6 {
    private final ConfirmationManager confirmationManager;
    public NonFallbackInjector injector;
    private final InterfaceC49220tP5<LinkAccount> linkAccount;
    private final LinkAccountManager linkAccountManager;
    private final Navigator navigator;

    @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001cB\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/link/LinkActivityViewModel$Factory;", "Landroidx/lifecycle/u$b;", "Lcom/stripe/android/core/injection/Injectable;", "Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "LFE0;", "extras", "create", "(Ljava/lang/Class;LFE0;)LOr6;", "arg", "Lcom/stripe/android/core/injection/Injector;", "fallbackInitialize", "Lkotlin/Function0;", "Lcom/stripe/android/link/LinkActivityContract$Args;", "starterArgsSupplier", "Lkotlin/jvm/functions/Function0;", "Lcom/stripe/android/link/LinkActivityViewModel;", "viewModel", "Lcom/stripe/android/link/LinkActivityViewModel;", "getViewModel", "()Lcom/stripe/android/link/LinkActivityViewModel;", "setViewModel", "(Lcom/stripe/android/link/LinkActivityViewModel;)V", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "FallbackInitializeParam", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b, Injectable<FallbackInitializeParam> {
        private final Function0<LinkActivityContract.Args> starterArgsSupplier;
        public LinkActivityViewModel viewModel;

        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\fHÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fHÆ\u0001J\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006%"}, m28432d2 = {"Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;", "", "application", "Landroid/app/Application;", "starterArgs", "Lcom/stripe/android/link/LinkActivityContract$Args;", NamedConstantsKt.ENABLE_LOGGING, "", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE, "", "(Landroid/app/Application;Lcom/stripe/android/link/LinkActivityContract$Args;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getApplication", "()Landroid/app/Application;", "getEnableLogging", "()Z", "getProductUsage", "()Ljava/util/Set;", "getPublishableKey", "()Ljava/lang/String;", "getStarterArgs", "()Lcom/stripe/android/link/LinkActivityContract$Args;", "getStripeAccountId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class FallbackInitializeParam {
            private final Application application;
            private final boolean enableLogging;
            private final Set<String> productUsage;
            private final String publishableKey;
            private final LinkActivityContract.Args starterArgs;
            private final String stripeAccountId;

            public FallbackInitializeParam(Application application, LinkActivityContract.Args starterArgs, boolean z, String publishableKey, String str, Set<String> productUsage) {
                Intrinsics.checkNotNullParameter(application, "application");
                Intrinsics.checkNotNullParameter(starterArgs, "starterArgs");
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                this.application = application;
                this.starterArgs = starterArgs;
                this.enableLogging = z;
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.productUsage = productUsage;
            }

            public static /* synthetic */ FallbackInitializeParam copy$default(FallbackInitializeParam fallbackInitializeParam, Application application, LinkActivityContract.Args args, boolean z, String str, String str2, Set set, int i, Object obj) {
                if ((i & 1) != 0) {
                    application = fallbackInitializeParam.application;
                }
                if ((i & 2) != 0) {
                    args = fallbackInitializeParam.starterArgs;
                }
                LinkActivityContract.Args args2 = args;
                if ((i & 4) != 0) {
                    z = fallbackInitializeParam.enableLogging;
                }
                boolean z2 = z;
                if ((i & 8) != 0) {
                    str = fallbackInitializeParam.publishableKey;
                }
                String str3 = str;
                if ((i & 16) != 0) {
                    str2 = fallbackInitializeParam.stripeAccountId;
                }
                String str4 = str2;
                Set<String> set2 = set;
                if ((i & 32) != 0) {
                    set2 = fallbackInitializeParam.productUsage;
                }
                return fallbackInitializeParam.copy(application, args2, z2, str3, str4, set2);
            }

            public final Application component1() {
                return this.application;
            }

            public final LinkActivityContract.Args component2() {
                return this.starterArgs;
            }

            public final boolean component3() {
                return this.enableLogging;
            }

            public final String component4() {
                return this.publishableKey;
            }

            public final String component5() {
                return this.stripeAccountId;
            }

            public final Set<String> component6() {
                return this.productUsage;
            }

            public final FallbackInitializeParam copy(Application application, LinkActivityContract.Args starterArgs, boolean z, String publishableKey, String str, Set<String> productUsage) {
                Intrinsics.checkNotNullParameter(application, "application");
                Intrinsics.checkNotNullParameter(starterArgs, "starterArgs");
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                return new FallbackInitializeParam(application, starterArgs, z, publishableKey, str, productUsage);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof FallbackInitializeParam) {
                    FallbackInitializeParam fallbackInitializeParam = (FallbackInitializeParam) obj;
                    return Intrinsics.areEqual(this.application, fallbackInitializeParam.application) && Intrinsics.areEqual(this.starterArgs, fallbackInitializeParam.starterArgs) && this.enableLogging == fallbackInitializeParam.enableLogging && Intrinsics.areEqual(this.publishableKey, fallbackInitializeParam.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, fallbackInitializeParam.stripeAccountId) && Intrinsics.areEqual(this.productUsage, fallbackInitializeParam.productUsage);
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

            public final LinkActivityContract.Args getStarterArgs() {
                return this.starterArgs;
            }

            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = ((this.application.hashCode() * 31) + this.starterArgs.hashCode()) * 31;
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
                LinkActivityContract.Args args = this.starterArgs;
                boolean z = this.enableLogging;
                String str = this.publishableKey;
                String str2 = this.stripeAccountId;
                Set<String> set = this.productUsage;
                return "FallbackInitializeParam(application=" + application + ", starterArgs=" + args + ", enableLogging=" + z + ", publishableKey=" + str + ", stripeAccountId=" + str2 + ", productUsage=" + set + ")";
            }
        }

        public Factory(Function0<LinkActivityContract.Args> starterArgsSupplier) {
            Intrinsics.checkNotNullParameter(starterArgsSupplier, "starterArgsSupplier");
            this.starterArgsSupplier = starterArgsSupplier;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls) {
            return super.create(cls);
        }

        public final LinkActivityViewModel getViewModel() {
            LinkActivityViewModel linkActivityViewModel = this.viewModel;
            if (linkActivityViewModel != null) {
                return linkActivityViewModel;
            }
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            return null;
        }

        public final void setViewModel(LinkActivityViewModel linkActivityViewModel) {
            Intrinsics.checkNotNullParameter(linkActivityViewModel, "<set-?>");
            this.viewModel = linkActivityViewModel;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass, FE0 extras) {
            String publishableKey;
            String stripeAccountId;
            Set<String> emptySet;
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            LinkActivityContract.Args invoke = this.starterArgsSupplier.invoke();
            Application requireApplication = CreationExtrasKtxKt.requireApplication(extras);
            LinkActivityContract.Args.InjectionParams injectionParams$link_release = invoke.getInjectionParams$link_release();
            String injectorKey = injectionParams$link_release != null ? injectionParams$link_release.getInjectorKey() : null;
            LinkActivityContract.Args.InjectionParams injectionParams$link_release2 = invoke.getInjectionParams$link_release();
            boolean enableLogging = injectionParams$link_release2 != null ? injectionParams$link_release2.getEnableLogging() : false;
            LinkActivityContract.Args.InjectionParams injectionParams$link_release3 = invoke.getInjectionParams$link_release();
            if (injectionParams$link_release3 == null || (publishableKey = injectionParams$link_release3.getPublishableKey()) == null) {
                publishableKey = PaymentConfiguration.Companion.getInstance(requireApplication).getPublishableKey();
            }
            String str = publishableKey;
            if (invoke.getInjectionParams$link_release() != null) {
                stripeAccountId = invoke.getInjectionParams$link_release().getStripeAccountId();
            } else {
                stripeAccountId = PaymentConfiguration.Companion.getInstance(requireApplication).getStripeAccountId();
            }
            String str2 = stripeAccountId;
            LinkActivityContract.Args.InjectionParams injectionParams$link_release4 = invoke.getInjectionParams$link_release();
            if (injectionParams$link_release4 == null || (emptySet = injectionParams$link_release4.getProductUsage()) == null) {
                emptySet = SetsKt__SetsKt.emptySet();
            }
            Injector injectWithFallback = InjectWithFallbackKt.injectWithFallback(this, injectorKey, new FallbackInitializeParam(requireApplication, invoke, enableLogging, str, str2, emptySet));
            LinkActivityViewModel viewModel = getViewModel();
            Intrinsics.checkNotNull(injectWithFallback, "null cannot be cast to non-null type com.stripe.android.core.injection.NonFallbackInjector");
            viewModel.setInjector((NonFallbackInjector) injectWithFallback);
            LinkActivityViewModel viewModel2 = getViewModel();
            Intrinsics.checkNotNull(viewModel2, "null cannot be cast to non-null type T of com.stripe.android.link.LinkActivityViewModel.Factory.create");
            return viewModel2;
        }

        @Override // com.stripe.android.core.injection.Injectable
        public Injector fallbackInitialize(FallbackInitializeParam arg) {
            Intrinsics.checkNotNullParameter(arg, "arg");
            LinkViewModelFactoryComponent build = DaggerLinkViewModelFactoryComponent.builder().context(arg.getApplication()).enableLogging(arg.getEnableLogging()).publishableKeyProvider(new C18971x7d63e555(arg)).stripeAccountIdProvider(new C18972x7d63e556(arg)).productUsage(arg.getProductUsage()).starterArgs(arg.getStarterArgs()).build();
            build.inject(this);
            return build;
        }
    }

    public LinkActivityViewModel(LinkActivityContract.Args args, LinkAccountManager linkAccountManager, Navigator navigator, ConfirmationManager confirmationManager) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(linkAccountManager, "linkAccountManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(confirmationManager, "confirmationManager");
        this.linkAccountManager = linkAccountManager;
        this.navigator = navigator;
        this.confirmationManager = confirmationManager;
        this.linkAccount = linkAccountManager.getLinkAccount();
        assertStripeIntentIsValid(args.getStripeIntent$link_release());
    }

    private final void assertStripeIntentIsValid(StripeIntent stripeIntent) {
        Object m116783constructorimpl;
        PaymentIntent paymentIntent;
        try {
            Result.Companion companion = Result.Companion;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (stripeIntent.getId() != null) {
            if (stripeIntent.getClientSecret() != null) {
                String str = null;
                if (stripeIntent instanceof PaymentIntent) {
                    paymentIntent = (PaymentIntent) stripeIntent;
                } else {
                    paymentIntent = null;
                }
                if (paymentIntent != null) {
                    if (((PaymentIntent) stripeIntent).getAmount() != null) {
                        str = ((PaymentIntent) stripeIntent).getCurrency();
                        if (str == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                m116783constructorimpl = Result.m116783constructorimpl(str);
                Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl != null) {
                    this.navigator.dismiss(new LinkActivityResult.Failed(m116786exceptionOrNullimpl));
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final NonFallbackInjector getInjector() {
        NonFallbackInjector nonFallbackInjector = this.injector;
        if (nonFallbackInjector != null) {
            return nonFallbackInjector;
        }
        Intrinsics.throwUninitializedPropertyAccessException("injector");
        return null;
    }

    public final InterfaceC49220tP5<LinkAccount> getLinkAccount() {
        return this.linkAccount;
    }

    public final LinkAccountManager getLinkAccountManager() {
        return this.linkAccountManager;
    }

    public final Navigator getNavigator() {
        return this.navigator;
    }

    public final void logout() {
        this.navigator.cancel(LinkActivityResult.Canceled.Reason.LoggedOut);
        this.linkAccountManager.logout();
    }

    public final void onBackPressed() {
        this.navigator.onBack(true);
    }

    public final void setInjector(NonFallbackInjector nonFallbackInjector) {
        Intrinsics.checkNotNullParameter(nonFallbackInjector, "<set-?>");
        this.injector = nonFallbackInjector;
    }

    public final void setupPaymentLauncher(InterfaceC29050u5 activityResultCaller) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        this.confirmationManager.setupPaymentLauncher(activityResultCaller);
    }

    public final void unregisterFromActivity() {
        this.confirmationManager.invalidatePaymentLauncher();
        this.navigator.unregister();
    }
}
