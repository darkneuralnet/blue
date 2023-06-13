package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: nd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45789nd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f100215a;

    /* renamed from: b */
    public final ImageView f100216b;

    /* renamed from: c */
    public final TextView f100217c;

    /* renamed from: d */
    public final TextView f100218d;

    public C45789nd2(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.f100215a = constraintLayout;
        this.f100216b = imageView;
        this.f100217c = textView;
        this.f100218d = textView2;
    }

    /* renamed from: a */
    public static C45789nd2 m23410a(View view) {
        int i = C49981uh4.endIconView;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C49981uh4.messageView;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C49981uh4.titleView;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C45789nd2((ConstraintLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f100215a;
    }
}
