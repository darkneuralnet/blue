package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* renamed from: qm9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC47665qm9 {

    /* renamed from: a */
    public final Unsafe f105784a;

    public AbstractC47665qm9(Unsafe unsafe) {
        this.f105784a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo17094a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo17093b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo17092c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo17091d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo17090e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo17089f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo17088g(Object obj, long j);

    /* renamed from: h */
    public final int m17087h(Class cls) {
        return this.f105784a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int m17086i(Class cls) {
        return this.f105784a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int m17085j(Object obj, long j) {
        return this.f105784a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long m17084k(Object obj, long j) {
        return this.f105784a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long m17083l(Field field) {
        return this.f105784a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object m17082m(Object obj, long j) {
        return this.f105784a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void m17081n(Object obj, long j, int i) {
        this.f105784a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void m17080o(Object obj, long j, long j2) {
        this.f105784a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void m17079p(Object obj, long j, Object obj2) {
        this.f105784a.putObject(obj, j, obj2);
    }
}
