package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C11515b;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class RadialViewGroup extends ConstraintLayout {

    /* renamed from: b */
    public final Runnable f73644b;

    /* renamed from: c */
    public int f73645c;

    /* renamed from: d */
    public PM2 f73646d;

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: j */
    public static boolean m48514j(View view) {
        return "skip".equals(view.getTag());
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(C38790bq6.m62473l());
        }
        m48512l();
    }

    /* renamed from: e */
    public final void m48519e(List<View> list, C11515b c11515b, int i) {
        float f = 0.0f;
        for (View view : list) {
            c11515b.m67808t(view.getId(), C33795Ji4.circle_center, i, f);
            f += 360.0f / list.size();
        }
    }

    /* renamed from: f */
    public final Drawable m48518f() {
        PM2 pm2 = new PM2();
        this.f73646d = pm2;
        pm2.m90418Y(new C37404Yt4(0.5f));
        this.f73646d.m90416a0(ColorStateList.valueOf(-1));
        return this.f73646d;
    }

    /* renamed from: g */
    public int m48517g(int i) {
        return i == 2 ? Math.round(this.f73645c * 0.66f) : this.f73645c;
    }

    /* renamed from: h */
    public int m48516h() {
        return this.f73645c;
    }

    /* renamed from: i */
    public void mo48515i(int i) {
        this.f73645c = i;
        mo48513k();
    }

    /* renamed from: k */
    public void mo48513k() {
        C11515b c11515b = new C11515b();
        c11515b.m67812p(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != C33795Ji4.circle_center && !m48514j(childAt)) {
                int i2 = (Integer) childAt.getTag(C33795Ji4.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!hashMap.containsKey(i2)) {
                    hashMap.put(i2, new ArrayList());
                }
                ((List) hashMap.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            m48519e((List) entry.getValue(), c11515b, m48517g(((Integer) entry.getKey()).intValue()));
        }
        c11515b.m67819i(this);
    }

    /* renamed from: l */
    public final void m48512l() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f73644b);
            handler.post(this.f73644b);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        mo48513k();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        m48512l();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f73646d.m90416a0(ColorStateList.valueOf(i));
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C50603vk4.material_radial_view_group, this);
        C38790bq6.m62553A0(this, m48518f());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C37098Xl4.RadialViewGroup, i, 0);
        this.f73645c = obtainStyledAttributes.getDimensionPixelSize(C37098Xl4.RadialViewGroup_materialCircleRadius, 0);
        this.f73644b = new Runnable() { // from class: com.google.android.material.timepicker.b
            @Override // java.lang.Runnable
            public final void run() {
                RadialViewGroup.this.mo48513k();
            }
        };
        obtainStyledAttributes.recycle();
    }
}
