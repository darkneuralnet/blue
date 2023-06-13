package p000;

import android.util.Range;
import android.util.Size;
/* renamed from: ep6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C40576ep6 implements ZU5<AbstractC39983dp6> {

    /* renamed from: f */
    public static final Size f78956f = new Size(1280, 720);

    /* renamed from: g */
    public static final Range<Integer> f78957g = new Range<>(1, 60);

    /* renamed from: a */
    public final String f78958a;

    /* renamed from: b */
    public final EnumC47841r46 f78959b;

    /* renamed from: c */
    public final AbstractC51248wp6 f78960c;

    /* renamed from: d */
    public final Size f78961d;

    /* renamed from: e */
    public final Range<Integer> f78962e;

    public C40576ep6(String str, EnumC47841r46 enumC47841r46, AbstractC51248wp6 abstractC51248wp6, Size size, Range<Integer> range) {
        this.f78958a = str;
        this.f78959b = enumC47841r46;
        this.f78960c = abstractC51248wp6;
        this.f78961d = size;
        this.f78962e = range;
    }

    @Override // p000.ZU5
    /* renamed from: a */
    public AbstractC39983dp6 get() {
        int m42506b = m42506b();
        C33928Jx2.m99533a("VidEncCfgDefaultRslvr", "Resolved VIDEO frame rate: " + m42506b + "fps");
        Range<Integer> mo6285c = this.f78960c.mo6285c();
        C33928Jx2.m99533a("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        int width = this.f78961d.getWidth();
        Size size = f78956f;
        return AbstractC39983dp6.m43676d().mo15095g(this.f78958a).mo15096f(this.f78959b).mo15094h(this.f78961d).mo15100b(C37595Zo6.m72476d(14000000, m42506b, 30, width, size.getWidth(), this.f78961d.getHeight(), size.getHeight(), mo6285c)).mo15098d(m42506b).mo15101a();
    }

    /* renamed from: b */
    public final int m42506b() {
        int i;
        Range<Integer> mo6284d = this.f78960c.mo6284d();
        if (!AbstractC51248wp6.f116608a.equals(mo6284d)) {
            i = f78957g.clamp(mo6284d.getUpper()).intValue();
        } else {
            i = 30;
        }
        C33928Jx2.m99533a("VidEncCfgDefaultRslvr", String.format("Frame rate default: %dfps. [Requested range: %s, Expected operating range: %s]", Integer.valueOf(i), mo6284d, this.f78962e));
        return C37595Zo6.m72479a(mo6284d, i, this.f78962e);
    }
}
