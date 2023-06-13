package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.RideMapState;
import co.bird.android.model.RideUpdateState;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\tH&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&J\u001a\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0014\u001a\u00020\u0004H&J\b\u0010\u0015\u001a\u00020\u0004H&R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00170\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00170\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019R\u001e\u0010%\u001a\u0004\u0018\u00010 8&@&X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010+\u001a\u0004\u0018\u00010&8&@&X¦\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006,"}, m28432d2 = {"LpU4;", "", "Lco/bird/android/model/wire/WireBird;", "bird", "", "k", "b", "", "m", "Lco/bird/android/model/RideMapState;", "rideMapState", "c", "expectedRideMapState", "o", "Lco/bird/android/model/RideUpdateState;", "rideUpdateState", "j", "", "focused", C17296a.f69688o, "e", "reset", "LZ84;", "Lco/bird/android/buava/Optional;", "g", "()LZ84;", "currentBird", "i", "focusedBird", "l", "f", "rideStatusUpdating", "Landroid/location/Location;", "p", "()Landroid/location/Location;", DateTokenConverter.CONVERTER_KEY, "(Landroid/location/Location;)V", "riderMapLocation", "", "h", "()Ljava/lang/Double;", "n", "(Ljava/lang/Double;)V", "riderMapRadius", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pU4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC46893pU4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: pU4$a */
    /* loaded from: classes2.dex */
    public static final class C27310a {
        public static /* synthetic */ void setFocusedBird$default(InterfaceC46893pU4 interfaceC46893pU4, WireBird wireBird, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFocusedBird");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            interfaceC46893pU4.mo15908a(wireBird, z);
        }
    }

    /* renamed from: a */
    void mo15908a(WireBird wireBird, boolean z);

    /* renamed from: b */
    void mo15907b();

    /* renamed from: c */
    void mo15906c(RideMapState rideMapState);

    /* renamed from: d */
    void mo15905d(Location location);

    /* renamed from: e */
    void mo15904e();

    /* renamed from: f */
    Z84<RideUpdateState> mo15903f();

    /* renamed from: g */
    Z84<Optional<WireBird>> mo15902g();

    /* renamed from: h */
    Double mo15901h();

    /* renamed from: i */
    Z84<Optional<WireBird>> mo15900i();

    /* renamed from: j */
    void mo15899j(RideUpdateState rideUpdateState);

    /* renamed from: k */
    void mo15898k(WireBird wireBird);

    /* renamed from: l */
    Z84<RideMapState> mo15897l();

    /* renamed from: m */
    void mo15896m(List<WireBird> list);

    /* renamed from: n */
    void mo15895n(Double d);

    /* renamed from: o */
    void mo15894o(RideMapState rideMapState);

    /* renamed from: p */
    Location mo15893p();

    void reset();
}
