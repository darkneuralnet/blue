package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.DemandAreaAnalyticsInfo;
import co.bird.android.model.LocationAreaState;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.ParkingNestData;
import co.bird.android.model.ParkingType;
import co.bird.android.model.RideState;
import co.bird.android.model.RiderAreaState;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004H&J:\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\b0\u00120\u00112\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H&J\b\u0010\u0019\u001a\u00020\u0017H&J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH&J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001dH&J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001aH&J\b\u0010!\u001a\u00020\u0017H&J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u001aH&J\b\u0010$\u001a\u00020#H&J\u0014\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0\u0011H&J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00112\u0006\u0010(\u001a\u00020#H&J*\u0010/\u001a\u00020.2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020#H&J&\u00103\u001a\u00020.2\u0006\u00100\u001a\u00020\u00042\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f012\u0006\u0010,\u001a\u00020+H&J&\u00106\u001a\u00020.2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\f\u00105\u001a\b\u0012\u0004\u0012\u0002040\bH&R \u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\b078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R \u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150%078&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u00109R \u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0%078&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u00109R \u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0%078&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u00109R \u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0%078&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u00109R \u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0%078&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u00109R \u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0%078&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u00109R \u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0%078&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u00109R \u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b078&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u00109R&\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020?0L078&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u00109R\u0016\u0010Q\u001a\u0004\u0018\u00010\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR&\u0010S\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060L078&X¦\u0004¢\u0006\u0006\u001a\u0004\bR\u00109R \u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b078&X¦\u0004¢\u0006\u0006\u001a\u0004\bT\u00109¨\u0006V"}, m28432d2 = {"Lbn;", "", "Lco/bird/android/model/RideState;", "rideState", "Landroid/location/Location;", "location", "Lco/bird/android/model/LocationAreaState;", "i", "", "Lco/bird/android/model/persistence/Area;", "areas", "Lco/bird/android/model/ParkingType;", "J", "", "radius", "", "birdId", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/ParkingNest;", "f", "Lco/bird/android/model/ParkingNestData;", MessageExtension.FIELD_DATA, "", "G", "z", "Lio/reactivex/Observable;", "Lco/bird/android/model/RiderAreaState;", "g", "LNn;", "request", "a0", "I", "T", "Q", "", "R", "Lco/bird/android/buava/Optional;", "", "N", "useLastLocation", "Lco/bird/android/model/DemandAreaAnalyticsInfo;", "y", "Lco/bird/android/model/constant/MapMode;", "mapMode", "includeMergedArea", "Lio/reactivex/c;", "Z", "center", "", "cellIds", "P", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "m", "LZ84;", "V", "()LZ84;", "parkingNests", "c0", "currentParkingNestData", "x", "currentRiderBannerArea", "Lorg/joda/time/DateTime;", "D", "areasLastRefreshRequestDateTime", "w", "areasLastRefreshDateTime", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "nestsLastRefreshRequestDateTime", "F", "nestsLastRefreshDateTime", "v", "restrictedAreaUserIsIn", "e", "areasUserIsIn", "", "O", "currentAreasEntryTimes", DateTokenConverter.CONVERTER_KEY, "()Lco/bird/android/model/RiderAreaState;", "currentRiderAreaState", "h", "areaStatesByRideId", "r", "areasNearby", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bn */
/* loaded from: classes2.dex */
public interface InterfaceC12495bn {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bn$a */
    /* loaded from: classes2.dex */
    public static final class C12496a {
        public static /* synthetic */ AbstractC23442F nearbyParkingNests$default(InterfaceC12495bn interfaceC12495bn, double d, String str, Location location, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                if ((i & 4) != 0) {
                    location = null;
                }
                return interfaceC12495bn.mo64000f(d, str, location);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nearbyParkingNests");
        }

        public static /* synthetic */ AbstractC23461c refreshAreasNearby$default(InterfaceC12495bn interfaceC12495bn, Location location, double d, MapMode mapMode, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    z = false;
                }
                return interfaceC12495bn.mo64005Z(location, d, mapMode, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshAreasNearby");
        }
    }

    /* renamed from: C */
    Z84<Optional<DateTime>> mo64018C();

    /* renamed from: D */
    Z84<Optional<DateTime>> mo64017D();

    /* renamed from: F */
    Z84<Optional<DateTime>> mo64016F();

    /* renamed from: G */
    void mo64015G(ParkingNestData parkingNestData);

    /* renamed from: I */
    Observable<C5691Nn> mo64014I();

    /* renamed from: J */
    ParkingType mo64013J(List<Area> list, Location location);

    /* renamed from: N */
    AbstractC23442F<Optional<Integer>> mo64012N();

    /* renamed from: O */
    Z84<Map<Area, DateTime>> mo64011O();

    /* renamed from: P */
    AbstractC23461c mo64010P(Location location, Set<String> set, MapMode mapMode);

    /* renamed from: Q */
    Observable<Unit> mo64009Q();

    /* renamed from: R */
    boolean mo64008R();

    /* renamed from: T */
    void mo64007T();

    /* renamed from: V */
    Z84<List<ParkingNest>> mo64006V();

    /* renamed from: Z */
    AbstractC23461c mo64005Z(Location location, double d, MapMode mapMode, boolean z);

    /* renamed from: a0 */
    void mo64004a0(C5691Nn c5691Nn);

    /* renamed from: c0 */
    Z84<Optional<ParkingNestData>> mo64003c0();

    /* renamed from: d */
    RiderAreaState mo64002d();

    /* renamed from: e */
    Z84<List<Area>> mo64001e();

    /* renamed from: f */
    AbstractC23442F<HM4<List<ParkingNest>>> mo64000f(double d, String str, Location location);

    /* renamed from: g */
    Observable<RiderAreaState> mo63999g();

    /* renamed from: h */
    Z84<Map<String, LocationAreaState>> mo63998h();

    /* renamed from: i */
    LocationAreaState mo63997i(RideState rideState, Location location);

    /* renamed from: m */
    AbstractC23461c mo63996m(Location location, double d, List<Geolocation> list);

    /* renamed from: r */
    Z84<List<Area>> mo63995r();

    /* renamed from: v */
    Z84<Optional<Area>> mo63994v();

    /* renamed from: w */
    Z84<Optional<DateTime>> mo63993w();

    /* renamed from: x */
    Z84<Optional<Area>> mo63992x();

    /* renamed from: y */
    AbstractC23442F<DemandAreaAnalyticsInfo> mo63991y(boolean z);

    /* renamed from: z */
    void mo63990z();
}
