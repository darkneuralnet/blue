package p000;

import java.util.List;
/* renamed from: bN8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38515bN8 extends UL8 {
    private C38515bN8() {
        super();
    }

    /* renamed from: f */
    public static <E> RJ8<E> m64607f(Object obj, long j) {
        return (RJ8) SZ8.m85273F(obj, j);
    }

    @Override // p000.UL8
    /* renamed from: a */
    public final <L> List<L> mo14267a(Object obj, long j) {
        int i;
        RJ8 m64607f = m64607f(obj, j);
        if (!m64607f.zza()) {
            int size = m64607f.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size << 1;
            }
            RJ8 zza = m64607f.zza(i);
            SZ8.m85254j(obj, j, zza);
            return zza;
        }
        return m64607f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    @Override // p000.UL8
    /* renamed from: c */
    public final <E> void mo14266c(Object obj, Object obj2, long j) {
        RJ8<E> m64607f = m64607f(obj, j);
        RJ8<E> m64607f2 = m64607f(obj2, j);
        int size = m64607f.size();
        int size2 = m64607f2.size();
        RJ8<E> rj8 = m64607f;
        rj8 = m64607f;
        if (size > 0 && size2 > 0) {
            boolean zza = m64607f.zza();
            RJ8<E> rj82 = m64607f;
            if (!zza) {
                rj82 = m64607f.zza(size2 + size);
            }
            rj82.addAll(m64607f2);
            rj8 = rj82;
        }
        if (size > 0) {
            m64607f2 = rj8;
        }
        SZ8.m85254j(obj, j, m64607f2);
    }

    @Override // p000.UL8
    /* renamed from: e */
    public final void mo14265e(Object obj, long j) {
        m64607f(obj, j).zzb();
    }
}
