package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: RZ */
/* loaded from: classes3.dex */
public final class C7204RZ implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f32208a;

    /* renamed from: b */
    public final Button f32209b;

    /* renamed from: c */
    public final Button f32210c;

    /* renamed from: d */
    public final RecyclerView f32211d;

    public C7204RZ(LinearLayout linearLayout, Button button, Button button2, RecyclerView recyclerView) {
        this.f32208a = linearLayout;
        this.f32209b = button;
        this.f32210c = button2;
        this.f32211d = recyclerView;
    }

    /* renamed from: a */
    public static C7204RZ m86617a(View view) {
        int i = C35658Rh4.cancel;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C35658Rh4.confirm;
            Button button2 = (Button) C34328Lp6.m96312a(view, i);
            if (button2 != null) {
                i = C35658Rh4.recyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    return new C7204RZ((LinearLayout) view, button, button2, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C7204RZ m86615c(LayoutInflater layoutInflater) {
        return m86614d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C7204RZ m86614d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32634Ej4.bottom_sheet_non_repair, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m86617a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f32208a;
    }
}
