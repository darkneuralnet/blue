package p000;
/* renamed from: WN7 */
/* loaded from: classes5.dex */
public final class WN7 extends HN7 {
    private WN7() {
        super();
    }

    /* renamed from: e */
    public static <E> BI7<E> m78505e(Object obj, long j) {
        return (BI7) C49038t58.m13129G(obj, j);
    }

    @Override // p000.HN7
    /* renamed from: a */
    public final void mo27337a(Object obj, long j) {
        m78505e(obj, j).mo113666q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    @Override // p000.HN7
    /* renamed from: b */
    public final <E> void mo27336b(Object obj, Object obj2, long j) {
        BI7<E> m78505e = m78505e(obj, j);
        BI7<E> m78505e2 = m78505e(obj2, j);
        int size = m78505e.size();
        int size2 = m78505e2.size();
        BI7<E> bi7 = m78505e;
        bi7 = m78505e;
        if (size > 0 && size2 > 0) {
            boolean mo64608v1 = m78505e.mo64608v1();
            BI7<E> bi72 = m78505e;
            if (!mo64608v1) {
                bi72 = m78505e.zzh(size2 + size);
            }
            bi72.addAll(m78505e2);
            bi7 = bi72;
        }
        if (size > 0) {
            m78505e2 = bi7;
        }
        C49038t58.m13114g(obj, j, m78505e2);
    }
}
