package p000;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: wr6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51268wr6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f116645a;

    /* renamed from: b */
    public final Barrier f116646b;

    /* renamed from: c */
    public final TextView f116647c;

    /* renamed from: d */
    public final View f116648d;

    /* renamed from: e */
    public final TextView f116649e;

    /* renamed from: f */
    public final ImageView f116650f;

    /* renamed from: g */
    public final Button f116651g;

    /* renamed from: h */
    public final ImageView f116652h;

    /* renamed from: i */
    public final Button f116653i;

    /* renamed from: j */
    public final RecyclerView f116654j;

    /* renamed from: k */
    public final Space f116655k;

    /* renamed from: l */
    public final TextView f116656l;

    public C51268wr6(View view, Barrier barrier, TextView textView, View view2, TextView textView2, ImageView imageView, Button button, ImageView imageView2, Button button2, RecyclerView recyclerView, Space space, TextView textView3) {
        this.f116645a = view;
        this.f116646b = barrier;
        this.f116647c = textView;
        this.f116648d = view2;
        this.f116649e = textView2;
        this.f116650f = imageView;
        this.f116651g = button;
        this.f116652h = imageView2;
        this.f116653i = button2;
        this.f116654j = recyclerView;
        this.f116655k = space;
        this.f116656l = textView3;
    }

    /* renamed from: a */
    public static C51268wr6 m6216a(View view) {
        View m96312a;
        int i = C52955zi4.buttonBarrier;
        Barrier barrier = (Barrier) C34328Lp6.m96312a(view, i);
        if (barrier != null) {
            i = C52955zi4.campaignBanner;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null && (m96312a = C34328Lp6.m96312a(view, (i = C52955zi4.campaignBorder))) != null) {
                i = C52955zi4.description;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C52955zi4.expand;
                    ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView != null) {
                        i = C52955zi4.fail;
                        Button button = (Button) C34328Lp6.m96312a(view, i);
                        if (button != null) {
                            i = C52955zi4.image;
                            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView2 != null) {
                                i = C52955zi4.pass;
                                Button button2 = (Button) C34328Lp6.m96312a(view, i);
                                if (button2 != null) {
                                    i = C52955zi4.recyclerView;
                                    RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                                    if (recyclerView != null) {
                                        i = C52955zi4.space;
                                        Space space = (Space) C34328Lp6.m96312a(view, i);
                                        if (space != null) {
                                            i = C52955zi4.title;
                                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                            if (textView3 != null) {
                                                return new C51268wr6(view, barrier, textView, m96312a, textView2, imageView, button, imageView2, button2, recyclerView, space, textView3);
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

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f116645a;
    }
}
