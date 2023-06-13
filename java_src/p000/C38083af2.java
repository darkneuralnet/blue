package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
/* renamed from: af2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38083af2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f50907a;

    /* renamed from: b */
    public final TextView f50908b;

    /* renamed from: c */
    public final ShapeableImageView f50909c;

    /* renamed from: d */
    public final RecyclerView f50910d;

    /* renamed from: e */
    public final TextView f50911e;

    public C38083af2(ConstraintLayout constraintLayout, TextView textView, ShapeableImageView shapeableImageView, RecyclerView recyclerView, TextView textView2) {
        this.f50907a = constraintLayout;
        this.f50908b = textView;
        this.f50909c = shapeableImageView;
        this.f50910d = recyclerView;
        this.f50911e = textView2;
    }

    /* renamed from: a */
    public static C38083af2 m70907a(View view) {
        int i = C35658Rh4.description;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C35658Rh4.image;
            ShapeableImageView shapeableImageView = (ShapeableImageView) C34328Lp6.m96312a(view, i);
            if (shapeableImageView != null) {
                i = C35658Rh4.recyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    i = C35658Rh4.title;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        return new C38083af2((ConstraintLayout) view, textView, shapeableImageView, recyclerView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f50907a;
    }
}
