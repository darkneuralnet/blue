package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.widget.standardcomponents.OptionalImeEditText;
/* renamed from: g6 */
/* loaded from: classes3.dex */
public final class C20742g6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f81581a;

    /* renamed from: b */
    public final ImageView f81582b;

    /* renamed from: c */
    public final Button f81583c;

    /* renamed from: d */
    public final TextView f81584d;

    /* renamed from: e */
    public final TextView f81585e;

    /* renamed from: f */
    public final TextView f81586f;

    /* renamed from: g */
    public final Group f81587g;

    /* renamed from: h */
    public final View f81588h;

    /* renamed from: i */
    public final View f81589i;

    /* renamed from: j */
    public final View f81590j;

    /* renamed from: k */
    public final TextView f81591k;

    /* renamed from: l */
    public final Group f81592l;

    /* renamed from: m */
    public final TextView f81593m;

    /* renamed from: n */
    public final OptionalImeEditText f81594n;

    /* renamed from: o */
    public final RecyclerView f81595o;

    /* renamed from: p */
    public final ImageView f81596p;

    /* renamed from: q */
    public final TextView f81597q;

    /* renamed from: r */
    public final TextView f81598r;

    /* renamed from: s */
    public final TextView f81599s;

    /* renamed from: t */
    public final TextView f81600t;

    public C20742g6(ConstraintLayout constraintLayout, ImageView imageView, Button button, TextView textView, TextView textView2, TextView textView3, Group group, View view, View view2, View view3, TextView textView4, Group group2, TextView textView5, OptionalImeEditText optionalImeEditText, RecyclerView recyclerView, ImageView imageView2, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.f81581a = constraintLayout;
        this.f81582b = imageView;
        this.f81583c = button;
        this.f81584d = textView;
        this.f81585e = textView2;
        this.f81586f = textView3;
        this.f81587g = group;
        this.f81588h = view;
        this.f81589i = view2;
        this.f81590j = view3;
        this.f81591k = textView4;
        this.f81592l = group2;
        this.f81593m = textView5;
        this.f81594n = optionalImeEditText;
        this.f81595o = recyclerView;
        this.f81596p = imageView2;
        this.f81597q = textView6;
        this.f81598r = textView7;
        this.f81599s = textView8;
        this.f81600t = textView9;
    }

    /* renamed from: a */
    public static C20742g6 m40076a(View view) {
        View m96312a;
        View m96312a2;
        View m96312a3;
        int i = C39912di4.codeButton;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C39912di4.doneButton;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C39912di4.emptyStateText;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C39912di4.expectedScans;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        i = C39912di4.failedScansCount;
                        TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView3 != null) {
                            i = C39912di4.failedScansGroup;
                            Group group = (Group) C34328Lp6.m96312a(view, i);
                            if (group != null && (m96312a = C34328Lp6.m96312a(view, (i = C39912di4.footerDivider))) != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C39912di4.headerDivider))) != null && (m96312a3 = C34328Lp6.m96312a(view, (i = C39912di4.inboundDivider))) != null) {
                                i = C39912di4.inboundEmptyStateLabel;
                                TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView4 != null) {
                                    i = C39912di4.inboundScanGroup;
                                    Group group2 = (Group) C34328Lp6.m96312a(view, i);
                                    if (group2 != null) {
                                        i = C39912di4.itemsAddedLabel;
                                        TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                        if (textView5 != null) {
                                            i = C39912di4.peripheralEditText;
                                            OptionalImeEditText optionalImeEditText = (OptionalImeEditText) C34328Lp6.m96312a(view, i);
                                            if (optionalImeEditText != null) {
                                                i = C39912di4.recyclerView;
                                                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                                                if (recyclerView != null) {
                                                    i = C39912di4.scanButton;
                                                    ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                                                    if (imageView2 != null) {
                                                        i = C39912di4.scansFailedLabel;
                                                        TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                                                        if (textView6 != null) {
                                                            i = C39912di4.scansVerticalDivider;
                                                            TextView textView7 = (TextView) C34328Lp6.m96312a(view, i);
                                                            if (textView7 != null) {
                                                                i = C39912di4.slashLabel;
                                                                TextView textView8 = (TextView) C34328Lp6.m96312a(view, i);
                                                                if (textView8 != null) {
                                                                    i = C39912di4.uploadCount;
                                                                    TextView textView9 = (TextView) C34328Lp6.m96312a(view, i);
                                                                    if (textView9 != null) {
                                                                        return new C20742g6((ConstraintLayout) view, imageView, button, textView, textView2, textView3, group, m96312a, m96312a2, m96312a3, textView4, group2, textView5, optionalImeEditText, recyclerView, imageView2, textView6, textView7, textView8, textView9);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    /* renamed from: c */
    public static C20742g6 m40074c(LayoutInflater layoutInflater) {
        return m40073d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C20742g6 m40073d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35442Qj4.activity_sku_scanner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m40076a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f81581a;
    }
}
