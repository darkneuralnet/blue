package bo.app;

import android.content.Context;
import bo.app.C12566c3;
import bo.app.C12569c6;
import bo.app.C12612e5;
import bo.app.C12613e6;
import bo.app.C12662g5;
import bo.app.C12818k3;
import bo.app.C12876l6;
import bo.app.C12912m5;
import bo.app.C12916n0;
import bo.app.C12917n1;
import bo.app.C12926n6;
import bo.app.C13013p0;
import bo.app.C13176v3;
import bo.app.C13272z0;
import bo.app.C13283z4;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.BrazeInternal;
import com.appboy.events.IEventSubscriber;
import com.facebook.share.internal.C17296a;
import java.util.EnumSet;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010?\u001a\u00020>\u0012\b\b\u0001\u0010A\u001a\u00020@\u0012\b\b\u0001\u0010\"\u001a\u00020!\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010G\u001a\u00020F\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u0010M\u001a\u00020L\u0012\u0006\u0010N\u001a\u00020\u0006\u0012\b\b\u0001\u0010P\u001a\u00020O\u0012\u0006\u0010R\u001a\u00020Q\u0012\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bU\u0010VJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\b\u0010\u000e\u001a\u00020\u0004H\u0007R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\f8G¢\u0006\u0006\u001a\u0004\b'\u0010\u0011R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\f8G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0011R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\f8G¢\u0006\u0006\u001a\u0004\b,\u0010\u0011R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020.0\f8G¢\u0006\u0006\u001a\u0004\b/\u0010\u0011R\u0017\u00103\u001a\b\u0012\u0004\u0012\u0002010\f8G¢\u0006\u0006\u001a\u0004\b2\u0010\u0011R\u0017\u00106\u001a\b\u0012\u0004\u0012\u0002040\f8G¢\u0006\u0006\u001a\u0004\b5\u0010\u0011R\u0017\u00109\u001a\b\u0012\u0004\u0012\u0002070\f8G¢\u0006\u0006\u001a\u0004\b8\u0010\u0011¨\u0006W"}, m28432d2 = {"Lbo/app/z0;", "", "Lbo/app/g5;", "sessionSealedEvent", "", C17296a.f69688o, "Lbo/app/g2;", "eventMessenger", "p", "o", "Ljava/util/concurrent/Semaphore;", "semaphore", "Lcom/appboy/events/IEventSubscriber;", "", "q", "Lbo/app/k3;", "e", "()Lcom/appboy/events/IEventSubscriber;", "messagingSessionEventSubscriber", "h", "sessionSealedEventSubscriber", "Lbo/app/z4;", "f", "serverConfigEventSubscriber", "Lbo/app/e6;", "k", "triggerEventEventSubscriber", "Lbo/app/l6;", "l", "triggeredActionRetryEventSubscriber", "Lbo/app/m5;", "i", "storageExceptionSubscriber", "Lbo/app/p6;", "userCache", "Lbo/app/p6;", "n", "()Lbo/app/p6;", "Lbo/app/p0;", "b", "dispatchSucceededEventSubscriber", "Lbo/app/n0;", "dispatchFailedEventSubscriber", "Lbo/app/e5;", "g", "sessionCreatedEventSubscriber", "Lbo/app/n1;", "c", "geofencesEventSubscriber", "Lbo/app/c6;", "j", "triggerEligiblePushClickEventSubscriber", "Lbo/app/n6;", "m", "triggeredActionsReceivedEventSubscriber", "Lbo/app/c3;", DateTokenConverter.CONVERTER_KEY, "inAppMessagePublishEventSubscriber", "Landroid/content/Context;", "applicationContext", "Lbo/app/i2;", "locationManager", "Lbo/app/e2;", "dispatchManager", "Lbo/app/p;", "brazeManager", "Lbo/app/i0;", "deviceCache", "Lbo/app/u2;", "triggerManager", "Lbo/app/x2;", "triggerReEligibilityManager", "Lbo/app/c1;", "eventStorageManager", "Lbo/app/l;", "geofenceManager", "Lbo/app/w5;", "testUserDeviceLoggingManager", "externalEventPublisher", "LX10;", "configurationProvider", "Lbo/app/y;", "contentCardsStorageProvider", "Lbo/app/w4;", "sdkMetadataCache", "<init>", "(Landroid/content/Context;Lbo/app/i2;Lbo/app/e2;Lbo/app/p;Lbo/app/p6;Lbo/app/i0;Lbo/app/u2;Lbo/app/x2;Lbo/app/c1;Lbo/app/l;Lbo/app/w5;Lbo/app/g2;LX10;Lbo/app/y;Lbo/app/w4;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.z0 */
/* loaded from: classes.dex */
public final class C13272z0 {

    /* renamed from: a */
    private final Context f59519a;

    /* renamed from: b */
    private final InterfaceC12742i2 f59520b;

    /* renamed from: c */
    private final InterfaceC12599e2 f59521c;

    /* renamed from: d */
    public final C12989p f59522d;

    /* renamed from: e */
    private final C13023p6 f59523e;

    /* renamed from: f */
    private final C12731i0 f59524f;

    /* renamed from: g */
    private final InterfaceC13162u2 f59525g;

    /* renamed from: h */
    private final InterfaceC13201x2 f59526h;

    /* renamed from: i */
    private final C12559c1 f59527i;

    /* renamed from: j */
    private final C12832l f59528j;

    /* renamed from: k */
    private final C13194w5 f59529k;

    /* renamed from: l */
    private final InterfaceC12658g2 f59530l;

    /* renamed from: m */
    private final X10 f59531m;

    /* renamed from: n */
    private final C13205y f59532n;

    /* renamed from: o */
    private final C13192w4 f59533o;

    /* renamed from: p */
    public final AtomicBoolean f59534p;

    /* renamed from: q */
    private final AtomicBoolean f59535q;

    /* renamed from: r */
    private C12569c6 f59536r;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.z0$a */
    /* loaded from: classes.dex */
    public static final class C13273a extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13273a f59537b = new C13273a();

        public C13273a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to log error.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.z0$b */
    /* loaded from: classes.dex */
    public static final class C13274b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13232y2 f59538b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13274b(InterfaceC13232y2 interfaceC13232y2) {
            super(0);
            this.f59538b = interfaceC13232y2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Could not publish in-app message with trigger action id: ", this.f59538b.getId());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.z0$c */
    /* loaded from: classes.dex */
    public static final class C13275c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13275c f59539b = new C13275c();

        public C13275c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Requesting trigger refresh.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.z0$d */
    /* loaded from: classes.dex */
    public static final class C13276d extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13276d f59540b = new C13276d();

        public C13276d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Session start event for new session received.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.z0$e */
    /* loaded from: classes.dex */
    public static final class C13277e extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13277e f59541b = new C13277e();

        public C13277e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Not automatically requesting Braze Geofence refresh on session created event due to configuration.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.z0$f */
    /* loaded from: classes.dex */
    public static final class C13278f extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13278f f59542b = new C13278f();

        public C13278f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to log the storage exception.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.z0$g */
    /* loaded from: classes.dex */
    public static final class C13279g extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13279g f59543b = new C13279g();

        public C13279g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Requesting trigger update due to trigger-eligible push click event";
        }
    }

    public C13272z0(Context applicationContext, InterfaceC12742i2 locationManager, InterfaceC12599e2 dispatchManager, C12989p brazeManager, C13023p6 userCache, C12731i0 deviceCache, InterfaceC13162u2 triggerManager, InterfaceC13201x2 triggerReEligibilityManager, C12559c1 eventStorageManager, C12832l geofenceManager, C13194w5 testUserDeviceLoggingManager, InterfaceC12658g2 externalEventPublisher, X10 configurationProvider, C13205y contentCardsStorageProvider, C13192w4 sdkMetadataCache) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(dispatchManager, "dispatchManager");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(userCache, "userCache");
        Intrinsics.checkNotNullParameter(deviceCache, "deviceCache");
        Intrinsics.checkNotNullParameter(triggerManager, "triggerManager");
        Intrinsics.checkNotNullParameter(triggerReEligibilityManager, "triggerReEligibilityManager");
        Intrinsics.checkNotNullParameter(eventStorageManager, "eventStorageManager");
        Intrinsics.checkNotNullParameter(geofenceManager, "geofenceManager");
        Intrinsics.checkNotNullParameter(testUserDeviceLoggingManager, "testUserDeviceLoggingManager");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(contentCardsStorageProvider, "contentCardsStorageProvider");
        Intrinsics.checkNotNullParameter(sdkMetadataCache, "sdkMetadataCache");
        this.f59519a = applicationContext;
        this.f59520b = locationManager;
        this.f59521c = dispatchManager;
        this.f59522d = brazeManager;
        this.f59523e = userCache;
        this.f59524f = deviceCache;
        this.f59525g = triggerManager;
        this.f59526h = triggerReEligibilityManager;
        this.f59527i = eventStorageManager;
        this.f59528j = geofenceManager;
        this.f59529k = testUserDeviceLoggingManager;
        this.f59530l = externalEventPublisher;
        this.f59531m = configurationProvider;
        this.f59532n = contentCardsStorageProvider;
        this.f59533o = sdkMetadataCache;
        this.f59534p = new AtomicBoolean(false);
        this.f59535q = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m62643a(C13272z0 this$0, C13013p0 c13013p0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC13280z1 m63158a = c13013p0.m63158a();
        C12697h0 mo62586f = m63158a.mo62586f();
        boolean z = true;
        if (mo62586f != null) {
            this$0.f59524f.m63970a((C12731i0) mo62586f, true);
        }
        C13191w3 mo62590d = m63158a.mo62590d();
        if (mo62590d != null) {
            this$0.m62615n().m63970a((C13023p6) mo62590d, true);
        }
        C12810k mo62588e = m63158a.mo62588e();
        if (mo62588e != null) {
            this$0.f59527i.m63880a(mo62588e.m63467b());
        }
        C13176v3 mo62592c = m63158a.mo62592c();
        if (mo62592c == null || !mo62592c.m62872x()) {
            z = false;
        }
        if (z) {
            this$0.f59522d.m63186b(false);
        }
        EnumSet<EnumC49593u20> mo62582i = m63158a.mo62582i();
        if (mo62582i == null) {
            return;
        }
        this$0.f59533o.m62842a(mo62582i);
    }

    /* renamed from: p */
    public final void m62611p() {
        if (this.f59534p.compareAndSet(true, false)) {
            this.f59525g.mo62891a(new C13113s3());
        }
    }

    /* renamed from: q */
    public final void m62610q() {
        if (this.f59522d.m63183f()) {
            this.f59534p.set(true);
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C13275c.f59539b, 7, null);
            this.f59522d.mo62755a(new C13176v3.C13177a(null, null, null, null, 15, null).m62862c());
            this.f59522d.m63186b(false);
        }
    }

    /* renamed from: e */
    private final IEventSubscriber<C12818k3> m62633e() {
        return new IEventSubscriber() { // from class: yP6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C13272z0.m62649a(C13272z0.this, (C12818k3) obj);
            }
        };
    }

    /* renamed from: f */
    private final IEventSubscriber<C13283z4> m62631f() {
        return new IEventSubscriber() { // from class: uP6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C13272z0.m62642a(C13272z0.this, (C13283z4) obj);
            }
        };
    }

    /* renamed from: h */
    private final IEventSubscriber<C12662g5> m62627h() {
        return new IEventSubscriber() { // from class: xP6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C13272z0.m62650a(C13272z0.this, (C12662g5) obj);
            }
        };
    }

    /* renamed from: i */
    private final IEventSubscriber<C12912m5> m62625i() {
        return new IEventSubscriber() { // from class: AP6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C13272z0.m62647a(C13272z0.this, (C12912m5) obj);
            }
        };
    }

    /* renamed from: k */
    private final IEventSubscriber<C12613e6> m62621k() {
        return new IEventSubscriber() { // from class: qP6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C13272z0.m62651a(C13272z0.this, (C12613e6) obj);
            }
        };
    }

    /* renamed from: l */
    private final IEventSubscriber<C12876l6> m62619l() {
        return new IEventSubscriber() { // from class: pP6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C13272z0.m62648a(C13272z0.this, (C12876l6) obj);
            }
        };
    }

    /* renamed from: b */
    public final IEventSubscriber<C13013p0> m62639b() {
        return new IEventSubscriber() { // from class: tP6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C13272z0.m62643a(C13272z0.this, (C13013p0) obj);
            }
        };
    }

    /* renamed from: c */
    public final IEventSubscriber<C12917n1> m62637c() {
        return new IEventSubscriber() { // from class: oP6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C13272z0.m62645a(C13272z0.this, (C12917n1) obj);
            }
        };
    }

    /* renamed from: d */
    public final IEventSubscriber<C12566c3> m62635d() {
        return new IEventSubscriber() { // from class: vP6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C13272z0.m62654a(C13272z0.this, (C12566c3) obj);
            }
        };
    }

    /* renamed from: g */
    public final IEventSubscriber<C12612e5> m62629g() {
        return new IEventSubscriber() { // from class: rP6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C13272z0.m62652a(C13272z0.this, (C12612e5) obj);
            }
        };
    }

    /* renamed from: j */
    public final IEventSubscriber<C12569c6> m62623j() {
        return new IEventSubscriber() { // from class: zP6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C13272z0.m62653a(C13272z0.this, (C12569c6) obj);
            }
        };
    }

    /* renamed from: m */
    public final IEventSubscriber<C12926n6> m62617m() {
        return new IEventSubscriber() { // from class: wP6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C13272z0.m62644a(C13272z0.this, (C12926n6) obj);
            }
        };
    }

    /* renamed from: n */
    public final C13023p6 m62615n() {
        return this.f59523e;
    }

    /* renamed from: o */
    public final void m62613o() {
        C12569c6 c12569c6;
        if (!this.f59535q.compareAndSet(true, false) || (c12569c6 = this.f59536r) == null) {
            return;
        }
        this.f59525g.mo62891a(new C12647f4(c12569c6.m63869a(), c12569c6.m63868b()));
        this.f59536r = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m62646a(C13272z0 this$0, C12916n0 c12916n0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC13280z1 m63301a = c12916n0.m63301a();
        C13176v3 mo62592c = m63301a.mo62592c();
        if (mo62592c != null && mo62592c.m62872x()) {
            this$0.m62611p();
            this$0.m62613o();
            this$0.f59522d.m63186b(true);
        }
        C12697h0 mo62586f = m63301a.mo62586f();
        if (mo62586f != null) {
            this$0.f59524f.m63970a((C12731i0) mo62586f, false);
        }
        C13191w3 mo62590d = m63301a.mo62590d();
        if (mo62590d != null) {
            this$0.m62615n().m63970a((C13023p6) mo62590d, false);
            if (mo62590d.m62843w().has("push_token")) {
                this$0.m62615n().m63126h();
            }
        }
        C12810k mo62588e = m63301a.mo62588e();
        if (mo62588e == null) {
            return;
        }
        for (InterfaceC13160u1 interfaceC13160u1 : mo62588e.m63467b()) {
            this$0.f59521c.mo63261a(interfaceC13160u1);
        }
    }

    /* renamed from: a */
    public final IEventSubscriber<C12916n0> m62657a() {
        return new IEventSubscriber() { // from class: nP6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C13272z0.m62646a(C13272z0.this, (C12916n0) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m62652a(C13272z0 this$0, C12612e5 c12612e5) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C43664k20 c43664k20 = C43664k20.f93782a;
        C43664k20.m29442e(c43664k20, this$0, null, null, false, C13276d.f59540b, 7, null);
        InterfaceC13160u1 m63573a = C12749j.f58647h.m63573a(c12612e5.m63803a().m63839n());
        if (m63573a != null) {
            m63573a.mo62900a(c12612e5.m63803a().m63839n());
        }
        if (m63573a != null) {
            this$0.f59522d.mo62756a(m63573a);
        }
        this$0.f59520b.mo63288a();
        this$0.f59522d.m63186b(true);
        this$0.f59523e.m63126h();
        this$0.f59524f.m63602e();
        this$0.m62610q();
        if (this$0.f59531m.isAutomaticGeofenceRequestsEnabled()) {
            BrazeInternal.requestGeofenceRefresh(this$0.f59519a, false);
        } else {
            C43664k20.m29442e(c43664k20, this$0, null, null, false, C13277e.f59541b, 7, null);
        }
        this$0.f59522d.mo62759a(this$0.f59532n.m62798e(), this$0.f59532n.m62796f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m62649a(C13272z0 this$0, C12818k3 c12818k3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f59522d.m63186b(true);
        this$0.m62610q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m62650a(C13272z0 this$0, C12662g5 message) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(message, "message");
        this$0.m62655a(message);
        P10.getInstance(this$0.f59519a).requestImmediateDataFlush();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m62642a(C13272z0 this$0, C13283z4 c13283z4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C13235y4 m62578a = c13283z4.m62578a();
        this$0.f59528j.m63441a(m62578a);
        this$0.f59529k.m62838a(m62578a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m62645a(C13272z0 this$0, C12917n1 c12917n1) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f59528j.m63438a(c12917n1.m63300a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m62653a(C13272z0 this$0, C12569c6 message) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(message, "message");
        this$0.f59535q.set(true);
        this$0.f59536r = message;
        C43664k20.m29442e(C43664k20.f93782a, this$0, C43664k20.EnumC25082a.I, null, false, C13279g.f59543b, 6, null);
        this$0.f59522d.mo62755a(new C13176v3.C13177a(null, null, null, null, 15, null).m62862c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m62644a(C13272z0 this$0, C12926n6 c12926n6) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f59525g.mo62690a(c12926n6.m63289a());
        this$0.m62611p();
        this$0.m62613o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m62651a(C13272z0 this$0, C12613e6 c12613e6) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f59525g.mo62891a(c12613e6.m63802a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m62654a(C13272z0 this$0, C12566c3 c12566c3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC13145t2 m63874a = c12566c3.m63874a();
        InterfaceC13232y2 m63873b = c12566c3.m63873b();
        InterfaceC50985wO1 m63872c = c12566c3.m63872c();
        String m63871d = c12566c3.m63871d();
        synchronized (this$0.f59526h) {
            if (this$0.f59526h.mo62823b(m63873b)) {
                this$0.f59530l.mo63715a((InterfaceC12658g2) new C44563lZ1(m63874a, m63873b, m63872c, m63871d), (Class<InterfaceC12658g2>) C44563lZ1.class);
                this$0.f59526h.mo62824a(m63873b, C46287oT0.m21027i());
                this$0.f59525g.mo62892a(C46287oT0.m21027i());
            } else {
                C43664k20.m29442e(C43664k20.f93782a, this$0, null, null, false, new C13274b(m63873b), 7, null);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m62648a(C13272z0 this$0, C12876l6 c12876l6) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f59525g.mo62890a(c12876l6.m63358a(), c12876l6.m63357b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m62647a(C13272z0 this$0, C12912m5 storageException) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(storageException, "storageException");
        try {
            this$0.f59522d.m63185c(storageException);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this$0, C43664k20.EnumC25082a.E, e, false, C13278f.f59542b, 4, null);
        }
    }

    /* renamed from: a */
    public final void m62656a(InterfaceC12658g2 eventMessenger) {
        Intrinsics.checkNotNullParameter(eventMessenger, "eventMessenger");
        eventMessenger.mo63714b(m62657a(), C12916n0.class);
        eventMessenger.mo63714b(m62639b(), C13013p0.class);
        eventMessenger.mo63714b(m62629g(), C12612e5.class);
        eventMessenger.mo63714b(m62627h(), C12662g5.class);
        eventMessenger.mo63714b(m62623j(), C12569c6.class);
        eventMessenger.mo63714b(m62631f(), C13283z4.class);
        eventMessenger.mo63714b(m62640a((Semaphore) null), Throwable.class);
        eventMessenger.mo63714b(m62625i(), C12912m5.class);
        eventMessenger.mo63714b(m62617m(), C12926n6.class);
        eventMessenger.mo63714b(m62633e(), C12818k3.class);
        eventMessenger.mo63714b(m62637c(), C12917n1.class);
        eventMessenger.mo63714b(m62621k(), C12613e6.class);
        eventMessenger.mo63714b(m62635d(), C12566c3.class);
        eventMessenger.mo63714b(m62619l(), C12876l6.class);
    }

    /* renamed from: a */
    public final IEventSubscriber<Throwable> m62640a(final Semaphore semaphore) {
        return new IEventSubscriber() { // from class: sP6
            @Override // com.appboy.events.IEventSubscriber
            public final void trigger(Object obj) {
                C13272z0.m62641a(C13272z0.this, semaphore, (Throwable) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m62641a(C13272z0 this$0, Semaphore semaphore, Throwable th) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (th != null) {
                try {
                    this$0.f59522d.mo62752a(th);
                } catch (Exception e) {
                    C43664k20.m29442e(C43664k20.f93782a, this$0, C43664k20.EnumC25082a.E, e, false, C13273a.f59537b, 4, null);
                    if (semaphore == null) {
                        return;
                    }
                }
            }
            if (semaphore == null) {
                return;
            }
            semaphore.release();
        } catch (Throwable th2) {
            if (semaphore != null) {
                semaphore.release();
            }
            throw th2;
        }
    }

    /* renamed from: a */
    private final void m62655a(C12662g5 c12662g5) {
        C12584d5 m63708a = c12662g5.m63708a();
        InterfaceC13160u1 m63574a = C12749j.f58647h.m63574a(m63708a.m63838v());
        if (m63574a == null) {
            return;
        }
        m63574a.mo62900a(m63708a.m63839n());
        this.f59522d.mo62756a(m63574a);
    }
}
