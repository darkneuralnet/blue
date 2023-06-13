package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.ClampToRatioImageView;
/* renamed from: Oa2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34891Oa2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f26788a;

    /* renamed from: b */
    public final TextView f26789b;

    /* renamed from: c */
    public final ClampToRatioImageView f26790c;

    /* renamed from: d */
    public final TextView f26791d;

    /* renamed from: e */
    public final TextView f26792e;

    public C34891Oa2(ConstraintLayout constraintLayout, TextView textView, ClampToRatioImageView clampToRatioImageView, TextView textView2, TextView textView3) {
        this.f26788a = constraintLayout;
        this.f26789b = textView;
        this.f26790c = clampToRatioImageView;
        this.f26791d = textView2;
        this.f26792e = textView3;
    }

    /* renamed from: a */
    public static C34891Oa2 m92010a(View view) {
        int i = C45841ni4.birdUnlockingText;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C45841ni4.image;
            ClampToRatioImageView clampToRatioImageView = (ClampToRatioImageView) C34328Lp6.m96312a(view, i);
            if (clampToRatioImageView != null) {
                i = C45841ni4.message;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C45841ni4.title;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        return new C34891Oa2((ConstraintLayout) view, textView, clampToRatioImageView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f26788a;
    }
}
