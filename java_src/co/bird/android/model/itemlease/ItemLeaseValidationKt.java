package co.bird.android.model.itemlease;

import co.bird.android.model.itemlease.p022enum.ItemLeaseValidationType;
import co.bird.android.model.wire.WireLeaseValidationObjectResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, m28432d2 = {"toItemLeaseValidation", "Lco/bird/android/model/itemlease/ItemLeaseValidation;", "Lco/bird/android/model/wire/WireLeaseValidationObjectResponse;", "toWire", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ItemLeaseValidationKt {
    public static final ItemLeaseValidation toItemLeaseValidation(WireLeaseValidationObjectResponse wireLeaseValidationObjectResponse) {
        Intrinsics.checkNotNullParameter(wireLeaseValidationObjectResponse, "<this>");
        String id = wireLeaseValidationObjectResponse.getId();
        String leaseId = wireLeaseValidationObjectResponse.getLeaseId();
        ItemLeaseValidationType fromWire = ItemLeaseValidationType.Companion.fromWire(wireLeaseValidationObjectResponse.getValidationType());
        String validatorId = wireLeaseValidationObjectResponse.getValidatorId();
        if (validatorId == null) {
            validatorId = "";
        }
        return new ItemLeaseValidation(id, leaseId, fromWire, validatorId, wireLeaseValidationObjectResponse.getCreatedAt(), wireLeaseValidationObjectResponse.getResult());
    }

    public static final WireLeaseValidationObjectResponse toWire(ItemLeaseValidation itemLeaseValidation) {
        Intrinsics.checkNotNullParameter(itemLeaseValidation, "<this>");
        return new WireLeaseValidationObjectResponse(itemLeaseValidation.getId(), itemLeaseValidation.getLeaseId(), itemLeaseValidation.getValidationType().toString(), itemLeaseValidation.getValidatorId(), itemLeaseValidation.getCreatedAt(), itemLeaseValidation.getResult());
    }
}
