package p000;

import java.util.ArrayDeque;
import java.util.Arrays;
/* renamed from: sn8 */
/* loaded from: classes5.dex */
public final class C48859sn8 {

    /* renamed from: a */
    public final ArrayDeque f109260a = new ArrayDeque();

    private C48859sn8() {
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ AbstractC41604gZ7 m13664a(C48859sn8 c48859sn8, AbstractC41604gZ7 abstractC41604gZ7, AbstractC41604gZ7 abstractC41604gZ72) {
        c48859sn8.m13663b(abstractC41604gZ7);
        c48859sn8.m13663b(abstractC41604gZ72);
        AbstractC41604gZ7 abstractC41604gZ73 = (AbstractC41604gZ7) c48859sn8.f109260a.pop();
        while (!c48859sn8.f109260a.isEmpty()) {
            abstractC41604gZ73 = new C48277ro8((AbstractC41604gZ7) c48859sn8.f109260a.pop(), abstractC41604gZ73);
        }
        return abstractC41604gZ73;
    }

    /* renamed from: c */
    public static final int m13662c(int i) {
        int binarySearch = Arrays.binarySearch(C48277ro8.f107669k, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* renamed from: b */
    public final void m13663b(AbstractC41604gZ7 abstractC41604gZ7) {
        AbstractC41604gZ7 abstractC41604gZ72;
        AbstractC41604gZ7 abstractC41604gZ73;
        if (abstractC41604gZ7.mo15341j()) {
            int m13662c = m13662c(abstractC41604gZ7.mo5074e());
            int m15346L = C48277ro8.m15346L(m13662c + 1);
            if (!this.f109260a.isEmpty() && ((AbstractC41604gZ7) this.f109260a.peek()).mo5074e() < m15346L) {
                int m15346L2 = C48277ro8.m15346L(m13662c);
                AbstractC41604gZ7 abstractC41604gZ74 = (AbstractC41604gZ7) this.f109260a.pop();
                while (!this.f109260a.isEmpty() && ((AbstractC41604gZ7) this.f109260a.peek()).mo5074e() < m15346L2) {
                    abstractC41604gZ74 = new C48277ro8((AbstractC41604gZ7) this.f109260a.pop(), abstractC41604gZ74);
                }
                C48277ro8 c48277ro8 = new C48277ro8(abstractC41604gZ74, abstractC41604gZ7);
                while (!this.f109260a.isEmpty()) {
                    if (((AbstractC41604gZ7) this.f109260a.peek()).mo5074e() >= C48277ro8.m15346L(m13662c(c48277ro8.mo5074e()) + 1)) {
                        break;
                    }
                    c48277ro8 = new C48277ro8((AbstractC41604gZ7) this.f109260a.pop(), c48277ro8);
                }
                this.f109260a.push(c48277ro8);
                return;
            }
            this.f109260a.push(abstractC41604gZ7);
        } else if (abstractC41604gZ7 instanceof C48277ro8) {
            C48277ro8 c48277ro82 = (C48277ro8) abstractC41604gZ7;
            abstractC41604gZ72 = c48277ro82.f107671g;
            m13663b(abstractC41604gZ72);
            abstractC41604gZ73 = c48277ro82.f107672h;
            m13663b(abstractC41604gZ73);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(abstractC41604gZ7.getClass())));
        }
    }

    public /* synthetic */ C48859sn8(C42337hn8 c42337hn8) {
    }
}
