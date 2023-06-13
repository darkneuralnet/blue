package p000;

import co.bird.android.app.feature.map.modelmanager.Filter;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.destination.Destination;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireLocation;
import com.stripe.android.model.PaymentMethod;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\u0012\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u000bH&J\u0012\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u000bH&J\u001a\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u0004H&J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H&J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H&J\b\u0010\u0019\u001a\u00020\u0006H&J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H&J\b\u0010\u001b\u001a\u00020\u0006H&J\u0016\u0010\u001f\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH&J\u0016\u0010 \u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH&J\u0016\u0010\"\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020!0\u001cH&J\u0016\u0010#\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020!0\u001cH&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010&R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010&R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020.0$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010&R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00060$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010&R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\b0$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010&R\u001c\u00109\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010<\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b:\u00106\"\u0004\b;\u00108R\u001c\u0010?\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b=\u00106\"\u0004\b>\u00108R\u0014\u0010B\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, m28432d2 = {"LQ11;", "", "Lco/bird/android/model/destination/Destination;", "destination", "", "animate", "", "L1", "", PaymentMethod.BillingDetails.PARAM_ADDRESS, "H1", "", "resId", "P1", "K1", "message", "clickToDismiss", "x1", "Lco/bird/android/model/persistence/Area;", "area", "I1", "", "latitude", "longitude", "M1", "z1", "C1", AbstractC3831J1.f16564d, "Lco/bird/android/app/feature/map/modelmanager/Filter;", "Lco/bird/android/model/wire/WireBird;", "filter", "w1", "z0", "Lco/bird/android/model/ParkingNest;", "addParkingFilter", "removeParkingFilter", "Lio/reactivex/Observable;", "G1", "()Lio/reactivex/Observable;", "selectDestinationClicks", "Q1", "negativeButtonClicks", "E1", "addressInputClicks", "O1", "positiveButtonClicks", "Lco/bird/android/model/wire/WireLocation;", "F1", "destinationPinDragged", "D1", "destinationPinClicks", "B1", "tooltipClicked", "getDestinationSelectionButtonVisible", "()Z", "A1", "(Z)V", "destinationSelectionButtonVisible", "getVisible", "setVisible", "visible", "N1", "y1", "selectionPinVisible", "R1", "()Ljava/lang/String;", "defaultTooltipText", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Q11 */
/* loaded from: classes2.dex */
public interface Q11 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Q11$a */
    /* loaded from: classes2.dex */
    public static final class C6644a {
        public static /* synthetic */ void setDestination$default(Q11 q11, Destination destination, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDestination");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            q11.mo86110L1(destination, z);
        }

        public static /* synthetic */ void showTooltip$default(Q11 q11, String str, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showTooltip");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            q11.mo86099x1(str, z);
        }
    }

    /* renamed from: A1 */
    void mo86121A1(boolean z);

    /* renamed from: B1 */
    Observable<String> mo86120B1();

    /* renamed from: C1 */
    void mo86119C1(double d, double d2);

    /* renamed from: D1 */
    Observable<Unit> mo86118D1();

    /* renamed from: E1 */
    Observable<Unit> mo86117E1();

    /* renamed from: F1 */
    Observable<WireLocation> mo86116F1();

    /* renamed from: G1 */
    Observable<Unit> mo86115G1();

    /* renamed from: H1 */
    void mo86114H1(String str);

    /* renamed from: I1 */
    void mo86113I1(Area area);

    /* renamed from: J1 */
    void mo86112J1();

    /* renamed from: K1 */
    void mo86111K1(int i);

    /* renamed from: L1 */
    void mo86110L1(Destination destination, boolean z);

    /* renamed from: M1 */
    void mo86109M1(double d, double d2);

    /* renamed from: N1 */
    boolean mo86108N1();

    /* renamed from: O1 */
    Observable<Unit> mo86107O1();

    /* renamed from: P1 */
    void mo86106P1(int i);

    /* renamed from: Q1 */
    Observable<Unit> mo86105Q1();

    /* renamed from: R1 */
    String mo86104R1();

    void addParkingFilter(Filter<ParkingNest> filter);

    void removeParkingFilter(Filter<ParkingNest> filter);

    void setVisible(boolean z);

    /* renamed from: w1 */
    void mo86100w1(Filter<WireBird> filter);

    /* renamed from: x1 */
    void mo86099x1(String str, boolean z);

    /* renamed from: y1 */
    void mo86098y1(boolean z);

    /* renamed from: z0 */
    void mo86097z0(Filter<WireBird> filter);

    /* renamed from: z1 */
    void mo86096z1();
}
