package co.bird.android.model;

import co.bird.android.model.wire.WireEndRidePhotoParkingEvaluation;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, m28432d2 = {"toPhotoReviewStatus", "", "Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PhotoReviewStatusKt {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r0 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String toPhotoReviewStatus(WireEndRidePhotoParkingEvaluation wireEndRidePhotoParkingEvaluation) {
        PhotoReviewStatus photoReviewStatus;
        if (wireEndRidePhotoParkingEvaluation != null) {
            if (wireEndRidePhotoParkingEvaluation.getProperParking()) {
                photoReviewStatus = PhotoReviewStatus.GOOD;
            } else {
                photoReviewStatus = PhotoReviewStatus.BAD;
            }
        }
        photoReviewStatus = PhotoReviewStatus.IN_REVIEW;
        return photoReviewStatus.toString();
    }
}
