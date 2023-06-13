package p000;

import android.view.View;
import co.bird.android.app.feature.map.cluster.bird.BirdClusterManagerFactory;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.MapMode;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
/* renamed from: SG4 */
/* loaded from: classes2.dex */
public final class SG4 {

    /* renamed from: a */
    public final Y94<InterfaceC42524i66> f33405a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f33406b;

    /* renamed from: c */
    public final Y94<InterfaceC6097Oh> f33407c;

    /* renamed from: d */
    public final Y94<BirdClusterManagerFactory> f33408d;

    /* renamed from: e */
    public final Y94<InterfaceC40001dr4> f33409e;

    public SG4(Y94<InterfaceC42524i66> y94, Y94<C36207Tq4> y942, Y94<InterfaceC6097Oh> y943, Y94<BirdClusterManagerFactory> y944, Y94<InterfaceC40001dr4> y945) {
        this.f33405a = y94;
        this.f33406b = y942;
        this.f33407c = y943;
        this.f33408d = y944;
        this.f33409e = y945;
    }

    /* renamed from: a */
    public static SG4 m85786a(Y94<InterfaceC42524i66> y94, Y94<C36207Tq4> y942, Y94<InterfaceC6097Oh> y943, Y94<BirdClusterManagerFactory> y944, Y94<InterfaceC40001dr4> y945) {
        return new SG4(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static PG4 m85784c(InterfaceC42524i66 interfaceC42524i66, C36207Tq4 c36207Tq4, InterfaceC6097Oh interfaceC6097Oh, BirdClusterManagerFactory birdClusterManagerFactory, BaseActivity baseActivity, CameraPosition cameraPosition, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent, MapView mapView, View view, MapMode mapMode, boolean z, boolean z2, BK2 bk2, boolean z3, View view2, InterfaceC40001dr4 interfaceC40001dr4) {
        return new PG4(interfaceC42524i66, c36207Tq4, interfaceC6097Oh, birdClusterManagerFactory, baseActivity, cameraPosition, c39011cD1, reactiveMapEvent, mapView, view, mapMode, z, z2, bk2, z3, view2, interfaceC40001dr4);
    }

    /* renamed from: b */
    public PG4 m85785b(BaseActivity baseActivity, CameraPosition cameraPosition, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent, MapView mapView, View view, MapMode mapMode, boolean z, boolean z2, BK2 bk2, boolean z3, View view2) {
        return m85784c(this.f33405a.get(), this.f33406b.get(), this.f33407c.get(), this.f33408d.get(), baseActivity, cameraPosition, c39011cD1, reactiveMapEvent, mapView, view, mapMode, z, z2, bk2, z3, view2, this.f33409e.get());
    }
}
