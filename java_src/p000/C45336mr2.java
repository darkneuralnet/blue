package p000;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
/* renamed from: mr2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C45336mr2 extends AbstractC51264wr2<Entry> implements MO1 {

    /* renamed from: H */
    public EnumC26273a f98899H;

    /* renamed from: I */
    public List<Integer> f98900I;

    /* renamed from: J */
    public int f98901J;

    /* renamed from: K */
    public float f98902K;

    /* renamed from: L */
    public float f98903L;

    /* renamed from: M */
    public float f98904M;

    /* renamed from: N */
    public DashPathEffect f98905N;

    /* renamed from: O */
    public InterfaceC48022rO1 f98906O;

    /* renamed from: P */
    public boolean f98907P;

    /* renamed from: Q */
    public boolean f98908Q;

    /* renamed from: mr2$a */
    /* loaded from: classes5.dex */
    public enum EnumC26273a {
        LINEAR,
        STEPPED,
        CUBIC_BEZIER,
        HORIZONTAL_BEZIER
    }

    public C45336mr2(List<Entry> list, String str) {
        super(list, str);
        this.f98899H = EnumC26273a.LINEAR;
        this.f98900I = null;
        this.f98901J = -1;
        this.f98902K = 8.0f;
        this.f98903L = 4.0f;
        this.f98904M = 0.2f;
        this.f98905N = null;
        this.f98906O = new C39190cX0();
        this.f98907P = true;
        this.f98908Q = true;
        if (this.f98900I == null) {
            this.f98900I = new ArrayList();
        }
        this.f98900I.clear();
        this.f98900I.add(Integer.valueOf(Color.rgb(140, 234, (int) KotlinVersion.MAX_COMPONENT_VALUE)));
    }

    @Override // p000.MO1
    /* renamed from: B */
    public InterfaceC48022rO1 mo24860B() {
        return this.f98906O;
    }

    @Override // p000.MO1
    /* renamed from: F */
    public DashPathEffect mo24859F() {
        return this.f98905N;
    }

    @Override // p000.MO1
    /* renamed from: O */
    public int mo24858O(int i) {
        return this.f98900I.get(i).intValue();
    }

    @Override // p000.MO1
    /* renamed from: P */
    public boolean mo24857P() {
        return this.f98907P;
    }

    @Override // p000.MO1
    /* renamed from: P0 */
    public boolean mo24856P0() {
        return this.f98908Q;
    }

    @Override // p000.MO1
    /* renamed from: R */
    public float mo24855R() {
        return this.f98903L;
    }

    @Override // p000.MO1
    /* renamed from: a0 */
    public float mo24854a0() {
        return this.f98904M;
    }

    /* renamed from: a1 */
    public void m24853a1() {
        this.f98905N = null;
    }

    /* renamed from: b1 */
    public void m24852b1(float f, float f2, float f3) {
        this.f98905N = new DashPathEffect(new float[]{f, f2}, f3);
    }

    @Override // p000.MO1
    /* renamed from: c */
    public boolean mo24851c() {
        return this.f98905N != null;
    }

    /* renamed from: c1 */
    public void m24850c1(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < 0.05f) {
            f = 0.05f;
        }
        this.f98904M = f;
    }

    /* renamed from: d1 */
    public void m24849d1(boolean z) {
        this.f98907P = z;
    }

    @Override // p000.MO1
    /* renamed from: e */
    public int mo24848e() {
        return this.f98901J;
    }

    /* renamed from: e1 */
    public void m24847e1(EnumC26273a enumC26273a) {
        this.f98899H = enumC26273a;
    }

    @Override // p000.MO1
    /* renamed from: w0 */
    public float mo24846w0() {
        return this.f98902K;
    }

    @Override // p000.MO1
    /* renamed from: x */
    public int mo24845x() {
        return this.f98900I.size();
    }

    @Override // p000.MO1
    /* renamed from: z0 */
    public EnumC26273a mo24844z0() {
        return this.f98899H;
    }
}
