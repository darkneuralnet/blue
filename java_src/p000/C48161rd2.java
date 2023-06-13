package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: rd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48161rd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f107333a;

    /* renamed from: b */
    public final Barrier f107334b;

    /* renamed from: c */
    public final TextView f107335c;

    /* renamed from: d */
    public final TextView f107336d;

    /* renamed from: e */
    public final RecyclerView f107337e;

    /* renamed from: f */
    public final ImageView f107338f;

    public C48161rd2(ConstraintLayout constraintLayout, Barrier barrier, TextView textView, TextView textView2, RecyclerView recyclerView, ImageView imageView) {
        this.f107333a = constraintLayout;
        this.f107334b = barrier;
        this.f107335c = textView;
        this.f107336d = textView2;
        this.f107337e = recyclerView;
        this.f107338f = imageView;
    }

    /* renamed from: a */
    public static C48161rd2 m15692a(View view) {
        int i = C34722Nh4.headerBarrier;
        Barrier barrier = (Barrier) C34328Lp6.m96312a(view, i);
        if (barrier != null) {
            i = C34722Nh4.nearbyBirdVehicleEmptyState;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C34722Nh4.nearbyBirdVehicleLabel;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C34722Nh4.nearbyBirdVehicleRecyclerView;
                    RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                    if (recyclerView != null) {
                        i = C34722Nh4.rescanIcon;
                        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView != null) {
                            return new C48161rd2((ConstraintLayout) view, barrier, textView, textView2, recyclerView, imageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f107333a;
    }
}
