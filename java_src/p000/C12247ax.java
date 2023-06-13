package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;
/* renamed from: ax */
/* loaded from: classes6.dex */
public final class C12247ax implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final BalloonAnchorOverlayView f56637a;

    /* renamed from: b */
    public final BalloonAnchorOverlayView f56638b;

    public C12247ax(BalloonAnchorOverlayView balloonAnchorOverlayView, BalloonAnchorOverlayView balloonAnchorOverlayView2) {
        this.f56637a = balloonAnchorOverlayView;
        this.f56638b = balloonAnchorOverlayView2;
    }

    /* renamed from: a */
    public static C12247ax m65214a(View view) {
        if (view != null) {
            BalloonAnchorOverlayView balloonAnchorOverlayView = (BalloonAnchorOverlayView) view;
            return new C12247ax(balloonAnchorOverlayView, balloonAnchorOverlayView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C12247ax m65212c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C51789xk4.balloon_layout_overlay, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m65214a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public BalloonAnchorOverlayView getRoot() {
        return this.f56637a;
    }
}
