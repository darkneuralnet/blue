package p000;

import android.util.Range;
import android.util.Size;
import p000.InterfaceC44592lc1;
/* renamed from: fp6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C41169fp6 implements ZU5<AbstractC39983dp6> {

    /* renamed from: a */
    public final String f80763a;

    /* renamed from: b */
    public final EnumC47841r46 f80764b;

    /* renamed from: c */
    public final AbstractC51248wp6 f80765c;

    /* renamed from: d */
    public final Size f80766d;

    /* renamed from: e */
    public final InterfaceC44592lc1.AbstractC25739c f80767e;

    /* renamed from: f */
    public final Range<Integer> f80768f;

    public C41169fp6(String str, EnumC47841r46 enumC47841r46, AbstractC51248wp6 abstractC51248wp6, Size size, InterfaceC44592lc1.AbstractC25739c abstractC25739c, Range<Integer> range) {
        this.f80763a = str;
        this.f80764b = enumC47841r46;
        this.f80765c = abstractC51248wp6;
        this.f80766d = size;
        this.f80767e = abstractC25739c;
        this.f80768f = range;
    }

    @Override // p000.ZU5
    /* renamed from: a */
    public AbstractC39983dp6 get() {
        int m40785b = m40785b();
        C33928Jx2.m99533a("VidEncVdPrflRslvr", "Resolved VIDEO frame rate: " + m40785b + "fps");
        Range<Integer> mo6285c = this.f80765c.mo6285c();
        C33928Jx2.m99533a("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        return AbstractC39983dp6.m43676d().mo15095g(this.f80763a).mo15096f(this.f80764b).mo15094h(this.f80766d).mo15100b(C37595Zo6.m72476d(this.f80767e.mo4519c(), m40785b, this.f80767e.mo4516f(), this.f80766d.getWidth(), this.f80767e.mo4511k(), this.f80766d.getHeight(), this.f80767e.mo4514h(), mo6285c)).mo15098d(m40785b).mo15101a();
    }

    /* renamed from: b */
    public final int m40785b() {
        Range<Integer> mo6284d = this.f80765c.mo6284d();
        int mo4516f = this.f80767e.mo4516f();
        C33928Jx2.m99533a("VidEncVdPrflRslvr", String.format("Frame rate from video profile: %dfps. [Requested range: %s, Expected operating range: %s]", Integer.valueOf(mo4516f), mo6284d, this.f80768f));
        return C37595Zo6.m72479a(mo6284d, mo4516f, this.f80768f);
    }
}
