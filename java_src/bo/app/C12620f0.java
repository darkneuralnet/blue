package bo.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import bo.app.C12568c5;
import bo.app.C12620f0;
import bo.app.C12726h5;
import bo.app.C12796j5;
import bo.app.C13020p4;
import bo.app.C13053q4;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.events.IEventSubscriber;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u00020\u0006H\u0007J\b\u0010\u0012\u001a\u00020\u0006H\u0007J\u0006\u0010\u0013\u001a\u00020\u0006J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0007H\u0007R\"\u0010\u0015\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000b\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u0005\u0010\u001e¨\u0006%"}, m28432d2 = {"Lbo/app/f0;", "", "", "initialDelayMs", "Lzh2;", C17296a.f69688o, "", "Lbo/app/g2;", "eventPublisher", "", "throwable", "b", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "", "e", "f", "c", DateTokenConverter.CONVERTER_KEY, "g", "eventManager", "currentIntervalMs", "J", "()J", "setCurrentIntervalMs$android_sdk_base_release", "(J)V", "value", "isSyncPolicyDisabled", "Z", "()Z", "(Z)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lbo/app/e0;", "dataSyncConfigurationProvider", "<init>", "(Landroid/content/Context;Lbo/app/g2;Lbo/app/e0;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.f0 */
/* loaded from: classes.dex */
public final class C12620f0 {

    /* renamed from: n */
    public static final C12625c f58416n = new C12625c(null);

    /* renamed from: a */
    private final Context f58417a;

    /* renamed from: b */
    private final C12592e0 f58418b;

    /* renamed from: c */
    private BroadcastReceiver f58419c;

    /* renamed from: d */
    private ConnectivityManager.NetworkCallback f58420d;

    /* renamed from: e */
    private final C12594e1 f58421e;

    /* renamed from: f */
    private EnumC12747i5 f58422f;

    /* renamed from: g */
    private long f58423g;

    /* renamed from: h */
    private volatile boolean f58424h;

    /* renamed from: i */
    private final ConnectivityManager f58425i;

    /* renamed from: j */
    private EnumC12982o3 f58426j;

    /* renamed from: k */
    private InterfaceC52943zh2 f58427k;

    /* renamed from: l */
    private int f58428l;

    /* renamed from: m */
    private boolean f58429m;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, m28432d2 = {"bo/app/f0$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "", "onCapabilitiesChanged", "onLost", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.f0$a */
    /* loaded from: classes.dex */
    public static final class C12621a extends ConnectivityManager.NetworkCallback {
        public C12621a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
            super.onCapabilitiesChanged(network, networkCapabilities);
            C12620f0.this.m63782a(networkCapabilities);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            super.onLost(network);
            Network activeNetwork = C12620f0.this.f58425i.getActiveNetwork();
            C12620f0 c12620f0 = C12620f0.this;
            c12620f0.m63782a(c12620f0.f58425i.getNetworkCapabilities(activeNetwork));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"bo/app/f0$b", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "intent", "", "onReceive", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.f0$b */
    /* loaded from: classes.dex */
    public static final class C12622b extends BroadcastReceiver {

        /* renamed from: b */
        final /* synthetic */ InterfaceC12658g2 f58432b;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
        @DebugMetadata(m28419c = "com.braze.dispatch.DataSyncPolicyProvider$2$onReceive$1", m28418f = "DataSyncPolicyProvider.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: bo.app.f0$b$a */
        /* loaded from: classes.dex */
        public static final class C12623a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: b */
            int f58433b;

            /* renamed from: c */
            private /* synthetic */ Object f58434c;

            /* renamed from: d */
            final /* synthetic */ C12620f0 f58435d;

            /* renamed from: e */
            final /* synthetic */ Intent f58436e;

            /* renamed from: f */
            final /* synthetic */ InterfaceC12658g2 f58437f;

            /* renamed from: g */
            final /* synthetic */ BroadcastReceiver.PendingResult f58438g;

            @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
            /* renamed from: bo.app.f0$b$a$a */
            /* loaded from: classes.dex */
            public static final class C12624a extends Lambda implements Function0<String> {

                /* renamed from: b */
                public static final C12624a f58439b = new C12624a();

                public C12624a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a */
                public final String invoke() {
                    return "Failed to process connectivity event.";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12623a(C12620f0 c12620f0, Intent intent, InterfaceC12658g2 interfaceC12658g2, BroadcastReceiver.PendingResult pendingResult, Continuation<? super C12623a> continuation) {
                super(2, continuation);
                this.f58435d = c12620f0;
                this.f58436e = intent;
                this.f58437f = interfaceC12658g2;
                this.f58438g = pendingResult;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C12623a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C12623a c12623a = new C12623a(this.f58435d, this.f58436e, this.f58437f, this.f58438g, continuation);
                c12623a.f58434c = obj;
                return c12623a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f58433b == 0) {
                    ResultKt.throwOnFailure(obj);
                    ZC0 zc0 = (ZC0) this.f58434c;
                    try {
                        C12620f0 c12620f0 = this.f58435d;
                        c12620f0.f58426j = C13169v.m62884a(this.f58436e, c12620f0.f58425i);
                        this.f58435d.m63765c();
                    } catch (Exception e) {
                        C43664k20.m29442e(C43664k20.f93782a, zc0, C43664k20.EnumC25082a.E, e, false, C12624a.f58439b, 4, null);
                        this.f58435d.m63771a(this.f58437f, e);
                    }
                    this.f58438g.finish();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public C12622b(InterfaceC12658g2 interfaceC12658g2) {
            this.f58432b = interfaceC12658g2;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            Z30.m73800d(VC1.f38731b, T41.m84377b(), null, new C12623a(C12620f0.this, intent, this.f58432b, goAsync(), null), 2, null);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28432d2 = {"Lbo/app/f0$c;", "", "", "MAX_CONSECUTIVE_SDK_AUTH_FAILURES", "I", "getMAX_CONSECUTIVE_SDK_AUTH_FAILURES$annotations", "()V", "<init>", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.f0$c */
    /* loaded from: classes.dex */
    public static final class C12625c {
        public /* synthetic */ C12625c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12625c() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: bo.app.f0$d */
    /* loaded from: classes.dex */
    public /* synthetic */ class C12626d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58440a;

        static {
            int[] iArr = new int[EnumC12982o3.values().length];
            iArr[EnumC12982o3.NONE.ordinal()] = 1;
            iArr[EnumC12982o3.BAD.ordinal()] = 2;
            iArr[EnumC12982o3.GREAT.ordinal()] = 3;
            iArr[EnumC12982o3.GOOD.ordinal()] = 4;
            f58440a = iArr;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.f0$e */
    /* loaded from: classes.dex */
    public static final class C12627e extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12627e f58441b = new C12627e();

        public C12627e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Received network error event. Backing off.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.f0$f */
    /* loaded from: classes.dex */
    public static final class C12628f extends Lambda implements Function0<String> {
        public C12628f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Received successful request flush. Default flush interval reset to ", Long.valueOf(C12620f0.this.m63769b()));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.f0$g */
    /* loaded from: classes.dex */
    public static final class C12629g extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ long f58443b;

        /* renamed from: c */
        final /* synthetic */ C12620f0 f58444c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12629g(long j, C12620f0 c12620f0) {
            super(0);
            this.f58443b = j;
            this.f58444c = c12620f0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Kicking off the Sync Job. initialDelaysMs: " + this.f58443b + ": currentIntervalMs " + this.f58444c.m63769b() + " ms";
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.dispatch.DataSyncPolicyProvider$kickoffSyncJob$2", m28418f = "DataSyncPolicyProvider.kt", m28417i = {0, 0, 1, 1}, m28416l = {173, 177}, m28415m = "invokeSuspend", m28414n = {"$this$launch", "loopDelayMs", "$this$launch", "loopDelayMs"}, m28413s = {"L$0", "J$0", "L$0", "J$0"})
    /* renamed from: bo.app.f0$h */
    /* loaded from: classes.dex */
    public static final class C12630h extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: b */
        long f58445b;

        /* renamed from: c */
        int f58446c;

        /* renamed from: d */
        private /* synthetic */ Object f58447d;

        /* renamed from: f */
        final /* synthetic */ long f58449f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12630h(long j, Continuation<? super C12630h> continuation) {
            super(2, continuation);
            this.f58449f = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C12630h) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12630h c12630h = new C12630h(this.f58449f, continuation);
            c12630h.f58447d = obj;
            return c12630h;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0067 -> B:20:0x006a). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            ZC0 zc0;
            long j;
            C12630h c12630h;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f58446c;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        j = this.f58445b;
                        zc0 = (ZC0) this.f58447d;
                        ResultKt.throwOnFailure(obj);
                        c12630h = this;
                        P10.getInstance(C12620f0.this.f58417a).requestImmediateDataFlush();
                        if (C37824aD0.m71785f(zc0)) {
                            c12630h.f58447d = zc0;
                            c12630h.f58445b = j;
                            c12630h.f58446c = 2;
                            if (C48120rZ0.m15768a(j, c12630h) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            P10.getInstance(C12620f0.this.f58417a).requestImmediateDataFlush();
                            if (C37824aD0.m71785f(zc0)) {
                                return Unit.INSTANCE;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    j = this.f58445b;
                    zc0 = (ZC0) this.f58447d;
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                zc0 = (ZC0) this.f58447d;
                long m63769b = C12620f0.this.m63769b();
                long j2 = this.f58449f;
                this.f58447d = zc0;
                this.f58445b = m63769b;
                this.f58446c = 1;
                if (C48120rZ0.m15768a(j2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j = m63769b;
            }
            P10.getInstance(C12620f0.this.f58417a).requestImmediateDataFlush();
            c12630h = this;
            if (C37824aD0.m71785f(zc0)) {
            }
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.f0$i */
    /* loaded from: classes.dex */
    public static final class C12631i extends Lambda implements Function0<String> {
        public C12631i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Data flush interval is " + C12620f0.this.m63769b() + " ms. Not scheduling a proceeding data flush.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.f0$j */
    /* loaded from: classes.dex */
    public static final class C12632j extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12632j f58451b = new C12632j();

        public C12632j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to log throwable.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.f0$k */
    /* loaded from: classes.dex */
    public static final class C12633k extends Lambda implements Function0<String> {
        public C12633k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Flush interval was too low (" + C12620f0.this.m63769b() + "), moving to minimum of 1000 ms";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.f0$l */
    /* loaded from: classes.dex */
    public static final class C12634l extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ long f58453b;

        /* renamed from: c */
        final /* synthetic */ C12620f0 f58454c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12634l(long j, C12620f0 c12620f0) {
            super(0);
            this.f58453b = j;
            this.f58454c = c12620f0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Data flush interval has changed from " + this.f58453b + " ms to " + this.f58454c.m63769b() + " ms after connectivity state change to: " + this.f58454c.f58426j + " and session state: " + this.f58454c.f58422f;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.f0$m */
    /* loaded from: classes.dex */
    public static final class C12635m extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ long f58455b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12635m(long j) {
            super(0);
            this.f58455b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Posting new sync runnable with delay " + this.f58455b + " ms";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.f0$n */
    /* loaded from: classes.dex */
    public static final class C12636n extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12636n f58456b = new C12636n();

        public C12636n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "The data sync policy is already running. Ignoring request.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.f0$o */
    /* loaded from: classes.dex */
    public static final class C12637o extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12637o f58457b = new C12637o();

        public C12637o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Data sync started";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.f0$p */
    /* loaded from: classes.dex */
    public static final class C12638p extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12638p f58458b = new C12638p();

        public C12638p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "The data sync policy is not running. Ignoring request.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.f0$q */
    /* loaded from: classes.dex */
    public static final class C12639q extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12639q f58459b = new C12639q();

        public C12639q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Data sync stopped";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.f0$r */
    /* loaded from: classes.dex */
    public static final class C12640r extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12640r f58460b = new C12640r();

        public C12640r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to unregister Connectivity callback";
        }
    }

    public C12620f0(Context context, InterfaceC12658g2 eventPublisher, C12592e0 dataSyncConfigurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventPublisher, "eventPublisher");
        Intrinsics.checkNotNullParameter(dataSyncConfigurationProvider, "dataSyncConfigurationProvider");
        this.f58417a = context;
        this.f58418b = dataSyncConfigurationProvider;
        this.f58421e = new C12594e1((int) TimeUnit.MINUTES.toMillis(5L), 0, 2, null);
        this.f58422f = EnumC12747i5.NO_SESSION;
        this.f58423g = -1L;
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            this.f58425i = (ConnectivityManager) systemService;
            this.f58426j = EnumC12982o3.NONE;
            if (Build.VERSION.SDK_INT >= 30) {
                this.f58420d = new C12621a();
            } else {
                this.f58419c = new C12622b(eventPublisher);
            }
            m63772a(eventPublisher);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    /* renamed from: g */
    public final void m63755g() {
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                ConnectivityManager connectivityManager = this.f58425i;
                ConnectivityManager.NetworkCallback networkCallback = this.f58420d;
                if (networkCallback == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("connectivityNetworkCallback");
                    networkCallback = null;
                }
                connectivityManager.unregisterNetworkCallback(networkCallback);
                return;
            }
            this.f58417a.unregisterReceiver(this.f58419c);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12640r.f58460b, 4, null);
        }
    }

    /* renamed from: e */
    public final synchronized boolean m63759e() {
        if (this.f58424h) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12636n.f58456b, 7, null);
            return false;
        }
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12637o.f58457b, 7, null);
        m63762d();
        m63768b(this.f58423g);
        this.f58424h = true;
        return true;
    }

    /* renamed from: f */
    public final synchronized boolean m63757f() {
        if (!this.f58424h) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12638p.f58458b, 7, null);
            return false;
        }
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12639q.f58459b, 7, null);
        m63784a();
        m63755g();
        this.f58424h = false;
        return true;
    }

    /* renamed from: b */
    public final long m63769b() {
        return this.f58423g;
    }

    /* renamed from: c */
    public final void m63765c() {
        long j;
        long j2 = this.f58423g;
        if (this.f58422f != EnumC12747i5.NO_SESSION && !this.f58429m && this.f58428l < 50) {
            int i = C12626d.f58440a[this.f58426j.ordinal()];
            if (i == 1) {
                j = -1;
            } else if (i == 2) {
                j = this.f58418b.m63825a();
            } else if (i == 3) {
                j = this.f58418b.m63823c();
            } else if (i != 4) {
                throw new NoWhenBranchMatchedException();
            } else {
                j = this.f58418b.m63824b();
            }
            this.f58423g = j;
            if (j != -1 && j < 1000) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C12633k(), 6, null);
                this.f58423g = 1000L;
            }
        } else {
            this.f58423g = -1L;
        }
        if (j2 != this.f58423g) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12634l(j2, this), 7, null);
            m63768b(this.f58423g);
        }
    }

    /* renamed from: d */
    public final void m63762d() {
        if (Build.VERSION.SDK_INT >= 30) {
            ConnectivityManager connectivityManager = this.f58425i;
            ConnectivityManager.NetworkCallback networkCallback = this.f58420d;
            if (networkCallback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connectivityNetworkCallback");
                networkCallback = null;
            }
            connectivityManager.registerDefaultNetworkCallback(networkCallback);
            m63782a(this.f58425i.getNetworkCapabilities(this.f58425i.getActiveNetwork()));
        }
    }

    /* renamed from: b */
    private final void m63768b(long j) {
        m63784a();
        if (this.f58423g >= 1000) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12635m(j), 7, null);
            this.f58427k = m63783a(j);
        }
    }

    /* renamed from: a */
    public final synchronized void m63770a(boolean z) {
        this.f58429m = z;
        m63765c();
        if (z) {
            m63757f();
        } else {
            m63759e();
        }
    }

    /* renamed from: a */
    private final InterfaceC52943zh2 m63783a(long j) {
        InterfaceC52943zh2 m73800d;
        if (this.f58423g >= 1000) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C12629g(j, this), 6, null);
            m73800d = Z30.m73800d(Z10.f47750b, null, null, new C12630h(j, null), 3, null);
            return m73800d;
        }
        P10.getInstance(this.f58417a).requestImmediateDataFlush();
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12631i(), 7, null);
        return null;
    }

    /* renamed from: a */
    private final void m63784a() {
        InterfaceC52943zh2 interfaceC52943zh2 = this.f58427k;
        if (interfaceC52943zh2 != null) {
            InterfaceC52943zh2.C31478a.m550a(interfaceC52943zh2, null, 1, null);
        }
        this.f58427k = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m63771a(InterfaceC12658g2 interfaceC12658g2, Throwable th) {
        try {
            interfaceC12658g2.mo63715a((InterfaceC12658g2) th, (Class<InterfaceC12658g2>) Throwable.class);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12632j.f58451b, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m63782a(NetworkCapabilities networkCapabilities) {
        this.f58426j = C13169v.m62883a(networkCapabilities);
        m63765c();
    }

    /* renamed from: a */
    public final void m63772a(InterfaceC12658g2 eventManager) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        eventManager.mo63714b(new IEventSubscriber() { // from class: pN6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C12620f0.m63777a(C12620f0.this, (C12726h5) obj);
            }
        }, C12726h5.class);
        eventManager.mo63714b(new IEventSubscriber() { // from class: qN6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C12620f0.m63776a(C12620f0.this, (C12796j5) obj);
            }
        }, C12796j5.class);
        eventManager.mo63714b(new IEventSubscriber() { // from class: rN6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C12620f0.m63774a(C12620f0.this, (C13020p4) obj);
            }
        }, C13020p4.class);
        eventManager.mo63714b(new IEventSubscriber() { // from class: sN6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C12620f0.m63773a(C12620f0.this, (C13053q4) obj);
            }
        }, C13053q4.class);
        eventManager.mo63714b(new IEventSubscriber() { // from class: tN6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C12620f0.m63779a(C12620f0.this, (C12568c5) obj);
            }
        }, C12568c5.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m63777a(C12620f0 this$0, C12726h5 c12726h5) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f58422f = EnumC12747i5.OPEN_SESSION;
        this$0.f58428l = 0;
        this$0.m63765c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m63776a(C12620f0 this$0, C12796j5 c12796j5) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f58422f = EnumC12747i5.NO_SESSION;
        this$0.m63765c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m63774a(C12620f0 this$0, C13020p4 c13020p4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C43664k20.m29442e(C43664k20.f93782a, this$0, null, null, false, C12627e.f58441b, 7, null);
        long j = this$0.f58423g;
        this$0.m63768b(j + this$0.f58421e.m63822a((int) j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m63773a(C12620f0 this$0, C13053q4 c13053q4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f58421e.m63820b()) {
            this$0.f58421e.m63818c();
            C43664k20.m29442e(C43664k20.f93782a, this$0, null, null, false, new C12628f(), 7, null);
            this$0.m63768b(this$0.f58423g);
        }
        this$0.f58428l = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m63779a(C12620f0 this$0, C12568c5 c12568c5) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (c12568c5.m63870a() instanceof C13147t4) {
            this$0.f58428l++;
            this$0.m63765c();
        }
    }
}
