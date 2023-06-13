package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.api.response.BeginnerModeOnboardingResponse;
import co.bird.api.response.BeginnerModeRiderMapAction;
import co.bird.api.response.BeginnerModeRiderMapResponse;
import co.bird.api.response.RiderProfileBody;
import co.bird.api.response.RiderProfileResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.functions.InterfaceC23484g;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\bH\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR'\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R'\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\t0\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\t0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R'\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\t0\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\r\u0010\u0013R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\t0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017¨\u0006\""}, m28432d2 = {"Lja5;", "Lfa5;", "Lio/reactivex/c;", "f", "b", "", "accelerationLevel", "e", "Lco/bird/api/response/BeginnerModeRiderMapResponse;", "Lco/bird/android/buava/Optional;", "Ll56;", "m", "Lea5;", C17296a.f69688o, "Lea5;", "riderProfileClient", "LZ84;", "Lkotlin/Lazy;", DateTokenConverter.CONVERTER_KEY, "()LZ84;", "selectedAccelerationLevel", "La94;", "c", "La94;", "mutableSelectedAccelerationLevel", "LMZ;", "bottomSheetData", "mutableBottomSheetData", "Lco/bird/api/response/BeginnerModeOnboardingResponse;", "onboardingScreenData", "g", "mutableOnboardingScreenData", "<init>", "(Lea5;)V", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRiderProfileManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderProfileManager.kt\nco/bird/android/manager/ride/RiderProfileManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
/* renamed from: ja5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43390ja5 implements InterfaceC41018fa5 {

    /* renamed from: a */
    public final InterfaceC40425ea5 f92949a;

    /* renamed from: b */
    public final Lazy f92950b;

    /* renamed from: c */
    public final C37791a94<Optional<C44293l56>> f92951c;

    /* renamed from: d */
    public final Lazy f92952d;

    /* renamed from: e */
    public final C37791a94<Optional<C5312MZ>> f92953e;

    /* renamed from: f */
    public final Lazy f92954f;

    /* renamed from: g */
    public final C37791a94<Optional<BeginnerModeOnboardingResponse>> f92955g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "LMZ;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ja5$a */
    /* loaded from: classes4.dex */
    public static final class C24940a extends Lambda implements Function0<Z84<Optional<C5312MZ>>> {
        public C24940a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<C5312MZ>> invoke() {
            return Z84.f47888d.m73663b(C43390ja5.this.f92953e);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/BeginnerModeOnboardingResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ja5$b */
    /* loaded from: classes4.dex */
    public static final class C24941b extends Lambda implements Function1<HM4<BeginnerModeOnboardingResponse>, Unit> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/api/response/BeginnerModeOnboardingResponse;", "it", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ja5$b$a */
        /* loaded from: classes4.dex */
        public static final class C24942a extends Lambda implements Function1<Optional<BeginnerModeOnboardingResponse>, Optional<BeginnerModeOnboardingResponse>> {

            /* renamed from: g */
            public final /* synthetic */ BeginnerModeOnboardingResponse f92958g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24942a(BeginnerModeOnboardingResponse beginnerModeOnboardingResponse) {
                super(1);
                this.f92958g = beginnerModeOnboardingResponse;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<BeginnerModeOnboardingResponse> invoke(Optional<BeginnerModeOnboardingResponse> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Optional.C14443a c14443a = Optional.f63040c;
                BeginnerModeOnboardingResponse response = this.f92958g;
                Intrinsics.checkNotNullExpressionValue(response, "response");
                return c14443a.m59032c(response);
            }
        }

        public C24941b() {
            super(1);
        }

        /* renamed from: a */
        public final void m30277a(HM4<BeginnerModeOnboardingResponse> hm4) {
            BeginnerModeOnboardingResponse m103944a;
            if (hm4.m103939f() && (m103944a = hm4.m103944a()) != null) {
                C43390ja5.this.f92955g.m71837i(new C24942a(m103944a));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<BeginnerModeOnboardingResponse> hm4) {
            m30277a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/api/response/BeginnerModeOnboardingResponse;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ja5$c */
    /* loaded from: classes4.dex */
    public static final class C24943c extends Lambda implements Function0<Z84<Optional<BeginnerModeOnboardingResponse>>> {
        public C24943c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<BeginnerModeOnboardingResponse>> invoke() {
            return Z84.f47888d.m73663b(C43390ja5.this.f92955g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/BeginnerModeRiderMapResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ja5$d */
    /* loaded from: classes4.dex */
    public static final class C24944d extends Lambda implements Function1<HM4<BeginnerModeRiderMapResponse>, Unit> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Ll56;", "it", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ja5$d$a */
        /* loaded from: classes4.dex */
        public static final class C24945a extends Lambda implements Function1<Optional<C44293l56>, Optional<C44293l56>> {

            /* renamed from: g */
            public final /* synthetic */ C43390ja5 f92961g;

            /* renamed from: h */
            public final /* synthetic */ BeginnerModeRiderMapResponse f92962h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24945a(C43390ja5 c43390ja5, BeginnerModeRiderMapResponse beginnerModeRiderMapResponse) {
                super(1);
                this.f92961g = c43390ja5;
                this.f92962h = beginnerModeRiderMapResponse;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<C44293l56> invoke(Optional<C44293l56> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                C43390ja5 c43390ja5 = this.f92961g;
                BeginnerModeRiderMapResponse response = this.f92962h;
                Intrinsics.checkNotNullExpressionValue(response, "response");
                return c43390ja5.m30278m(response);
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "LMZ;", "it", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ja5$d$b */
        /* loaded from: classes4.dex */
        public static final class C24946b extends Lambda implements Function1<Optional<C5312MZ>, Optional<C5312MZ>> {

            /* renamed from: g */
            public final /* synthetic */ BeginnerModeRiderMapResponse f92963g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24946b(BeginnerModeRiderMapResponse beginnerModeRiderMapResponse) {
                super(1);
                this.f92963g = beginnerModeRiderMapResponse;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<C5312MZ> invoke(Optional<C5312MZ> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional.f63040c.m59032c(new C5312MZ(this.f92963g.getBottomSheetNavigationTitle(), this.f92963g.getActions()));
            }
        }

        public C24944d() {
            super(1);
        }

        /* renamed from: a */
        public final void m30275a(HM4<BeginnerModeRiderMapResponse> hm4) {
            BeginnerModeRiderMapResponse m103944a;
            if (hm4.m103939f() && (m103944a = hm4.m103944a()) != null) {
                C43390ja5 c43390ja5 = C43390ja5.this;
                c43390ja5.f92951c.m71837i(new C24945a(c43390ja5, m103944a));
                c43390ja5.f92953e.m71837i(new C24946b(m103944a));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<BeginnerModeRiderMapResponse> hm4) {
            m30275a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Ll56;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ja5$e */
    /* loaded from: classes4.dex */
    public static final class C24947e extends Lambda implements Function0<Z84<Optional<C44293l56>>> {
        public C24947e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<C44293l56>> invoke() {
            return Z84.f47888d.m73663b(C43390ja5.this.f92951c);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/RiderProfileResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRiderProfileManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderProfileManager.kt\nco/bird/android/manager/ride/RiderProfileManagerImpl$setRiderProfile$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
    /* renamed from: ja5$f */
    /* loaded from: classes4.dex */
    public static final class C24948f extends Lambda implements Function1<HM4<RiderProfileResponse>, Unit> {
        public C24948f() {
            super(1);
        }

        /* renamed from: a */
        public final void m30272a(HM4<RiderProfileResponse> hm4) {
            RiderProfileResponse m103944a;
            Object obj;
            if (hm4.m103939f() && (m103944a = hm4.m103944a()) != null) {
                C43390ja5 c43390ja5 = C43390ja5.this;
                C5312MZ m59035e = c43390ja5.mo30288c().getValue().m59035e();
                if (m59035e != null) {
                    Iterator<T> it = m59035e.m95167b().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (Intrinsics.areEqual(((BeginnerModeRiderMapAction) obj).getAccelerationLevel(), m103944a.getAccelerationLevel())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    BeginnerModeRiderMapAction beginnerModeRiderMapAction = (BeginnerModeRiderMapAction) obj;
                    if (beginnerModeRiderMapAction != null) {
                        c43390ja5.f92951c.accept(Optional.f63040c.m59032c(new C44293l56(beginnerModeRiderMapAction.getAsset().getMedia().getMediaUrl(), beginnerModeRiderMapAction.getMapToggleTitle(), beginnerModeRiderMapAction.getAccelerationLevel())));
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<RiderProfileResponse> hm4) {
            m30272a(hm4);
            return Unit.INSTANCE;
        }
    }

    public C43390ja5(InterfaceC40425ea5 riderProfileClient) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Intrinsics.checkNotNullParameter(riderProfileClient, "riderProfileClient");
        this.f92949a = riderProfileClient;
        lazy = LazyKt__LazyJVMKt.lazy(new C24947e());
        this.f92950b = lazy;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        Optional.C14443a c14443a = Optional.f63040c;
        this.f92951c = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        lazy2 = LazyKt__LazyJVMKt.lazy(new C24940a());
        this.f92952d = lazy2;
        this.f92953e = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        lazy3 = LazyKt__LazyJVMKt.lazy(new C24943c());
        this.f92954f = lazy3;
        this.f92955g = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
    }

    /* renamed from: j */
    public static final void m30281j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m30280k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m30279l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC41018fa5
    /* renamed from: a */
    public Z84<Optional<BeginnerModeOnboardingResponse>> mo30290a() {
        return (Z84) this.f92954f.getValue();
    }

    @Override // p000.InterfaceC41018fa5
    /* renamed from: b */
    public AbstractC23461c mo30289b() {
        AbstractC23442F<HM4<BeginnerModeRiderMapResponse>> m42737a = this.f92949a.m42737a();
        final C24944d c24944d = new C24944d();
        AbstractC23442F<HM4<BeginnerModeRiderMapResponse>> m33101w = m42737a.m33101w(new InterfaceC23484g() { // from class: ga5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43390ja5.m30280k(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun refreshBegi…     .ignoreElement()\n  }");
        AbstractC23461c m33159G = C37279Yf5.m74553h0(m33101w, 4, 5).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "override fun refreshBegi…     .ignoreElement()\n  }");
        return m33159G;
    }

    @Override // p000.InterfaceC41018fa5
    /* renamed from: c */
    public Z84<Optional<C5312MZ>> mo30288c() {
        return (Z84) this.f92952d.getValue();
    }

    @Override // p000.InterfaceC41018fa5
    /* renamed from: d */
    public Z84<Optional<C44293l56>> mo30287d() {
        return (Z84) this.f92950b.getValue();
    }

    @Override // p000.InterfaceC41018fa5
    /* renamed from: e */
    public AbstractC23461c mo30286e(String accelerationLevel) {
        Intrinsics.checkNotNullParameter(accelerationLevel, "accelerationLevel");
        AbstractC23442F<HM4<RiderProfileResponse>> m42736b = this.f92949a.m42736b(new RiderProfileBody(accelerationLevel));
        final C24948f c24948f = new C24948f();
        AbstractC23461c m33159G = m42736b.m33101w(new InterfaceC23484g() { // from class: ia5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43390ja5.m30279l(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "override fun setRiderPro…     .ignoreElement()\n  }");
        return m33159G;
    }

    @Override // p000.InterfaceC41018fa5
    /* renamed from: f */
    public AbstractC23461c mo30285f() {
        AbstractC23442F<HM4<BeginnerModeOnboardingResponse>> m42735c = this.f92949a.m42735c();
        final C24941b c24941b = new C24941b();
        AbstractC23461c m33159G = m42735c.m33101w(new InterfaceC23484g() { // from class: ha5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43390ja5.m30281j(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "override fun fetchBeginn…     .ignoreElement()\n  }");
        return m33159G;
    }

    /* renamed from: m */
    public final Optional<C44293l56> m30278m(BeginnerModeRiderMapResponse beginnerModeRiderMapResponse) {
        C44293l56 c44293l56;
        Object obj;
        Iterator<T> it = beginnerModeRiderMapResponse.getActions().iterator();
        while (true) {
            c44293l56 = null;
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((BeginnerModeRiderMapAction) obj).getAccelerationLevel(), beginnerModeRiderMapResponse.getSelectedAccelerationLevel())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        BeginnerModeRiderMapAction beginnerModeRiderMapAction = (BeginnerModeRiderMapAction) obj;
        if (beginnerModeRiderMapAction != null) {
            c44293l56 = new C44293l56(beginnerModeRiderMapAction.getAsset().getMedia().getMediaUrl(), beginnerModeRiderMapAction.getMapToggleTitle(), beginnerModeRiderMapAction.getAccelerationLevel());
        }
        return Optional.f63040c.m59033b(c44293l56);
    }
}
