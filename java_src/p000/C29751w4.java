package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: w4 */
/* loaded from: classes3.dex */
public final class C29751w4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f115230a;

    /* renamed from: b */
    public final RecyclerView f115231b;

    /* renamed from: c */
    public final View f115232c;

    /* renamed from: d */
    public final Button f115233d;

    public C29751w4(RelativeLayout relativeLayout, RecyclerView recyclerView, View view, Button button) {
        this.f115230a = relativeLayout;
        this.f115231b = recyclerView;
        this.f115232c = view;
        this.f115233d = button;
    }

    /* renamed from: a */
    public static C29751w4 m7514a(View view) {
        View m96312a;
        int i = C41087fh4.bulkActionRecyclerView;
        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
        if (recyclerView != null && (m96312a = C34328Lp6.m96312a(view, (i = C41087fh4.divider))) != null) {
            i = C41087fh4.updateButton;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                return new C29751w4((RelativeLayout) view, recyclerView, m96312a, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C29751w4 m7512c(LayoutInflater layoutInflater) {
        return m7511d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C29751w4 m7511d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35901Si4.activity_operator_bulk_update, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m7514a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f115230a;
    }
}
