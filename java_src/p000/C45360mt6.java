package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
/* renamed from: mt6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45360mt6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f98991a;

    /* renamed from: b */
    public final ImageView f98992b;

    /* renamed from: c */
    public final ImageView f98993c;

    /* renamed from: d */
    public final TextView f98994d;

    /* renamed from: e */
    public final TextView f98995e;

    public C45360mt6(View view, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.f98991a = view;
        this.f98992b = imageView;
        this.f98993c = imageView2;
        this.f98994d = textView;
        this.f98995e = textView2;
    }

    /* renamed from: a */
    public static C45360mt6 m24754a(View view) {
        int i = C45831nh4.calendar;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C45831nh4.downArrow;
            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView2 != null) {
                i = C45831nh4.granularity;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C45831nh4.period;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        return new C45360mt6(view, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C45360mt6 m24753b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C38125aj4.view_report_period, viewGroup);
            return m24754a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f98991a;
    }
}
