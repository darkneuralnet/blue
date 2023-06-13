package p000;

import java.util.Comparator;
/* renamed from: sx9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48960sx9 implements Comparator<AbstractC43604jv9> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(AbstractC43604jv9 abstractC43604jv9, AbstractC43604jv9 abstractC43604jv92) {
        int m29750f;
        int m29750f2;
        AbstractC43604jv9 abstractC43604jv93 = abstractC43604jv9;
        AbstractC43604jv9 abstractC43604jv94 = abstractC43604jv92;
        InterfaceC31674Ag7 interfaceC31674Ag7 = (InterfaceC31674Ag7) abstractC43604jv93.iterator();
        InterfaceC31674Ag7 interfaceC31674Ag72 = (InterfaceC31674Ag7) abstractC43604jv94.iterator();
        while (interfaceC31674Ag7.hasNext() && interfaceC31674Ag72.hasNext()) {
            m29750f = AbstractC43604jv9.m29750f(interfaceC31674Ag7.nextByte());
            m29750f2 = AbstractC43604jv9.m29750f(interfaceC31674Ag72.nextByte());
            int compare = Integer.compare(m29750f, m29750f2);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(abstractC43604jv93.size(), abstractC43604jv94.size());
    }
}
