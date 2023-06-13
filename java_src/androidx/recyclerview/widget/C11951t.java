package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: androidx.recyclerview.widget.t */
/* loaded from: classes.dex */
public class C11951t {
    private C11951t() {
    }

    /* renamed from: a */
    public static int m66136a(RecyclerView.C11872z c11872z, AbstractC11944q abstractC11944q, View view, View view2, RecyclerView.AbstractC11855p abstractC11855p, boolean z) {
        if (abstractC11855p.m66594d0() != 0 && c11872z.m66490b() != 0 && view != null && view2 != null) {
            if (!z) {
                return Math.abs(abstractC11855p.m66564x0(view) - abstractC11855p.m66564x0(view2)) + 1;
            }
            return Math.min(abstractC11944q.mo66151n(), abstractC11944q.mo66161d(view2) - abstractC11944q.mo66158g(view));
        }
        return 0;
    }

    /* renamed from: b */
    public static int m66135b(RecyclerView.C11872z c11872z, AbstractC11944q abstractC11944q, View view, View view2, RecyclerView.AbstractC11855p abstractC11855p, boolean z, boolean z2) {
        int max;
        if (abstractC11855p.m66594d0() == 0 || c11872z.m66490b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(abstractC11855p.m66564x0(view), abstractC11855p.m66564x0(view2));
        int max2 = Math.max(abstractC11855p.m66564x0(view), abstractC11855p.m66564x0(view2));
        if (z2) {
            max = Math.max(0, (c11872z.m66490b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((max * (Math.abs(abstractC11944q.mo66161d(view2) - abstractC11944q.mo66158g(view)) / (Math.abs(abstractC11855p.m66564x0(view) - abstractC11855p.m66564x0(view2)) + 1))) + (abstractC11944q.mo66152m() - abstractC11944q.mo66158g(view)));
    }

    /* renamed from: c */
    public static int m66134c(RecyclerView.C11872z c11872z, AbstractC11944q abstractC11944q, View view, View view2, RecyclerView.AbstractC11855p abstractC11855p, boolean z) {
        if (abstractC11855p.m66594d0() != 0 && c11872z.m66490b() != 0 && view != null && view2 != null) {
            if (!z) {
                return c11872z.m66490b();
            }
            return (int) (((abstractC11944q.mo66161d(view2) - abstractC11944q.mo66158g(view)) / (Math.abs(abstractC11855p.m66564x0(view) - abstractC11855p.m66564x0(view2)) + 1)) * c11872z.m66490b());
        }
        return 0;
    }
}
