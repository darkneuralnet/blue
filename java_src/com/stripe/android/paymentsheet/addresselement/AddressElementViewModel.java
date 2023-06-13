package com.stripe.android.paymentsheet.addresselement;

import android.app.Application;
import androidx.lifecycle.C11759u;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.injection.InjectWithFallbackKt;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.injection.AddressElementViewModelFactoryComponent;
import com.stripe.android.paymentsheet.injection.DaggerAddressElementViewModelFactoryComponent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;", "LOr6;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;", "navigator", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;", "getNavigator", "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "injector", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "getInjector", "()Lcom/stripe/android/core/injection/NonFallbackInjector;", "setInjector", "(Lcom/stripe/android/core/injection/NonFallbackInjector;)V", "<init>", "(Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;)V", "Factory", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class AddressElementViewModel extends AbstractC35048Or6 {
    public NonFallbackInjector injector;
    private final AddressElementNavigator navigator;

    @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001cB#\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel$Factory;", "Landroidx/lifecycle/u$b;", "Lcom/stripe/android/core/injection/Injectable;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel$Factory$FallbackInitializeParam;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "arg", "Lcom/stripe/android/core/injection/Injector;", "fallbackInitialize", "Lkotlin/Function0;", "Landroid/app/Application;", "applicationSupplier", "Lkotlin/jvm/functions/Function0;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "starterArgsSupplier", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;", "viewModel", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;", "setViewModel", "(Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;)V", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "FallbackInitializeParam", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b, Injectable<FallbackInitializeParam> {
        private final Function0<Application> applicationSupplier;
        private final Function0<AddressElementActivityContract.Args> starterArgsSupplier;
        public AddressElementViewModel viewModel;

        @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel$Factory$FallbackInitializeParam;", "", "application", "Landroid/app/Application;", "starterArgs", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "(Landroid/app/Application;Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;)V", "getApplication", "()Landroid/app/Application;", "getStarterArgs", "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class FallbackInitializeParam {
            private final Application application;
            private final AddressElementActivityContract.Args starterArgs;

            public FallbackInitializeParam(Application application, AddressElementActivityContract.Args starterArgs) {
                Intrinsics.checkNotNullParameter(application, "application");
                Intrinsics.checkNotNullParameter(starterArgs, "starterArgs");
                this.application = application;
                this.starterArgs = starterArgs;
            }

            public static /* synthetic */ FallbackInitializeParam copy$default(FallbackInitializeParam fallbackInitializeParam, Application application, AddressElementActivityContract.Args args, int i, Object obj) {
                if ((i & 1) != 0) {
                    application = fallbackInitializeParam.application;
                }
                if ((i & 2) != 0) {
                    args = fallbackInitializeParam.starterArgs;
                }
                return fallbackInitializeParam.copy(application, args);
            }

            public final Application component1() {
                return this.application;
            }

            public final AddressElementActivityContract.Args component2() {
                return this.starterArgs;
            }

            public final FallbackInitializeParam copy(Application application, AddressElementActivityContract.Args starterArgs) {
                Intrinsics.checkNotNullParameter(application, "application");
                Intrinsics.checkNotNullParameter(starterArgs, "starterArgs");
                return new FallbackInitializeParam(application, starterArgs);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof FallbackInitializeParam) {
                    FallbackInitializeParam fallbackInitializeParam = (FallbackInitializeParam) obj;
                    return Intrinsics.areEqual(this.application, fallbackInitializeParam.application) && Intrinsics.areEqual(this.starterArgs, fallbackInitializeParam.starterArgs);
                }
                return false;
            }

            public final Application getApplication() {
                return this.application;
            }

            public final AddressElementActivityContract.Args getStarterArgs() {
                return this.starterArgs;
            }

            public int hashCode() {
                return (this.application.hashCode() * 31) + this.starterArgs.hashCode();
            }

            public String toString() {
                Application application = this.application;
                AddressElementActivityContract.Args args = this.starterArgs;
                return "FallbackInitializeParam(application=" + application + ", starterArgs=" + args + ")";
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(Function0<? extends Application> applicationSupplier, Function0<AddressElementActivityContract.Args> starterArgsSupplier) {
            Intrinsics.checkNotNullParameter(applicationSupplier, "applicationSupplier");
            Intrinsics.checkNotNullParameter(starterArgsSupplier, "starterArgsSupplier");
            this.applicationSupplier = applicationSupplier;
            this.starterArgsSupplier = starterArgsSupplier;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls, FE0 fe0) {
            return super.create(cls, fe0);
        }

        public final AddressElementViewModel getViewModel() {
            AddressElementViewModel addressElementViewModel = this.viewModel;
            if (addressElementViewModel != null) {
                return addressElementViewModel;
            }
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            return null;
        }

        public final void setViewModel(AddressElementViewModel addressElementViewModel) {
            Intrinsics.checkNotNullParameter(addressElementViewModel, "<set-?>");
            this.viewModel = addressElementViewModel;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            AddressElementActivityContract.Args invoke = this.starterArgsSupplier.invoke();
            Injector injectWithFallback = InjectWithFallbackKt.injectWithFallback(this, invoke.getInjectorKey$paymentsheet_release(), new FallbackInitializeParam(this.applicationSupplier.invoke(), invoke));
            AddressElementViewModel viewModel = getViewModel();
            Intrinsics.checkNotNull(injectWithFallback, "null cannot be cast to non-null type com.stripe.android.core.injection.NonFallbackInjector");
            viewModel.setInjector((NonFallbackInjector) injectWithFallback);
            AddressElementViewModel viewModel2 = getViewModel();
            Intrinsics.checkNotNull(viewModel2, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.addresselement.AddressElementViewModel.Factory.create");
            return viewModel2;
        }

        @Override // com.stripe.android.core.injection.Injectable
        public Injector fallbackInitialize(FallbackInitializeParam arg) {
            Intrinsics.checkNotNullParameter(arg, "arg");
            AddressElementViewModelFactoryComponent build = DaggerAddressElementViewModelFactoryComponent.builder().context(arg.getApplication()).starterArgs(arg.getStarterArgs()).build();
            build.inject(this);
            return build;
        }
    }

    public AddressElementViewModel(AddressElementNavigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.navigator = navigator;
    }

    public final NonFallbackInjector getInjector() {
        NonFallbackInjector nonFallbackInjector = this.injector;
        if (nonFallbackInjector != null) {
            return nonFallbackInjector;
        }
        Intrinsics.throwUninitializedPropertyAccessException("injector");
        return null;
    }

    public final AddressElementNavigator getNavigator() {
        return this.navigator;
    }

    public final void setInjector(NonFallbackInjector nonFallbackInjector) {
        Intrinsics.checkNotNullParameter(nonFallbackInjector, "<set-?>");
        this.injector = nonFallbackInjector;
    }
}
