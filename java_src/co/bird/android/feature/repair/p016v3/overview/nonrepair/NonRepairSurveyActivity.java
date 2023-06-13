package co.bird.android.feature.repair.p016v3.overview.nonrepair;

import android.app.Application;
import android.os.Bundle;
import android.widget.Button;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.buava.Optional;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.repair.p016v3.overview.nonrepair.InterfaceC15243b;
import co.bird.android.model.NonRepair;
import co.bird.android.model.NonRepairReason;
import co.bird.android.model.RepairCategory;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b7\u00108J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\nH\u0016J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00130\nH\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010.\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010\u000b0\u000b0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00100\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010\r0\r0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\"\u00102\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010\u000f0\u000f0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010-R\"\u00104\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010\u00110\u00110*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010-R.\u00106\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 +*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00130\u00130*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010-¨\u00069"}, m28432d2 = {"Lco/bird/android/feature/repair/v3/overview/nonrepair/NonRepairSurveyActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LE93;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LF93;", TransferTable.COLUMN_STATE, "Q", "Lio/reactivex/Observable;", "", "d9", "Lco/bird/android/model/RepairCategory;", "f5", "Lco/bird/android/model/NonRepair;", "h2", "Lco/bird/android/model/NonRepairReason;", "s", "Lco/bird/android/buava/Optional;", "d3", "c", "LD93;", "j", "LD93;", "P", "()LD93;", "setPresenter", "(LD93;)V", "presenter", "Lr4;", "k", "Lr4;", "binding", "Lw93;", "l", "Lw93;", "converter", "Lu93;", "m", "Lu93;", "adapter", "Lma4;", "kotlin.jvm.PlatformType", "n", "Lma4;", "vehicleIdRelay", "o", "repairCategoryRelay", "p", "nonRepairRelay", "q", "reasonSelectsRelay", "r", "subreasonSelectsRelay", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNonRepairSurveyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonRepairSurveyActivity.kt\nco/bird/android/feature/repair/v3/overview/nonrepair/NonRepairSurveyActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n1#2:108\n288#3:109\n1747#3,3:110\n289#3:113\n288#3,2:114\n*S KotlinDebug\n*F\n+ 1 NonRepairSurveyActivity.kt\nco/bird/android/feature/repair/v3/overview/nonrepair/NonRepairSurveyActivity\n*L\n64#1:109\n65#1:110,3\n64#1:113\n69#1:114,2\n*E\n"})
/* renamed from: co.bird.android.feature.repair.v3.overview.nonrepair.NonRepairSurveyActivity */
/* loaded from: classes3.dex */
public final class NonRepairSurveyActivity extends BaseActivityLite implements E93 {

    /* renamed from: j */
    public D93 f64673j;

    /* renamed from: k */
    public C27841r4 f64674k;

    /* renamed from: l */
    public final C50851w93 f64675l = new C50851w93();

    /* renamed from: m */
    public final C49666u93 f64676m = new C49666u93();

    /* renamed from: n */
    public final C45168ma4<String> f64677n;

    /* renamed from: o */
    public final C45168ma4<RepairCategory> f64678o;

    /* renamed from: p */
    public final C45168ma4<NonRepair> f64679p;

    /* renamed from: q */
    public final C45168ma4<NonRepairReason> f64680q;

    /* renamed from: r */
    public final C45168ma4<Optional<NonRepairReason>> f64681r;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.repair.v3.overview.nonrepair.NonRepairSurveyActivity$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15238a extends FunctionReferenceImpl implements Function1<NonRepairReason, Unit> {
        public C15238a(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m57502a(NonRepairReason p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NonRepairReason nonRepairReason) {
            m57502a(nonRepairReason);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.repair.v3.overview.nonrepair.NonRepairSurveyActivity$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15239b extends FunctionReferenceImpl implements Function1<Optional<NonRepairReason>, Unit> {
        public C15239b(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<NonRepairReason> optional) {
            invoke2(optional);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Optional<NonRepairReason> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }
    }

    public NonRepairSurveyActivity() {
        C45168ma4<String> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<String>()");
        this.f64677n = m25409g;
        C45168ma4<RepairCategory> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<RepairCategory>()");
        this.f64678o = m25409g2;
        C45168ma4<NonRepair> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create<NonRepair>()");
        this.f64679p = m25409g3;
        C45168ma4<NonRepairReason> m25409g4 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g4, "create<NonRepairReason>()");
        this.f64680q = m25409g4;
        C45168ma4<Optional<NonRepairReason>> m25409g5 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g5, "create<Optional<NonRepairReason>>()");
        this.f64681r = m25409g5;
    }

    /* renamed from: P */
    public final D93 m57510P() {
        D93 d93 = this.f64673j;
        if (d93 != null) {
            return d93;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: Q */
    public void render(F93 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        NonRepair m107555b = state.m107555b();
        if (m107555b != null) {
            this.f64676m.mo24871u(this.f64675l.m7350a(m107555b, state.m107554c(), state.m107553d()));
        }
        C27841r4 c27841r4 = this.f64674k;
        if (c27841r4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c27841r4 = null;
        }
        c27841r4.f106371d.setEnabled(state.m107552e());
    }

    @Override // p000.E93
    /* renamed from: c */
    public Observable<Unit> mo57508c() {
        C27841r4 c27841r4 = this.f64674k;
        if (c27841r4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c27841r4 = null;
        }
        Button button = c27841r4.f106371d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.submit");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.E93
    /* renamed from: d3 */
    public Observable<Optional<NonRepairReason>> mo57507d3() {
        Observable<Optional<NonRepairReason>> hide = this.f64681r.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "subreasonSelectsRelay.hide()");
        return hide;
    }

    @Override // p000.E93
    /* renamed from: d9 */
    public Observable<String> mo57506d9() {
        Observable<String> hide = this.f64677n.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "vehicleIdRelay.hide()");
        return hide;
    }

    @Override // p000.E93
    /* renamed from: f5 */
    public Observable<RepairCategory> mo57505f5() {
        Observable<RepairCategory> hide = this.f64678o.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "repairCategoryRelay.hide()");
        return hide;
    }

    @Override // p000.E93
    /* renamed from: h2 */
    public Observable<NonRepair> mo57504h2() {
        Observable<NonRepair> hide = this.f64679p.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "nonRepairRelay.hide()");
        return hide;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012e A[EDGE_INSN: B:73:0x012e->B:58:0x012e ?: BREAK  , SYNTHETIC] */
    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle bundle) {
        boolean z;
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        super.onCreate(bundle);
        C27841r4 m16547c = C27841r4.m16547c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m16547c, "inflate(layoutInflater)");
        this.f64674k = m16547c;
        Object obj2 = null;
        if (m16547c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m16547c = null;
        }
        setContentView(m16547c.getRoot());
        InterfaceC15243b.InterfaceC15244a m57501a = C15240a.m57501a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m57501a.mo57497a(c46172oG2.m21419a(application)).mo57498a(this);
        C27841r4 c27841r4 = this.f64674k;
        if (c27841r4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c27841r4 = null;
        }
        c27841r4.f106370c.setLayoutManager(new LinearLayoutManager(this));
        C27841r4 c27841r42 = this.f64674k;
        if (c27841r42 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c27841r42 = null;
        }
        c27841r42.f106370c.setAdapter(this.f64676m);
        C27841r4 c27841r43 = this.f64674k;
        if (c27841r43 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c27841r43 = null;
        }
        c27841r43.f106370c.setItemAnimator(new C11894g());
        this.f64676m.m10777v(new C15238a(this.f64680q));
        this.f64676m.m10776w(new C15239b(this.f64681r));
        m57510P().consume(this);
        String stringExtra = getIntent().getStringExtra("bird_id");
        if (stringExtra != null) {
            this.f64677n.accept(stringExtra);
        }
        RepairCategory repairCategory = (RepairCategory) getIntent().getParcelableExtra("repair_category");
        if (repairCategory != null) {
            this.f64678o.accept(repairCategory);
        }
        NonRepair nonRepair = (NonRepair) getIntent().getParcelableExtra("non_repair");
        if (nonRepair != null) {
            this.f64679p.accept(nonRepair);
        }
        if (nonRepair != null && H93.m104262a(nonRepair)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Iterator<T> it = nonRepair.getReasons().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    NonRepairReason nonRepairReason = (NonRepairReason) obj;
                    if (!nonRepairReason.getSelected()) {
                        List<NonRepairReason> subreasons = nonRepairReason.getSubreasons();
                        if (subreasons != null) {
                            List<NonRepairReason> list = subreasons;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                for (NonRepairReason nonRepairReason2 : list) {
                                    if (nonRepairReason2.getSelected()) {
                                        z4 = true;
                                        break;
                                    }
                                }
                            }
                            z4 = false;
                            if (z4) {
                                z3 = true;
                                if (!z3) {
                                    z2 = false;
                                    continue;
                                    if (z2) {
                                        break;
                                    }
                                }
                            }
                        }
                        z3 = false;
                        if (!z3) {
                        }
                    }
                    z2 = true;
                    continue;
                    if (z2) {
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            NonRepairReason nonRepairReason3 = (NonRepairReason) obj;
            if (nonRepairReason3 != null) {
                this.f64680q.accept(nonRepairReason3);
                List<NonRepairReason> subreasons2 = nonRepairReason3.getSubreasons();
                if (subreasons2 != null) {
                    Iterator<T> it2 = subreasons2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((NonRepairReason) next).getSelected()) {
                            obj2 = next;
                            break;
                        }
                    }
                    NonRepairReason nonRepairReason4 = (NonRepairReason) obj2;
                    if (nonRepairReason4 != null) {
                        this.f64681r.accept(new Optional<>(nonRepairReason4));
                    }
                }
            }
        }
    }

    @Override // p000.E93
    /* renamed from: s */
    public Observable<NonRepairReason> mo57503s() {
        Observable<NonRepairReason> hide = this.f64680q.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "reasonSelectsRelay.hide()");
        return hide;
    }
}
