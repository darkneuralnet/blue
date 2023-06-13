package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
/* renamed from: N4 */
/* loaded from: classes3.dex */
public final class C5472N4 implements InterfaceC34094Kp6 {

    /* renamed from: A */
    public final Button f24071A;

    /* renamed from: B */
    public final MaterialToolbar f24072B;

    /* renamed from: a */
    public final ConstraintLayout f24073a;

    /* renamed from: b */
    public final RecyclerView f24074b;

    /* renamed from: c */
    public final AppBarLayout f24075c;

    /* renamed from: d */
    public final TextView f24076d;

    /* renamed from: e */
    public final MaterialCardView f24077e;

    /* renamed from: f */
    public final Barrier f24078f;

    /* renamed from: g */
    public final View f24079g;

    /* renamed from: h */
    public final ConstraintLayout f24080h;

    /* renamed from: i */
    public final ImageView f24081i;

    /* renamed from: j */
    public final TextView f24082j;

    /* renamed from: k */
    public final ViewPager2 f24083k;

    /* renamed from: l */
    public final Barrier f24084l;

    /* renamed from: m */
    public final View f24085m;

    /* renamed from: n */
    public final ConstraintLayout f24086n;

    /* renamed from: o */
    public final ImageView f24087o;

    /* renamed from: p */
    public final TextView f24088p;

    /* renamed from: q */
    public final RecyclerView f24089q;

    /* renamed from: r */
    public final View f24090r;

    /* renamed from: s */
    public final ConstraintLayout f24091s;

    /* renamed from: t */
    public final ImageView f24092t;

    /* renamed from: u */
    public final TextView f24093u;

    /* renamed from: v */
    public final TextView f24094v;

    /* renamed from: w */
    public final Button f24095w;

    /* renamed from: x */
    public final FrameLayout f24096x;

    /* renamed from: y */
    public final TextView f24097y;

    /* renamed from: z */
    public final TextView f24098z;

    public C5472N4(ConstraintLayout constraintLayout, RecyclerView recyclerView, AppBarLayout appBarLayout, TextView textView, MaterialCardView materialCardView, Barrier barrier, View view, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView2, ViewPager2 viewPager2, Barrier barrier2, View view2, ConstraintLayout constraintLayout3, ImageView imageView2, TextView textView3, RecyclerView recyclerView2, View view3, ConstraintLayout constraintLayout4, ImageView imageView3, TextView textView4, TextView textView5, Button button, FrameLayout frameLayout, TextView textView6, TextView textView7, Button button2, MaterialToolbar materialToolbar) {
        this.f24073a = constraintLayout;
        this.f24074b = recyclerView;
        this.f24075c = appBarLayout;
        this.f24076d = textView;
        this.f24077e = materialCardView;
        this.f24078f = barrier;
        this.f24079g = view;
        this.f24080h = constraintLayout2;
        this.f24081i = imageView;
        this.f24082j = textView2;
        this.f24083k = viewPager2;
        this.f24084l = barrier2;
        this.f24085m = view2;
        this.f24086n = constraintLayout3;
        this.f24087o = imageView2;
        this.f24088p = textView3;
        this.f24089q = recyclerView2;
        this.f24090r = view3;
        this.f24091s = constraintLayout4;
        this.f24092t = imageView3;
        this.f24093u = textView4;
        this.f24094v = textView5;
        this.f24095w = button;
        this.f24096x = frameLayout;
        this.f24097y = textView6;
        this.f24098z = textView7;
        this.f24071A = button2;
        this.f24072B = materialToolbar;
    }

    /* renamed from: a */
    public static C5472N4 m94402a(View view) {
        View m96312a;
        View m96312a2;
        View m96312a3;
        int i = C36360Uh4.actionRecyclerView;
        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
        if (recyclerView != null) {
            i = C36360Uh4.appbar;
            AppBarLayout appBarLayout = (AppBarLayout) C34328Lp6.m96312a(view, i);
            if (appBarLayout != null) {
                i = C36360Uh4.description_tv;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C36360Uh4.footerContainer;
                    MaterialCardView materialCardView = (MaterialCardView) C34328Lp6.m96312a(view, i);
                    if (materialCardView != null) {
                        i = C36360Uh4.hours_barrier;
                        Barrier barrier = (Barrier) C34328Lp6.m96312a(view, i);
                        if (barrier != null && (m96312a = C34328Lp6.m96312a(view, (i = C36360Uh4.hours_bottom_divider))) != null) {
                            i = C36360Uh4.hours_container;
                            ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
                            if (constraintLayout != null) {
                                i = C36360Uh4.hours_iv;
                                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                                if (imageView != null) {
                                    i = C36360Uh4.hours_tv;
                                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView2 != null) {
                                        i = C36360Uh4.imagePager;
                                        ViewPager2 viewPager2 = (ViewPager2) C34328Lp6.m96312a(view, i);
                                        if (viewPager2 != null) {
                                            i = C36360Uh4.location_barrier;
                                            Barrier barrier2 = (Barrier) C34328Lp6.m96312a(view, i);
                                            if (barrier2 != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C36360Uh4.location_bottom_divider))) != null) {
                                                i = C36360Uh4.location_container;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) C34328Lp6.m96312a(view, i);
                                                if (constraintLayout2 != null) {
                                                    i = C36360Uh4.location_iv;
                                                    ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                                                    if (imageView2 != null) {
                                                        i = C36360Uh4.location_tv;
                                                        TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                                        if (textView3 != null) {
                                                            i = C36360Uh4.offer_recycler;
                                                            RecyclerView recyclerView2 = (RecyclerView) C34328Lp6.m96312a(view, i);
                                                            if (recyclerView2 != null && (m96312a3 = C34328Lp6.m96312a(view, (i = C36360Uh4.phone_bottom_divider))) != null) {
                                                                i = C36360Uh4.phone_container;
                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) C34328Lp6.m96312a(view, i);
                                                                if (constraintLayout3 != null) {
                                                                    i = C36360Uh4.phone_iv;
                                                                    ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                                                                    if (imageView3 != null) {
                                                                        i = C36360Uh4.phone_tv;
                                                                        TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                                                        if (textView4 != null) {
                                                                            i = C36360Uh4.place_name_tv;
                                                                            TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                                                            if (textView5 != null) {
                                                                                i = C36360Uh4.primaryActionButton;
                                                                                Button button = (Button) C34328Lp6.m96312a(view, i);
                                                                                if (button != null) {
                                                                                    i = C36360Uh4.primaryActionButtonContainer;
                                                                                    FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
                                                                                    if (frameLayout != null) {
                                                                                        i = C36360Uh4.primaryActionSubtitle;
                                                                                        TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                        if (textView6 != null) {
                                                                                            i = C36360Uh4.primaryActionTitle;
                                                                                            TextView textView7 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                            if (textView7 != null) {
                                                                                                i = C36360Uh4.secondaryActionButton;
                                                                                                Button button2 = (Button) C34328Lp6.m96312a(view, i);
                                                                                                if (button2 != null) {
                                                                                                    i = C36360Uh4.toolbar;
                                                                                                    MaterialToolbar materialToolbar = (MaterialToolbar) C34328Lp6.m96312a(view, i);
                                                                                                    if (materialToolbar != null) {
                                                                                                        return new C5472N4((ConstraintLayout) view, recyclerView, appBarLayout, textView, materialCardView, barrier, m96312a, constraintLayout, imageView, textView2, viewPager2, barrier2, m96312a2, constraintLayout2, imageView2, textView3, recyclerView2, m96312a3, constraintLayout3, imageView3, textView4, textView5, button, frameLayout, textView6, textView7, button2, materialToolbar);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public static C5472N4 m94400c(LayoutInflater layoutInflater) {
        return m94399d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C5472N4 m94399d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C33336Hj4.activity_place_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94402a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f24073a;
    }
}
