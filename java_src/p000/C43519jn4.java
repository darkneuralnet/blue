package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import co.bird.android.widget.FilterSeekBar;
/* renamed from: jn4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43519jn4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f93339a;

    /* renamed from: b */
    public final FilterSeekBar f93340b;

    /* renamed from: c */
    public final AppCompatTextView f93341c;

    /* renamed from: d */
    public final AppCompatTextView f93342d;

    /* renamed from: e */
    public final AppCompatTextView f93343e;

    public C43519jn4(View view, FilterSeekBar filterSeekBar, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.f93339a = view;
        this.f93340b = filterSeekBar;
        this.f93341c = appCompatTextView;
        this.f93342d = appCompatTextView2;
        this.f93343e = appCompatTextView3;
    }

    /* renamed from: a */
    public static C43519jn4 m29924a(View view) {
        int i = C52955zi4.filterSeekBar;
        FilterSeekBar filterSeekBar = (FilterSeekBar) C34328Lp6.m96312a(view, i);
        if (filterSeekBar != null) {
            i = C52955zi4.maxLabel;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C34328Lp6.m96312a(view, i);
            if (appCompatTextView != null) {
                i = C52955zi4.minLabel;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C34328Lp6.m96312a(view, i);
                if (appCompatTextView2 != null) {
                    i = C52955zi4.title;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) C34328Lp6.m96312a(view, i);
                    if (appCompatTextView3 != null) {
                        return new C43519jn4(view, filterSeekBar, appCompatTextView, appCompatTextView2, appCompatTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C43519jn4 m29923b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45268mk4.range_filter_view, viewGroup);
            return m29924a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f93339a;
    }
}
