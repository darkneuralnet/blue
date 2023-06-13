package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: UZ */
/* loaded from: classes4.dex */
public final class C8311UZ implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f37536a;

    /* renamed from: b */
    public final LinearLayout f37537b;

    /* renamed from: c */
    public final TextView f37538c;

    /* renamed from: d */
    public final TextView f37539d;

    /* renamed from: e */
    public final TextView f37540e;

    /* renamed from: f */
    public final TextView f37541f;

    /* renamed from: g */
    public final TextView f37542g;

    /* renamed from: h */
    public final TextView f37543h;

    /* renamed from: i */
    public final View f37544i;

    /* renamed from: j */
    public final TextView f37545j;

    /* renamed from: k */
    public final TextView f37546k;

    public C8311UZ(View view, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, View view2, TextView textView7, TextView textView8) {
        this.f37536a = view;
        this.f37537b = linearLayout;
        this.f37538c = textView;
        this.f37539d = textView2;
        this.f37540e = textView3;
        this.f37541f = textView4;
        this.f37542g = textView5;
        this.f37543h = textView6;
        this.f37544i = view2;
        this.f37545j = textView7;
        this.f37546k = textView8;
    }

    /* renamed from: a */
    public static C8311UZ m81346a(View view) {
        View m96312a;
        int i = C52955zi4.actions;
        LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
        if (linearLayout != null) {
            i = C52955zi4.cancelTask;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C52955zi4.chirpAlarm;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C52955zi4.flightSheet;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        i = C52955zi4.indirectCancelTask;
                        TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView4 != null) {
                            i = C52955zi4.lockUnlock;
                            TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView5 != null) {
                                i = C52955zi4.removeFromList;
                                TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView6 != null && (m96312a = C34328Lp6.m96312a(view, (i = C52955zi4.scrim))) != null) {
                                    i = C52955zi4.unlockPhysicalLock;
                                    TextView textView7 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView7 != null) {
                                        i = C52955zi4.vehicleInfo;
                                        TextView textView8 = (TextView) C34328Lp6.m96312a(view, i);
                                        if (textView8 != null) {
                                            return new C8311UZ(view, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, m96312a, textView7, textView8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C8311UZ m81345b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45268mk4.bottom_sheet_operator_task_actions, viewGroup);
            return m81346a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f37536a;
    }
}
