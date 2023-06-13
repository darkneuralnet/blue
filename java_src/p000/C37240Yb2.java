package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
/* renamed from: Yb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37240Yb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f46051a;

    /* renamed from: b */
    public final ImageView f46052b;

    /* renamed from: c */
    public final CircularProgressIndicator f46053c;

    /* renamed from: d */
    public final TextView f46054d;

    public C37240Yb2(ConstraintLayout constraintLayout, ImageView imageView, CircularProgressIndicator circularProgressIndicator, TextView textView) {
        this.f46051a = constraintLayout;
        this.f46052b = imageView;
        this.f46053c = circularProgressIndicator;
        this.f46054d = textView;
    }

    /* renamed from: a */
    public static C37240Yb2 m74831a(View view) {
        int i = C45248mi4.icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C45248mi4.progress;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C34328Lp6.m96312a(view, i);
            if (circularProgressIndicator != null) {
                i = C45248mi4.title;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    return new C37240Yb2((ConstraintLayout) view, imageView, circularProgressIndicator, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f46051a;
    }
}
