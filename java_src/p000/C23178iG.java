package p000;

import ch.qos.logback.core.net.SyslogConstants;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* renamed from: iG */
/* loaded from: classes6.dex */
public class C23178iG implements InterfaceC32632Ej2<Object> {
    @Override // p000.InterfaceC32632Ej2
    /* renamed from: a */
    public <E> void mo420a(E e, Appendable appendable, C36115Tg2 c36115Tg2) throws IOException {
        Field[] declaredFields;
        Method method;
        Object invoke;
        Class<?> type;
        try {
            c36115Tg2.m83189n(appendable);
            boolean z = false;
            for (Class<?> cls = e.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
                for (Field field : cls.getDeclaredFields()) {
                    int modifiers = field.getModifiers();
                    if ((modifiers & SyslogConstants.LOG_LOCAL3) <= 0) {
                        if ((modifiers & 1) > 0) {
                            invoke = field.get(e);
                        } else {
                            try {
                                method = cls.getDeclaredMethod(C36349Ug2.m81194a(field.getName()), new Class[0]);
                            } catch (Exception unused) {
                                method = null;
                            }
                            if (method == null && ((type = field.getType()) == Boolean.TYPE || type == Boolean.class)) {
                                method = cls.getDeclaredMethod(C36349Ug2.m81193b(field.getName()), new Class[0]);
                            }
                            if (method != null) {
                                invoke = method.invoke(e, new Object[0]);
                            }
                        }
                        if (invoke != null || !c36115Tg2.m83196g()) {
                            if (z) {
                                c36115Tg2.m83190m(appendable);
                            } else {
                                z = true;
                            }
                            C32164Cj2.m111786g(field.getName(), invoke, appendable, c36115Tg2);
                        }
                    }
                }
            }
            c36115Tg2.m83188o(appendable);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
