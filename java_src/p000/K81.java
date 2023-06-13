package p000;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
/* renamed from: K81 */
/* loaded from: classes8.dex */
public class K81 extends AbstractC29352v1 {

    /* renamed from: b */
    public static final K81 f19156b = new K81();

    /* renamed from: a */
    public final transient C51663xX5 f19157a;

    public K81() {
        this(C51663xX5.m5042g(ResourceBundle.getBundle("tech.units.indriya.format.messages", Locale.ROOT)));
    }

    /* renamed from: d */
    public static K81 m99170d() {
        return f19156b;
    }

    @Override // p000.AbstractC29352v1
    /* renamed from: a */
    public Appendable mo9385a(InterfaceC35858Sd6<?> interfaceC35858Sd6, Appendable appendable) throws IOException {
        J81.m101102b(interfaceC35858Sd6, appendable, this.f19157a);
        if (interfaceC35858Sd6 instanceof C2395Ff) {
            C2395Ff c2395Ff = (C2395Ff) interfaceC35858Sd6;
            if (c2395Ff.m106767M() != null) {
                appendable.append(CoreConstants.CURLY_LEFT);
                appendable.append(c2395Ff.m106767M());
                appendable.append(CoreConstants.CURLY_RIGHT);
            }
        }
        return appendable;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public K81(C51663xX5 c51663xX5) {
        this.f19157a = c51663xX5;
    }
}
