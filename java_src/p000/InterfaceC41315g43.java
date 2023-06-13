package p000;

import android.location.Location;
import co.bird.android.model.persistence.NestMarker;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\rH&¨\u0006\u0010"}, m28432d2 = {"Lg43;", "", "Landroid/location/Location;", "location", "", "radius", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "filters", "", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "Lio/reactivex/c;", "r", "Lio/reactivex/k;", "Lco/bird/android/model/persistence/NestMarker;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: g43  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC41315g43 {
    /* renamed from: C */
    AbstractC24490k<List<NestMarker>> mo36867C();

    /* renamed from: r */
    AbstractC23461c mo36866r(Location location, double d, OperatorMapFilterBundle operatorMapFilterBundle, List<Geolocation> list);
}
