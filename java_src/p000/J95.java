package p000;

import android.view.View;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.core.mvp.BaseActivity;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
/* renamed from: J95 */
/* loaded from: classes2.dex */
public final class J95 implements I95 {

    /* renamed from: a */
    public final K95 f16912a;

    public J95(K95 k95) {
        this.f16912a = k95;
    }

    /* renamed from: b */
    public static Y94<I95> m101076b(K95 k95) {
        return C39546d52.m44621a(new J95(k95));
    }

    @Override // p000.I95
    /* renamed from: a */
    public H95 mo101077a(BaseActivity baseActivity, CameraPosition cameraPosition, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent, MapView mapView, View view, boolean z, boolean z2, BK2 bk2, boolean z3, boolean z4) {
        return this.f16912a.m99119b(baseActivity, cameraPosition, c39011cD1, reactiveMapEvent, mapView, view, z, z2, bk2, z3, z4);
    }
}
