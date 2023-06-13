package p000;

import java.util.ArrayDeque;
import java.util.Arrays;
/* renamed from: Kv7 */
/* loaded from: classes5.dex */
public final class C34149Kv7 {

    /* renamed from: a */
    public final ArrayDeque f20397a = new ArrayDeque();

    private C34149Kv7() {
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC44175kt7 m98126a(C34149Kv7 c34149Kv7, AbstractC44175kt7 abstractC44175kt7, AbstractC44175kt7 abstractC44175kt72) {
        c34149Kv7.m98125b(abstractC44175kt7);
        c34149Kv7.m98125b(abstractC44175kt72);
        AbstractC44175kt7 abstractC44175kt73 = (AbstractC44175kt7) c34149Kv7.f20397a.pop();
        while (!c34149Kv7.f20397a.isEmpty()) {
            abstractC44175kt73 = new C34617Mv7((AbstractC44175kt7) c34149Kv7.f20397a.pop(), abstractC44175kt73, null);
        }
        return abstractC44175kt73;
    }

    /* renamed from: c */
    public static final int m98124c(int i) {
        int binarySearch = Arrays.binarySearch(C34617Mv7.f23821k, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* renamed from: b */
    public final void m98125b(AbstractC44175kt7 abstractC44175kt7) {
        AbstractC44175kt7 abstractC44175kt72;
        AbstractC44175kt7 abstractC44175kt73;
        if (abstractC44175kt7.mo28214j()) {
            int m98124c = m98124c(abstractC44175kt7.mo28217e());
            int m94561N = C34617Mv7.m94561N(m98124c + 1);
            if (!this.f20397a.isEmpty() && ((AbstractC44175kt7) this.f20397a.peek()).mo28217e() < m94561N) {
                int m94561N2 = C34617Mv7.m94561N(m98124c);
                AbstractC44175kt7 abstractC44175kt74 = (AbstractC44175kt7) this.f20397a.pop();
                while (!this.f20397a.isEmpty() && ((AbstractC44175kt7) this.f20397a.peek()).mo28217e() < m94561N2) {
                    abstractC44175kt74 = new C34617Mv7((AbstractC44175kt7) this.f20397a.pop(), abstractC44175kt74, null);
                }
                C34617Mv7 c34617Mv7 = new C34617Mv7(abstractC44175kt74, abstractC44175kt7, null);
                while (!this.f20397a.isEmpty()) {
                    if (((AbstractC44175kt7) this.f20397a.peek()).mo28217e() >= C34617Mv7.m94561N(m98124c(c34617Mv7.mo28217e()) + 1)) {
                        break;
                    }
                    c34617Mv7 = new C34617Mv7((AbstractC44175kt7) this.f20397a.pop(), c34617Mv7, null);
                }
                this.f20397a.push(c34617Mv7);
                return;
            }
            this.f20397a.push(abstractC44175kt7);
        } else if (abstractC44175kt7 instanceof C34617Mv7) {
            C34617Mv7 c34617Mv72 = (C34617Mv7) abstractC44175kt7;
            abstractC44175kt72 = c34617Mv72.f23823g;
            m98125b(abstractC44175kt72);
            abstractC44175kt73 = c34617Mv72.f23824h;
            m98125b(abstractC44175kt73);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(abstractC44175kt7.getClass())));
        }
    }

    public /* synthetic */ C34149Kv7(C33915Jv7 c33915Jv7) {
    }
}
