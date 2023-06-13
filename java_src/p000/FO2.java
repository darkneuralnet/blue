package p000;

import co.bird.android.model.BirdInspection;
import co.bird.android.model.BirdRepair;
import co.bird.android.model.MechanicRepairStep;
import co.bird.android.model.constant.Resolution;
import co.bird.android.model.wire.WireBird;
import co.bird.api.request.InspectionJobSubmission;
import co.bird.api.request.RepairJobSubmission;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&J$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH&J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&J$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010\u0014\u001a\u00020\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\rH&J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\u0006\u0010\u001a\u001a\u00020\u0002H&J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\u0006\u0010\u001a\u001a\u00020\u0002H&J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0010H&J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0$2\u0006\u0010#\u001a\u00020\u0002H&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001b0$2\u0006\u0010&\u001a\u00020\u0002H&J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001b0$2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0002H&¨\u0006*"}, m28432d2 = {"LFO2;", "", "", "birdId", "Lio/reactivex/Observable;", "Lco/bird/android/model/BirdInspection;", "r", "inspectionId", "pointId", "", "jpeg", "Lco/bird/api/request/InspectionJobSubmission;", "y", "", "inspectionJobSubmissionList", "h", "Lco/bird/android/model/constant/Resolution;", "closeReason", "x", "G", "repairId", "Lco/bird/api/request/RepairJobSubmission;", "I", "repairJobSubmissionList", "Lco/bird/android/model/BirdRepair;", "w", "taskId", "Lco/bird/android/model/wire/WireBird;", "F", "D", "v", "resolution", "i", "Lco/bird/android/model/MechanicRepairStep;", "z", "birdCode", "Lio/reactivex/F;", "g", "birdSerial", "m", "stickerId", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: FO2 */
/* loaded from: classes2.dex */
public interface FO2 {
    /* renamed from: C */
    AbstractC23442F<WireBird> mo93976C(String str, String str2);

    /* renamed from: D */
    Observable<WireBird> mo93975D(String str);

    /* renamed from: F */
    Observable<WireBird> mo93974F(String str);

    /* renamed from: G */
    Observable<BirdInspection> mo93973G(String str);

    /* renamed from: I */
    Observable<RepairJobSubmission> mo93972I(String str, String str2, byte[] bArr);

    /* renamed from: g */
    AbstractC23442F<WireBird> mo93954g(String str);

    /* renamed from: h */
    Observable<BirdInspection> mo93953h(String str, List<InspectionJobSubmission> list);

    /* renamed from: i */
    Observable<BirdRepair> mo93952i(String str, Resolution resolution);

    /* renamed from: m */
    AbstractC23442F<WireBird> mo93951m(String str);

    /* renamed from: r */
    Observable<BirdInspection> mo93950r(String str);

    /* renamed from: v */
    Observable<BirdRepair> mo93949v(String str);

    /* renamed from: w */
    Observable<BirdRepair> mo93948w(String str, List<RepairJobSubmission> list);

    /* renamed from: x */
    Observable<BirdInspection> mo93947x(String str, Resolution resolution);

    /* renamed from: y */
    Observable<InspectionJobSubmission> mo93946y(String str, String str2, byte[] bArr);

    /* renamed from: z */
    Observable<MechanicRepairStep> mo93945z(String str);
}
