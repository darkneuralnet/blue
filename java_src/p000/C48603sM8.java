package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: sM8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48603sM8 extends UL8 {

    /* renamed from: c */
    public static final Class<?> f108681c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C48603sM8() {
        super();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static <L> List<L> m14264f(Object obj, long j, int i) {
        C50965wL8 c50965wL8;
        List<L> arrayList;
        List<L> m14263g = m14263g(obj, j);
        if (m14263g.isEmpty()) {
            if (m14263g instanceof InterfaceC41488gM8) {
                arrayList = new C50965wL8(i);
            } else if ((m14263g instanceof IS8) && (m14263g instanceof RJ8)) {
                arrayList = ((RJ8) m14263g).zza(i);
            } else {
                arrayList = new ArrayList<>(i);
            }
            SZ8.m85254j(obj, j, arrayList);
            return arrayList;
        }
        if (f108681c.isAssignableFrom(m14263g.getClass())) {
            ArrayList arrayList2 = new ArrayList(m14263g.size() + i);
            arrayList2.addAll(m14263g);
            SZ8.m85254j(obj, j, arrayList2);
            c50965wL8 = arrayList2;
        } else if (m14263g instanceof C38623bZ8) {
            C50965wL8 c50965wL82 = new C50965wL8(m14263g.size() + i);
            c50965wL82.addAll((C38623bZ8) m14263g);
            SZ8.m85254j(obj, j, c50965wL82);
            c50965wL8 = c50965wL82;
        } else if ((m14263g instanceof IS8) && (m14263g instanceof RJ8)) {
            RJ8 rj8 = (RJ8) m14263g;
            if (!rj8.zza()) {
                RJ8 zza = rj8.zza(m14263g.size() + i);
                SZ8.m85254j(obj, j, zza);
                return zza;
            }
            return m14263g;
        } else {
            return m14263g;
        }
        return c50965wL8;
    }

    /* renamed from: g */
    public static <E> List<E> m14263g(Object obj, long j) {
        return (List) SZ8.m85273F(obj, j);
    }

    @Override // p000.UL8
    /* renamed from: a */
    public final <L> List<L> mo14267a(Object obj, long j) {
        return m14264f(obj, j, 10);
    }

    @Override // p000.UL8
    /* renamed from: c */
    public final <E> void mo14266c(Object obj, Object obj2, long j) {
        List m14263g = m14263g(obj2, j);
        List m14264f = m14264f(obj, j, m14263g.size());
        int size = m14264f.size();
        int size2 = m14263g.size();
        if (size > 0 && size2 > 0) {
            m14264f.addAll(m14263g);
        }
        if (size > 0) {
            m14263g = m14264f;
        }
        SZ8.m85254j(obj, j, m14263g);
    }

    @Override // p000.UL8
    /* renamed from: e */
    public final void mo14265e(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) SZ8.m85273F(obj, j);
        if (list instanceof InterfaceC41488gM8) {
            unmodifiableList = ((InterfaceC41488gM8) list).zze();
        } else if (f108681c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof IS8) && (list instanceof RJ8)) {
                RJ8 rj8 = (RJ8) list;
                if (rj8.zza()) {
                    rj8.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        SZ8.m85254j(obj, j, unmodifiableList);
    }
}
