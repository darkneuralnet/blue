package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import java.util.List;
import java.util.Map;
import p000.MC1;
/* renamed from: com.bumptech.glide.c */
/* loaded from: classes5.dex */
public class C17104c extends ContextWrapper {

    /* renamed from: k */
    public static final K96<?, ?> f69110k = new C52054yB1();

    /* renamed from: a */
    public final InterfaceC28820to f69111a;

    /* renamed from: b */
    public final MC1.InterfaceC5218b<Registry> f69112b;

    /* renamed from: c */
    public final C52854zY1 f69113c;

    /* renamed from: d */
    public final ComponentCallbacks2C17096a.InterfaceC17097a f69114d;

    /* renamed from: e */
    public final List<TI4<Object>> f69115e;

    /* renamed from: f */
    public final Map<Class<?>, K96<?, ?>> f69116f;

    /* renamed from: g */
    public final C32343Dd1 f69117g;

    /* renamed from: h */
    public final C17105d f69118h;

    /* renamed from: i */
    public final int f69119i;

    /* renamed from: j */
    public YI4 f69120j;

    public C17104c(Context context, InterfaceC28820to interfaceC28820to, MC1.InterfaceC5218b<Registry> interfaceC5218b, C52854zY1 c52854zY1, ComponentCallbacks2C17096a.InterfaceC17097a interfaceC17097a, Map<Class<?>, K96<?, ?>> map, List<TI4<Object>> list, C32343Dd1 c32343Dd1, C17105d c17105d, int i) {
        super(context.getApplicationContext());
        this.f69111a = interfaceC28820to;
        this.f69113c = c52854zY1;
        this.f69114d = interfaceC17097a;
        this.f69115e = list;
        this.f69116f = map;
        this.f69117g = c32343Dd1;
        this.f69118h = c17105d;
        this.f69119i = i;
        this.f69112b = MC1.m95597a(interfaceC5218b);
    }

    /* renamed from: a */
    public <X> AbstractC33662It6<ImageView, X> m53133a(ImageView imageView, Class<X> cls) {
        return this.f69113c.m1180a(imageView, cls);
    }

    /* renamed from: b */
    public InterfaceC28820to m53132b() {
        return this.f69111a;
    }

    /* renamed from: c */
    public List<TI4<Object>> m53131c() {
        return this.f69115e;
    }

    /* renamed from: d */
    public synchronized YI4 m53130d() {
        if (this.f69120j == null) {
            this.f69120j = this.f69114d.build().m97564d0();
        }
        return this.f69120j;
    }

    /* renamed from: e */
    public <T> K96<?, T> m53129e(Class<T> cls) {
        K96<?, T> k96 = (K96<?, T>) this.f69116f.get(cls);
        if (k96 == null) {
            for (Map.Entry<Class<?>, K96<?, ?>> entry : this.f69116f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    k96 = (K96<?, T>) entry.getValue();
                }
            }
        }
        return k96 == null ? (K96<?, T>) f69110k : k96;
    }

    /* renamed from: f */
    public C32343Dd1 m53128f() {
        return this.f69117g;
    }

    /* renamed from: g */
    public C17105d m53127g() {
        return this.f69118h;
    }

    /* renamed from: h */
    public int m53126h() {
        return this.f69119i;
    }

    /* renamed from: i */
    public Registry m53125i() {
        return this.f69112b.get();
    }
}
