package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireRide;
import co.bird.api.request.CreateRatingBody;
import co.bird.api.request.TaskIssueBody;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24575v;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC38798br4;
@Metadata(m28433d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001-B!\b\u0007\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020(¢\u0006\u0004\b+\u0010,J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0016J0\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0016J,\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00130\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0015\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J2\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00130\u00122\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J<\u0010\u001f\u001a,\u0012(\u0012&\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0007\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001e0\t0\u00130\u001d0\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016J0\u0010 \u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0002R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)¨\u0006."}, m28432d2 = {"LJk1;", "Lbr4;", "LFk1;", "Lco/bird/android/model/wire/WireRide;", "ride", "", "rating", "", "feedback", "", "issues", "Lio/reactivex/c;", DateTokenConverter.CONVERTER_KEY, "", "g", "birdId", "Lco/bird/android/model/constant/MapMode;", "role", "Lio/reactivex/F;", "", "f", "taskId", "notes", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireBird;", "e", "", "locking", "h", "LHM4;", "", "c", "D", "LBa5;", "b", "LBa5;", "riderRatingClient", "Lmn4;", "Lmn4;", "ratingClient", "LjZ5;", "LjZ5;", "taskClient", "<init>", "(LBa5;Lmn4;LjZ5;)V", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFeedbackManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedbackManagerImpl.kt\nco/bird/android/app/manager/FeedbackManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,103:1\n237#2:104\n*S KotlinDebug\n*F\n+ 1 FeedbackManagerImpl.kt\nco/bird/android/app/manager/FeedbackManagerImpl\n*L\n56#1:104\n*E\n"})
/* renamed from: Jk1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33810Jk1 implements InterfaceC38798br4, InterfaceC32874Fk1 {

    /* renamed from: e */
    public static final C4216a f18105e = new C4216a(null);

    /* renamed from: f */
    public static final int f18106f = 8;

    /* renamed from: b */
    public final InterfaceC31852Ba5 f18107b;

    /* renamed from: c */
    public final InterfaceC45298mn4 f18108c;

    /* renamed from: d */
    public final InterfaceC43381jZ5 f18109d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LJk1$a;", "", "", "ASYNC_TIMEOUT_SECONDS", "J", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Jk1$a */
    /* loaded from: classes2.dex */
    public static final class C4216a {
        public /* synthetic */ C4216a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4216a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Jk1$b */
    /* loaded from: classes2.dex */
    public static final class C4217b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireRide f18110g;

        /* renamed from: h */
        public final /* synthetic */ float f18111h;

        /* renamed from: i */
        public final /* synthetic */ String f18112i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4217b(WireRide wireRide, float f, String str) {
            super(1);
            this.f18110g = wireRide;
            this.f18111h = f;
            this.f18112i = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            String id = this.f18110g.getId();
            float f = this.f18111h;
            String str = this.f18112i;
            C41318g46.m40158f(th, "error submitting ride feedback for ride " + id + ", rating = " + f + ", feedback = " + str, new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Jk1$c */
    /* loaded from: classes2.dex */
    public static final class C4218c extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C4218c f18113g = new C4218c();

        public C4218c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "uncaught error in async ride feedback submission", new Object[0]);
        }
    }

    public C33810Jk1(InterfaceC31852Ba5 riderRatingClient, InterfaceC45298mn4 ratingClient, InterfaceC43381jZ5 taskClient) {
        Intrinsics.checkNotNullParameter(riderRatingClient, "riderRatingClient");
        Intrinsics.checkNotNullParameter(ratingClient, "ratingClient");
        Intrinsics.checkNotNullParameter(taskClient, "taskClient");
        this.f18107b = riderRatingClient;
        this.f18108c = ratingClient;
        this.f18109d = taskClient;
    }

    /* renamed from: C */
    public static final void m99889C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m99875y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m99874z(WireRide ride) {
        Intrinsics.checkNotNullParameter(ride, "$ride");
        String id = ride.getId();
        C41318g46.m40163a("submitted ride feedback for ride " + id, new Object[0]);
    }

    /* renamed from: D */
    public final AbstractC23461c m99888D(WireRide wireRide, float f, String str, List<String> list) {
        AbstractC23461c ignoreElements = this.f18107b.m113842a(new CreateRatingBody(wireRide.getId(), Double.valueOf(f), str, list)).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(ignoreElements, "riderRatingClient\n      …)\n      .ignoreElements()");
        return ignoreElements;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: c */
    public InterfaceC23497i mo212c() {
        return InterfaceC38798br4.C13315a.m62290e(this);
    }

    @Override // p000.InterfaceC32874Fk1
    /* renamed from: d */
    public AbstractC23461c mo99886d(WireRide ride, float f, String str, List<String> issues) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        Intrinsics.checkNotNullParameter(issues, "issues");
        AbstractC23461c m99878v = m99878v(m99888D(ride, f, str, issues));
        Intrinsics.checkNotNullExpressionValue(m99878v, "submitRideFeedbackClient…    )\n      .schedulers()");
        return m99878v;
    }

    @Override // p000.InterfaceC32874Fk1
    /* renamed from: e */
    public Observable<WireBird> mo99885e(String taskId, List<String> issues, String notes) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(issues, "issues");
        Intrinsics.checkNotNullParameter(notes, "notes");
        Observable<WireBird> m99877w = m99877w(this.f18109d.m30318f(new TaskIssueBody(taskId, issues, notes)));
        Intrinsics.checkNotNullExpressionValue(m99877w, "taskClient.markTaskIssue…     )\n    ).schedulers()");
        return m99877w;
    }

    @Override // p000.InterfaceC32874Fk1
    /* renamed from: f */
    public AbstractC23442F<Map<String, String>> mo99884f(String str, MapMode role) {
        Intrinsics.checkNotNullParameter(role, "role");
        AbstractC23442F<Map<String, String>> m99876x = m99876x(this.f18108c.m24992d(str, role.toScanMode().toString()));
        Intrinsics.checkNotNullExpressionValue(m99876x, "ratingClient\n      .getI…ng())\n      .schedulers()");
        return m99876x;
    }

    @Override // p000.InterfaceC32874Fk1
    /* renamed from: g */
    public void mo99883g(final WireRide ride, float f, String str, List<String> issues) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        Intrinsics.checkNotNullParameter(issues, "issues");
        AbstractC23461c m33061Z = m99888D(ride, f, str, issues).m33061Z(25L, TimeUnit.SECONDS);
        final C4217b c4217b = new C4217b(ride, f, str);
        AbstractC23461c m33069Q = m33061Z.m33084B(new InterfaceC23484g() { // from class: Gk1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33810Jk1.m99875y(Function1.this, obj);
            }
        }).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "ride: WireRide, rating: …\n      .onErrorComplete()");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: Hk1
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C33810Jk1.m99874z(WireRide.this);
            }
        };
        final C4218c c4218c = C4218c.f18113g;
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: Ik1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33810Jk1.m99889C(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC32874Fk1
    /* renamed from: h */
    public AbstractC23442F<Map<String, String>> mo99882h(String birdId, boolean z, MapMode role) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(role, "role");
        return this.f18108c.m24994b(birdId, z, role.toScanMode().toString());
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: o */
    public <T> InterfaceC23435C<T, T> mo208o() {
        return InterfaceC38798br4.C13315a.m62286i(this);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: s */
    public <T> InterfaceC23448L<T, T> mo207s() {
        return InterfaceC38798br4.C13315a.m62284k(this);
    }

    /* renamed from: v */
    public AbstractC23461c m99878v(AbstractC23461c abstractC23461c) {
        return InterfaceC38798br4.C13315a.m62282m(this, abstractC23461c);
    }

    /* renamed from: w */
    public <T> Observable<T> m99877w(Observable<T> observable) {
        return InterfaceC38798br4.C13315a.m62280o(this, observable);
    }

    /* renamed from: x */
    public <T> AbstractC23442F<T> m99876x(AbstractC23442F<T> abstractC23442F) {
        return InterfaceC38798br4.C13315a.m62279p(this, abstractC23442F);
    }

    @Override // p000.InterfaceC32874Fk1
    /* renamed from: c */
    public AbstractC23442F<HM4<Map<String, List<Map<String, String>>>>> mo99887c(String str) {
        AbstractC23442F<HM4<Map<String, List<Map<String, String>>>>> m33142Y = this.f18108c.m24993c(str).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "ratingClient.getVehicleA…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: m */
    public <T> InterfaceC24575v<T, T> mo209m() {
        return InterfaceC38798br4.C13315a.m62288g(this);
    }
}
