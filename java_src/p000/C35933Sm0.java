package p000;

import android.graphics.Canvas;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.CombinedChart;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* renamed from: Sm0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C35933Sm0 extends RS0 {

    /* renamed from: g */
    public List<RS0> f34243g;

    /* renamed from: h */
    public WeakReference<Chart> f34244h;

    /* renamed from: i */
    public List<OM1> f34245i;

    /* renamed from: Sm0$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C7541a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34246a;

        static {
            int[] iArr = new int[CombinedChart.EnumC17433a.values().length];
            f34246a = iArr;
            try {
                iArr[CombinedChart.EnumC17433a.BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34246a[CombinedChart.EnumC17433a.BUBBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34246a[CombinedChart.EnumC17433a.LINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34246a[CombinedChart.EnumC17433a.CANDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34246a[CombinedChart.EnumC17433a.SCATTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C35933Sm0(CombinedChart combinedChart, C42279hi0 c42279hi0, C32951Fs6 c32951Fs6) {
        super(c42279hi0, c32951Fs6);
        this.f34243g = new ArrayList(5);
        this.f34245i = new ArrayList();
        this.f34244h = new WeakReference<>(combinedChart);
        m84854h();
    }

    @Override // p000.RS0
    /* renamed from: b */
    public void mo15000b(Canvas canvas) {
        for (RS0 rs0 : this.f34243g) {
            rs0.mo15000b(canvas);
        }
    }

    @Override // p000.RS0
    /* renamed from: c */
    public void mo14999c(Canvas canvas) {
        for (RS0 rs0 : this.f34243g) {
            rs0.mo14999c(canvas);
        }
    }

    @Override // p000.RS0
    /* renamed from: d */
    public void mo14998d(Canvas canvas, OM1[] om1Arr) {
        Object obj;
        int indexOf;
        Chart chart = this.f34244h.get();
        if (chart == null) {
            return;
        }
        for (RS0 rs0 : this.f34243g) {
            if (rs0 instanceof C28070rx) {
                obj = ((C28070rx) rs0).f107940h.mo11172q();
            } else if (rs0 instanceof C43557jr2) {
                obj = ((C43557jr2) rs0).f93446i.mo26738k();
            } else if (rs0 instanceof C42229hd0) {
                obj = ((C42229hd0) rs0).f85612i.mo37971n();
            } else if (rs0 instanceof C45289mm5) {
                obj = ((C45289mm5) rs0).f98734i.mo20507b();
            } else if (rs0 instanceof C39524d30) {
                obj = ((C39524d30) rs0).f76057h.mo42233a();
            } else {
                obj = null;
            }
            if (obj == null) {
                indexOf = -1;
            } else {
                indexOf = ((C36167Tm0) chart.getData()).m82988s().indexOf(obj);
            }
            this.f34245i.clear();
            for (OM1 om1 : om1Arr) {
                if (om1.m92392c() == indexOf || om1.m92392c() == -1) {
                    this.f34245i.add(om1);
                }
            }
            List<OM1> list = this.f34245i;
            rs0.mo14998d(canvas, (OM1[]) list.toArray(new OM1[list.size()]));
        }
    }

    @Override // p000.RS0
    /* renamed from: e */
    public void mo14997e(Canvas canvas) {
        for (RS0 rs0 : this.f34243g) {
            rs0.mo14997e(canvas);
        }
    }

    @Override // p000.RS0
    /* renamed from: f */
    public void mo14996f() {
        for (RS0 rs0 : this.f34243g) {
            rs0.mo14996f();
        }
    }

    /* renamed from: h */
    public void m84854h() {
        this.f34243g.clear();
        CombinedChart combinedChart = (CombinedChart) this.f34244h.get();
        if (combinedChart == null) {
            return;
        }
        for (CombinedChart.EnumC17433a enumC17433a : combinedChart.m51998w0()) {
            int i = C7541a.f34246a[enumC17433a.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5 && combinedChart.mo20507b() != null) {
                                this.f34243g.add(new C45289mm5(combinedChart, this.f32035b, this.f106125a));
                            }
                        } else if (combinedChart.mo37971n() != null) {
                            this.f34243g.add(new C42229hd0(combinedChart, this.f32035b, this.f106125a));
                        }
                    } else if (combinedChart.mo26738k() != null) {
                        this.f34243g.add(new C43557jr2(combinedChart, this.f32035b, this.f106125a));
                    }
                } else if (combinedChart.mo42233a() != null) {
                    this.f34243g.add(new C39524d30(combinedChart, this.f32035b, this.f106125a));
                }
            } else if (combinedChart.mo11172q() != null) {
                this.f34243g.add(new C28070rx(combinedChart, this.f32035b, this.f106125a));
            }
        }
    }
}
