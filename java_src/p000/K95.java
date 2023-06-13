package p000;

import android.view.View;
import co.bird.android.app.feature.map.cluster.bird.BirdClusterManagerFactory;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.core.mvp.BaseActivity;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
/* renamed from: K95 */
/* loaded from: classes2.dex */
public final class K95 {

    /* renamed from: a */
    public final Y94<InterfaceC42524i66> f19195a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f19196b;

    /* renamed from: c */
    public final Y94<InterfaceC6097Oh> f19197c;

    /* renamed from: d */
    public final Y94<BirdClusterManagerFactory> f19198d;

    /* renamed from: e */
    public final Y94<InterfaceC40001dr4> f19199e;

    public K95(Y94<InterfaceC42524i66> y94, Y94<C36207Tq4> y942, Y94<InterfaceC6097Oh> y943, Y94<BirdClusterManagerFactory> y944, Y94<InterfaceC40001dr4> y945) {
        this.f19195a = y94;
        this.f19196b = y942;
        this.f19197c = y943;
        this.f19198d = y944;
        this.f19199e = y945;
    }

    /* renamed from: a */
    public static K95 m99120a(Y94<InterfaceC42524i66> y94, Y94<C36207Tq4> y942, Y94<InterfaceC6097Oh> y943, Y94<BirdClusterManagerFactory> y944, Y94<InterfaceC40001dr4> y945) {
        return new K95(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static H95 m99118c(InterfaceC42524i66 interfaceC42524i66, C36207Tq4 c36207Tq4, InterfaceC6097Oh interfaceC6097Oh, BirdClusterManagerFactory birdClusterManagerFactory, BaseActivity baseActivity, CameraPosition cameraPosition, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent, MapView mapView, View view, boolean z, boolean z2, BK2 bk2, boolean z3, boolean z4, InterfaceC40001dr4 interfaceC40001dr4) {
        return new H95(interfaceC42524i66, c36207Tq4, interfaceC6097Oh, birdClusterManagerFactory, baseActivity, cameraPosition, c39011cD1, reactiveMapEvent, mapView, view, z, z2, bk2, z3, z4, interfaceC40001dr4);
    }

    /* renamed from: b */
    public H95 m99119b(BaseActivity baseActivity, CameraPosition cameraPosition, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent, MapView mapView, View view, boolean z, boolean z2, BK2 bk2, boolean z3, boolean z4) {
        return m99118c(this.f19195a.get(), this.f19196b.get(), this.f19197c.get(), this.f19198d.get(), baseActivity, cameraPosition, c39011cD1, reactiveMapEvent, mapView, view, z, z2, bk2, z3, z4, this.f19199e.get());
    }
}
