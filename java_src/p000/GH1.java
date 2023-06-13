package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: GH1 */
/* loaded from: classes3.dex */
public final class GH1 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f11480a;

    /* renamed from: b */
    public final ImageView f11481b;

    /* renamed from: c */
    public final TextView f11482c;

    public GH1(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.f11480a = constraintLayout;
        this.f11481b = imageView;
        this.f11482c = textView;
    }

    /* renamed from: a */
    public static GH1 m105533a(View view) {
        int i = C45831nh4.targetIcon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C45831nh4.title;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new GH1((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f11480a;
    }
}
