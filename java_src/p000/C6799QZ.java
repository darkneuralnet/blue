package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: QZ */
/* loaded from: classes3.dex */
public final class C6799QZ implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f30520a;

    /* renamed from: b */
    public final Button f30521b;

    /* renamed from: c */
    public final FrameLayout f30522c;

    /* renamed from: d */
    public final RecyclerView f30523d;

    public C6799QZ(ConstraintLayout constraintLayout, Button button, FrameLayout frameLayout, RecyclerView recyclerView) {
        this.f30520a = constraintLayout;
        this.f30521b = button;
        this.f30522c = frameLayout;
        this.f30523d = recyclerView;
    }

    /* renamed from: a */
    public static C6799QZ m88405a(View view) {
        int i = C51166wh4.apply;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C51166wh4.frame;
            FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
            if (frameLayout != null) {
                i = C51166wh4.recyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    return new C6799QZ((ConstraintLayout) view, button, frameLayout, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C6799QZ m88403c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C43479jj4.bottom_sheet_local_host, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88405a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f30520a;
    }
}
