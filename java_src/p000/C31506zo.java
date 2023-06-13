package p000;

import java.io.IOException;
/* renamed from: zo */
/* loaded from: classes6.dex */
public class C31506zo implements InterfaceC32632Ej2<Object> {
    @Override // p000.InterfaceC32632Ej2
    /* renamed from: a */
    public <E> void mo420a(E e, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
        Object[] objArr;
        c36115Tg2.m83200c(appendable);
        boolean z = false;
        for (Object obj : (Object[]) e) {
            if (z) {
                c36115Tg2.m83190m(appendable);
            } else {
                z = true;
            }
            C36583Vg2.m79576b(obj, appendable, c36115Tg2);
        }
        c36115Tg2.m83199d(appendable);
    }
}
