package p000;

import android.location.Address;
import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.wire.WireLocation;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.location.LocationRequest;
import com.stripe.android.model.Stripe3ds2AuthParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0010H&J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0010H&J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u0015\u001a\u00020\u0010H&J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0015\u001a\u00020\u0010H&J \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0015\u001a\u00020\u0010H&J \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0015\u001a\u00020\u0010H&J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u0015\u001a\u00020\u0010H&J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H&J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H&J\u0010\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0013H&J\b\u0010'\u001a\u00020\u0010H&J\b\u0010)\u001a\u00020(H&J\u0010\u0010+\u001a\u00020%2\u0006\u0010$\u001a\u00020*H&J\b\u0010,\u001a\u00020%H&J\u0010\u0010-\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0013H&J\u0010\u0010/\u001a\u00020%2\u0006\u0010$\u001a\u00020.H&J\b\u00100\u001a\u00020%H&J\b\u00102\u001a\u000201H&J\u0012\u00104\u001a\u0004\u0018\u00010\u00132\u0006\u00103\u001a\u00020(H&J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u00105\u001a\u00020\u0010H&R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0013078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R \u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;078&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u00109R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u0010078&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u00109¨\u0006A"}, m28432d2 = {"Ldr4;", "", "", "name", "", "maxResult", "Lio/reactivex/Observable;", "", "Landroid/location/Address;", "u", "", "latitude", "longitude", "z", "r", "Lio/reactivex/F;", "", "h", "checkLastLocationFirst", "Landroid/location/Location;", "e", "includeLastKnownLocation", "m", "f", "", "interval", "c", "", "smallestDisplacement", "g", "Lcom/google/android/gms/location/LocationRequest;", "locationRequest", "v", "s", "j", "w", "location", "", "b", "k", "LUw2;", "x", "Lco/bird/android/model/wire/WireLocation;", "o", "y", "n", "Lr36;", "l", C17296a.f69688o, "LVw2;", DateTokenConverter.CONVERTER_KEY, Stripe3ds2AuthParams.FIELD_SOURCE, "A", "emitError", "q", "LZ84;", "p", "()LZ84;", "locationChanges", "Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "t", "lastLocationUpdateTime", "i", "allowCdnLocationPropertyObservable", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dr4 */
/* loaded from: classes2.dex */
public interface InterfaceC40001dr4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: dr4$a */
    /* loaded from: classes2.dex */
    public static final class C19874a {
        public static /* synthetic */ Observable frequentLocationUpdates$default(InterfaceC40001dr4 interfaceC40001dr4, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return interfaceC40001dr4.mo43619m(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: frequentLocationUpdates");
        }

        public static /* synthetic */ Observable locationUpdates$default(InterfaceC40001dr4 interfaceC40001dr4, long j, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                return interfaceC40001dr4.mo43629c(j, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: locationUpdates");
        }

        public static /* synthetic */ AbstractC23442F requestLocationOnce$default(InterfaceC40001dr4 interfaceC40001dr4, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return interfaceC40001dr4.mo43627e(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestLocationOnce");
        }

        public static /* synthetic */ Observable locationUpdates$default(InterfaceC40001dr4 interfaceC40001dr4, float f, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                return interfaceC40001dr4.mo43625g(f, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: locationUpdates");
        }

        public static /* synthetic */ Observable locationUpdates$default(InterfaceC40001dr4 interfaceC40001dr4, LocationRequest locationRequest, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                return interfaceC40001dr4.mo43610v(locationRequest, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: locationUpdates");
        }
    }

    /* renamed from: A */
    Location mo43632A(EnumC36493Uw2 enumC36493Uw2);

    /* renamed from: a */
    void mo43631a();

    /* renamed from: b */
    void mo43630b(Location location);

    /* renamed from: c */
    Observable<Location> mo43629c(long j, boolean z);

    /* renamed from: d */
    C36727Vw2 mo43628d();

    /* renamed from: e */
    AbstractC23442F<Location> mo43627e(boolean z);

    /* renamed from: f */
    Observable<Location> mo43626f(boolean z);

    /* renamed from: g */
    Observable<Location> mo43625g(float f, boolean z);

    /* renamed from: h */
    AbstractC23442F<Boolean> mo43624h();

    /* renamed from: i */
    Z84<Boolean> mo43623i();

    /* renamed from: j */
    Observable<Boolean> mo43622j();

    /* renamed from: k */
    boolean mo43621k();

    /* renamed from: l */
    void mo43620l(C47831r36 c47831r36);

    /* renamed from: m */
    Observable<Location> mo43619m(boolean z);

    /* renamed from: n */
    double mo43618n(Location location);

    /* renamed from: o */
    void mo43617o(WireLocation wireLocation);

    /* renamed from: p */
    Z84<Location> mo43616p();

    /* renamed from: q */
    AbstractC23442F<Boolean> mo43615q(boolean z);

    /* renamed from: r */
    Observable<String> mo43614r(double d, double d2);

    /* renamed from: s */
    Observable<Location> mo43613s(boolean z);

    /* renamed from: t */
    Z84<Optional<DateTime>> mo43612t();

    /* renamed from: u */
    Observable<List<Address>> mo43611u(String str, int i);

    /* renamed from: v */
    Observable<Location> mo43610v(LocationRequest locationRequest, boolean z);

    /* renamed from: w */
    Observable<Boolean> mo43609w();

    /* renamed from: x */
    EnumC36493Uw2 mo43608x();

    /* renamed from: y */
    void mo43607y();

    /* renamed from: z */
    Observable<List<Address>> mo43606z(double d, double d2);
}
