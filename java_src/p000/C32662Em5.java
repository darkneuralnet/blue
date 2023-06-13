package p000;

import android.content.Context;
import androidx.recyclerview.widget.C11925l;
import androidx.work.C12120a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;
/* renamed from: Em5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C32662Em5 {

    /* renamed from: a */
    public static final String f8115a = AbstractC32056Bx2.m113270i("Schedulers");

    private C32662Em5() {
    }

    /* renamed from: a */
    public static InterfaceC51810xm5 m108386a(Context context, C37830aD6 c37830aD6) {
        C41593gY5 c41593gY5 = new C41593gY5(context, c37830aD6);
        KD3.m99070a(context, SystemJobService.class, true);
        AbstractC32056Bx2.m113272e().mo113269a(f8115a, "Created SystemJobScheduler and enabled SystemJobService");
        return c41593gY5;
    }

    /* renamed from: b */
    public static void m108385b(C12120a c12120a, WorkDatabase workDatabase, List<InterfaceC51810xm5> list) {
        if (list != null && list.size() != 0) {
            IG6 mo65549I = workDatabase.mo65549I();
            workDatabase.m108730c();
            try {
                List<HG6> mo100751q = mo65549I.mo100751q(c12120a.m65602h());
                List<HG6> mo100763e = mo65549I.mo100763e(C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION);
                if (mo100751q != null && mo100751q.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (HG6 hg6 : mo100751q) {
                        mo65549I.mo100753o(hg6.f13191a, currentTimeMillis);
                    }
                }
                workDatabase.m108734A();
                if (mo100751q != null && mo100751q.size() > 0) {
                    HG6[] hg6Arr = (HG6[]) mo100751q.toArray(new HG6[mo100751q.size()]);
                    for (InterfaceC51810xm5 interfaceC51810xm5 : list) {
                        if (interfaceC51810xm5.mo4715c()) {
                            interfaceC51810xm5.mo4716b(hg6Arr);
                        }
                    }
                }
                if (mo100763e != null && mo100763e.size() > 0) {
                    HG6[] hg6Arr2 = (HG6[]) mo100763e.toArray(new HG6[mo100763e.size()]);
                    for (InterfaceC51810xm5 interfaceC51810xm52 : list) {
                        if (!interfaceC51810xm52.mo4715c()) {
                            interfaceC51810xm52.mo4716b(hg6Arr2);
                        }
                    }
                }
            } finally {
                workDatabase.m108728g();
            }
        }
    }
}
