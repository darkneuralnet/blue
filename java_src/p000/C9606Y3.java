package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: Y3 */
/* loaded from: classes3.dex */
public final class C9606Y3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f44477a;

    /* renamed from: b */
    public final FrameLayout f44478b;

    /* renamed from: c */
    public final TextView f44479c;

    /* renamed from: d */
    public final Button f44480d;

    /* renamed from: e */
    public final RecyclerView f44481e;

    public C9606Y3(ConstraintLayout constraintLayout, FrameLayout frameLayout, TextView textView, Button button, RecyclerView recyclerView) {
        this.f44477a = constraintLayout;
        this.f44478b = frameLayout;
        this.f44479c = textView;
        this.f44480d = button;
        this.f44481e = recyclerView;
    }

    /* renamed from: a */
    public static C9606Y3 m75799a(View view) {
        int i = C34488Mh4.footerContainer;
        FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
        if (frameLayout != null) {
            i = C34488Mh4.noFilteredResults;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C34488Mh4.orderButton;
                Button button = (Button) C34328Lp6.m96312a(view, i);
                if (button != null) {
                    i = C34488Mh4.partRecyclerView;
                    RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                    if (recyclerView != null) {
                        return new C9606Y3((ConstraintLayout) view, frameLayout, textView, button, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9606Y3 m75797c(LayoutInflater layoutInflater) {
        return m75796d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C9606Y3 m75796d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C52965zj4.activity_inventory_part_selection, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m75799a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f44477a;
    }
}
