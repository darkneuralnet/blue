package p000;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;
/* renamed from: mT5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C45106mT5 {

    /* renamed from: a */
    public final Method f98074a;

    /* renamed from: b */
    public final ThreadMode f98075b;

    /* renamed from: c */
    public final Class<?> f98076c;

    /* renamed from: d */
    public final int f98077d;

    /* renamed from: e */
    public final boolean f98078e;

    /* renamed from: f */
    public String f98079f;

    public C45106mT5(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.f98074a = method;
        this.f98075b = threadMode;
        this.f98076c = cls;
        this.f98077d = i;
        this.f98078e = z;
    }

    /* renamed from: a */
    public final synchronized void m25543a() {
        if (this.f98079f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f98074a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f98074a.getName());
            sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            sb.append(this.f98076c.getName());
            this.f98079f = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45106mT5) {
            m25543a();
            C45106mT5 c45106mT5 = (C45106mT5) obj;
            c45106mT5.m25543a();
            return this.f98079f.equals(c45106mT5.f98079f);
        }
        return false;
    }

    public int hashCode() {
        return this.f98074a.hashCode();
    }
}
