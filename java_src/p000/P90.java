package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.InterfaceC11183i;
import androidx.camera.core.impl.C11192d;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p000.C43385ja0;
import p000.C47885r90;
import p000.O80;
import p000.P90;
/* renamed from: P90 */
/* loaded from: classes.dex */
public class P90 {

    /* renamed from: h */
    public static final Set<EnumC49907ua0> f27984h = Collections.unmodifiableSet(EnumSet.of(EnumC49907ua0.PASSIVE_FOCUSED, EnumC49907ua0.PASSIVE_NOT_FOCUSED, EnumC49907ua0.LOCKED_FOCUSED, EnumC49907ua0.LOCKED_NOT_FOCUSED));

    /* renamed from: i */
    public static final Set<EnumC50499va0> f27985i = Collections.unmodifiableSet(EnumSet.of(EnumC50499va0.CONVERGED, EnumC50499va0.UNKNOWN));

    /* renamed from: j */
    public static final Set<EnumC48721sa0> f27986j;

    /* renamed from: k */
    public static final Set<EnumC48721sa0> f27987k;

    /* renamed from: a */
    public final C47885r90 f27988a;

    /* renamed from: b */
    public final C37514Zf6 f27989b;

    /* renamed from: c */
    public final boolean f27990c;

    /* renamed from: d */
    public final C36099Te4 f27991d;

    /* renamed from: e */
    public final Executor f27992e;

    /* renamed from: f */
    public final boolean f27993f;

    /* renamed from: g */
    public int f27994g = 1;

    /* renamed from: P90$a */
    /* loaded from: classes.dex */
    public static class C6279a implements InterfaceC6284d {

        /* renamed from: a */
        public final C47885r90 f27995a;

        /* renamed from: b */
        public final C52640zA3 f27996b;

        /* renamed from: c */
        public final int f27997c;

        /* renamed from: d */
        public boolean f27998d = false;

        public C6279a(C47885r90 c47885r90, int i, C52640zA3 c52640zA3) {
            this.f27995a = c47885r90;
            this.f27997c = i;
            this.f27996b = c52640zA3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ Object m90671f(O80.C5832a c5832a) throws Exception {
            this.f27995a.m16433B().m96186Q(c5832a);
            this.f27996b.m1724b();
            return "AePreCapture";
        }

        @Override // p000.P90.InterfaceC6284d
        /* renamed from: a */
        public ListenableFuture<Boolean> mo90648a(TotalCaptureResult totalCaptureResult) {
            if (P90.m90678b(this.f27997c, totalCaptureResult)) {
                C33928Jx2.m99533a("Camera2CapturePipeline", "Trigger AE");
                this.f27998d = true;
                return DA1.m110820a(O80.m92864a(new O80.InterfaceC5834c() { // from class: N90
                    @Override // p000.O80.InterfaceC5834c
                    /* renamed from: a */
                    public final Object mo3207a(O80.C5832a c5832a) {
                        Object m90671f;
                        m90671f = P90.C6279a.this.m90671f(c5832a);
                        return m90671f;
                    }
                })).m110817d(new InterfaceC51452xA1() { // from class: O90
                    @Override // p000.InterfaceC51452xA1
                    public final Object apply(Object obj) {
                        Boolean bool;
                        Void r1 = (Void) obj;
                        bool = Boolean.TRUE;
                        return bool;
                    }
                }, C31631Ac0.m115449a());
            }
            return IA1.m102836h(Boolean.FALSE);
        }

        @Override // p000.P90.InterfaceC6284d
        /* renamed from: b */
        public boolean mo90647b() {
            return this.f27997c == 0;
        }

        @Override // p000.P90.InterfaceC6284d
        /* renamed from: c */
        public void mo90646c() {
            if (this.f27998d) {
                C33928Jx2.m99533a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f27995a.m16433B().m96175j(false, true);
                this.f27996b.m1725a();
            }
        }
    }

    /* renamed from: P90$b */
    /* loaded from: classes.dex */
    public static class C6280b implements InterfaceC6284d {

        /* renamed from: a */
        public final C47885r90 f27999a;

        /* renamed from: b */
        public boolean f28000b = false;

        public C6280b(C47885r90 c47885r90) {
            this.f27999a = c47885r90;
        }

        @Override // p000.P90.InterfaceC6284d
        /* renamed from: a */
        public ListenableFuture<Boolean> mo90648a(TotalCaptureResult totalCaptureResult) {
            ListenableFuture<Boolean> m102836h = IA1.m102836h(Boolean.TRUE);
            if (totalCaptureResult == null) {
                return m102836h;
            }
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE);
            if (num == null) {
                return m102836h;
            }
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2) {
                C33928Jx2.m99533a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    C33928Jx2.m99533a("Camera2CapturePipeline", "Trigger AF");
                    this.f28000b = true;
                    this.f27999a.m16433B().m96185R(null, false);
                }
            }
            return m102836h;
        }

        @Override // p000.P90.InterfaceC6284d
        /* renamed from: b */
        public boolean mo90647b() {
            return true;
        }

        @Override // p000.P90.InterfaceC6284d
        /* renamed from: c */
        public void mo90646c() {
            if (this.f28000b) {
                C33928Jx2.m99533a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f27999a.m16433B().m96175j(true, false);
            }
        }
    }

    /* renamed from: P90$c */
    /* loaded from: classes.dex */
    public static class C6281c {

        /* renamed from: i */
        public static final long f28001i;

        /* renamed from: j */
        public static final long f28002j;

        /* renamed from: a */
        public final int f28003a;

        /* renamed from: b */
        public final Executor f28004b;

        /* renamed from: c */
        public final C47885r90 f28005c;

        /* renamed from: d */
        public final C52640zA3 f28006d;

        /* renamed from: e */
        public final boolean f28007e;

        /* renamed from: f */
        public long f28008f = f28001i;

        /* renamed from: g */
        public final List<InterfaceC6284d> f28009g = new ArrayList();

        /* renamed from: h */
        public final InterfaceC6284d f28010h = new C6282a();

        /* renamed from: P90$c$a */
        /* loaded from: classes.dex */
        public class C6282a implements InterfaceC6284d {
            public C6282a() {
            }

            /* renamed from: e */
            public static /* synthetic */ Boolean m90652e(List list) {
                return Boolean.valueOf(list.contains(Boolean.TRUE));
            }

            @Override // p000.P90.InterfaceC6284d
            /* renamed from: a */
            public ListenableFuture<Boolean> mo90648a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                for (InterfaceC6284d interfaceC6284d : C6281c.this.f28009g) {
                    arrayList.add(interfaceC6284d.mo90648a(totalCaptureResult));
                }
                return IA1.m102829o(IA1.m102841c(arrayList), new InterfaceC51452xA1() { // from class: W90
                    @Override // p000.InterfaceC51452xA1
                    public final Object apply(Object obj) {
                        Boolean m90652e;
                        m90652e = P90.C6281c.C6282a.m90652e((List) obj);
                        return m90652e;
                    }
                }, C31631Ac0.m115449a());
            }

            @Override // p000.P90.InterfaceC6284d
            /* renamed from: b */
            public boolean mo90647b() {
                for (InterfaceC6284d interfaceC6284d : C6281c.this.f28009g) {
                    if (interfaceC6284d.mo90647b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // p000.P90.InterfaceC6284d
            /* renamed from: c */
            public void mo90646c() {
                for (InterfaceC6284d interfaceC6284d : C6281c.this.f28009g) {
                    interfaceC6284d.mo90646c();
                }
            }
        }

        /* renamed from: P90$c$b */
        /* loaded from: classes.dex */
        public class C6283b extends AbstractC46943pa0 {

            /* renamed from: a */
            public final /* synthetic */ O80.C5832a f28012a;

            public C6283b(O80.C5832a c5832a) {
                this.f28012a = c5832a;
            }

            @Override // p000.AbstractC46943pa0
            /* renamed from: a */
            public void mo16367a() {
                this.f28012a.m92858f(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override // p000.AbstractC46943pa0
            /* renamed from: b */
            public void mo4448b(InterfaceC51685xa0 interfaceC51685xa0) {
                this.f28012a.m92861c(null);
            }

            @Override // p000.AbstractC46943pa0
            /* renamed from: c */
            public void mo16366c(C48129ra0 c48129ra0) {
                this.f28012a.m92858f(new ImageCaptureException(2, "Capture request failed with reason " + c48129ra0.m15754a(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f28001i = timeUnit.toNanos(1L);
            f28002j = timeUnit.toNanos(5L);
        }

        public C6281c(int i, Executor executor, C47885r90 c47885r90, boolean z, C52640zA3 c52640zA3) {
            this.f28003a = i;
            this.f28004b = executor;
            this.f28005c = c47885r90;
            this.f28007e = z;
            this.f28006d = c52640zA3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ ListenableFuture m90660j(int i, TotalCaptureResult totalCaptureResult) throws Exception {
            if (P90.m90678b(i, totalCaptureResult)) {
                m90655o(f28002j);
            }
            return this.f28010h.mo90648a(totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ ListenableFuture m90658l(Boolean bool) throws Exception {
            if (Boolean.TRUE.equals(bool)) {
                return P90.m90674f(this.f28008f, this.f28005c, new C6285e.InterfaceC6286a() { // from class: V90
                    @Override // p000.P90.C6285e.InterfaceC6286a
                    /* renamed from: a */
                    public final boolean mo64350a(TotalCaptureResult totalCaptureResult) {
                        boolean m90679a;
                        m90679a = P90.m90679a(totalCaptureResult, false);
                        return m90679a;
                    }
                });
            }
            return IA1.m102836h(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ ListenableFuture m90657m(List list, int i, TotalCaptureResult totalCaptureResult) throws Exception {
            return m90654p(list, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ Object m90656n(C11192d.C11193a c11193a, O80.C5832a c5832a) throws Exception {
            c11193a.m69441c(new C6283b(c5832a));
            return "submitStillCapture";
        }

        /* renamed from: f */
        public void m90664f(InterfaceC6284d interfaceC6284d) {
            this.f28009g.add(interfaceC6284d);
        }

        /* renamed from: g */
        public final void m90663g(C11192d.C11193a c11193a) {
            C43385ja0.C24930a c24930a = new C43385ja0.C24930a();
            c24930a.m30298e(CaptureRequest.CONTROL_AE_MODE, 3);
            c11193a.m69439e(c24930a.m30300a());
        }

        /* renamed from: h */
        public final void m90662h(C11192d.C11193a c11193a, C11192d c11192d) {
            int i;
            if (this.f28003a == 3 && !this.f28007e) {
                i = 4;
            } else if (c11192d.m69445h() != -1 && c11192d.m69445h() != 5) {
                i = -1;
            } else {
                i = 2;
            }
            if (i != -1) {
                c11193a.m69425s(i);
            }
        }

        /* renamed from: i */
        public ListenableFuture<List<Void>> m90661i(final List<C11192d> list, final int i) {
            ListenableFuture<TotalCaptureResult> m102836h;
            ListenableFuture m102836h2 = IA1.m102836h(null);
            if (!this.f28009g.isEmpty()) {
                if (this.f28010h.mo90647b()) {
                    m102836h = P90.m90674f(0L, this.f28005c, null);
                } else {
                    m102836h = IA1.m102836h(null);
                }
                m102836h2 = DA1.m110820a(m102836h).m110816e(new InterfaceC20537fp() { // from class: Q90
                    @Override // p000.InterfaceC20537fp
                    public final ListenableFuture apply(Object obj) {
                        ListenableFuture m90660j;
                        m90660j = P90.C6281c.this.m90660j(i, (TotalCaptureResult) obj);
                        return m90660j;
                    }
                }, this.f28004b).m110816e(new InterfaceC20537fp() { // from class: R90
                    @Override // p000.InterfaceC20537fp
                    public final ListenableFuture apply(Object obj) {
                        ListenableFuture m90658l;
                        m90658l = P90.C6281c.this.m90658l((Boolean) obj);
                        return m90658l;
                    }
                }, this.f28004b);
            }
            DA1 m110816e = DA1.m110820a(m102836h2).m110816e(new InterfaceC20537fp() { // from class: S90
                @Override // p000.InterfaceC20537fp
                public final ListenableFuture apply(Object obj) {
                    ListenableFuture m90657m;
                    m90657m = P90.C6281c.this.m90657m(list, i, (TotalCaptureResult) obj);
                    return m90657m;
                }
            }, this.f28004b);
            final InterfaceC6284d interfaceC6284d = this.f28010h;
            Objects.requireNonNull(interfaceC6284d);
            m110816e.addListener(new Runnable() { // from class: T90
                @Override // java.lang.Runnable
                public final void run() {
                    P90.InterfaceC6284d.this.mo90646c();
                }
            }, this.f28004b);
            return m110816e;
        }

        /* renamed from: o */
        public final void m90655o(long j) {
            this.f28008f = j;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[SYNTHETIC] */
        /* renamed from: p */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ListenableFuture<List<Void>> m90654p(List<C11192d> list, int i) {
            InterfaceC51685xa0 interfaceC51685xa0;
            boolean z;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C11192d c11192d : list) {
                final C11192d.C11193a m69433k = C11192d.C11193a.m69433k(c11192d);
                if (c11192d.m69445h() == 5 && !this.f28005c.m16421N().mo7012g() && !this.f28005c.m16421N().mo7017b()) {
                    InterfaceC11183i mo7014e = this.f28005c.m16421N().mo7014e();
                    if (mo7014e != null && this.f28005c.m16421N().mo7013f(mo7014e)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        interfaceC51685xa0 = C52871za0.m1085a(mo7014e.mo40428i1());
                        if (interfaceC51685xa0 == null) {
                            m69433k.m69428p(interfaceC51685xa0);
                        } else {
                            m90662h(m69433k, c11192d);
                        }
                        if (!this.f28006d.m1723c(i)) {
                            m90663g(m69433k);
                        }
                        arrayList.add(O80.m92864a(new O80.InterfaceC5834c() { // from class: U90
                            @Override // p000.O80.InterfaceC5834c
                            /* renamed from: a */
                            public final Object mo3207a(O80.C5832a c5832a) {
                                Object m90656n;
                                m90656n = P90.C6281c.this.m90656n(m69433k, c5832a);
                                return m90656n;
                            }
                        }));
                        arrayList2.add(m69433k.m69436h());
                    }
                }
                interfaceC51685xa0 = null;
                if (interfaceC51685xa0 == null) {
                }
                if (!this.f28006d.m1723c(i)) {
                }
                arrayList.add(O80.m92864a(new O80.InterfaceC5834c() { // from class: U90
                    @Override // p000.O80.InterfaceC5834c
                    /* renamed from: a */
                    public final Object mo3207a(O80.C5832a c5832a) {
                        Object m90656n;
                        m90656n = P90.C6281c.this.m90656n(m69433k, c5832a);
                        return m90656n;
                    }
                }));
                arrayList2.add(m69433k.m69436h());
            }
            this.f28005c.m16387k0(arrayList2);
            return IA1.m102841c(arrayList);
        }
    }

    /* renamed from: P90$d */
    /* loaded from: classes.dex */
    public interface InterfaceC6284d {
        /* renamed from: a */
        ListenableFuture<Boolean> mo90648a(TotalCaptureResult totalCaptureResult);

        /* renamed from: b */
        boolean mo90647b();

        /* renamed from: c */
        void mo90646c();
    }

    /* renamed from: P90$e */
    /* loaded from: classes.dex */
    public static class C6285e implements C47885r90.InterfaceC27858c {

        /* renamed from: a */
        public O80.C5832a<TotalCaptureResult> f28014a;

        /* renamed from: c */
        public final long f28016c;

        /* renamed from: d */
        public final InterfaceC6286a f28017d;

        /* renamed from: b */
        public final ListenableFuture<TotalCaptureResult> f28015b = O80.m92864a(new O80.InterfaceC5834c() { // from class: X90
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m90649d;
                m90649d = P90.C6285e.this.m90649d(c5832a);
                return m90649d;
            }
        });

        /* renamed from: e */
        public volatile Long f28018e = null;

        /* renamed from: P90$e$a */
        /* loaded from: classes.dex */
        public interface InterfaceC6286a {
            /* renamed from: a */
            boolean mo64350a(TotalCaptureResult totalCaptureResult);
        }

        public C6285e(long j, InterfaceC6286a interfaceC6286a) {
            this.f28016c = j;
            this.f28017d = interfaceC6286a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ Object m90649d(O80.C5832a c5832a) throws Exception {
            this.f28014a = c5832a;
            return "waitFor3AResult";
        }

        @Override // p000.C47885r90.InterfaceC27858c
        /* renamed from: a */
        public boolean mo16353a(TotalCaptureResult totalCaptureResult) {
            Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l != null && this.f28018e == null) {
                this.f28018e = l;
            }
            Long l2 = this.f28018e;
            if (0 != this.f28016c && l2 != null && l != null && l.longValue() - l2.longValue() > this.f28016c) {
                this.f28014a.m92861c(null);
                C33928Jx2.m99533a("Camera2CapturePipeline", "Wait for capture result timeout, current:" + l + " first: " + l2);
                return true;
            }
            InterfaceC6286a interfaceC6286a = this.f28017d;
            if (interfaceC6286a != null && !interfaceC6286a.mo64350a(totalCaptureResult)) {
                return false;
            }
            this.f28014a.m92861c(totalCaptureResult);
            return true;
        }

        /* renamed from: c */
        public ListenableFuture<TotalCaptureResult> m90650c() {
            return this.f28015b;
        }
    }

    /* renamed from: P90$f */
    /* loaded from: classes.dex */
    public static class C6287f implements InterfaceC6284d {

        /* renamed from: e */
        public static final long f28019e = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: a */
        public final C47885r90 f28020a;

        /* renamed from: b */
        public final int f28021b;

        /* renamed from: c */
        public boolean f28022c = false;

        /* renamed from: d */
        public final Executor f28023d;

        public C6287f(C47885r90 c47885r90, int i, Executor executor) {
            this.f28020a = c47885r90;
            this.f28021b = i;
            this.f28023d = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ Object m90641h(O80.C5832a c5832a) throws Exception {
            this.f28020a.m16424K().m81984g(c5832a, true);
            return "TorchOn";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ ListenableFuture m90639j(Void r4) throws Exception {
            return P90.m90674f(f28019e, this.f28020a, new C6285e.InterfaceC6286a() { // from class: ba0
                @Override // p000.P90.C6285e.InterfaceC6286a
                /* renamed from: a */
                public final boolean mo64350a(TotalCaptureResult totalCaptureResult) {
                    boolean m90679a;
                    m90679a = P90.m90679a(totalCaptureResult, true);
                    return m90679a;
                }
            });
        }

        @Override // p000.P90.InterfaceC6284d
        /* renamed from: a */
        public ListenableFuture<Boolean> mo90648a(TotalCaptureResult totalCaptureResult) {
            if (P90.m90678b(this.f28021b, totalCaptureResult)) {
                if (this.f28020a.m16416S()) {
                    C33928Jx2.m99533a("Camera2CapturePipeline", "Torch already on, not turn on");
                } else {
                    C33928Jx2.m99533a("Camera2CapturePipeline", "Turn on torch");
                    this.f28022c = true;
                    return DA1.m110820a(O80.m92864a(new O80.InterfaceC5834c() { // from class: Y90
                        @Override // p000.O80.InterfaceC5834c
                        /* renamed from: a */
                        public final Object mo3207a(O80.C5832a c5832a) {
                            Object m90641h;
                            m90641h = P90.C6287f.this.m90641h(c5832a);
                            return m90641h;
                        }
                    })).m110816e(new InterfaceC20537fp() { // from class: Z90
                        @Override // p000.InterfaceC20537fp
                        public final ListenableFuture apply(Object obj) {
                            ListenableFuture m90639j;
                            m90639j = P90.C6287f.this.m90639j((Void) obj);
                            return m90639j;
                        }
                    }, this.f28023d).m110817d(new InterfaceC51452xA1() { // from class: aa0
                        @Override // p000.InterfaceC51452xA1
                        public final Object apply(Object obj) {
                            Boolean bool;
                            TotalCaptureResult totalCaptureResult2 = (TotalCaptureResult) obj;
                            bool = Boolean.FALSE;
                            return bool;
                        }
                    }, C31631Ac0.m115449a());
                }
            }
            return IA1.m102836h(Boolean.FALSE);
        }

        @Override // p000.P90.InterfaceC6284d
        /* renamed from: b */
        public boolean mo90647b() {
            return this.f28021b == 0;
        }

        @Override // p000.P90.InterfaceC6284d
        /* renamed from: c */
        public void mo90646c() {
            if (this.f28022c) {
                this.f28020a.m16424K().m81984g(null, false);
                C33928Jx2.m99533a("Camera2CapturePipeline", "Turn off torch");
            }
        }
    }

    static {
        EnumC48721sa0 enumC48721sa0 = EnumC48721sa0.CONVERGED;
        EnumC48721sa0 enumC48721sa02 = EnumC48721sa0.FLASH_REQUIRED;
        EnumC48721sa0 enumC48721sa03 = EnumC48721sa0.UNKNOWN;
        Set<EnumC48721sa0> unmodifiableSet = Collections.unmodifiableSet(EnumSet.of(enumC48721sa0, enumC48721sa02, enumC48721sa03));
        f27986j = unmodifiableSet;
        EnumSet copyOf = EnumSet.copyOf((Collection) unmodifiableSet);
        copyOf.remove(enumC48721sa02);
        copyOf.remove(enumC48721sa03);
        f27987k = Collections.unmodifiableSet(copyOf);
    }

    public P90(C47885r90 c47885r90, C36761Wa0 c36761Wa0, C36099Te4 c36099Te4, Executor executor) {
        boolean z = true;
        this.f27988a = c47885r90;
        Integer num = (Integer) c36761Wa0.m78176a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f27993f = (num == null || num.intValue() != 2) ? false : false;
        this.f27992e = executor;
        this.f27991d = c36099Te4;
        this.f27989b = new C37514Zf6(c36099Te4);
        this.f27990c = C46491oo1.m20482a(new M90(c36761Wa0));
    }

    /* renamed from: a */
    public static boolean m90679a(TotalCaptureResult totalCaptureResult, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (totalCaptureResult == null) {
            return false;
        }
        V80 v80 = new V80(totalCaptureResult);
        if (v80.m80323h() != EnumC49314ta0.OFF && v80.m80323h() != EnumC49314ta0.UNKNOWN && !f27984h.contains(v80.mo2303c())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z ? !(z3 || f27986j.contains(v80.mo2301e())) : !(z3 || f27987k.contains(v80.mo2301e()))) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_MODE)).intValue() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5 && !f27985i.contains(v80.mo2302d())) {
            z6 = false;
        } else {
            z6 = true;
        }
        C33928Jx2.m99533a("Camera2CapturePipeline", "checkCaptureResult, AE=" + v80.mo2301e() + " AF =" + v80.mo2303c() + " AWB=" + v80.mo2302d());
        if (!z2 || !z4 || !z6) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m90678b(int i, TotalCaptureResult totalCaptureResult) {
        Integer num;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw new AssertionError(i);
        }
        if (totalCaptureResult != null) {
            num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        } else {
            num = null;
        }
        if (num == null || num.intValue() != 4) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static ListenableFuture<TotalCaptureResult> m90674f(long j, C47885r90 c47885r90, C6285e.InterfaceC6286a interfaceC6286a) {
        C6285e c6285e = new C6285e(j, interfaceC6286a);
        c47885r90.m16372v(c6285e);
        return c6285e.m90650c();
    }

    /* renamed from: c */
    public final boolean m90677c(int i) {
        return this.f27989b.m72785a() || this.f27994g == 3 || i == 1;
    }

    /* renamed from: d */
    public void m90676d(int i) {
        this.f27994g = i;
    }

    /* renamed from: e */
    public ListenableFuture<List<Void>> m90675e(List<C11192d> list, int i, int i2, int i3) {
        C52640zA3 c52640zA3 = new C52640zA3(this.f27991d);
        C6281c c6281c = new C6281c(this.f27994g, this.f27992e, this.f27988a, this.f27993f, c52640zA3);
        if (i == 0) {
            c6281c.m90664f(new C6280b(this.f27988a));
        }
        if (this.f27990c) {
            if (m90677c(i3)) {
                c6281c.m90664f(new C6287f(this.f27988a, i2, this.f27992e));
            } else {
                c6281c.m90664f(new C6279a(this.f27988a, i2, c52640zA3));
            }
        }
        return IA1.m102834j(c6281c.m90661i(list, i2));
    }
}
