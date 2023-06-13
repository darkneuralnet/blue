package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.RideRequirement;
import co.bird.android.model.constant.RideRequirementReason;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import kotlin.Metadata;
import p000.J35;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&J&\u0010\r\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\"\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\b\u0010\u0019\u001a\u00020\u0018H&J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u000bH&J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u001a\u001a\u00020\u000bH&J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001d2\u0006\u0010\u001a\u001a\u00020\u000bH&¨\u0006\u001f"}, m28432d2 = {"LsJ4;", "", "", "onDestroy", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/constant/RideRequirementReason;", "requirementReason", "", "userGuestId", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "f", C17296a.f69688o, "Lio/reactivex/Observable;", "LJ35$a;", "e", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "h", "", "c", "rideRequirement", "b", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/F;", "g", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: sJ4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC48572sJ4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: sJ4$a */
    /* loaded from: classes2.dex */
    public static final class C28260a {
        public static /* synthetic */ AbstractC24507p checkRequirements$default(InterfaceC48572sJ4 interfaceC48572sJ4, WireBird wireBird, RideRequirementReason rideRequirementReason, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str = null;
                }
                return interfaceC48572sJ4.mo14399f(wireBird, rideRequirementReason, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkRequirements");
        }

        public static /* synthetic */ void checkRequirementsSilently$default(InterfaceC48572sJ4 interfaceC48572sJ4, WireBird wireBird, RideRequirementReason rideRequirementReason, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkRequirementsSilently");
            }
            if ((i & 4) != 0) {
                str = null;
            }
            interfaceC48572sJ4.mo14404a(wireBird, rideRequirementReason, str);
        }
    }

    /* renamed from: a */
    void mo14404a(WireBird wireBird, RideRequirementReason rideRequirementReason, String str);

    /* renamed from: b */
    void mo14403b(RideRequirement rideRequirement);

    /* renamed from: c */
    boolean mo14402c();

    /* renamed from: d */
    AbstractC24507p<RideRequirement> mo14401d(RideRequirement rideRequirement);

    /* renamed from: e */
    Observable<J35.C3879a> mo14400e();

    /* renamed from: f */
    AbstractC24507p<RideRequirement> mo14399f(WireBird wireBird, RideRequirementReason rideRequirementReason, String str);

    /* renamed from: g */
    AbstractC23442F<Boolean> mo14398g(RideRequirement rideRequirement);

    /* renamed from: h */
    AbstractC24507p<RideRequirement> mo14397h();

    void onActivityResult(int i, int i2, Intent intent);

    void onDestroy();
}
