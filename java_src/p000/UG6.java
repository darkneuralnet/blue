package p000;

import androidx.work.C12120a;
import androidx.work.impl.WorkDatabase;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import net.danlew.android.joda.DateUtils;
import p000.HG6;
import p000.InterfaceC37061Xh3;
import p000.UC6;
import p000.ZC6;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001aD\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002\u001a\u001c\u0010\u0015\u001a\u00020\u0014*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007\u001a\u0014\u0010\u0019\u001a\u00020\u0018*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0002¨\u0006\u001a"}, m28432d2 = {"Li74;", "processor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/a;", "configuration", "", "Lxm5;", "schedulers", "LHG6;", "newWorkSpec", "", "", "tags", "LZC6$a;", "f", "LaD6;", "name", "LEG6;", "workRequest", "LXh3;", "c", "Lai3;", "message", "", "e", "work-runtime_release"}, m28431k = 2, m28430mv = {1, 7, 1})
@JvmName(name = "WorkerUpdater")
/* renamed from: UG6 */
/* loaded from: classes.dex */
public final class UG6 {

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: UG6$a */
    /* loaded from: classes.dex */
    public static final class C8247a extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ EG6 f37160g;

        /* renamed from: h */
        public final /* synthetic */ C37830aD6 f37161h;

        /* renamed from: i */
        public final /* synthetic */ String f37162i;

        /* renamed from: j */
        public final /* synthetic */ C38114ai3 f37163j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8247a(EG6 eg6, C37830aD6 c37830aD6, String str, C38114ai3 c38114ai3) {
            super(0);
            this.f37160g = eg6;
            this.f37161h = c37830aD6;
            this.f37162i = str;
            this.f37163j = c38114ai3;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            List listOf;
            listOf = CollectionsKt__CollectionsJVMKt.listOf(this.f37160g);
            new RunnableC34683Nd1(new JC6(this.f37161h, this.f37162i, EnumC41094fi1.KEEP, listOf), this.f37163j).run();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LHG6;", "spec", "", C17296a.f69688o, "(LHG6;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: UG6$b */
    /* loaded from: classes.dex */
    public static final class C8248b extends Lambda implements Function1<HG6, String> {

        /* renamed from: g */
        public static final C8248b f37164g = new C8248b();

        public C8248b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(HG6 spec) {
            Intrinsics.checkNotNullParameter(spec, "spec");
            if (spec.m104069j()) {
                return "Periodic";
            }
            return "OneTime";
        }
    }

    /* renamed from: c */
    public static final InterfaceC37061Xh3 m81762c(final C37830aD6 c37830aD6, final String name, final EG6 workRequest) {
        Intrinsics.checkNotNullParameter(c37830aD6, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workRequest, "workRequest");
        final C38114ai3 c38114ai3 = new C38114ai3();
        final C8247a c8247a = new C8247a(workRequest, c37830aD6, name, c38114ai3);
        c37830aD6.m71755v().mo25425c().execute(new Runnable() { // from class: SG6
            @Override // java.lang.Runnable
            public final void run() {
                UG6.m81761d(C37830aD6.this, name, c38114ai3, c8247a, workRequest);
            }
        });
        return c38114ai3;
    }

    /* renamed from: d */
    public static final void m81761d(C37830aD6 this_enqueueUniquelyNamedPeriodic, String name, C38114ai3 operation, Function0 enqueueNew, EG6 workRequest) {
        Object firstOrNull;
        HG6 m104075d;
        Intrinsics.checkNotNullParameter(this_enqueueUniquelyNamedPeriodic, "$this_enqueueUniquelyNamedPeriodic");
        Intrinsics.checkNotNullParameter(name, "$name");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        Intrinsics.checkNotNullParameter(enqueueNew, "$enqueueNew");
        Intrinsics.checkNotNullParameter(workRequest, "$workRequest");
        IG6 mo65549I = this_enqueueUniquelyNamedPeriodic.m71756u().mo65549I();
        List<HG6.C3120b> mo100752p = mo65549I.mo100752p(name);
        if (mo100752p.size() <= 1) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) mo100752p);
            HG6.C3120b c3120b = (HG6.C3120b) firstOrNull;
            if (c3120b == null) {
                enqueueNew.invoke();
                return;
            }
            HG6 mo100756l = mo65549I.mo100756l(c3120b.f13211a);
            if (mo100756l == null) {
                operation.m70830a(new InterfaceC37061Xh3.AbstractC9449b.C9450a(new IllegalStateException("WorkSpec with " + c3120b.f13211a + ", that matches a name \"" + name + "\", wasn't found")));
                return;
            } else if (!mo100756l.m104069j()) {
                m81760e(operation, "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                return;
            } else if (c3120b.f13212b == UC6.EnumC8214a.CANCELLED) {
                mo65549I.delete(c3120b.f13211a);
                enqueueNew.invoke();
                return;
            } else {
                m104075d = r7.m104075d((r45 & 1) != 0 ? r7.f13191a : c3120b.f13211a, (r45 & 2) != 0 ? r7.f13192b : null, (r45 & 4) != 0 ? r7.f13193c : null, (r45 & 8) != 0 ? r7.f13194d : null, (r45 & 16) != 0 ? r7.f13195e : null, (r45 & 32) != 0 ? r7.f13196f : null, (r45 & 64) != 0 ? r7.f13197g : 0L, (r45 & 128) != 0 ? r7.f13198h : 0L, (r45 & 256) != 0 ? r7.f13199i : 0L, (r45 & 512) != 0 ? r7.f13200j : null, (r45 & 1024) != 0 ? r7.f13201k : 0, (r45 & 2048) != 0 ? r7.f13202l : null, (r45 & 4096) != 0 ? r7.f13203m : 0L, (r45 & 8192) != 0 ? r7.f13204n : 0L, (r45 & 16384) != 0 ? r7.f13205o : 0L, (r45 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r7.f13206p : 0L, (r45 & 65536) != 0 ? r7.f13207q : false, (131072 & r45) != 0 ? r7.f13208r : null, (r45 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r7.f13209s : 0, (r45 & 524288) != 0 ? workRequest.m109258d().f13210t : 0);
                try {
                    C42532i74 processor = this_enqueueUniquelyNamedPeriodic.m71759r();
                    Intrinsics.checkNotNullExpressionValue(processor, "processor");
                    WorkDatabase workDatabase = this_enqueueUniquelyNamedPeriodic.m71756u();
                    Intrinsics.checkNotNullExpressionValue(workDatabase, "workDatabase");
                    C12120a configuration = this_enqueueUniquelyNamedPeriodic.m71763n();
                    Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
                    List<InterfaceC51810xm5> schedulers = this_enqueueUniquelyNamedPeriodic.m71758s();
                    Intrinsics.checkNotNullExpressionValue(schedulers, "schedulers");
                    m81759f(processor, workDatabase, configuration, schedulers, m104075d, workRequest.m109259c());
                    operation.m70830a(InterfaceC37061Xh3.f43681a);
                    return;
                } catch (Throwable th) {
                    operation.m70830a(new InterfaceC37061Xh3.AbstractC9449b.C9450a(th));
                    return;
                }
            }
        }
        m81760e(operation, "Can't apply UPDATE policy to the chains of work.");
    }

    /* renamed from: e */
    public static final void m81760e(C38114ai3 c38114ai3, String str) {
        c38114ai3.m70830a(new InterfaceC37061Xh3.AbstractC9449b.C9450a(new UnsupportedOperationException(str)));
    }

    /* renamed from: f */
    public static final ZC6.EnumC10128a m81759f(C42532i74 c42532i74, final WorkDatabase workDatabase, C12120a c12120a, final List<? extends InterfaceC51810xm5> list, final HG6 hg6, final Set<String> set) {
        final String str = hg6.f13191a;
        final HG6 mo100756l = workDatabase.mo65549I().mo100756l(str);
        if (mo100756l != null) {
            if (mo100756l.f13192b.m81823b()) {
                return ZC6.EnumC10128a.NOT_APPLIED;
            }
            if (!(mo100756l.m104069j() ^ hg6.m104069j())) {
                final boolean m34418k = c42532i74.m34418k(str);
                if (!m34418k) {
                    for (InterfaceC51810xm5 interfaceC51810xm5 : list) {
                        interfaceC51810xm5.mo4714e(str);
                    }
                }
                workDatabase.m108712z(new Runnable() { // from class: TG6
                    @Override // java.lang.Runnable
                    public final void run() {
                        UG6.m81758g(WorkDatabase.this, hg6, mo100756l, list, str, set, m34418k);
                    }
                });
                if (!m34418k) {
                    C32662Em5.m108385b(c12120a, workDatabase, list);
                }
                if (m34418k) {
                    return ZC6.EnumC10128a.APPLIED_FOR_NEXT_RUN;
                }
                return ZC6.EnumC10128a.APPLIED_IMMEDIATELY;
            }
            C8248b c8248b = C8248b.f37164g;
            throw new UnsupportedOperationException("Can't update " + c8248b.invoke(mo100756l) + " Worker to " + c8248b.invoke(hg6) + " Worker. Update operation must preserve worker's type.");
        }
        throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
    }

    /* renamed from: g */
    public static final void m81758g(WorkDatabase workDatabase, HG6 newWorkSpec, HG6 oldWorkSpec, List schedulers, String workSpecId, Set tags, boolean z) {
        HG6 m104075d;
        Intrinsics.checkNotNullParameter(workDatabase, "$workDatabase");
        Intrinsics.checkNotNullParameter(newWorkSpec, "$newWorkSpec");
        Intrinsics.checkNotNullParameter(oldWorkSpec, "$oldWorkSpec");
        Intrinsics.checkNotNullParameter(schedulers, "$schedulers");
        Intrinsics.checkNotNullParameter(workSpecId, "$workSpecId");
        Intrinsics.checkNotNullParameter(tags, "$tags");
        IG6 mo65549I = workDatabase.mo65549I();
        MG6 mo65548J = workDatabase.mo65548J();
        m104075d = newWorkSpec.m104075d((r45 & 1) != 0 ? newWorkSpec.f13191a : null, (r45 & 2) != 0 ? newWorkSpec.f13192b : oldWorkSpec.f13192b, (r45 & 4) != 0 ? newWorkSpec.f13193c : null, (r45 & 8) != 0 ? newWorkSpec.f13194d : null, (r45 & 16) != 0 ? newWorkSpec.f13195e : null, (r45 & 32) != 0 ? newWorkSpec.f13196f : null, (r45 & 64) != 0 ? newWorkSpec.f13197g : 0L, (r45 & 128) != 0 ? newWorkSpec.f13198h : 0L, (r45 & 256) != 0 ? newWorkSpec.f13199i : 0L, (r45 & 512) != 0 ? newWorkSpec.f13200j : null, (r45 & 1024) != 0 ? newWorkSpec.f13201k : oldWorkSpec.f13201k, (r45 & 2048) != 0 ? newWorkSpec.f13202l : null, (r45 & 4096) != 0 ? newWorkSpec.f13203m : 0L, (r45 & 8192) != 0 ? newWorkSpec.f13204n : oldWorkSpec.f13204n, (r45 & 16384) != 0 ? newWorkSpec.f13205o : 0L, (r45 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? newWorkSpec.f13206p : 0L, (r45 & 65536) != 0 ? newWorkSpec.f13207q : false, (131072 & r45) != 0 ? newWorkSpec.f13208r : null, (r45 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? newWorkSpec.f13209s : 0, (r45 & 524288) != 0 ? newWorkSpec.f13210t : oldWorkSpec.m104073f() + 1);
        mo65549I.mo100750r(C34917Od1.m91785b(schedulers, m104075d));
        mo65548J.mo94116a(workSpecId);
        mo65548J.mo94114c(workSpecId, tags);
        if (!z) {
            mo65549I.mo100753o(workSpecId, -1L);
            workDatabase.mo65550H().delete(workSpecId);
        }
    }
}
