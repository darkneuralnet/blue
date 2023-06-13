package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.widget.actions.BirdActionsView;
/* renamed from: F4 */
/* loaded from: classes3.dex */
public final class C2126F4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f8593a;

    /* renamed from: b */
    public final BirdActionsView f8594b;

    /* renamed from: c */
    public final View f8595c;

    /* renamed from: d */
    public final C38207ar6 f8596d;

    /* renamed from: e */
    public final ImageView f8597e;

    /* renamed from: f */
    public final TextView f8598f;

    /* renamed from: g */
    public final RecyclerView f8599g;

    /* renamed from: h */
    public final Toolbar f8600h;

    public C2126F4(ConstraintLayout constraintLayout, BirdActionsView birdActionsView, View view, C38207ar6 c38207ar6, ImageView imageView, TextView textView, RecyclerView recyclerView, Toolbar toolbar) {
        this.f8593a = constraintLayout;
        this.f8594b = birdActionsView;
        this.f8595c = view;
        this.f8596d = c38207ar6;
        this.f8597e = imageView;
        this.f8598f = textView;
        this.f8599g = recyclerView;
        this.f8600h = toolbar;
    }

    /* renamed from: a */
    public static C2126F4 m107872a(View view) {
        View m96312a;
        View m96312a2;
        int i = C34722Nh4.actionsView;
        BirdActionsView birdActionsView = (BirdActionsView) C34328Lp6.m96312a(view, i);
        if (birdActionsView != null && (m96312a = C34328Lp6.m96312a(view, (i = C34722Nh4.divider))) != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C34722Nh4.firmwareUpdate))) != null) {
            C38207ar6 m65377a = C38207ar6.m65377a(m96312a2);
            i = C34722Nh4.moreIcon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C34722Nh4.moreText;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C34722Nh4.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                    if (recyclerView != null) {
                        i = C34722Nh4.toolbar;
                        Toolbar toolbar = (Toolbar) C34328Lp6.m96312a(view, i);
                        if (toolbar != null) {
                            return new C2126F4((ConstraintLayout) view, birdActionsView, m96312a, m65377a, imageView, textView, recyclerView, toolbar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C2126F4 m107870c(LayoutInflater layoutInflater) {
        return m107869d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C2126F4 m107869d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31698Aj4.activity_owned_bird_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m107872a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f8593a;
    }
}
