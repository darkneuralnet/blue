package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Ie2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33523Ie2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f15968a;

    /* renamed from: b */
    public final TextView f15969b;

    /* renamed from: c */
    public final TextView f15970c;

    /* renamed from: d */
    public final ImageView f15971d;

    /* renamed from: e */
    public final Barrier f15972e;

    /* renamed from: f */
    public final ImageView f15973f;

    public C33523Ie2(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, Barrier barrier, ImageView imageView2) {
        this.f15968a = constraintLayout;
        this.f15969b = textView;
        this.f15970c = textView2;
        this.f15971d = imageView;
        this.f15972e = barrier;
        this.f15973f = imageView2;
    }

    /* renamed from: a */
    public static C33523Ie2 m101852a(View view) {
        int i = C34722Nh4.batteryLevel;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C34722Nh4.birdName;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C34722Nh4.chevron;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C34722Nh4.endBarrier;
                    Barrier barrier = (Barrier) C34328Lp6.m96312a(view, i);
                    if (barrier != null) {
                        i = C34722Nh4.info;
                        ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView2 != null) {
                            return new C33523Ie2((ConstraintLayout) view, textView, textView2, imageView, barrier, imageView2);
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
        return this.f15968a;
    }
}
