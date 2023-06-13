package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
/* renamed from: i5 */
/* loaded from: classes3.dex */
public final class C23123i5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CoordinatorLayout f86703a;

    /* renamed from: b */
    public final Button f86704b;

    /* renamed from: c */
    public final FrameLayout f86705c;

    /* renamed from: d */
    public final AppBarLayout f86706d;

    /* renamed from: e */
    public final RecyclerView f86707e;

    /* renamed from: f */
    public final EditText f86708f;

    public C23123i5(CoordinatorLayout coordinatorLayout, Button button, FrameLayout frameLayout, AppBarLayout appBarLayout, RecyclerView recyclerView, EditText editText) {
        this.f86703a = coordinatorLayout;
        this.f86704b = button;
        this.f86705c = frameLayout;
        this.f86706d = appBarLayout;
        this.f86707e = recyclerView;
        this.f86708f = editText;
    }

    /* renamed from: a */
    public static C23123i5 m34492a(View view) {
        int i = C35658Rh4.add;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C35658Rh4.addContainer;
            FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
            if (frameLayout != null) {
                i = C35658Rh4.appBarLayout;
                AppBarLayout appBarLayout = (AppBarLayout) C34328Lp6.m96312a(view, i);
                if (appBarLayout != null) {
                    i = C35658Rh4.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                    if (recyclerView != null) {
                        i = C35658Rh4.search;
                        EditText editText = (EditText) C34328Lp6.m96312a(view, i);
                        if (editText != null) {
                            return new C23123i5((CoordinatorLayout) view, button, frameLayout, appBarLayout, recyclerView, editText);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C23123i5 m34490c(LayoutInflater layoutInflater) {
        return m34489d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C23123i5 m34489d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32634Ej4.activity_repair_search, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m34492a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f86703a;
    }
}
