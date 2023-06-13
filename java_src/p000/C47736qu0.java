package p000;

import java.util.BitSet;
import java.util.function.Predicate;
/* renamed from: qu0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47736qu0 {

    /* renamed from: a */
    public final BitSet f106049a;

    @FunctionalInterface
    /* renamed from: qu0$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC27734a {
        /* renamed from: a */
        void mo16795a(int i, int i2);
    }

    public C47736qu0(BitSet bitSet) {
        this.f106049a = bitSet;
    }

    /* renamed from: a */
    public static <T> C47736qu0 m16797a(T[] tArr, Predicate<T> predicate) {
        BitSet bitSet = new BitSet(tArr.length);
        int i = 0;
        for (T t : tArr) {
            if (predicate.test(t)) {
                bitSet.set(i);
            }
            i++;
        }
        return new C47736qu0(bitSet);
    }

    /* renamed from: b */
    public void m16796b(InterfaceC27734a interfaceC27734a) {
        int i = 0;
        while (true) {
            int nextSetBit = this.f106049a.nextSetBit(i);
            if (nextSetBit > -1) {
                int nextClearBit = this.f106049a.nextClearBit(nextSetBit);
                if (nextClearBit == -1) {
                    interfaceC27734a.mo16795a(nextSetBit, this.f106049a.size());
                    return;
                } else {
                    interfaceC27734a.mo16795a(nextSetBit, nextClearBit);
                    i = nextClearBit;
                }
            } else {
                return;
            }
        }
    }
}
