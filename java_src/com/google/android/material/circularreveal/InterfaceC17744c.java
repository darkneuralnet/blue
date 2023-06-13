package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.C17742b;
/* renamed from: com.google.android.material.circularreveal.c */
/* loaded from: classes6.dex */
public interface InterfaceC17744c extends C17742b.InterfaceC17743a {

    /* renamed from: com.google.android.material.circularreveal.c$b */
    /* loaded from: classes6.dex */
    public static class C17746b implements TypeEvaluator<C17749e> {

        /* renamed from: b */
        public static final TypeEvaluator<C17749e> f72625b = new C17746b();

        /* renamed from: a */
        public final C17749e f72626a = new C17749e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public C17749e evaluate(float f, C17749e c17749e, C17749e c17749e2) {
            this.f72626a.m49781b(C39102cN2.m61513d(c17749e.f72629a, c17749e2.f72629a, f), C39102cN2.m61513d(c17749e.f72630b, c17749e2.f72630b, f), C39102cN2.m61513d(c17749e.f72631c, c17749e2.f72631c, f));
            return this.f72626a;
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$c */
    /* loaded from: classes6.dex */
    public static class C17747c extends Property<InterfaceC17744c, C17749e> {

        /* renamed from: a */
        public static final Property<InterfaceC17744c, C17749e> f72627a = new C17747c("circularReveal");

        public C17747c(String str) {
            super(C17749e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public C17749e get(InterfaceC17744c interfaceC17744c) {
            return interfaceC17744c.mo49776d();
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(InterfaceC17744c interfaceC17744c, C17749e c17749e) {
            interfaceC17744c.setRevealInfo(c17749e);
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$d */
    /* loaded from: classes6.dex */
    public static class C17748d extends Property<InterfaceC17744c, Integer> {

        /* renamed from: a */
        public static final Property<InterfaceC17744c, Integer> f72628a = new C17748d("circularRevealScrimColor");

        public C17748d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Integer get(InterfaceC17744c interfaceC17744c) {
            return Integer.valueOf(interfaceC17744c.mo49774f());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(InterfaceC17744c interfaceC17744c, Integer num) {
            interfaceC17744c.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$e */
    /* loaded from: classes6.dex */
    public static class C17749e {

        /* renamed from: a */
        public float f72629a;

        /* renamed from: b */
        public float f72630b;

        /* renamed from: c */
        public float f72631c;

        /* renamed from: a */
        public boolean m49782a() {
            return this.f72631c == Float.MAX_VALUE;
        }

        /* renamed from: b */
        public void m49781b(float f, float f2, float f3) {
            this.f72629a = f;
            this.f72630b = f2;
            this.f72631c = f3;
        }

        /* renamed from: c */
        public void m49780c(C17749e c17749e) {
            m49781b(c17749e.f72629a, c17749e.f72630b, c17749e.f72631c);
        }

        private C17749e() {
        }

        public C17749e(float f, float f2, float f3) {
            this.f72629a = f;
            this.f72630b = f2;
            this.f72631c = f3;
        }

        public C17749e(C17749e c17749e) {
            this(c17749e.f72629a, c17749e.f72630b, c17749e.f72631c);
        }
    }

    /* renamed from: a */
    void mo49779a();

    /* renamed from: d */
    C17749e mo49776d();

    /* renamed from: e */
    void mo49775e();

    /* renamed from: f */
    int mo49774f();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C17749e c17749e);
}
