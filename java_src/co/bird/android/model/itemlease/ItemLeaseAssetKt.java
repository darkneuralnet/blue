package co.bird.android.model.itemlease;

import co.bird.android.model.itemlease.p022enum.ItemLeaseAssetPurpose;
import co.bird.android.model.wire.WireLeaseAssetObjectResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, m28432d2 = {"toItemLeaseAsset", "Lco/bird/android/model/itemlease/ItemLeaseAsset;", "Lco/bird/android/model/wire/WireLeaseAssetObjectResponse;", "toWire", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ItemLeaseAssetKt {
    public static final ItemLeaseAsset toItemLeaseAsset(WireLeaseAssetObjectResponse wireLeaseAssetObjectResponse) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(wireLeaseAssetObjectResponse, "<this>");
        String id = wireLeaseAssetObjectResponse.getId();
        String leaseId = wireLeaseAssetObjectResponse.getLeaseId();
        if (leaseId == null) {
            str = "";
        } else {
            str = leaseId;
        }
        String assetId = wireLeaseAssetObjectResponse.getAssetId();
        if (assetId == null) {
            str2 = "";
        } else {
            str2 = assetId;
        }
        return new ItemLeaseAsset(id, str, str2, wireLeaseAssetObjectResponse.getCreatedAt(), ItemLeaseAssetPurpose.Companion.fromWire(wireLeaseAssetObjectResponse.getPurpose()));
    }

    public static final WireLeaseAssetObjectResponse toWire(ItemLeaseAsset itemLeaseAsset) {
        Intrinsics.checkNotNullParameter(itemLeaseAsset, "<this>");
        return new WireLeaseAssetObjectResponse(itemLeaseAsset.getId(), itemLeaseAsset.getLeaseId(), itemLeaseAsset.getAssetId(), itemLeaseAsset.getCreatedAt(), itemLeaseAsset.getPurpose().toString());
    }
}
