package p000;

import co.bird.android.app.feature.map.p008ui.LocationSelectionUi;
import co.bird.android.model.persistence.Area;
import com.google.android.gms.maps.model.LatLng;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m28432d2 = {"LjR2;", "Lco/bird/android/app/feature/map/ui/LocationSelectionUi;", "LUg3;", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jR2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC43306jR2 extends LocationSelectionUi, InterfaceC36350Ug3 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jR2$a */
    /* loaded from: classes2.dex */
    public static final class C24841a {
        /* renamed from: a */
        public static Observable<Unit> m30623a(InterfaceC43306jR2 interfaceC43306jR2) {
            return LocationSelectionUi.DefaultImpls.setAreasCompleteChanges(interfaceC43306jR2);
        }

        /* renamed from: b */
        public static void m30622b(InterfaceC43306jR2 interfaceC43306jR2, Area area, LatLng latLng) {
            Intrinsics.checkNotNullParameter(area, "area");
            LocationSelectionUi.DefaultImpls.showInfoWindowForArea(interfaceC43306jR2, area, latLng);
        }
    }
}
