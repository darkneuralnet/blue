package p000;

import java.io.IOException;
import javax.measure.MeasurementException;
/* renamed from: v1 */
/* loaded from: classes8.dex */
public abstract class AbstractC29352v1 {
    /* renamed from: a */
    public abstract Appendable mo9385a(InterfaceC35858Sd6<?> interfaceC35858Sd6, Appendable appendable) throws IOException;

    /* renamed from: b */
    public final String m9384b(InterfaceC35858Sd6<?> interfaceC35858Sd6) {
        if (interfaceC35858Sd6 instanceof AbstractC28986u1) {
            return m9383c((AbstractC28986u1) interfaceC35858Sd6, new StringBuilder()).toString();
        }
        try {
            return mo9385a(interfaceC35858Sd6, new StringBuilder()).toString();
        } catch (IOException e) {
            throw new MeasurementException(e);
        }
    }

    /* renamed from: c */
    public final StringBuilder m9383c(AbstractC28986u1<?> abstractC28986u1, StringBuilder sb) {
        try {
            return (StringBuilder) mo9385a(abstractC28986u1, sb);
        } catch (IOException e) {
            throw new MeasurementException(e);
        }
    }
}
