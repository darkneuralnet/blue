package p000;

import java.util.Comparator;
/* renamed from: Wy8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36985Wy8 implements Comparator<AbstractC53119zy8> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(AbstractC53119zy8 abstractC53119zy8, AbstractC53119zy8 abstractC53119zy82) {
        int m33x;
        int m33x2;
        AbstractC53119zy8 abstractC53119zy83 = abstractC53119zy8;
        AbstractC53119zy8 abstractC53119zy84 = abstractC53119zy82;
        InterfaceC33250Gz8 interfaceC33250Gz8 = (InterfaceC33250Gz8) abstractC53119zy83.iterator();
        InterfaceC33250Gz8 interfaceC33250Gz82 = (InterfaceC33250Gz8) abstractC53119zy84.iterator();
        while (interfaceC33250Gz8.hasNext() && interfaceC33250Gz82.hasNext()) {
            m33x = AbstractC53119zy8.m33x(interfaceC33250Gz8.zza());
            m33x2 = AbstractC53119zy8.m33x(interfaceC33250Gz82.zza());
            int compare = Integer.compare(m33x, m33x2);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(abstractC53119zy83.mo44b(), abstractC53119zy84.mo44b());
    }
}
