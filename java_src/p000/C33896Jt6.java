package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
/* renamed from: Jt6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33896Jt6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f18406a;

    /* renamed from: b */
    public final ImageView f18407b;

    /* renamed from: c */
    public final TextView f18408c;

    /* renamed from: d */
    public final ImageView f18409d;

    public C33896Jt6(View view, ImageView imageView, TextView textView, ImageView imageView2) {
        this.f18406a = view;
        this.f18407b = imageView;
        this.f18408c = textView;
        this.f18409d = imageView2;
    }

    /* renamed from: a */
    public static C33896Jt6 m99596a(View view) {
        int i = C45831nh4.checkIcon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C45831nh4.title;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C45831nh4.xIcon;
                ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView2 != null) {
                    return new C33896Jt6(view, imageView, textView, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C33896Jt6 m99595b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C38125aj4.view_target, viewGroup);
            return m99596a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f18406a;
    }
}
