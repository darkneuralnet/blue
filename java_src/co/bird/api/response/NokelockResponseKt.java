package co.bird.api.response;

import co.bird.android.model.constant.NokelockResponseType;
import co.bird.android.model.wire.WireNokelockLockingData;
import co.bird.android.model.wire.WireNokelockResponseData;
import co.bird.android.model.wire.WireNokelockStateData;
import co.bird.android.model.wire.WireNokelockUnlockData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0006"}, m28432d2 = {"isLegacyLocking", "", "Lco/bird/api/response/NokelockResponse;", "isLocked", "isUnlocked", "isUnlockedOrLocking", "co.bird.android.api"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NokelockResponseKt {
    public static final boolean isLegacyLocking(NokelockResponse nokelockResponse) {
        Intrinsics.checkNotNullParameter(nokelockResponse, "<this>");
        if (nokelockResponse.getType() == NokelockResponseType.LOCKING_RESPONSE) {
            WireNokelockResponseData data = nokelockResponse.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type co.bird.android.model.wire.WireNokelockLockingData");
            if (((WireNokelockLockingData) data).getSuccess()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isLocked(NokelockResponse nokelockResponse) {
        Intrinsics.checkNotNullParameter(nokelockResponse, "<this>");
        if (nokelockResponse.getType() == NokelockResponseType.STATE_RESPONSE) {
            WireNokelockResponseData data = nokelockResponse.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type co.bird.android.model.wire.WireNokelockStateData");
            if (((WireNokelockStateData) data).isLocked()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isUnlocked(NokelockResponse nokelockResponse) {
        Intrinsics.checkNotNullParameter(nokelockResponse, "<this>");
        if (nokelockResponse.getType() == NokelockResponseType.UNLOCK_RESPONSE) {
            WireNokelockResponseData data = nokelockResponse.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type co.bird.android.model.wire.WireNokelockUnlockData");
            if (((WireNokelockUnlockData) data).getSuccess()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isUnlockedOrLocking(NokelockResponse nokelockResponse) {
        Intrinsics.checkNotNullParameter(nokelockResponse, "<this>");
        if (!isUnlocked(nokelockResponse) && !isLocked(nokelockResponse) && !isLegacyLocking(nokelockResponse)) {
            return false;
        }
        return true;
    }
}
