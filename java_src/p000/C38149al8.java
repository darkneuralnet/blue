package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p000.Np9;
/* renamed from: al8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38149al8<T extends Np9> implements InterfaceC43713k69<InterfaceC52969zj8<T>, Void> {

    /* renamed from: a */
    public final List<InterfaceC34744Nj8<T>> f51194a;

    /* renamed from: b */
    public final Executor f51195b;

    public C38149al8(List<InterfaceC34744Nj8<T>> list, Executor executor) {
        this.f51194a = list;
        this.f51195b = executor;
    }

    /* renamed from: a */
    public static <T extends Np9> C38149al8<T> m70777a(List<InterfaceC34744Nj8<T>> list, Executor executor) {
        return new C38149al8<>(list, executor);
    }

    /* renamed from: b */
    public final /* synthetic */ Mb9 m70776b(Np9 np9, int i, List list) throws Exception {
        Mb9 m8430f = C50508va9.m8430f(np9);
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) C50508va9.m8424l((Future) list.get(i2))).booleanValue()) {
                final InterfaceC34744Nj8<T> interfaceC34744Nj8 = this.f51194a.get(i2);
                m8430f = C50508va9.m8425k(m8430f, KD8.m99067c(new InterfaceC43713k69() { // from class: nk8
                    @Override // p000.InterfaceC43713k69
                    public final Mb9 zza(Object obj) {
                        Np9 np92 = (Np9) obj;
                        return InterfaceC34744Nj8.this.zzc();
                    }
                }), Hc9.m103649b());
            }
        }
        return m8430f;
    }

    /* renamed from: c */
    public final /* synthetic */ Mb9 m70775c(final List list, final int i, final Np9 np9) throws Exception {
        return C50508va9.m8435a(list).m36176b(KD8.m99068b(new InterfaceC38952c69() { // from class: ak8
            @Override // p000.InterfaceC38952c69
            public final Mb9 zza() {
                return C38149al8.this.m70776b(np9, i, list);
            }
        }), this.f51195b);
    }

    /* renamed from: d */
    public final /* synthetic */ Mb9 m70774d(int i, List list, Object obj) throws Exception {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) C50508va9.m8424l((Future) list.get(i2))).booleanValue()) {
                arrayList.add(this.f51194a.get(i2).zza());
            }
        }
        return C50508va9.m8434b(arrayList).m36177a(A69.m116090a(null), Hc9.m103649b());
    }

    @Override // p000.InterfaceC43713k69
    public final /* bridge */ /* synthetic */ Mb9<Void> zza(Object obj) throws Exception {
        InterfaceC52969zj8 interfaceC52969zj8 = (InterfaceC52969zj8) obj;
        final int size = this.f51194a.size();
        final ArrayList arrayList = new ArrayList(size);
        AbstractC45711nU8 listIterator = ((ZP8) this.f51194a).listIterator(0);
        while (listIterator.hasNext()) {
            arrayList.add(((InterfaceC34744Nj8) listIterator.next()).zzb());
        }
        return C50508va9.m8425k(interfaceC52969zj8.mo188a(KD8.m99067c(new InterfaceC43713k69() { // from class: Nk8
            @Override // p000.InterfaceC43713k69
            public final Mb9 zza(Object obj2) {
                return C38149al8.this.m70775c(arrayList, size, (Np9) obj2);
            }
        }), Hc9.m103649b()), KD8.m99067c(new InterfaceC43713k69() { // from class: Ak8
            @Override // p000.InterfaceC43713k69
            public final Mb9 zza(Object obj2) {
                return C38149al8.this.m70774d(size, arrayList, obj2);
            }
        }), Hc9.m103649b());
    }
}
