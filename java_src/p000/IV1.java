package p000;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.RequirementsResult;
import co.bird.android.model.User;
import co.bird.android.model.identification.IdentificationAcceptableMethod;
import co.bird.android.model.identification.IdentificationDocumentDescriptor;
import co.bird.android.model.identification.IdentificationDocumentScannerStrategy;
import co.bird.android.model.identification.IdentificationEntryMethod;
import co.bird.android.model.identification.IdentificationSelfieEntryMethod;
import co.bird.android.model.identification.IdentificationSubmissionData;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23479b;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.joda.time.DateTime;
import p000.C37791a94;
import p000.C46615p06;
import p000.IV1;
import p000.S74;
import p000.US1;
@Metadata(m28433d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 U2\u00020\u0001:\u0001\u0019BQ\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010;\u001a\u000208¢\u0006\u0004\bS\u0010TJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0014\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0016\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0004R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R,\u0010C\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020=0A0\u00110<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010?R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010O¨\u0006V"}, m28432d2 = {"LIV1;", "", "Lco/bird/android/model/identification/IdentificationDocumentDescriptor;", "descriptor", "", "t", "P", "LoU1;", "partialData", "Landroid/net/Uri;", "uri", "Q", "Lco/bird/android/model/RequirementsResult;", "requirementsResult", "", "r", "s", "Lco/bird/android/buava/Optional;", "LUS1$c;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "q", "G", "I", "H", "LmT1;", C17296a.f69688o, "LmT1;", "identificationManager", "LTV1;", "b", "LTV1;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "Lgl;", "e", "Lgl;", "appPreference", "LRh6;", "f", "LRh6;", "userStream", "LOh;", "g", "LOh;", "appBuildConfig", "LTq4;", "h", "LTq4;", "reactiveConfig", "LEa;", "i", "LEa;", "analyticsManager", "La94;", "", "j", "La94;", "isAutoDetecting", "Lkotlin/Pair;", "k", "capturedFileRelay", "l", "Lco/bird/android/model/identification/IdentificationDocumentDescriptor;", "Lorg/joda/time/DateTime;", "m", "Lorg/joda/time/DateTime;", "initialTime", "Ljava/util/concurrent/atomic/AtomicBoolean;", "n", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasSubmitted", "E", "()Z", "isDebug", "F", "isSelfie", "<init>", "(LmT1;LTV1;Lcom/uber/autodispose/ScopeProvider;Le13;Lgl;LRh6;LOh;LTq4;LEa;)V", "o", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdentificationScannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationScannerPresenter.kt\nco/bird/android/feature/identification/IdentificationScannerPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,422:1\n180#2:423\n180#2:424\n180#2:425\n180#2:426\n180#2:427\n180#2:428\n1#3:429\n1#3:444\n1549#4:430\n1620#4,3:431\n1603#4,9:434\n1855#4:443\n1856#4:445\n1612#4:446\n*S KotlinDebug\n*F\n+ 1 IdentificationScannerPresenter.kt\nco/bird/android/feature/identification/IdentificationScannerPresenter\n*L\n130#1:423\n176#1:424\n224#1:425\n255#1:426\n263#1:427\n277#1:428\n414#1:444\n408#1:430\n408#1:431,3\n414#1:434,9\n414#1:443\n414#1:445\n414#1:446\n*E\n"})
/* renamed from: IV1 */
/* loaded from: classes3.dex */
public final class IV1 {

    /* renamed from: o */
    public static final C3663a f15769o = new C3663a(null);

    /* renamed from: a */
    public final InterfaceC45102mT1 f15770a;

    /* renamed from: b */
    public final TV1 f15771b;

    /* renamed from: c */
    public final ScopeProvider f15772c;

    /* renamed from: d */
    public final InterfaceC40099e13 f15773d;

    /* renamed from: e */
    public final C22454gl f15774e;

    /* renamed from: f */
    public final InterfaceC35660Rh6 f15775f;

    /* renamed from: g */
    public final InterfaceC6097Oh f15776g;

    /* renamed from: h */
    public final C36207Tq4 f15777h;

    /* renamed from: i */
    public final InterfaceC1880Ea f15778i;

    /* renamed from: j */
    public final C37791a94<Boolean> f15779j;

    /* renamed from: k */
    public final C37791a94<Optional<Pair<Uri, Boolean>>> f15780k;

    /* renamed from: l */
    public IdentificationDocumentDescriptor f15781l;

    /* renamed from: m */
    public DateTime f15782m;

    /* renamed from: n */
    public AtomicBoolean f15783n;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LIV1$a;", "", "", "CAPTURED_IMAGE_EXTENSION", "Ljava/lang/String;", "CAPTURED_IMAGE_PREFIX", "<init>", "()V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: IV1$a */
    /* loaded from: classes3.dex */
    public static final class C3663a {
        public /* synthetic */ C3663a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3663a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IV1$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3664b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdentificationAcceptableMethod.EntryMethodType.values().length];
            try {
                iArr[IdentificationAcceptableMethod.EntryMethodType.FRONT_SCAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdentificationAcceptableMethod.EntryMethodType.BACK_SCAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdentificationAcceptableMethod.EntryMethodType.SELFIE_PHOTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdentificationAcceptableMethod.EntryMethodType.SELFIE_VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IV1$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3665c extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C3665c f15784b = new C3665c();

        public C3665c() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IV1$d */
    /* loaded from: classes3.dex */
    public static final class C3666d extends Lambda implements Function1<Long, Unit> {
        public C3666d() {
            super(1);
        }

        /* renamed from: a */
        public final void m102000a(Long l) {
            IV1.this.f15771b.m83528bm(Integer.valueOf(C45871nl4.identification_scanning_having_trouble), new Object[0]);
            IV1.this.f15771b.m83526dm(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m102000a(l);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IV1$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3667e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C3667e f15786b = new C3667e();

        public C3667e() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IV1$f */
    /* loaded from: classes3.dex */
    public static final class C3668f extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Uri>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: IV1$f$a */
        /* loaded from: classes3.dex */
        public static final class C3669a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ IV1 f15788g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3669a(IV1 iv1) {
                super(1);
                this.f15788g = iv1;
            }

            /* renamed from: a */
            public final void m101996a(InterfaceC23465c interfaceC23465c) {
                S74.C7343a.showProgress$default(this.f15788g.f15771b, true, 0, 2, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m101996a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Landroid/net/Uri;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", C17296a.f69688o, "(Landroid/net/Uri;Ljava/lang/Throwable;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: IV1$f$b */
        /* loaded from: classes3.dex */
        public static final class C3670b extends Lambda implements Function2<Uri, Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ IV1 f15789g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3670b(IV1 iv1) {
                super(2);
                this.f15789g = iv1;
            }

            /* renamed from: a */
            public final void m101995a(Uri uri, Throwable th) {
                S74.C7343a.showProgress$default(this.f15789g.f15771b, false, 0, 2, null);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Uri uri, Throwable th) {
                m101995a(uri, th);
                return Unit.INSTANCE;
            }
        }

        public C3668f() {
            super(1);
        }

        /* renamed from: c */
        public static final void m101997c(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj, obj2);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Uri> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            IV1.this.f15779j.accept(Boolean.FALSE);
            AbstractC23442F<Uri> m33152N = IV1.this.f15771b.m83524fm(IV1.this.f15770a.mo25568a(), "cap", ".jpg").m33152N(C23454a.m33087a());
            final C3669a c3669a = new C3669a(IV1.this);
            AbstractC23442F<Uri> m33102v = m33152N.m33102v(new InterfaceC23484g() { // from class: JV1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    IV1.C3668f.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C3670b c3670b = new C3670b(IV1.this);
            return m33102v.m33104u(new InterfaceC23479b() { // from class: KV1
                @Override // io.reactivex.functions.InterfaceC23479b
                public final void accept(Object obj, Object obj2) {
                    IV1.C3668f.m101997c(Function2.this, obj, obj2);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IV1$g */
    /* loaded from: classes3.dex */
    public static final class C3671g extends Lambda implements Function1<Throwable, Unit> {
        public C3671g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            IV1.this.m102028P();
            IV1.this.f15771b.errorGeneric();
            InterfaceC1880Ea interfaceC1880Ea = IV1.this.f15778i;
            String localizedMessage = th.getLocalizedMessage();
            interfaceC1880Ea.mo55905y(new C44502lS3(null, null, null, "identification_scanner_manual_capture_take_photo", localizedMessage == null ? th.toString() : localizedMessage, 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/net/Uri;", "kotlin.jvm.PlatformType", "fileUri", "", C17296a.f69688o, "(Landroid/net/Uri;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IV1$h */
    /* loaded from: classes3.dex */
    public static final class C3672h extends Lambda implements Function1<Uri, Unit> {
        public C3672h() {
            super(1);
        }

        /* renamed from: a */
        public final void m101994a(Uri uri) {
            IV1.this.f15780k.accept(Optional.f63040c.m59032c(TuplesKt.m28425to(uri, Boolean.FALSE)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Uri uri) {
            m101994a(uri);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IV1$i */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3673i extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C3673i f15792b = new C3673i();

        public C3673i() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IV1$j */
    /* loaded from: classes3.dex */
    public static final class C3674j extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ IdentificationDocumentDescriptor f15794h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3674j(IdentificationDocumentDescriptor identificationDocumentDescriptor) {
            super(1);
            this.f15794h = identificationDocumentDescriptor;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            IV1 iv1 = IV1.this;
            Optional.C14443a c14443a = Optional.f63040c;
            iv1.m102010q(c14443a.m59034a());
            IV1.this.f15780k.accept(c14443a.m59034a());
            IV1.this.m102028P();
            IV1.this.f15771b.m83529am(IV1.this.m102008s(this.f15794h));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IV1$k */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3675k extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C3675k f15795b = new C3675k();

        public C3675k() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IV1$l */
    /* loaded from: classes3.dex */
    public static final class C3676l extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ IdentificationDocumentDescriptor f15797h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3676l(IdentificationDocumentDescriptor identificationDocumentDescriptor) {
            super(1);
            this.f15797h = identificationDocumentDescriptor;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            IV1.this.m102010q(Optional.f63040c.m59034a());
            C46297oU1 mo25561h = IV1.this.f15770a.mo25561h();
            Pair pair = (Pair) ((Optional) IV1.this.f15780k.getValue()).m59035e();
            Uri uri = pair != null ? (Uri) pair.getFirst() : null;
            Pair pair2 = (Pair) ((Optional) IV1.this.f15780k.getValue()).m59035e();
            boolean z = pair2 != null && ((Boolean) pair2.getSecond()).booleanValue();
            if (mo25561h != null && uri != null) {
                IV1.this.m102027Q(mo25561h, uri, this.f15797h);
                IV1.this.f15783n.set(true);
                InterfaceC1880Ea interfaceC1880Ea = IV1.this.f15778i;
                String wire = this.f15797h.getDocumentType().toWire();
                String jurisdiction = this.f15797h.getJurisdiction().getJurisdiction();
                IdentificationEntryMethod documentEntryMethod = this.f15797h.getEntryMethodType().toDocumentEntryMethod();
                String wire2 = documentEntryMethod != null ? documentEntryMethod.toWire() : null;
                IdentificationSelfieEntryMethod selfieEntryMethod = this.f15797h.getEntryMethodType().toSelfieEntryMethod();
                String wire3 = selfieEntryMethod != null ? selfieEntryMethod.toWire() : null;
                IdentificationDocumentScannerStrategy strategy = IdentificationDocumentScannerStrategy.Companion.toStrategy(this.f15797h, IV1.this.f15777h.m82623f8().m73665a().getIdentificationConfig());
                boolean z2 = strategy != null && strategy.getEnableAutoDetect();
                DateTime now = DateTime.now();
                Intrinsics.checkNotNullExpressionValue(now, "now()");
                interfaceC1880Ea.mo55905y(new OP1(null, null, null, wire, jurisdiction, wire2, wire3, z2, z, C46880pT0.m19253i(now, IV1.this.f15782m), 7, null));
                IV1.this.f15773d.mo37050b1(-1);
                return;
            }
            IV1.this.f15771b.errorGeneric();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "autoDetecting", "Lio/reactivex/u;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Boolean;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IV1$m */
    /* loaded from: classes3.dex */
    public static final class C3677m extends Lambda implements Function1<Boolean, InterfaceC24574u<? extends Uri>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LUS1$c;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lco/bird/android/model/RequirementsResult;", C17296a.f69688o, "(LUS1$c;)Lco/bird/android/model/RequirementsResult;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: IV1$m$a */
        /* loaded from: classes3.dex */
        public static final class C3678a extends Lambda implements Function1<US1.C8284c, RequirementsResult> {

            /* renamed from: g */
            public final /* synthetic */ IV1 f15799g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3678a(IV1 iv1) {
                super(1);
                this.f15799g = iv1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final RequirementsResult invoke(US1.C8284c result) {
                Intrinsics.checkNotNullParameter(result, "result");
                IdentificationDocumentDescriptor identificationDocumentDescriptor = this.f15799g.f15781l;
                if (identificationDocumentDescriptor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("descriptor");
                    identificationDocumentDescriptor = null;
                }
                return C33792Ji1.m99929g(result, identificationDocumentDescriptor, this.f15799g.f15777h.m82623f8().m73665a().getIdentificationConfig());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "LUS1$c;", "Lco/bird/android/model/RequirementsResult;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nIdentificationScannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationScannerPresenter.kt\nco/bird/android/feature/identification/IdentificationScannerPresenter$onResume$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,422:1\n1#2:423\n37#3,2:424\n*S KotlinDebug\n*F\n+ 1 IdentificationScannerPresenter.kt\nco/bird/android/feature/identification/IdentificationScannerPresenter$onResume$1$2\n*L\n104#1:424,2\n*E\n"})
        /* renamed from: IV1$m$b */
        /* loaded from: classes3.dex */
        public static final class C3679b extends Lambda implements Function1<Triple<? extends US1.C8284c, ? extends RequirementsResult, ? extends Bitmap>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ IV1 f15800g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3679b(IV1 iv1) {
                super(1);
                this.f15800g = iv1;
            }

            /* renamed from: a */
            public final void m101986a(Triple<US1.C8284c, RequirementsResult, Bitmap> triple) {
                List listOfNotNull;
                RequirementsResult component2 = triple.component2();
                this.f15800g.m102010q(Optional.f63040c.m59032c(triple.component1()));
                IdentificationDocumentDescriptor identificationDocumentDescriptor = this.f15800g.f15781l;
                String str = null;
                if (identificationDocumentDescriptor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("descriptor");
                    identificationDocumentDescriptor = null;
                }
                Integer m99931e = C33792Ji1.m99931e(identificationDocumentDescriptor.getDocumentType());
                if (m99931e != null) {
                    str = this.f15800g.f15771b.getString(m99931e.intValue(), new Object[0]);
                }
                TV1 tv1 = this.f15800g.f15771b;
                Integer valueOf = Integer.valueOf(C33792Ji1.m99927i(component2));
                listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(str);
                String[] strArr = (String[]) listOfNotNull.toArray(new String[0]);
                tv1.m83527cm(valueOf, Arrays.copyOf(strArr, strArr.length));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends US1.C8284c, ? extends RequirementsResult, ? extends Bitmap> triple) {
                m101986a(triple);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "LUS1$c;", "Lco/bird/android/model/RequirementsResult;", "Landroid/graphics/Bitmap;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: IV1$m$c */
        /* loaded from: classes3.dex */
        public static final class C3680c extends Lambda implements Function1<Triple<? extends US1.C8284c, ? extends RequirementsResult, ? extends Bitmap>, InterfaceC23447K<? extends Uri>> {

            /* renamed from: g */
            public final /* synthetic */ IV1 f15801g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3680c(IV1 iv1) {
                super(1);
                this.f15801g = iv1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23447K<? extends Uri> invoke(Triple<US1.C8284c, RequirementsResult, Bitmap> triple) {
                Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
                Bitmap component3 = triple.component3();
                this.f15801g.f15779j.accept(Boolean.FALSE);
                return TV1.saveBitmapToFile$default(this.f15801g.f15771b, component3, this.f15801g.f15770a.mo25568a(), "cap", ".jpg", 0, 16, null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: IV1$m$d */
        /* loaded from: classes3.dex */
        public static final class C3681d extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ IV1 f15802g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3681d(IV1 iv1) {
                super(1);
                this.f15802g = iv1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f15802g.f15779j.accept(Boolean.TRUE);
                InterfaceC1880Ea interfaceC1880Ea = this.f15802g.f15778i;
                String localizedMessage = th.getLocalizedMessage();
                interfaceC1880Ea.mo55905y(new C44502lS3(null, null, null, "identification_scanner_auto_detected_take_photo", localizedMessage == null ? th.toString() : localizedMessage, 7, null));
            }
        }

        public C3677m() {
            super(1);
        }

        /* renamed from: e */
        public static final InterfaceC23447K m101989e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final void m101988f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC24574u<? extends Uri> invoke(Boolean autoDetecting) {
            Intrinsics.checkNotNullParameter(autoDetecting, "autoDetecting");
            if (autoDetecting.booleanValue()) {
                AbstractC23442F<Triple<US1.C8284c, RequirementsResult, Bitmap>> m33152N = IV1.this.f15771b.m83520jm(new C3678a(IV1.this)).m33152N(C23454a.m33087a());
                final C3679b c3679b = new C3679b(IV1.this);
                AbstractC23442F<Triple<US1.C8284c, RequirementsResult, Bitmap>> m33101w = m33152N.m33101w(new InterfaceC23484g() { // from class: LV1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        IV1.C3677m.invoke$lambda$0(Function1.this, obj);
                    }
                });
                final C3680c c3680c = new C3680c(IV1.this);
                AbstractC23442F<R> m33165A = m33101w.m33165A(new InterfaceC23492o() { // from class: MV1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23447K m101989e;
                        m101989e = IV1.C3677m.m101989e(Function1.this, obj);
                        return m101989e;
                    }
                });
                final C3681d c3681d = new C3681d(IV1.this);
                AbstractC23442F m33106t = m33165A.m33106t(new InterfaceC23484g() { // from class: NV1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        IV1.C3677m.m101988f(Function1.this, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33106t, "fun onResume() {\n    // …le relay: \")\n      })\n  }");
                return C37279Yf5.m74555g0(m33106t, 1).m33125j0();
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/net/Uri;", "kotlin.jvm.PlatformType", "fileUri", "", C17296a.f69688o, "(Landroid/net/Uri;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IV1$n */
    /* loaded from: classes3.dex */
    public static final class C3682n extends Lambda implements Function1<Uri, Unit> {
        public C3682n() {
            super(1);
        }

        /* renamed from: a */
        public final void m101984a(Uri uri) {
            IV1.this.f15780k.accept(Optional.f63040c.m59032c(TuplesKt.m28425to(uri, Boolean.TRUE)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Uri uri) {
            m101984a(uri);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IV1$o */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3683o extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C3683o f15804b = new C3683o();

        public C3683o() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a¢\u0001\u0012J\b\u0001\u0012F\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\u0012\u0004\u0012\u00020\u0006 \u0007*\"\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00010\u0001 \u0007*P\u0012J\b\u0001\u0012F\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\u0012\u0004\u0012\u00020\u0006 \u0007*\"\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lkotlin/Pair;", "Landroid/net/Uri;", "", "fileUri", "Lio/reactivex/K;", "Lco/bird/android/model/RequirementsResult;", "kotlin.jvm.PlatformType", "e", "(Lco/bird/android/buava/Optional;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IV1$p */
    /* loaded from: classes3.dex */
    public static final class C3684p extends Lambda implements Function1<Optional<Pair<? extends Uri, ? extends Boolean>>, InterfaceC23447K<? extends Pair<? extends Optional<Pair<? extends Uri, ? extends Boolean>>, ? extends RequirementsResult>>> {

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aF\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00020\u0003\u0012\u0004\u0012\u00020\u0005 \u0006*\"\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "it", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Landroid/net/Uri;", "Lco/bird/android/model/RequirementsResult;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: IV1$p$a */
        /* loaded from: classes3.dex */
        public static final class C3685a extends Lambda implements Function1<Boolean, Pair<? extends Optional<Pair<? extends Uri, ? extends Boolean>>, ? extends RequirementsResult>> {

            /* renamed from: g */
            public final /* synthetic */ Optional<Pair<Uri, Boolean>> f15806g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3685a(Optional<Pair<Uri, Boolean>> optional) {
                super(1);
                this.f15806g = optional;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Optional<Pair<Uri, Boolean>>, RequirementsResult> invoke(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f15806g, new RequirementsResult(null, null, it, null, 11, null));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LUS1$c;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lco/bird/android/model/RequirementsResult;", C17296a.f69688o, "(LUS1$c;)Lco/bird/android/model/RequirementsResult;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: IV1$p$b */
        /* loaded from: classes3.dex */
        public static final class C3686b extends Lambda implements Function1<US1.C8284c, RequirementsResult> {

            /* renamed from: g */
            public final /* synthetic */ IV1 f15807g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3686b(IV1 iv1) {
                super(1);
                this.f15807g = iv1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final RequirementsResult invoke(US1.C8284c result) {
                Intrinsics.checkNotNullParameter(result, "result");
                IdentificationDocumentDescriptor identificationDocumentDescriptor = this.f15807g.f15781l;
                if (identificationDocumentDescriptor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("descriptor");
                    identificationDocumentDescriptor = null;
                }
                return C33792Ji1.m99930f(result, identificationDocumentDescriptor, this.f15807g.f15777h.m82623f8().m73665a().getIdentificationConfig());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LUS1$c;", "Lco/bird/android/model/RequirementsResult;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: IV1$p$c */
        /* loaded from: classes3.dex */
        public static final class C3687c extends Lambda implements Function1<Pair<? extends US1.C8284c, ? extends RequirementsResult>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ IV1 f15808g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3687c(IV1 iv1) {
                super(1);
                this.f15808g = iv1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends US1.C8284c, ? extends RequirementsResult> pair) {
                invoke2((Pair<US1.C8284c, RequirementsResult>) pair);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Pair<US1.C8284c, RequirementsResult> pair) {
                this.f15808g.m102010q(Optional.f63040c.m59032c(pair.getFirst()));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\n\u001aF\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00000\u0004\u0012\u0004\u0012\u00020\u0002 \u0007*\"\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00000\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "LUS1$c;", "Lco/bird/android/model/RequirementsResult;", "it", "Lco/bird/android/buava/Optional;", "Landroid/net/Uri;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lkotlin/Pair;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: IV1$p$d */
        /* loaded from: classes3.dex */
        public static final class C3688d extends Lambda implements Function1<Pair<? extends US1.C8284c, ? extends RequirementsResult>, Pair<? extends Optional<Pair<? extends Uri, ? extends Boolean>>, ? extends RequirementsResult>> {

            /* renamed from: g */
            public final /* synthetic */ Optional<Pair<Uri, Boolean>> f15809g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3688d(Optional<Pair<Uri, Boolean>> optional) {
                super(1);
                this.f15809g = optional;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Pair<? extends Optional<Pair<? extends Uri, ? extends Boolean>>, ? extends RequirementsResult> invoke(Pair<? extends US1.C8284c, ? extends RequirementsResult> pair) {
                return invoke2((Pair<US1.C8284c, RequirementsResult>) pair);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Pair<Optional<Pair<Uri, Boolean>>, RequirementsResult> invoke2(Pair<US1.C8284c, RequirementsResult> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f15809g, it.getSecond());
            }
        }

        public C3684p() {
            super(1);
        }

        /* renamed from: f */
        public static final void m101978f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: g */
        public static final Pair m101977g(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            C41318g46.m40161c(exception, "Error returned from analyze manual image, ignoring: ", new Object[0]);
            return TuplesKt.m28425to(new US1.C8284c(null, null, null, null, null, 31, null), new RequirementsResult(null, Boolean.TRUE, null, null, 13, null));
        }

        /* renamed from: h */
        public static final Pair m101976h(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final InterfaceC23447K<? extends Pair<Optional<Pair<Uri, Boolean>>, RequirementsResult>> invoke(Optional<Pair<Uri, Boolean>> fileUri) {
            Intrinsics.checkNotNullParameter(fileUri, "fileUri");
            Pair<Uri, Boolean> m59035e = fileUri.m59035e();
            if (m59035e == null) {
                m59035e = TuplesKt.m28425to(null, Boolean.FALSE);
            }
            Uri component1 = m59035e.component1();
            boolean booleanValue = m59035e.component2().booleanValue();
            if (IV1.this.m102038F() && component1 != null) {
                AbstractC23442F<Boolean> m83521im = IV1.this.f15771b.m83521im(component1);
                final C3685a c3685a = new C3685a(fileUri);
                return m83521im.m33157I(new InterfaceC23492o() { // from class: OV1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair invoke$lambda$0;
                        invoke$lambda$0 = IV1.C3684p.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
            } else if (component1 == null) {
                return AbstractC23442F.m33158H(TuplesKt.m28425to(fileUri, new RequirementsResult(null, Boolean.FALSE, null, null, 13, null)));
            } else {
                if (!booleanValue) {
                    AbstractC23442F<Pair<US1.C8284c, RequirementsResult>> m33152N = IV1.this.f15771b.m83539Ql(component1, new C3686b(IV1.this)).m33140a0(3L, TimeUnit.SECONDS).m33152N(C23454a.m33087a());
                    final C3687c c3687c = new C3687c(IV1.this);
                    AbstractC23442F<Pair<US1.C8284c, RequirementsResult>> m33149Q = m33152N.m33101w(new InterfaceC23484g() { // from class: PV1
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            IV1.C3684p.m101978f(Function1.this, obj);
                        }
                    }).m33149Q(new InterfaceC23492o() { // from class: QV1
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            Pair m101977g;
                            m101977g = IV1.C3684p.m101977g((Throwable) obj);
                            return m101977g;
                        }
                    });
                    final C3688d c3688d = new C3688d(fileUri);
                    return m33149Q.m33157I(new InterfaceC23492o() { // from class: RV1
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            Pair m101976h;
                            m101976h = IV1.C3684p.m101976h(Function1.this, obj);
                            return m101976h;
                        }
                    });
                }
                return AbstractC23442F.m33158H(TuplesKt.m28425to(fileUri, new RequirementsResult(null, null, null, null, 15, null)));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012J\u0010\u0002\u001aF\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00030\u0004\u0012\u0004\u0012\u00020\u0007 \b*\"\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00030\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\t"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Landroid/net/Uri;", "", "Lco/bird/android/model/RequirementsResult;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IV1$q */
    /* loaded from: classes3.dex */
    public static final class C3689q extends Lambda implements Function1<Pair<? extends Optional<Pair<? extends Uri, ? extends Boolean>>, ? extends RequirementsResult>, Unit> {
        public C3689q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Optional<Pair<? extends Uri, ? extends Boolean>>, ? extends RequirementsResult> pair) {
            invoke2((Pair<Optional<Pair<Uri, Boolean>>, RequirementsResult>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Optional<Pair<Uri, Boolean>>, RequirementsResult> pair) {
            String m102008s;
            RequirementsResult component2 = pair.component2();
            Pair<Uri, Boolean> m59035e = pair.component1().m59035e();
            IdentificationDocumentDescriptor identificationDocumentDescriptor = null;
            Uri first = m59035e != null ? m59035e.getFirst() : null;
            IV1.this.f15771b.m83535Ul(first);
            TV1 tv1 = IV1.this.f15771b;
            if (first != null) {
                IV1 iv1 = IV1.this;
                IdentificationDocumentDescriptor identificationDocumentDescriptor2 = iv1.f15781l;
                if (identificationDocumentDescriptor2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("descriptor");
                } else {
                    identificationDocumentDescriptor = identificationDocumentDescriptor2;
                }
                m102008s = iv1.m102009r(identificationDocumentDescriptor, component2);
            } else {
                IV1 iv12 = IV1.this;
                IdentificationDocumentDescriptor identificationDocumentDescriptor3 = iv12.f15781l;
                if (identificationDocumentDescriptor3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("descriptor");
                } else {
                    identificationDocumentDescriptor = identificationDocumentDescriptor3;
                }
                m102008s = iv12.m102008s(identificationDocumentDescriptor);
            }
            tv1.m83529am(m102008s);
            IV1.this.f15771b.m83531Yl(component2.isSatisfied());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IV1$r */
    /* loaded from: classes3.dex */
    public static final class C3690r extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C3690r f15811g = new C3690r();

        public C3690r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while handling captured file relay: ", new Object[0]);
        }
    }

    public IV1(InterfaceC45102mT1 identificationManager, TV1 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, C22454gl appPreference, InterfaceC35660Rh6 userStream, InterfaceC6097Oh appBuildConfig, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager) {
        Intrinsics.checkNotNullParameter(identificationManager, "identificationManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f15770a = identificationManager;
        this.f15771b = ui;
        this.f15772c = scopeProvider;
        this.f15773d = navigator;
        this.f15774e = appPreference;
        this.f15775f = userStream;
        this.f15776g = appBuildConfig;
        this.f15777h = reactiveConfig;
        this.f15778i = analyticsManager;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        this.f15779j = C37791a94.C10586a.create$default(c10586a, Boolean.FALSE, null, 2, null);
        this.f15780k = C37791a94.C10586a.create$default(c10586a, Optional.f63040c.m59034a(), null, 2, null);
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        this.f15782m = now;
        this.f15783n = new AtomicBoolean(false);
    }

    /* renamed from: A */
    public static final void m102043A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m102042B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final InterfaceC23447K m102041C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m102040D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final InterfaceC24574u m102034J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m102033K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m102032L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final InterfaceC23447K m102031M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m102030N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m102029O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m102006u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m102005v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m102004w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m102003x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m102002y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m102001z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public final boolean m102039E() {
        User mo76584a = this.f15775f.mo76584a();
        return mo76584a != null && C33792Ji1.m99933c(mo76584a, this.f15774e, this.f15776g);
    }

    /* renamed from: F */
    public final boolean m102038F() {
        IdentificationDocumentDescriptor identificationDocumentDescriptor = this.f15781l;
        if (identificationDocumentDescriptor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("descriptor");
            identificationDocumentDescriptor = null;
        }
        return identificationDocumentDescriptor.getEntryMethodType() == IdentificationAcceptableMethod.EntryMethodType.SELFIE_PHOTO;
    }

    /* renamed from: G */
    public final void m102037G(IdentificationDocumentDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f15781l = descriptor;
        m102007t(descriptor);
    }

    /* renamed from: H */
    public final void m102036H() {
        String str;
        String str2;
        boolean z;
        if (!this.f15783n.get()) {
            InterfaceC1880Ea interfaceC1880Ea = this.f15778i;
            IdentificationDocumentDescriptor identificationDocumentDescriptor = this.f15781l;
            IdentificationDocumentDescriptor identificationDocumentDescriptor2 = null;
            if (identificationDocumentDescriptor == null) {
                Intrinsics.throwUninitializedPropertyAccessException("descriptor");
                identificationDocumentDescriptor = null;
            }
            String wire = identificationDocumentDescriptor.getDocumentType().toWire();
            IdentificationDocumentDescriptor identificationDocumentDescriptor3 = this.f15781l;
            if (identificationDocumentDescriptor3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("descriptor");
                identificationDocumentDescriptor3 = null;
            }
            String jurisdiction = identificationDocumentDescriptor3.getJurisdiction().getJurisdiction();
            IdentificationDocumentDescriptor identificationDocumentDescriptor4 = this.f15781l;
            if (identificationDocumentDescriptor4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("descriptor");
                identificationDocumentDescriptor4 = null;
            }
            IdentificationEntryMethod documentEntryMethod = identificationDocumentDescriptor4.getEntryMethodType().toDocumentEntryMethod();
            if (documentEntryMethod != null) {
                str = documentEntryMethod.toWire();
            } else {
                str = null;
            }
            IdentificationDocumentDescriptor identificationDocumentDescriptor5 = this.f15781l;
            if (identificationDocumentDescriptor5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("descriptor");
                identificationDocumentDescriptor5 = null;
            }
            IdentificationSelfieEntryMethod selfieEntryMethod = identificationDocumentDescriptor5.getEntryMethodType().toSelfieEntryMethod();
            if (selfieEntryMethod != null) {
                str2 = selfieEntryMethod.toWire();
            } else {
                str2 = null;
            }
            IdentificationDocumentScannerStrategy.Companion companion = IdentificationDocumentScannerStrategy.Companion;
            IdentificationDocumentDescriptor identificationDocumentDescriptor6 = this.f15781l;
            if (identificationDocumentDescriptor6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("descriptor");
            } else {
                identificationDocumentDescriptor2 = identificationDocumentDescriptor6;
            }
            IdentificationDocumentScannerStrategy strategy = companion.toStrategy(identificationDocumentDescriptor2, this.f15777h.m82623f8().m73665a().getIdentificationConfig());
            if (strategy != null && strategy.getEnableAutoDetect()) {
                z = true;
            } else {
                z = false;
            }
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            interfaceC1880Ea.mo55905y(new NP1(null, null, null, wire, jurisdiction, str, str2, z, C46880pT0.m19253i(now, this.f15782m), 7, null));
        }
    }

    /* renamed from: I */
    public final void m102035I() {
        String str;
        String str2;
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        this.f15782m = now;
        boolean z = false;
        this.f15783n.set(false);
        InterfaceC1880Ea interfaceC1880Ea = this.f15778i;
        IdentificationDocumentDescriptor identificationDocumentDescriptor = this.f15781l;
        IdentificationDocumentDescriptor identificationDocumentDescriptor2 = null;
        if (identificationDocumentDescriptor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("descriptor");
            identificationDocumentDescriptor = null;
        }
        String wire = identificationDocumentDescriptor.getDocumentType().toWire();
        IdentificationDocumentDescriptor identificationDocumentDescriptor3 = this.f15781l;
        if (identificationDocumentDescriptor3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("descriptor");
            identificationDocumentDescriptor3 = null;
        }
        String jurisdiction = identificationDocumentDescriptor3.getJurisdiction().getJurisdiction();
        IdentificationDocumentDescriptor identificationDocumentDescriptor4 = this.f15781l;
        if (identificationDocumentDescriptor4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("descriptor");
            identificationDocumentDescriptor4 = null;
        }
        IdentificationEntryMethod documentEntryMethod = identificationDocumentDescriptor4.getEntryMethodType().toDocumentEntryMethod();
        if (documentEntryMethod != null) {
            str = documentEntryMethod.toWire();
        } else {
            str = null;
        }
        IdentificationDocumentDescriptor identificationDocumentDescriptor5 = this.f15781l;
        if (identificationDocumentDescriptor5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("descriptor");
            identificationDocumentDescriptor5 = null;
        }
        IdentificationSelfieEntryMethod selfieEntryMethod = identificationDocumentDescriptor5.getEntryMethodType().toSelfieEntryMethod();
        if (selfieEntryMethod != null) {
            str2 = selfieEntryMethod.toWire();
        } else {
            str2 = null;
        }
        IdentificationDocumentScannerStrategy.Companion companion = IdentificationDocumentScannerStrategy.Companion;
        IdentificationDocumentDescriptor identificationDocumentDescriptor6 = this.f15781l;
        if (identificationDocumentDescriptor6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("descriptor");
        } else {
            identificationDocumentDescriptor2 = identificationDocumentDescriptor6;
        }
        IdentificationDocumentScannerStrategy strategy = companion.toStrategy(identificationDocumentDescriptor2, this.f15777h.m82623f8().m73665a().getIdentificationConfig());
        if (strategy != null && strategy.getEnableAutoDetect()) {
            z = true;
        }
        interfaceC1880Ea.mo55905y(new PP1(null, null, null, wire, jurisdiction, str, str2, z, 7, null));
        m102028P();
        Observable<Boolean> distinctUntilChanged = this.f15779j.distinctUntilChanged();
        final C3677m c3677m = new C3677m();
        Observable<R> flatMapMaybe = distinctUntilChanged.flatMapMaybe(new InterfaceC23492o() { // from class: sV1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m102034J;
                m102034J = IV1.m102034J(Function1.this, obj);
                return m102034J;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "fun onResume() {\n    // …le relay: \")\n      })\n  }");
        Object m33094as = flatMapMaybe.m33094as(AutoDispose.m45239a(this.f15772c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3682n c3682n = new C3682n();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: zV1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IV1.m102033K(Function1.this, obj);
            }
        };
        final C3683o c3683o = C3683o.f15804b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: AV1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IV1.m102032L(Function1.this, obj);
            }
        });
        C37791a94<Optional<Pair<Uri, Boolean>>> c37791a94 = this.f15780k;
        final C3684p c3684p = new C3684p();
        Observable observeOn = c37791a94.switchMapSingle(new InterfaceC23492o() { // from class: BV1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m102031M;
                m102031M = IV1.m102031M(Function1.this, obj);
                return m102031M;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "fun onResume() {\n    // …le relay: \")\n      })\n  }");
        Object m33094as2 = observeOn.m33094as(AutoDispose.m45239a(this.f15772c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3689q c3689q = new C3689q();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: CV1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IV1.m102030N(Function1.this, obj);
            }
        };
        final C3690r c3690r = C3690r.f15811g;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: DV1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IV1.m102029O(Function1.this, obj);
            }
        });
    }

    /* renamed from: P */
    public final void m102028P() {
        C37791a94<Boolean> c37791a94 = this.f15779j;
        IdentificationDocumentScannerStrategy.Companion companion = IdentificationDocumentScannerStrategy.Companion;
        IdentificationDocumentDescriptor identificationDocumentDescriptor = this.f15781l;
        if (identificationDocumentDescriptor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("descriptor");
            identificationDocumentDescriptor = null;
        }
        IdentificationDocumentScannerStrategy strategy = companion.toStrategy(identificationDocumentDescriptor, this.f15777h.m82623f8().m73665a().getIdentificationConfig());
        boolean z = false;
        if (strategy != null && strategy.getEnableAutoDetect()) {
            z = true;
        }
        c37791a94.accept(Boolean.valueOf(z));
    }

    /* renamed from: Q */
    public final void m102027Q(C46297oU1 c46297oU1, Uri uri, IdentificationDocumentDescriptor identificationDocumentDescriptor) {
        List plus;
        IdentificationSubmissionData copy$default;
        List plus2;
        List plus3;
        List plus4;
        int i = C3664b.$EnumSwitchMapping$0[identificationDocumentDescriptor.getEntryMethodType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        IdentificationSubmissionData m21013f = c46297oU1.m21013f();
                        List<String> selfieVideo = c46297oU1.m21013f().getSelfieVideo();
                        if (selfieVideo == null) {
                            selfieVideo = CollectionsKt__CollectionsKt.emptyList();
                        }
                        String uri2 = uri.toString();
                        Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
                        plus4 = CollectionsKt___CollectionsKt.plus((Collection<? extends String>) ((Collection<? extends Object>) selfieVideo), uri2);
                        copy$default = IdentificationSubmissionData.copy$default(m21013f, null, null, null, null, plus4, 15, null);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    IdentificationSubmissionData m21013f2 = c46297oU1.m21013f();
                    List<String> selfiePhoto = c46297oU1.m21013f().getSelfiePhoto();
                    if (selfiePhoto == null) {
                        selfiePhoto = CollectionsKt__CollectionsKt.emptyList();
                    }
                    String uri3 = uri.toString();
                    Intrinsics.checkNotNullExpressionValue(uri3, "uri.toString()");
                    plus3 = CollectionsKt___CollectionsKt.plus((Collection<? extends String>) ((Collection<? extends Object>) selfiePhoto), uri3);
                    copy$default = IdentificationSubmissionData.copy$default(m21013f2, null, null, null, plus3, null, 23, null);
                }
            } else {
                IdentificationSubmissionData m21013f3 = c46297oU1.m21013f();
                List<String> documentBack = c46297oU1.m21013f().getDocumentBack();
                if (documentBack == null) {
                    documentBack = CollectionsKt__CollectionsKt.emptyList();
                }
                String uri4 = uri.toString();
                Intrinsics.checkNotNullExpressionValue(uri4, "uri.toString()");
                plus2 = CollectionsKt___CollectionsKt.plus((Collection<? extends String>) ((Collection<? extends Object>) documentBack), uri4);
                copy$default = IdentificationSubmissionData.copy$default(m21013f3, null, null, plus2, null, null, 27, null);
            }
        } else {
            IdentificationSubmissionData m21013f4 = c46297oU1.m21013f();
            List<String> documentFront = c46297oU1.m21013f().getDocumentFront();
            if (documentFront == null) {
                documentFront = CollectionsKt__CollectionsKt.emptyList();
            }
            String uri5 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri5, "uri.toString()");
            plus = CollectionsKt___CollectionsKt.plus((Collection<? extends String>) ((Collection<? extends Object>) documentFront), uri5);
            copy$default = IdentificationSubmissionData.copy$default(m21013f4, null, plus, null, null, null, 29, null);
        }
        this.f15770a.mo25563f(C46297oU1.copy$default(c46297oU1, null, null, null, null, copy$default, 15, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
        r4 = kotlin.text.StringsKt___StringsKt.take(r1, 20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
        r3 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(kotlin.TuplesKt.m28425to(r3.m43852a(), java.lang.Integer.valueOf(p000.C32364Df4.birdGreen)));
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m102010q(Optional<US1.C8284c> optional) {
        List<Pair<Rect, Integer>> emptyList;
        String str;
        Object firstOrNull;
        Double d;
        Object firstOrNull2;
        boolean z;
        int collectionSizeOrDefault;
        Object firstOrNull3;
        List emptyList2;
        Collection emptyList3;
        List plus;
        List<Pair<Rect, Integer>> plus2;
        List<C46615p06.C27123e> m20166b;
        Pair pair;
        Rect m82117a;
        String take;
        US1.C8284c m59035e = optional.m59035e();
        Rect rect = null;
        if (m102039E() && m59035e != null) {
            C46615p06 m81509f = m59035e.m81509f();
            if (m81509f != null && (r1 = m81509f.m20167a()) != null && take != null) {
                str = StringsKt__StringsJVMKt.replace$default(take, '\n', ' ', false, 4, (Object) null);
            } else {
                str = null;
            }
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) m59035e.m81510e());
            U11 u11 = (U11) firstOrNull;
            if (u11 != null && (m82117a = u11.m82117a()) != null) {
                d = Double.valueOf(C33792Ji1.m99935a(m82117a));
            } else {
                d = null;
            }
            firstOrNull2 = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) m59035e.m81513b());
            if (firstOrNull2 != null) {
                z = true;
            } else {
                z = false;
            }
            String str2 = "landmarkWidthRatio: " + m59035e.m81511d() + ", face detected: " + z + ", aspect ratio: " + d + ", text: " + str;
            List<U11> m81510e = m59035e.m81510e();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(m81510e, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (U11 u112 : m81510e) {
                arrayList.add(TuplesKt.m28425to(u112.m82117a(), Integer.valueOf(C32364Df4.birdRed)));
            }
            firstOrNull3 = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) m59035e.m81513b());
            C39919dj1 c39919dj1 = (C39919dj1) firstOrNull3;
            if (c39919dj1 == null || emptyList2 == null) {
                emptyList2 = CollectionsKt__CollectionsKt.emptyList();
            }
            C46615p06 m81509f2 = m59035e.m81509f();
            if (m81509f2 != null && (m20166b = m81509f2.m20166b()) != null) {
                emptyList3 = new ArrayList();
                for (C46615p06.C27123e c27123e : m20166b) {
                    Rect m20164a = c27123e.m20164a();
                    if (m20164a != null) {
                        pair = TuplesKt.m28425to(m20164a, Integer.valueOf(C32364Df4.birdBlue));
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        emptyList3.add(pair);
                    }
                }
            } else {
                emptyList3 = CollectionsKt__CollectionsKt.emptyList();
            }
            plus = CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) emptyList2);
            plus2 = CollectionsKt___CollectionsKt.plus((Collection) plus, (Iterable) emptyList3);
            TV1 tv1 = this.f15771b;
            US1.C8284c m59035e2 = optional.m59035e();
            if (m59035e2 != null) {
                rect = m59035e2.m81512c();
            }
            tv1.m83532Xl(plus2, rect);
            this.f15771b.m83525em(str2);
            return;
        }
        TV1 tv12 = this.f15771b;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        tv12.m83532Xl(emptyList, null);
        this.f15771b.m83525em(null);
    }

    /* renamed from: r */
    public final String m102009r(IdentificationDocumentDescriptor identificationDocumentDescriptor, RequirementsResult requirementsResult) {
        int i;
        String m99934b;
        String string;
        if (Intrinsics.areEqual(requirementsResult.getFaceDetected(), Boolean.FALSE)) {
            i = C45871nl4.identification_face_not_detected_confirm_selfie_ok_anyways;
        } else if (!requirementsResult.isSatisfied()) {
            i = C45871nl4.id_not_detected_in_image;
        } else {
            i = C45871nl4.identification_confirm_image_ok;
        }
        TV1 tv1 = this.f15771b;
        Object[] objArr = new Object[1];
        int i2 = C3664b.$EnumSwitchMapping$0[identificationDocumentDescriptor.getEntryMethodType().ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3 && i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            m99934b = this.f15771b.getString(C45871nl4.identification_selfie, new Object[0]);
        } else {
            Integer m99931e = C33792Ji1.m99931e(identificationDocumentDescriptor.getDocumentType());
            if (m99931e != null && (string = this.f15771b.getString(m99931e.intValue(), new Object[0])) != null) {
                m99934b = string;
            } else {
                m99934b = C33792Ji1.m99934b(identificationDocumentDescriptor.getDocumentType());
            }
        }
        objArr[0] = m99934b;
        return tv1.getString(i, objArr);
    }

    /* renamed from: s */
    public final String m102008s(IdentificationDocumentDescriptor identificationDocumentDescriptor) {
        String m99934b;
        boolean z;
        int i;
        boolean z2;
        Integer m99931e = C33792Ji1.m99931e(identificationDocumentDescriptor.getDocumentType());
        if (m99931e == null || (m99934b = this.f15771b.getString(m99931e.intValue(), new Object[0])) == null) {
            m99934b = C33792Ji1.m99934b(identificationDocumentDescriptor.getDocumentType());
        }
        IdentificationDocumentScannerStrategy strategy = IdentificationDocumentScannerStrategy.Companion.toStrategy(identificationDocumentDescriptor, this.f15777h.m82623f8().m73665a().getIdentificationConfig());
        TV1 tv1 = this.f15771b;
        int i2 = C3664b.$EnumSwitchMapping$0[identificationDocumentDescriptor.getEntryMethodType().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C45871nl4.identification_instructions_take_selfie;
            } else {
                if (strategy != null && strategy.getEnableAutoDetect()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i = C45871nl4.identification_instructions_scan_back;
                } else {
                    i = C45871nl4.identification_instructions_take_photo_back;
                }
            }
        } else {
            if (strategy != null && strategy.getEnableAutoDetect()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = C45871nl4.identification_instructions_scan_front;
            } else {
                i = C45871nl4.identification_instructions_take_photo_front;
            }
        }
        return tv1.getString(i, m99934b);
    }

    /* renamed from: t */
    public final void m102007t(IdentificationDocumentDescriptor identificationDocumentDescriptor) {
        Integer num;
        IdentificationDocumentScannerStrategy.Companion companion = IdentificationDocumentScannerStrategy.Companion;
        IdentificationDocumentScannerStrategy strategy = companion.toStrategy(identificationDocumentDescriptor, this.f15777h.m82623f8().m73665a().getIdentificationConfig());
        if (strategy == null) {
            strategy = companion.getUNRESTRICTED_MANUAL_CAPTURE();
        }
        this.f15771b.m83522hm(m102038F());
        this.f15771b.m83529am(m102008s(identificationDocumentDescriptor));
        TV1 tv1 = this.f15771b;
        if (strategy.getEnableAutoDetect()) {
            num = Integer.valueOf(C45871nl4.identification_scanning_not_found_rect);
        } else {
            num = null;
        }
        tv1.m83527cm(num, new Object[0]);
        this.f15771b.m83526dm(!strategy.getEnableAutoDetect());
        long autoScanTimeoutSeconds = this.f15777h.m82623f8().m73665a().getIdentificationConfig().getAutoScanTimeoutSeconds();
        if (strategy.getEnableAutoDetect() && autoScanTimeoutSeconds > -1) {
            Observable<Long> observeOn = Observable.timer(autoScanTimeoutSeconds, TimeUnit.SECONDS).observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn, "timer(timeout, TimeUnit.…dSchedulers.mainThread())");
            Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f15772c));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C3666d c3666d = new C3666d();
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: EV1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    IV1.m102043A(Function1.this, obj);
                }
            };
            final C3667e c3667e = C3667e.f15786b;
            ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: FV1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    IV1.m102042B(Function1.this, obj);
                }
            });
        }
        this.f15771b.m83530Zl(strategy.getDetectionParameters().getAspectRatio(), m102038F());
        Observable<Unit> m83541G2 = this.f15771b.m83541G2();
        final C3668f c3668f = new C3668f();
        Observable observeOn2 = m83541G2.flatMapSingle(new InterfaceC23492o() { // from class: GV1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m102041C;
                m102041C = IV1.m102041C(Function1.this, obj);
                return m102041C;
            }
        }).observeOn(C23454a.m33087a());
        final C3671g c3671g = new C3671g();
        Observable retry = observeOn2.doOnError(new InterfaceC23484g() { // from class: HV1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IV1.m102040D(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "private fun initializeUI…     }, (Timber::e))\n\n  }");
        Object m33094as2 = retry.m33094as(AutoDispose.m45239a(this.f15772c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3672h c3672h = new C3672h();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: tV1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IV1.m102006u(Function1.this, obj);
            }
        };
        final C3673i c3673i = C3673i.f15792b;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: uV1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IV1.m102005v(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn3 = this.f15771b.m83534Vl().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.retakePhotoClicks()\n …dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f15772c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3674j c3674j = new C3674j(identificationDocumentDescriptor);
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: vV1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IV1.m102004w(Function1.this, obj);
            }
        };
        final C3675k c3675k = C3675k.f15795b;
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: wV1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IV1.m102003x(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn4 = this.f15771b.m83537Sl().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "ui.confirmPhotoClicks()\n…dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(this.f15772c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3676l c3676l = new C3676l(identificationDocumentDescriptor);
        InterfaceC23484g interfaceC23484g4 = new InterfaceC23484g() { // from class: xV1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IV1.m102002y(Function1.this, obj);
            }
        };
        final C3665c c3665c = C3665c.f15784b;
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g4, new InterfaceC23484g() { // from class: yV1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IV1.m102001z(Function1.this, obj);
            }
        });
    }
}
