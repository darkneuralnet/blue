package p000;

import java.util.HashMap;
import java.util.Map;
import javax.measure.spi.UnitFormatService;
import p000.AbstractC38404bB5;
@Deprecated
/* renamed from: TY0 */
/* loaded from: classes8.dex */
public class TY0 implements UnitFormatService {

    /* renamed from: b */
    public static final String f35644b = AbstractC38404bB5.EnumC12320d.Default.name();

    /* renamed from: a */
    public final Map<String, Object> f35645a;

    public TY0() {
        HashMap hashMap = new HashMap();
        this.f35645a = hashMap;
        hashMap.put(f35644b, AbstractC38404bB5.m64874k());
        AbstractC38404bB5.EnumC12320d enumC12320d = AbstractC38404bB5.EnumC12320d.ASCII;
        hashMap.put(enumC12320d.name(), AbstractC38404bB5.m64873l(enumC12320d));
        hashMap.put("EBNF", K81.m99170d());
        hashMap.put("Local", C45969nv2.m22169f());
    }
}
