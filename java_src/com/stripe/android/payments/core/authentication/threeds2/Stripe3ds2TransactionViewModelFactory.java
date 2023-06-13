package com.stripe.android.payments.core.authentication.threeds2;

import android.app.Application;
import androidx.lifecycle.C11747p;
import androidx.lifecycle.C11750q;
import androidx.lifecycle.C11759u;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.injection.InjectWithFallbackKt;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.injection.DaggerStripe3ds2TransactionViewModelFactoryComponent;
import com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent;
import com.stripe.android.utils.CreationExtrasKtxKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001cB\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J/\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModelFactory;", "Landroidx/lifecycle/u$b;", "Lcom/stripe/android/core/injection/Injectable;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModelFactory$FallbackInitializeParam;", "arg", "Lcom/stripe/android/core/injection/Injector;", "fallbackInitialize", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "LFE0;", "extras", "create", "(Ljava/lang/Class;LFE0;)LOr6;", "Lkotlin/Function0;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "argsSupplier", "Lkotlin/jvm/functions/Function0;", "Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionViewModelSubcomponent$Builder;", "subComponentBuilder", "Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionViewModelSubcomponent$Builder;", "getSubComponentBuilder", "()Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionViewModelSubcomponent$Builder;", "setSubComponentBuilder", "(Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionViewModelSubcomponent$Builder;)V", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "FallbackInitializeParam", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class Stripe3ds2TransactionViewModelFactory implements C11759u.InterfaceC11763b, Injectable<FallbackInitializeParam> {
    private final Function0<Stripe3ds2TransactionContract.Args> argsSupplier;
    public Stripe3ds2TransactionViewModelSubcomponent.Builder subComponentBuilder;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModelFactory$FallbackInitializeParam;", "", "application", "Landroid/app/Application;", NamedConstantsKt.ENABLE_LOGGING, "", "publishableKey", "", com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE, "", "(Landroid/app/Application;ZLjava/lang/String;Ljava/util/Set;)V", "getApplication", "()Landroid/app/Application;", "getEnableLogging", "()Z", "getProductUsage", "()Ljava/util/Set;", "getPublishableKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class FallbackInitializeParam {
        private final Application application;
        private final boolean enableLogging;
        private final Set<String> productUsage;
        private final String publishableKey;

        public FallbackInitializeParam(Application application, boolean z, String publishableKey, Set<String> productUsage) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(productUsage, "productUsage");
            this.application = application;
            this.enableLogging = z;
            this.publishableKey = publishableKey;
            this.productUsage = productUsage;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FallbackInitializeParam copy$default(FallbackInitializeParam fallbackInitializeParam, Application application, boolean z, String str, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                application = fallbackInitializeParam.application;
            }
            if ((i & 2) != 0) {
                z = fallbackInitializeParam.enableLogging;
            }
            if ((i & 4) != 0) {
                str = fallbackInitializeParam.publishableKey;
            }
            if ((i & 8) != 0) {
                set = fallbackInitializeParam.productUsage;
            }
            return fallbackInitializeParam.copy(application, z, str, set);
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

        public final Set<String> component4() {
            return this.productUsage;
        }

        public final FallbackInitializeParam copy(Application application, boolean z, String publishableKey, Set<String> productUsage) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(productUsage, "productUsage");
            return new FallbackInitializeParam(application, z, publishableKey, productUsage);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof FallbackInitializeParam) {
                FallbackInitializeParam fallbackInitializeParam = (FallbackInitializeParam) obj;
                return Intrinsics.areEqual(this.application, fallbackInitializeParam.application) && this.enableLogging == fallbackInitializeParam.enableLogging && Intrinsics.areEqual(this.publishableKey, fallbackInitializeParam.publishableKey) && Intrinsics.areEqual(this.productUsage, fallbackInitializeParam.productUsage);
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

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.application.hashCode() * 31;
            boolean z = this.enableLogging;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return ((((hashCode + i) * 31) + this.publishableKey.hashCode()) * 31) + this.productUsage.hashCode();
        }

        public String toString() {
            Application application = this.application;
            boolean z = this.enableLogging;
            String str = this.publishableKey;
            Set<String> set = this.productUsage;
            return "FallbackInitializeParam(application=" + application + ", enableLogging=" + z + ", publishableKey=" + str + ", productUsage=" + set + ")";
        }
    }

    public Stripe3ds2TransactionViewModelFactory(Function0<Stripe3ds2TransactionContract.Args> argsSupplier) {
        Intrinsics.checkNotNullParameter(argsSupplier, "argsSupplier");
        this.argsSupplier = argsSupplier;
    }

    @Override // androidx.lifecycle.C11759u.InterfaceC11763b
    public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls) {
        return super.create(cls);
    }

    public final Stripe3ds2TransactionViewModelSubcomponent.Builder getSubComponentBuilder() {
        Stripe3ds2TransactionViewModelSubcomponent.Builder builder = this.subComponentBuilder;
        if (builder != null) {
            return builder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("subComponentBuilder");
        return null;
    }

    public final void setSubComponentBuilder(Stripe3ds2TransactionViewModelSubcomponent.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<set-?>");
        this.subComponentBuilder = builder;
    }

    @Override // androidx.lifecycle.C11759u.InterfaceC11763b
    public <T extends AbstractC35048Or6> T create(Class<T> modelClass, FE0 extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Stripe3ds2TransactionContract.Args invoke = this.argsSupplier.invoke();
        Application requireApplication = CreationExtrasKtxKt.requireApplication(extras);
        C11747p m66936a = C11750q.m66936a(extras);
        InjectWithFallbackKt.injectWithFallback(this, invoke.getInjectorKey(), new FallbackInitializeParam(requireApplication, invoke.getEnableLogging(), invoke.getPublishableKey(), invoke.getProductUsage()));
        Stripe3ds2TransactionViewModel viewModel = getSubComponentBuilder().args(invoke).savedStateHandle(m66936a).application(requireApplication).build().getViewModel();
        Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory.create");
        return viewModel;
    }

    @Override // com.stripe.android.core.injection.Injectable
    public Injector fallbackInitialize(FallbackInitializeParam arg) {
        Intrinsics.checkNotNullParameter(arg, "arg");
        DaggerStripe3ds2TransactionViewModelFactoryComponent.builder().context(arg.getApplication()).enableLogging(arg.getEnableLogging()).publishableKeyProvider(new Stripe3ds2TransactionViewModelFactory$fallbackInitialize$1(arg)).productUsage(arg.getProductUsage()).isInstantApp(C41324g52.m40136c(arg.getApplication())).build().inject(this);
        return null;
    }
}
