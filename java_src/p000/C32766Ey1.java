package p000;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: Ey1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32766Ey1 extends RecyclerView.AbstractC11834D {
    public C32766Ey1(FrameLayout frameLayout) {
        super(frameLayout);
    }

    /* renamed from: a */
    public static C32766Ey1 m108170a(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(C38790bq6.m62473l());
        frameLayout.setSaveEnabled(false);
        return new C32766Ey1(frameLayout);
    }

    /* renamed from: b */
    public FrameLayout m108169b() {
        return (FrameLayout) this.itemView;
    }
}
