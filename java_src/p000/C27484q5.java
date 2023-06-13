package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: q5 */
/* loaded from: classes2.dex */
public final class C27484q5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final NestedScrollView f104633a;

    /* renamed from: b */
    public final TextView f104634b;

    /* renamed from: c */
    public final TextView f104635c;

    /* renamed from: d */
    public final RecyclerView f104636d;

    /* renamed from: e */
    public final RelativeLayout f104637e;

    /* renamed from: f */
    public final RelativeLayout f104638f;

    /* renamed from: g */
    public final Button f104639g;

    /* renamed from: h */
    public final TextView f104640h;

    public C27484q5(NestedScrollView nestedScrollView, TextView textView, TextView textView2, RecyclerView recyclerView, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, Button button, TextView textView3) {
        this.f104633a = nestedScrollView;
        this.f104634b = textView;
        this.f104635c = textView2;
        this.f104636d = recyclerView;
        this.f104637e = relativeLayout;
        this.f104638f = relativeLayout2;
        this.f104639g = button;
        this.f104640h = textView3;
    }

    /* renamed from: a */
    public static C27484q5 m18231a(View view) {
        int i = C36585Vg4.birdId;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.header;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C36585Vg4.recyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    i = C36585Vg4.recyclerViewContainer;
                    RelativeLayout relativeLayout = (RelativeLayout) C34328Lp6.m96312a(view, i);
                    if (relativeLayout != null) {
                        i = C36585Vg4.reportedDamagesActivityRoot;
                        RelativeLayout relativeLayout2 = (RelativeLayout) C34328Lp6.m96312a(view, i);
                        if (relativeLayout2 != null) {
                            i = C36585Vg4.startInspection;
                            Button button = (Button) C34328Lp6.m96312a(view, i);
                            if (button != null) {
                                i = C36585Vg4.subHeader;
                                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView3 != null) {
                                    return new C27484q5((NestedScrollView) view, textView, textView2, recyclerView, relativeLayout, relativeLayout2, button, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C27484q5 m18229c(LayoutInflater layoutInflater) {
        return m18228d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C27484q5 m18228d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_reported_damages, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m18231a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public NestedScrollView getRoot() {
        return this.f104633a;
    }
}
