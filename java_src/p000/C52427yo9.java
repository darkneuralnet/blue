package p000;

import java.util.List;
/* renamed from: yo9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52427yo9 extends AbstractC38783bp9 {
    public /* synthetic */ C52427yo9(C47092po9 c47092po9) {
        super(null);
    }

    @Override // p000.AbstractC38783bp9
    /* renamed from: a */
    public final <L> List<L> mo2558a(Object obj, long j) {
        int i;
        An9 an9 = (An9) Fs9.m106345k(obj, j);
        if (!an9.zzc()) {
            int size = an9.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            An9 mo16911d = an9.mo16911d(i);
            Fs9.m106332x(obj, j, mo16911d);
            return mo16911d;
        }
        return an9;
    }

    @Override // p000.AbstractC38783bp9
    /* renamed from: b */
    public final void mo2557b(Object obj, long j) {
        ((An9) Fs9.m106345k(obj, j)).zzb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    @Override // p000.AbstractC38783bp9
    /* renamed from: c */
    public final <E> void mo2556c(Object obj, Object obj2, long j) {
        An9<E> an9 = (An9) Fs9.m106345k(obj, j);
        An9<E> an92 = (An9) Fs9.m106345k(obj2, j);
        int size = an9.size();
        int size2 = an92.size();
        An9<E> an93 = an9;
        an93 = an9;
        if (size > 0 && size2 > 0) {
            boolean zzc = an9.zzc();
            An9<E> an94 = an9;
            if (!zzc) {
                an94 = an9.mo16911d(size2 + size);
            }
            an94.addAll(an92);
            an93 = an94;
        }
        if (size > 0) {
            an92 = an93;
        }
        Fs9.m106332x(obj, j, an92);
    }

    private C52427yo9() {
        super(null);
    }
}
