package co.bird.android.manager.analytics.workers;

import android.content.Context;
import androidx.work.AbstractC12126c;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.manager.analytics.workers.AnalyticsSubmitWorker;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.schedulers.C24542a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker;", "Landroidx/work/RxWorker;", "Lio/reactivex/F;", "Landroidx/work/c$a;", "r", "LEa;", "h", "LEa;", "A", "()LEa;", "setAnalyticsManager", "(LEa;)V", "analyticsManager", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "i", C17296a.f69688o, "analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class AnalyticsSubmitWorker extends RxWorker {

    /* renamed from: i */
    public static final C16094a f66229i = new C16094a(null);

    /* renamed from: h */
    public InterfaceC1880Ea f66230h;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker$a;", "", "", "WORKER_ID", "Ljava/lang/String;", "<init>", "()V", "analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.analytics.workers.AnalyticsSubmitWorker$a */
    /* loaded from: classes4.dex */
    public static final class C16094a {
        public /* synthetic */ C16094a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16094a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.analytics.workers.AnalyticsSubmitWorker$b */
    /* loaded from: classes4.dex */
    public static final class C16095b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C16095b f66231g = new C16095b();

        public C16095b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            String message = th.getMessage();
            C41318g46.m40160d("error: " + message, new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.analytics.workers.AnalyticsSubmitWorker$c */
    /* loaded from: classes4.dex */
    public static final class C16096c extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C16096c f66232g = new C16096c();

        public C16096c() {
            super(1);
        }

        /* renamed from: a */
        public final void m55846a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("submitting analytics", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m55846a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsSubmitWorker(Context context, WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Context applicationContext = m65576b();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(applicationContext);
        Intrinsics.checkNotNull(m21419a, "null cannot be cast to non-null type co.bird.android.manager.analytics.workers.AnalyticsWorkerComponent");
        ((InterfaceC13603cb) m21419a).mo61189u3(this);
    }

    /* renamed from: x */
    public static final void m55849x() {
        C41318g46.m40163a("submitted analytics", new Object[0]);
    }

    /* renamed from: y */
    public static final void m55848y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m55847z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final InterfaceC1880Ea m55854A() {
        InterfaceC1880Ea interfaceC1880Ea = this.f66230h;
        if (interfaceC1880Ea != null) {
            return interfaceC1880Ea;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsManager");
        return null;
    }

    @Override // androidx.work.RxWorker
    /* renamed from: r */
    public AbstractC23442F<AbstractC12126c.AbstractC12127a> mo55853r() {
        AbstractC23461c m33029z = m55854A().mo55971C().m33029z(new InterfaceC23478a() { // from class: Wa
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                AnalyticsSubmitWorker.m55849x();
            }
        });
        final C16095b c16095b = C16095b.f66231g;
        AbstractC23461c m33084B = m33029z.m33084B(new InterfaceC23484g() { // from class: Xa
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AnalyticsSubmitWorker.m55848y(Function1.this, obj);
            }
        });
        final C16096c c16096c = C16096c.f66232g;
        AbstractC23442F<AbstractC12126c.AbstractC12127a> m33148R = m33084B.m33081E(new InterfaceC23484g() { // from class: Ya
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AnalyticsSubmitWorker.m55847z(Function1.this, obj);
            }
        }).m33063X(C24542a.m31932c()).m33046j0(AbstractC12126c.AbstractC12127a.m65562c()).m33148R(AbstractC12126c.AbstractC12127a.m65563b());
        Intrinsics.checkNotNullExpressionValue(m33148R, "analyticsManager.submitS…eturnItem(Result.retry())");
        return m33148R;
    }
}
