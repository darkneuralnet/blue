package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.feature.p010ar.view.ParkingStatusMapBottomSheetView;
import co.bird.android.feature.p010ar.view.ScanSurroundingsBottomSheetView;
import co.bird.android.feature.p010ar.view.VpsView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: s6 */
/* loaded from: classes3.dex */
public final class C28178s6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f108248a;

    /* renamed from: b */
    public final ImageView f108249b;

    /* renamed from: c */
    public final TextView f108250c;

    /* renamed from: d */
    public final ImageView f108251d;

    /* renamed from: e */
    public final ImageView f108252e;

    /* renamed from: f */
    public final ParkingStatusMapBottomSheetView f108253f;

    /* renamed from: g */
    public final LinearProgressIndicator f108254g;

    /* renamed from: h */
    public final ImageView f108255h;

    /* renamed from: i */
    public final ScanSurroundingsBottomSheetView f108256i;

    /* renamed from: j */
    public final VpsView f108257j;

    public C28178s6(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2, ImageView imageView3, ParkingStatusMapBottomSheetView parkingStatusMapBottomSheetView, LinearProgressIndicator linearProgressIndicator, ImageView imageView4, ScanSurroundingsBottomSheetView scanSurroundingsBottomSheetView, VpsView vpsView) {
        this.f108248a = constraintLayout;
        this.f108249b = imageView;
        this.f108250c = textView;
        this.f108251d = imageView2;
        this.f108252e = imageView3;
        this.f108253f = parkingStatusMapBottomSheetView;
        this.f108254g = linearProgressIndicator;
        this.f108255h = imageView4;
        this.f108256i = scanSurroundingsBottomSheetView;
        this.f108257j = vpsView;
    }

    /* renamed from: a */
    public static C28178s6 m14785a(View view) {
        int i = C37521Zg4.buildingsOverlay;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C37521Zg4.debug;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C37521Zg4.inside;
                ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView2 != null) {
                    i = C37521Zg4.outside;
                    ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView3 != null) {
                        i = C37521Zg4.parkingStatusMapBottomSheet;
                        ParkingStatusMapBottomSheetView parkingStatusMapBottomSheetView = (ParkingStatusMapBottomSheetView) C34328Lp6.m96312a(view, i);
                        if (parkingStatusMapBottomSheetView != null) {
                            i = C37521Zg4.progressBar;
                            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                            if (linearProgressIndicator != null) {
                                i = C37521Zg4.qrCodeOverlay;
                                ImageView imageView4 = (ImageView) C34328Lp6.m96312a(view, i);
                                if (imageView4 != null) {
                                    i = C37521Zg4.scanSurroundingsBottomSheet;
                                    ScanSurroundingsBottomSheetView scanSurroundingsBottomSheetView = (ScanSurroundingsBottomSheetView) C34328Lp6.m96312a(view, i);
                                    if (scanSurroundingsBottomSheetView != null) {
                                        i = C37521Zg4.vpsView;
                                        VpsView vpsView = (VpsView) C34328Lp6.m96312a(view, i);
                                        if (vpsView != null) {
                                            return new C28178s6((ConstraintLayout) view, imageView, textView, imageView2, imageView3, parkingStatusMapBottomSheetView, linearProgressIndicator, imageView4, scanSurroundingsBottomSheetView, vpsView);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C28178s6 m14783c(LayoutInflater layoutInflater) {
        return m14782d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C28178s6 m14782d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36378Uj4.activity_vps_parking, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m14785a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f108248a;
    }
}
