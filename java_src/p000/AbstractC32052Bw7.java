package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* renamed from: Bw7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC32052Bw7 {

    /* renamed from: a */
    public final Unsafe f3070a;

    public AbstractC32052Bw7(Unsafe unsafe) {
        this.f3070a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo97a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo96b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo95c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo94d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo93e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo92f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo91g(Object obj, long j);

    /* renamed from: h */
    public final int m113309h(Class cls) {
        return this.f3070a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int m113308i(Class cls) {
        return this.f3070a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int m113307j(Object obj, long j) {
        return this.f3070a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long m113306k(Object obj, long j) {
        return this.f3070a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long m113305l(Field field) {
        return this.f3070a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object m113304m(Object obj, long j) {
        return this.f3070a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void m113303n(Object obj, long j, int i) {
        this.f3070a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void m113302o(Object obj, long j, long j2) {
        this.f3070a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void m113301p(Object obj, long j, Object obj2) {
        this.f3070a.putObject(obj, j, obj2);
    }
}
