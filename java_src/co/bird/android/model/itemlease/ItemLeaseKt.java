package co.bird.android.model.itemlease;

import co.bird.android.model.itemlease.p022enum.ItemLeaseType;
import co.bird.android.model.wire.WireLeaseAssetObjectResponse;
import co.bird.android.model.wire.WireLeaseMetadata;
import co.bird.android.model.wire.WireLeaseObjectResponse;
import co.bird.android.model.wire.WireLeaseValidationObjectResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, m28432d2 = {"toItemLease", "Lco/bird/android/model/itemlease/ItemLease;", "Lco/bird/android/model/wire/WireLeaseObjectResponse;", "toWire", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nItemLease.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemLease.kt\nco/bird/android/model/itemlease/ItemLeaseKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n1549#2:81\n1620#2,3:82\n1549#2:85\n1620#2,3:86\n1549#2:89\n1620#2,3:90\n1549#2:93\n1620#2,3:94\n*S KotlinDebug\n*F\n+ 1 ItemLease.kt\nco/bird/android/model/itemlease/ItemLeaseKt\n*L\n55#1:81\n55#1:82,3\n56#1:85\n56#1:86,3\n76#1:89\n76#1:90,3\n77#1:93\n77#1:94,3\n*E\n"})
/* loaded from: classes4.dex */
public final class ItemLeaseKt {
    public static final ItemLease toItemLease(WireLeaseObjectResponse wireLeaseObjectResponse) {
        int i;
        DateTime dateTime;
        List emptyList;
        List emptyList2;
        ArrayList arrayList;
        ItemLeaseMetadata itemLeaseMetadata;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(wireLeaseObjectResponse, "<this>");
        String id = wireLeaseObjectResponse.getId();
        String principalId = wireLeaseObjectResponse.getPrincipalId();
        ItemLeaseType fromWire = ItemLeaseType.Companion.fromWire(wireLeaseObjectResponse.getLeaseType());
        String leasedItemId = wireLeaseObjectResponse.getLeasedItemId();
        String associatedItemId = wireLeaseObjectResponse.getAssociatedItemId();
        DateTime startedAt = wireLeaseObjectResponse.getStartedAt();
        DateTime dueAt = wireLeaseObjectResponse.getDueAt();
        DateTime returnedAt = wireLeaseObjectResponse.getReturnedAt();
        DateTime finalizedAt = wireLeaseObjectResponse.getFinalizedAt();
        String currency = wireLeaseObjectResponse.getCurrency();
        int initialChargeAmount = wireLeaseObjectResponse.getInitialChargeAmount();
        int returnRefundAmount = wireLeaseObjectResponse.getReturnRefundAmount();
        int delinquentFeeAmount = wireLeaseObjectResponse.getDelinquentFeeAmount();
        DateTime delinquencySettledAt = wireLeaseObjectResponse.getDelinquencySettledAt();
        List<WireLeaseValidationObjectResponse> validations = wireLeaseObjectResponse.getValidations();
        if (validations != null) {
            List<WireLeaseValidationObjectResponse> list = validations;
            dateTime = delinquencySettledAt;
            i = delinquentFeeAmount;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (WireLeaseValidationObjectResponse wireLeaseValidationObjectResponse : list) {
                arrayList2.add(ItemLeaseValidationKt.toItemLeaseValidation(wireLeaseValidationObjectResponse));
            }
            emptyList = arrayList2;
        } else {
            i = delinquentFeeAmount;
            dateTime = delinquencySettledAt;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        List<WireLeaseAssetObjectResponse> assets = wireLeaseObjectResponse.getAssets();
        if (assets != null) {
            List<WireLeaseAssetObjectResponse> list2 = assets;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
            for (WireLeaseAssetObjectResponse wireLeaseAssetObjectResponse : list2) {
                arrayList3.add(ItemLeaseAssetKt.toItemLeaseAsset(wireLeaseAssetObjectResponse));
            }
            arrayList = arrayList3;
        } else {
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
            arrayList = emptyList2;
        }
        WireLeaseMetadata metadata = wireLeaseObjectResponse.getMetadata();
        if (metadata == null || (itemLeaseMetadata = ItemLeaseMetadataKt.toItemLeaseMetadata(metadata)) == null) {
            itemLeaseMetadata = new ItemLeaseMetadata(null, null, 3, null);
        }
        return new ItemLease(id, principalId, fromWire, leasedItemId, associatedItemId, startedAt, dueAt, returnedAt, finalizedAt, currency, initialChargeAmount, returnRefundAmount, i, dateTime, emptyList, arrayList, itemLeaseMetadata);
    }

    public static final WireLeaseObjectResponse toWire(ItemLease itemLease) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(itemLease, "<this>");
        String id = itemLease.getId();
        String principalId = itemLease.getPrincipalId();
        String itemLeaseType = itemLease.getLeaseType().toString();
        String leasedItemId = itemLease.getLeasedItemId();
        String associatedItemId = itemLease.getAssociatedItemId();
        DateTime startedAt = itemLease.getStartedAt();
        DateTime dueAt = itemLease.getDueAt();
        DateTime returnedAt = itemLease.getReturnedAt();
        String currency = itemLease.getCurrency();
        int initialChargeAmount = itemLease.getInitialChargeAmount();
        int returnRefundAmount = itemLease.getReturnRefundAmount();
        int delinquentFeeAmount = itemLease.getDelinquentFeeAmount();
        DateTime delinquencySettledAt = itemLease.getDelinquencySettledAt();
        List<ItemLeaseValidation> validations = itemLease.getValidations();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(validations, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (ItemLeaseValidation itemLeaseValidation : validations) {
            arrayList.add(ItemLeaseValidationKt.toWire(itemLeaseValidation));
        }
        List<ItemLeaseAsset> assets = itemLease.getAssets();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(assets, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (ItemLeaseAsset itemLeaseAsset : assets) {
            arrayList2.add(ItemLeaseAssetKt.toWire(itemLeaseAsset));
        }
        return new WireLeaseObjectResponse(id, principalId, itemLeaseType, leasedItemId, associatedItemId, startedAt, dueAt, returnedAt, null, currency, initialChargeAmount, returnRefundAmount, delinquentFeeAmount, delinquencySettledAt, arrayList, arrayList2, ItemLeaseMetadataKt.toWire(itemLease.getMetadata()), 256, null);
    }
}
