package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: Hp6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33392Hp6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f13918a;

    /* renamed from: b */
    public final ImageView f13919b;

    /* renamed from: c */
    public final FrameLayout f13920c;

    /* renamed from: d */
    public final RecyclerView f13921d;

    public C33392Hp6(View view, ImageView imageView, FrameLayout frameLayout, RecyclerView recyclerView) {
        this.f13918a = view;
        this.f13919b = imageView;
        this.f13920c = frameLayout;
        this.f13921d = recyclerView;
    }

    /* renamed from: a */
    public static C33392Hp6 m103406a(View view) {
        int i = C52955zi4.arrow;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C52955zi4.arrowContainer;
            FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
            if (frameLayout != null) {
                i = C52955zi4.recyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    return new C33392Hp6(view, imageView, frameLayout, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f13918a;
    }
}
