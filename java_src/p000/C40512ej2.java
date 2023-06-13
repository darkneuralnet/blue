package p000;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: ej2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C40512ej2 {

    /* renamed from: a */
    public final ConcurrentHashMap<Type, AbstractC41105fj2<?>> f78736a;

    /* renamed from: b */
    public AbstractC41105fj2<InterfaceC34009Kg2> f78737b;

    /* renamed from: c */
    public AbstractC41105fj2<InterfaceC34009Kg2> f78738c;

    public C40512ej2() {
        ConcurrentHashMap<Type, AbstractC41105fj2<?>> concurrentHashMap = new ConcurrentHashMap<>(100);
        this.f78736a = concurrentHashMap;
        concurrentHashMap.put(Date.class, AbstractC22604hG.f84923c);
        concurrentHashMap.put(int[].class, C0732Bo.f2897c);
        concurrentHashMap.put(Integer[].class, C0732Bo.f2898d);
        concurrentHashMap.put(short[].class, C0732Bo.f2897c);
        concurrentHashMap.put(Short[].class, C0732Bo.f2898d);
        concurrentHashMap.put(long[].class, C0732Bo.f2905k);
        concurrentHashMap.put(Long[].class, C0732Bo.f2906l);
        concurrentHashMap.put(byte[].class, C0732Bo.f2901g);
        concurrentHashMap.put(Byte[].class, C0732Bo.f2902h);
        concurrentHashMap.put(char[].class, C0732Bo.f2903i);
        concurrentHashMap.put(Character[].class, C0732Bo.f2904j);
        concurrentHashMap.put(float[].class, C0732Bo.f2907m);
        concurrentHashMap.put(Float[].class, C0732Bo.f2908n);
        concurrentHashMap.put(double[].class, C0732Bo.f2909o);
        concurrentHashMap.put(Double[].class, C0732Bo.f2910p);
        concurrentHashMap.put(boolean[].class, C0732Bo.f2911q);
        concurrentHashMap.put(Boolean[].class, C0732Bo.f2912r);
        this.f78737b = new ZX0(this);
        this.f78738c = new C38013aY0(this);
        concurrentHashMap.put(InterfaceC34009Kg2.class, this.f78737b);
        concurrentHashMap.put(InterfaceC33775Jg2.class, this.f78737b);
        concurrentHashMap.put(C33307Hg2.class, this.f78737b);
        concurrentHashMap.put(C34243Lg2.class, this.f78737b);
    }
}
