package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.CommandCenterBody;
import co.bird.android.model.CommandCenterNotice;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.wire.WireBird;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23487j;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24552a;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C33356Hl6;
@Metadata(m28433d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002BI\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,¢\u0006\u0004\bD\u0010EJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\t\u0010\u0005\u001a\u00020\u0003H\u0096\u0001J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J,\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R.\u00106\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000202 3*\n\u0012\u0004\u0012\u000202\u0018\u00010101008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\"\u00109\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010707008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00105R\"\u0010<\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010:0:008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00105R.\u0010?\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020> 3*\n\u0012\u0004\u0012\u00020>\u0018\u00010=0=008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00105R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020@008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006F"}, m28432d2 = {"LHl6;", "LAl6;", "Luo0;", "", "t1", "onResume", "", "birdId", "u1", "o", "", "e", "l", "T", "Lio/reactivex/F;", "Lio/reactivex/Observable;", "subject", "m", "LaM;", C17296a.f69688o, "LaM;", "birdManager", "Lom3;", "b", "Lom3;", "operatorManager", "LTn0;", "c", "LTn0;", "commandCenterManager", "LGI3;", DateTokenConverter.CONVERTER_KEY, "LGI3;", "partnerManager", "Luo0;", "delegate", "LJl6;", "f", "LJl6;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "g", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lvl6;", "h", "Lvl6;", "converter", "Lio/reactivex/subjects/a;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/MobilePartner;", "kotlin.jvm.PlatformType", "i", "Lio/reactivex/subjects/a;", "partnerSubject", "Lco/bird/android/model/BirdSummaryBody;", "j", "summarySubject", "Lco/bird/android/model/CommandCenterBody;", "k", "commandCenterSubject", "", "Lco/bird/android/model/CommandCenterNotice;", "noticesSubject", "Lco/bird/android/model/wire/WireBird;", "v1", "()Lio/reactivex/subjects/a;", "birdSubject", "<init>", "(LaM;Lom3;LTn0;LGI3;Luo0;LJl6;Lcom/uber/autodispose/ScopeProvider;Lvl6;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehicleInfoPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleInfoPresenter.kt\nco/bird/android/feature/repair/v2/vehicleinfo/VehicleInfoPresenterImpl\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n82#2,2:112\n180#3:114\n199#3:115\n9#4,4:116\n1#5:120\n*S KotlinDebug\n*F\n+ 1 VehicleInfoPresenter.kt\nco/bird/android/feature/repair/v2/vehicleinfo/VehicleInfoPresenterImpl\n*L\n50#1:112,2\n61#1:114\n92#1:115\n104#1:116,4\n*E\n"})
/* renamed from: Hl6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33356Hl6 implements InterfaceC31718Al6, InterfaceC50047uo0 {

    /* renamed from: a */
    public final InterfaceC10636aM f13851a;

    /* renamed from: b */
    public final InterfaceC46473om3 f13852b;

    /* renamed from: c */
    public final InterfaceC36176Tn0 f13853c;

    /* renamed from: d */
    public final GI3 f13854d;

    /* renamed from: e */
    public final InterfaceC50047uo0 f13855e;

    /* renamed from: f */
    public final InterfaceC33824Jl6 f13856f;

    /* renamed from: g */
    public final ScopeProvider f13857g;

    /* renamed from: h */
    public final InterfaceC50615vl6 f13858h;

    /* renamed from: i */
    public final C24552a<Optional<MobilePartner>> f13859i;

    /* renamed from: j */
    public final C24552a<BirdSummaryBody> f13860j;

    /* renamed from: k */
    public final C24552a<CommandCenterBody> f13861k;

    /* renamed from: l */
    public final C24552a<List<CommandCenterNotice>> f13862l;

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\f\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u000b \u0002*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00070\u0007 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u000b \u0002*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00070\u0007\u0018\u00010\n0\n2d\u0010\t\u001a`\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00070\u0000H\n¢\u0006\u0004\b\f\u0010\r"}, m28432d2 = {"LRe4;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/MobilePartner;", "Lco/bird/android/model/BirdSummaryBody;", "Lco/bird/android/model/CommandCenterBody;", "", "Lco/bird/android/model/CommandCenterNotice;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LH6;", C17296a.f69688o, "(LRe4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hl6$a */
    /* loaded from: classes3.dex */
    public static final class C3220a extends Lambda implements Function1<C35631Re4<? extends WireBird, ? extends Optional<MobilePartner>, ? extends BirdSummaryBody, ? extends CommandCenterBody, ? extends List<? extends CommandCenterNotice>>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C3220a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(C35631Re4<WireBird, Optional<MobilePartner>, BirdSummaryBody, CommandCenterBody, ? extends List<CommandCenterNotice>> c35631Re4) {
            Intrinsics.checkNotNullParameter(c35631Re4, "<name for destructuring parameter 0>");
            WireBird bird = c35631Re4.m86500a();
            BirdSummaryBody summary = c35631Re4.m86498c();
            CommandCenterBody commandCenter = c35631Re4.m86497d();
            List<CommandCenterNotice> notices = c35631Re4.m86496e();
            InterfaceC50615vl6 interfaceC50615vl6 = C33356Hl6.this.f13858h;
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            Intrinsics.checkNotNullExpressionValue(summary, "summary");
            Intrinsics.checkNotNullExpressionValue(commandCenter, "commandCenter");
            Intrinsics.checkNotNullExpressionValue(notices, "notices");
            return interfaceC50615vl6.mo4736e(bird, c35631Re4.m86499b().m59035e(), summary, commandCenter, notices);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Hl6$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3221b extends FunctionReferenceImpl implements Function1<Collection<? extends C3023H6>, Unit> {
        public C3221b(Object obj) {
            super(1, obj, InterfaceC33824Jl6.class, "populateAdapter", "populateAdapter(Ljava/util/Collection;)V", 0);
        }

        /* renamed from: a */
        public final void m103458a(Collection<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC33824Jl6) this.receiver).mo17123o(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Collection<? extends C3023H6> collection) {
            m103458a(collection);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "", "e", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nVehicleInfoPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleInfoPresenter.kt\nco/bird/android/feature/repair/v2/vehicleinfo/VehicleInfoPresenterImpl$onErrorResumeSubject$1\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n9#2,4:112\n1#3:116\n*S KotlinDebug\n*F\n+ 1 VehicleInfoPresenter.kt\nco/bird/android/feature/repair/v2/vehicleinfo/VehicleInfoPresenterImpl$onErrorResumeSubject$1\n*L\n108#1:112,4\n*E\n"})
    /* renamed from: Hl6$c */
    /* loaded from: classes3.dex */
    public static final class C3222c extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends T>> {

        /* renamed from: g */
        public final /* synthetic */ Observable<T> f13864g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3222c(Observable<T> observable) {
            super(1);
            this.f13864g = observable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends T> invoke(Throwable e) {
            AbstractC23442F firstOrError;
            Intrinsics.checkNotNullParameter(e, "e");
            if ((e instanceof HttpException ? e : null) == null || (firstOrError = this.f13864g.firstOrError()) == null) {
                throw e;
            }
            return firstOrError;
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a§\u0003\u0012Ë\u0001\b\u0001\u0012Æ\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\b0\b\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u0004*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t \u0004*b\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\b0\b\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u0004*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t\u0018\u00010\u00030\u0003 \u0004*Ò\u0001\u0012Ë\u0001\b\u0001\u0012Æ\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\b0\b\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u0004*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t \u0004*b\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\b0\b\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u0004*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/K;", "LRe4;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/MobilePartner;", "Lco/bird/android/model/BirdSummaryBody;", "Lco/bird/android/model/CommandCenterBody;", "", "Lco/bird/android/model/CommandCenterNotice;", "b", "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hl6$d */
    /* loaded from: classes3.dex */
    public static final class C3223d extends Lambda implements Function1<WireBird, InterfaceC23447K<? extends C35631Re4<? extends WireBird, ? extends Optional<MobilePartner>, ? extends BirdSummaryBody, ? extends CommandCenterBody, ? extends List<? extends CommandCenterNotice>>>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0000 \u0003*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/MobilePartner;", "partner", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/MobilePartner;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Hl6$d$a */
        /* loaded from: classes3.dex */
        public static final class C3224a extends Lambda implements Function1<MobilePartner, Optional<MobilePartner>> {

            /* renamed from: g */
            public static final C3224a f13866g = new C3224a();

            public C3224a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<MobilePartner> invoke(MobilePartner partner) {
                Intrinsics.checkNotNullParameter(partner, "partner");
                return Optional.f63040c.m59032c(partner);
            }
        }

        public C3223d() {
            super(1);
        }

        /* renamed from: c */
        public static final Optional m103455c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends C35631Re4<WireBird, Optional<MobilePartner>, BirdSummaryBody, CommandCenterBody, List<CommandCenterNotice>>> invoke(WireBird bird) {
            AbstractC23442F partnerSingle;
            Intrinsics.checkNotNullParameter(bird, "bird");
            if (!C33356Hl6.this.f13859i.m31919i() && bird.getPartnerId() != null) {
                GI3 gi3 = C33356Hl6.this.f13854d;
                String partnerId = bird.getPartnerId();
                Intrinsics.checkNotNull(partnerId);
                AbstractC23442F<MobilePartner> mo97362u = gi3.mo97362u(partnerId);
                final C3224a c3224a = C3224a.f13866g;
                partnerSingle = mo97362u.m33157I(new InterfaceC23492o() { // from class: Il6
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Optional m103455c;
                        m103455c = C33356Hl6.C3223d.m103455c(Function1.this, obj);
                        return m103455c;
                    }
                });
            } else if (C33356Hl6.this.f13859i.m31919i()) {
                partnerSingle = C33356Hl6.this.f13859i.firstOrError();
            } else {
                partnerSingle = AbstractC23442F.m33158H(Optional.f63040c.m59034a());
            }
            C48501sB5 c48501sB5 = C48501sB5.f108430a;
            C33356Hl6 c33356Hl6 = C33356Hl6.this;
            AbstractC23442F m103465m = c33356Hl6.m103465m(C38096ag5.m70883l(c33356Hl6.f13852b.mo8116b(bird.getId())), C33356Hl6.this.mo9730v1());
            C33356Hl6 c33356Hl62 = C33356Hl6.this;
            Intrinsics.checkNotNullExpressionValue(partnerSingle, "partnerSingle");
            AbstractC23442F m103465m2 = c33356Hl62.m103465m(partnerSingle, C33356Hl6.this.f13859i);
            C33356Hl6 c33356Hl63 = C33356Hl6.this;
            AbstractC23442F m103465m3 = c33356Hl63.m103465m(C38096ag5.m70883l(c33356Hl63.f13851a.mo71571o(bird.getId())), C33356Hl6.this.f13860j);
            C33356Hl6 c33356Hl64 = C33356Hl6.this;
            AbstractC23442F m103465m4 = c33356Hl64.m103465m(C38096ag5.m70883l(c33356Hl64.f13853c.mo80872b(bird.getId())), C33356Hl6.this.f13861k);
            C33356Hl6 c33356Hl65 = C33356Hl6.this;
            return C28237sD.progress$default(c48501sB5.m14578e(m103465m, m103465m2, m103465m3, m103465m4, c33356Hl65.m103465m(C38096ag5.m70883l(c33356Hl65.f13853c.mo80873a(bird.getId())), C33356Hl6.this.f13862l)), C33356Hl6.this.f13856f, 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2Ë\u0001\u0010\t\u001aÆ\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007 \u0002*b\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"LRe4;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/MobilePartner;", "Lco/bird/android/model/BirdSummaryBody;", "Lco/bird/android/model/CommandCenterBody;", "", "Lco/bird/android/model/CommandCenterNotice;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(LRe4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hl6$e */
    /* loaded from: classes3.dex */
    public static final class C3225e extends Lambda implements Function1<C35631Re4<? extends WireBird, ? extends Optional<MobilePartner>, ? extends BirdSummaryBody, ? extends CommandCenterBody, ? extends List<? extends CommandCenterNotice>>, Unit> {
        public C3225e() {
            super(1);
        }

        /* renamed from: a */
        public final void m103453a(C35631Re4<WireBird, Optional<MobilePartner>, BirdSummaryBody, CommandCenterBody, ? extends List<CommandCenterNotice>> c35631Re4) {
            C33356Hl6.this.mo9730v1().onNext(c35631Re4.m86500a());
            C33356Hl6.this.f13859i.onNext(c35631Re4.m86499b());
            C33356Hl6.this.f13860j.onNext(c35631Re4.m86498c());
            C33356Hl6.this.f13861k.onNext(c35631Re4.m86497d());
            C33356Hl6.this.f13862l.onNext(c35631Re4.m86496e());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C35631Re4<? extends WireBird, ? extends Optional<MobilePartner>, ? extends BirdSummaryBody, ? extends CommandCenterBody, ? extends List<? extends CommandCenterNotice>> c35631Re4) {
            m103453a(c35631Re4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Hl6$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3226f extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C3226f(Object obj) {
            super(1, obj, C33356Hl6.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C33356Hl6) this.receiver).m103466l(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010\b\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u0004H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"T1", "T2", "T3", "T4", "T5", "t1", "t2", "t3", "t4", "t5", "LRe4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LRe4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$4\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: Hl6$g */
    /* loaded from: classes3.dex */
    public static final class C3227g<T1, T2, T3, T4, T5, R> implements InterfaceC23487j {

        /* renamed from: a */
        public static final C3227g<T1, T2, T3, T4, T5, R> f13868a = new C3227g<>();

        @Override // io.reactivex.functions.InterfaceC23487j
        /* renamed from: a */
        public final C35631Re4<T1, T2, T3, T4, T5> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            return new C35631Re4<>(t1, t2, t3, t4, t5);
        }
    }

    public C33356Hl6(InterfaceC10636aM birdManager, InterfaceC46473om3 operatorManager, InterfaceC36176Tn0 commandCenterManager, GI3 partnerManager, InterfaceC50047uo0 delegate, InterfaceC33824Jl6 ui, ScopeProvider scopeProvider, InterfaceC50615vl6 converter) {
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(commandCenterManager, "commandCenterManager");
        Intrinsics.checkNotNullParameter(partnerManager, "partnerManager");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f13851a = birdManager;
        this.f13852b = operatorManager;
        this.f13853c = commandCenterManager;
        this.f13854d = partnerManager;
        this.f13855e = delegate;
        this.f13856f = ui;
        this.f13857g = scopeProvider;
        this.f13858h = converter;
        C24552a<Optional<MobilePartner>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Optional<MobilePartner>>()");
        this.f13859i = m31922e;
        C24552a<BirdSummaryBody> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<BirdSummaryBody>()");
        this.f13860j = m31922e2;
        C24552a<CommandCenterBody> m31922e3 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e3, "create<CommandCenterBody>()");
        this.f13861k = m31922e3;
        C24552a<List<CommandCenterNotice>> m31922e4 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e4, "create<List<CommandCenterNotice>>()");
        this.f13862l = m31922e4;
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(mo9730v1(), m31922e, m31922e2, m31922e3, m31922e4, C3227g.f13868a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…nt(t1, t2, t3, t4, t5) })");
        final C3220a c3220a = new C3220a();
        Observable observeOn = combineLatest.flatMapSingle(new InterfaceC23492o() { // from class: Fl6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m103468j;
                m103468j = C33356Hl6.m103468j(Function1.this, obj);
                return m103468j;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3221b c3221b = new C3221b(ui);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Gl6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33356Hl6.m103467k(Function1.this, obj);
            }
        });
    }

    /* renamed from: j */
    public static final InterfaceC23447K m103468j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m103467k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final InterfaceC23447K m103464n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final InterfaceC23447K m103462p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m103461q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m103460r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public final void m103466l(Throwable th) {
        C41318g46.m40159e(th);
        Unit unit = null;
        if (!(th instanceof HttpException)) {
            th = null;
        }
        HttpException httpException = (HttpException) th;
        if (httpException != null) {
            this.f13856f.error(httpException);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f13856f.error(C45871nl4.error_generic_body);
        }
    }

    /* renamed from: m */
    public final <T> AbstractC23442F<T> m103465m(AbstractC23442F<T> abstractC23442F, Observable<T> observable) {
        final C3222c c3222c = new C3222c(observable);
        AbstractC23442F<T> m33150P = abstractC23442F.m33150P(new InterfaceC23492o() { // from class: Bl6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m103464n;
                m103464n = C33356Hl6.m103464n(Function1.this, obj);
                return m103464n;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33150P, "T> Single<T>.onErrorResu…tOrError() } ?: throw e }");
        return m33150P;
    }

    /* renamed from: o */
    public final void m103463o() {
        AbstractC23442F<WireBird> firstOrError = mo9730v1().firstOrError();
        final C3223d c3223d = new C3223d();
        AbstractC23442F m33152N = firstOrError.m33165A(new InterfaceC23492o() { // from class: Cl6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m103462p;
                m103462p = C33356Hl6.m103462p(Function1.this, obj);
                return m103462p;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "private fun refresh() {\n…)\n      }, ::onError)\n  }");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f13857g));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3225e c3225e = new C3225e();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Dl6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33356Hl6.m103461q(Function1.this, obj);
            }
        };
        final C3226f c3226f = new C3226f(this);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: El6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33356Hl6.m103460r(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC50047uo0
    public void onResume() {
        this.f13855e.onResume();
    }

    @Override // p000.InterfaceC50047uo0
    /* renamed from: t1 */
    public void mo9732t1() {
        this.f13855e.mo9732t1();
    }

    @Override // p000.InterfaceC50047uo0
    /* renamed from: u1 */
    public void mo9731u1(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.f13855e.mo9731u1(birdId);
        m103463o();
    }

    @Override // p000.InterfaceC50047uo0
    /* renamed from: v1 */
    public C24552a<WireBird> mo9730v1() {
        return this.f13855e.mo9730v1();
    }
}
