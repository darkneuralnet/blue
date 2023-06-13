package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BatchBirdFraudReport;
import co.bird.android.model.BirdFraudReport;
import co.bird.android.model.User;
import co.bird.android.model.contractor.ContractorSpecialProgramsResponse;
import co.bird.android.model.wire.WireBird;
import co.bird.api.request.ContractorReportFraudBatchBody;
import co.bird.api.request.ContractorReportFraudBody;
import co.bird.api.request.TaskCancelRequestBody;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24575v;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
import p000.InterfaceC38798br4;
@Metadata(m28433d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B9\b\u0007\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020(\u0012\u0006\u0010-\u001a\u00020+\u0012\u0006\u00101\u001a\u00020.¢\u0006\u0004\b7\u00108J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J4\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\tj\b\u0012\u0004\u0012\u00020\u0003`\n2\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J$\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\f2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003H\u0016J\b\u0010\u001d\u001a\u00020\u0018H\u0002R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00069"}, m28432d2 = {"LlB0;", "LjB0;", "Lbr4;", "", "birdId", Entry.TYPE_TEXT, "Lio/reactivex/Observable;", "Lco/bird/android/model/BirdFraudReport;", "f", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "birdIds", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/BatchBirdFraudReport;", "e", "Le13;", "navigator", "Lco/bird/android/model/wire/WireBird;", "bird", "Landroid/location/Location;", "location", "", "startOver", "", "c", "taskId", "reason", DateTokenConverter.CONVERTER_KEY, "i", "LiB0;", "b", "LiB0;", "contractorClient", "LVK;", "LVK;", "birdClient", "LjZ5;", "LjZ5;", "taskClient", "Lgl;", "Lgl;", "preference", "LTq4;", "LTq4;", "reactiveConfig", "LRh6;", "g", "LRh6;", "userStream", "La94;", "Lco/bird/android/model/contractor/ContractorSpecialProgramsResponse;", "h", "La94;", "contractorSpecialProgramsRelay", "<init>", "(LiB0;LVK;LjZ5;Lgl;LTq4;LRh6;)V", "contractor_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nContractorManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContractorManagerImpl.kt\nco/bird/android/manager/contractor/ContractorManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,81:1\n180#2:82\n*S KotlinDebug\n*F\n+ 1 ContractorManagerImpl.kt\nco/bird/android/manager/contractor/ContractorManagerImpl\n*L\n42#1:82\n*E\n"})
/* renamed from: lB0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44346lB0 implements InterfaceC43160jB0, InterfaceC38798br4 {

    /* renamed from: b */
    public final InterfaceC42567iB0 f95681b;

    /* renamed from: c */
    public final InterfaceC8601VK f95682c;

    /* renamed from: d */
    public final InterfaceC43381jZ5 f95683d;

    /* renamed from: e */
    public final C22454gl f95684e;

    /* renamed from: f */
    public final C36207Tq4 f95685f;

    /* renamed from: g */
    public final InterfaceC35660Rh6 f95686g;

    /* renamed from: h */
    public final C37791a94<ContractorSpecialProgramsResponse> f95687h;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: lB0$a */
    /* loaded from: classes4.dex */
    public static final class C25650a extends Lambda implements Function1<User, Unit> {
        public C25650a() {
            super(1);
        }

        /* renamed from: a */
        public final void m27690a(User user) {
            C44346lB0.this.m27693i();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m27690a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lco/bird/android/model/contractor/ContractorSpecialProgramsResponse;", "it", C17296a.f69688o, "(Lco/bird/android/model/contractor/ContractorSpecialProgramsResponse;)Lco/bird/android/model/contractor/ContractorSpecialProgramsResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: lB0$b */
    /* loaded from: classes4.dex */
    public static final class C25651b extends Lambda implements Function1<ContractorSpecialProgramsResponse, ContractorSpecialProgramsResponse> {
        public C25651b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ContractorSpecialProgramsResponse invoke(ContractorSpecialProgramsResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C44346lB0.this.f95684e.m37727H();
        }
    }

    public C44346lB0(InterfaceC42567iB0 contractorClient, InterfaceC8601VK birdClient, InterfaceC43381jZ5 taskClient, C22454gl preference, C36207Tq4 reactiveConfig, InterfaceC35660Rh6 userStream) {
        Intrinsics.checkNotNullParameter(contractorClient, "contractorClient");
        Intrinsics.checkNotNullParameter(birdClient, "birdClient");
        Intrinsics.checkNotNullParameter(taskClient, "taskClient");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        this.f95681b = contractorClient;
        this.f95682c = birdClient;
        this.f95683d = taskClient;
        this.f95684e = preference;
        this.f95685f = reactiveConfig;
        this.f95686g = userStream;
        this.f95687h = C37791a94.C10586a.create$default(C37791a94.f49908h, preference.m37727H(), null, 2, null);
        Observable<User> mo76576i = userStream.mo76576i();
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = mo76576i.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25650a c25650a = new C25650a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: kB0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44346lB0.m27694h(Function1.this, obj);
            }
        });
    }

    /* renamed from: h */
    public static final void m27694h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: c */
    public InterfaceC23497i mo212c() {
        return InterfaceC38798br4.C13315a.m62290e(this);
    }

    @Override // p000.InterfaceC43160jB0
    /* renamed from: d */
    public AbstractC23442F<HM4<WireBird>> mo27698d(String taskId, String reason) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return this.f95683d.m30322b(new TaskCancelRequestBody(taskId, reason));
    }

    @Override // p000.InterfaceC43160jB0
    /* renamed from: e */
    public AbstractC23442F<HM4<BatchBirdFraudReport>> mo27697e(ArrayList<String> birdIds, String text) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        Intrinsics.checkNotNullParameter(text, "text");
        AbstractC23442F<HM4<BatchBirdFraudReport>> m27691v = m27691v(this.f95681b.m34378a(new ContractorReportFraudBatchBody(birdIds, text)));
        Intrinsics.checkNotNullExpressionValue(m27691v, "contractorClient.reportF…ext = text)).schedulers()");
        return m27691v;
    }

    @Override // p000.InterfaceC43160jB0
    /* renamed from: f */
    public Observable<BirdFraudReport> mo27696f(String birdId, String text) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(text, "text");
        Observable<BirdFraudReport> m27692r = m27692r(this.f95681b.m34377b(new ContractorReportFraudBody(birdId, text)));
        Intrinsics.checkNotNullExpressionValue(m27692r, "contractorClient.reportF…ext = text)).schedulers()");
        return m27692r;
    }

    /* renamed from: i */
    public final void m27693i() {
        this.f95687h.m71837i(new C25651b());
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: m */
    public <T> InterfaceC24575v<T, T> mo209m() {
        return InterfaceC38798br4.C13315a.m62288g(this);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: o */
    public <T> InterfaceC23435C<T, T> mo208o() {
        return InterfaceC38798br4.C13315a.m62286i(this);
    }

    /* renamed from: r */
    public <T> Observable<T> m27692r(Observable<T> observable) {
        return InterfaceC38798br4.C13315a.m62280o(this, observable);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: s */
    public <T> InterfaceC23448L<T, T> mo207s() {
        return InterfaceC38798br4.C13315a.m62284k(this);
    }

    /* renamed from: v */
    public <T> AbstractC23442F<T> m27691v(AbstractC23442F<T> abstractC23442F) {
        return InterfaceC38798br4.C13315a.m62279p(this, abstractC23442F);
    }

    @Override // p000.InterfaceC43160jB0
    /* renamed from: c */
    public void mo27699c(InterfaceC40099e13 navigator, WireBird bird, Location location, boolean z) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(location, "location");
        if (this.f95685f.m82623f8().getValue().getMechanicConfig().getShowIssuesToMechs()) {
            navigator.mo36998k(bird, location, z);
        } else {
            navigator.mo37001j2(bird, location, z);
        }
    }
}
