package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: q31  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47233q31 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f104600a;

    /* renamed from: b */
    public final ImageView f104601b;

    /* renamed from: c */
    public final Space f104602c;

    public C47233q31(ConstraintLayout constraintLayout, ImageView imageView, Space space) {
        this.f104600a = constraintLayout;
        this.f104601b = imageView;
        this.f104602c = space;
    }

    /* renamed from: a */
    public static C47233q31 m18252a(View view) {
        int i = C45841ni4.close;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C45841ni4.topGuide;
            Space space = (Space) C34328Lp6.m96312a(view, i);
            if (space != null) {
                return new C47233q31((ConstraintLayout) view, imageView, space);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C47233q31 m18250c(LayoutInflater layoutInflater) {
        return m18249d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C47233q31 m18249d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38135ak4.dialog_feature_announcement, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m18252a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f104600a;
    }
}
