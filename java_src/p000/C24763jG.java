package p000;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
/* renamed from: jG */
/* loaded from: classes6.dex */
public class C24763jG implements InterfaceC32632Ej2<Object> {
    @Override // p000.InterfaceC32632Ej2
    /* renamed from: a */
    public <E> void mo420a(E e, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
        C29358v2[] m43066d;
        AbstractC19998eG m43068b = AbstractC19998eG.m43068b(e.getClass(), C36349Ug2.f37731a);
        appendable.append(CoreConstants.CURLY_LEFT);
        boolean z = false;
        for (C29358v2 c29358v2 : m43068b.m43066d()) {
            Object m43067c = m43068b.m43067c(e, c29358v2.m9360a());
            if (m43067c != null || !c36115Tg2.m83196g()) {
                if (z) {
                    appendable.append(CoreConstants.COMMA_CHAR);
                } else {
                    z = true;
                }
                C34243Lg2.m96483l(c29358v2.m9359b(), m43067c, appendable, c36115Tg2);
            }
        }
        appendable.append(CoreConstants.CURLY_RIGHT);
    }
}
