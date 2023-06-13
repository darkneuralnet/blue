package p000;

import android.view.View;
import com.google.android.gms.maps.MapView;
/* renamed from: Jc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33739Jc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final MapView f17899a;

    /* renamed from: b */
    public final MapView f17900b;

    public C33739Jc2(MapView mapView, MapView mapView2) {
        this.f17899a = mapView;
        this.f17900b = mapView2;
    }

    /* renamed from: a */
    public static C33739Jc2 m100119a(View view) {
        if (view != null) {
            MapView mapView = (MapView) view;
            return new C33739Jc2(mapView, mapView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public MapView getRoot() {
        return this.f17899a;
    }
}
