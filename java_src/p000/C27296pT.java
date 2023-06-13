package p000;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdSearchResultAction;
import co.bird.android.model.ScanType;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.wire.WireBird;
import co.bird.api.error.RetrofitException;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002Ba\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u000e\b\u0001\u0010O\u001a\b\u0012\u0004\u0012\u00020N0M\u0012\b\b\u0001\u0010)\u001a\u00020&\u0012\b\b\u0001\u0010-\u001a\u00020*\u0012\b\b\u0001\u00101\u001a\u00020.\u0012\b\b\u0001\u00105\u001a\u000202¢\u0006\u0004\bP\u0010QJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0017J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R$\u0010;\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u0016R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006R"}, m28432d2 = {"LpT;", "LxC;", "LfT;", "", "id", "", "T", "S", "Landroid/content/Intent;", "intent", "b", "onDestroy", "LeT;", "event", "onEvent", "c", PaymentMethodOptionsParams.Blik.PARAM_CODE, "H", "(Ljava/lang/String;)V", "", "birdFound", "G", "(Z)V", "LVq4;", "LVq4;", "eventStream", "LFO2;", DateTokenConverter.CONVERTER_KEY, "LFO2;", "mechanicManager", "LEg1;", "e", "LEg1;", "eventBus", "Lgl;", "f", "Lgl;", "preference", "Landroid/content/res/Resources;", "g", "Landroid/content/res/Resources;", "resources", "LtT;", "h", "LtT;", "ui", "Le13;", "i", "Le13;", "navigator", "LDQ3;", "j", "LDQ3;", "permissionManager", "k", "Ljava/lang/String;", "M", "()Ljava/lang/String;", "setBirdId", "birdId", "l", "Z", "getBirdFound", "()Z", "setBirdFound", "Lco/bird/android/model/ScanType;", "m", "Lco/bird/android/model/ScanType;", "N", "()Lco/bird/android/model/ScanType;", "U", "(Lco/bird/android/model/ScanType;)V", "scanType", "Lco/bird/android/model/BirdSearchResultAction;", "n", "Lco/bird/android/model/BirdSearchResultAction;", "birdSearchResultAction", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "scopeProvider", "<init>", "(LVq4;LFO2;LEg1;Lgl;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/res/Resources;LtT;Le13;LDQ3;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdSearchPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdSearchPresenter.kt\nco/bird/android/app/feature/searchbird/BirdSearchPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,179:1\n180#2:180\n180#2:181\n199#2:182\n180#2:183\n199#2:184\n199#2:185\n*S KotlinDebug\n*F\n+ 1 BirdSearchPresenter.kt\nco/bird/android/app/feature/searchbird/BirdSearchPresenterImpl\n*L\n72#1:180\n79#1:181\n98#1:182\n120#1:183\n134#1:184\n144#1:185\n*E\n"})
/* renamed from: pT */
/* loaded from: classes2.dex */
public final class C27296pT extends C30060xC implements InterfaceC20425fT {

    /* renamed from: c */
    public final InterfaceC36675Vq4 f103693c;

    /* renamed from: d */
    public final FO2 f103694d;

    /* renamed from: e */
    public final InterfaceC32604Eg1 f103695e;

    /* renamed from: f */
    public final C22454gl f103696f;

    /* renamed from: g */
    public final Resources f103697g;

    /* renamed from: h */
    public final InterfaceC28719tT f103698h;

    /* renamed from: i */
    public final InterfaceC40099e13 f103699i;

    /* renamed from: j */
    public final DQ3 f103700j;

    /* renamed from: k */
    public String f103701k;

    /* renamed from: l */
    public boolean f103702l;

    /* renamed from: m */
    public ScanType f103703m;

    /* renamed from: n */
    public BirdSearchResultAction f103704n;

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"pT$a", "LCQ3;", "Lco/bird/android/model/constant/Permission;", "permission", "", C17296a.f69688o, "b", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pT$a */
    /* loaded from: classes2.dex */
    public static final class C27297a implements CQ3 {

        /* renamed from: a */
        public final /* synthetic */ boolean f103705a;

        /* renamed from: b */
        public final /* synthetic */ C27296pT f103706b;

        public C27297a(boolean z, C27296pT c27296pT) {
            this.f103705a = z;
            this.f103706b = c27296pT;
        }

        @Override // p000.CQ3
        /* renamed from: a */
        public void mo19266a(Permission permission) {
            ScanType scanType;
            Intrinsics.checkNotNullParameter(permission, "permission");
            if (!this.f103705a) {
                scanType = ScanType.SERIAL_NUMBER;
            } else {
                scanType = ScanType.NEW_QR_CODE;
            }
            InterfaceC40099e13.C19924a.goToLegacyScanBird$default(this.f103706b.f103699i, scanType, null, null, this.f103706b.f103696f.m37571t0(), null, false, 54, null);
        }

        @Override // p000.CQ3
        /* renamed from: b */
        public void mo19265b(Permission permission) {
            Intrinsics.checkNotNullParameter(permission, "permission");
            C41318g46.m40151m("User denied camera permission!", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pT$b */
    /* loaded from: classes2.dex */
    public static final class C27298b extends Lambda implements Function1<WireBird, Unit> {
        public C27298b() {
            super(1);
        }

        /* renamed from: a */
        public final void m19264a(WireBird wireBird) {
            C27296pT.this.m19274T(wireBird.getId());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m19264a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: pT$c */
    /* loaded from: classes2.dex */
    public static final class C27299c extends Lambda implements Function1<Throwable, Unit> {
        public C27299c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C27296pT.this.m19275S();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pT$d */
    /* loaded from: classes2.dex */
    public static final class C27300d extends Lambda implements Function1<WireBird, Unit> {
        public C27300d() {
            super(1);
        }

        /* renamed from: a */
        public final void m19263a(WireBird wireBird) {
            C27296pT.this.m19274T(wireBird.getId());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m19263a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: pT$e */
    /* loaded from: classes2.dex */
    public static final class C27301e extends Lambda implements Function1<Throwable, Unit> {
        public C27301e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C27296pT.this.m19275S();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: pT$f */
    /* loaded from: classes2.dex */
    public static final class C27302f extends Lambda implements Function1<String, Unit> {
        public C27302f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            C27296pT c27296pT = C27296pT.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c27296pT.m19286H(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: pT$g */
    /* loaded from: classes2.dex */
    public static final class C27303g extends Lambda implements Function1<Unit, Unit> {
        public C27303g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C27296pT.this.m19287G(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pT$h */
    /* loaded from: classes2.dex */
    public static final class C27304h extends Lambda implements Function1<WireBird, Unit> {
        public C27304h() {
            super(1);
        }

        /* renamed from: a */
        public final void m19262a(WireBird wireBird) {
            C27296pT.this.f103693c.mo77814c();
            C27296pT.this.f103699i.mo37030e3();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m19262a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: pT$i */
    /* loaded from: classes2.dex */
    public static final class C27305i extends Lambda implements Function1<Throwable, Unit> {
        public C27305i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C49375tg1 c49375tg1;
            if ((th instanceof RetrofitException) && ((RetrofitException) th).m53928b() == RetrofitException.EnumC16708a.HTTP) {
                try {
                    c49375tg1 = (C49375tg1) ((RetrofitException) th).m53929a(C49375tg1.class);
                } catch (Exception unused) {
                    String string = C27296pT.this.f103697g.getString(C45871nl4.error_500);
                    Intrinsics.checkNotNullExpressionValue(string, "resources.getString(L.string.error_500)");
                    c49375tg1 = new C49375tg1(500, string, null, null, 12, null);
                }
                C27296pT.this.f103698h.error(c49375tg1.m11932c());
                return;
            }
            C27296pT.this.f103698h.error(th.getMessage());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: pT$j */
    /* loaded from: classes2.dex */
    public static final class C27306j extends Lambda implements Function1<Unit, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: pT$j$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C27307a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BirdSearchResultAction.values().length];
                try {
                    iArr[BirdSearchResultAction.REPLACE_QR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BirdSearchResultAction.REPLACE_LOCK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C27306j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            BirdSearchResultAction birdSearchResultAction = C27296pT.this.f103704n;
            if (birdSearchResultAction == null) {
                Intrinsics.throwUninitializedPropertyAccessException("birdSearchResultAction");
                birdSearchResultAction = null;
            }
            int i = C27307a.$EnumSwitchMapping$0[birdSearchResultAction.ordinal()];
            if (i == 1) {
                C27296pT.this.m19287G(true);
            } else if (i != 2) {
            } else {
                InterfaceC40099e13 interfaceC40099e13 = C27296pT.this.f103699i;
                String m19281M = C27296pT.this.m19281M();
                Intrinsics.checkNotNull(m19281M);
                interfaceC40099e13.mo37112P1(m19281M);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27296pT(InterfaceC36675Vq4 eventStream, FO2 mechanicManager, InterfaceC32604Eg1 eventBus, C22454gl preference, LifecycleScopeProvider<EnumC7097RE> scopeProvider, Resources resources, InterfaceC28719tT ui, InterfaceC40099e13 navigator, DQ3 permissionManager) {
        super(scopeProvider);
        Intrinsics.checkNotNullParameter(eventStream, "eventStream");
        Intrinsics.checkNotNullParameter(mechanicManager, "mechanicManager");
        Intrinsics.checkNotNullParameter(eventBus, "eventBus");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        this.f103693c = eventStream;
        this.f103694d = mechanicManager;
        this.f103695e = eventBus;
        this.f103696f = preference;
        this.f103697g = resources;
        this.f103698h = ui;
        this.f103699i = navigator;
        this.f103700j = permissionManager;
    }

    /* renamed from: I */
    public static final void m19285I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m19284J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m19283K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m19282L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m19279O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m19278P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m19277Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m19276R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m19272V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public final void m19287G(boolean z) {
        DQ3.request$default(this.f103700j, Permission.CAMERA, new C27297a(z, this), null, 4, null);
    }

    /* renamed from: H */
    public final void m19286H(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        if (code.length() > 5) {
            AbstractC23442F<WireBird> m33152N = this.f103694d.mo93951m(code).m33152N(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33152N, "mechanicManager.validate…dSchedulers.mainThread())");
            Object m33135e = m33152N.m33135e(AutoDispose.m45239a(m5717t()));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C27298b c27298b = new C27298b();
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: lT
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C27296pT.m19285I(Function1.this, obj);
                }
            };
            final C27299c c27299c = new C27299c();
            ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: mT
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C27296pT.m19284J(Function1.this, obj);
                }
            });
            return;
        }
        AbstractC23442F<WireBird> m33152N2 = this.f103694d.mo93954g(code).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N2, "mechanicManager.validate…dSchedulers.mainThread())");
        Object m33135e2 = m33152N2.m33135e(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27300d c27300d = new C27300d();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: nT
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C27296pT.m19283K(Function1.this, obj);
            }
        };
        final C27301e c27301e = new C27301e();
        ((SingleSubscribeProxy) m33135e2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: oT
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C27296pT.m19282L(Function1.this, obj);
            }
        });
    }

    /* renamed from: M */
    public final String m19281M() {
        return this.f103701k;
    }

    /* renamed from: N */
    public final ScanType m19280N() {
        ScanType scanType = this.f103703m;
        if (scanType != null) {
            return scanType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("scanType");
        return null;
    }

    /* renamed from: S */
    public final void m19275S() {
        this.f103698h.mo10251P1(false);
        this.f103698h.mo10253L1(false);
        this.f103702l = false;
    }

    /* renamed from: T */
    public final void m19274T(String str) {
        this.f103701k = str;
        this.f103702l = true;
        this.f103698h.mo10251P1(true);
        this.f103698h.mo10253L1(true);
    }

    /* renamed from: U */
    public final void m19273U(ScanType scanType) {
        Intrinsics.checkNotNullParameter(scanType, "<set-?>");
        this.f103703m = scanType;
    }

    @Override // p000.InterfaceC20425fT
    /* renamed from: b */
    public void mo19271b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f103695e.mo104917a(this);
        Parcelable parcelableExtra = intent.getParcelableExtra("bird_search_result_action");
        Intrinsics.checkNotNull(parcelableExtra);
        this.f103704n = (BirdSearchResultAction) parcelableExtra;
        Observable<String> observeOn = this.f103698h.mo10252O1().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.textChanged()\n      .…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27302f c27302f = new C27302f();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: jT
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C27296pT.m19279O(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn2 = this.f103698h.mo10254D5().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.barcodeIconClick()\n  …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27303g c27303g = new C27303g();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: kT
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C27296pT.m19278P(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC20425fT
    /* renamed from: c */
    public void mo19270c() {
        Observable<Unit> observeOn = this.f103698h.mo10248w0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.nextClicks()\n      .o…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27306j c27306j = new C27306j();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: gT
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C27296pT.m19272V(Function1.this, obj);
            }
        });
    }

    @Override // p000.C30060xC, p000.N95
    public void onDestroy() {
        this.f103695e.mo104914d(this);
        super.onDestroy();
    }

    @InterfaceC40955fT5
    public void onEvent(C20042eT event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m19273U(event.m42869c());
        if (m19280N() == ScanType.SERIAL_NUMBER) {
            this.f103698h.mo10250hd(event.m42870b());
        } else if (m19280N() == ScanType.NEW_QR_CODE) {
            FO2 fo2 = this.f103694d;
            String str = this.f103701k;
            Intrinsics.checkNotNull(str);
            AbstractC23442F<WireBird> m33152N = fo2.mo93976C(str, event.m42870b()).m33152N(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33152N, "mechanicManager.assignQr…dSchedulers.mainThread())");
            Object m33135e = m33152N.m33135e(AutoDispose.m45239a(m5717t()));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C27304h c27304h = new C27304h();
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: hT
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C27296pT.m19277Q(Function1.this, obj);
                }
            };
            final C27305i c27305i = new C27305i();
            ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: iT
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C27296pT.m19276R(Function1.this, obj);
                }
            });
        }
    }
}
