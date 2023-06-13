package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import co.bird.android.model.constant.ServiceCenterStatus;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireServiceCenterStatus;
import co.bird.api.request.ServiceCenterEventBody;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C34597Mt5;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010(\u001a\u00020&¢\u0006\u0004\b/\u00100J\u001a\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H\u0016J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016JO\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00030\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016JO\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00030\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00172\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00040\u00030\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u001c\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00030\u00022\u0006\u0010\u001e\u001a\u00020\u0007H\u0016R\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010'R*\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00061"}, m28432d2 = {"LMt5;", "LGt5;", "Lio/reactivex/F;", "LHM4;", "", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "f", "", "birdId", "b", "Lco/bird/android/model/constant/ServiceCenterStatus;", "status", "Lco/bird/android/model/wire/WireBird;", "bird", "notes", "sessionId", "LbH;", "mode", "", "numberInBulk", "", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/model/constant/ServiceCenterStatus;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;Ljava/lang/String;LbH;Ljava/lang/Integer;)Lio/reactivex/F;", "Lco/bird/android/model/persistence/Bird;", "c", "(Lco/bird/android/model/constant/ServiceCenterStatus;Lco/bird/android/model/persistence/Bird;Ljava/lang/String;Ljava/lang/String;LbH;Ljava/lang/Integer;)Lio/reactivex/F;", "Lco/bird/android/model/wire/WireLocation;", "location", "Lco/bird/android/model/Warehouse;", "e", "warehouseId", C17296a.f69688o, "LBt5;", "LBt5;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "Llh6;", "Llh6;", "userManager", "LEa;", "LEa;", "analyticsManager", "Ljava/util/List;", "getCachedStatuses", "()Ljava/util/List;", "m", "(Ljava/util/List;)V", "cachedStatuses", "<init>", "(LBt5;Llh6;LEa;)V", "contractor_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nServiceCenterManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceCenterManagerImpl.kt\nco/bird/android/manager/contractor/ServiceCenterManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
/* renamed from: Mt5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34597Mt5 implements InterfaceC33193Gt5 {

    /* renamed from: a */
    public final InterfaceC32023Bt5 f23738a;

    /* renamed from: b */
    public final InterfaceC44647lh6 f23739b;

    /* renamed from: c */
    public final InterfaceC1880Ea f23740c;

    /* renamed from: d */
    public List<WireServiceCenterStatus> f23741d;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "Lio/reactivex/K;", "LHM4;", "", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/User;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Mt5$a */
    /* loaded from: classes4.dex */
    public static final class C5410a extends Lambda implements Function1<User, InterfaceC23447K<? extends HM4<Unit>>> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f23742g;

        /* renamed from: h */
        public final /* synthetic */ EnumC12346bH f23743h;

        /* renamed from: i */
        public final /* synthetic */ String f23744i;

        /* renamed from: j */
        public final /* synthetic */ Integer f23745j;

        /* renamed from: k */
        public final /* synthetic */ ServiceCenterStatus f23746k;

        /* renamed from: l */
        public final /* synthetic */ C34597Mt5 f23747l;

        /* renamed from: m */
        public final /* synthetic */ String f23748m;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LHM4;", "", "kotlin.jvm.PlatformType", "it", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Mt5$a$a */
        /* loaded from: classes4.dex */
        public static final class C5411a extends Lambda implements Function1<HM4<Unit>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ ServiceCenterStatus f23749g;

            /* renamed from: h */
            public final /* synthetic */ C34597Mt5 f23750h;

            /* renamed from: i */
            public final /* synthetic */ C38431bE5 f23751i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5411a(ServiceCenterStatus serviceCenterStatus, C34597Mt5 c34597Mt5, C38431bE5 c38431bE5) {
                super(1);
                this.f23749g = serviceCenterStatus;
                this.f23750h = c34597Mt5;
                this.f23751i = c38431bE5;
            }

            /* renamed from: a */
            public final void m94616a(HM4<Unit> hm4) {
                if (this.f23749g.isHibernate() || this.f23749g.isHibernateCreateBatch()) {
                    this.f23750h.f23740c.mo55905y(C39024cE5.toSleepEndedEvent$default(this.f23751i, true, null, 2, null));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HM4<Unit> hm4) {
                m94616a(hm4);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Mt5$a$b */
        /* loaded from: classes4.dex */
        public static final class C5412b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ ServiceCenterStatus f23752g;

            /* renamed from: h */
            public final /* synthetic */ C34597Mt5 f23753h;

            /* renamed from: i */
            public final /* synthetic */ C38431bE5 f23754i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5412b(ServiceCenterStatus serviceCenterStatus, C34597Mt5 c34597Mt5, C38431bE5 c38431bE5) {
                super(1);
                this.f23752g = serviceCenterStatus;
                this.f23753h = c34597Mt5;
                this.f23754i = c38431bE5;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (this.f23752g.isHibernate() || this.f23752g.isHibernateCreateBatch()) {
                    this.f23753h.f23740c.mo55905y(C39024cE5.toSleepEndedEvent$default(this.f23754i, false, null, 2, null));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5410a(WireBird wireBird, EnumC12346bH enumC12346bH, String str, Integer num, ServiceCenterStatus serviceCenterStatus, C34597Mt5 c34597Mt5, String str2) {
            super(1);
            this.f23742g = wireBird;
            this.f23743h = enumC12346bH;
            this.f23744i = str;
            this.f23745j = num;
            this.f23746k = serviceCenterStatus;
            this.f23747l = c34597Mt5;
            this.f23748m = str2;
        }

        /* renamed from: d */
        public static final void m94617d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends HM4<Unit>> invoke(User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            String warehouseId = user.getWarehouseId();
            if (this.f23742g.getNestId() == null && warehouseId == null) {
                C41318g46.m40159e(new IllegalArgumentException("One of [nestId, warehouseId] must be non-null"));
            }
            C38431bE5 c38431bE5 = new C38431bE5(null, this.f23742g.getId(), this.f23742g.getModel(), null, null, this.f23744i, this.f23743h.name(), XD5.API.name(), null, this.f23745j, null, 1305, null);
            if (this.f23746k.isHibernate() || this.f23746k.isHibernateCreateBatch()) {
                this.f23747l.f23740c.mo55905y(c38431bE5);
            }
            AbstractC23442F<HM4<Unit>> m113401c = this.f23747l.f23738a.m113401c(new ServiceCenterEventBody(this.f23746k, this.f23742g.getId(), this.f23742g.getNestId(), warehouseId, this.f23742g.getModel(), this.f23748m));
            final C5411a c5411a = new C5411a(this.f23746k, this.f23747l, c38431bE5);
            AbstractC23442F<HM4<Unit>> m33101w = m113401c.m33101w(new InterfaceC23484g() { // from class: Kt5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C34597Mt5.C5410a.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C5412b c5412b = new C5412b(this.f23746k, this.f23747l, c38431bE5);
            return m33101w.m33106t(new InterfaceC23484g() { // from class: Lt5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C34597Mt5.C5410a.m94617d(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "Lio/reactivex/K;", "LHM4;", "", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/User;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Mt5$b */
    /* loaded from: classes4.dex */
    public static final class C5413b extends Lambda implements Function1<User, InterfaceC23447K<? extends HM4<Unit>>> {

        /* renamed from: g */
        public final /* synthetic */ Bird f23755g;

        /* renamed from: h */
        public final /* synthetic */ EnumC12346bH f23756h;

        /* renamed from: i */
        public final /* synthetic */ String f23757i;

        /* renamed from: j */
        public final /* synthetic */ Integer f23758j;

        /* renamed from: k */
        public final /* synthetic */ ServiceCenterStatus f23759k;

        /* renamed from: l */
        public final /* synthetic */ C34597Mt5 f23760l;

        /* renamed from: m */
        public final /* synthetic */ String f23761m;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LHM4;", "", "kotlin.jvm.PlatformType", "it", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Mt5$b$a */
        /* loaded from: classes4.dex */
        public static final class C5414a extends Lambda implements Function1<HM4<Unit>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ ServiceCenterStatus f23762g;

            /* renamed from: h */
            public final /* synthetic */ C34597Mt5 f23763h;

            /* renamed from: i */
            public final /* synthetic */ C38431bE5 f23764i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5414a(ServiceCenterStatus serviceCenterStatus, C34597Mt5 c34597Mt5, C38431bE5 c38431bE5) {
                super(1);
                this.f23762g = serviceCenterStatus;
                this.f23763h = c34597Mt5;
                this.f23764i = c38431bE5;
            }

            /* renamed from: a */
            public final void m94611a(HM4<Unit> hm4) {
                if (this.f23762g.isHibernate() || this.f23762g.isHibernateCreateBatch()) {
                    this.f23763h.f23740c.mo55905y(C39024cE5.toSleepEndedEvent$default(this.f23764i, true, null, 2, null));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HM4<Unit> hm4) {
                m94611a(hm4);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Mt5$b$b */
        /* loaded from: classes4.dex */
        public static final class C5415b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ ServiceCenterStatus f23765g;

            /* renamed from: h */
            public final /* synthetic */ C34597Mt5 f23766h;

            /* renamed from: i */
            public final /* synthetic */ C38431bE5 f23767i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5415b(ServiceCenterStatus serviceCenterStatus, C34597Mt5 c34597Mt5, C38431bE5 c38431bE5) {
                super(1);
                this.f23765g = serviceCenterStatus;
                this.f23766h = c34597Mt5;
                this.f23767i = c38431bE5;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (this.f23765g.isHibernate() || this.f23765g.isHibernateCreateBatch()) {
                    this.f23766h.f23740c.mo55905y(C39024cE5.toSleepEndedEvent$default(this.f23767i, false, null, 2, null));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5413b(Bird bird, EnumC12346bH enumC12346bH, String str, Integer num, ServiceCenterStatus serviceCenterStatus, C34597Mt5 c34597Mt5, String str2) {
            super(1);
            this.f23755g = bird;
            this.f23756h = enumC12346bH;
            this.f23757i = str;
            this.f23758j = num;
            this.f23759k = serviceCenterStatus;
            this.f23760l = c34597Mt5;
            this.f23761m = str2;
        }

        /* renamed from: d */
        public static final void m94612d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends HM4<Unit>> invoke(User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            String warehouseId = user.getWarehouseId();
            if (this.f23755g.getNestId() == null && warehouseId == null) {
                C41318g46.m40159e(new IllegalArgumentException("One of [nestId, warehouseId] must be non-null"));
            }
            C38431bE5 c38431bE5 = new C38431bE5(null, this.f23755g.getId(), this.f23755g.getModel(), null, null, this.f23757i, this.f23756h.name(), XD5.API.name(), null, this.f23758j, null, 1305, null);
            if (this.f23759k.isHibernate() || this.f23759k.isHibernateCreateBatch()) {
                this.f23760l.f23740c.mo55905y(c38431bE5);
            }
            AbstractC23442F<HM4<Unit>> m113401c = this.f23760l.f23738a.m113401c(new ServiceCenterEventBody(this.f23759k, this.f23755g.getId(), this.f23755g.getNestId(), warehouseId, this.f23755g.getModel(), this.f23761m));
            final C5414a c5414a = new C5414a(this.f23759k, this.f23760l, c38431bE5);
            AbstractC23442F<HM4<Unit>> m33101w = m113401c.m33101w(new InterfaceC23484g() { // from class: Nt5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C34597Mt5.C5413b.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C5415b c5415b = new C5415b(this.f23759k, this.f23760l, c38431bE5);
            return m33101w.m33106t(new InterfaceC23484g() { // from class: Ot5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C34597Mt5.C5413b.m94612d(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nServiceCenterManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceCenterManagerImpl.kt\nco/bird/android/manager/contractor/ServiceCenterManagerImpl$getStatuses$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
    /* renamed from: Mt5$c */
    /* loaded from: classes4.dex */
    public static final class C5416c extends Lambda implements Function1<HM4<List<? extends WireServiceCenterStatus>>, Unit> {
        public C5416c() {
            super(1);
        }

        /* renamed from: a */
        public final void m94610a(HM4<List<WireServiceCenterStatus>> hm4) {
            List<WireServiceCenterStatus> m103944a = hm4.m103944a();
            if (m103944a != null) {
                C34597Mt5.this.m94621m(m103944a);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<List<? extends WireServiceCenterStatus>> hm4) {
            m94610a(hm4);
            return Unit.INSTANCE;
        }
    }

    public C34597Mt5(InterfaceC32023Bt5 client, InterfaceC44647lh6 userManager, InterfaceC1880Ea analyticsManager) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f23738a = client;
        this.f23739b = userManager;
        this.f23740c = analyticsManager;
    }

    /* renamed from: j */
    public static final InterfaceC23447K m94624j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final InterfaceC23447K m94623k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m94622l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC33193Gt5
    /* renamed from: a */
    public AbstractC23442F<HM4<Warehouse>> mo94633a(String warehouseId) {
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        return this.f23738a.m113403a(warehouseId);
    }

    @Override // p000.InterfaceC33193Gt5
    /* renamed from: b */
    public AbstractC23442F<HM4<WireServiceCenterStatus>> mo94632b(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return this.f23738a.m113402b(birdId);
    }

    @Override // p000.InterfaceC33193Gt5
    /* renamed from: c */
    public AbstractC23442F<HM4<Unit>> mo94631c(ServiceCenterStatus status, Bird bird, String str, String sessionId, EnumC12346bH mode, Integer num) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        AbstractC23442F<User> user = this.f23739b.getUser();
        final C5413b c5413b = new C5413b(bird, mode, sessionId, num, status, this, str);
        AbstractC23442F m33165A = user.m33165A(new InterfaceC23492o() { // from class: It5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m94623k;
                m94623k = C34597Mt5.m94623k(Function1.this, obj);
                return m94623k;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun addEvent(st…}\n          }\n      }\n  }");
        return m33165A;
    }

    @Override // p000.InterfaceC33193Gt5
    /* renamed from: d */
    public AbstractC23442F<HM4<Unit>> mo94630d(ServiceCenterStatus status, WireBird bird, String str, String sessionId, EnumC12346bH mode, Integer num) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        AbstractC23442F<User> user = this.f23739b.getUser();
        final C5410a c5410a = new C5410a(bird, mode, sessionId, num, status, this, str);
        AbstractC23442F m33165A = user.m33165A(new InterfaceC23492o() { // from class: Jt5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m94624j;
                m94624j = C34597Mt5.m94624j(Function1.this, obj);
                return m94624j;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun addEvent(\n …}\n          }\n      }\n  }");
        return m33165A;
    }

    @Override // p000.InterfaceC33193Gt5
    /* renamed from: e */
    public AbstractC23442F<HM4<List<Warehouse>>> mo94629e(WireLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return this.f23738a.m113400d(location.getLatitude(), location.getLongitude());
    }

    @Override // p000.InterfaceC33193Gt5
    /* renamed from: f */
    public AbstractC23442F<HM4<List<WireServiceCenterStatus>>> mo94628f() {
        AbstractC23442F<HM4<List<WireServiceCenterStatus>>> abstractC23442F;
        List<WireServiceCenterStatus> list = this.f23741d;
        if (list != null) {
            abstractC23442F = AbstractC23442F.m33158H(HM4.m103935j(list));
        } else {
            abstractC23442F = null;
        }
        if (abstractC23442F == null) {
            AbstractC23442F<HM4<List<WireServiceCenterStatus>>> m113399e = this.f23738a.m113399e();
            final C5416c c5416c = new C5416c();
            AbstractC23442F<HM4<List<WireServiceCenterStatus>>> m33101w = m113399e.m33101w(new InterfaceC23484g() { // from class: Ht5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C34597Mt5.m94622l(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33101w, "override fun getStatuses…atuses = it }\n      }\n  }");
            return m33101w;
        }
        return abstractC23442F;
    }

    /* renamed from: m */
    public final void m94621m(List<WireServiceCenterStatus> list) {
        this.f23741d = list;
    }
}
