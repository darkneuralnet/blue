package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: f6 */
/* loaded from: classes3.dex */
public final class C20209f6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f79430a;

    /* renamed from: b */
    public final View f79431b;

    /* renamed from: c */
    public final RecyclerView f79432c;

    /* renamed from: d */
    public final TextView f79433d;

    /* renamed from: e */
    public final View f79434e;

    /* renamed from: f */
    public final Group f79435f;

    /* renamed from: g */
    public final TextView f79436g;

    /* renamed from: h */
    public final View f79437h;

    /* renamed from: i */
    public final ImageView f79438i;

    public C20209f6(ConstraintLayout constraintLayout, View view, RecyclerView recyclerView, TextView textView, View view2, Group group, TextView textView2, View view3, ImageView imageView) {
        this.f79430a = constraintLayout;
        this.f79431b = view;
        this.f79432c = recyclerView;
        this.f79433d = textView;
        this.f79434e = view2;
        this.f79435f = group;
        this.f79436g = textView2;
        this.f79437h = view3;
        this.f79438i = imageView;
    }

    /* renamed from: a */
    public static C20209f6 m42096a(View view) {
        View m96312a;
        View m96312a2;
        int i = C39912di4.divider;
        View m96312a3 = C34328Lp6.m96312a(view, i);
        if (m96312a3 != null) {
            i = C39912di4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                i = C39912di4.scanCount;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null && (m96312a = C34328Lp6.m96312a(view, (i = C39912di4.scansDivider))) != null) {
                    i = C39912di4.troubleshootingGroup;
                    Group group = (Group) C34328Lp6.m96312a(view, i);
                    if (group != null) {
                        i = C39912di4.troubleshootingTips;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C39912di4.troubleshootingTipsContainer))) != null) {
                            i = C39912di4.unidentifiedIcon;
                            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView != null) {
                                return new C20209f6((ConstraintLayout) view, m96312a3, recyclerView, textView, m96312a, group, textView2, m96312a2, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C20209f6 m42094c(LayoutInflater layoutInflater) {
        return m42093d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C20209f6 m42093d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35442Qj4.activity_sku_scanned_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m42096a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f79430a;
    }
}
