package com.stripe.android.paymentsheet.addresselement;

import androidx.lifecycle.C11759u;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.NonFallbackInjectable;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.p049ui.core.FormController;
import com.stripe.android.p049ui.core.elements.LayoutSpec;
import com.stripe.android.p049ui.core.injection.FormControllerSubcomponent;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.AddressLauncher;
import com.stripe.android.paymentsheet.addresselement.AddressLauncherResult;
import com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEventReporter;
import com.stripe.android.paymentsheet.injection.InputAddressViewModelSubcomponent;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u00018B/\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u00020403¢\u0006\u0004\b6\u00107J\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J$\u0010\u0010\u001a\u00020\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u0005J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0002H\u0007J\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0005R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001f\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010$R\u001f\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0%8\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010$R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050%8\u0006¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010)R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010$R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050%8\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b2\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;", "LOr6;", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "getCurrentAddress", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "condensedForm", "Lcom/stripe/android/ui/core/elements/LayoutSpec;", "buildFormSpec", "", "navigateToAutocompleteScreen", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "completedFormValues", "checkboxChecked", "clickPrimaryButton", "addressDetails", "dismissWithAddress", "newValue", "clickCheckbox", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "args", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "getArgs", "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;", "navigator", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;", "getNavigator", "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;", "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;", "eventReporter", "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;", "LGX2;", "_collectedAddress", "LGX2;", "LtP5;", "collectedAddress", "LtP5;", "getCollectedAddress", "()LtP5;", "Lcom/stripe/android/ui/core/FormController;", "_formController", "formController", "getFormController", "_formEnabled", "formEnabled", "getFormEnabled", "_checkboxChecked", "getCheckboxChecked", "LY94;", "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;", "formControllerProvider", "<init>", "(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;LY94;)V", "Factory", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class InputAddressViewModel extends AbstractC35048Or6 {
    private final GX2<Boolean> _checkboxChecked;
    private final GX2<AddressDetails> _collectedAddress;
    private final GX2<FormController> _formController;
    private final GX2<Boolean> _formEnabled;
    private final AddressElementActivityContract.Args args;
    private final InterfaceC49220tP5<Boolean> checkboxChecked;
    private final InterfaceC49220tP5<AddressDetails> collectedAddress;
    private final AddressLauncherEventReporter eventReporter;
    private final InterfaceC49220tP5<FormController> formController;
    private final InterfaceC49220tP5<Boolean> formEnabled;
    private final AddressElementNavigator navigator;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.addresselement.InputAddressViewModel$1", m28418f = "InputAddressViewModel.kt", m28417i = {}, m28416l = {44}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.paymentsheet.addresselement.InputAddressViewModel$1 */
    /* loaded from: classes7.dex */
    public static final class C191881 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        int label;

        public C191881(Continuation<? super C191881> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C191881(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C191881) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC32730Eu1 resultFlow = InputAddressViewModel.this.getNavigator().getResultFlow(AddressDetails.KEY);
                if (resultFlow != null) {
                    final InputAddressViewModel inputAddressViewModel = InputAddressViewModel.this;
                    InterfaceC33198Gu1<AddressDetails> interfaceC33198Gu1 = new InterfaceC33198Gu1<AddressDetails>() { // from class: com.stripe.android.paymentsheet.addresselement.InputAddressViewModel.1.1
                        @Override // p000.InterfaceC33198Gu1
                        public /* bridge */ /* synthetic */ Object emit(AddressDetails addressDetails, Continuation continuation) {
                            return emit2(addressDetails, (Continuation<? super Unit>) continuation);
                        }

                        /* renamed from: emit  reason: avoid collision after fix types in other method */
                        public final Object emit2(AddressDetails addressDetails, Continuation<? super Unit> continuation) {
                            String name;
                            PaymentSheet.Address address;
                            String phoneNumber;
                            Object coroutine_suspended2;
                            Boolean isCheckboxSelected;
                            AddressDetails addressDetails2 = (AddressDetails) InputAddressViewModel.this._collectedAddress.getValue();
                            Boolean bool = null;
                            if (addressDetails2 == null || (name = addressDetails2.getName()) == null) {
                                name = addressDetails != null ? addressDetails.getName() : null;
                            }
                            if (addressDetails == null || (address = addressDetails.getAddress()) == null) {
                                address = addressDetails2 != null ? addressDetails2.getAddress() : null;
                            }
                            if (addressDetails2 == null || (phoneNumber = addressDetails2.getPhoneNumber()) == null) {
                                phoneNumber = addressDetails != null ? addressDetails.getPhoneNumber() : null;
                            }
                            if (addressDetails2 != null && (isCheckboxSelected = addressDetails2.isCheckboxSelected()) != null) {
                                bool = isCheckboxSelected;
                            } else if (addressDetails != null) {
                                bool = addressDetails.isCheckboxSelected();
                            }
                            Object emit = InputAddressViewModel.this._collectedAddress.emit(new AddressDetails(name, address, phoneNumber, bool), continuation);
                            coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            return emit == coroutine_suspended2 ? emit : Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (resultFlow.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.addresselement.InputAddressViewModel$2", m28418f = "InputAddressViewModel.kt", m28417i = {}, m28416l = {58}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.paymentsheet.addresselement.InputAddressViewModel$2 */
    /* loaded from: classes7.dex */
    public static final class C191902 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Y94<FormControllerSubcomponent.Builder> $formControllerProvider;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191902(Y94<FormControllerSubcomponent.Builder> y94, Continuation<? super C191902> continuation) {
            super(2, continuation);
            this.$formControllerProvider = y94;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C191902(this.$formControllerProvider, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C191902) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC49220tP5<AddressDetails> collectedAddress = InputAddressViewModel.this.getCollectedAddress();
                final InputAddressViewModel inputAddressViewModel = InputAddressViewModel.this;
                final Y94<FormControllerSubcomponent.Builder> y94 = this.$formControllerProvider;
                InterfaceC33198Gu1<AddressDetails> interfaceC33198Gu1 = new InterfaceC33198Gu1<AddressDetails>() { // from class: com.stripe.android.paymentsheet.addresselement.InputAddressViewModel.2.1
                    @Override // p000.InterfaceC33198Gu1
                    public /* bridge */ /* synthetic */ Object emit(AddressDetails addressDetails, Continuation continuation) {
                        return emit2(addressDetails, (Continuation<? super Unit>) continuation);
                    }

                    /* renamed from: emit  reason: avoid collision after fix types in other method */
                    public final Object emit2(AddressDetails addressDetails, Continuation<? super Unit> continuation) {
                        Map<IdentifierSpec, String> emptyMap;
                        Set<IdentifierSpec> emptySet;
                        PaymentSheet.Address address;
                        String str = null;
                        if (addressDetails == null || (emptyMap = AddressDetailsKt.toIdentifierMap$default(addressDetails, null, 1, null)) == null) {
                            emptyMap = MapsKt__MapsKt.emptyMap();
                        }
                        GX2 gx2 = InputAddressViewModel.this._formController;
                        emptySet = SetsKt__SetsKt.emptySet();
                        FormControllerSubcomponent.Builder shippingValues = y94.get().viewOnlyFields(emptySet).viewModelScope(C36218Tr6.m82333a(InputAddressViewModel.this)).stripeIntent(null).merchantName("").shippingValues(null);
                        InputAddressViewModel inputAddressViewModel2 = InputAddressViewModel.this;
                        if (addressDetails != null && (address = addressDetails.getAddress()) != null) {
                            str = address.getLine1();
                        }
                        gx2.setValue(shippingValues.formSpec(inputAddressViewModel2.buildFormSpec(str == null)).initialValues(emptyMap).build().getFormController());
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (collectedAddress.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$Factory;", "Landroidx/lifecycle/u$b;", "Lcom/stripe/android/core/injection/NonFallbackInjectable;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "injector", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "LY94;", "Lcom/stripe/android/paymentsheet/injection/InputAddressViewModelSubcomponent$Builder;", "subComponentBuilderProvider", "LY94;", "getSubComponentBuilderProvider", "()LY94;", "setSubComponentBuilderProvider", "(LY94;)V", "<init>", "(Lcom/stripe/android/core/injection/NonFallbackInjector;)V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b, NonFallbackInjectable {
        private final NonFallbackInjector injector;
        public Y94<InputAddressViewModelSubcomponent.Builder> subComponentBuilderProvider;

        public Factory(NonFallbackInjector injector) {
            Intrinsics.checkNotNullParameter(injector, "injector");
            this.injector = injector;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls, FE0 fe0) {
            return super.create(cls, fe0);
        }

        @Override // com.stripe.android.core.injection.Injectable
        public /* bridge */ /* synthetic */ Injector fallbackInitialize(Unit unit) {
            return (Injector) fallbackInitialize2(unit);
        }

        public final Y94<InputAddressViewModelSubcomponent.Builder> getSubComponentBuilderProvider() {
            Y94<InputAddressViewModelSubcomponent.Builder> y94 = this.subComponentBuilderProvider;
            if (y94 != null) {
                return y94;
            }
            Intrinsics.throwUninitializedPropertyAccessException("subComponentBuilderProvider");
            return null;
        }

        public final void setSubComponentBuilderProvider(Y94<InputAddressViewModelSubcomponent.Builder> y94) {
            Intrinsics.checkNotNullParameter(y94, "<set-?>");
            this.subComponentBuilderProvider = y94;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            this.injector.inject(this);
            InputAddressViewModel inputAddressViewModel = getSubComponentBuilderProvider().get().build().getInputAddressViewModel();
            Intrinsics.checkNotNull(inputAddressViewModel, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.addresselement.InputAddressViewModel.Factory.create");
            return inputAddressViewModel;
        }

        @Override // com.stripe.android.core.injection.NonFallbackInjectable
        /* renamed from: fallbackInitialize  reason: avoid collision after fix types in other method */
        public Void fallbackInitialize2(Unit unit) {
            return NonFallbackInjectable.DefaultImpls.fallbackInitialize(this, unit);
        }
    }

    public InputAddressViewModel(AddressElementActivityContract.Args args, AddressElementNavigator navigator, AddressLauncherEventReporter eventReporter, Y94<FormControllerSubcomponent.Builder> formControllerProvider) {
        AddressDetails addressDetails;
        AddressDetails address;
        Boolean isCheckboxSelected;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(formControllerProvider, "formControllerProvider");
        this.args = args;
        this.navigator = navigator;
        this.eventReporter = eventReporter;
        AddressLauncher.Configuration config$paymentsheet_release = args.getConfig$paymentsheet_release();
        if (config$paymentsheet_release != null) {
            addressDetails = config$paymentsheet_release.getAddress();
        } else {
            addressDetails = null;
        }
        GX2<AddressDetails> m8742a = C50405vP5.m8742a(addressDetails);
        this._collectedAddress = m8742a;
        this.collectedAddress = m8742a;
        GX2<FormController> m8742a2 = C50405vP5.m8742a(null);
        this._formController = m8742a2;
        this.formController = m8742a2;
        GX2<Boolean> m8742a3 = C50405vP5.m8742a(Boolean.TRUE);
        this._formEnabled = m8742a3;
        this.formEnabled = m8742a3;
        GX2<Boolean> m8742a4 = C50405vP5.m8742a(Boolean.FALSE);
        this._checkboxChecked = m8742a4;
        this.checkboxChecked = m8742a4;
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new C191881(null), 3, null);
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new C191902(formControllerProvider, null), 3, null);
        AddressLauncher.Configuration config$paymentsheet_release2 = args.getConfig$paymentsheet_release();
        if (config$paymentsheet_release2 != null && (address = config$paymentsheet_release2.getAddress()) != null && (isCheckboxSelected = address.isCheckboxSelected()) != null) {
            m8742a4.setValue(Boolean.valueOf(isCheckboxSelected.booleanValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutSpec buildFormSpec(boolean z) {
        List listOf;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(AddressSpecFactory.INSTANCE.create(z, this.args.getConfig$paymentsheet_release(), new InputAddressViewModel$buildFormSpec$spec$1(this)));
        return new LayoutSpec(listOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCurrentAddress(Continuation<? super AddressDetails> continuation) {
        InputAddressViewModel$getCurrentAddress$1 inputAddressViewModel$getCurrentAddress$1;
        Object coroutine_suspended;
        int i;
        InterfaceC32730Eu1<Map<IdentifierSpec, FormFieldEntry>> formValues;
        InterfaceC49220tP5 interfaceC49220tP5;
        Map map;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (continuation instanceof InputAddressViewModel$getCurrentAddress$1) {
            inputAddressViewModel$getCurrentAddress$1 = (InputAddressViewModel$getCurrentAddress$1) continuation;
            int i2 = inputAddressViewModel$getCurrentAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inputAddressViewModel$getCurrentAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inputAddressViewModel$getCurrentAddress$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inputAddressViewModel$getCurrentAddress$1.label;
                String str8 = null;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    FormController value = this.formController.getValue();
                    if (value == null || (formValues = value.getFormValues()) == null) {
                        return null;
                    }
                    ZC0 m82333a = C36218Tr6.m82333a(this);
                    inputAddressViewModel$getCurrentAddress$1.label = 1;
                    obj = C36708Vu1.m79272P(formValues, m82333a, inputAddressViewModel$getCurrentAddress$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                interfaceC49220tP5 = (InterfaceC49220tP5) obj;
                if (interfaceC49220tP5 == null && (map = (Map) interfaceC49220tP5.getValue()) != null) {
                    IdentifierSpec.Companion companion = IdentifierSpec.Companion;
                    FormFieldEntry formFieldEntry = (FormFieldEntry) map.get(companion.getName());
                    if (formFieldEntry != null) {
                        str = formFieldEntry.getValue();
                    } else {
                        str = null;
                    }
                    FormFieldEntry formFieldEntry2 = (FormFieldEntry) map.get(companion.getCity());
                    if (formFieldEntry2 != null) {
                        str2 = formFieldEntry2.getValue();
                    } else {
                        str2 = null;
                    }
                    FormFieldEntry formFieldEntry3 = (FormFieldEntry) map.get(companion.getCountry());
                    if (formFieldEntry3 != null) {
                        str3 = formFieldEntry3.getValue();
                    } else {
                        str3 = null;
                    }
                    FormFieldEntry formFieldEntry4 = (FormFieldEntry) map.get(companion.getLine1());
                    if (formFieldEntry4 != null) {
                        str4 = formFieldEntry4.getValue();
                    } else {
                        str4 = null;
                    }
                    FormFieldEntry formFieldEntry5 = (FormFieldEntry) map.get(companion.getLine2());
                    if (formFieldEntry5 != null) {
                        str5 = formFieldEntry5.getValue();
                    } else {
                        str5 = null;
                    }
                    FormFieldEntry formFieldEntry6 = (FormFieldEntry) map.get(companion.getPostalCode());
                    if (formFieldEntry6 != null) {
                        str6 = formFieldEntry6.getValue();
                    } else {
                        str6 = null;
                    }
                    FormFieldEntry formFieldEntry7 = (FormFieldEntry) map.get(companion.getState());
                    if (formFieldEntry7 != null) {
                        str7 = formFieldEntry7.getValue();
                    } else {
                        str7 = null;
                    }
                    PaymentSheet.Address address = new PaymentSheet.Address(str2, str3, str4, str5, str6, str7);
                    FormFieldEntry formFieldEntry8 = (FormFieldEntry) map.get(companion.getPhone());
                    if (formFieldEntry8 != null) {
                        str8 = formFieldEntry8.getValue();
                    }
                    return new AddressDetails(str, address, str8, null, 8, null);
                }
            }
        }
        inputAddressViewModel$getCurrentAddress$1 = new InputAddressViewModel$getCurrentAddress$1(this, continuation);
        Object obj2 = inputAddressViewModel$getCurrentAddress$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inputAddressViewModel$getCurrentAddress$1.label;
        String str82 = null;
        if (i == 0) {
        }
        interfaceC49220tP5 = (InterfaceC49220tP5) obj2;
        return interfaceC49220tP5 == null ? null : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToAutocompleteScreen() {
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new InputAddressViewModel$navigateToAutocompleteScreen$1(this, null), 3, null);
    }

    public final void clickCheckbox(boolean z) {
        this._checkboxChecked.setValue(Boolean.valueOf(z));
    }

    public final void clickPrimaryButton(Map<IdentifierSpec, FormFieldEntry> map, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        FormFieldEntry formFieldEntry;
        FormFieldEntry formFieldEntry2;
        FormFieldEntry formFieldEntry3;
        FormFieldEntry formFieldEntry4;
        FormFieldEntry formFieldEntry5;
        FormFieldEntry formFieldEntry6;
        FormFieldEntry formFieldEntry7;
        FormFieldEntry formFieldEntry8;
        this._formEnabled.setValue(Boolean.FALSE);
        String str8 = null;
        if (map != null && (formFieldEntry8 = map.get(IdentifierSpec.Companion.getName())) != null) {
            str = formFieldEntry8.getValue();
        } else {
            str = null;
        }
        if (map != null && (formFieldEntry7 = map.get(IdentifierSpec.Companion.getCity())) != null) {
            str2 = formFieldEntry7.getValue();
        } else {
            str2 = null;
        }
        if (map != null && (formFieldEntry6 = map.get(IdentifierSpec.Companion.getCountry())) != null) {
            str3 = formFieldEntry6.getValue();
        } else {
            str3 = null;
        }
        if (map != null && (formFieldEntry5 = map.get(IdentifierSpec.Companion.getLine1())) != null) {
            str4 = formFieldEntry5.getValue();
        } else {
            str4 = null;
        }
        if (map != null && (formFieldEntry4 = map.get(IdentifierSpec.Companion.getLine2())) != null) {
            str5 = formFieldEntry4.getValue();
        } else {
            str5 = null;
        }
        if (map != null && (formFieldEntry3 = map.get(IdentifierSpec.Companion.getPostalCode())) != null) {
            str6 = formFieldEntry3.getValue();
        } else {
            str6 = null;
        }
        if (map != null && (formFieldEntry2 = map.get(IdentifierSpec.Companion.getState())) != null) {
            str7 = formFieldEntry2.getValue();
        } else {
            str7 = null;
        }
        PaymentSheet.Address address = new PaymentSheet.Address(str2, str3, str4, str5, str6, str7);
        if (map != null && (formFieldEntry = map.get(IdentifierSpec.Companion.getPhone())) != null) {
            str8 = formFieldEntry.getValue();
        }
        dismissWithAddress(new AddressDetails(str, address, str8, Boolean.valueOf(z)));
    }

    public final void dismissWithAddress(AddressDetails addressDetails) {
        String country;
        String str;
        boolean z;
        PaymentSheet.Address address;
        Intrinsics.checkNotNullParameter(addressDetails, "addressDetails");
        PaymentSheet.Address address2 = addressDetails.getAddress();
        if (address2 != null && (country = address2.getCountry()) != null) {
            AddressLauncherEventReporter addressLauncherEventReporter = this.eventReporter;
            AddressDetails value = this.collectedAddress.getValue();
            if (value != null && (address = value.getAddress()) != null) {
                str = address.getLine1();
            } else {
                str = null;
            }
            if (str != null) {
                z = true;
            } else {
                z = false;
            }
            addressLauncherEventReporter.onCompleted(country, z, Integer.valueOf(AddressUtilsKt.editDistance(addressDetails, this.collectedAddress.getValue())));
        }
        this.navigator.dismiss(new AddressLauncherResult.Succeeded(addressDetails));
    }

    public final AddressElementActivityContract.Args getArgs() {
        return this.args;
    }

    public final InterfaceC49220tP5<Boolean> getCheckboxChecked() {
        return this.checkboxChecked;
    }

    public final InterfaceC49220tP5<AddressDetails> getCollectedAddress() {
        return this.collectedAddress;
    }

    public final InterfaceC49220tP5<FormController> getFormController() {
        return this.formController;
    }

    public final InterfaceC49220tP5<Boolean> getFormEnabled() {
        return this.formEnabled;
    }

    public final AddressElementNavigator getNavigator() {
        return this.navigator;
    }
}
