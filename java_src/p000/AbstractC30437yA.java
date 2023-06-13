package p000;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import p000.C37875aI6;
import p000.C41175fq2;
/* renamed from: yA */
/* loaded from: classes5.dex */
public abstract class AbstractC30437yA<T extends Entry> implements InterfaceC46243oO1<T> {

    /* renamed from: a */
    public List<Integer> f118850a;

    /* renamed from: b */
    public GD1 f118851b;

    /* renamed from: c */
    public List<GD1> f118852c;

    /* renamed from: d */
    public List<Integer> f118853d;

    /* renamed from: e */
    public String f118854e;

    /* renamed from: f */
    public C37875aI6.EnumC10624a f118855f;

    /* renamed from: g */
    public boolean f118856g;

    /* renamed from: h */
    public transient AbstractC33806Jj6 f118857h;

    /* renamed from: i */
    public Typeface f118858i;

    /* renamed from: j */
    public C41175fq2.EnumC20547c f118859j;

    /* renamed from: k */
    public float f118860k;

    /* renamed from: l */
    public float f118861l;

    /* renamed from: m */
    public DashPathEffect f118862m;

    /* renamed from: n */
    public boolean f118863n;

    /* renamed from: o */
    public boolean f118864o;

    /* renamed from: p */
    public PE2 f118865p;

    /* renamed from: q */
    public float f118866q;

    /* renamed from: r */
    public boolean f118867r;

    public AbstractC30437yA() {
        this.f118850a = null;
        this.f118851b = null;
        this.f118852c = null;
        this.f118853d = null;
        this.f118854e = "DataSet";
        this.f118855f = C37875aI6.EnumC10624a.LEFT;
        this.f118856g = true;
        this.f118859j = C41175fq2.EnumC20547c.DEFAULT;
        this.f118860k = Float.NaN;
        this.f118861l = Float.NaN;
        this.f118862m = null;
        this.f118863n = true;
        this.f118864o = true;
        this.f118865p = new PE2();
        this.f118866q = 17.0f;
        this.f118867r = true;
        this.f118850a = new ArrayList();
        this.f118853d = new ArrayList();
        this.f118850a.add(Integer.valueOf(Color.rgb(140, 234, (int) KotlinVersion.MAX_COMPONENT_VALUE)));
        this.f118853d.add(-16777216);
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: A0 */
    public int mo4030A0(int i) {
        List<Integer> list = this.f118850a;
        return list.get(i % list.size()).intValue();
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: C */
    public DashPathEffect mo4029C() {
        return this.f118862m;
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: C0 */
    public boolean mo4028C0() {
        return this.f118857h == null;
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: D */
    public boolean mo4027D() {
        return this.f118864o;
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: G */
    public float mo4026G() {
        return this.f118861l;
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: M0 */
    public PE2 mo4025M0() {
        return this.f118865p;
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: N0 */
    public GD1 mo4024N0(int i) {
        List<GD1> list = this.f118852c;
        return list.get(i % list.size());
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: Q */
    public boolean mo4023Q() {
        return this.f118856g;
    }

    /* renamed from: Q0 */
    public void m4022Q0() {
        if (this.f118850a == null) {
            this.f118850a = new ArrayList();
        }
        this.f118850a.clear();
    }

    /* renamed from: R0 */
    public void m4021R0(int i) {
        m4022Q0();
        this.f118850a.add(Integer.valueOf(i));
    }

    /* renamed from: S0 */
    public void m4020S0(boolean z) {
        this.f118863n = z;
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: b0 */
    public AbstractC33806Jj6 mo4019b0() {
        if (mo4028C0()) {
            return AbstractC34967Oi6.m91651j();
        }
        return this.f118857h;
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: c0 */
    public void mo4018c0(AbstractC33806Jj6 abstractC33806Jj6) {
        if (abstractC33806Jj6 == null) {
            return;
        }
        this.f118857h = abstractC33806Jj6;
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: d */
    public C41175fq2.EnumC20547c mo4017d() {
        return this.f118859j;
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: g0 */
    public List<Integer> mo4016g0() {
        return this.f118850a;
    }

    @Override // p000.InterfaceC46243oO1
    public int getColor() {
        return this.f118850a.get(0).intValue();
    }

    @Override // p000.InterfaceC46243oO1
    public String getLabel() {
        return this.f118854e;
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: i */
    public float mo4015i() {
        return this.f118860k;
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: i0 */
    public boolean mo4014i0() {
        return this.f118863n;
    }

    @Override // p000.InterfaceC46243oO1
    public boolean isVisible() {
        return this.f118867r;
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: j0 */
    public C37875aI6.EnumC10624a mo4013j0() {
        return this.f118855f;
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: k */
    public Typeface mo4012k() {
        return this.f118858i;
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: m */
    public int mo4011m(int i) {
        List<Integer> list = this.f118853d;
        return list.get(i % list.size()).intValue();
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: r */
    public List<GD1> mo4010r() {
        return this.f118852c;
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: s0 */
    public GD1 mo4009s0() {
        return this.f118851b;
    }

    @Override // p000.InterfaceC46243oO1
    /* renamed from: u0 */
    public float mo4008u0() {
        return this.f118866q;
    }

    public AbstractC30437yA(String str) {
        this();
        this.f118854e = str;
    }
}
