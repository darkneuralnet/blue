package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Zb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37474Zb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f48799a;

    /* renamed from: b */
    public final ImageView f48800b;

    /* renamed from: c */
    public final Space f48801c;

    /* renamed from: d */
    public final TextView f48802d;

    /* renamed from: e */
    public final ImageView f48803e;

    /* renamed from: f */
    public final TextView f48804f;

    public C37474Zb2(ConstraintLayout constraintLayout, ImageView imageView, Space space, TextView textView, ImageView imageView2, TextView textView2) {
        this.f48799a = constraintLayout;
        this.f48800b = imageView;
        this.f48801c = space;
        this.f48802d = textView;
        this.f48803e = imageView2;
        this.f48804f = textView2;
    }

    /* renamed from: a */
    public static C37474Zb2 m72906a(View view) {
        int i = C45248mi4.arrow;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C45248mi4.statusBackgroundBottomSpace;
            Space space = (Space) C34328Lp6.m96312a(view, i);
            if (space != null) {
                i = C45248mi4.statusDescription;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C45248mi4.statusIcon;
                    ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView2 != null) {
                        i = C45248mi4.statusTitle;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            return new C37474Zb2((ConstraintLayout) view, imageView, space, textView, imageView2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f48799a;
    }
}
