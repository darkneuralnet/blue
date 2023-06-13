package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: xr6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51861xr6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f118251a;

    /* renamed from: b */
    public final TextView f118252b;

    /* renamed from: c */
    public final ConstraintLayout f118253c;

    /* renamed from: d */
    public final TextView f118254d;

    /* renamed from: e */
    public final Button f118255e;

    /* renamed from: f */
    public final ImageView f118256f;

    /* renamed from: g */
    public final Button f118257g;

    /* renamed from: h */
    public final RecyclerView f118258h;

    /* renamed from: i */
    public final TextView f118259i;

    public C51861xr6(View view, TextView textView, ConstraintLayout constraintLayout, TextView textView2, Button button, ImageView imageView, Button button2, RecyclerView recyclerView, TextView textView3) {
        this.f118251a = view;
        this.f118252b = textView;
        this.f118253c = constraintLayout;
        this.f118254d = textView2;
        this.f118255e = button;
        this.f118256f = imageView;
        this.f118257g = button2;
        this.f118258h = recyclerView;
        this.f118259i = textView3;
    }

    /* renamed from: a */
    public static C51861xr6 m4554a(View view) {
        int i = C52955zi4.campaignBanner;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C52955zi4.container;
            ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
            if (constraintLayout != null) {
                i = C52955zi4.description;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C52955zi4.fail;
                    Button button = (Button) C34328Lp6.m96312a(view, i);
                    if (button != null) {
                        i = C52955zi4.image;
                        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView != null) {
                            i = C52955zi4.pass;
                            Button button2 = (Button) C34328Lp6.m96312a(view, i);
                            if (button2 != null) {
                                i = C52955zi4.recyclerView;
                                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                                if (recyclerView != null) {
                                    i = C52955zi4.title;
                                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView3 != null) {
                                        return new C51861xr6(view, textView, constraintLayout, textView2, button, imageView, button2, recyclerView, textView3);
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
    public static C51861xr6 m4553b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45268mk4.view_inspection_list_card, viewGroup);
            return m4554a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f118251a;
    }
}
