package p000;

import android.location.Location;
import co.bird.android.model.persistence.BountyFlightSheetDetails;
import co.bird.android.model.persistence.BountyMapMarker;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J>\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH&J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\tH&J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b0\u0013H&J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00102\u0006\u0010\u0016\u001a\u00020\tH&J\u0016\u0010\u001a\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0016\u0010\u001b\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tH&¨\u0006\u001d"}, m28432d2 = {"LT00;", "LbI4;", "Landroid/location/Location;", "location", "", "radius", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "filters", "", "", "bypassFilterBountyIds", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "Lio/reactivex/c;", "a1", "bountyId", "Lio/reactivex/F;", "Lco/bird/android/model/persistence/BountyFlightSheetDetails;", "X", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/BountyMapMarker;", "v0", "surplusId", "", "Z", "bountyIds", "o1", "b1", "I1", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: T00 */
/* loaded from: classes2.dex */
public interface T00 extends InterfaceC38466bI4 {
    /* renamed from: I1 */
    AbstractC23461c mo75884I1(String str);

    /* renamed from: X */
    AbstractC23442F<BountyFlightSheetDetails> mo75877X(String str);

    /* renamed from: Z */
    AbstractC23442F<Boolean> mo75876Z(String str);

    /* renamed from: a1 */
    AbstractC23461c mo75875a1(Location location, double d, OperatorMapFilterBundle operatorMapFilterBundle, List<String> list, List<Geolocation> list2);

    /* renamed from: b1 */
    AbstractC23461c mo75874b1(List<String> list);

    /* renamed from: o1 */
    AbstractC23461c mo75873o1(List<String> list);

    /* renamed from: v0 */
    Observable<List<BountyMapMarker>> mo75872v0();
}
