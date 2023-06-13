package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Sticker;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.wire.WirePart;
import co.bird.api.error.RetrofitException;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.subjects.C24556c;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C47377qI3;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.BG\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b+\u0010,J \u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u001a\u0010\u0012\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u00020#*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006/"}, m28432d2 = {"LqI3;", "LiE;", "LjE;", "Lco/bird/android/model/constant/PartKind;", "kind", "", "instruction", "", "warehouseSpecific", "", "r", "", "e", "x", "c", "LjE;", "getUi", "()LjE;", "ui", "Lio/reactivex/subjects/c;", "Lco/bird/android/model/wire/WirePart;", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/c;", "partSubject", "LNQ5;", "LNQ5;", "stickerManager", "LSM;", "f", "LSM;", "birdPartManager", "LTq4;", "g", "LTq4;", "reactiveConfig", "", "q", "(Ljava/lang/Throwable;)I", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Ldm5;", "scannerNavigator", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(LjE;Ldm5;Lcom/uber/autodispose/ScopeProvider;Lio/reactivex/subjects/c;LNQ5;LSM;LTq4;)V", "h", C17296a.f69688o, "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPartScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartScanPresenter.kt\nco/bird/android/vehiclescanner/parts/PartScanPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n180#2:125\n1#3:126\n*S KotlinDebug\n*F\n+ 1 PartScanPresenter.kt\nco/bird/android/vehiclescanner/parts/PartScanPresenter\n*L\n102#1:125\n*E\n"})
/* renamed from: qI3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47377qI3 extends AbstractC23170iE<C24739jE> {

    /* renamed from: h */
    public static final C27566a f105039h = new C27566a(null);

    /* renamed from: i */
    public static final Set<PartKind> f105040i;

    /* renamed from: j */
    public static final Set<PartKind> f105041j;

    /* renamed from: c */
    public final C24739jE f105042c;

    /* renamed from: d */
    public final C24556c<WirePart> f105043d;

    /* renamed from: e */
    public final NQ5 f105044e;

    /* renamed from: f */
    public final InterfaceC7381SM f105045f;

    /* renamed from: g */
    public final C36207Tq4 f105046g;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\f"}, m28432d2 = {"LqI3$a;", "", "", "Lco/bird/android/model/constant/PartKind;", "STICKER_TYPES", "Ljava/util/Set;", "b", "()Ljava/util/Set;", "GENERIC_STICKER_TYPES", C17296a.f69688o, "<init>", "()V", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: qI3$a */
    /* loaded from: classes4.dex */
    public static final class C27566a {
        public /* synthetic */ C27566a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Set<PartKind> m17661a() {
            return C47377qI3.f105041j;
        }

        /* renamed from: b */
        public final Set<PartKind> m17660b() {
            return C47377qI3.f105040i;
        }

        private C27566a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "scanResult", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qI3$b */
    /* loaded from: classes4.dex */
    public static final class C27567b extends Lambda implements Function1<String, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ boolean f105047g;

        /* renamed from: h */
        public final /* synthetic */ C47377qI3 f105048h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27567b(boolean z, C47377qI3 c47377qI3) {
            super(1);
            this.f105047g = z;
            this.f105048h = c47377qI3;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String scanResult) {
            Intrinsics.checkNotNullParameter(scanResult, "scanResult");
            boolean z = true;
            try {
                Integer.parseInt(scanResult);
                if (this.f105047g) {
                    this.f105048h.getUi().m86370p3();
                }
                z = true ^ this.f105047g;
            } catch (NumberFormatException unused) {
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "raw", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: qI3$c */
    /* loaded from: classes4.dex */
    public static final class C27568c extends Lambda implements Function1<String, InterfaceC23447K<? extends WirePart>> {

        /* renamed from: g */
        public final /* synthetic */ PartKind f105049g;

        /* renamed from: h */
        public final /* synthetic */ C47377qI3 f105050h;

        /* renamed from: i */
        public final /* synthetic */ boolean f105051i;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Sticker;", "sticker", "Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Sticker;)Lco/bird/android/model/wire/WirePart;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: qI3$c$a */
        /* loaded from: classes4.dex */
        public static final class C27569a extends Lambda implements Function1<Sticker, WirePart> {

            /* renamed from: g */
            public final /* synthetic */ PartKind f105052g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27569a(PartKind partKind) {
                super(1);
                this.f105052g = partKind;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final WirePart invoke(Sticker sticker) {
                Intrinsics.checkNotNullParameter(sticker, "sticker");
                return new WirePart(sticker.getId(), this.f105052g, sticker.getCode());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27568c(PartKind partKind, C47377qI3 c47377qI3, boolean z) {
            super(1);
            this.f105049g = partKind;
            this.f105050h = c47377qI3;
            this.f105051i = z;
        }

        /* renamed from: d */
        public static final WirePart m17656d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (WirePart) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final WirePart m17655e(PartKind kind, String str, C47377qI3 this$0, String raw, Throwable e) {
            Intrinsics.checkNotNullParameter(kind, "$kind");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(raw, "$raw");
            Intrinsics.checkNotNullParameter(e, "e");
            if (kind != PartKind.STICKER && str == null) {
                int m17669q = this$0.m17669q(e);
                boolean z = false;
                if (400 <= m17669q && m17669q < 500) {
                    z = true;
                }
                if (z) {
                    return new WirePart(null, kind, raw, 1, null);
                }
            }
            throw e;
        }

        /* renamed from: f */
        public static final WirePart m17654f(C47377qI3 this$0, PartKind kind, String raw, Throwable e) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(kind, "$kind");
            Intrinsics.checkNotNullParameter(raw, "$raw");
            Intrinsics.checkNotNullParameter(e, "e");
            int m17669q = this$0.m17669q(e);
            boolean z = false;
            if (400 <= m17669q && m17669q < 500) {
                z = true;
            }
            if (z) {
                return new WirePart(null, kind, raw, 1, null);
            }
            throw e;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends WirePart> invoke(final String raw) {
            final String m99597e;
            AbstractC23442F<HM4<Sticker>> mo92318a;
            Intrinsics.checkNotNullParameter(raw, "raw");
            C27566a c27566a = C47377qI3.f105039h;
            if (c27566a.m17661a().contains(this.f105049g)) {
                m99597e = C33894Jt4.f18402a.m99599c(raw);
            } else {
                m99597e = C33894Jt4.f18402a.m99597e(raw);
            }
            if (c27566a.m17660b().contains(this.f105049g)) {
                if (m99597e != null) {
                    mo92318a = this.f105050h.f105044e.mo92317b(m99597e);
                } else {
                    mo92318a = this.f105050h.f105044e.mo92318a(raw);
                }
                AbstractC23442F progress$default = C28237sD.progress$default(C38096ag5.m70883l(mo92318a), this.f105050h.getUi(), 0, 2, (Object) null);
                final C27569a c27569a = new C27569a(this.f105049g);
                AbstractC23442F m33157I = progress$default.m33157I(new InterfaceC23492o() { // from class: rI3
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        WirePart m17656d;
                        m17656d = C47377qI3.C27568c.m17656d(Function1.this, obj);
                        return m17656d;
                    }
                });
                final PartKind partKind = this.f105049g;
                final C47377qI3 c47377qI3 = this.f105050h;
                return m33157I.m33149Q(new InterfaceC23492o() { // from class: sI3
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        WirePart m17655e;
                        m17655e = C47377qI3.C27568c.m17655e(PartKind.this, m99597e, c47377qI3, raw, (Throwable) obj);
                        return m17655e;
                    }
                });
            } else if (c27566a.m17661a().contains(this.f105049g)) {
                String uuid = UUID.randomUUID().toString();
                PartKind partKind2 = this.f105049g;
                if (m99597e != null) {
                    raw = m99597e;
                }
                return AbstractC23442F.m33158H(new WirePart(uuid, partKind2, raw));
            } else {
                AbstractC23442F progress$default2 = C28237sD.progress$default(this.f105050h.f105045f.mo78562d(raw, this.f105049g, this.f105051i), this.f105050h.getUi(), 0, 2, (Object) null);
                final C47377qI3 c47377qI32 = this.f105050h;
                final PartKind partKind3 = this.f105049g;
                return progress$default2.m33149Q(new InterfaceC23492o() { // from class: tI3
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        WirePart m17654f;
                        m17654f = C47377qI3.C27568c.m17654f(C47377qI3.this, partKind3, raw, (Throwable) obj);
                        return m17654f;
                    }
                });
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qI3$d */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C27570d extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C27570d(Object obj) {
            super(1, obj, C47377qI3.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C47377qI3) this.receiver).m17662x(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WirePart;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: qI3$e */
    /* loaded from: classes4.dex */
    public static final class C27571e extends Lambda implements Function1<WirePart, Unit> {
        public C27571e() {
            super(1);
        }

        /* renamed from: a */
        public final void m17652a(WirePart wirePart) {
            C47377qI3.this.getUi().vibrate(250L);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WirePart wirePart) {
            m17652a(wirePart);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", "part", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WirePart;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: qI3$f */
    /* loaded from: classes4.dex */
    public static final class C27572f extends Lambda implements Function1<WirePart, Unit> {
        public C27572f() {
            super(1);
        }

        /* renamed from: a */
        public final void m17651a(WirePart wirePart) {
            C47377qI3.this.f105043d.onSuccess(wirePart);
            C47377qI3.this.getUi().dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WirePart wirePart) {
            m17651a(wirePart);
            return Unit.INSTANCE;
        }
    }

    static {
        Set<PartKind> of;
        Set<PartKind> of2;
        of = SetsKt__SetsKt.setOf((Object[]) new PartKind[]{PartKind.STICKER, PartKind.PLATE});
        f105040i = of;
        of2 = SetsKt__SetsKt.setOf((Object[]) new PartKind[]{PartKind.HELMET, PartKind.PHYSICAL_LOCK_STICKER});
        f105041j = of2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47377qI3(C24739jE ui, InterfaceC39953dm5 scannerNavigator, ScopeProvider scopeProvider, C24556c<WirePart> partSubject, NQ5 stickerManager, InterfaceC7381SM birdPartManager, C36207Tq4 reactiveConfig) {
        super(scannerNavigator, scopeProvider);
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scannerNavigator, "scannerNavigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(partSubject, "partSubject");
        Intrinsics.checkNotNullParameter(stickerManager, "stickerManager");
        Intrinsics.checkNotNullParameter(birdPartManager, "birdPartManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f105042c = ui;
        this.f105043d = partSubject;
        this.f105044e = stickerManager;
        this.f105045f = birdPartManager;
        this.f105046g = reactiveConfig;
        getUi().m86366sm(false);
        getUi().m86378hm(reactiveConfig.m82623f8().m73665a().getOperatorConfig().getFeatures().getRepair().getEnableMlKitScanner());
    }

    /* renamed from: s */
    public static final boolean m17667s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: t */
    public static final InterfaceC23447K m17666t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m17665u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m17664v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m17663w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC23170iE
    public C24739jE getUi() {
        return this.f105042c;
    }

    /* renamed from: q */
    public final int m17669q(Throwable th) {
        if (th instanceof HttpException) {
            return ((HttpException) th).m53921a();
        }
        if (th instanceof retrofit2.HttpException) {
            return ((retrofit2.HttpException) th).m15616a();
        }
        if (th instanceof RetrofitException) {
            return ((RetrofitException) th).m53927c().m103943b();
        }
        return -1;
    }

    /* renamed from: r */
    public final void m17668r(PartKind kind, String str, boolean z) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        super.mo34311f(str, null);
        getUi().m86367rm(kind);
        Observable<String> m86400Am = getUi().m86400Am();
        final C27567b c27567b = new C27567b(z, this);
        Observable<String> filter = m86400Am.filter(new InterfaceC23494q() { // from class: lI3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m17667s;
                m17667s = C47377qI3.m17667s(Function1.this, obj);
                return m17667s;
            }
        });
        final C27568c c27568c = new C27568c(kind, this, z);
        Observable observeOn = filter.flatMapSingle(new InterfaceC23492o() { // from class: mI3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m17666t;
                m17666t = C47377qI3.m17666t(Function1.this, obj);
                return m17666t;
            }
        }).observeOn(C23454a.m33087a());
        final C27570d c27570d = new C27570d(this);
        Observable retry = observeOn.doOnError(new InterfaceC23484g() { // from class: nI3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C47377qI3.m17665u(Function1.this, obj);
            }
        }).retry();
        final C27571e c27571e = new C27571e();
        Observable doOnNext = retry.doOnNext(new InterfaceC23484g() { // from class: oI3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C47377qI3.m17664v(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "fun onCreate(kind: PartK… ui.dismiss()\n      }\n  }");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(m34312e()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27572f c27572f = new C27572f();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: pI3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C47377qI3.m17663w(Function1.this, obj);
            }
        });
    }

    /* renamed from: x */
    public final void m17662x(Throwable th) {
        HttpException httpException;
        C41318g46.m40159e(th);
        Unit unit = null;
        if (th instanceof HttpException) {
            httpException = (HttpException) th;
        } else {
            httpException = null;
        }
        if (httpException != null) {
            getUi().error(httpException);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            getUi().errorGeneric();
        }
        getUi().m86370p3();
    }
}
