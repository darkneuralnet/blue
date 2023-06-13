package p000;

import android.view.View;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.core.mvp.BaseActivity;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
/* renamed from: Qm3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C35468Qm3 implements InterfaceC35234Pm3 {

    /* renamed from: a */
    public final C35702Rm3 f30922a;

    public C35468Qm3(C35702Rm3 c35702Rm3) {
        this.f30922a = c35702Rm3;
    }

    /* renamed from: b */
    public static Y94<InterfaceC35234Pm3> m87947b(C35702Rm3 c35702Rm3) {
        return C39546d52.m44621a(new C35468Qm3(c35702Rm3));
    }

    @Override // p000.InterfaceC35234Pm3
    /* renamed from: a */
    public C35000Om3 mo87948a(BaseActivity baseActivity, CameraPosition cameraPosition, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent, MapView mapView, View view, boolean z, BK2 bk2, boolean z2) {
        return this.f30922a.m86322b(baseActivity, cameraPosition, c39011cD1, reactiveMapEvent, mapView, view, z, bk2, z2);
    }
}
