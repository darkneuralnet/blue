package bo.app;

import java.util.List;
import org.json.JSONArray;
/* renamed from: bo.app.i3 */
/* loaded from: classes.dex */
public abstract class AbstractC12743i3 implements InterfaceC12546b2 {

    /* renamed from: c */
    private static final String f58638c = C43664k20.m29433n(AbstractC12743i3.class);

    /* renamed from: b */
    protected final List<InterfaceC12546b2> f58639b;

    public AbstractC12743i3(List<InterfaceC12546b2> list) {
        this.f58639b = list;
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: e */
    public JSONArray forJsonPut() {
        JSONArray jSONArray = new JSONArray();
        try {
            for (InterfaceC12546b2 interfaceC12546b2 : this.f58639b) {
                jSONArray.put(interfaceC12546b2.forJsonPut());
            }
        } catch (Exception e) {
            C43664k20.m29434m(f58638c, "Caught exception creating Json.", e);
        }
        return jSONArray;
    }
}
