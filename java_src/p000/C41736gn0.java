package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.constant.ServiceCenterStatus;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireServiceCenterStatus;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.functions.InterfaceC23484g;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"Lgn0;", "Len0;", "", DateTokenConverter.CONVERTER_KEY, "c", "Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/c;", "e", "b", "", "action", C17296a.f69688o, "LEa;", "LEa;", "analyticsManager", "LGt5;", "LGt5;", "serviceCenterManager", "LOh;", "LOh;", "appBuildConfig", "Ljava/lang/String;", "sessionId", "Lco/bird/android/model/wire/WireBird;", "", "f", "Z", "actionTaken", "<init>", "(LEa;LGt5;LOh;)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCommandCenterAnalyticsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandCenterAnalyticsManager.kt\nco/bird/android/feature/commandcenter/analytics/CommandCenterAnalyticsManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
/* renamed from: gn0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41736gn0 implements InterfaceC40550en0 {

    /* renamed from: a */
    public final InterfaceC1880Ea f84231a;

    /* renamed from: b */
    public final InterfaceC33193Gt5 f84232b;

    /* renamed from: c */
    public final InterfaceC6097Oh f84233c;

    /* renamed from: d */
    public String f84234d;

    /* renamed from: e */
    public WireBird f84235e;

    /* renamed from: f */
    public boolean f84236f;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "kotlin.jvm.PlatformType", "optionalWireStatus", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gn0$a */
    /* loaded from: classes3.dex */
    public static final class C22470a extends Lambda implements Function1<Optional<WireServiceCenterStatus>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f84238h;

        /* renamed from: i */
        public final /* synthetic */ String f84239i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22470a(WireBird wireBird, String str) {
            super(1);
            this.f84238h = wireBird;
            this.f84239i = str;
        }

        /* renamed from: a */
        public final void m37482a(Optional<WireServiceCenterStatus> optional) {
            ServiceCenterStatus status;
            InterfaceC1880Ea interfaceC1880Ea = C41736gn0.this.f84231a;
            String id = this.f84238h.getId();
            WireServiceCenterStatus m59035e = optional.m59035e();
            interfaceC1880Ea.mo55905y(new C49454to0(null, id, null, null, this.f84239i, (m59035e == null || (status = m59035e.getStatus()) == null || (r12 = status.name()) == null) ? "" : "", 13, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<WireServiceCenterStatus> optional) {
            m37482a(optional);
            return Unit.INSTANCE;
        }
    }

    public C41736gn0(InterfaceC1880Ea analyticsManager, InterfaceC33193Gt5 serviceCenterManager, InterfaceC6097Oh appBuildConfig) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(serviceCenterManager, "serviceCenterManager");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        this.f84231a = analyticsManager;
        this.f84232b = serviceCenterManager;
        this.f84233c = appBuildConfig;
    }

    /* renamed from: g */
    public static final void m37483g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC40550en0
    /* renamed from: a */
    public void mo37489a(String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        String str = this.f84234d;
        if (str != null) {
            WireBird wireBird = this.f84235e;
            if (wireBird != null) {
                this.f84236f = true;
                this.f84231a.mo55905y(new C44701ln0(null, wireBird.getId(), null, null, str, action, 13, null));
                return;
            }
            throw new IllegalArgumentException("Cannot track CTA click without scanning a vehicle".toString());
        }
        throw new IllegalArgumentException("Cannot track CTA click before starting a session".toString());
    }

    @Override // p000.InterfaceC40550en0
    /* renamed from: b */
    public void mo37488b() {
        boolean z;
        String str = this.f84234d;
        WireBird wireBird = this.f84235e;
        if (str != null && wireBird != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f84231a.mo55905y(new C49444tn0(null, wireBird.getId(), null, null, str, this.f84236f, 13, null));
            this.f84234d = null;
            this.f84235e = null;
            this.f84236f = false;
            return;
        }
        try {
            throw new IllegalArgumentException("Cannot end a session before starting a session".toString());
        } catch (IllegalArgumentException e) {
            if (!this.f84233c.mo89921k()) {
                C41318g46.m40159e(e);
                return;
            }
            throw e;
        }
    }

    @Override // p000.InterfaceC40550en0
    /* renamed from: c */
    public void mo37487c() {
        if (this.f84234d == null) {
            mo37486d();
        }
    }

    @Override // p000.InterfaceC40550en0
    /* renamed from: d */
    public void mo37486d() {
        this.f84236f = false;
        this.f84235e = null;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f84234d = uuid;
        this.f84231a.mo55905y(new C45294mn0(null, null, null, uuid, null, null, null, 119, null));
    }

    @Override // p000.InterfaceC40550en0
    /* renamed from: e */
    public AbstractC23461c mo37485e(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        String str = this.f84234d;
        if (str != null) {
            this.f84235e = bird;
            AbstractC23442F m70887h = C38096ag5.m70887h(this.f84232b.mo94632b(bird.getId()));
            final C22470a c22470a = new C22470a(bird, str);
            AbstractC23461c m33159G = m70887h.m33101w(new InterfaceC23484g() { // from class: fn0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C41736gn0.m37483g(Function1.this, obj);
                }
            }).m33159G();
            Intrinsics.checkNotNullExpressionValue(m33159G, "override fun scannedBird…     .ignoreElement()\n  }");
            return m33159G;
        }
        throw new IllegalArgumentException("Cannot track a vehicle scan before starting a session".toString());
    }
}
