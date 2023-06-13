package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u008a@"}, m28432d2 = {"", "country", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "values", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.uicore.elements.AddressElement$fieldsUpdatedFlow$2", m28418f = "AddressElement.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nAddressElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressElement.kt\ncom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,263:1\n1179#2,2:264\n1253#2,4:266\n167#3,3:270\n*S KotlinDebug\n*F\n+ 1 AddressElement.kt\ncom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2\n*L\n137#1:264,2\n137#1:266,4\n141#1:270,3\n*E\n"})
/* loaded from: classes7.dex */
public final class AddressElement$fieldsUpdatedFlow$2 extends SuspendLambda implements Function3<String, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ SameAsShippingElement $sameAsShippingElement;
    final /* synthetic */ Map<IdentifierSpec, String> $shippingValuesMap;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AddressElement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressElement$fieldsUpdatedFlow$2(AddressElement addressElement, SameAsShippingElement sameAsShippingElement, Map<IdentifierSpec, String> map, Continuation<? super AddressElement$fieldsUpdatedFlow$2> continuation) {
        super(3, continuation);
        this.this$0 = addressElement;
        this.$sameAsShippingElement = sameAsShippingElement;
        this.$shippingValuesMap = map;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(String str, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>> list, Continuation<? super Unit> continuation) {
        return invoke2(str, (List<Pair<IdentifierSpec, FormFieldEntry>>) list, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map;
        int collectionSizeOrDefault;
        int mapCapacity;
        int coerceAtLeast;
        Map map2;
        Map<IdentifierSpec, String> mapOf;
        Map map3;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            List list = (List) this.L$1;
            if (str != null) {
                map3 = this.this$0.currentValuesMap;
                map3.put(IdentifierSpec.Companion.getCountry(), str);
            }
            map = this.this$0.currentValuesMap;
            List<Pair> list2 = list;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
            for (Pair pair : list2) {
                Pair pair2 = new Pair(pair.getFirst(), ((FormFieldEntry) pair.getSecond()).getValue());
                linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
            }
            map.putAll(linkedHashMap);
            map2 = this.this$0.currentValuesMap;
            Map<IdentifierSpec, String> map4 = this.$shippingValuesMap;
            boolean z = true;
            if (!map2.isEmpty()) {
                Iterator it = map2.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!Intrinsics.areEqual((map4 == null || (r3 = map4.get(entry.getKey())) == null) ? "" : "", entry.getValue())) {
                        z = false;
                        break;
                    }
                }
            }
            this.this$0.lastSameAsShipping = Boxing.boxBoolean(z);
            SameAsShippingElement sameAsShippingElement = this.$sameAsShippingElement;
            if (sameAsShippingElement != null) {
                mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(sameAsShippingElement.getIdentifier(), String.valueOf(z)));
                sameAsShippingElement.setRawValue(mapOf);
                return Unit.INSTANCE;
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, List<Pair<IdentifierSpec, FormFieldEntry>> list, Continuation<? super Unit> continuation) {
        AddressElement$fieldsUpdatedFlow$2 addressElement$fieldsUpdatedFlow$2 = new AddressElement$fieldsUpdatedFlow$2(this.this$0, this.$sameAsShippingElement, this.$shippingValuesMap, continuation);
        addressElement$fieldsUpdatedFlow$2.L$0 = str;
        addressElement$fieldsUpdatedFlow$2.L$1 = list;
        return addressElement$fieldsUpdatedFlow$2.invokeSuspend(Unit.INSTANCE);
    }
}
