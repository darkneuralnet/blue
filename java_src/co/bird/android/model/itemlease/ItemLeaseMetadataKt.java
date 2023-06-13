package co.bird.android.model.itemlease;

import co.bird.android.model.wire.WireLeaseMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, m28432d2 = {"toItemLeaseMetadata", "Lco/bird/android/model/itemlease/ItemLeaseMetadata;", "Lco/bird/android/model/wire/WireLeaseMetadata;", "toWire", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ItemLeaseMetadataKt {
    public static final ItemLeaseMetadata toItemLeaseMetadata(WireLeaseMetadata wireLeaseMetadata) {
        Intrinsics.checkNotNullParameter(wireLeaseMetadata, "<this>");
        return new ItemLeaseMetadata(wireLeaseMetadata.getHelmet(), wireLeaseMetadata.getPhysicalLockSticker());
    }

    public static final WireLeaseMetadata toWire(ItemLeaseMetadata itemLeaseMetadata) {
        Intrinsics.checkNotNullParameter(itemLeaseMetadata, "<this>");
        return new WireLeaseMetadata(itemLeaseMetadata.getHelmet(), itemLeaseMetadata.getPhysicalLockSticker());
    }
}
