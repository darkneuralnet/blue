package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
/* renamed from: kj0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44068kj0 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f94817a;

    /* renamed from: b */
    public final AppBarLayout f94818b;

    /* renamed from: c */
    public final MaterialToolbar f94819c;

    /* renamed from: d */
    public final RecyclerView f94820d;

    /* renamed from: e */
    public final TextView f94821e;

    /* renamed from: f */
    public final Group f94822f;

    /* renamed from: g */
    public final TextView f94823g;

    /* renamed from: h */
    public final TextView f94824h;

    public C44068kj0(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, MaterialToolbar materialToolbar, RecyclerView recyclerView, TextView textView, Group group, TextView textView2, TextView textView3) {
        this.f94817a = constraintLayout;
        this.f94818b = appBarLayout;
        this.f94819c = materialToolbar;
        this.f94820d = recyclerView;
        this.f94821e = textView;
        this.f94822f = group;
        this.f94823g = textView2;
        this.f94824h = textView3;
    }

    /* renamed from: a */
    public static C44068kj0 m28574a(View view) {
        int i = C33093Gi4.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) C34328Lp6.m96312a(view, i);
        if (appBarLayout != null) {
            i = C33093Gi4.toolbar;
            MaterialToolbar materialToolbar = (MaterialToolbar) C34328Lp6.m96312a(view, i);
            if (materialToolbar != null) {
                i = C33093Gi4.transactionsRecyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    i = C33093Gi4.tutorialDescription;
                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView != null) {
                        i = C33093Gi4.tutorialGroup;
                        Group group = (Group) C34328Lp6.m96312a(view, i);
                        if (group != null) {
                            i = C33093Gi4.tutorialLink;
                            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView2 != null) {
                                i = C33093Gi4.tutorialTitle;
                                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView3 != null) {
                                    return new C44068kj0((ConstraintLayout) view, appBarLayout, materialToolbar, recyclerView, textView, group, textView2, textView3);
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
    public static C44068kj0 m28572c(LayoutInflater layoutInflater) {
        return m28571d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C44068kj0 m28571d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C48825sk4.chucker_activity_main, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m28574a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f94817a;
    }
}
