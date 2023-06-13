package p000;

import android.graphics.Color;
import com.github.mikephil.charting.data.BarEntry;
import java.util.List;
/* renamed from: ux */
/* loaded from: classes5.dex */
public class C29345ux extends AbstractC31596zx<BarEntry> implements XN1 {

    /* renamed from: A */
    public float f113229A;

    /* renamed from: B */
    public int f113230B;

    /* renamed from: C */
    public int f113231C;

    /* renamed from: D */
    public int f113232D;

    /* renamed from: E */
    public String[] f113233E;

    /* renamed from: y */
    public int f113234y;

    /* renamed from: z */
    public int f113235z;

    public C29345ux(List<BarEntry> list, String str) {
        super(list, str);
        this.f113234y = 1;
        this.f113235z = Color.rgb(215, 215, 215);
        this.f113229A = 0.0f;
        this.f113230B = -16777216;
        this.f113231C = 120;
        this.f113232D = 0;
        this.f113233E = new String[]{"Stack"};
        this.f122509x = Color.rgb(0, 0, 0);
        m9445b1(list);
        m9447Z0(list);
    }

    @Override // p000.XN1
    /* renamed from: B0 */
    public int mo9454B0() {
        return this.f113235z;
    }

    @Override // p000.XN1
    /* renamed from: E */
    public float mo9453E() {
        return this.f113229A;
    }

    @Override // p000.XN1
    /* renamed from: I0 */
    public int mo9452I0() {
        return this.f113231C;
    }

    @Override // p000.XN1
    /* renamed from: M */
    public boolean mo9451M() {
        return this.f113234y > 1;
    }

    @Override // p000.XN1
    /* renamed from: N */
    public String[] mo9450N() {
        return this.f113233E;
    }

    @Override // p000.XN1
    /* renamed from: X */
    public int mo9448X() {
        return this.f113230B;
    }

    /* renamed from: Z0 */
    public final void m9447Z0(List<BarEntry> list) {
        this.f113232D = 0;
        for (int i = 0; i < list.size(); i++) {
            float[] m51941k = list.get(i).m51941k();
            if (m51941k == null) {
                this.f113232D++;
            } else {
                this.f113232D += m51941k.length;
            }
        }
    }

    @Override // p000.TS0
    /* renamed from: a1 */
    public void mo9449U0(BarEntry barEntry) {
        if (barEntry != null && !Float.isNaN(barEntry.mo51938c())) {
            if (barEntry.m51941k() == null) {
                if (barEntry.mo51938c() < this.f35477u) {
                    this.f35477u = barEntry.mo51938c();
                }
                if (barEntry.mo51938c() > this.f35476t) {
                    this.f35476t = barEntry.mo51938c();
                }
            } else {
                if ((-barEntry.m51944h()) < this.f35477u) {
                    this.f35477u = -barEntry.m51944h();
                }
                if (barEntry.m51943i() > this.f35476t) {
                    this.f35476t = barEntry.m51943i();
                }
            }
            m83597V0(barEntry);
        }
    }

    /* renamed from: b1 */
    public final void m9445b1(List<BarEntry> list) {
        for (int i = 0; i < list.size(); i++) {
            float[] m51941k = list.get(i).m51941k();
            if (m51941k != null && m51941k.length > this.f113234y) {
                this.f113234y = m51941k.length;
            }
        }
    }

    @Override // p000.XN1
    /* renamed from: n */
    public int mo9444n() {
        return this.f113234y;
    }
}
