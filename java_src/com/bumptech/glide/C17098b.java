package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.C17105d;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.bumptech.glide.manager.C17140b;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p000.InterfaceC52578z41;
import p000.UP2;
/* renamed from: com.bumptech.glide.b */
/* loaded from: classes5.dex */
public final class C17098b {

    /* renamed from: c */
    public C32343Dd1 f69094c;

    /* renamed from: d */
    public InterfaceC20044eU f69095d;

    /* renamed from: e */
    public InterfaceC28820to f69096e;

    /* renamed from: f */
    public OP2 f69097f;

    /* renamed from: g */
    public KC1 f69098g;

    /* renamed from: h */
    public KC1 f69099h;

    /* renamed from: i */
    public InterfaceC52578z41.InterfaceC30901a f69100i;

    /* renamed from: j */
    public UP2 f69101j;

    /* renamed from: k */
    public InterfaceC32765Ey0 f69102k;

    /* renamed from: n */
    public C17140b.InterfaceC17142b f69105n;

    /* renamed from: o */
    public KC1 f69106o;

    /* renamed from: p */
    public boolean f69107p;

    /* renamed from: q */
    public List<TI4<Object>> f69108q;

    /* renamed from: a */
    public final Map<Class<?>, K96<?, ?>> f69092a = new C28385so();

    /* renamed from: b */
    public final C17105d.C17106a f69093b = new C17105d.C17106a();

    /* renamed from: l */
    public int f69103l = 4;

    /* renamed from: m */
    public ComponentCallbacks2C17096a.InterfaceC17097a f69104m = new C17099a();

    /* renamed from: com.bumptech.glide.b$a */
    /* loaded from: classes5.dex */
    public class C17099a implements ComponentCallbacks2C17096a.InterfaceC17097a {
        public C17099a() {
        }

        @Override // com.bumptech.glide.ComponentCallbacks2C17096a.InterfaceC17097a
        public YI4 build() {
            return new YI4();
        }
    }

    /* renamed from: com.bumptech.glide.b$b */
    /* loaded from: classes5.dex */
    public static final class C17100b {
    }

    /* renamed from: com.bumptech.glide.b$c */
    /* loaded from: classes5.dex */
    public static final class C17101c {
    }

    /* renamed from: com.bumptech.glide.b$d */
    /* loaded from: classes5.dex */
    public static final class C17102d {
    }

    /* renamed from: com.bumptech.glide.b$e */
    /* loaded from: classes5.dex */
    public static final class C17103e {
        private C17103e() {
        }
    }

    /* renamed from: a */
    public ComponentCallbacks2C17096a m53135a(Context context, List<LC1> list, AbstractC12485bj abstractC12485bj) {
        if (this.f69098g == null) {
            this.f69098g = KC1.m99094g();
        }
        if (this.f69099h == null) {
            this.f69099h = KC1.m99096e();
        }
        if (this.f69106o == null) {
            this.f69106o = KC1.m99098c();
        }
        if (this.f69101j == null) {
            this.f69101j = new UP2.C8276a(context).m81556a();
        }
        if (this.f69102k == null) {
            this.f69102k = new MW0();
        }
        if (this.f69095d == null) {
            int m81561b = this.f69101j.m81561b();
            if (m81561b > 0) {
                this.f69095d = new C47933rE2(m81561b);
            } else {
                this.f69095d = new C20426fU();
            }
        }
        if (this.f69096e == null) {
            this.f69096e = new C47340qE2(this.f69101j.m81562a());
        }
        if (this.f69097f == null) {
            this.f69097f = new C52082yE2(this.f69101j.m81559d());
        }
        if (this.f69100i == null) {
            this.f69100i = new C46078o62(context);
        }
        if (this.f69094c == null) {
            this.f69094c = new C32343Dd1(this.f69097f, this.f69100i, this.f69099h, this.f69098g, KC1.m99093h(), this.f69106o, this.f69107p);
        }
        List<TI4<Object>> list2 = this.f69108q;
        if (list2 == null) {
            this.f69108q = Collections.emptyList();
        } else {
            this.f69108q = Collections.unmodifiableList(list2);
        }
        C17105d m53122b = this.f69093b.m53122b();
        return new ComponentCallbacks2C17096a(context, this.f69094c, this.f69097f, this.f69095d, this.f69096e, new C17140b(this.f69105n, m53122b), this.f69102k, this.f69103l, this.f69104m, this.f69092a, this.f69108q, list, abstractC12485bj, m53122b);
    }

    /* renamed from: b */
    public void m53134b(C17140b.InterfaceC17142b interfaceC17142b) {
        this.f69105n = interfaceC17142b;
    }
}
