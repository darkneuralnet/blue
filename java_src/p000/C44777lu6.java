package p000;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
/* renamed from: lu6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C44777lu6 {

    /* renamed from: a */
    public static final int[] f96885a = {16843848};

    /* renamed from: a */
    public static void m26692a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: b */
    public static void m26691b(View view, float f) {
        int integer = view.getResources().getInteger(C35667Ri4.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{16842910, C49961uf4.state_liftable, -C49961uf4.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    /* renamed from: c */
    public static void m26690c(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray m21866i = C46052o36.m21866i(context, attributeSet, f96885a, i, i2, new int[0]);
        try {
            if (m21866i.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, m21866i.getResourceId(0, 0)));
            }
        } finally {
            m21866i.recycle();
        }
    }
}
