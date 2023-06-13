package com.stripe.android.paymentsheet.forms;

import android.content.Context;
import androidx.lifecycle.C11759u;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.NonFallbackInjectable;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.p049ui.core.Amount;
import com.stripe.android.p049ui.core.elements.CardBillingAddressElement;
import com.stripe.android.p049ui.core.elements.SaveForFutureUseController;
import com.stripe.android.p049ui.core.elements.SaveForFutureUseElement;
import com.stripe.android.p049ui.core.forms.TransformSpecToElements;
import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.addresselement.AddressDetailsKt;
import com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArgumentsKt;
import com.stripe.android.uicore.address.AddressRepository;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SectionElement;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u00012B7\b\u0001\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b0\u00101J\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR#\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000eR!\u0010\u0019\u001a\u000f\u0012\u000b\u0012\t\u0018\u00010\u0017¢\u0006\u0002\b\u00180\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\"\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\fR\u001f\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\t8\u0006¢\u0006\f\n\u0004\b#\u0010\f\u001a\u0004\b$\u0010\u000eR \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\fR\u001f\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t8\u0006¢\u0006\f\n\u0004\b&\u0010\f\u001a\u0004\b'\u0010\u000e¨\u00063"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/forms/FormViewModel;", "LOr6;", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "identifierSpecs", "", "addHiddenIdentifiers$paymentsheet_release", "(Ljava/util/Set;)V", "addHiddenIdentifiers", "LEu1;", "", "showCheckboxFlow", "LEu1;", "getShowCheckboxFlow", "()LEu1;", "", "Lcom/stripe/android/uicore/elements/FormElement;", "elementsFlow", "getElementsFlow", "Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;", "saveForFutureUseElement", "saveForFutureUse", "getSaveForFutureUse$paymentsheet_release", "Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;", "Lkotlin/internal/NoInfer;", "cardBillingElement", "LGX2;", "externalHiddenIdentifiers", "LGX2;", "hiddenIdentifiers", "getHiddenIdentifiers$paymentsheet_release", "showingMandate", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "userRequestedReuse", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "completeFormValues", "getCompleteFormValues", "textFieldControllerIdsFlow", "lastTextFieldIdentifier", "getLastTextFieldIdentifier", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "formArguments", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;", "lpmRepository", "Lcom/stripe/android/uicore/address/AddressRepository;", "addressRepository", "<init>", "(Landroid/content/Context;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Lcom/stripe/android/uicore/address/AddressRepository;LEu1;)V", "Factory", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFormViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormViewModel.kt\ncom/stripe/android/paymentsheet/forms/FormViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,194:1\n47#2:195\n49#2:199\n47#2:200\n49#2:204\n47#2:205\n49#2:209\n47#2:210\n49#2:214\n47#2:215\n49#2:219\n47#2:220\n49#2:224\n50#3:196\n55#3:198\n50#3:201\n55#3:203\n50#3:206\n55#3:208\n50#3:211\n55#3:213\n50#3:216\n55#3:218\n50#3:221\n55#3:223\n106#4:197\n106#4:202\n106#4:207\n106#4:212\n106#4:217\n106#4:222\n*S KotlinDebug\n*F\n+ 1 FormViewModel.kt\ncom/stripe/android/paymentsheet/forms/FormViewModel\n*L\n82#1:195\n82#1:199\n88#1:200\n88#1:204\n93#1:205\n93#1:209\n109#1:210\n109#1:214\n165#1:215\n165#1:219\n179#1:220\n179#1:224\n82#1:196\n82#1:198\n88#1:201\n88#1:203\n93#1:206\n93#1:208\n109#1:211\n109#1:213\n165#1:216\n165#1:218\n179#1:221\n179#1:223\n82#1:197\n88#1:202\n93#1:207\n109#1:212\n165#1:217\n179#1:222\n*E\n"})
/* loaded from: classes7.dex */
public final class FormViewModel extends AbstractC35048Or6 {
    private final InterfaceC32730Eu1<CardBillingAddressElement> cardBillingElement;
    private final InterfaceC32730Eu1<FormFieldValues> completeFormValues;
    private final InterfaceC32730Eu1<List<FormElement>> elementsFlow;
    private GX2<Set<IdentifierSpec>> externalHiddenIdentifiers;
    private final InterfaceC32730Eu1<Set<IdentifierSpec>> hiddenIdentifiers;
    private final InterfaceC32730Eu1<IdentifierSpec> lastTextFieldIdentifier;
    private final InterfaceC32730Eu1<Boolean> saveForFutureUse;
    private final InterfaceC32730Eu1<SaveForFutureUseElement> saveForFutureUseElement;
    private final InterfaceC32730Eu1<Boolean> showCheckboxFlow;
    private final InterfaceC32730Eu1<Boolean> showingMandate;
    private final InterfaceC32730Eu1<List<IdentifierSpec>> textFieldControllerIdsFlow;
    private final InterfaceC32730Eu1<PaymentSelection.CustomerRequestedSave> userRequestedReuse;

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010 J'\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;", "Landroidx/lifecycle/u$b;", "Lcom/stripe/android/core/injection/NonFallbackInjectable;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "config", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "getConfig", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "LEu1;", "", "showCheckboxFlow", "LEu1;", "getShowCheckboxFlow", "()LEu1;", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "injector", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "LY94;", "Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent$Builder;", "subComponentBuilderProvider", "LY94;", "getSubComponentBuilderProvider", "()LY94;", "setSubComponentBuilderProvider", "(LY94;)V", "<init>", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;LEu1;Lcom/stripe/android/core/injection/NonFallbackInjector;)V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b, NonFallbackInjectable {
        private final FormArguments config;
        private final NonFallbackInjector injector;
        private final InterfaceC32730Eu1<Boolean> showCheckboxFlow;
        public Y94<FormViewModelSubcomponent.Builder> subComponentBuilderProvider;

        public Factory(FormArguments config, InterfaceC32730Eu1<Boolean> showCheckboxFlow, NonFallbackInjector injector) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(showCheckboxFlow, "showCheckboxFlow");
            Intrinsics.checkNotNullParameter(injector, "injector");
            this.config = config;
            this.showCheckboxFlow = showCheckboxFlow;
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

        public final FormArguments getConfig() {
            return this.config;
        }

        public final InterfaceC32730Eu1<Boolean> getShowCheckboxFlow() {
            return this.showCheckboxFlow;
        }

        public final Y94<FormViewModelSubcomponent.Builder> getSubComponentBuilderProvider() {
            Y94<FormViewModelSubcomponent.Builder> y94 = this.subComponentBuilderProvider;
            if (y94 != null) {
                return y94;
            }
            Intrinsics.throwUninitializedPropertyAccessException("subComponentBuilderProvider");
            return null;
        }

        public final void setSubComponentBuilderProvider(Y94<FormViewModelSubcomponent.Builder> y94) {
            Intrinsics.checkNotNullParameter(y94, "<set-?>");
            this.subComponentBuilderProvider = y94;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            this.injector.inject(this);
            FormViewModel viewModel = getSubComponentBuilderProvider().get().formArguments(this.config).showCheckboxFlow(this.showCheckboxFlow).build().getViewModel();
            Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.forms.FormViewModel.Factory.create");
            return viewModel;
        }

        @Override // com.stripe.android.core.injection.NonFallbackInjectable
        /* renamed from: fallbackInitialize  reason: avoid collision after fix types in other method */
        public Void fallbackInitialize2(Unit unit) {
            return NonFallbackInjectable.DefaultImpls.fallbackInitialize(this, unit);
        }
    }

    public FormViewModel(Context context, FormArguments formArguments, LpmRepository lpmRepository, AddressRepository addressRepository, InterfaceC32730Eu1<Boolean> showCheckboxFlow) {
        Map<IdentifierSpec, String> map;
        Set emptySet;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(formArguments, "formArguments");
        Intrinsics.checkNotNullParameter(lpmRepository, "lpmRepository");
        Intrinsics.checkNotNullParameter(addressRepository, "addressRepository");
        Intrinsics.checkNotNullParameter(showCheckboxFlow, "showCheckboxFlow");
        this.showCheckboxFlow = showCheckboxFlow;
        Map<IdentifierSpec, String> initialValuesMap = FormArgumentsKt.getInitialValuesMap(formArguments);
        Amount amount = formArguments.getAmount();
        boolean showCheckboxControlledFields = formArguments.getShowCheckboxControlledFields();
        String merchantName = formArguments.getMerchantName();
        AddressDetails shippingDetails = formArguments.getShippingDetails();
        if (shippingDetails != null) {
            map = AddressDetailsKt.toIdentifierMap(shippingDetails, formArguments.getBillingDetails());
        } else {
            map = null;
        }
        TransformSpecToElements transformSpecToElements = new TransformSpecToElements(addressRepository, initialValuesMap, map, amount, showCheckboxControlledFields, merchantName, context, null, 128, null);
        LpmRepository.SupportedPaymentMethod fromCode = lpmRepository.fromCode(formArguments.getPaymentMethodCode());
        if (fromCode != null) {
            final InterfaceC32730Eu1<List<FormElement>> m79281G = C36708Vu1.m79281G(transformSpecToElements.transform(fromCode.getFormSpec().getItems()));
            this.elementsFlow = m79281G;
            final InterfaceC32730Eu1<SaveForFutureUseElement> interfaceC32730Eu1 = new InterfaceC32730Eu1<SaveForFutureUseElement>() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$1

                @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FormViewModel.kt\ncom/stripe/android/paymentsheet/forms/FormViewModel\n*L\n1#1,222:1\n48#2:223\n83#3,2:224\n*E\n"})
                /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$1$2 */
                /* loaded from: classes7.dex */
                public static final class C192002<T> implements InterfaceC33198Gu1 {
                    final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$1$2", m28418f = "FormViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                    /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$1$2$1 */
                    /* loaded from: classes7.dex */
                    public static final class C192011 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public C192011(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C192002.this.emit(null, this);
                        }
                    }

                    public C192002(InterfaceC33198Gu1 interfaceC33198Gu1) {
                        this.$this_unsafeFlow = interfaceC33198Gu1;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                    @Override // p000.InterfaceC33198Gu1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        C192011 c192011;
                        Object coroutine_suspended;
                        int i;
                        SaveForFutureUseElement saveForFutureUseElement;
                        T t;
                        if (continuation instanceof C192011) {
                            c192011 = (C192011) continuation;
                            int i2 = c192011.label;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                c192011.label = i2 - Integer.MIN_VALUE;
                                Object obj2 = c192011.result;
                                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = c192011.label;
                                if (i == 0) {
                                    if (i == 1) {
                                        ResultKt.throwOnFailure(obj2);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    ResultKt.throwOnFailure(obj2);
                                    InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                    Iterator<T> it = ((List) obj).iterator();
                                    while (true) {
                                        saveForFutureUseElement = null;
                                        if (it.hasNext()) {
                                            t = it.next();
                                            if (((FormElement) t) instanceof SaveForFutureUseElement) {
                                                break;
                                            }
                                        } else {
                                            t = null;
                                            break;
                                        }
                                    }
                                    if (t instanceof SaveForFutureUseElement) {
                                        saveForFutureUseElement = (SaveForFutureUseElement) t;
                                    }
                                    c192011.label = 1;
                                    if (interfaceC33198Gu1.emit(saveForFutureUseElement, c192011) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        c192011 = new C192011(continuation);
                        Object obj22 = c192011.result;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c192011.label;
                        if (i == 0) {
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // p000.InterfaceC32730Eu1
                public Object collect(InterfaceC33198Gu1<? super SaveForFutureUseElement> interfaceC33198Gu1, Continuation continuation) {
                    Object coroutine_suspended;
                    Object collect = InterfaceC32730Eu1.this.collect(new C192002(interfaceC33198Gu1), continuation);
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (collect == coroutine_suspended) {
                        return collect;
                    }
                    return Unit.INSTANCE;
                }
            };
            this.saveForFutureUseElement = interfaceC32730Eu1;
            this.saveForFutureUse = C36708Vu1.m79285C(new InterfaceC32730Eu1<InterfaceC32730Eu1<? extends Boolean>>() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$2

                @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FormViewModel.kt\ncom/stripe/android/paymentsheet/forms/FormViewModel\n*L\n1#1,222:1\n48#2:223\n89#3:224\n*E\n"})
                /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$2$2 */
                /* loaded from: classes7.dex */
                public static final class C192022<T> implements InterfaceC33198Gu1 {
                    final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$2$2", m28418f = "FormViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                    /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$2$2$1 */
                    /* loaded from: classes7.dex */
                    public static final class C192031 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public C192031(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C192022.this.emit(null, this);
                        }
                    }

                    public C192022(InterfaceC33198Gu1 interfaceC33198Gu1) {
                        this.$this_unsafeFlow = interfaceC33198Gu1;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                    @Override // p000.InterfaceC33198Gu1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        C192031 c192031;
                        Object coroutine_suspended;
                        int i;
                        InterfaceC32730Eu1<Boolean> m79281G;
                        SaveForFutureUseController controller;
                        if (continuation instanceof C192031) {
                            c192031 = (C192031) continuation;
                            int i2 = c192031.label;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                c192031.label = i2 - Integer.MIN_VALUE;
                                Object obj2 = c192031.result;
                                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = c192031.label;
                                if (i == 0) {
                                    if (i == 1) {
                                        ResultKt.throwOnFailure(obj2);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    ResultKt.throwOnFailure(obj2);
                                    InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                    SaveForFutureUseElement saveForFutureUseElement = (SaveForFutureUseElement) obj;
                                    if (saveForFutureUseElement == null || (controller = saveForFutureUseElement.getController()) == null || (m79281G = controller.getSaveForFutureUse()) == null) {
                                        m79281G = C36708Vu1.m79281G(Boxing.boxBoolean(false));
                                    }
                                    c192031.label = 1;
                                    if (interfaceC33198Gu1.emit(m79281G, c192031) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        c192031 = new C192031(continuation);
                        Object obj22 = c192031.result;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c192031.label;
                        if (i == 0) {
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // p000.InterfaceC32730Eu1
                public Object collect(InterfaceC33198Gu1<? super InterfaceC32730Eu1<? extends Boolean>> interfaceC33198Gu1, Continuation continuation) {
                    Object coroutine_suspended;
                    Object collect = InterfaceC32730Eu1.this.collect(new C192022(interfaceC33198Gu1), continuation);
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (collect == coroutine_suspended) {
                        return collect;
                    }
                    return Unit.INSTANCE;
                }
            });
            final InterfaceC32730Eu1<CardBillingAddressElement> interfaceC32730Eu12 = new InterfaceC32730Eu1<CardBillingAddressElement>() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$3

                @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FormViewModel.kt\ncom/stripe/android/paymentsheet/forms/FormViewModel\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n48#2:223\n94#3,2:224\n96#3:237\n97#3:244\n98#3:256\n800#4,11:226\n1360#4:238\n1446#4,5:239\n800#4,11:245\n*S KotlinDebug\n*F\n+ 1 FormViewModel.kt\ncom/stripe/android/paymentsheet/forms/FormViewModel\n*L\n95#1:226,11\n96#1:238\n96#1:239,5\n97#1:245,11\n*E\n"})
                /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$3$2 */
                /* loaded from: classes7.dex */
                public static final class C192042<T> implements InterfaceC33198Gu1 {
                    final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$3$2", m28418f = "FormViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                    /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$3$2$1 */
                    /* loaded from: classes7.dex */
                    public static final class C192051 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public C192051(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C192042.this.emit(null, this);
                        }
                    }

                    public C192042(InterfaceC33198Gu1 interfaceC33198Gu1) {
                        this.$this_unsafeFlow = interfaceC33198Gu1;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                    @Override // p000.InterfaceC33198Gu1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        C192051 c192051;
                        Object coroutine_suspended;
                        int i;
                        Object firstOrNull;
                        if (continuation instanceof C192051) {
                            c192051 = (C192051) continuation;
                            int i2 = c192051.label;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                c192051.label = i2 - Integer.MIN_VALUE;
                                Object obj2 = c192051.result;
                                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = c192051.label;
                                if (i == 0) {
                                    if (i == 1) {
                                        ResultKt.throwOnFailure(obj2);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    ResultKt.throwOnFailure(obj2);
                                    InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                    ArrayList<SectionElement> arrayList = new ArrayList();
                                    for (T t : (List) obj) {
                                        if (t instanceof SectionElement) {
                                            arrayList.add(t);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    for (SectionElement sectionElement : arrayList) {
                                        CollectionsKt__MutableCollectionsKt.addAll(arrayList2, sectionElement.getFields());
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    for (T t2 : arrayList2) {
                                        if (t2 instanceof CardBillingAddressElement) {
                                            arrayList3.add(t2);
                                        }
                                    }
                                    firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList3);
                                    c192051.label = 1;
                                    if (interfaceC33198Gu1.emit(firstOrNull, c192051) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        c192051 = new C192051(continuation);
                        Object obj22 = c192051.result;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c192051.label;
                        if (i == 0) {
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // p000.InterfaceC32730Eu1
                public Object collect(InterfaceC33198Gu1<? super CardBillingAddressElement> interfaceC33198Gu1, Continuation continuation) {
                    Object coroutine_suspended;
                    Object collect = InterfaceC32730Eu1.this.collect(new C192042(interfaceC33198Gu1), continuation);
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (collect == coroutine_suspended) {
                        return collect;
                    }
                    return Unit.INSTANCE;
                }
            };
            this.cardBillingElement = interfaceC32730Eu12;
            emptySet = SetsKt__SetsKt.emptySet();
            this.externalHiddenIdentifiers = C50405vP5.m8742a(emptySet);
            InterfaceC32730Eu1<Set<IdentifierSpec>> m79258m = C36708Vu1.m79258m(showCheckboxFlow, C36708Vu1.m79285C(new InterfaceC32730Eu1<InterfaceC32730Eu1<? extends Set<? extends IdentifierSpec>>>() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$4

                @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FormViewModel.kt\ncom/stripe/android/paymentsheet/forms/FormViewModel\n*L\n1#1,222:1\n48#2:223\n110#3:224\n*E\n"})
                /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$4$2 */
                /* loaded from: classes7.dex */
                public static final class C192062<T> implements InterfaceC33198Gu1 {
                    final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$4$2", m28418f = "FormViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                    /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$4$2$1 */
                    /* loaded from: classes7.dex */
                    public static final class C192071 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public C192071(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C192062.this.emit(null, this);
                        }
                    }

                    public C192062(InterfaceC33198Gu1 interfaceC33198Gu1) {
                        this.$this_unsafeFlow = interfaceC33198Gu1;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                    @Override // p000.InterfaceC33198Gu1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        C192071 c192071;
                        Object coroutine_suspended;
                        int i;
                        Set emptySet;
                        InterfaceC32730Eu1<Set<IdentifierSpec>> m79281G;
                        if (continuation instanceof C192071) {
                            c192071 = (C192071) continuation;
                            int i2 = c192071.label;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                c192071.label = i2 - Integer.MIN_VALUE;
                                Object obj2 = c192071.result;
                                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = c192071.label;
                                if (i == 0) {
                                    if (i == 1) {
                                        ResultKt.throwOnFailure(obj2);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    ResultKt.throwOnFailure(obj2);
                                    InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                    CardBillingAddressElement cardBillingAddressElement = (CardBillingAddressElement) obj;
                                    if (cardBillingAddressElement == null || (m79281G = cardBillingAddressElement.getHiddenIdentifiers()) == null) {
                                        emptySet = SetsKt__SetsKt.emptySet();
                                        m79281G = C36708Vu1.m79281G(emptySet);
                                    }
                                    c192071.label = 1;
                                    if (interfaceC33198Gu1.emit(m79281G, c192071) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        c192071 = new C192071(continuation);
                        Object obj22 = c192071.result;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c192071.label;
                        if (i == 0) {
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // p000.InterfaceC32730Eu1
                public Object collect(InterfaceC33198Gu1<? super InterfaceC32730Eu1<? extends Set<? extends IdentifierSpec>>> interfaceC33198Gu1, Continuation continuation) {
                    Object coroutine_suspended;
                    Object collect = InterfaceC32730Eu1.this.collect(new C192062(interfaceC33198Gu1), continuation);
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (collect == coroutine_suspended) {
                        return collect;
                    }
                    return Unit.INSTANCE;
                }
            }), this.externalHiddenIdentifiers, new FormViewModel$hiddenIdentifiers$2(this, null));
            this.hiddenIdentifiers = m79258m;
            InterfaceC32730Eu1<Boolean> m79257n = C36708Vu1.m79257n(m79258m, m79281G, new FormViewModel$showingMandate$1(null));
            this.showingMandate = m79257n;
            InterfaceC32730Eu1<PaymentSelection.CustomerRequestedSave> m79285C = C36708Vu1.m79285C(C36708Vu1.m79257n(C36708Vu1.m79249v(m79281G), showCheckboxFlow, new FormViewModel$userRequestedReuse$1(null)));
            this.userRequestedReuse = m79285C;
            final InterfaceC32730Eu1 m79249v = C36708Vu1.m79249v(m79281G);
            this.completeFormValues = new CompleteFormFieldValueFilter(C36708Vu1.m79285C(new InterfaceC32730Eu1<InterfaceC32730Eu1<? extends Map<IdentifierSpec, ? extends FormFieldEntry>>>() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$5

                @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FormViewModel.kt\ncom/stripe/android/paymentsheet/forms/FormViewModel\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,222:1\n48#2:223\n167#3:224\n168#3:228\n166#3:230\n1549#4:225\n1620#4,2:226\n1622#4:229\n287#5:231\n288#5:236\n37#6:232\n36#6,3:233\n106#7:237\n*S KotlinDebug\n*F\n+ 1 FormViewModel.kt\ncom/stripe/android/paymentsheet/forms/FormViewModel\n*L\n167#1:225\n167#1:226,2\n167#1:229\n166#1:231\n166#1:236\n166#1:232\n166#1:233,3\n166#1:237\n*E\n"})
                /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$5$2 */
                /* loaded from: classes7.dex */
                public static final class C192082<T> implements InterfaceC33198Gu1 {
                    final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$5$2", m28418f = "FormViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                    /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$5$2$1 */
                    /* loaded from: classes7.dex */
                    public static final class C192091 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public C192091(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C192082.this.emit(null, this);
                        }
                    }

                    public C192082(InterfaceC33198Gu1 interfaceC33198Gu1) {
                        this.$this_unsafeFlow = interfaceC33198Gu1;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                    @Override // p000.InterfaceC33198Gu1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        C192091 c192091;
                        Object coroutine_suspended;
                        int i;
                        int collectionSizeOrDefault;
                        List list;
                        if (continuation instanceof C192091) {
                            c192091 = (C192091) continuation;
                            int i2 = c192091.label;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                c192091.label = i2 - Integer.MIN_VALUE;
                                Object obj2 = c192091.result;
                                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = c192091.label;
                                if (i == 0) {
                                    if (i == 1) {
                                        ResultKt.throwOnFailure(obj2);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    ResultKt.throwOnFailure(obj2);
                                    InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                    List<FormElement> list2 = (List) obj;
                                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                                    for (FormElement formElement : list2) {
                                        arrayList.add(formElement.getFormFieldValueFlow());
                                    }
                                    list = CollectionsKt___CollectionsKt.toList(arrayList);
                                    Object[] array = list.toArray(new InterfaceC32730Eu1[0]);
                                    if (array != null) {
                                        final InterfaceC32730Eu1[] interfaceC32730Eu1Arr = (InterfaceC32730Eu1[]) array;
                                        InterfaceC32730Eu1<Map<IdentifierSpec, ? extends FormFieldEntry>> interfaceC32730Eu1 = 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0070: CONSTRUCTOR  (r2v4 'interfaceC32730Eu1' Eu1<java.util.Map<com.stripe.android.uicore.elements.IdentifierSpec, ? extends com.stripe.android.uicore.forms.FormFieldEntry>>) = (r6v8 'interfaceC32730Eu1Arr' Eu1[] A[DONT_INLINE]) call: com.stripe.android.paymentsheet.forms.FormViewModel$completeFormValues$lambda$8$$inlined$combine$1.<init>(Eu1[]):void type: CONSTRUCTOR in method: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$5.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes7.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:289)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:252)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:137)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.stripe.android.paymentsheet.forms.FormViewModel$completeFormValues$lambda$8$$inlined$combine$1, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:698)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:397)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:282)
                                            	... 39 more
                                            */
                                        /*
                                            this = this;
                                            boolean r0 = r7 instanceof com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$5.C192082.C192091
                                            if (r0 == 0) goto L13
                                            r0 = r7
                                            com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$5$2$1 r0 = (com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$5.C192082.C192091) r0
                                            int r1 = r0.label
                                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                            r3 = r1 & r2
                                            if (r3 == 0) goto L13
                                            int r1 = r1 - r2
                                            r0.label = r1
                                            goto L18
                                        L13:
                                            com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$5$2$1 r0 = new com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$5$2$1
                                            r0.<init>(r7)
                                        L18:
                                            java.lang.Object r7 = r0.result
                                            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                            int r2 = r0.label
                                            r3 = 1
                                            if (r2 == 0) goto L31
                                            if (r2 != r3) goto L29
                                            kotlin.ResultKt.throwOnFailure(r7)
                                            goto L7c
                                        L29:
                                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                            r6.<init>(r7)
                                            throw r6
                                        L31:
                                            kotlin.ResultKt.throwOnFailure(r7)
                                            Gu1 r7 = r5.$this_unsafeFlow
                                            java.util.List r6 = (java.util.List) r6
                                            java.lang.Iterable r6 = (java.lang.Iterable) r6
                                            java.util.ArrayList r2 = new java.util.ArrayList
                                            r4 = 10
                                            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r6, r4)
                                            r2.<init>(r4)
                                            java.util.Iterator r6 = r6.iterator()
                                        L49:
                                            boolean r4 = r6.hasNext()
                                            if (r4 == 0) goto L5d
                                            java.lang.Object r4 = r6.next()
                                            com.stripe.android.uicore.elements.FormElement r4 = (com.stripe.android.uicore.elements.FormElement) r4
                                            Eu1 r4 = r4.getFormFieldValueFlow()
                                            r2.add(r4)
                                            goto L49
                                        L5d:
                                            java.util.List r6 = kotlin.collections.CollectionsKt.toList(r2)
                                            java.util.Collection r6 = (java.util.Collection) r6
                                            r2 = 0
                                            Eu1[] r2 = new p000.InterfaceC32730Eu1[r2]
                                            java.lang.Object[] r6 = r6.toArray(r2)
                                            if (r6 == 0) goto L7f
                                            Eu1[] r6 = (p000.InterfaceC32730Eu1[]) r6
                                            com.stripe.android.paymentsheet.forms.FormViewModel$completeFormValues$lambda$8$$inlined$combine$1 r2 = new com.stripe.android.paymentsheet.forms.FormViewModel$completeFormValues$lambda$8$$inlined$combine$1
                                            r2.<init>(r6)
                                            r0.label = r3
                                            java.lang.Object r6 = r7.emit(r2, r0)
                                            if (r6 != r1) goto L7c
                                            return r1
                                        L7c:
                                            kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                            return r6
                                        L7f:
                                            java.lang.NullPointerException r6 = new java.lang.NullPointerException
                                            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                                            r6.<init>(r7)
                                            throw r6
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$5.C192082.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                                    }
                                }

                                @Override // p000.InterfaceC32730Eu1
                                public Object collect(InterfaceC33198Gu1<? super InterfaceC32730Eu1<? extends Map<IdentifierSpec, ? extends FormFieldEntry>>> interfaceC33198Gu1, Continuation continuation) {
                                    Object coroutine_suspended;
                                    Object collect = InterfaceC32730Eu1.this.collect(new C192082(interfaceC33198Gu1), continuation);
                                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    if (collect == coroutine_suspended) {
                                        return collect;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), m79258m, m79257n, m79285C).filterFlow();
                            final InterfaceC32730Eu1 m79249v2 = C36708Vu1.m79249v(m79281G);
                            InterfaceC32730Eu1<List<IdentifierSpec>> m79285C2 = C36708Vu1.m79285C(new InterfaceC32730Eu1<InterfaceC32730Eu1<? extends List<? extends IdentifierSpec>>>() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$6

                                @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FormViewModel.kt\ncom/stripe/android/paymentsheet/forms/FormViewModel\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,222:1\n48#2:223\n180#3:224\n1549#4:225\n1620#4,3:226\n287#5:229\n288#5:234\n37#6:230\n36#6,3:231\n106#7:235\n*S KotlinDebug\n*F\n+ 1 FormViewModel.kt\ncom/stripe/android/paymentsheet/forms/FormViewModel\n*L\n180#1:225\n180#1:226,3\n180#1:229\n180#1:234\n180#1:230\n180#1:231,3\n180#1:235\n*E\n"})
                                /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$6$2 */
                                /* loaded from: classes7.dex */
                                public static final class C192102<T> implements InterfaceC33198Gu1 {
                                    final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                                    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                                    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$6$2", m28418f = "FormViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                                    /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$6$2$1 */
                                    /* loaded from: classes7.dex */
                                    public static final class C192111 extends ContinuationImpl {
                                        Object L$0;
                                        int label;
                                        /* synthetic */ Object result;

                                        public C192111(Continuation continuation) {
                                            super(continuation);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) {
                                            this.result = obj;
                                            this.label |= Integer.MIN_VALUE;
                                            return C192102.this.emit(null, this);
                                        }
                                    }

                                    public C192102(InterfaceC33198Gu1 interfaceC33198Gu1) {
                                        this.$this_unsafeFlow = interfaceC33198Gu1;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                                    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                                    @Override // p000.InterfaceC33198Gu1
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Object emit(Object obj, Continuation continuation) {
                                        C192111 c192111;
                                        Object coroutine_suspended;
                                        int i;
                                        int collectionSizeOrDefault;
                                        List list;
                                        if (continuation instanceof C192111) {
                                            c192111 = (C192111) continuation;
                                            int i2 = c192111.label;
                                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                                c192111.label = i2 - Integer.MIN_VALUE;
                                                Object obj2 = c192111.result;
                                                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                i = c192111.label;
                                                if (i == 0) {
                                                    if (i == 1) {
                                                        ResultKt.throwOnFailure(obj2);
                                                    } else {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                } else {
                                                    ResultKt.throwOnFailure(obj2);
                                                    InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                                    List<FormElement> list2 = (List) obj;
                                                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                                                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                                                    for (FormElement formElement : list2) {
                                                        arrayList.add(formElement.getTextFieldIdentifiers());
                                                    }
                                                    list = CollectionsKt___CollectionsKt.toList(arrayList);
                                                    Object[] array = list.toArray(new InterfaceC32730Eu1[0]);
                                                    if (array != null) {
                                                        final InterfaceC32730Eu1[] interfaceC32730Eu1Arr = (InterfaceC32730Eu1[]) array;
                                                        InterfaceC32730Eu1<List<? extends IdentifierSpec>> interfaceC32730Eu1 = 
                                                        /*  JADX ERROR: Method code generation error
                                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0070: CONSTRUCTOR  (r2v4 'interfaceC32730Eu1' Eu1<java.util.List<? extends com.stripe.android.uicore.elements.IdentifierSpec>>) = (r6v8 'interfaceC32730Eu1Arr' Eu1[] A[DONT_INLINE]) call: com.stripe.android.paymentsheet.forms.FormViewModel$textFieldControllerIdsFlow$lambda$11$$inlined$combine$1.<init>(Eu1[]):void type: CONSTRUCTOR in method: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$6.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes7.dex
                                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:289)
                                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:252)
                                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:137)
                                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.stripe.android.paymentsheet.forms.FormViewModel$textFieldControllerIdsFlow$lambda$11$$inlined$combine$1, state: NOT_LOADED
                                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:698)
                                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:397)
                                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:282)
                                                            	... 39 more
                                                            */
                                                        /*
                                                            this = this;
                                                            boolean r0 = r7 instanceof com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$6.C192102.C192111
                                                            if (r0 == 0) goto L13
                                                            r0 = r7
                                                            com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$6$2$1 r0 = (com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$6.C192102.C192111) r0
                                                            int r1 = r0.label
                                                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                                            r3 = r1 & r2
                                                            if (r3 == 0) goto L13
                                                            int r1 = r1 - r2
                                                            r0.label = r1
                                                            goto L18
                                                        L13:
                                                            com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$6$2$1 r0 = new com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$6$2$1
                                                            r0.<init>(r7)
                                                        L18:
                                                            java.lang.Object r7 = r0.result
                                                            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                                            int r2 = r0.label
                                                            r3 = 1
                                                            if (r2 == 0) goto L31
                                                            if (r2 != r3) goto L29
                                                            kotlin.ResultKt.throwOnFailure(r7)
                                                            goto L7c
                                                        L29:
                                                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                                            r6.<init>(r7)
                                                            throw r6
                                                        L31:
                                                            kotlin.ResultKt.throwOnFailure(r7)
                                                            Gu1 r7 = r5.$this_unsafeFlow
                                                            java.util.List r6 = (java.util.List) r6
                                                            java.lang.Iterable r6 = (java.lang.Iterable) r6
                                                            java.util.ArrayList r2 = new java.util.ArrayList
                                                            r4 = 10
                                                            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r6, r4)
                                                            r2.<init>(r4)
                                                            java.util.Iterator r6 = r6.iterator()
                                                        L49:
                                                            boolean r4 = r6.hasNext()
                                                            if (r4 == 0) goto L5d
                                                            java.lang.Object r4 = r6.next()
                                                            com.stripe.android.uicore.elements.FormElement r4 = (com.stripe.android.uicore.elements.FormElement) r4
                                                            Eu1 r4 = r4.getTextFieldIdentifiers()
                                                            r2.add(r4)
                                                            goto L49
                                                        L5d:
                                                            java.util.List r6 = kotlin.collections.CollectionsKt.toList(r2)
                                                            java.util.Collection r6 = (java.util.Collection) r6
                                                            r2 = 0
                                                            Eu1[] r2 = new p000.InterfaceC32730Eu1[r2]
                                                            java.lang.Object[] r6 = r6.toArray(r2)
                                                            if (r6 == 0) goto L7f
                                                            Eu1[] r6 = (p000.InterfaceC32730Eu1[]) r6
                                                            com.stripe.android.paymentsheet.forms.FormViewModel$textFieldControllerIdsFlow$lambda$11$$inlined$combine$1 r2 = new com.stripe.android.paymentsheet.forms.FormViewModel$textFieldControllerIdsFlow$lambda$11$$inlined$combine$1
                                                            r2.<init>(r6)
                                                            r0.label = r3
                                                            java.lang.Object r6 = r7.emit(r2, r0)
                                                            if (r6 != r1) goto L7c
                                                            return r1
                                                        L7c:
                                                            kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                                            return r6
                                                        L7f:
                                                            java.lang.NullPointerException r6 = new java.lang.NullPointerException
                                                            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                                                            r6.<init>(r7)
                                                            throw r6
                                                        */
                                                        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$6.C192102.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                                                    }
                                                }

                                                @Override // p000.InterfaceC32730Eu1
                                                public Object collect(InterfaceC33198Gu1<? super InterfaceC32730Eu1<? extends List<? extends IdentifierSpec>>> interfaceC33198Gu1, Continuation continuation) {
                                                    Object coroutine_suspended;
                                                    Object collect = InterfaceC32730Eu1.this.collect(new C192102(interfaceC33198Gu1), continuation);
                                                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    if (collect == coroutine_suspended) {
                                                        return collect;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            });
                                            this.textFieldControllerIdsFlow = m79285C2;
                                            this.lastTextFieldIdentifier = C36708Vu1.m79257n(m79258m, m79285C2, new FormViewModel$lastTextFieldIdentifier$1(null));
                                            return;
                                        }
                                        throw new IllegalArgumentException("Required value was null.".toString());
                                    }

                                    public final void addHiddenIdentifiers$paymentsheet_release(Set<IdentifierSpec> identifierSpecs) {
                                        Intrinsics.checkNotNullParameter(identifierSpecs, "identifierSpecs");
                                        this.externalHiddenIdentifiers.setValue(identifierSpecs);
                                    }

                                    public final InterfaceC32730Eu1<FormFieldValues> getCompleteFormValues() {
                                        return this.completeFormValues;
                                    }

                                    public final InterfaceC32730Eu1<List<FormElement>> getElementsFlow() {
                                        return this.elementsFlow;
                                    }

                                    public final InterfaceC32730Eu1<Set<IdentifierSpec>> getHiddenIdentifiers$paymentsheet_release() {
                                        return this.hiddenIdentifiers;
                                    }

                                    public final InterfaceC32730Eu1<IdentifierSpec> getLastTextFieldIdentifier() {
                                        return this.lastTextFieldIdentifier;
                                    }

                                    public final InterfaceC32730Eu1<Boolean> getSaveForFutureUse$paymentsheet_release() {
                                        return this.saveForFutureUse;
                                    }

                                    public final InterfaceC32730Eu1<Boolean> getShowCheckboxFlow() {
                                        return this.showCheckboxFlow;
                                    }
                                }
