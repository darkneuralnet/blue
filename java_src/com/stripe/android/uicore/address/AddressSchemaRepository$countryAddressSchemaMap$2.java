package com.stripe.android.uicore.address;

import android.content.res.AssetManager;
import android.content.res.Resources;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "", "", "Lcom/stripe/android/uicore/address/CountryAddressSchema;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nAddressSchemaRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressSchemaRepository.kt\ncom/stripe/android/uicore/address/AddressSchemaRepository$countryAddressSchemaMap$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,65:1\n1271#2,2:66\n1285#2,4:68\n1238#2,4:74\n442#3:72\n392#3:73\n*S KotlinDebug\n*F\n+ 1 AddressSchemaRepository.kt\ncom/stripe/android/uicore/address/AddressSchemaRepository$countryAddressSchemaMap$2\n*L\n18#1:66,2\n18#1:68,4\n20#1:74,4\n20#1:72\n20#1:73\n*E\n"})
/* loaded from: classes7.dex */
public final class AddressSchemaRepository$countryAddressSchemaMap$2 extends Lambda implements Function0<Map<String, ? extends List<? extends CountryAddressSchema>>> {
    final /* synthetic */ AddressSchemaRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressSchemaRepository$countryAddressSchemaMap$2(AddressSchemaRepository addressSchemaRepository) {
        super(0);
        this.this$0 = addressSchemaRepository;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends List<? extends CountryAddressSchema>> invoke() {
        int collectionSizeOrDefault;
        int mapCapacity;
        int coerceAtLeast;
        int mapCapacity2;
        AssetManager assets;
        Set<String> supported_countries = AddressSchemaRepository.Companion.getSUPPORTED_COUNTRIES();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(supported_countries, 10);
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (Object obj : supported_countries) {
            linkedHashMap.put(obj, "addressinfo/" + ((String) obj) + ".json");
        }
        AddressSchemaRepository addressSchemaRepository = this.this$0;
        mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            String str = (String) entry.getValue();
            Resources resources = addressSchemaRepository.getResources();
            List<CountryAddressSchema> parseAddressesSchema = TransformAddressToElementKt.parseAddressesSchema((resources == null || (assets = resources.getAssets()) == null) ? null : assets.open(str));
            if (parseAddressesSchema != null) {
                linkedHashMap2.put(key, parseAddressesSchema);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return linkedHashMap2;
    }
}
