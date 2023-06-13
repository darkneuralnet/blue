package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.feature.transferorder.widgets.ClickableDisabledButton;
/* renamed from: ty1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49555ty1 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f111423a;

    /* renamed from: b */
    public final ClickableDisabledButton f111424b;

    /* renamed from: c */
    public final FrameLayout f111425c;

    /* renamed from: d */
    public final RecyclerView f111426d;

    /* renamed from: e */
    public final Button f111427e;

    public C49555ty1(ConstraintLayout constraintLayout, ClickableDisabledButton clickableDisabledButton, FrameLayout frameLayout, RecyclerView recyclerView, Button button) {
        this.f111423a = constraintLayout;
        this.f111424b = clickableDisabledButton;
        this.f111425c = frameLayout;
        this.f111426d = recyclerView;
        this.f111427e = button;
    }

    /* renamed from: a */
    public static C49555ty1 m11140a(View view) {
        int i = C39912di4.addBol;
        ClickableDisabledButton clickableDisabledButton = (ClickableDisabledButton) C34328Lp6.m96312a(view, i);
        if (clickableDisabledButton != null) {
            i = C39912di4.container;
            FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
            if (frameLayout != null) {
                i = C39912di4.recyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    i = C39912di4.scan;
                    Button button = (Button) C34328Lp6.m96312a(view, i);
                    if (button != null) {
                        return new C49555ty1((ConstraintLayout) view, clickableDisabledButton, frameLayout, recyclerView, button);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C49555ty1 m11138c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35442Qj4.fragment_operator_pickup, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m11140a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f111423a;
    }
}
