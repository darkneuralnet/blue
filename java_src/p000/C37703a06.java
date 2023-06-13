package p000;

import android.content.Intent;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.TaxInformation;
import co.bird.android.model.TaxInformationKt;
import co.bird.android.model.TaxInformationSource;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p000.H31;
import zendesk.support.request.DocumentRenderer;
@Metadata(m28433d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001ABM\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\b\b\u0001\u0010/\u001a\u00020,\u0012\b\b\u0001\u00103\u001a\u000200\u0012\u000e\b\u0001\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\f\u0010\u001b\u001a\u00020\u0010*\u00020\u0007H\u0002R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00105R\u0014\u0010:\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u00105¨\u0006B"}, m28432d2 = {"La06;", "LxC;", "", "Landroid/content/Intent;", "intent", "", "b", "Lco/bird/android/model/TaxInformationSource;", Stripe3ds2AuthParams.FIELD_SOURCE, "i0", "c0", "X", "Lio/reactivex/F;", "o0", "a0", "g0", "", "T", "", "Q", "N", "O", "M", "Le06;", "V", "Lco/bird/android/model/TaxInformation;", "R", "W", "LTq4;", "c", "LTq4;", "reactiveConfig", "LHZ5;", DateTokenConverter.CONVERTER_KEY, "LHZ5;", "taxInformationManager", "LEa;", "e", "LEa;", "analyticsManager", "Lgl;", "f", "Lgl;", "preference", "Lf06;", "g", "Lf06;", "ui", "Le13;", "h", "Le13;", "navigator", "U", "()Z", "signUpFlowEnabled", "S", "settingsEnabled", "P", "complaintReceiptEnabled", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "scopeProvider", "<init>", "(LTq4;LHZ5;LEa;Lgl;Lf06;Le13;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;)V", "i", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTaxInformationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxInformationPresenter.kt\nco/bird/android/app/feature/taxinformation/TaxInformationPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,267:1\n180#2:268\n180#2:269\n180#2:270\n199#2:271\n180#2:272\n180#2:273\n1#3:274\n*S KotlinDebug\n*F\n+ 1 TaxInformationPresenter.kt\nco/bird/android/app/feature/taxinformation/TaxInformationPresenterImpl\n*L\n102#1:268\n114#1:269\n127#1:270\n140#1:271\n186#1:272\n195#1:273\n*E\n"})
/* renamed from: a06  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37703a06 extends C30060xC {

    /* renamed from: i */
    public static final C10489a f49643i = new C10489a(null);

    /* renamed from: j */
    public static final int f49644j = 8;

    /* renamed from: c */
    public final C36207Tq4 f49645c;

    /* renamed from: d */
    public final HZ5 f49646d;

    /* renamed from: e */
    public final InterfaceC1880Ea f49647e;

    /* renamed from: f */
    public final C22454gl f49648f;

    /* renamed from: g */
    public final InterfaceC40685f06 f49649g;

    /* renamed from: h */
    public final InterfaceC40099e13 f49650h;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"La06$a;", "", "", "OBSCURED_CHAR", "Ljava/lang/String;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: a06$a */
    /* loaded from: classes2.dex */
    public static final class C10489a {
        public /* synthetic */ C10489a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C10489a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a06$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C10490b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaxInformationSource.values().length];
            try {
                iArr[TaxInformationSource.SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaxInformationSource.COMPLAINT_RECEIPTS_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TaxInformationSource.COMPLAINT_RECEIPTS_AND_TAX_ENABLED_MARKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TaxInformationSource.SIGNUP_FLOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/TaxInformation;", "kotlin.jvm.PlatformType", "taxInformation", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: a06$c */
    /* loaded from: classes2.dex */
    public static final class C10491c extends Lambda implements Function1<Optional<TaxInformation>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ TaxInformationSource f49652h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10491c(TaxInformationSource taxInformationSource) {
            super(1);
            this.f49652h = taxInformationSource;
        }

        /* renamed from: a */
        public final void m72083a(Optional<TaxInformation> optional) {
            boolean z;
            if (optional.m59037c()) {
                InterfaceC40685f06 interfaceC40685f06 = C37703a06.this.f49649g;
                if (TaxInformationKt.isBlank(optional.m59038b()) && !C37703a06.this.m72109W(this.f49652h)) {
                    z = false;
                } else {
                    z = true;
                }
                interfaceC40685f06.mo40338x2(z);
                C37703a06.this.f49649g.mo40340v6(optional.m59038b(), false, C37703a06.this.m72118N(this.f49652h), C37703a06.this.m72115Q());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<TaxInformation> optional) {
            m72083a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a06$d */
    /* loaded from: classes2.dex */
    public static final class C10492d extends Lambda implements Function1<Throwable, Unit> {
        public C10492d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C37703a06.this.f49649g.mo40353Gi();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: a06$e */
    /* loaded from: classes2.dex */
    public static final class C10493e extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Unit>> {

        /* renamed from: h */
        public final /* synthetic */ TaxInformationSource f49655h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10493e(TaxInformationSource taxInformationSource) {
            super(1);
            this.f49655h = taxInformationSource;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Unit> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C28237sD.progress$default(C37703a06.this.m72090o0(this.f49655h), C37703a06.this.f49649g, 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a06$f */
    /* loaded from: classes2.dex */
    public static final class C10494f extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C10494f f49656g = new C10494f();

        public C10494f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a06$g */
    /* loaded from: classes2.dex */
    public static final class C10495g extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: g */
        public static final C10495g f49657g = new C10495g();

        public C10495g() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a06$h */
    /* loaded from: classes2.dex */
    public static final class C10496h extends Lambda implements Function1<Unit, Unit> {
        public C10496h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            boolean contains$default;
            String fiscalCode = C37703a06.this.f49649g.mo40351Lc().getFiscalCode();
            boolean z = false;
            if (fiscalCode != null) {
                contains$default = StringsKt__StringsKt.contains$default((CharSequence) fiscalCode, (CharSequence) DocumentRenderer.Style.C31402Li.UNICODE_BULLET, false, 2, (Object) null);
                if (contains$default) {
                    z = true;
                }
            }
            if (z) {
                C37703a06.this.f49649g.mo40346Y3();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a06$i */
    /* loaded from: classes2.dex */
    public static final class C10497i extends Lambda implements Function1<Unit, Unit> {
        public C10497i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C37703a06.this.f49648f.m37704M2();
            C37703a06.this.f49650h.mo37050b1(-1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a06$j */
    /* loaded from: classes2.dex */
    public static final class C10498j extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C10498j f49660g = new C10498j();

        public C10498j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a06$k */
    /* loaded from: classes2.dex */
    public static final class C10499k extends Lambda implements Function1<Boolean, Unit> {
        public C10499k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C37703a06.this.f49649g.mo40338x2(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a06$l */
    /* loaded from: classes2.dex */
    public static final class C10500l extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C10500l f49662g = new C10500l();

        public C10500l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: a06$m */
    /* loaded from: classes2.dex */
    public static final class C10501m extends Lambda implements Function1<Boolean, InterfaceC23447K<? extends Object>> {

        /* renamed from: h */
        public final /* synthetic */ TaxInformationSource f49664h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10501m(TaxInformationSource taxInformationSource) {
            super(1);
            this.f49664h = taxInformationSource;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Object> invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (C37703a06.this.m72119M(this.f49664h)) {
                return C28237sD.progress$default(C37703a06.this.m72090o0(this.f49664h), C37703a06.this.f49649g, 0, 2, (Object) null);
            }
            AbstractC23442F m33158H = AbstractC23442F.m33158H(it);
            Intrinsics.checkNotNullExpressionValue(m33158H, "{\n            Single.just(it)\n          }");
            return m33158H;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/TaxInformation;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/TaxInformation;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: a06$n */
    /* loaded from: classes2.dex */
    public static final class C10502n extends Lambda implements Function1<TaxInformation, Unit> {

        /* renamed from: h */
        public final /* synthetic */ TaxInformationSource f49666h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10502n(TaxInformationSource taxInformationSource) {
            super(1);
            this.f49666h = taxInformationSource;
        }

        /* renamed from: a */
        public final void m72081a(TaxInformation taxInformation) {
            if (C37703a06.this.m72117O(this.f49666h)) {
                C37703a06.this.f49650h.mo37050b1(-1);
            } else {
                C37703a06.this.f49649g.mo40343j3();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TaxInformation taxInformation) {
            m72081a(taxInformation);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a06$o */
    /* loaded from: classes2.dex */
    public static final class C10503o extends Lambda implements Function1<Throwable, Unit> {
        public C10503o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            H31.C3014a.showDialog$default(C37703a06.this.f49649g, C32631Ej1.f7981d, false, false, null, null, null, null, 126, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/TaxInformation;", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/TaxInformation;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: a06$p */
    /* loaded from: classes2.dex */
    public static final class C10504p extends Lambda implements Function1<TaxInformation, InterfaceC23447K<? extends Unit>> {

        /* renamed from: g */
        public static final C10504p f49668g = new C10504p();

        public C10504p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Unit> invoke(TaxInformation it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC23442F.m33158H(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37703a06(C36207Tq4 reactiveConfig, HZ5 taxInformationManager, InterfaceC1880Ea analyticsManager, C22454gl preference, InterfaceC40685f06 ui, InterfaceC40099e13 navigator, LifecycleScopeProvider<EnumC7097RE> scopeProvider) {
        super(scopeProvider);
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(taxInformationManager, "taxInformationManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f49645c = reactiveConfig;
        this.f49646d = taxInformationManager;
        this.f49647e = analyticsManager;
        this.f49648f = preference;
        this.f49649g = ui;
        this.f49650h = navigator;
    }

    /* renamed from: Y */
    public static final void m72107Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m72106Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final InterfaceC23447K m72103b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final boolean m72101d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: e0 */
    public static final Unit m72100e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m72099f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m72097h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final boolean m72095j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: k0 */
    public static final void m72094k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final boolean m72093l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: m0 */
    public static final InterfaceC23447K m72092m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final void m72091n0(C37703a06 this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f49649g.mo40338x2(false);
    }

    /* renamed from: p0 */
    public static final void m72089p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q0 */
    public static final void m72088q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final InterfaceC23447K m72087r0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public final boolean m72119M(TaxInformationSource taxInformationSource) {
        int i = C10490b.$EnumSwitchMapping$0[taxInformationSource.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i == 4) {
                return this.f49645c.m82623f8().getValue().getTaxInformationConfig().getEnableSignupFlowAutosubmitNo();
            }
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    /* renamed from: N */
    public final String m72118N(TaxInformationSource taxInformationSource) {
        int i = C10490b.$EnumSwitchMapping$0[taxInformationSource.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i == 4) {
                return this.f49645c.m82623f8().getValue().getTaxInformationConfig().getSignupFlowAlternativePrompt();
            }
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    /* renamed from: O */
    public final boolean m72117O(TaxInformationSource taxInformationSource) {
        int i = C10490b.$EnumSwitchMapping$0[taxInformationSource.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    /* renamed from: P */
    public final boolean m72116P() {
        return Intrinsics.areEqual(this.f49645c.m82623f8().m73665a().getTaxInformationConfig().getEnableCompliantReceipts(), Boolean.TRUE);
    }

    /* renamed from: Q */
    public final String m72115Q() {
        boolean isBlank;
        String countryName = this.f49645c.m82623f8().getValue().getTaxInformationConfig().getCountryName();
        if (countryName != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(countryName);
            if (!isBlank) {
                return countryName;
            }
        }
        return null;
    }

    /* renamed from: R */
    public final TaxInformation m72114R() {
        return this.f49649g.mo40351Lc();
    }

    /* renamed from: S */
    public final boolean m72113S() {
        return this.f49645c.m82623f8().m73665a().getTaxInformationConfig().getEnableSettingsButton();
    }

    /* renamed from: T */
    public final boolean m72112T(TaxInformationSource taxInformationSource) {
        int i = C10490b.$EnumSwitchMapping$0[taxInformationSource.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i == 4) {
                return this.f49645c.m82623f8().getValue().getTaxInformationConfig().getShowSignupFlowSkipButton();
            }
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    /* renamed from: U */
    public final boolean m72111U() {
        return this.f49645c.m82623f8().m73665a().getTaxInformationConfig().getEnableSignupFlowScreen();
    }

    /* renamed from: V */
    public final C40092e06 m72110V(TaxInformationSource taxInformationSource) {
        return new C40092e06(null, null, null, taxInformationSource.toString(), m72112T(taxInformationSource), m72119M(taxInformationSource), this.f49649g.mo40354Di(), 7, null);
    }

    /* renamed from: W */
    public final boolean m72109W(TaxInformationSource taxInformationSource) {
        int i = C10490b.$EnumSwitchMapping$0[taxInformationSource.ordinal()];
        return i == 2 || i == 3;
    }

    /* renamed from: X */
    public final void m72108X(TaxInformationSource taxInformationSource) {
        AbstractC23442F<Optional<TaxInformation>> m33152N = this.f49646d.mo98738a().m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "taxInformationManager.ge…dSchedulers.mainThread())");
        Object m33135e = C28237sD.progress$default(m33152N, this.f49649g, 0, 2, (Object) null).m33135e(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10491c c10491c = new C10491c(taxInformationSource);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: MZ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37703a06.m72107Y(Function1.this, obj);
            }
        };
        final C10492d c10492d = new C10492d();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: NZ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37703a06.m72106Z(Function1.this, obj);
            }
        });
    }

    /* renamed from: a0 */
    public final void m72105a0(TaxInformationSource taxInformationSource) {
        int i;
        int i2 = C10490b.$EnumSwitchMapping$0[taxInformationSource.ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            if (i2 == 4) {
                i = C45871nl4.tax_information_signup_flow_button_text;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i = C45871nl4.tax_information_save_button_text;
        }
        this.f49649g.mo40345Y6(i);
        Observable<Unit> mo40350Lj = this.f49649g.mo40350Lj();
        final C10493e c10493e = new C10493e(taxInformationSource);
        Observable observeOn = mo40350Lj.flatMapSingle(new InterfaceC23492o() { // from class: YZ5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m72103b0;
                m72103b0 = C37703a06.m72103b0(Function1.this, obj);
                return m72103b0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "private fun setUpCtaButt…r)\n      .subscribe()\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
    }

    /* renamed from: b */
    public void m72104b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Parcelable parcelableExtra = intent.getParcelableExtra("co.bird.android.tax_information_source");
        Intrinsics.checkNotNull(parcelableExtra);
        TaxInformationSource taxInformationSource = (TaxInformationSource) parcelableExtra;
        this.f49649g.mo40340v6(new TaxInformation(null, null, null, null, null, null, null, m72115Q(), null, null), !m72116P(), m72118N(taxInformationSource), m72115Q());
        m72096i0(taxInformationSource);
        this.f49649g.mo40347V9(true);
        m72102c0();
        m72105a0(taxInformationSource);
        m72098g0(taxInformationSource);
        if (taxInformationSource != TaxInformationSource.SIGNUP_FLOW) {
            m72108X(taxInformationSource);
        }
        this.f49647e.mo55905y(m72110V(taxInformationSource));
    }

    /* renamed from: c0 */
    public final void m72102c0() {
        Observable<Boolean> mo40355Bg = this.f49649g.mo40355Bg();
        final C10494f c10494f = C10494f.f49656g;
        Observable<Boolean> filter = mo40355Bg.filter(new InterfaceC23494q() { // from class: OZ5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m72101d0;
                m72101d0 = C37703a06.m72101d0(Function1.this, obj);
                return m72101d0;
            }
        });
        final C10495g c10495g = C10495g.f49657g;
        Observable observeOn = filter.map(new InterfaceC23492o() { // from class: PZ5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit m72100e0;
                m72100e0 = C37703a06.m72100e0(Function1.this, obj);
                return m72100e0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.fiscalCodeFocusChange…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10496h c10496h = new C10496h();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: QZ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37703a06.m72099f0(Function1.this, obj);
            }
        });
    }

    /* renamed from: g0 */
    public final void m72098g0(TaxInformationSource taxInformationSource) {
        this.f49649g.mo40349O4(m72112T(taxInformationSource));
        Observable<Unit> observeOn = this.f49649g.mo40341u1().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.skipButtonClicks()\n  …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10497i c10497i = new C10497i();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ZZ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37703a06.m72097h0(Function1.this, obj);
            }
        });
    }

    /* renamed from: i0 */
    public final void m72096i0(TaxInformationSource taxInformationSource) {
        boolean z;
        if (m72113S() || m72111U()) {
            Observable<Boolean> mo40339vb = this.f49649g.mo40339vb();
            final C10498j c10498j = C10498j.f49660g;
            Observable<Boolean> observeOn = mo40339vb.filter(new InterfaceC23494q() { // from class: TZ5
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m72095j0;
                    m72095j0 = C37703a06.m72095j0(Function1.this, obj);
                    return m72095j0;
                }
            }).observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn, "ui.taxCodeYesChanges()\n …dSchedulers.mainThread())");
            Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m5717t()));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C10499k c10499k = new C10499k();
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: UZ5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C37703a06.m72094k0(Function1.this, obj);
                }
            });
            Observable<Boolean> mo40352H2 = this.f49649g.mo40352H2();
            final C10500l c10500l = C10500l.f49662g;
            Observable<Boolean> observeOn2 = mo40352H2.filter(new InterfaceC23494q() { // from class: VZ5
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m72093l0;
                    m72093l0 = C37703a06.m72093l0(Function1.this, obj);
                    return m72093l0;
                }
            }).observeOn(C23454a.m33087a());
            final C10501m c10501m = new C10501m(taxInformationSource);
            Observable<R> flatMapSingle = observeOn2.flatMapSingle(new InterfaceC23492o() { // from class: WZ5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m72092m0;
                    m72092m0 = C37703a06.m72092m0(Function1.this, obj);
                    return m72092m0;
                }
            });
            Intrinsics.checkNotNullExpressionValue(flatMapSingle, "private fun setUpTaxCode…plaintReceiptEnabled)\n  }");
            Object m33094as2 = flatMapSingle.m33094as(AutoDispose.m45239a(m5717t()));
            Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: XZ5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C37703a06.m72091n0(C37703a06.this, obj);
                }
            });
        }
        InterfaceC40685f06 interfaceC40685f06 = this.f49649g;
        boolean z2 = false;
        if (!m72113S() && !m72111U()) {
            z = false;
        } else {
            z = true;
        }
        interfaceC40685f06.mo40344bj(z);
        InterfaceC40685f06 interfaceC40685f062 = this.f49649g;
        if (m72113S() || m72111U()) {
            z2 = true;
        }
        interfaceC40685f062.mo40348Q1(z2);
        this.f49649g.mo40342na(m72116P());
    }

    /* renamed from: o0 */
    public final AbstractC23442F<Unit> m72090o0(TaxInformationSource taxInformationSource) {
        AbstractC23442F<TaxInformation> m33152N = this.f49646d.mo98737b(m72114R()).m33152N(C23454a.m33087a());
        final C10502n c10502n = new C10502n(taxInformationSource);
        AbstractC23442F<TaxInformation> m33101w = m33152N.m33101w(new InterfaceC23484g() { // from class: LZ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37703a06.m72089p0(Function1.this, obj);
            }
        });
        final C10503o c10503o = new C10503o();
        AbstractC23442F<TaxInformation> m33106t = m33101w.m33106t(new InterfaceC23484g() { // from class: RZ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37703a06.m72088q0(Function1.this, obj);
            }
        });
        final C10504p c10504p = C10504p.f49668g;
        AbstractC23442F<Unit> m33148R = m33106t.m33165A(new InterfaceC23492o() { // from class: SZ5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m72087r0;
                m72087r0 = C37703a06.m72087r0(Function1.this, obj);
                return m72087r0;
            }
        }).m33148R(Unit.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(m33148R, "private fun submitForm(s…ErrorReturnItem(Unit)\n  }");
        return m33148R;
    }
}
