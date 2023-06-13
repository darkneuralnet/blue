package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: t31  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49011t31 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f109773a;

    /* renamed from: b */
    public final FrameLayout f109774b;

    /* renamed from: c */
    public final Button f109775c;

    /* renamed from: d */
    public final RecyclerView f109776d;

    public C49011t31(LinearLayout linearLayout, FrameLayout frameLayout, Button button, RecyclerView recyclerView) {
        this.f109773a = linearLayout;
        this.f109774b = frameLayout;
        this.f109775c = button;
        this.f109776d = recyclerView;
    }

    /* renamed from: a */
    public static C49011t31 m13193a(View view) {
        int i = C44062ki4.buttonContainer;
        FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
        if (frameLayout != null) {
            i = C44062ki4.done;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C44062ki4.recyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    return new C49011t31((LinearLayout) view, frameLayout, button, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C49011t31 m13191c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37080Xj4.dialog_inspection_complete, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m13193a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f109773a;
    }
}
