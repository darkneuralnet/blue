package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001Bq\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00069"}, m28432d2 = {"LeI4;", "LcI4;", "Lio/reactivex/c;", C17296a.f69688o, "Ljg;", "Ljg;", "announcementRepo", "LOn;", "b", "LOn;", "areaRepo", "LRR;", "c", "LRR;", "birdRepo", "LGw0;", DateTokenConverter.CONVERTER_KEY, "LGw0;", "configurableTutorialRepo", "Ler1;", "e", "Ler1;", "fleetStatusRepo", "LQs1;", "f", "LQs1;", "flightSheetRepo", "LVL1;", "g", "LVL1;", "hibernationRepo", "Lcj3;", "h", "Lcj3;", "operatorAllocationRepo", "LZk3;", "i", "LZk3;", "operatorFilterRepo", "LVp3;", "j", "LVp3;", "operatorOrderViewRepo", "LZu3;", "k", "LZu3;", "operatorTaskGroupRepo", "LGX4;", "l", "LGX4;", "ridePassViewRepo", "LoR;", "m", "LoR;", "birdPlusViewRepo", "<init>", "(Ljg;LOn;LRR;LGw0;Ler1;LQs1;LVL1;Lcj3;LZk3;LVp3;LZu3;LGX4;LoR;)V", "co.bird.android.manager.repository"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: eI4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40262eI4 implements InterfaceC39059cI4 {

    /* renamed from: a */
    public final InterfaceC24980jg f78203a;

    /* renamed from: b */
    public final InterfaceC6137On f78204b;

    /* renamed from: c */
    public final InterfaceC7168RR f78205c;

    /* renamed from: d */
    public final InterfaceC33215Gw0 f78206d;

    /* renamed from: e */
    public final InterfaceC40591er1 f78207e;

    /* renamed from: f */
    public final InterfaceC35520Qs1 f78208f;

    /* renamed from: g */
    public final VL1 f78209g;

    /* renamed from: h */
    public final InterfaceC39310cj3 f78210h;

    /* renamed from: i */
    public final InterfaceC37556Zk3 f78211i;

    /* renamed from: j */
    public final InterfaceC36665Vp3 f78212j;

    /* renamed from: k */
    public final InterfaceC37646Zu3 f78213k;

    /* renamed from: l */
    public final GX4 f78214l;

    /* renamed from: m */
    public final InterfaceC26980oR f78215m;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: eI4$a */
    /* loaded from: classes4.dex */
    public static final class C20002a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C20002a f78216g = new C20002a();

        public C20002a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40160d("Error clearing repositories", new Object[0]);
        }
    }

    public C40262eI4(InterfaceC24980jg announcementRepo, InterfaceC6137On areaRepo, InterfaceC7168RR birdRepo, InterfaceC33215Gw0 configurableTutorialRepo, InterfaceC40591er1 fleetStatusRepo, InterfaceC35520Qs1 flightSheetRepo, VL1 hibernationRepo, InterfaceC39310cj3 operatorAllocationRepo, InterfaceC37556Zk3 operatorFilterRepo, InterfaceC36665Vp3 operatorOrderViewRepo, InterfaceC37646Zu3 operatorTaskGroupRepo, GX4 ridePassViewRepo, InterfaceC26980oR birdPlusViewRepo) {
        Intrinsics.checkNotNullParameter(announcementRepo, "announcementRepo");
        Intrinsics.checkNotNullParameter(areaRepo, "areaRepo");
        Intrinsics.checkNotNullParameter(birdRepo, "birdRepo");
        Intrinsics.checkNotNullParameter(configurableTutorialRepo, "configurableTutorialRepo");
        Intrinsics.checkNotNullParameter(fleetStatusRepo, "fleetStatusRepo");
        Intrinsics.checkNotNullParameter(flightSheetRepo, "flightSheetRepo");
        Intrinsics.checkNotNullParameter(hibernationRepo, "hibernationRepo");
        Intrinsics.checkNotNullParameter(operatorAllocationRepo, "operatorAllocationRepo");
        Intrinsics.checkNotNullParameter(operatorFilterRepo, "operatorFilterRepo");
        Intrinsics.checkNotNullParameter(operatorOrderViewRepo, "operatorOrderViewRepo");
        Intrinsics.checkNotNullParameter(operatorTaskGroupRepo, "operatorTaskGroupRepo");
        Intrinsics.checkNotNullParameter(ridePassViewRepo, "ridePassViewRepo");
        Intrinsics.checkNotNullParameter(birdPlusViewRepo, "birdPlusViewRepo");
        this.f78203a = announcementRepo;
        this.f78204b = areaRepo;
        this.f78205c = birdRepo;
        this.f78206d = configurableTutorialRepo;
        this.f78207e = fleetStatusRepo;
        this.f78208f = flightSheetRepo;
        this.f78209g = hibernationRepo;
        this.f78210h = operatorAllocationRepo;
        this.f78211i = operatorFilterRepo;
        this.f78212j = operatorOrderViewRepo;
        this.f78213k = operatorTaskGroupRepo;
        this.f78214l = ridePassViewRepo;
        this.f78215m = birdPlusViewRepo;
    }

    /* renamed from: c */
    public static final void m43048c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC39059cI4
    /* renamed from: a */
    public AbstractC23461c mo43050a() {
        List listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{this.f78203a.clear(), this.f78204b.clear(), this.f78205c.clear(), this.f78206d.clear(), this.f78207e.clear(), this.f78208f.clear(), this.f78209g.clear(), this.f78210h.clear(), this.f78211i.clear(), this.f78212j.clear(), this.f78213k.clear(), this.f78214l.clear(), this.f78215m.clear()});
        AbstractC23461c m33037r = AbstractC23461c.m33037r(listOf);
        final C20002a c20002a = C20002a.f78216g;
        AbstractC23461c m33063X = m33037r.m33084B(new InterfaceC23484g() { // from class: dI4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40262eI4.m43048c(Function1.this, obj);
            }
        }).m33069Q().m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "concat(\n      listOf(\n  …scribeOn(Schedulers.io())");
        return m33063X;
    }
}
