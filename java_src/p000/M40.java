package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.BulkScanPurpose;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ServiceCenterStatus;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.wire.WireBatch;
import co.bird.android.model.wire.WireServiceCenterStatus;
import co.bird.api.request.BatchKind;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p000.C45672nQ5;
import p000.FQ5;
import p000.InterfaceC33193Gt5;
import p000.InterfaceC40099e13;
import p000.M40;
@Metadata(m28433d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BY\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203¢\u0006\u0004\b<\u0010=J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u001a\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006>"}, m28432d2 = {"LM40;", "", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "status", "", "notes", "sessionId", "", "v", "wireStatus", "n", "", "numberInBulk", "bulkAction", "y", "LfF;", C17296a.f69688o, "LfF;", "batchManager", "Lom3;", "b", "Lom3;", "operatorManager", "LGt5;", "c", "LGt5;", "serviceCenterManager", "LEa;", DateTokenConverter.CONVERTER_KEY, "LEa;", "analyticsManager", "Lcom/uber/autodispose/ScopeProvider;", "e", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LS40;", "f", "LS40;", "statusConverter", "Le13;", "g", "Le13;", "navigator", "LU40;", "h", "LU40;", "ui", "LTq4;", "i", "LTq4;", "reactiveConfig", "Ll50;", "j", "Ll50;", "converter", "k", "I", "minHibernateBattery", "l", "Ljava/lang/String;", "<init>", "(LfF;Lom3;LGt5;LEa;Lcom/uber/autodispose/ScopeProvider;LS40;Le13;LU40;LTq4;Ll50;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBulkServiceCenterStatusReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkServiceCenterStatusReportPresenter.kt\nco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,156:1\n180#2:157\n180#2:158\n218#2:159\n*S KotlinDebug\n*F\n+ 1 BulkServiceCenterStatusReportPresenter.kt\nco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportPresenter\n*L\n54#1:157\n80#1:158\n134#1:159\n*E\n"})
/* renamed from: M40 */
/* loaded from: classes3.dex */
public final class M40 {

    /* renamed from: a */
    public final InterfaceC20340fF f22564a;

    /* renamed from: b */
    public final InterfaceC46473om3 f22565b;

    /* renamed from: c */
    public final InterfaceC33193Gt5 f22566c;

    /* renamed from: d */
    public final InterfaceC1880Ea f22567d;

    /* renamed from: e */
    public final ScopeProvider f22568e;

    /* renamed from: f */
    public final S40 f22569f;

    /* renamed from: g */
    public final InterfaceC40099e13 f22570g;

    /* renamed from: h */
    public final U40 f22571h;

    /* renamed from: i */
    public final C36207Tq4 f22572i;

    /* renamed from: j */
    public final C44287l50 f22573j;

    /* renamed from: k */
    public final int f22574k;

    /* renamed from: l */
    public String f22575l;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: M40$a */
    /* loaded from: classes3.dex */
    public static final class C5177a extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Unit>> {
        public C5177a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Unit> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return M40.this.f22565b.mo8080r1(BulkScanPurpose.SERVICE_CENTER).m33042m(AbstractC23442F.m33158H(Unit.INSTANCE));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: M40$b */
    /* loaded from: classes3.dex */
    public static final class C5178b extends Lambda implements Function1<Unit, Unit> {
        public C5178b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.closeDownWithResult$default(M40.this.f22570g, -1, null, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001ar\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0005*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00040\u0004 \u0005*8\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0005*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Bird;", "birds", "Lio/reactivex/B;", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "b", "(Ljava/util/List;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: M40$c */
    /* loaded from: classes3.dex */
    public static final class C5179c extends Lambda implements Function1<List<? extends Bird>, InterfaceC23434B<? extends Pair<? extends Bird, ? extends List<? extends Bird>>>> {

        /* renamed from: g */
        public static final C5179c f22578g = new C5179c();

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u0003 \u0004*\u0016\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: M40$c$a */
        /* loaded from: classes3.dex */
        public static final class C5180a extends Lambda implements Function1<Bird, Pair<? extends Bird, ? extends List<? extends Bird>>> {

            /* renamed from: g */
            public final /* synthetic */ List<Bird> f22579g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5180a(List<Bird> list) {
                super(1);
                this.f22579g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Bird, List<Bird>> invoke(Bird bird) {
                Intrinsics.checkNotNullParameter(bird, "bird");
                return TuplesKt.m28425to(bird, this.f22579g);
            }
        }

        public C5179c() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends Pair<Bird, List<Bird>>> invoke(List<Bird> birds) {
            Intrinsics.checkNotNullParameter(birds, "birds");
            Observable fromIterable = Observable.fromIterable(birds);
            final C5180a c5180a = new C5180a(birds);
            return fromIterable.map(new InterfaceC23492o() { // from class: N40
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = M40.C5179c.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a¯\u0003\u0012Ï\u0001\b\u0001\u0012Ê\u0001\u0012V\u0012T\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001 \u0004*(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00010\u00050\u0000\u0012\u0006\u0012\u0004\u0018\u00010\b \u0004*d\u0012V\u0012T\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001 \u0004*(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00010\u00050\u0000\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00010\u0001 \u0004*Ö\u0001\u0012Ï\u0001\b\u0001\u0012Ê\u0001\u0012V\u0012T\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001 \u0004*(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00010\u00050\u0000\u0012\u0006\u0012\u0004\u0018\u00010\b \u0004*d\u0012V\u0012T\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001 \u0004*(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00010\u00050\u0000\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00010\u0001\u0018\u00010\u00070\u00072X\u0010\u0006\u001aT\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001 \u0004*(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00010\u00050\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "", "kotlin.jvm.PlatformType", "", "birdsWithSuccessStatusPairs", "Lio/reactivex/u;", "Lco/bird/android/model/wire/WireBatch;", "b", "(Ljava/util/List;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: M40$e */
    /* loaded from: classes3.dex */
    public static final class C5183e extends Lambda implements Function1<List<Pair<? extends Bird, ? extends Boolean>>, InterfaceC24574u<? extends Pair<? extends List<Pair<? extends Bird, ? extends Boolean>>, ? extends WireBatch>>> {

        /* renamed from: g */
        public final /* synthetic */ WireServiceCenterStatus f22585g;

        /* renamed from: h */
        public final /* synthetic */ M40 f22586h;

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\b\u001aÆ\u0001\u0012V\u0012T\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u0002 \u0006*(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u00020\u00070\u0003\u0012\u0004\u0012\u00020\u0000 \u0006*b\u0012V\u0012T\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u0002 \u0006*(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u00020\u00070\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lco/bird/android/model/wire/WireBatch;", "it", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/Bird;", "", "kotlin.jvm.PlatformType", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBatch;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: M40$e$a */
        /* loaded from: classes3.dex */
        public static final class C5184a extends Lambda implements Function1<WireBatch, Pair<? extends List<Pair<? extends Bird, ? extends Boolean>>, ? extends WireBatch>> {

            /* renamed from: g */
            public final /* synthetic */ List<Pair<Bird, Boolean>> f22587g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5184a(List<Pair<Bird, Boolean>> list) {
                super(1);
                this.f22587g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<List<Pair<Bird, Boolean>>, WireBatch> invoke(WireBatch it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f22587g, it);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5183e(WireServiceCenterStatus wireServiceCenterStatus, M40 m40) {
            super(1);
            this.f22585g = wireServiceCenterStatus;
            this.f22586h = m40;
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Pair<List<Pair<Bird, Boolean>>, WireBatch>> invoke(List<Pair<Bird, Boolean>> birdsWithSuccessStatusPairs) {
            int random;
            Intrinsics.checkNotNullParameter(birdsWithSuccessStatusPairs, "birdsWithSuccessStatusPairs");
            if (this.f22585g.getStatus().isHibernateCreateBatch() && (!birdsWithSuccessStatusPairs.isEmpty())) {
                LocalDate localDate = DateTime.now().toLocalDate();
                int year = localDate.getYear();
                int monthOfYear = localDate.getMonthOfYear();
                int dayOfMonth = localDate.getDayOfMonth();
                random = RangesKt___RangesKt.random(new IntRange(100, 999), Random.Default);
                AbstractC24507p<WireBatch> m33125j0 = this.f22586h.f22564a.mo34292e("hib_" + year + "_" + monthOfYear + "_" + dayOfMonth + "_" + random, BatchKind.HIBERNATE).m33125j0();
                final C5184a c5184a = new C5184a(birdsWithSuccessStatusPairs);
                InterfaceC24574u m32067H = m33125j0.m32067H(new InterfaceC23492o() { // from class: P40
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair invoke$lambda$0;
                        invoke$lambda$0 = M40.C5183e.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m32067H, "birdsWithSuccessStatusPa…usPairs to it }\n        }");
                return m32067H;
            }
            AbstractC24507p m32068G = AbstractC24507p.m32068G(TuplesKt.m28425to(birdsWithSuccessStatusPairs, null));
            Intrinsics.checkNotNullExpressionValue(m32068G, "{\n          Maybe.just(b…sPairs to null)\n        }");
            return m32068G;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012Ï\u0001\u0010\u0002\u001aÊ\u0001\u0012V\u0012T\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \u0007*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003 \u0007*(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \u0007*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u00030\b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t \u0007*d\u0012V\u0012T\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \u0007*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003 \u0007*(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \u0007*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u00030\b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\n"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/Bird;", "", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/wire/WireBatch;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nBulkServiceCenterStatusReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkServiceCenterStatusReportPresenter.kt\nco/bird/android/feature/bulkscanner/report/serviceprogress/BulkServiceCenterStatusReportPresenter$bulkUpdateBirds$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"})
    /* renamed from: M40$f */
    /* loaded from: classes3.dex */
    public static final class C5185f extends Lambda implements Function1<Pair<? extends List<Pair<? extends Bird, ? extends Boolean>>, ? extends WireBatch>, Unit> {
        public C5185f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<Pair<? extends Bird, ? extends Boolean>>, ? extends WireBatch> pair) {
            invoke2((Pair<? extends List<Pair<Bird, Boolean>>, WireBatch>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<Pair<Bird, Boolean>>, WireBatch> pair) {
            String name;
            List<Pair<Bird, Boolean>> component1 = pair.component1();
            if (pair.component2() == null || (name = BulkScanPurpose.ADD_TO_BATCH.name()) == null) {
                name = ScanIntention.BULK_PROGRESS.name();
            }
            M40.this.m95860y(component1.size(), name);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b \u0004*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00050\u00052f\u0010\u0007\u001ab\u0012V\u0012T\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000 \u0004*(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00000\u00050\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/Bird;", "", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/wire/WireBatch;", "<name for destructuring parameter 0>", "LH6;", "invoke", "(Lkotlin/Pair;)Ljava/util/List;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: M40$g */
    /* loaded from: classes3.dex */
    public static final class C5186g extends Lambda implements Function1<Pair<? extends List<Pair<? extends Bird, ? extends Boolean>>, ? extends WireBatch>, List<? extends C3023H6>> {

        /* renamed from: g */
        public final /* synthetic */ boolean f22589g;

        /* renamed from: h */
        public final /* synthetic */ M40 f22590h;

        /* renamed from: i */
        public final /* synthetic */ WireServiceCenterStatus f22591i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5186g(boolean z, M40 m40, WireServiceCenterStatus wireServiceCenterStatus) {
            super(1);
            this.f22589g = z;
            this.f22590h = m40;
            this.f22591i = wireServiceCenterStatus;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends C3023H6> invoke(Pair<? extends List<Pair<? extends Bird, ? extends Boolean>>, ? extends WireBatch> pair) {
            return invoke2((Pair<? extends List<Pair<Bird, Boolean>>, WireBatch>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<C3023H6> invoke2(Pair<? extends List<Pair<Bird, Boolean>>, WireBatch> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<Pair<Bird, Boolean>> birdsWithSuccessStatusPairs = pair.component1();
            WireBatch component2 = pair.component2();
            if (this.f22589g) {
                C44287l50 c44287l50 = this.f22590h.f22573j;
                Intrinsics.checkNotNullExpressionValue(birdsWithSuccessStatusPairs, "birdsWithSuccessStatusPairs");
                return c44287l50.m27945b(birdsWithSuccessStatusPairs, this.f22591i, component2);
            }
            C44287l50 c44287l502 = this.f22590h.f22573j;
            Intrinsics.checkNotNullExpressionValue(birdsWithSuccessStatusPairs, "birdsWithSuccessStatusPairs");
            return c44287l502.m27946a(birdsWithSuccessStatusPairs, this.f22591i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "sections", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: M40$h */
    /* loaded from: classes3.dex */
    public static final class C5187h extends Lambda implements Function1<List<? extends C3023H6>, Unit> {
        public C5187h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> sections) {
            M40.this.f22571h.mo80452Td();
            M40.this.f22571h.mo26226Rc(true);
            U40 u40 = M40.this.f22571h;
            Intrinsics.checkNotNullExpressionValue(sections, "sections");
            u40.mo26223b(sections);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: M40$i */
    /* loaded from: classes3.dex */
    public static final class C5188i extends Lambda implements Function1<Throwable, Unit> {
        public C5188i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            List<C3023H6> sections = M40.this.f22569f.m86045i(th).m33132g();
            U40 u40 = M40.this.f22571h;
            Intrinsics.checkNotNullExpressionValue(sections, "sections");
            u40.mo12607g1(sections);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LnQ5$b;", "response", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LnQ5$b;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: M40$j */
    /* loaded from: classes3.dex */
    public static final class C5189j extends Lambda implements Function1<C45672nQ5.EnumC26504b, InterfaceC23447K<? extends C45672nQ5.EnumC26504b>> {
        public C5189j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends C45672nQ5.EnumC26504b> invoke(C45672nQ5.EnumC26504b response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (response != C45672nQ5.EnumC26504b.TRY_AGAIN) {
                return M40.this.f22565b.mo8080r1(BulkScanPurpose.SERVICE_CENTER).m33042m(AbstractC23442F.m33158H(response));
            }
            return AbstractC23442F.m33158H(response);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LnQ5$b;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LnQ5$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: M40$k */
    /* loaded from: classes3.dex */
    public static final class C5190k extends Lambda implements Function1<C45672nQ5.EnumC26504b, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireServiceCenterStatus f22596h;

        /* renamed from: i */
        public final /* synthetic */ String f22597i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5190k(WireServiceCenterStatus wireServiceCenterStatus, String str) {
            super(1);
            this.f22596h = wireServiceCenterStatus;
            this.f22597i = str;
        }

        /* renamed from: a */
        public final void m95850a(C45672nQ5.EnumC26504b enumC26504b) {
            if (enumC26504b == C45672nQ5.EnumC26504b.TRY_AGAIN) {
                M40.this.m95871n(this.f22596h, this.f22597i);
            } else {
                M40.this.f22570g.close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45672nQ5.EnumC26504b enumC26504b) {
            m95850a(enumC26504b);
            return Unit.INSTANCE;
        }
    }

    public M40(InterfaceC20340fF batchManager, InterfaceC46473om3 operatorManager, InterfaceC33193Gt5 serviceCenterManager, InterfaceC1880Ea analyticsManager, ScopeProvider scopeProvider, S40 statusConverter, InterfaceC40099e13 navigator, U40 ui, C36207Tq4 reactiveConfig, C44287l50 converter) {
        Intrinsics.checkNotNullParameter(batchManager, "batchManager");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(serviceCenterManager, "serviceCenterManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(statusConverter, "statusConverter");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f22564a = batchManager;
        this.f22565b = operatorManager;
        this.f22566c = serviceCenterManager;
        this.f22567d = analyticsManager;
        this.f22568e = scopeProvider;
        this.f22569f = statusConverter;
        this.f22570g = navigator;
        this.f22571h = ui;
        this.f22572i = reactiveConfig;
        this.f22573j = converter;
        this.f22574k = reactiveConfig.m82623f8().m73665a().getServiceCenterConfig().getBulkProgress().getHibernateMinBattery();
        Observable<Unit> mo26227L6 = ui.mo26227L6();
        final C5177a c5177a = new C5177a();
        Observable observeOn = mo26227L6.flatMapSingle(new InterfaceC23492o() { // from class: L40
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m95873l;
                m95873l = M40.m95873l(Function1.this, obj);
                return m95873l;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.okClicks()\n      .fla…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5178b c5178b = new C5178b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: C40
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                M40.m95872m(Function1.this, obj);
            }
        });
    }

    /* renamed from: l */
    public static final InterfaceC23447K m95873l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m95872m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m95870o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final InterfaceC23434B m95869p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final InterfaceC23434B m95868q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final InterfaceC24574u m95867r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m95866s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final List m95865t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m95864u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final InterfaceC23447K m95862w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m95861x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public final void m95871n(WireServiceCenterStatus wireServiceCenterStatus, String str) {
        boolean z;
        if (!wireServiceCenterStatus.getStatus().isHibernate() && !wireServiceCenterStatus.getStatus().isHibernateCreateBatch()) {
            z = false;
        } else {
            z = true;
        }
        AbstractC23442F<List<Bird>> firstOrError = this.f22565b.mo8093l1(BulkScanPurpose.SERVICE_CENTER).firstOrError();
        final C5179c c5179c = C5179c.f22578g;
        Observable<R> m33162D = firstOrError.m33162D(new InterfaceC23492o() { // from class: B40
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m95869p;
                m95869p = M40.m95869p(Function1.this, obj);
                return m95869p;
            }
        });
        final C5181d c5181d = new C5181d(z, this, wireServiceCenterStatus, str);
        AbstractC23442F list = m33162D.flatMap(new InterfaceC23492o() { // from class: D40
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m95868q;
                m95868q = M40.m95868q(Function1.this, obj);
                return m95868q;
            }
        }).toList();
        final C5183e c5183e = new C5183e(wireServiceCenterStatus, this);
        AbstractC24507p m33163C = list.m33163C(new InterfaceC23492o() { // from class: E40
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m95867r;
                m95867r = M40.m95867r(Function1.this, obj);
                return m95867r;
            }
        });
        final C5185f c5185f = new C5185f();
        AbstractC24507p m32066I = m33163C.m32026s(new InterfaceC23484g() { // from class: F40
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                M40.m95866s(Function1.this, obj);
            }
        }).m32066I(C24542a.m31934a());
        final C5186g c5186g = new C5186g(z, this, wireServiceCenterStatus);
        AbstractC24507p m32066I2 = m32066I.m32067H(new InterfaceC23492o() { // from class: G40
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m95865t;
                m95865t = M40.m95865t(Function1.this, obj);
                return m95865t;
            }
        }).m32066I(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32066I2, "private fun bulkUpdateBi…re(sections)\n      })\n  }");
        Object m32048b = m32066I2.m32048b(AutoDispose.m45239a(this.f22568e));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5187h c5187h = new C5187h();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: H40
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                M40.m95864u(Function1.this, obj);
            }
        };
        final C5188i c5188i = new C5188i();
        ((MaybeSubscribeProxy) m32048b).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: I40
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                M40.m95870o(Function1.this, obj);
            }
        });
    }

    /* renamed from: v */
    public final void m95863v(WireServiceCenterStatus status, String str, String sessionId) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f22575l = sessionId;
        m95871n(status, str);
        Observable showStatusDialog$default = FQ5.C2274a.showStatusDialog$default(this.f22571h, null, 1, null);
        final C5189j c5189j = new C5189j();
        Observable flatMapSingle = showStatusDialog$default.flatMapSingle(new InterfaceC23492o() { // from class: J40
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m95862w;
                m95862w = M40.m95862w(Function1.this, obj);
                return m95862w;
            }
        });
        final C5190k c5190k = new C5190k(status, str);
        Observable observeOn = flatMapSingle.doOnNext(new InterfaceC23484g() { // from class: K40
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                M40.m95861x(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "fun onCreate(status: Wir…r)\n      .subscribe()\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f22568e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
    }

    /* renamed from: y */
    public final void m95860y(int i, String str) {
        InterfaceC1880Ea interfaceC1880Ea = this.f22567d;
        String str2 = this.f22575l;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionId");
            str2 = null;
        }
        interfaceC1880Ea.mo55905y(new C43684k40(null, str2, null, null, str, i, true, 13, null));
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\t\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00000\u0000 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: M40$d */
    /* loaded from: classes3.dex */
    public static final class C5181d extends Lambda implements Function1<Pair<? extends Bird, ? extends List<? extends Bird>>, InterfaceC23434B<? extends Pair<? extends Bird, ? extends Boolean>>> {

        /* renamed from: g */
        public final /* synthetic */ boolean f22580g;

        /* renamed from: h */
        public final /* synthetic */ M40 f22581h;

        /* renamed from: i */
        public final /* synthetic */ WireServiceCenterStatus f22582i;

        /* renamed from: j */
        public final /* synthetic */ String f22583j;

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"LHM4;", "", "response", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: M40$d$a */
        /* loaded from: classes3.dex */
        public static final class C5182a extends Lambda implements Function1<HM4<Unit>, Pair<? extends Bird, ? extends Boolean>> {

            /* renamed from: g */
            public final /* synthetic */ Bird f22584g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5182a(Bird bird) {
                super(1);
                this.f22584g = bird;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Bird, Boolean> invoke(HM4<Unit> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return TuplesKt.m28425to(this.f22584g, Boolean.valueOf(response.m103939f()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5181d(boolean z, M40 m40, WireServiceCenterStatus wireServiceCenterStatus, String str) {
            super(1);
            this.f22580g = z;
            this.f22581h = m40;
            this.f22582i = wireServiceCenterStatus;
            this.f22583j = str;
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends Pair<Bird, Boolean>> invoke2(Pair<Bird, ? extends List<Bird>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Bird bird = pair.component1();
            List<Bird> component2 = pair.component2();
            if (this.f22580g && bird.getBatteryLevel() < this.f22581h.f22574k) {
                return Observable.just(TuplesKt.m28425to(bird, Boolean.FALSE));
            }
            InterfaceC33193Gt5 interfaceC33193Gt5 = this.f22581h.f22566c;
            ServiceCenterStatus status = this.f22582i.getStatus();
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            AbstractC23442F progress$default = C28237sD.progress$default(InterfaceC33193Gt5.C2969a.addEvent$default(interfaceC33193Gt5, status, bird, this.f22583j, (String) null, EnumC12346bH.BULK, Integer.valueOf(component2.size()), 8, (Object) null), this.f22581h.f22571h, 0, 2, (Object) null);
            final C5182a c5182a = new C5182a(bird);
            return progress$default.m33157I(new InterfaceC23492o() { // from class: O40
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = M40.C5181d.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            }).m33123k0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends Pair<? extends Bird, ? extends Boolean>> invoke(Pair<? extends Bird, ? extends List<? extends Bird>> pair) {
            return invoke2((Pair<Bird, ? extends List<Bird>>) pair);
        }
    }
}
