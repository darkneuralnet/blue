package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.flexbox.a */
/* loaded from: classes5.dex */
public class C17466a {

    /* renamed from: e */
    public int f70263e;

    /* renamed from: f */
    public int f70264f;

    /* renamed from: g */
    public int f70265g;

    /* renamed from: h */
    public int f70266h;

    /* renamed from: i */
    public int f70267i;

    /* renamed from: j */
    public float f70268j;

    /* renamed from: k */
    public float f70269k;

    /* renamed from: l */
    public int f70270l;

    /* renamed from: m */
    public int f70271m;

    /* renamed from: o */
    public int f70273o;

    /* renamed from: p */
    public int f70274p;

    /* renamed from: q */
    public boolean f70275q;

    /* renamed from: r */
    public boolean f70276r;

    /* renamed from: a */
    public int f70259a = Integer.MAX_VALUE;

    /* renamed from: b */
    public int f70260b = Integer.MAX_VALUE;

    /* renamed from: c */
    public int f70261c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f70262d = Integer.MIN_VALUE;

    /* renamed from: n */
    public List<Integer> f70272n = new ArrayList();

    /* renamed from: a */
    public int m51702a() {
        return this.f70265g;
    }

    /* renamed from: b */
    public int m51701b() {
        return this.f70266h;
    }

    /* renamed from: c */
    public int m51700c() {
        return this.f70266h - this.f70267i;
    }

    /* renamed from: d */
    public void m51699d(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f70259a = Math.min(this.f70259a, (view.getLeft() - flexItem.mo51773W2()) - i);
        this.f70260b = Math.min(this.f70260b, (view.getTop() - flexItem.mo51771f0()) - i2);
        this.f70261c = Math.max(this.f70261c, view.getRight() + flexItem.mo51767n3() + i3);
        this.f70262d = Math.max(this.f70262d, view.getBottom() + flexItem.mo51774V0() + i4);
    }
}
