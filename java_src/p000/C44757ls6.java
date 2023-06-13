package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.widget.NestBadgeView;
import co.bird.android.widget.NestMarkerPin;
/* renamed from: ls6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44757ls6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f96847a;

    /* renamed from: b */
    public final NestBadgeView f96848b;

    /* renamed from: c */
    public final RecyclerView f96849c;

    /* renamed from: d */
    public final NestMarkerPin f96850d;

    public C44757ls6(ConstraintLayout constraintLayout, NestBadgeView nestBadgeView, RecyclerView recyclerView, NestMarkerPin nestMarkerPin) {
        this.f96847a = constraintLayout;
        this.f96848b = nestBadgeView;
        this.f96849c = recyclerView;
        this.f96850d = nestMarkerPin;
    }

    /* renamed from: a */
    public static C44757ls6 m26717a(View view) {
        int i = C31680Ah4.badge;
        NestBadgeView nestBadgeView = (NestBadgeView) C34328Lp6.m96312a(view, i);
        if (nestBadgeView != null) {
            i = C31680Ah4.container;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                i = C31680Ah4.pin;
                NestMarkerPin nestMarkerPin = (NestMarkerPin) C34328Lp6.m96312a(view, i);
                if (nestMarkerPin != null) {
                    return new C44757ls6((ConstraintLayout) view, nestBadgeView, recyclerView, nestMarkerPin);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C44757ls6 m26715c(LayoutInflater layoutInflater) {
        return m26714d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C44757ls6 m26714d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45258mj4.view_operator_nest_marker_expanded_selected, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m26717a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f96847a;
    }
}
