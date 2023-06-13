package com.stripe.android.p049ui.core.elements;

import com.stripe.android.uicore.address.AddressRepository;
import com.stripe.android.uicore.address.FieldType;
import com.stripe.android.uicore.elements.AddressElement;
import com.stripe.android.uicore.elements.AddressType;
import com.stripe.android.uicore.elements.CountryConfig;
import com.stripe.android.uicore.elements.DropdownFieldController;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SameAsShippingElement;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;", "Lcom/stripe/android/uicore/elements/AddressElement;", "LEu1;", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "hiddenIdentifiers", "LEu1;", "getHiddenIdentifiers", "()LEu1;", "identifier", "", "", "rawValuesMap", "Lcom/stripe/android/uicore/address/AddressRepository;", "addressRepository", "countryCodes", "Lcom/stripe/android/uicore/elements/DropdownFieldController;", "countryDropdownFieldController", "Lcom/stripe/android/uicore/elements/SameAsShippingElement;", "sameAsShippingElement", "shippingValuesMap", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lcom/stripe/android/uicore/address/AddressRepository;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;)V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCardBillingAddressElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardBillingAddressElement.kt\ncom/stripe/android/ui/core/elements/CardBillingAddressElement\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,61:1\n47#2:62\n49#2:66\n50#3:63\n55#3:65\n106#4:64\n*S KotlinDebug\n*F\n+ 1 CardBillingAddressElement.kt\ncom/stripe/android/ui/core/elements/CardBillingAddressElement\n*L\n45#1:62\n45#1:66\n45#1:63\n45#1:65\n45#1:64\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.CardBillingAddressElement */
/* loaded from: classes7.dex */
public final class CardBillingAddressElement extends AddressElement {
    public static final int $stable = 8;
    private final InterfaceC32730Eu1<Set<IdentifierSpec>> hiddenIdentifiers;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CardBillingAddressElement(IdentifierSpec identifierSpec, Map map, AddressRepository addressRepository, Set set, DropdownFieldController dropdownFieldController, SameAsShippingElement sameAsShippingElement, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, r3, addressRepository, r0, (i & 16) != 0 ? new DropdownFieldController(new CountryConfig(r0, null, false, false, null, null, 62, null), (String) r3.get(IdentifierSpec.Companion.getCountry())) : dropdownFieldController, sameAsShippingElement, map2);
        Map map3;
        Map emptyMap;
        if ((i & 2) != 0) {
            emptyMap = MapsKt__MapsKt.emptyMap();
            map3 = emptyMap;
        } else {
            map3 = map;
        }
        Set emptySet = (i & 8) != 0 ? SetsKt__SetsKt.emptySet() : set;
    }

    public final InterfaceC32730Eu1<Set<IdentifierSpec>> getHiddenIdentifiers() {
        return this.hiddenIdentifiers;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBillingAddressElement(IdentifierSpec identifier, Map<IdentifierSpec, String> rawValuesMap, AddressRepository addressRepository, Set<String> countryCodes, DropdownFieldController countryDropdownFieldController, SameAsShippingElement sameAsShippingElement, Map<IdentifierSpec, String> map) {
        super(identifier, addressRepository, rawValuesMap, new AddressType.Normal(null, 1, null), countryCodes, countryDropdownFieldController, sameAsShippingElement, map, null, 256, null);
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(rawValuesMap, "rawValuesMap");
        Intrinsics.checkNotNullParameter(addressRepository, "addressRepository");
        Intrinsics.checkNotNullParameter(countryCodes, "countryCodes");
        Intrinsics.checkNotNullParameter(countryDropdownFieldController, "countryDropdownFieldController");
        final InterfaceC32730Eu1<String> rawFieldValue = countryDropdownFieldController.getRawFieldValue();
        this.hiddenIdentifiers = new InterfaceC32730Eu1<Set<? extends IdentifierSpec>>() { // from class: com.stripe.android.ui.core.elements.CardBillingAddressElement$special$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CardBillingAddressElement.kt\ncom/stripe/android/ui/core/elements/CardBillingAddressElement\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n48#2:223\n46#3,4:224\n50#3:231\n51#3,5:236\n56#3:245\n4117#4:228\n4217#4,2:229\n11335#4:241\n11670#4,3:242\n1549#5:232\n1620#5,3:233\n*S KotlinDebug\n*F\n+ 1 CardBillingAddressElement.kt\ncom/stripe/android/ui/core/elements/CardBillingAddressElement\n*L\n49#1:228\n49#1:229,2\n55#1:241\n55#1:242,3\n50#1:232\n50#1:233,3\n*E\n"})
            /* renamed from: com.stripe.android.ui.core.elements.CardBillingAddressElement$special$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C193772<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.CardBillingAddressElement$special$$inlined$map$1$2", m28418f = "CardBillingAddressElement.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.ui.core.elements.CardBillingAddressElement$special$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C193781 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C193781(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C193772.this.emit(null, this);
                    }
                }

                public C193772(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C193781 c193781;
                    Object coroutine_suspended;
                    int i;
                    Set set;
                    int hashCode;
                    int collectionSizeOrDefault;
                    boolean z;
                    if (continuation instanceof C193781) {
                        c193781 = (C193781) continuation;
                        int i2 = c193781.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c193781.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c193781.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c193781.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                String str = (String) obj;
                                if (str != null && ((hashCode = str.hashCode()) == 2142 ? str.equals("CA") : !(hashCode == 2267 ? !str.equals("GB") : !(hashCode == 2718 && str.equals("US"))))) {
                                    FieldType[] values = FieldType.values();
                                    ArrayList<FieldType> arrayList = new ArrayList();
                                    for (FieldType fieldType : values) {
                                        if (fieldType == FieldType.PostalCode) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (!z) {
                                            arrayList.add(fieldType);
                                        }
                                    }
                                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                                    ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                                    for (FieldType fieldType2 : arrayList) {
                                        arrayList2.add(fieldType2.getIdentifierSpec());
                                    }
                                    set = CollectionsKt___CollectionsKt.toSet(arrayList2);
                                } else {
                                    FieldType[] values2 = FieldType.values();
                                    ArrayList arrayList3 = new ArrayList(values2.length);
                                    for (FieldType fieldType3 : values2) {
                                        arrayList3.add(fieldType3.getIdentifierSpec());
                                    }
                                    set = CollectionsKt___CollectionsKt.toSet(arrayList3);
                                }
                                c193781.label = 1;
                                if (interfaceC33198Gu1.emit(set, c193781) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c193781 = new C193781(continuation);
                    Object obj22 = c193781.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c193781.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super Set<? extends IdentifierSpec>> interfaceC33198Gu1, Continuation continuation) {
                Object coroutine_suspended;
                Object collect = InterfaceC32730Eu1.this.collect(new C193772(interfaceC33198Gu1), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect == coroutine_suspended) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
    }
}
