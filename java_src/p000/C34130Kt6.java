package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* renamed from: Kt6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34130Kt6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f20324a;

    /* renamed from: b */
    public final ImageView f20325b;

    /* renamed from: c */
    public final RelativeLayout f20326c;

    /* renamed from: d */
    public final TextView f20327d;

    /* renamed from: e */
    public final TextView f20328e;

    public C34130Kt6(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, TextView textView, TextView textView2) {
        this.f20324a = relativeLayout;
        this.f20325b = imageView;
        this.f20326c = relativeLayout2;
        this.f20327d = textView;
        this.f20328e = textView2;
    }

    /* renamed from: a */
    public static C34130Kt6 m98200a(View view) {
        int i = C52955zi4.brandIcon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i = C52955zi4.taskReminderBarBody;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C52955zi4.taskReminderBarTitle;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C34130Kt6(relativeLayout, imageView, relativeLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f20324a;
    }
}
