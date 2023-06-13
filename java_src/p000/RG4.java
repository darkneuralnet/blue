package p000;

import android.view.View;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.MapMode;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
/* renamed from: RG4 */
/* loaded from: classes2.dex */
public final class RG4 implements QG4 {

    /* renamed from: a */
    public final SG4 f31780a;

    public RG4(SG4 sg4) {
        this.f31780a = sg4;
    }

    /* renamed from: b */
    public static Y94<QG4> m87001b(SG4 sg4) {
        return C39546d52.m44621a(new RG4(sg4));
    }

    @Override // p000.QG4
    /* renamed from: a */
    public PG4 mo87002a(BaseActivity baseActivity, CameraPosition cameraPosition, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent, MapView mapView, View view, MapMode mapMode, boolean z, boolean z2, BK2 bk2, boolean z3, View view2) {
        return this.f31780a.m85785b(baseActivity, cameraPosition, c39011cD1, reactiveMapEvent, mapView, view, mapMode, z, z2, bk2, z3, view2);
    }
}
