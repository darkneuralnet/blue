package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
/* renamed from: vr6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50675vr6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f114796a;

    /* renamed from: b */
    public final TextView f114797b;

    /* renamed from: c */
    public final ImageView f114798c;

    /* renamed from: d */
    public final View f114799d;

    /* renamed from: e */
    public final View f114800e;

    /* renamed from: f */
    public final TextView f114801f;

    public C50675vr6(View view, TextView textView, ImageView imageView, View view2, View view3, TextView textView2) {
        this.f114796a = view;
        this.f114797b = textView;
        this.f114798c = imageView;
        this.f114799d = view2;
        this.f114800e = view3;
        this.f114801f = textView2;
    }

    /* renamed from: a */
    public static C50675vr6 m7916a(View view) {
        View m96312a;
        View m96312a2;
        int i = C51176wi4.description;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C51176wi4.image;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null && (m96312a = C34328Lp6.m96312a(view, (i = C51176wi4.mask))) != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C51176wi4.spacer))) != null) {
                i = C51176wi4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C50675vr6(view, textView, imageView, m96312a, m96312a2, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C50675vr6 m7915b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C43489jk4.view_inspection_card, viewGroup);
            return m7916a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f114796a;
    }
}
