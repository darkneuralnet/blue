package p000;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: Tf2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C36106Tf2 implements InterfaceC35872Sf2 {

    /* renamed from: a */
    public static final InterfaceC35872Sf2 f35837a = new C36106Tf2();

    /* renamed from: e */
    public static float m83222e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float m62447y = C38790bq6.m62447y(childAt);
                if (m62447y > f) {
                    f = m62447y;
                }
            }
        }
        return f;
    }

    @Override // p000.InterfaceC35872Sf2
    /* renamed from: a */
    public void mo83226a(View view) {
    }

    @Override // p000.InterfaceC35872Sf2
    /* renamed from: b */
    public void mo83225b(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (z) {
            int i2 = C34731Ni4.item_touch_helper_previous_elevation;
            if (view.getTag(i2) == null) {
                Float valueOf = Float.valueOf(C38790bq6.m62447y(view));
                C38790bq6.m62545E0(view, m83222e(recyclerView, view) + 1.0f);
                view.setTag(i2, valueOf);
            }
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    @Override // p000.InterfaceC35872Sf2
    /* renamed from: c */
    public void mo83224c(View view) {
        int i = C34731Ni4.item_touch_helper_previous_elevation;
        Object tag = view.getTag(i);
        if (tag instanceof Float) {
            C38790bq6.m62545E0(view, ((Float) tag).floatValue());
        }
        view.setTag(i, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // p000.InterfaceC35872Sf2
    /* renamed from: d */
    public void mo83223d(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }
}
