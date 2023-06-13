package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import co.bird.android.widget.standardcomponents.CheckableItemView;
/* renamed from: a4 */
/* loaded from: classes3.dex */
public final class C10556a4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f49764a;

    /* renamed from: b */
    public final CheckableItemView f49765b;

    /* renamed from: c */
    public final CheckableItemView f49766c;

    /* renamed from: d */
    public final CheckableItemView f49767d;

    /* renamed from: e */
    public final Button f49768e;

    public C10556a4(LinearLayout linearLayout, CheckableItemView checkableItemView, CheckableItemView checkableItemView2, CheckableItemView checkableItemView3, Button button) {
        this.f49764a = linearLayout;
        this.f49765b = checkableItemView;
        this.f49766c = checkableItemView2;
        this.f49767d = checkableItemView3;
        this.f49768e = button;
    }

    /* renamed from: a */
    public static C10556a4 m71942a(View view) {
        int i = C35658Rh4.dispute;
        CheckableItemView checkableItemView = (CheckableItemView) C34328Lp6.m96312a(view, i);
        if (checkableItemView != null) {
            i = C35658Rh4.open;
            CheckableItemView checkableItemView2 = (CheckableItemView) C34328Lp6.m96312a(view, i);
            if (checkableItemView2 != null) {
                i = C35658Rh4.resolve;
                CheckableItemView checkableItemView3 = (CheckableItemView) C34328Lp6.m96312a(view, i);
                if (checkableItemView3 != null) {
                    i = C35658Rh4.update;
                    Button button = (Button) C34328Lp6.m96312a(view, i);
                    if (button != null) {
                        return new C10556a4((LinearLayout) view, checkableItemView, checkableItemView2, checkableItemView3, button);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C10556a4 m71940c(LayoutInflater layoutInflater) {
        return m71939d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C10556a4 m71939d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32634Ej4.activity_issue_status, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m71942a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f49764a;
    }
}
