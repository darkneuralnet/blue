package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import co.bird.android.app.feature.map.infowindow.widget.LayeredBadgeView;
/* renamed from: Cp6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32222Cp6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f4785a;

    /* renamed from: b */
    public final Barrier f4786b;

    /* renamed from: c */
    public final LayeredBadgeView f4787c;

    /* renamed from: d */
    public final LayeredBadgeView f4788d;

    /* renamed from: e */
    public final LayeredBadgeView f4789e;

    /* renamed from: f */
    public final LayeredBadgeView f4790f;

    /* renamed from: g */
    public final TextView f4791g;

    /* renamed from: h */
    public final TextView f4792h;

    public C32222Cp6(View view, Barrier barrier, LayeredBadgeView layeredBadgeView, LayeredBadgeView layeredBadgeView2, LayeredBadgeView layeredBadgeView3, LayeredBadgeView layeredBadgeView4, TextView textView, TextView textView2) {
        this.f4785a = view;
        this.f4786b = barrier;
        this.f4787c = layeredBadgeView;
        this.f4788d = layeredBadgeView2;
        this.f4789e = layeredBadgeView3;
        this.f4790f = layeredBadgeView4;
        this.f4791g = textView;
        this.f4792h = textView2;
    }

    /* renamed from: a */
    public static C32222Cp6 m111434a(View view) {
        int i = C31680Ah4.badgeBarrier;
        Barrier barrier = (Barrier) C34328Lp6.m96312a(view, i);
        if (barrier != null) {
            i = C31680Ah4.noParkBadge;
            LayeredBadgeView layeredBadgeView = (LayeredBadgeView) C34328Lp6.m96312a(view, i);
            if (layeredBadgeView != null) {
                i = C31680Ah4.noRideBadge;
                LayeredBadgeView layeredBadgeView2 = (LayeredBadgeView) C34328Lp6.m96312a(view, i);
                if (layeredBadgeView2 != null) {
                    i = C31680Ah4.parkingZoneBadge;
                    LayeredBadgeView layeredBadgeView3 = (LayeredBadgeView) C34328Lp6.m96312a(view, i);
                    if (layeredBadgeView3 != null) {
                        i = C31680Ah4.slowZoneBadge;
                        LayeredBadgeView layeredBadgeView4 = (LayeredBadgeView) C34328Lp6.m96312a(view, i);
                        if (layeredBadgeView4 != null) {
                            i = C31680Ah4.snippetText;
                            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView != null) {
                                i = C31680Ah4.titleText;
                                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView2 != null) {
                                    return new C32222Cp6(view, barrier, layeredBadgeView, layeredBadgeView2, layeredBadgeView3, layeredBadgeView4, textView, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C32222Cp6 m111433b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45258mj4.view_area_info_window, viewGroup);
            return m111434a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f4785a;
    }
}
