package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.feature.p010ar.view.ParkingStatusBottomSheetView;
import co.bird.android.feature.p010ar.view.SemiCircleMapView;
/* renamed from: a00  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37697a00 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f49627a;

    /* renamed from: b */
    public final SemiCircleMapView f49628b;

    /* renamed from: c */
    public final ParkingStatusBottomSheetView f49629c;

    public C37697a00(ConstraintLayout constraintLayout, SemiCircleMapView semiCircleMapView, ParkingStatusBottomSheetView parkingStatusBottomSheetView) {
        this.f49627a = constraintLayout;
        this.f49628b = semiCircleMapView;
        this.f49629c = parkingStatusBottomSheetView;
    }

    /* renamed from: a */
    public static C37697a00 m72137a(View view) {
        int i = C37521Zg4.mapView;
        SemiCircleMapView semiCircleMapView = (SemiCircleMapView) C34328Lp6.m96312a(view, i);
        if (semiCircleMapView != null) {
            i = C37521Zg4.parkingStatus;
            ParkingStatusBottomSheetView parkingStatusBottomSheetView = (ParkingStatusBottomSheetView) C34328Lp6.m96312a(view, i);
            if (parkingStatusBottomSheetView != null) {
                return new C37697a00((ConstraintLayout) view, semiCircleMapView, parkingStatusBottomSheetView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C37697a00 m72135c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36378Uj4.bottom_sheet_parking_status_map, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m72137a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f49627a;
    }
}
