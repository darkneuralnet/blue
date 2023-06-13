package com.stripe.android.uicore.elements;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@"}, m28432d2 = {"", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "fields", "", "sameAsShippingValue", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.uicore.elements.AddressElement$sameAsShippingUpdatedFlow$1", m28418f = "AddressElement.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nAddressElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressElement.kt\ncom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,263:1\n442#2:264\n392#2:265\n1238#3,4:266\n1855#3,2:270\n*S KotlinDebug\n*F\n+ 1 AddressElement.kt\ncom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1\n*L\n105#1:264\n105#1:265\n105#1:266,4\n113#1:270,2\n*E\n"})
/* loaded from: classes7.dex */
public final class AddressElement$sameAsShippingUpdatedFlow$1 extends SuspendLambda implements Function3<List<? extends SectionFieldElement>, Boolean, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<IdentifierSpec, String> $shippingValuesMap;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AddressElement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressElement$sameAsShippingUpdatedFlow$1(AddressElement addressElement, Map<IdentifierSpec, String> map, Continuation<? super AddressElement$sameAsShippingUpdatedFlow$1> continuation) {
        super(3, continuation);
        this.this$0 = addressElement;
        this.$shippingValuesMap = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        List listOf;
        List<SectionFieldElement> plus;
        Map map;
        int mapCapacity;
        Map map2;
        String str;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            Boolean bool2 = (Boolean) this.L$1;
            bool = this.this$0.lastSameAsShipping;
            if (!Intrinsics.areEqual(bool2, bool)) {
                this.this$0.lastSameAsShipping = bool2;
            } else {
                bool2 = null;
            }
            listOf = CollectionsKt__CollectionsJVMKt.listOf(this.this$0.getCountryElement());
            plus = CollectionsKt___CollectionsKt.plus((Collection) listOf, (Iterable) list);
            if (bool2 == null) {
                return null;
            }
            Map map3 = this.$shippingValuesMap;
            AddressElement addressElement = this.this$0;
            if (bool2.booleanValue()) {
                if (map3 == null) {
                    map3 = MapsKt__MapsKt.emptyMap();
                }
            } else {
                map = addressElement.currentValuesMap;
                mapCapacity = MapsKt__MapsJVMKt.mapCapacity(map.size());
                map3 = new LinkedHashMap(mapCapacity);
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    if (Intrinsics.areEqual(entry.getKey(), IdentifierSpec.Companion.getCountry())) {
                        str = (String) entry.getValue();
                    } else {
                        map2 = addressElement.rawValuesMap;
                        str = (String) map2.get(entry.getKey());
                        if (str == null) {
                            str = "";
                        }
                    }
                    map3.put(key, str);
                }
            }
            for (SectionFieldElement sectionFieldElement : plus) {
                sectionFieldElement.setRawValue(map3);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(List<? extends SectionFieldElement> list, Boolean bool, Continuation<? super Unit> continuation) {
        AddressElement$sameAsShippingUpdatedFlow$1 addressElement$sameAsShippingUpdatedFlow$1 = new AddressElement$sameAsShippingUpdatedFlow$1(this.this$0, this.$shippingValuesMap, continuation);
        addressElement$sameAsShippingUpdatedFlow$1.L$0 = list;
        addressElement$sameAsShippingUpdatedFlow$1.L$1 = bool;
        return addressElement$sameAsShippingUpdatedFlow$1.invokeSuspend(Unit.INSTANCE);
    }
}
