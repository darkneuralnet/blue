package co.bird.android.app.feature.bluetooth.job;

import android.content.Context;
import android.location.Location;
import androidx.work.AbstractC12126c;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.bluetooth.job.HeadlessSweepWorker;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.InterfaceC5225MD;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001)B\u0017\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006*"}, m28432d2 = {"Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;", "Landroidx/work/RxWorker;", "Lio/reactivex/F;", "Landroidx/work/c$a;", "r", "", "scanPeriodSeconds", "", "trigger", "A", "LMD;", "h", "LMD;", "x", "()LMD;", "setBaseBluetoothManager", "(LMD;)V", "baseBluetoothManager", "Lpv0;", "i", "Lpv0;", "y", "()Lpv0;", "setConfigManager", "(Lpv0;)V", "configManager", "Ldr4;", "j", "Ldr4;", "z", "()Ldr4;", "setReactiveLocationManager", "(Ldr4;)V", "reactiveLocationManager", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "k", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class HeadlessSweepWorker extends RxWorker {

    /* renamed from: k */
    public static final C13696a f61333k = new C13696a(null);

    /* renamed from: l */
    public static final int f61334l = 8;

    /* renamed from: h */
    public InterfaceC5225MD f61335h;

    /* renamed from: i */
    public InterfaceC47153pv0 f61336i;

    /* renamed from: j */
    public InterfaceC40001dr4 f61337j;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker$a;", "", "", "END_TASK_DELAY_SECONDS", "J", "", "PERIODIC", "Ljava/lang/String;", "TRIGGERED", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.bluetooth.job.HeadlessSweepWorker$a */
    /* loaded from: classes2.dex */
    public static final class C13696a {
        public /* synthetic */ C13696a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13696a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "it", "Lio/reactivex/K;", "Landroidx/work/c$a;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/Config;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.bluetooth.job.HeadlessSweepWorker$b */
    /* loaded from: classes2.dex */
    public static final class C13697b extends Lambda implements Function1<Config, InterfaceC23447K<? extends AbstractC12126c.AbstractC12127a>> {
        public C13697b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends AbstractC12126c.AbstractC12127a> invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getBeaconConfig().getEnableBluetoothScanReporting()) {
                return HeadlessSweepWorker.this.m60771A(it.getBeaconConfig().getHeadlessScanPeriod(), HeadlessSweepWorker.this.m65572g().m65585i("co.bird.android.app.feature.bluetooth.job.trigger"));
            }
            AbstractC23442F m33158H = AbstractC23442F.m33158H(AbstractC12126c.AbstractC12127a.m65564a());
            Intrinsics.checkNotNullExpressionValue(m33158H, "{\n          Single.just(…sult.failure())\n        }");
            return m33158H;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/location/Location;", "it", "Lio/reactivex/B;", "LTk5;", "kotlin.jvm.PlatformType", "invoke", "(Landroid/location/Location;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.bluetooth.job.HeadlessSweepWorker$c */
    /* loaded from: classes2.dex */
    public static final class C13698c extends Lambda implements Function1<Location, InterfaceC23434B<? extends C36154Tk5>> {

        /* renamed from: h */
        public final /* synthetic */ String f61340h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13698c(String str) {
            super(1);
            this.f61340h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends C36154Tk5> invoke(Location it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return InterfaceC5225MD.C5226a.scanBleDevices$default(HeadlessSweepWorker.this.m60766x(), 2, false, this.f61340h, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadlessSweepWorker(Context context, WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        H22.f12748a.mo24084O1(this);
    }

    /* renamed from: B */
    public static final InterfaceC23434B m60770B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final InterfaceC23447K m60767w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final AbstractC23442F<AbstractC12126c.AbstractC12127a> m60771A(long j, String str) {
        AbstractC23442F<Location> mo43627e = m60764z().mo43627e(false);
        final C13698c c13698c = new C13698c(str);
        Observable<R> m33162D = mo43627e.m33162D(new InterfaceC23492o() { // from class: NH1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m60770B;
                m60770B = HeadlessSweepWorker.m60770B(Function1.this, obj);
                return m60770B;
            }
        });
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AbstractC23442F<AbstractC12126c.AbstractC12127a> m33122l = m33162D.takeUntil(Observable.timer(j, timeUnit)).ignoreElements().m33046j0(AbstractC12126c.AbstractC12127a.m65562c()).m33148R(AbstractC12126c.AbstractC12127a.m65563b()).m33122l(10L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(m33122l, "private fun headlessScan…DS, TimeUnit.SECONDS)\n  }");
        return m33122l;
    }

    @Override // androidx.work.RxWorker
    /* renamed from: r */
    public AbstractC23442F<AbstractC12126c.AbstractC12127a> mo55853r() {
        Observable<Config> mo2277l0 = m60765y().mo2277l0(null);
        final C13697b c13697b = new C13697b();
        AbstractC23442F<AbstractC12126c.AbstractC12127a> singleOrError = mo2277l0.flatMapSingle(new InterfaceC23492o() { // from class: OH1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m60767w;
                m60767w = HeadlessSweepWorker.m60767w(Function1.this, obj);
                return m60767w;
            }
        }).singleOrError();
        Intrinsics.checkNotNullExpressionValue(singleOrError, "override fun createWork(…     .singleOrError()\n  }");
        return singleOrError;
    }

    /* renamed from: x */
    public final InterfaceC5225MD m60766x() {
        InterfaceC5225MD interfaceC5225MD = this.f61335h;
        if (interfaceC5225MD != null) {
            return interfaceC5225MD;
        }
        Intrinsics.throwUninitializedPropertyAccessException("baseBluetoothManager");
        return null;
    }

    /* renamed from: y */
    public final InterfaceC47153pv0 m60765y() {
        InterfaceC47153pv0 interfaceC47153pv0 = this.f61336i;
        if (interfaceC47153pv0 != null) {
            return interfaceC47153pv0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("configManager");
        return null;
    }

    /* renamed from: z */
    public final InterfaceC40001dr4 m60764z() {
        InterfaceC40001dr4 interfaceC40001dr4 = this.f61337j;
        if (interfaceC40001dr4 != null) {
            return interfaceC40001dr4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reactiveLocationManager");
        return null;
    }
}
