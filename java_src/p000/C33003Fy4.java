package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.LegacyRepair;
import co.bird.android.model.RepairSource;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b+\u0010,J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J$\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001bR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, m28432d2 = {"LFy4;", "LCy4;", "", "birdId", "workOrderId", "", "numOpenIssues", "Lco/bird/android/model/RepairSource;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lio/reactivex/c;", "b", "", "Lco/bird/android/model/LegacyRepair;", "repairs", "Lco/bird/android/model/Issue;", "issues", "", "c", "", "repairsFinished", C17296a.f69688o, "LEa;", "LEa;", "analyticsManager", "LaG6;", "LaG6;", "workOrderManager", "Ljava/lang/String;", "apiSessionId", DateTokenConverter.CONVERTER_KEY, "sessionId", "e", "f", "Ljava/util/concurrent/atomic/AtomicInteger;", "g", "Ljava/util/concurrent/atomic/AtomicInteger;", "repairCount", "Ljava/util/concurrent/CopyOnWriteArrayList;", "h", "Ljava/util/concurrent/CopyOnWriteArrayList;", "updatedIssues", "i", "Lco/bird/android/model/RepairSource;", "<init>", "(LEa;LaG6;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairAnalyticsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairAnalyticsManager.kt\nco/bird/android/feature/repair/analytics/RepairAnalyticsManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n1774#2,4:124\n1774#2,4:128\n*S KotlinDebug\n*F\n+ 1 RepairAnalyticsManager.kt\nco/bird/android/feature/repair/analytics/RepairAnalyticsManagerImpl\n*L\n98#1:124,4\n99#1:128,4\n*E\n"})
/* renamed from: Fy4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33003Fy4 implements InterfaceC32301Cy4 {

    /* renamed from: a */
    public final InterfaceC1880Ea f10646a;

    /* renamed from: b */
    public final InterfaceC37857aG6 f10647b;

    /* renamed from: c */
    public String f10648c;

    /* renamed from: d */
    public String f10649d;

    /* renamed from: e */
    public String f10650e;

    /* renamed from: f */
    public String f10651f;

    /* renamed from: g */
    public AtomicInteger f10652g;

    /* renamed from: h */
    public final CopyOnWriteArrayList<Issue> f10653h;

    /* renamed from: i */
    public RepairSource f10654i;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "updatedIssue", "", C17296a.f69688o, "(Lco/bird/android/model/Issue;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairAnalyticsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairAnalyticsManager.kt\nco/bird/android/feature/repair/analytics/RepairAnalyticsManagerImpl$logRepairs$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n2624#2,3:124\n*S KotlinDebug\n*F\n+ 1 RepairAnalyticsManager.kt\nco/bird/android/feature/repair/analytics/RepairAnalyticsManagerImpl$logRepairs$1\n*L\n76#1:124,3\n*E\n"})
    /* renamed from: Fy4$a */
    /* loaded from: classes3.dex */
    public static final class C2545a extends Lambda implements Function1<Issue, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ List<Issue> f10655g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2545a(List<Issue> list) {
            super(1);
            this.f10655g = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Issue issue) {
            List<Issue> list = this.f10655g;
            boolean z = true;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (Intrinsics.areEqual(((Issue) it.next()).getIssueTypeId(), issue.getIssueTypeId())) {
                        z = false;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "apiSessionId", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fy4$b */
    /* loaded from: classes3.dex */
    public static final class C2546b extends Lambda implements Function1<String, Unit> {
        public C2546b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C33003Fy4.this.f10648c = str;
        }
    }

    public C33003Fy4(InterfaceC1880Ea analyticsManager, InterfaceC37857aG6 workOrderManager) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(workOrderManager, "workOrderManager");
        this.f10646a = analyticsManager;
        this.f10647b = workOrderManager;
        this.f10652g = new AtomicInteger(0);
        this.f10653h = new CopyOnWriteArrayList<>();
    }

    /* renamed from: f */
    public static final void m106115f(C33003Fy4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f10649d = null;
        this$0.f10648c = null;
        this$0.f10650e = null;
        this$0.f10651f = null;
        this$0.f10652g.set(0);
        this$0.f10653h.clear();
    }

    /* renamed from: g */
    public static final void m106114g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC32301Cy4
    /* renamed from: a */
    public AbstractC23461c mo106120a(boolean z) {
        boolean z2;
        int i;
        boolean z3;
        int i2;
        boolean z4;
        AbstractC23461c m33039p;
        String str = this.f10649d;
        String str2 = this.f10648c;
        String str3 = this.f10650e;
        String str4 = this.f10651f;
        RepairSource repairSource = this.f10654i;
        if (str != null && str2 != null && str3 != null && str4 != null && repairSource != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            InterfaceC1880Ea interfaceC1880Ea = this.f10646a;
            CopyOnWriteArrayList<Issue> copyOnWriteArrayList = this.f10653h;
            if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
                i = 0;
            } else {
                int i3 = 0;
                for (Issue issue : copyOnWriteArrayList) {
                    if (issue.getStatus() == IssueStatus.RESOLVED) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3 && (i3 = i3 + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
                i = i3;
            }
            CopyOnWriteArrayList<Issue> copyOnWriteArrayList2 = this.f10653h;
            if ((copyOnWriteArrayList2 instanceof Collection) && copyOnWriteArrayList2.isEmpty()) {
                i2 = 0;
            } else {
                int i4 = 0;
                for (Issue issue2 : copyOnWriteArrayList2) {
                    if (issue2.getStatus() == IssueStatus.DISPUTED) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4 && (i4 = i4 + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
                i2 = i4;
            }
            interfaceC1880Ea.mo55905y(new C34407Ly4(null, str3, str, null, null, str4, i, i2, this.f10652g.get(), 25, null));
            if (z) {
                m33039p = this.f10647b.mo19640m(str2, str4, repairSource);
            } else {
                m33039p = AbstractC23461c.m33039p();
            }
            AbstractC23461c m33029z = m33039p.m33029z(new InterfaceC23478a() { // from class: Dy4
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C33003Fy4.m106115f(C33003Fy4.this);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33029z, "if (repairsFinished) {\n …tedIssues.clear()\n      }");
            return m33029z;
        }
        throw new IllegalArgumentException("Cannot complete a session without starting one first".toString());
    }

    @Override // p000.InterfaceC32301Cy4
    /* renamed from: b */
    public AbstractC23461c mo106119b(String birdId, String workOrderId, int i, RepairSource source) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        Intrinsics.checkNotNullParameter(source, "source");
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f10649d = uuid;
        this.f10650e = birdId;
        this.f10651f = workOrderId;
        this.f10654i = source;
        this.f10648c = null;
        this.f10652g.set(0);
        this.f10653h.clear();
        this.f10646a.mo55905y(new C47333qD4(null, birdId, uuid, null, null, workOrderId, Integer.valueOf(i), 25, null));
        AbstractC23442F m70883l = C38096ag5.m70883l(this.f10647b.mo19639n(DateTime.now(), workOrderId, source));
        final C2546b c2546b = new C2546b();
        AbstractC23461c m33159G = m70883l.m33101w(new InterfaceC23484g() { // from class: Ey4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33003Fy4.m106114g(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "override fun repairStart…     .ignoreElement()\n  }");
        return m33159G;
    }

    @Override // p000.InterfaceC32301Cy4
    /* renamed from: c */
    public void mo106118c(List<LegacyRepair> repairs, List<Issue> issues) {
        Intrinsics.checkNotNullParameter(repairs, "repairs");
        Intrinsics.checkNotNullParameter(issues, "issues");
        this.f10652g.getAndAdd(repairs.size());
        CollectionsKt__MutableCollectionsKt.removeAll((List) this.f10653h, (Function1) new C2545a(issues));
        this.f10653h.addAll(issues);
    }
}
