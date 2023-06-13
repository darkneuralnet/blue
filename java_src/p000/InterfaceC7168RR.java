package p000;

import android.location.Location;
import co.bird.android.model.constant.BulkScanPurpose;
import co.bird.android.model.constant.OperatorMapKind;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.BirdMapMarker;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC38466bI4;
@Metadata(m28433d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u0007H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&J(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&J0\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH&J\"\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH&J\u001c\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u00192\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H&J#\u0010 \u001a\u00020\u00042\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u001f\"\u00020\u000bH&¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H&JF\u00101\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\bH&J\u001c\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\b0\u00072\u0006\u0010-\u001a\u00020,H&J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u0002052\u0006\u0010\u0003\u001a\u000204H&¨\u00067"}, m28432d2 = {"LRR;", "LbI4;", "Lco/bird/android/model/persistence/Bird;", "bird", "Lio/reactivex/c;", "c1", "h", "Lio/reactivex/k;", "", "r0", "U0", "", "birdId", "x0", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lco/bird/android/model/constant/ScanMode;", "mode", "Lco/bird/android/model/constant/ScanIntention;", "intention", "Lio/reactivex/p;", "c0", "Lco/bird/android/model/constant/BulkScanPurpose;", "purpose", "F0", "T0", "Lio/reactivex/Observable;", C17296a.f69688o, "birdIds", "v", "m1", "X0", "", "t", "([Ljava/lang/String;)Lio/reactivex/c;", "y1", "", "lock", "j", "Landroid/location/Location;", "location", "", "radius", "Lco/bird/android/model/constant/OperatorMapKind;", "kind", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "filters", "bypassFilterBirdIds", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "B1", "Lco/bird/android/model/persistence/BirdMapMarker;", "s", "Lco/bird/android/model/wire/WireBird;", "Lio/reactivex/F;", "w0", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: RR */
/* loaded from: classes2.dex */
public interface InterfaceC7168RR extends InterfaceC38466bI4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: RR$a */
    /* loaded from: classes2.dex */
    public static final class C7169a {
        /* renamed from: a */
        public static AbstractC23461c m86757a(InterfaceC7168RR interfaceC7168RR, AbstractC23461c receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38466bI4.C12353a.m64706f(interfaceC7168RR, receiver);
        }

        /* renamed from: b */
        public static <T> AbstractC24490k<T> m86756b(InterfaceC7168RR interfaceC7168RR, AbstractC24490k<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38466bI4.C12353a.m64705g(interfaceC7168RR, receiver);
        }

        /* renamed from: c */
        public static <T> AbstractC24507p<T> m86755c(InterfaceC7168RR interfaceC7168RR, AbstractC24507p<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38466bI4.C12353a.m64704h(interfaceC7168RR, receiver);
        }

        /* renamed from: d */
        public static <T> Observable<T> m86754d(InterfaceC7168RR interfaceC7168RR, Observable<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38466bI4.C12353a.m64703i(interfaceC7168RR, receiver);
        }

        /* renamed from: e */
        public static <T> AbstractC23442F<T> m86753e(InterfaceC7168RR interfaceC7168RR, AbstractC23442F<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38466bI4.C12353a.m64702j(interfaceC7168RR, receiver);
        }
    }

    /* renamed from: B1 */
    AbstractC23461c mo39456B1(Location location, double d, OperatorMapKind operatorMapKind, OperatorMapFilterBundle operatorMapFilterBundle, List<String> list, List<Geolocation> list2);

    /* renamed from: F0 */
    AbstractC24507p<Bird> mo39455F0(String str, ScanMode scanMode, ScanIntention scanIntention, BulkScanPurpose bulkScanPurpose);

    /* renamed from: T0 */
    AbstractC23461c mo39444T0(String str);

    /* renamed from: U0 */
    AbstractC23461c mo39442U0(Bird bird);

    /* renamed from: X0 */
    AbstractC23461c mo39438X0(BulkScanPurpose bulkScanPurpose);

    /* renamed from: a */
    Observable<Bird> mo39434a(String str);

    /* renamed from: c0 */
    AbstractC24507p<Bird> mo39431c0(String str, ScanMode scanMode, ScanIntention scanIntention);

    /* renamed from: c1 */
    AbstractC23461c mo39430c1(Bird bird);

    /* renamed from: h */
    AbstractC23461c mo39424h();

    /* renamed from: j */
    AbstractC23461c mo39421j(String str, boolean z);

    /* renamed from: m1 */
    Observable<List<Bird>> mo39417m1(BulkScanPurpose bulkScanPurpose);

    /* renamed from: r0 */
    AbstractC24490k<List<Bird>> mo39411r0();

    /* renamed from: s */
    AbstractC24490k<List<BirdMapMarker>> mo39410s(OperatorMapFilterBundle operatorMapFilterBundle);

    /* renamed from: t */
    AbstractC23461c mo39409t(String... strArr);

    /* renamed from: v */
    AbstractC24490k<List<Bird>> mo39408v(List<String> list);

    /* renamed from: w0 */
    AbstractC23442F<Bird> mo39407w0(WireBird wireBird);

    /* renamed from: x0 */
    AbstractC23461c mo39406x0(String str);

    /* renamed from: y1 */
    AbstractC23461c mo39405y1(String str);
}
