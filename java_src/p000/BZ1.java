package p000;

import android.graphics.Color;
import bo.app.C12580d3;
import bo.app.InterfaceC13231y1;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: BZ1 */
/* loaded from: classes2.dex */
public class BZ1 extends FZ1 {

    /* renamed from: H */
    public static final String f2518H = C43664k20.m29433n(BZ1.class);

    /* renamed from: F */
    public EnumC40227eE5 f2519F;

    /* renamed from: G */
    public int f2520G;

    public BZ1() {
        this.f2519F = EnumC40227eE5.BOTTOM;
        this.f2520G = Color.parseColor("#9B9B9B");
        m36203n0(EnumC48393s06.START);
    }

    @Override // p000.InterfaceC50985wO1
    /* renamed from: h0 */
    public EnumC52810zT2 mo5008h0() {
        return EnumC52810zT2.SLIDEUP;
    }

    @Override // p000.AbstractC42191hZ1, p000.DO1
    /* renamed from: v */
    public void mo14014v() {
        super.mo14014v();
        C12580d3 m36216B = m36216B();
        if (m36216B == null) {
            C43664k20.m29438i(f2518H, "Cannot apply dark theme with a null themes wrapper");
        } else if (m36216B.m63850b().intValue() != -1) {
            this.f2520G = m36216B.m63850b().intValue();
        }
    }

    /* renamed from: w0 */
    public int m113866w0() {
        return this.f2520G;
    }

    /* renamed from: x0 */
    public EnumC40227eE5 m113865x0() {
        return this.f2519F;
    }

    @Override // p000.FZ1, p000.AbstractC42191hZ1, p000.InterfaceC37933aP1
    /* renamed from: z */
    public JSONObject forJsonPut() {
        if (m36215C() != null) {
            return m36215C();
        }
        JSONObject forJsonPut = super.forJsonPut();
        try {
            forJsonPut.putOpt("slide_from", this.f2519F.toString());
            forJsonPut.put("close_btn_color", this.f2520G);
            forJsonPut.put("type", mo5008h0().name());
        } catch (JSONException unused) {
        }
        return forJsonPut;
    }

    public BZ1(JSONObject jSONObject, InterfaceC13231y1 interfaceC13231y1) {
        this(jSONObject, interfaceC13231y1, (EnumC40227eE5) C31696Aj2.m115347l(jSONObject, "slide_from", EnumC40227eE5.class, EnumC40227eE5.BOTTOM), jSONObject.optInt("close_btn_color"));
    }

    public BZ1(JSONObject jSONObject, InterfaceC13231y1 interfaceC13231y1, EnumC40227eE5 enumC40227eE5, int i) {
        super(jSONObject, interfaceC13231y1);
        EnumC40227eE5 enumC40227eE52 = EnumC40227eE5.BOTTOM;
        this.f2519F = enumC40227eE52;
        this.f2520G = Color.parseColor("#9B9B9B");
        this.f2519F = enumC40227eE5;
        if (enumC40227eE5 == null) {
            this.f2519F = enumC40227eE52;
        }
        this.f2520G = i;
        m36211O((PE0) C31696Aj2.m115347l(jSONObject, "crop_type", PE0.class, PE0.FIT_CENTER));
        m36203n0((EnumC48393s06) C31696Aj2.m115347l(jSONObject, "text_align_message", EnumC48393s06.class, EnumC48393s06.START));
    }
}
