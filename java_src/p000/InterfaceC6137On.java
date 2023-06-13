package p000;

import android.location.Location;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import p000.InterfaceC38466bI4;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J&\u0010\u0010\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0007\u001a\u00020\u0006H&J.\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H&J$\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00130\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00130\u001b2\u0006\u0010\u001a\u001a\u00020\u000eH&J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH&¨\u0006!"}, m28432d2 = {"LOn;", "LbI4;", "Landroid/location/Location;", "location", "", "radius", "Lco/bird/android/model/constant/MapMode;", "mapMode", "", "includeMergedArea", "Lio/reactivex/c;", "R0", "center", "", "", "cellIds", "r1", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "filters", "", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "G1", "Lio/reactivex/F;", "Lco/bird/android/model/persistence/Area;", "I0", "role", "Lio/reactivex/k;", "z1", "Lorg/joda/time/DateTime;", "before", "", "d1", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: On */
/* loaded from: classes2.dex */
public interface InterfaceC6137On extends InterfaceC38466bI4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: On$a */
    /* loaded from: classes2.dex */
    public static final class C6138a {
        /* renamed from: a */
        public static <T> AbstractC24490k<T> m91445a(InterfaceC6137On interfaceC6137On, AbstractC24490k<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38466bI4.C12353a.m64705g(interfaceC6137On, receiver);
        }
    }

    /* renamed from: G1 */
    AbstractC23461c mo74274G1(Location location, double d, OperatorMapFilterBundle operatorMapFilterBundle, List<Geolocation> list);

    /* renamed from: I0 */
    AbstractC23442F<List<Area>> mo74273I0(Location location, double d);

    /* renamed from: R0 */
    AbstractC23461c mo74264R0(Location location, double d, MapMode mapMode, boolean z);

    /* renamed from: d1 */
    AbstractC23442F<Integer> mo74251d1(MapMode mapMode, DateTime dateTime);

    /* renamed from: r1 */
    AbstractC23461c mo74248r1(Location location, Set<String> set, MapMode mapMode);

    /* renamed from: z1 */
    AbstractC24490k<List<Area>> mo74247z1(String str);
}
