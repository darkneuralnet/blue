package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.feature.servicecenter.status.single.update.adapters.ServiceProgressUpdateStatusViewHolderSupplier;
import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.User;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireServiceCenterStatus;
import co.bird.api.exception.HibernateException;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23487j;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.rxkotlin.C24530g;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C35542Qu5;
import p000.C45672nQ5;
import p000.InterfaceC33193Gt5;
import p000.InterfaceC36712Vu5;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&¢\u0006\u0004\b=\u0010>J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010.\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010\u00020\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00101\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010/0/0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010-R.\u00105\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000203 +*\n\u0012\u0004\u0012\u000203\u0018\u000102020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010-R.\u00108\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000203 +*\n\u0012\u0004\u0012\u000203\u0018\u000106060*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010-R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006?"}, m28432d2 = {"LQu5;", "Lyu5;", "Lco/bird/android/model/wire/WireBird;", "bird", "", "E", C17296a.f69688o, "LaM;", "LaM;", "birdManager", "LGt5;", "b", "LGt5;", "serviceCenterManager", "Llh6;", "c", "Llh6;", "userManager", "LTq4;", DateTokenConverter.CONVERTER_KEY, "LTq4;", "reactiveConfig", "Lcom/uber/autodispose/ScopeProvider;", "e", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lbv5;", "f", "Lbv5;", "ui", "Le13;", "g", "Le13;", "navigator", "Luu5;", "h", "Luu5;", "converter", "LVu5;", "i", "LVu5;", "statusConverter", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "j", "Lio/reactivex/subjects/a;", "birdSubject", "Lco/bird/android/model/BirdSummaryBody;", "k", "birdSummarySubject", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "l", "selectedStatusSubject", "", "m", "statusesSubject", "", "n", "I", "minHibernateBattery", "<init>", "(LaM;LGt5;Llh6;LTq4;Lcom/uber/autodispose/ScopeProvider;Lbv5;Le13;Luu5;LVu5;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nServiceProgressUpdatePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceProgressUpdatePresenter.kt\nco/bird/android/feature/servicecenter/status/single/update/ServiceProgressUpdatePresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,197:1\n180#2:198\n180#2:199\n180#2:202\n199#2:203\n161#2:204\n199#2:205\n82#3,2:200\n*S KotlinDebug\n*F\n+ 1 ServiceProgressUpdatePresenter.kt\nco/bird/android/feature/servicecenter/status/single/update/ServiceProgressUpdatePresenterImpl\n*L\n60#1:198\n66#1:199\n81#1:202\n99#1:203\n156#1:204\n186#1:205\n69#1:200,2\n*E\n"})
/* renamed from: Qu5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35542Qu5 implements InterfaceC52483yu5 {

    /* renamed from: a */
    public final InterfaceC10636aM f31181a;

    /* renamed from: b */
    public final InterfaceC33193Gt5 f31182b;

    /* renamed from: c */
    public final InterfaceC44647lh6 f31183c;

    /* renamed from: d */
    public final C36207Tq4 f31184d;

    /* renamed from: e */
    public final ScopeProvider f31185e;

    /* renamed from: f */
    public final InterfaceC38839bv5 f31186f;

    /* renamed from: g */
    public final InterfaceC40099e13 f31187g;

    /* renamed from: h */
    public final InterfaceC50112uu5 f31188h;

    /* renamed from: i */
    public final InterfaceC36712Vu5 f31189i;

    /* renamed from: j */
    public final C24552a<WireBird> f31190j;

    /* renamed from: k */
    public final C24552a<BirdSummaryBody> f31191k;

    /* renamed from: l */
    public final C24552a<Optional<WireServiceCenterStatus>> f31192l;

    /* renamed from: m */
    public final C24552a<List<WireServiceCenterStatus>> f31193m;

    /* renamed from: n */
    public final int f31194n;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "bird", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qu5$a */
    /* loaded from: classes3.dex */
    public static final class C6980a extends Lambda implements Function1<WireBird, Unit> {
        public C6980a() {
            super(1);
        }

        /* renamed from: a */
        public final void m87602a(WireBird bird) {
            InterfaceC40099e13 interfaceC40099e13 = C35542Qu5.this.f31187g;
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            interfaceC40099e13.mo37135L2(bird);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m87602a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireServiceCenterStatus;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireServiceCenterStatus;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qu5$b */
    /* loaded from: classes3.dex */
    public static final class C6981b extends Lambda implements Function1<WireServiceCenterStatus, Unit> {
        public C6981b() {
            super(1);
        }

        /* renamed from: a */
        public final void m87601a(WireServiceCenterStatus wireServiceCenterStatus) {
            C35542Qu5.this.f31186f.mo25928x(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireServiceCenterStatus wireServiceCenterStatus) {
            m87601a(wireServiceCenterStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireServiceCenterStatus;", "kotlin.jvm.PlatformType", "status", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireServiceCenterStatus;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qu5$c */
    /* loaded from: classes3.dex */
    public static final class C6982c extends Lambda implements Function1<WireServiceCenterStatus, Unit> {
        public C6982c() {
            super(1);
        }

        /* renamed from: a */
        public final void m87600a(WireServiceCenterStatus wireServiceCenterStatus) {
            C35542Qu5.this.f31192l.onNext(Optional.f63040c.m59033b(wireServiceCenterStatus));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireServiceCenterStatus wireServiceCenterStatus) {
            m87600a(wireServiceCenterStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\n \u0002*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00060\u0006 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\n \u0002*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00060\u0006\u0018\u00010\t0\t2\\\u0010\b\u001aX\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00060\u0006\u0012\u0004\u0012\u00020\u00070\u0000H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"LRe4;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/BirdSummaryBody;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LH6;", C17296a.f69688o, "(LRe4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qu5$d */
    /* loaded from: classes3.dex */
    public static final class C6983d extends Lambda implements Function1<C35631Re4<? extends WireBird, ? extends BirdSummaryBody, ? extends Optional<WireServiceCenterStatus>, ? extends List<? extends WireServiceCenterStatus>, ? extends Boolean>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C6983d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(C35631Re4<WireBird, BirdSummaryBody, Optional<WireServiceCenterStatus>, ? extends List<WireServiceCenterStatus>, Boolean> c35631Re4) {
            Intrinsics.checkNotNullParameter(c35631Re4, "<name for destructuring parameter 0>");
            WireBird bird = c35631Re4.m86500a();
            BirdSummaryBody birdSummary = c35631Re4.m86499b();
            List<WireServiceCenterStatus> m86497d = c35631Re4.m86497d();
            boolean booleanValue = c35631Re4.m86496e().booleanValue();
            InterfaceC50112uu5 interfaceC50112uu5 = C35542Qu5.this.f31188h;
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            Intrinsics.checkNotNullExpressionValue(birdSummary, "birdSummary");
            return C28237sD.progress$default(interfaceC50112uu5.mo6125a(bird, birdSummary, c35631Re4.m86498c().m59035e(), m86497d, booleanValue), C35542Qu5.this.f31186f, 0, 2, (Object) null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qu5$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6984e extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C6984e(Object obj) {
            super(1, obj, InterfaceC38839bv5.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC38839bv5) this.receiver).mo25930b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qu5$f */
    /* loaded from: classes3.dex */
    public static final class C6985f extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C6985f f31199g = new C6985f();

        public C6985f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2Ë\u0001\u0010\u0007\u001aÆ\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006 \u0002*b\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"LRe4;", "Lco/bird/android/model/BirdSummaryBody;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(LRe4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nServiceProgressUpdatePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceProgressUpdatePresenter.kt\nco/bird/android/feature/servicecenter/status/single/update/ServiceProgressUpdatePresenterImpl$onCreate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,197:1\n819#2:198\n847#2,2:199\n819#2:201\n847#2,2:202\n819#2:204\n847#2,2:205\n*S KotlinDebug\n*F\n+ 1 ServiceProgressUpdatePresenter.kt\nco/bird/android/feature/servicecenter/status/single/update/ServiceProgressUpdatePresenterImpl$onCreate$1\n*L\n105#1:198\n105#1:199,2\n107#1:201\n107#1:202,2\n110#1:204\n110#1:205,2\n*E\n"})
    /* renamed from: Qu5$g */
    /* loaded from: classes3.dex */
    public static final class C6986g extends Lambda implements Function1<C35631Re4<? extends BirdSummaryBody, ? extends Optional<WireServiceCenterStatus>, ? extends List<? extends WireServiceCenterStatus>, ? extends Boolean, ? extends Boolean>, Unit> {
        public C6986g() {
            super(1);
        }

        /* renamed from: a */
        public final void m87598a(C35631Re4<BirdSummaryBody, Optional<WireServiceCenterStatus>, ? extends List<WireServiceCenterStatus>, Boolean, Boolean> c35631Re4) {
            Optional<WireServiceCenterStatus> m86499b = c35631Re4.m86499b();
            List<WireServiceCenterStatus> statuses = c35631Re4.m86498c();
            Boolean m86497d = c35631Re4.m86497d();
            Boolean m86496e = c35631Re4.m86496e();
            C35542Qu5.this.f31191k.onNext(c35631Re4.m86500a());
            C35542Qu5.this.f31192l.onNext(m86499b);
            Intrinsics.checkNotNullExpressionValue(statuses, "statuses");
            ArrayList arrayList = new ArrayList();
            for (Object obj : statuses) {
                if (!((WireServiceCenterStatus) obj).getStatus().isHibernateCreateBatch()) {
                    arrayList.add(obj);
                }
            }
            if (!m86497d.booleanValue() && (!m86499b.m59037c() || !m86499b.m59038b().getStatus().isHibernate())) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (!((WireServiceCenterStatus) obj2).getStatus().isHibernate()) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList = arrayList2;
            }
            if (!m86496e.booleanValue() && (!m86499b.m59037c() || !m86499b.m59038b().getStatus().isCharging())) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (!((WireServiceCenterStatus) obj3).getStatus().isCharging()) {
                        arrayList3.add(obj3);
                    }
                }
                arrayList = arrayList3;
            }
            C35542Qu5.this.f31193m.onNext(arrayList);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C35631Re4<? extends BirdSummaryBody, ? extends Optional<WireServiceCenterStatus>, ? extends List<? extends WireServiceCenterStatus>, ? extends Boolean, ? extends Boolean> c35631Re4) {
            m87598a(c35631Re4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qu5$h */
    /* loaded from: classes3.dex */
    public static final class C6987h extends Lambda implements Function1<Throwable, Unit> {
        public C6987h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            C35542Qu5.this.f31186f.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00012(\u0010\u0005\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qu5$i */
    /* loaded from: classes3.dex */
    public static final class C6988i extends Lambda implements Function1<Triple<? extends Unit, ? extends WireServiceCenterStatus, ? extends String>, Unit> {

        /* renamed from: g */
        public static final C6988i f31202g = new C6988i();

        public C6988i() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m87597a(Triple<Unit, WireServiceCenterStatus, String> triple) {
            boolean z;
            boolean isBlank;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            String component3 = triple.component3();
            if (triple.component2().getRequireNotes()) {
                if (component3 != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(component3);
                    if (!isBlank) {
                        z = false;
                        if (!z) {
                            throw new IllegalArgumentException("Note cannot be blank when requireNotes is true");
                        }
                        return;
                    }
                }
                z = true;
                if (!z) {
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Unit, ? extends WireServiceCenterStatus, ? extends String> triple) {
            m87597a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qu5$j */
    /* loaded from: classes3.dex */
    public static final class C6989j extends Lambda implements Function1<Throwable, Unit> {
        public C6989j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (th instanceof IllegalArgumentException) {
                C35542Qu5.this.f31186f.mo25933C7();
                return;
            }
            C41318g46.m40159e(th);
            C35542Qu5.this.f31186f.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qu5$k */
    /* loaded from: classes3.dex */
    public static final class C6990k extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f31205h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6990k(WireBird wireBird) {
            super(1);
            this.f31205h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C35542Qu5.this.m87633E(this.f31205h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lna4;", "LnQ5$b;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Unit;)Lna4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qu5$l */
    /* loaded from: classes3.dex */
    public static final class C6991l extends Lambda implements Function1<Unit, InterfaceC45761na4<? extends C45672nQ5.EnumC26504b>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f31207h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LnQ5$b;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LnQ5$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Qu5$l$a */
        /* loaded from: classes3.dex */
        public static final class C6992a extends Lambda implements Function1<C45672nQ5.EnumC26504b, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C35542Qu5 f31208g;

            /* renamed from: h */
            public final /* synthetic */ WireBird f31209h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6992a(C35542Qu5 c35542Qu5, WireBird wireBird) {
                super(1);
                this.f31208g = c35542Qu5;
                this.f31209h = wireBird;
            }

            /* renamed from: a */
            public final void m87594a(C45672nQ5.EnumC26504b enumC26504b) {
                if (enumC26504b == C45672nQ5.EnumC26504b.TRY_AGAIN) {
                    this.f31208g.m87633E(this.f31209h);
                } else {
                    this.f31208g.f31187g.close();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C45672nQ5.EnumC26504b enumC26504b) {
                m87594a(enumC26504b);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6991l(WireBird wireBird) {
            super(1);
            this.f31207h = wireBird;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC45761na4<? extends C45672nQ5.EnumC26504b> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC24490k<C45672nQ5.EnumC26504b> flowable = C35542Qu5.this.f31186f.mo12606ig(new ServiceProgressUpdateStatusViewHolderSupplier()).toFlowable(EnumC23460b.DROP);
            final C6992a c6992a = new C6992a(C35542Qu5.this, this.f31207h);
            return flowable.m32191K(new InterfaceC23484g() { // from class: Ru5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C35542Qu5.C6991l.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010\b\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u0004H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"T1", "T2", "T3", "T4", "T5", "t1", "t2", "t3", "t4", "t5", "LRe4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LRe4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$4\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: Qu5$m */
    /* loaded from: classes3.dex */
    public static final class C6993m<T1, T2, T3, T4, T5, R> implements InterfaceC23487j {

        /* renamed from: a */
        public static final C6993m<T1, T2, T3, T4, T5, R> f31210a = new C6993m<>();

        @Override // io.reactivex.functions.InterfaceC23487j
        /* renamed from: a */
        public final C35631Re4<T1, T2, T3, T4, T5> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            return new C35631Re4<>(t1, t2, t3, t4, t5);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a²\u0001\u0012R\b\u0001\u0012N\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u0007 \u0002*&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0002*X\u0012R\b\u0001\u0012N\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u0007 \u0002*&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lkotlin/Triple;", "Lco/bird/android/model/User;", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qu5$n */
    /* loaded from: classes3.dex */
    public static final class C6994n extends Lambda implements Function1<Pair<? extends WireServiceCenterStatus, ? extends String>, InterfaceC23447K<? extends Triple<? extends WireServiceCenterStatus, ? extends String, ? extends User>>> {

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0006\u001aN\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0012\u0004\u0012\u00020\u0000 \u0004*&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "Lkotlin/Triple;", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "kotlin.jvm.PlatformType", "", C17296a.f69688o, "(Lco/bird/android/model/User;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Qu5$n$a */
        /* loaded from: classes3.dex */
        public static final class C6995a extends Lambda implements Function1<User, Triple<? extends WireServiceCenterStatus, ? extends String, ? extends User>> {

            /* renamed from: g */
            public final /* synthetic */ WireServiceCenterStatus f31212g;

            /* renamed from: h */
            public final /* synthetic */ String f31213h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6995a(WireServiceCenterStatus wireServiceCenterStatus, String str) {
                super(1);
                this.f31212g = wireServiceCenterStatus;
                this.f31213h = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Triple<WireServiceCenterStatus, String, User> invoke(User user) {
                Intrinsics.checkNotNullParameter(user, "user");
                return new Triple<>(this.f31212g, this.f31213h, user);
            }
        }

        public C6994n() {
            super(1);
        }

        /* renamed from: c */
        public static final Triple m87590c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Triple<WireServiceCenterStatus, String, User>> invoke(Pair<WireServiceCenterStatus, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            AbstractC23442F<User> user = C35542Qu5.this.f31183c.getUser();
            final C6995a c6995a = new C6995a(pair.component1(), pair.component2());
            return user.m33157I(new InterfaceC23492o() { // from class: Su5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Triple m87590c;
                    m87590c = C35542Qu5.C6994n.m87590c(Function1.this, obj);
                    return m87590c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00060\u00062(\u0010\u0005\u001a$\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/User;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "b", "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qu5$o */
    /* loaded from: classes3.dex */
    public static final class C6996o extends Lambda implements Function1<Triple<? extends WireServiceCenterStatus, ? extends String, ? extends User>, InterfaceC23447K<? extends WireServiceCenterStatus>> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f31214g;

        /* renamed from: h */
        public final /* synthetic */ C35542Qu5 f31215h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/wire/WireServiceCenterStatus;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Qu5$o$a */
        /* loaded from: classes3.dex */
        public static final class C6997a extends Lambda implements Function1<Unit, WireServiceCenterStatus> {

            /* renamed from: g */
            public final /* synthetic */ WireServiceCenterStatus f31216g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6997a(WireServiceCenterStatus wireServiceCenterStatus) {
                super(1);
                this.f31216g = wireServiceCenterStatus;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final WireServiceCenterStatus invoke(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f31216g;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6996o(WireBird wireBird, C35542Qu5 c35542Qu5) {
            super(1);
            this.f31214g = wireBird;
            this.f31215h = c35542Qu5;
        }

        /* renamed from: c */
        public static final WireServiceCenterStatus m87586c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (WireServiceCenterStatus) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends WireServiceCenterStatus> invoke(Triple<WireServiceCenterStatus, String, User> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            WireServiceCenterStatus component1 = triple.component1();
            String component2 = triple.component2();
            triple.component3();
            if (component1.getStatus().isHibernate() && this.f31214g.getBatteryLevel() < this.f31215h.f31194n) {
                return AbstractC23442F.m33100x(new HibernateException(null, 1, null));
            }
            AbstractC23442F addEvent$default = InterfaceC33193Gt5.C2969a.addEvent$default(this.f31215h.f31182b, component1.getStatus(), this.f31214g, component2, (String) null, EnumC12346bH.SINGLE, (Integer) null, 40, (Object) null);
            S74 mo12605oc = this.f31215h.f31186f.mo12605oc();
            if (mo12605oc == null) {
                mo12605oc = this.f31215h.f31186f;
            }
            AbstractC23442F m70883l = C38096ag5.m70883l(C28237sD.progress$default(addEvent$default, mo12605oc, 0, 2, (Object) null));
            final C6997a c6997a = new C6997a(component1);
            return m70883l.m33157I(new InterfaceC23492o() { // from class: Tu5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    WireServiceCenterStatus m87586c;
                    m87586c = C35542Qu5.C6996o.m87586c(Function1.this, obj);
                    return m87586c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/wire/WireServiceCenterStatus;", "status", "Lio/reactivex/K;", "", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireServiceCenterStatus;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qu5$p */
    /* loaded from: classes3.dex */
    public static final class C6998p extends Lambda implements Function1<WireServiceCenterStatus, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C6998p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(WireServiceCenterStatus status) {
            Intrinsics.checkNotNullParameter(status, "status");
            return C35542Qu5.this.f31189i.mo72321j(status);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qu5$q */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6999q extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C6999q(Object obj) {
            super(1, obj, InterfaceC38839bv5.class, "onSuccess", "onSuccess(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC38839bv5) this.receiver).mo12610b1(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qu5$r */
    /* loaded from: classes3.dex */
    public static final class C7000r extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f31219h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7000r(WireBird wireBird) {
            super(1);
            this.f31219h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            List<C3023H6> sections;
            if (th instanceof HibernateException) {
                sections = C35542Qu5.this.f31189i.mo72323g(this.f31219h.getCode(), C35542Qu5.this.f31194n).m33132g();
            } else {
                sections = (List) InterfaceC36712Vu5.C8823a.convertForFailure$default(C35542Qu5.this.f31189i, null, 1, null).m33132g();
            }
            InterfaceC38839bv5 interfaceC38839bv5 = C35542Qu5.this.f31186f;
            Intrinsics.checkNotNullExpressionValue(sections, "sections");
            interfaceC38839bv5.mo12607g1(sections);
        }
    }

    public C35542Qu5(InterfaceC10636aM birdManager, InterfaceC33193Gt5 serviceCenterManager, InterfaceC44647lh6 userManager, C36207Tq4 reactiveConfig, ScopeProvider scopeProvider, InterfaceC38839bv5 ui, InterfaceC40099e13 navigator, InterfaceC50112uu5 converter, InterfaceC36712Vu5 statusConverter) {
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(serviceCenterManager, "serviceCenterManager");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(statusConverter, "statusConverter");
        this.f31181a = birdManager;
        this.f31182b = serviceCenterManager;
        this.f31183c = userManager;
        this.f31184d = reactiveConfig;
        this.f31185e = scopeProvider;
        this.f31186f = ui;
        this.f31187g = navigator;
        this.f31188h = converter;
        this.f31189i = statusConverter;
        C24552a<WireBird> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<WireBird>()");
        this.f31190j = m31922e;
        C24552a<BirdSummaryBody> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<BirdSummaryBody>()");
        this.f31191k = m31922e2;
        C24552a<Optional<WireServiceCenterStatus>> m31922e3 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e3, "create<Optional<WireServiceCenterStatus>>()");
        this.f31192l = m31922e3;
        C24552a<List<WireServiceCenterStatus>> m31922e4 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e4, "create<List<WireServiceCenterStatus>>()");
        this.f31193m = m31922e4;
        this.f31194n = reactiveConfig.m82623f8().m73665a().getServiceCenterConfig().getBulkProgress().getHibernateMinBattery();
        Observable<WireBird> observeOn = ui.mo44815j0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.viewDetailClicks()\n  …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6980a c6980a = new C6980a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Bu5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35542Qu5.m87610s(Function1.this, obj);
            }
        });
        Observable<WireServiceCenterStatus> observeOn2 = ui.mo25932P().observeOn(C23454a.m33087a());
        final C6981b c6981b = new C6981b();
        Observable<WireServiceCenterStatus> doOnNext = observeOn2.doOnNext(new InterfaceC23484g() { // from class: Cu5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35542Qu5.m87609t(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "ui.statusSelects()\n     …{ ui.enableSubmit(true) }");
        Object m33094as2 = doOnNext.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6982c c6982c = new C6982c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Du5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35542Qu5.m87608u(Function1.this, obj);
            }
        });
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(m31922e, m31922e2, m31922e3, m31922e4, reactiveConfig.m82648d5(), C6993m.f31210a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…nt(t1, t2, t3, t4, t5) })");
        final C6983d c6983d = new C6983d();
        Observable observeOn3 = combineLatest.flatMapSingle(new InterfaceC23492o() { // from class: Eu5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m87607v;
                m87607v = C35542Qu5.m87607v(Function1.this, obj);
                return m87607v;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "BirdObservables.combineL…dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6984e c6984e = new C6984e(ui);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Fu5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35542Qu5.m87606w(Function1.this, obj);
            }
        };
        final C6985f c6985f = C6985f.f31199g;
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Gu5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35542Qu5.m87605x(Function1.this, obj);
            }
        });
    }

    /* renamed from: A */
    public static final void m87637A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m87636B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final Unit m87635C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m87634D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final InterfaceC23447K m87632F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final InterfaceC23447K m87631G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final InterfaceC23447K m87630H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m87629I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m87628J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m87610s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m87609t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m87608u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final InterfaceC23447K m87607v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m87606w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m87605x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m87604y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final InterfaceC45761na4 m87603z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC45761na4) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public final void m87633E(WireBird wireBird) {
        C24530g c24530g = C24530g.f91174a;
        AbstractC23442F<WireServiceCenterStatus> firstOrError = this.f31186f.mo25932P().firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "ui.statusSelects().firstOrError()");
        AbstractC23442F<String> firstOrError2 = this.f31186f.mo25927z().firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError2, "ui.noteChanges().firstOrError()");
        AbstractC23442F m31946a = c24530g.m31946a(firstOrError, firstOrError2);
        final C6994n c6994n = new C6994n();
        AbstractC23442F m33165A = m31946a.m33165A(new InterfaceC23492o() { // from class: Mu5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m87632F;
                m87632F = C35542Qu5.m87632F(Function1.this, obj);
                return m87632F;
            }
        });
        final C6996o c6996o = new C6996o(wireBird, this);
        AbstractC23442F m33165A2 = m33165A.m33165A(new InterfaceC23492o() { // from class: Nu5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m87631G;
                m87631G = C35542Qu5.m87631G(Function1.this, obj);
                return m87631G;
            }
        });
        final C6998p c6998p = new C6998p();
        AbstractC23442F m33152N = m33165A2.m33165A(new InterfaceC23492o() { // from class: Ou5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m87630H;
                m87630H = C35542Qu5.m87630H(Function1.this, obj);
                return m87630H;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "private fun updateProgre…ure(sections)\n      }\n  }");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f31185e));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6999q c6999q = new C6999q(this.f31186f);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Pu5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35542Qu5.m87629I(Function1.this, obj);
            }
        };
        final C7000r c7000r = new C7000r(wireBird);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Au5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35542Qu5.m87628J(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC52483yu5
    /* renamed from: a */
    public void mo2305a(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f31190j.onNext(bird);
        C48501sB5 c48501sB5 = C48501sB5.f108430a;
        AbstractC23442F m70883l = C38096ag5.m70883l(this.f31181a.mo71571o(bird.getId()));
        AbstractC23442F m70887h = C38096ag5.m70887h(this.f31182b.mo94632b(bird.getId()));
        AbstractC23442F m70883l2 = C38096ag5.m70883l(this.f31182b.mo94628f());
        AbstractC23442F<Boolean> firstOrError = this.f31184d.m82580j7().firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "reactiveConfig.enableSer…ibernate().firstOrError()");
        AbstractC23442F<Boolean> firstOrError2 = this.f31184d.m82602h7().firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError2, "reactiveConfig.enableSer…Charging().firstOrError()");
        AbstractC23442F m33152N = C28237sD.progress$default(c48501sB5.m14578e(m70883l, m70887h, m70883l2, firstOrError, firstOrError2), this.f31186f, 0, 2, (Object) null).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "BirdSingles.zip(\n      b…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f31185e));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6986g c6986g = new C6986g();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: zu5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35542Qu5.m87637A(Function1.this, obj);
            }
        };
        final C6987h c6987h = new C6987h();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Hu5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35542Qu5.m87636B(Function1.this, obj);
            }
        });
        AbstractC24490k flowable = C24527f.m31949b(this.f31186f.mo25929c(), this.f31186f.mo25932P(), this.f31186f.mo25927z()).toFlowable(EnumC23460b.DROP);
        final C6988i c6988i = C6988i.f31202g;
        AbstractC24490k m32117q0 = flowable.m32117q0(new InterfaceC23492o() { // from class: Iu5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit m87635C;
                m87635C = C35542Qu5.m87635C(Function1.this, obj);
                return m87635C;
            }
        });
        final C6989j c6989j = new C6989j();
        AbstractC24490k m32192J0 = m32117q0.m32195I(new InterfaceC23484g() { // from class: Ju5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35542Qu5.m87634D(Function1.this, obj);
            }
        }).m32192J0();
        final C6990k c6990k = new C6990k(bird);
        AbstractC24490k m32205D = m32192J0.m32205D(new InterfaceC23484g() { // from class: Ku5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35542Qu5.m87604y(Function1.this, obj);
            }
        });
        final C6991l c6991l = new C6991l(bird);
        AbstractC24490k m32108t0 = m32205D.m32157b1(new InterfaceC23492o() { // from class: Lu5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC45761na4 m87603z;
                m87603z = C35542Qu5.m87603z(Function1.this, obj);
                return m87603z;
            }
        }).m32108t0(C23454a.m33087a(), false, 1);
        Intrinsics.checkNotNullExpressionValue(m32108t0, "override fun onCreate(bi…r)\n      .subscribe()\n  }");
        Object m32150f = m32108t0.m32150f(AutoDispose.m45239a(this.f31185e));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((FlowableSubscribeProxy) m32150f).subscribe();
    }
}
