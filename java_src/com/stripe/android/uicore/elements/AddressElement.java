package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.C19423R;
import com.stripe.android.uicore.address.AddressRepository;
import com.stripe.android.uicore.elements.AddressType;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010<\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020\f0=\u0012\b\b\u0002\u0010@\u001a\u00020?\u0012\b\u0010B\u001a\u0004\u0018\u00010A\u0012\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\bD\u0010EJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00050\u0004H\u0016J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00050\u0004H\u0016J\u001e\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\"\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\f0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0013R \u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010.R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010.R#\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00050\u00048\u0006¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\b5\u00106R\u0017\u00108\u001a\u0002078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006F"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/AddressElement;", "Lcom/stripe/android/uicore/elements/SectionMultiFieldElement;", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "sectionFieldErrorController", "LEu1;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValueFlow", "getTextFieldIdentifiers", "", "", "rawValuesMap", "", "setRawValue", "Lcom/stripe/android/uicore/address/AddressRepository;", "addressRepository", "Lcom/stripe/android/uicore/address/AddressRepository;", "Ljava/util/Map;", "Lcom/stripe/android/uicore/elements/AddressType;", "addressType", "Lcom/stripe/android/uicore/elements/AddressType;", "Lcom/stripe/android/uicore/elements/IsPlacesAvailable;", "isPlacesAvailable", "Lcom/stripe/android/uicore/elements/IsPlacesAvailable;", "Lcom/stripe/android/uicore/elements/CountryElement;", "countryElement", "Lcom/stripe/android/uicore/elements/CountryElement;", "getCountryElement", "()Lcom/stripe/android/uicore/elements/CountryElement;", "getCountryElement$annotations", "()V", "Lcom/stripe/android/uicore/elements/SimpleTextElement;", "nameElement", "Lcom/stripe/android/uicore/elements/SimpleTextElement;", "Lcom/stripe/android/uicore/elements/AddressTextFieldElement;", "addressAutoCompleteElement", "Lcom/stripe/android/uicore/elements/AddressTextFieldElement;", "Lcom/stripe/android/uicore/elements/PhoneNumberElement;", "phoneNumberElement", "Lcom/stripe/android/uicore/elements/PhoneNumberElement;", "", "currentValuesMap", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "otherFields", "LEu1;", "", "lastSameAsShipping", "Ljava/lang/Boolean;", "sameAsShippingUpdatedFlow", "fieldsUpdatedFlow", "fields", "getFields", "()LEu1;", "Lcom/stripe/android/uicore/elements/AddressController;", "controller", "Lcom/stripe/android/uicore/elements/AddressController;", "getController", "()Lcom/stripe/android/uicore/elements/AddressController;", "_identifier", "", "countryCodes", "Lcom/stripe/android/uicore/elements/DropdownFieldController;", "countryDropdownFieldController", "Lcom/stripe/android/uicore/elements/SameAsShippingElement;", "sameAsShippingElement", "shippingValuesMap", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/address/AddressRepository;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AddressType;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddressElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressElement.kt\ncom/stripe/android/uicore/elements/AddressElement\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,263:1\n47#2:264\n49#2:268\n47#2:269\n49#2:273\n50#3:265\n55#3:267\n50#3:270\n55#3:272\n106#4:266\n106#4:271\n190#5:274\n190#5:275\n*S KotlinDebug\n*F\n+ 1 AddressElement.kt\ncom/stripe/android/uicore/elements/AddressElement\n*L\n66#1:264\n66#1:268\n122#1:269\n122#1:273\n66#1:265\n66#1:267\n122#1:270\n122#1:272\n66#1:266\n122#1:271\n193#1:274\n204#1:275\n*E\n"})
/* loaded from: classes7.dex */
public class AddressElement extends SectionMultiFieldElement {
    public static final int $stable = 8;
    private final AddressTextFieldElement addressAutoCompleteElement;
    private final AddressRepository addressRepository;
    private final AddressType addressType;
    private final AddressController controller;
    private final CountryElement countryElement;
    private final Map<IdentifierSpec, String> currentValuesMap;
    private final InterfaceC32730Eu1<List<SectionFieldElement>> fields;
    private final InterfaceC32730Eu1<Unit> fieldsUpdatedFlow;
    private final IsPlacesAvailable isPlacesAvailable;
    private Boolean lastSameAsShipping;
    private final SimpleTextElement nameElement;
    private final InterfaceC32730Eu1<List<SectionFieldElement>> otherFields;
    private final PhoneNumberElement phoneNumberElement;
    private Map<IdentifierSpec, String> rawValuesMap;
    private final InterfaceC32730Eu1<Unit> sameAsShippingUpdatedFlow;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AddressElement(IdentifierSpec identifierSpec, AddressRepository addressRepository, Map map, AddressType addressType, Set set, DropdownFieldController dropdownFieldController, SameAsShippingElement sameAsShippingElement, Map map2, IsPlacesAvailable isPlacesAvailable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, addressRepository, r5, r6, r1, (i & 32) != 0 ? new DropdownFieldController(new CountryConfig(r1, null, false, false, null, null, 62, null), (String) r5.get(IdentifierSpec.Companion.getCountry())) : dropdownFieldController, sameAsShippingElement, map2, (i & 256) != 0 ? new DefaultIsPlacesAvailable() : isPlacesAvailable);
        Map map3;
        Map emptyMap;
        if ((i & 4) != 0) {
            emptyMap = MapsKt__MapsKt.emptyMap();
            map3 = emptyMap;
        } else {
            map3 = map;
        }
        AddressType.Normal normal = (i & 8) != 0 ? new AddressType.Normal(null, 1, null) : addressType;
        Set emptySet = (i & 16) != 0 ? SetsKt__SetsKt.emptySet() : set;
    }

    public static /* synthetic */ void getCountryElement$annotations() {
    }

    public final AddressController getController() {
        return this.controller;
    }

    public final CountryElement getCountryElement() {
        return this.countryElement;
    }

    public final InterfaceC32730Eu1<List<SectionFieldElement>> getFields() {
        return this.fields;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public InterfaceC32730Eu1<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        return C36708Vu1.m79271Q(this.fields, new AddressElement$getFormFieldValueFlow$$inlined$flatMapLatest$1(null));
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public InterfaceC32730Eu1<List<IdentifierSpec>> getTextFieldIdentifiers() {
        return C36708Vu1.m79271Q(this.fields, new AddressElement$getTextFieldIdentifiers$$inlined$flatMapLatest$1(null));
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public SectionFieldErrorController sectionFieldErrorController() {
        return this.controller;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public void setRawValue(Map<IdentifierSpec, String> rawValuesMap) {
        Intrinsics.checkNotNullParameter(rawValuesMap, "rawValuesMap");
        this.rawValuesMap = rawValuesMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressElement(IdentifierSpec _identifier, AddressRepository addressRepository, Map<IdentifierSpec, String> rawValuesMap, AddressType addressType, Set<String> countryCodes, DropdownFieldController countryDropdownFieldController, SameAsShippingElement sameAsShippingElement, Map<IdentifierSpec, String> map, IsPlacesAvailable isPlacesAvailable) {
        super(_identifier);
        InterfaceC32730Eu1<Boolean> m79281G;
        SameAsShippingController controller;
        Intrinsics.checkNotNullParameter(_identifier, "_identifier");
        Intrinsics.checkNotNullParameter(addressRepository, "addressRepository");
        Intrinsics.checkNotNullParameter(rawValuesMap, "rawValuesMap");
        Intrinsics.checkNotNullParameter(addressType, "addressType");
        Intrinsics.checkNotNullParameter(countryCodes, "countryCodes");
        Intrinsics.checkNotNullParameter(countryDropdownFieldController, "countryDropdownFieldController");
        Intrinsics.checkNotNullParameter(isPlacesAvailable, "isPlacesAvailable");
        this.addressRepository = addressRepository;
        this.rawValuesMap = rawValuesMap;
        this.addressType = addressType;
        this.isPlacesAvailable = isPlacesAvailable;
        IdentifierSpec.Companion companion = IdentifierSpec.Companion;
        CountryElement countryElement = new CountryElement(companion.getCountry(), countryDropdownFieldController);
        this.countryElement = countryElement;
        this.nameElement = new SimpleTextElement(companion.getName(), new SimpleTextFieldController(new SimpleTextFieldConfig(Integer.valueOf(C19423R.string.address_label_full_name), 0, 0, null, 14, null), false, this.rawValuesMap.get(companion.getName()), 2, null));
        IdentifierSpec oneLineAddress = companion.getOneLineAddress();
        SimpleTextFieldConfig simpleTextFieldConfig = new SimpleTextFieldConfig(Integer.valueOf(C19423R.string.address_label_address), 0, 0, null, 14, null);
        AddressType.ShippingCondensed shippingCondensed = addressType instanceof AddressType.ShippingCondensed ? (AddressType.ShippingCondensed) addressType : null;
        this.addressAutoCompleteElement = new AddressTextFieldElement(oneLineAddress, simpleTextFieldConfig, shippingCondensed != null ? shippingCondensed.getOnNavigation() : null);
        IdentifierSpec phone = companion.getPhone();
        String str = this.rawValuesMap.get(companion.getPhone());
        this.phoneNumberElement = new PhoneNumberElement(phone, new PhoneNumberController(str == null ? "" : str, null, null, addressType.getPhoneNumberState() == PhoneNumberState.OPTIONAL, 6, null));
        this.currentValuesMap = new LinkedHashMap();
        final InterfaceC32730Eu1 m79255p = C36708Vu1.m79255p(countryElement.getController().getRawFieldValue());
        final InterfaceC32730Eu1 interfaceC32730Eu1 = new InterfaceC32730Eu1<List<? extends SectionFieldElement>>() { // from class: com.stripe.android.uicore.elements.AddressElement$special$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AddressElement.kt\ncom/stripe/android/uicore/elements/AddressElement\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n48#2:223\n67#3,4:224\n72#3,4:230\n71#3,8:234\n2634#4:228\n1#5:229\n*S KotlinDebug\n*F\n+ 1 AddressElement.kt\ncom/stripe/android/uicore/elements/AddressElement\n*L\n70#1:228\n70#1:229\n*E\n"})
            /* renamed from: com.stripe.android.uicore.elements.AddressElement$special$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C194372<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;
                final /* synthetic */ AddressElement this$0;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.AddressElement$special$$inlined$map$1$2", m28418f = "AddressElement.kt", m28417i = {0, 0, 1, 1, 1}, m28416l = {227, 234, 223}, m28415m = "emit", m28414n = {"this", "countryCode", "this", "countryCode", "field"}, m28413s = {"L$0", "L$2", "L$0", "L$2", "L$5"})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.AddressElement$special$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194381 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    int label;
                    /* synthetic */ Object result;

                    public C194381(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194372.this.emit(null, this);
                    }
                }

                public C194372(InterfaceC33198Gu1 interfaceC33198Gu1, AddressElement addressElement) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                    this.this$0 = addressElement;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d2 -> B:34:0x00d5). Please submit an issue!!! */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194381 c194381;
                    Object coroutine_suspended;
                    int i;
                    InterfaceC33198Gu1 interfaceC33198Gu1;
                    String str;
                    AddressRepository addressRepository;
                    C194372<T> c194372;
                    PhoneNumberElement phoneNumberElement;
                    List list;
                    InterfaceC33198Gu1 interfaceC33198Gu12;
                    C194372<T> c1943722;
                    Iterator<T> it;
                    String str2;
                    Object obj2;
                    AddressType addressType;
                    IsPlacesAvailable isPlacesAvailable;
                    Map<IdentifierSpec, String> map;
                    if (continuation instanceof C194381) {
                        c194381 = (C194381) continuation;
                        int i2 = c194381.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194381.label = i2 - Integer.MIN_VALUE;
                            Object obj3 = c194381.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194381.label;
                            if (i == 0) {
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i == 3) {
                                            ResultKt.throwOnFailure(obj3);
                                            return Unit.INSTANCE;
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    SectionFieldElement sectionFieldElement = (SectionFieldElement) c194381.L$5;
                                    it = (Iterator) c194381.L$4;
                                    obj2 = (Iterable) c194381.L$3;
                                    str2 = (String) c194381.L$2;
                                    c1943722 = (C194372) c194381.L$0;
                                    ResultKt.throwOnFailure(obj3);
                                    InterfaceC33198Gu1 interfaceC33198Gu13 = (InterfaceC33198Gu1) c194381.L$1;
                                    map = c1943722.this$0.rawValuesMap;
                                    sectionFieldElement.setRawValue(map);
                                    interfaceC33198Gu12 = interfaceC33198Gu13;
                                    if (!it.hasNext()) {
                                        sectionFieldElement = (SectionFieldElement) it.next();
                                        addressType = c1943722.this$0.addressType;
                                        isPlacesAvailable = c1943722.this$0.isPlacesAvailable;
                                        c194381.L$0 = c1943722;
                                        c194381.L$1 = interfaceC33198Gu12;
                                        c194381.L$2 = str2;
                                        c194381.L$3 = obj2;
                                        c194381.L$4 = it;
                                        c194381.L$5 = sectionFieldElement;
                                        c194381.label = 2;
                                        interfaceC33198Gu13 = interfaceC33198Gu12;
                                        if (AddressElementKt.updateLine1WithAutocompleteAffordance(sectionFieldElement, str2, addressType, isPlacesAvailable, c194381) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        map = c1943722.this$0.rawValuesMap;
                                        sectionFieldElement.setRawValue(map);
                                        interfaceC33198Gu12 = interfaceC33198Gu13;
                                        if (!it.hasNext()) {
                                            c194381.L$0 = null;
                                            c194381.L$1 = null;
                                            c194381.L$2 = null;
                                            c194381.L$3 = null;
                                            c194381.L$4 = null;
                                            c194381.L$5 = null;
                                            c194381.label = 3;
                                            if (interfaceC33198Gu12.emit(obj2, c194381) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                } else {
                                    str = (String) c194381.L$2;
                                    interfaceC33198Gu1 = (InterfaceC33198Gu1) c194381.L$1;
                                    c194372 = (C194372) c194381.L$0;
                                    ResultKt.throwOnFailure(obj3);
                                }
                            } else {
                                ResultKt.throwOnFailure(obj3);
                                interfaceC33198Gu1 = this.$this_unsafeFlow;
                                str = (String) obj;
                                if (str != null) {
                                    phoneNumberElement = this.this$0.phoneNumberElement;
                                    phoneNumberElement.getController().getCountryDropdownController().onRawValueChange(str);
                                }
                                addressRepository = this.this$0.addressRepository;
                                c194381.L$0 = this;
                                c194381.L$1 = interfaceC33198Gu1;
                                c194381.L$2 = str;
                                c194381.label = 1;
                                obj3 = addressRepository.get(str, c194381);
                                if (obj3 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                c194372 = this;
                            }
                            list = (List) obj3;
                            if (list == null) {
                                list = CollectionsKt__CollectionsKt.emptyList();
                            }
                            List list2 = list;
                            interfaceC33198Gu12 = interfaceC33198Gu1;
                            c1943722 = c194372;
                            it = list2.iterator();
                            str2 = str;
                            obj2 = list2;
                            if (!it.hasNext()) {
                            }
                        }
                    }
                    c194381 = new C194381(continuation);
                    Object obj32 = c194381.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c194381.label;
                    if (i == 0) {
                    }
                    list = (List) obj32;
                    if (list == null) {
                    }
                    List list22 = list;
                    interfaceC33198Gu12 = interfaceC33198Gu1;
                    c1943722 = c194372;
                    it = list22.iterator();
                    str2 = str;
                    obj2 = list22;
                    if (!it.hasNext()) {
                    }
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super List<? extends SectionFieldElement>> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C194372(interfaceC33198Gu1, this), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        this.otherFields = interfaceC32730Eu1;
        InterfaceC32730Eu1<Unit> m79257n = C36708Vu1.m79257n(interfaceC32730Eu1, (sameAsShippingElement == null || (controller = sameAsShippingElement.getController()) == null || (m79281G = controller.getValue()) == null) ? C36708Vu1.m79281G(null) : m79281G, new AddressElement$sameAsShippingUpdatedFlow$1(this, map, null));
        this.sameAsShippingUpdatedFlow = m79257n;
        InterfaceC32730Eu1<Unit> m79257n2 = C36708Vu1.m79257n(countryElement.getController().getRawFieldValue(), C36708Vu1.m79255p(C36708Vu1.m79285C(new InterfaceC32730Eu1<InterfaceC32730Eu1<? extends List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>>() { // from class: com.stripe.android.uicore.elements.AddressElement$special$$inlined$map$2

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AddressElement.kt\ncom/stripe/android/uicore/elements/AddressElement\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,222:1\n48#2:223\n124#3,2:224\n126#3:229\n123#3:231\n1549#4:226\n1620#4,2:227\n1622#4:230\n287#5:232\n288#5:237\n37#6:233\n36#6,3:234\n106#7:238\n*S KotlinDebug\n*F\n+ 1 AddressElement.kt\ncom/stripe/android/uicore/elements/AddressElement\n*L\n125#1:226\n125#1:227,2\n125#1:230\n123#1:232\n123#1:237\n123#1:233\n123#1:234,3\n123#1:238\n*E\n"})
            /* renamed from: com.stripe.android.uicore.elements.AddressElement$special$$inlined$map$2$2 */
            /* loaded from: classes7.dex */
            public static final class C194392<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.AddressElement$special$$inlined$map$2$2", m28418f = "AddressElement.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.uicore.elements.AddressElement$special$$inlined$map$2$2$1 */
                /* loaded from: classes7.dex */
                public static final class C194401 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C194401(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C194392.this.emit(null, this);
                    }
                }

                public C194392(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C194401 c194401;
                    Object coroutine_suspended;
                    int i;
                    int collectionSizeOrDefault;
                    List list;
                    if (continuation instanceof C194401) {
                        c194401 = (C194401) continuation;
                        int i2 = c194401.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c194401.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c194401.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c194401.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                List<SectionFieldElement> list2 = (List) obj;
                                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                                for (SectionFieldElement sectionFieldElement : list2) {
                                    arrayList.add(sectionFieldElement.getFormFieldValueFlow());
                                }
                                list = CollectionsKt___CollectionsKt.toList(arrayList);
                                Object[] array = list.toArray(new InterfaceC32730Eu1[0]);
                                if (array != null) {
                                    final InterfaceC32730Eu1[] interfaceC32730Eu1Arr = (InterfaceC32730Eu1[]) array;
                                    InterfaceC32730Eu1<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> interfaceC32730Eu1 = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0070: CONSTRUCTOR  (r2v4 'interfaceC32730Eu1' Eu1<java.util.List<? extends kotlin.Pair<? extends com.stripe.android.uicore.elements.IdentifierSpec, ? extends com.stripe.android.uicore.forms.FormFieldEntry>>>) = (r6v8 'interfaceC32730Eu1Arr' Eu1[] A[DONT_INLINE]) call: com.stripe.android.uicore.elements.AddressElement$fieldsUpdatedFlow$lambda$5$$inlined$combine$1.<init>(Eu1[]):void type: CONSTRUCTOR in method: com.stripe.android.uicore.elements.AddressElement$special$$inlined$map$2.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes7.dex
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
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.stripe.android.uicore.elements.AddressElement$fieldsUpdatedFlow$lambda$5$$inlined$combine$1, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:698)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:397)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:282)
                                        	... 39 more
                                        */
                                    /*
                                        this = this;
                                        boolean r0 = r7 instanceof com.stripe.android.uicore.elements.AddressElement$special$$inlined$map$2.C194392.C194401
                                        if (r0 == 0) goto L13
                                        r0 = r7
                                        com.stripe.android.uicore.elements.AddressElement$special$$inlined$map$2$2$1 r0 = (com.stripe.android.uicore.elements.AddressElement$special$$inlined$map$2.C194392.C194401) r0
                                        int r1 = r0.label
                                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                        r3 = r1 & r2
                                        if (r3 == 0) goto L13
                                        int r1 = r1 - r2
                                        r0.label = r1
                                        goto L18
                                    L13:
                                        com.stripe.android.uicore.elements.AddressElement$special$$inlined$map$2$2$1 r0 = new com.stripe.android.uicore.elements.AddressElement$special$$inlined$map$2$2$1
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
                                        com.stripe.android.uicore.elements.SectionFieldElement r4 = (com.stripe.android.uicore.elements.SectionFieldElement) r4
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
                                        com.stripe.android.uicore.elements.AddressElement$fieldsUpdatedFlow$lambda$5$$inlined$combine$1 r2 = new com.stripe.android.uicore.elements.AddressElement$fieldsUpdatedFlow$lambda$5$$inlined$combine$1
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
                                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.uicore.elements.AddressElement$special$$inlined$map$2.C194392.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                                }
                            }

                            @Override // p000.InterfaceC32730Eu1
                            public Object collect(InterfaceC33198Gu1<? super InterfaceC32730Eu1<? extends List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>> interfaceC33198Gu1, Continuation continuation) {
                                Object coroutine_suspended;
                                Object collect = InterfaceC32730Eu1.this.collect(new C194392(interfaceC33198Gu1), continuation);
                                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (collect == coroutine_suspended) {
                                    return collect;
                                }
                                return Unit.INSTANCE;
                            }
                        })), new AddressElement$fieldsUpdatedFlow$2(this, sameAsShippingElement, map, null));
                        this.fieldsUpdatedFlow = m79257n2;
                        InterfaceC32730Eu1<List<SectionFieldElement>> m79259l = C36708Vu1.m79259l(countryElement.getController().getRawFieldValue(), interfaceC32730Eu1, m79257n, m79257n2, new AddressElement$fields$1(this, null));
                        this.fields = m79259l;
                        this.controller = new AddressController(m79259l);
                    }
                }
