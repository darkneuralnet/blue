package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
/* renamed from: v3 */
/* loaded from: classes3.dex */
public final class C29403v3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f113432a;

    /* renamed from: b */
    public final RecyclerView f113433b;

    /* renamed from: c */
    public final AppBarLayout f113434c;

    /* renamed from: d */
    public final FrameLayout f113435d;

    /* renamed from: e */
    public final EditText f113436e;

    /* renamed from: f */
    public final ImageView f113437f;

    /* renamed from: g */
    public final MaterialCardView f113438g;

    /* renamed from: h */
    public final Toolbar f113439h;

    public C29403v3(ConstraintLayout constraintLayout, RecyclerView recyclerView, AppBarLayout appBarLayout, FrameLayout frameLayout, EditText editText, ImageView imageView, MaterialCardView materialCardView, Toolbar toolbar) {
        this.f113432a = constraintLayout;
        this.f113433b = recyclerView;
        this.f113434c = appBarLayout;
        this.f113435d = frameLayout;
        this.f113436e = editText;
        this.f113437f = imageView;
        this.f113438g = materialCardView;
        this.f113439h = toolbar;
    }

    /* renamed from: a */
    public static C29403v3 m9274a(View view) {
        int i = C44645lh4.address_recycler;
        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
        if (recyclerView != null) {
            i = C44645lh4.appBarLayout;
            AppBarLayout appBarLayout = (AppBarLayout) C34328Lp6.m96312a(view, i);
            if (appBarLayout != null) {
                i = C44645lh4.clear_input_icon_container;
                FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
                if (frameLayout != null) {
                    i = C44645lh4.search_et;
                    EditText editText = (EditText) C34328Lp6.m96312a(view, i);
                    if (editText != null) {
                        i = C44645lh4.search_icon;
                        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView != null) {
                            i = C44645lh4.search_input_container;
                            MaterialCardView materialCardView = (MaterialCardView) C34328Lp6.m96312a(view, i);
                            if (materialCardView != null) {
                                i = C44645lh4.toolbar;
                                Toolbar toolbar = (Toolbar) C34328Lp6.m96312a(view, i);
                                if (toolbar != null) {
                                    return new C29403v3((ConstraintLayout) view, recyclerView, appBarLayout, frameLayout, editText, imageView, materialCardView, toolbar);
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
    public static C29403v3 m9272c(LayoutInflater layoutInflater) {
        return m9271d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C29403v3 m9271d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37305Yi4.activity_destination_search, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m9274a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f113432a;
    }
}
