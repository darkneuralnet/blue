package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.identification.IdentificationAcceptableManualEntry;
import co.bird.android.model.identification.IdentificationAcceptableMethod;
import co.bird.android.model.identification.IdentificationDebugResponse;
import co.bird.android.model.identification.IdentificationDocumentType;
import co.bird.android.model.identification.IdentificationEntry;
import co.bird.android.model.identification.IdentificationEntryMethod;
import co.bird.android.model.identification.IdentificationIngestionResult;
import co.bird.android.model.identification.IdentificationIntentPermissionStatus;
import co.bird.android.model.identification.IdentificationManualEntryFormData;
import co.bird.android.model.identification.IdentificationRejectionReason;
import co.bird.android.model.identification.IdentificationRequestIdentifier;
import co.bird.android.model.identification.IdentificationStatus;
import co.bird.android.model.identification.IdentificationSubmissionData;
import com.facebook.share.internal.C17296a;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.SetsKt__SetsKt;
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
import p000.C43341jV1;
@Metadata(m28433d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 N2\u00020\u0001:\u0001\u0015BI\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200¢\u0006\u0004\bL\u0010MJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\rH\u0002J\u0018\u0010\u0013\u001a\u00020\u000e*\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\"\u00109\u001a\u0010\u0012\f\u0012\n 6*\u0004\u0018\u00010505048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020:048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00108R \u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0=048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00108R \u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0=048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00108R\u0016\u0010G\u001a\u0004\u0018\u00010D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0016\u0010K\u001a\u0004\u0018\u00010H8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006O"}, m28432d2 = {"LjV1;", "", "", "U0", "V0", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "T0", "X", "o0", "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;", "", "W0", "Lco/bird/android/model/identification/IdentificationRejectionReason;", "Lco/bird/android/model/identification/IdentificationIngestionResult;", "ingestionResult", "U", "LmT1;", C17296a.f69688o, "LmT1;", "identificationManager", "LgW1;", "b", "LgW1;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "LfT1;", "e", "LfT1;", "converter", "Lgl;", "f", "Lgl;", "appPreference", "LTq4;", "g", "LTq4;", "reactiveConfig", "LEa;", "h", "LEa;", "analyticsManager", "La94;", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "i", "La94;", "currentLocale", "Lco/bird/android/model/identification/IdentificationDocumentType;", "j", "currentDocumentType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/identification/IdentificationDebugResponse;", "k", "currentDebugResponse", "Lco/bird/android/model/identification/IdentificationAcceptableMethod;", "l", "currentAcceptableMethod", "LZV1;", "W", "()LZV1;", "identificationStatusState", "Lco/bird/android/model/identification/IdentificationRequestIdentifier;", "V", "()Lco/bird/android/model/identification/IdentificationRequestIdentifier;", "currentSessionIdentifier", "<init>", "(LmT1;LgW1;Lcom/uber/autodispose/ScopeProvider;Le13;LfT1;Lgl;LTq4;LEa;)V", "m", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdentificationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationPresenter.kt\nco/bird/android/feature/identification/IdentificationPresenter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,511:1\n1#2:512\n237#3:513\n180#3:516\n180#3:519\n180#3:520\n180#3:521\n237#3:522\n180#3:523\n180#3:524\n180#3:525\n180#3:526\n180#3:527\n180#3:528\n180#3:529\n180#3:530\n180#3:531\n180#3:532\n180#3:533\n71#4,2:514\n52#4,2:517\n*S KotlinDebug\n*F\n+ 1 IdentificationPresenter.kt\nco/bird/android/feature/identification/IdentificationPresenter\n*L\n128#1:513\n164#1:516\n173#1:519\n186#1:520\n200#1:521\n249#1:522\n258#1:523\n283#1:524\n300#1:525\n348#1:526\n373#1:527\n392#1:528\n403#1:529\n417#1:530\n430#1:531\n443#1:532\n456#1:533\n133#1:514,2\n168#1:517,2\n*E\n"})
/* renamed from: jV1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43341jV1 {

    /* renamed from: m */
    public static final C24882a f92777m = new C24882a(null);

    /* renamed from: n */
    public static final Set<IdentificationEntryMethod> f92778n;

    /* renamed from: o */
    public static final IdentificationDebugResponse f92779o;

    /* renamed from: a */
    public final InterfaceC45102mT1 f92780a;

    /* renamed from: b */
    public final C41571gW1 f92781b;

    /* renamed from: c */
    public final ScopeProvider f92782c;

    /* renamed from: d */
    public final InterfaceC40099e13 f92783d;

    /* renamed from: e */
    public final C40951fT1 f92784e;

    /* renamed from: f */
    public final C22454gl f92785f;

    /* renamed from: g */
    public final C36207Tq4 f92786g;

    /* renamed from: h */
    public final InterfaceC1880Ea f92787h;

    /* renamed from: i */
    public final C37791a94<Locale> f92788i;

    /* renamed from: j */
    public final C37791a94<IdentificationDocumentType> f92789j;

    /* renamed from: k */
    public final C37791a94<Optional<IdentificationDebugResponse>> f92790k;

    /* renamed from: l */
    public final C37791a94<Optional<IdentificationAcceptableMethod>> f92791l;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$A */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C24849A extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C24849A f92792b = new C24849A();

        public C24849A() {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jV1$B */
    /* loaded from: classes3.dex */
    public static final class C24850B extends Lambda implements Function1<Integer, InterfaceC24574u<? extends Integer>> {
        public C24850B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Integer> invoke(Integer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C43341jV1.this.f92781b.m39217fm(C45871nl4.identification_test_user_age_years, it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$C */
    /* loaded from: classes3.dex */
    public static final class C24851C extends Lambda implements Function1<Integer, Unit> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/identification/IdentificationDebugResponse;", "response", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: jV1$C$a */
        /* loaded from: classes3.dex */
        public static final class C24852a extends Lambda implements Function1<Optional<IdentificationDebugResponse>, Optional<IdentificationDebugResponse>> {

            /* renamed from: g */
            public final /* synthetic */ Integer f92795g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24852a(Integer num) {
                super(1);
                this.f92795g = num;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<IdentificationDebugResponse> invoke(Optional<IdentificationDebugResponse> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                IdentificationDebugResponse m59035e = response.m59035e();
                if (m59035e == null) {
                    m59035e = C43341jV1.f92779o;
                }
                IdentificationDebugResponse identificationDebugResponse = m59035e;
                Integer it = this.f92795g;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                return Optional.f63040c.m59033b(IdentificationDebugResponse.copy$default(identificationDebugResponse, it.intValue(), 0, 0.0d, null, 0, 30, null));
            }
        }

        public C24851C() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer num) {
            C43341jV1.this.f92790k.m71837i(new C24852a(num));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$D */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C24853D extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C24853D f92796b = new C24853D();

        public C24853D() {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jV1$E */
    /* loaded from: classes3.dex */
    public static final class C24854E extends Lambda implements Function1<Integer, InterfaceC24574u<? extends Integer>> {
        public C24854E() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Integer> invoke(Integer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C43341jV1.this.f92781b.m39217fm(C45871nl4.identification_test_expiration_days, it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nIdentificationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationPresenter.kt\nco/bird/android/feature/identification/IdentificationPresenter$initializeUiClickCallbacks$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,511:1\n1#2:512\n*E\n"})
    /* renamed from: jV1$F */
    /* loaded from: classes3.dex */
    public static final class C24855F extends Lambda implements Function1<Unit, Unit> {
        public C24855F() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            IdentificationAcceptableMethod identificationAcceptableMethod = (IdentificationAcceptableMethod) ((Optional) C43341jV1.this.f92791l.getValue()).m59035e();
            if (identificationAcceptableMethod == null) {
                return;
            }
            C22454gl c22454gl = C43341jV1.this.f92785f;
            Object value = C43341jV1.this.f92788i.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "currentLocale.value");
            c22454gl.m37643b2((Locale) value);
            C43341jV1.this.f92785f.m37648a2((IdentificationDocumentType) C43341jV1.this.f92789j.getValue());
            IdentificationDebugResponse identificationDebugResponse = (IdentificationDebugResponse) ((Optional) C43341jV1.this.f92790k.getValue()).m59035e();
            if (identificationDebugResponse != null) {
                C43341jV1.this.f92785f.m37653Z1(identificationDebugResponse);
            }
            InterfaceC45102mT1 interfaceC45102mT1 = C43341jV1.this.f92780a;
            Object value2 = C43341jV1.this.f92788i.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "currentLocale.value");
            interfaceC45102mT1.mo25563f(new C46297oU1((Locale) value2, (IdentificationDocumentType) C43341jV1.this.f92789j.getValue(), identificationAcceptableMethod, (IdentificationDebugResponse) ((Optional) C43341jV1.this.f92790k.getValue()).m59035e(), new IdentificationSubmissionData(null, null, null, null, null, 31, null)));
            C43341jV1.this.f92783d.mo37044c1(10041);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$G */
    /* loaded from: classes3.dex */
    public static final class C24856G extends Lambda implements Function1<Integer, Unit> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/identification/IdentificationDebugResponse;", "response", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: jV1$G$a */
        /* loaded from: classes3.dex */
        public static final class C24857a extends Lambda implements Function1<Optional<IdentificationDebugResponse>, Optional<IdentificationDebugResponse>> {

            /* renamed from: g */
            public final /* synthetic */ Integer f92800g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24857a(Integer num) {
                super(1);
                this.f92800g = num;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<IdentificationDebugResponse> invoke(Optional<IdentificationDebugResponse> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                Optional.C14443a c14443a = Optional.f63040c;
                IdentificationDebugResponse m59035e = response.m59035e();
                if (m59035e == null) {
                    m59035e = C43341jV1.f92779o;
                }
                IdentificationDebugResponse identificationDebugResponse = m59035e;
                Integer it = this.f92800g;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                return c14443a.m59033b(IdentificationDebugResponse.copy$default(identificationDebugResponse, 0, it.intValue(), 0.0d, null, 0, 29, null));
            }
        }

        public C24856G() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer num) {
            C43341jV1.this.f92790k.m71837i(new C24857a(num));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$H */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C24858H extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C24858H f92801b = new C24858H();

        public C24858H() {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Double;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jV1$I */
    /* loaded from: classes3.dex */
    public static final class C24859I extends Lambda implements Function1<Double, InterfaceC24574u<? extends Double>> {
        public C24859I() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Double> invoke(Double it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C43341jV1.this.f92781b.m39217fm(C45871nl4.identification_test_score, it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Double;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jV1$J */
    /* loaded from: classes3.dex */
    public static final class C24860J extends Lambda implements Function1<Double, Unit> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/identification/IdentificationDebugResponse;", "response", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: jV1$J$a */
        /* loaded from: classes3.dex */
        public static final class C24861a extends Lambda implements Function1<Optional<IdentificationDebugResponse>, Optional<IdentificationDebugResponse>> {

            /* renamed from: g */
            public final /* synthetic */ Double f92804g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24861a(Double d) {
                super(1);
                this.f92804g = d;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<IdentificationDebugResponse> invoke(Optional<IdentificationDebugResponse> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                Optional.C14443a c14443a = Optional.f63040c;
                IdentificationDebugResponse m59035e = response.m59035e();
                if (m59035e == null) {
                    m59035e = C43341jV1.f92779o;
                }
                IdentificationDebugResponse identificationDebugResponse = m59035e;
                Double it = this.f92804g;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                return c14443a.m59033b(IdentificationDebugResponse.copy$default(identificationDebugResponse, 0, 0, it.doubleValue(), null, 0, 27, null));
            }
        }

        public C24860J() {
            super(1);
        }

        /* renamed from: a */
        public final void m30461a(Double d) {
            C43341jV1.this.f92790k.m71837i(new C24861a(d));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Double d) {
            m30461a(d);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$K */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C24862K extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C24862K f92805b = new C24862K();

        public C24862K() {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationIngestionResult;", "it", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/identification/IdentificationIngestionResult;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jV1$L */
    /* loaded from: classes3.dex */
    public static final class C24863L extends Lambda implements Function1<IdentificationIngestionResult, InterfaceC24574u<? extends IdentificationIngestionResult>> {
        public C24863L() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends IdentificationIngestionResult> invoke(IdentificationIngestionResult it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C43341jV1.this.f92781b.m39217fm(C45871nl4.identification_test_ingestion_result, it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationIngestionResult;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/identification/IdentificationIngestionResult;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jV1$M */
    /* loaded from: classes3.dex */
    public static final class C24864M extends Lambda implements Function1<IdentificationIngestionResult, Unit> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/identification/IdentificationDebugResponse;", "response", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: jV1$M$a */
        /* loaded from: classes3.dex */
        public static final class C24865a extends Lambda implements Function1<Optional<IdentificationDebugResponse>, Optional<IdentificationDebugResponse>> {

            /* renamed from: g */
            public final /* synthetic */ IdentificationIngestionResult f92808g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24865a(IdentificationIngestionResult identificationIngestionResult) {
                super(1);
                this.f92808g = identificationIngestionResult;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<IdentificationDebugResponse> invoke(Optional<IdentificationDebugResponse> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                Optional.C14443a c14443a = Optional.f63040c;
                IdentificationDebugResponse m59035e = response.m59035e();
                if (m59035e == null) {
                    m59035e = C43341jV1.f92779o;
                }
                IdentificationIngestionResult it = this.f92808g;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                return c14443a.m59033b(IdentificationDebugResponse.copy$default(m59035e, 0, 0, 0.0d, it, 0, 23, null));
            }
        }

        public C24864M() {
            super(1);
        }

        /* renamed from: a */
        public final void m30458a(IdentificationIngestionResult identificationIngestionResult) {
            C43341jV1.this.f92790k.m71837i(new C24865a(identificationIngestionResult));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdentificationIngestionResult identificationIngestionResult) {
            m30458a(identificationIngestionResult);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$N */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C24866N extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C24866N f92809b = new C24866N();

        public C24866N() {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jV1$O */
    /* loaded from: classes3.dex */
    public static final class C24867O extends Lambda implements Function1<Integer, InterfaceC24574u<? extends Integer>> {
        public C24867O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Integer> invoke(Integer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C43341jV1.this.f92781b.m39217fm(C45871nl4.identification_test_seconds_to_result, it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$P */
    /* loaded from: classes3.dex */
    public static final class C24868P extends Lambda implements Function1<Integer, Unit> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/identification/IdentificationDebugResponse;", "response", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: jV1$P$a */
        /* loaded from: classes3.dex */
        public static final class C24869a extends Lambda implements Function1<Optional<IdentificationDebugResponse>, Optional<IdentificationDebugResponse>> {

            /* renamed from: g */
            public final /* synthetic */ Integer f92812g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24869a(Integer num) {
                super(1);
                this.f92812g = num;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<IdentificationDebugResponse> invoke(Optional<IdentificationDebugResponse> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                Optional.C14443a c14443a = Optional.f63040c;
                IdentificationDebugResponse m59035e = response.m59035e();
                if (m59035e == null) {
                    m59035e = C43341jV1.f92779o;
                }
                IdentificationDebugResponse identificationDebugResponse = m59035e;
                Integer it = this.f92812g;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                return c14443a.m59033b(IdentificationDebugResponse.copy$default(identificationDebugResponse, 0, 0, 0.0d, null, it.intValue(), 15, null));
            }
        }

        public C24868P() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer num) {
            C43341jV1.this.f92790k.m71837i(new C24869a(num));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$Q */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C24870Q extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C24870Q f92813b = new C24870Q();

        public C24870Q() {
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

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$R */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C24871R extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C24871R f92814b = new C24871R();

        public C24871R() {
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
    /* renamed from: jV1$S */
    /* loaded from: classes3.dex */
    public static final class C24872S extends Lambda implements Function1<Unit, Unit> {
        public C24872S() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C43341jV1.this.f92781b.m39207pm(false);
            C43341jV1.this.f92781b.m39209nm(true);
            C43341jV1.this.f92781b.m39208om(false);
            C43341jV1.this.f92781b.m39210mm(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$T */
    /* loaded from: classes3.dex */
    public static final class C24873T extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C24873T f92816g = new C24873T();

        public C24873T() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while handling try again button click", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$U */
    /* loaded from: classes3.dex */
    public static final class C24874U extends Lambda implements Function1<Unit, Unit> {
        public C24874U() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            IdentificationIntentPermissionStatus m73012b;
            ZV1 m30523W = C43341jV1.this.m30523W();
            C43341jV1.this.f92787h.mo55905y(new UP1(null, null, null, C43341jV1.this.f92786g.m82623f8().m73665a().getIdentificationConfig().getIdentificationHelpArticle(), ((m30523W == null || (m73012b = m30523W.m73012b()) == null) ? null : m73012b.getStatus()) == IdentificationStatus.PENDING ? "pending" : BaseSheetViewModel.SAVE_SELECTION, 7, null));
            C43341jV1.this.f92783d.mo37180E(MapMode.RIDER, C43341jV1.this.f92786g.m82623f8().m73665a().getIdentificationConfig().getIdentificationHelpArticle(), true);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$V */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C24875V extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C24875V f92818b = new C24875V();

        public C24875V() {
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

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "Lkotlin/Pair;", "Lco/bird/android/model/identification/IdentificationManualEntryFormData;", "LgU1;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jV1$W */
    /* loaded from: classes3.dex */
    public static final class C24876W extends Lambda implements Function1<Unit, InterfaceC24574u<? extends Pair<? extends IdentificationManualEntryFormData, ? extends C41553gU1>>> {
        public C24876W() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Pair<IdentificationManualEntryFormData, C41553gU1>> invoke(Unit it) {
            IdentificationIntentPermissionStatus m73012b;
            IdentificationAcceptableManualEntry acceptableManualEntry;
            Intrinsics.checkNotNullParameter(it, "it");
            ZV1 m30523W = C43341jV1.this.m30523W();
            C41318g46.m40163a("manual entry button clicked: " + m30523W, new Object[0]);
            ZV1 m30523W2 = C43341jV1.this.m30523W();
            if (m30523W2 != null && (m73012b = m30523W2.m73012b()) != null && (acceptableManualEntry = m73012b.getAcceptableManualEntry()) != null) {
                return C43341jV1.this.f92781b.m39213jm(acceptableManualEntry);
            }
            C43341jV1.this.f92781b.m39214im(false);
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/identification/IdentificationManualEntryFormData;", "LgU1;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jV1$X */
    /* loaded from: classes3.dex */
    public static final class C24877X extends Lambda implements Function1<Pair<? extends IdentificationManualEntryFormData, ? extends C41553gU1>, InterfaceC23447K<? extends IdentificationIntentPermissionStatus>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;", "kotlin.jvm.PlatformType", "status", "", C17296a.f69688o, "(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: jV1$X$a */
        /* loaded from: classes3.dex */
        public static final class C24878a extends Lambda implements Function1<IdentificationIntentPermissionStatus, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C41553gU1 f92821g;

            /* renamed from: h */
            public final /* synthetic */ C43341jV1 f92822h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24878a(C41553gU1 c41553gU1, C43341jV1 c43341jV1) {
                super(1);
                this.f92821g = c41553gU1;
                this.f92822h = c43341jV1;
            }

            /* renamed from: a */
            public final void m30449a(IdentificationIntentPermissionStatus identificationIntentPermissionStatus) {
                this.f92821g.dismiss();
                this.f92822h.f92783d.mo37050b1(-1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IdentificationIntentPermissionStatus identificationIntentPermissionStatus) {
                m30449a(identificationIntentPermissionStatus);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: jV1$X$b */
        /* loaded from: classes3.dex */
        public static final class C24879b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C43341jV1 f92823g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24879b(C43341jV1 c43341jV1) {
                super(1);
                this.f92823g = c43341jV1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40161c(th, "Error while clicking manual entry button ", new Object[0]);
                this.f92823g.f92781b.errorGeneric();
            }
        }

        public C24877X() {
            super(1);
        }

        /* renamed from: d */
        public static final void m30450d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends IdentificationIntentPermissionStatus> invoke(Pair<IdentificationManualEntryFormData, C41553gU1> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            InterfaceC45102mT1 interfaceC45102mT1 = C43341jV1.this.f92780a;
            IdentificationRequestIdentifier mo25559j = C43341jV1.this.f92780a.mo25559j();
            Intrinsics.checkNotNull(mo25559j);
            AbstractC23442F<IdentificationIntentPermissionStatus> m33152N = interfaceC45102mT1.mo25564e(mo25559j, pair.component1()).m33152N(C23454a.m33087a());
            final C24878a c24878a = new C24878a(pair.component2(), C43341jV1.this);
            AbstractC23442F<IdentificationIntentPermissionStatus> m33101w = m33152N.m33101w(new InterfaceC23484g() { // from class: nV1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C43341jV1.C24877X.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C24879b c24879b = new C24879b(C43341jV1.this);
            return m33101w.m33106t(new InterfaceC23484g() { // from class: oV1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C43341jV1.C24877X.m30450d(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000 \u0004*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003 \u0004*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000 \u0004*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Ljava/util/Locale;", "locale", "Lio/reactivex/u;", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "b", "(Ljava/util/Locale;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jV1$Y */
    /* loaded from: classes3.dex */
    public static final class C24880Y extends Lambda implements Function1<Locale, InterfaceC24574u<? extends Pair<? extends Locale, ? extends Locale>>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000 \u0003*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ljava/util/Locale;", "it", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/Locale;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: jV1$Y$a */
        /* loaded from: classes3.dex */
        public static final class C24881a extends Lambda implements Function1<Locale, Pair<? extends Locale, ? extends Locale>> {

            /* renamed from: g */
            public final /* synthetic */ Locale f92825g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24881a(Locale locale) {
                super(1);
                this.f92825g = locale;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Locale, Locale> invoke(Locale it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(it, this.f92825g);
            }
        }

        public C24880Y() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Pair<Locale, Locale>> invoke(Locale locale) {
            List<Locale> list;
            Intrinsics.checkNotNullParameter(locale, "locale");
            C41571gW1 c41571gW1 = C43341jV1.this.f92781b;
            Locale[] availableLocales = Locale.getAvailableLocales();
            Intrinsics.checkNotNullExpressionValue(availableLocales, "getAvailableLocales()");
            list = ArraysKt___ArraysKt.toList(availableLocales);
            AbstractC24507p<Locale> m39219dm = c41571gW1.m39219dm(list, locale);
            final C24881a c24881a = new C24881a(locale);
            return m39219dm.m32067H(new InterfaceC23492o() { // from class: pV1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C43341jV1.C24880Y.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"LjV1$a;", "", "", "Lco/bird/android/model/identification/IdentificationEntryMethod;", "ALLOWED_ENTRY_METHODS", "Ljava/util/Set;", C17296a.f69688o, "()Ljava/util/Set;", "Lco/bird/android/model/identification/IdentificationDebugResponse;", "DEFAULT_DEBUG_RESPONSE", "Lco/bird/android/model/identification/IdentificationDebugResponse;", "", "REQUEST_CODE", "I", "<init>", "()V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: jV1$a */
    /* loaded from: classes3.dex */
    public static final class C24882a {
        public /* synthetic */ C24882a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Set<IdentificationEntryMethod> m30445a() {
            return C43341jV1.f92778n;
        }

        private C24882a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C24883b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdentificationStatus.values().length];
            try {
                iArr[IdentificationStatus.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdentificationStatus.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\u0007\u001a\u00028\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"T1", "T2", "T3", "T4", "t1", "t2", "t3", "t4", "Lwb4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$3\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: jV1$c */
    /* loaded from: classes3.dex */
    public static final class C24884c<T1, T2, T3, T4, R> implements InterfaceC23486i {

        /* renamed from: a */
        public static final C24884c<T1, T2, T3, T4, R> f92826a = new C24884c<>();

        @Override // io.reactivex.functions.InterfaceC23486i
        /* renamed from: a */
        public final C51106wb4<T1, T2, T3, T4> apply(T1 t1, T2 t2, T3 t3, T4 t4) {
            return new C51106wb4<>(t1, t2, t3, t4);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: jV1$d */
    /* loaded from: classes3.dex */
    public static final class C24885d<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C24885d<T1, T2, R> f92827a = new C24885d<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/identification/IdentificationAcceptableMethod;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jV1$e */
    /* loaded from: classes3.dex */
    public static final class C24886e extends Lambda implements Function1<Optional<IdentificationAcceptableMethod>, Unit> {
        public C24886e() {
            super(1);
        }

        /* renamed from: a */
        public final void m30442a(Optional<IdentificationAcceptableMethod> optional) {
            C43341jV1.this.f92781b.m39221bm(optional.m59037c());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<IdentificationAcceptableMethod> optional) {
            m30442a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C24887f extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C24887f f92829b = new C24887f();

        public C24887f() {
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

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "LZV1;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jV1$g */
    /* loaded from: classes3.dex */
    public static final class C24888g extends Lambda implements Function1<Optional<ZV1>, Boolean> {

        /* renamed from: g */
        public static final C24888g f92830g = new C24888g();

        public C24888g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<ZV1> it) {
            IdentificationIntentPermissionStatus m73012b;
            IdentificationStatus status;
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            ZV1 m59035e = it.m59035e();
            boolean z2 = false;
            if (m59035e != null && (m73012b = m59035e.m73012b()) != null && (status = m73012b.getStatus()) != null) {
                if (status != IdentificationStatus.PENDING && status != IdentificationStatus.REJECTED) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "show", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$h */
    /* loaded from: classes3.dex */
    public static final class C24889h extends Lambda implements Function1<Boolean, Unit> {
        public C24889h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean show) {
            C41571gW1 c41571gW1 = C43341jV1.this.f92781b;
            Intrinsics.checkNotNullExpressionValue(show, "show");
            c41571gW1.m39209nm(show.booleanValue());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$i */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C24890i extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C24890i f92832b = new C24890i();

        public C24890i() {
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

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "LZV1;", "it", "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jV1$j */
    /* loaded from: classes3.dex */
    public static final class C24891j extends Lambda implements Function1<Optional<ZV1>, IdentificationIntentPermissionStatus> {

        /* renamed from: g */
        public static final C24891j f92833g = new C24891j();

        public C24891j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final IdentificationIntentPermissionStatus invoke(Optional<ZV1> it) {
            IdentificationIntentPermissionStatus m73012b;
            Intrinsics.checkNotNullParameter(it, "it");
            ZV1 m59035e = it.m59035e();
            if (m59035e == null || (m73012b = m59035e.m73012b()) == null) {
                return new IdentificationIntentPermissionStatus(IdentificationStatus.UNKNOWN, null, null, null, null, null, 62, null);
            }
            return m73012b;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;", "t1", "t2", "", C17296a.f69688o, "(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jV1$k */
    /* loaded from: classes3.dex */
    public static final class C24892k extends Lambda implements Function2<IdentificationIntentPermissionStatus, IdentificationIntentPermissionStatus, Boolean> {

        /* renamed from: g */
        public static final C24892k f92834g = new C24892k();

        public C24892k() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(IdentificationIntentPermissionStatus t1, IdentificationIntentPermissionStatus t2) {
            boolean z;
            Intrinsics.checkNotNullParameter(t1, "t1");
            Intrinsics.checkNotNullParameter(t2, "t2");
            if (t1.getStatus() == t2.getStatus()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;", "kotlin.jvm.PlatformType", "status", "", C17296a.f69688o, "(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jV1$l */
    /* loaded from: classes3.dex */
    public static final class C24893l extends Lambda implements Function1<IdentificationIntentPermissionStatus, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: jV1$l$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C24894a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[IdentificationStatus.values().length];
                try {
                    iArr[IdentificationStatus.PENDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IdentificationStatus.REJECTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C24893l() {
            super(1);
        }

        /* renamed from: a */
        public final void m30438a(IdentificationIntentPermissionStatus status) {
            int i = C24894a.$EnumSwitchMapping$0[status.getStatus().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    C43341jV1.this.f92781b.m39210mm(false);
                    C43341jV1.this.f92781b.m39208om(false);
                    C43341jV1.this.f92781b.m39207pm(false);
                } else {
                    C43341jV1.this.f92781b.m39208om(true);
                    C43341jV1.this.f92781b.m39207pm(true);
                }
            } else {
                C43341jV1.this.f92781b.m39210mm(true);
            }
            C41571gW1 c41571gW1 = C43341jV1.this.f92781b;
            C43341jV1 c43341jV1 = C43341jV1.this;
            Intrinsics.checkNotNullExpressionValue(status, "status");
            c41571gW1.m39220cm(c43341jV1.m30522W0(status));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdentificationIntentPermissionStatus identificationIntentPermissionStatus) {
            m30438a(identificationIntentPermissionStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jV1$m */
    /* loaded from: classes3.dex */
    public static final class C24895m extends Lambda implements Function1<IdentificationIntentPermissionStatus, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nIdentificationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationPresenter.kt\nco/bird/android/feature/identification/IdentificationPresenter$initializeStreams$18$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,511:1\n1#2:512\n*E\n"})
        /* renamed from: jV1$m$a */
        /* loaded from: classes3.dex */
        public static final class C24896a extends Lambda implements Function1<Long, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ C43341jV1 f92837g;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZV1;", "kotlin.jvm.PlatformType", "status", "", C17296a.f69688o, "(LZV1;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: jV1$m$a$a */
            /* loaded from: classes3.dex */
            public static final class C24897a extends Lambda implements Function1<ZV1, Unit> {

                /* renamed from: g */
                public static final C24897a f92838g = new C24897a();

                public C24897a() {
                    super(1);
                }

                /* renamed from: a */
                public final void m30431a(ZV1 zv1) {
                    C41318g46.m40163a("received update " + zv1, new Object[0]);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ZV1 zv1) {
                    m30431a(zv1);
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: jV1$m$a$b */
            /* loaded from: classes3.dex */
            public static final class C24898b extends Lambda implements Function1<Throwable, Unit> {

                /* renamed from: g */
                public static final C24898b f92839g = new C24898b();

                public C24898b() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    C41318g46.m40158f(th, "Error while attempting to refresh request status", new Object[0]);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24896a(C43341jV1 c43341jV1) {
                super(1);
                this.f92837g = c43341jV1;
            }

            /* renamed from: c */
            public static final void m30432c(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23496h invoke(Long it) {
                AbstractC23442F<ZV1> mo25560i;
                AbstractC23461c m33159G;
                AbstractC23461c m33069Q;
                Intrinsics.checkNotNullParameter(it, "it");
                IdentificationRequestIdentifier m30525V = this.f92837g.m30525V();
                if (m30525V != null && (mo25560i = this.f92837g.f92780a.mo25560i(m30525V)) != null) {
                    final C24897a c24897a = C24897a.f92838g;
                    AbstractC23442F<ZV1> m33101w = mo25560i.m33101w(new InterfaceC23484g() { // from class: lV1
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            C43341jV1.C24895m.C24896a.invoke$lambda$0(Function1.this, obj);
                        }
                    });
                    if (m33101w != null && (m33159G = m33101w.m33159G()) != null) {
                        final C24898b c24898b = C24898b.f92839g;
                        AbstractC23461c m33084B = m33159G.m33084B(new InterfaceC23484g() { // from class: mV1
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj) {
                                C43341jV1.C24895m.C24896a.m30432c(Function1.this, obj);
                            }
                        });
                        if (m33084B != null && (m33069Q = m33084B.m33069Q()) != null) {
                            return m33069Q;
                        }
                    }
                }
                return AbstractC23461c.m33039p();
            }
        }

        public C24895m() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC23496h m30435c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(IdentificationIntentPermissionStatus it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getStatus() == IdentificationStatus.PENDING) {
                Observable<Long> interval = Observable.interval(C43341jV1.this.f92786g.m82623f8().m73665a().getIdentificationConfig().getPendingSubmissionPollingIntervalSeconds(), TimeUnit.SECONDS);
                final C24896a c24896a = new C24896a(C43341jV1.this);
                return interval.flatMapCompletable(new InterfaceC23492o() { // from class: kV1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23496h m30435c;
                        m30435c = C43341jV1.C24895m.m30435c(Function1.this, obj);
                        return m30435c;
                    }
                });
            } else if (it.getStatus().canTreatAsSuccessful()) {
                C43341jV1.this.f92783d.mo37050b1(-1);
                return AbstractC23461c.m33039p();
            } else {
                return AbstractC23461c.m33039p();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$n */
    /* loaded from: classes3.dex */
    public static final class C24899n extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C24899n f92840g = new C24899n();

        public C24899n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while attempting to refresh request status", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "LZV1;", "it", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)LZV1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jV1$o */
    /* loaded from: classes3.dex */
    public static final class C24900o extends Lambda implements Function1<Optional<ZV1>, ZV1> {

        /* renamed from: g */
        public static final C24900o f92841g = new C24900o();

        public C24900o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ZV1 invoke(Optional<ZV1> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59035e();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZV1;", "kotlin.jvm.PlatformType", "identificationStatusState", "", C17296a.f69688o, "(LZV1;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIdentificationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationPresenter.kt\nco/bird/android/feature/identification/IdentificationPresenter$initializeStreams$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,511:1\n1#2:512\n*E\n"})
    /* renamed from: jV1$p */
    /* loaded from: classes3.dex */
    public static final class C24901p extends Lambda implements Function1<ZV1, Unit> {
        public C24901p() {
            super(1);
        }

        /* renamed from: a */
        public final void m30429a(ZV1 zv1) {
            IdentificationIntentPermissionStatus m73012b = zv1.m73012b();
            Object value = C43341jV1.this.f92788i.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "currentLocale.value");
            Locale defaultLocale = m73012b.defaultLocale((Locale) value);
            if (defaultLocale != null) {
                C43341jV1.this.f92788i.accept(defaultLocale);
            }
            IdentificationIntentPermissionStatus m73012b2 = zv1.m73012b();
            String country = ((Locale) C43341jV1.this.f92788i.getValue()).getCountry();
            Intrinsics.checkNotNullExpressionValue(country, "currentLocale.value.country");
            IdentificationDocumentType defaultDocumentType = m73012b2.defaultDocumentType(country);
            if (defaultDocumentType != null) {
                C43341jV1.this.f92789j.accept(defaultDocumentType);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ZV1 zv1) {
            m30429a(zv1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\n \u0002*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\n \u0002*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t\u0018\u00010\b0\b2J\u0010\u0007\u001aF\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0002*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00050\u0000H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"Lwb4;", "LZV1;", "kotlin.jvm.PlatformType", "Ljava/util/Locale;", "Lco/bird/android/model/identification/IdentificationDocumentType;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/identification/IdentificationDebugResponse;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "LH6;", C17296a.f69688o, "(Lwb4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jV1$q */
    /* loaded from: classes3.dex */
    public static final class C24902q extends Lambda implements Function1<C51106wb4<? extends ZV1, ? extends Locale, ? extends IdentificationDocumentType, ? extends Optional<IdentificationDebugResponse>>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C24902q() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
            if (r0 != null) goto L7;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(C51106wb4<ZV1, Locale, ? extends IdentificationDocumentType, Optional<IdentificationDebugResponse>> c51106wb4) {
            Set<IdentificationDocumentType> emptySet;
            IdentificationIntentPermissionStatus m73012b;
            Intrinsics.checkNotNullParameter(c51106wb4, "<name for destructuring parameter 0>");
            ZV1 identificationStatusState = c51106wb4.m6614a();
            Locale currentLocale = c51106wb4.m6613b();
            IdentificationDocumentType currentDocumentType = c51106wb4.m6612c();
            Optional<IdentificationDebugResponse> m6611d = c51106wb4.m6611d();
            if (identificationStatusState != null && (m73012b = identificationStatusState.m73012b()) != null) {
                String country = currentLocale.getCountry();
                Intrinsics.checkNotNullExpressionValue(country, "currentLocale.country");
                emptySet = m73012b.allowedDocumentTypes(country, C43341jV1.f92777m.m30445a());
            }
            emptySet = SetsKt__SetsKt.emptySet();
            Set<IdentificationDocumentType> set = emptySet;
            C40951fT1 c40951fT1 = C43341jV1.this.f92784e;
            Intrinsics.checkNotNullExpressionValue(identificationStatusState, "identificationStatusState");
            Intrinsics.checkNotNullExpressionValue(currentLocale, "currentLocale");
            Intrinsics.checkNotNullExpressionValue(currentDocumentType, "currentDocumentType");
            return c40951fT1.m41302b(identificationStatusState, currentLocale, currentDocumentType, m6611d.m59035e(), set);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$r */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C24903r extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C24903r(Object obj) {
            super(1, obj, C41571gW1.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C41571gW1) this.receiver).m39223b(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$s */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C24904s extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C24904s f92844b = new C24904s();

        public C24904s() {
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

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/identification/IdentificationDocumentType;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$t */
    /* loaded from: classes3.dex */
    public static final class C24905t extends Lambda implements Function1<Pair<? extends Locale, ? extends IdentificationDocumentType>, Unit> {
        public C24905t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Locale, ? extends IdentificationDocumentType> pair) {
            invoke2((Pair<Locale, ? extends IdentificationDocumentType>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Locale, ? extends IdentificationDocumentType> pair) {
            IdentificationAcceptableMethod identificationAcceptableMethod;
            IdentificationIntentPermissionStatus m73012b;
            Locale component1 = pair.component1();
            IdentificationDocumentType documentType = pair.component2();
            C37791a94 c37791a94 = C43341jV1.this.f92791l;
            Optional.C14443a c14443a = Optional.f63040c;
            ZV1 m30523W = C43341jV1.this.m30523W();
            if (m30523W == null || (m73012b = m30523W.m73012b()) == null) {
                identificationAcceptableMethod = null;
            } else {
                String country = component1.getCountry();
                Intrinsics.checkNotNullExpressionValue(country, "locale.country");
                Intrinsics.checkNotNullExpressionValue(documentType, "documentType");
                identificationAcceptableMethod = m73012b.acceptableMethod(country, documentType, C43341jV1.f92777m.m30445a());
            }
            c37791a94.accept(c14443a.m59033b(identificationAcceptableMethod));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$u */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C24906u extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C24906u f92846b = new C24906u();

        public C24906u() {
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

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$v */
    /* loaded from: classes3.dex */
    public static final class C24907v extends Lambda implements Function1<Pair<? extends Locale, ? extends Locale>, Unit> {
        public C24907v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Locale, ? extends Locale> pair) {
            invoke2((Pair<Locale, Locale>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Locale, Locale> pair) {
            IdentificationIntentPermissionStatus m73012b;
            Set<String> allowedCountryCodes;
            Locale component1 = pair.component1();
            if (Intrinsics.areEqual(component1.getCountry(), pair.component2().getCountry())) {
                return;
            }
            ZV1 m30523W = C43341jV1.this.m30523W();
            boolean z = (m30523W == null || (m73012b = m30523W.m73012b()) == null || (allowedCountryCodes = m73012b.allowedCountryCodes(C43341jV1.f92777m.m30445a())) == null || !allowedCountryCodes.contains(component1.getCountry())) ? false : true;
            InterfaceC1880Ea interfaceC1880Ea = C43341jV1.this.f92787h;
            String country = component1.getCountry();
            Intrinsics.checkNotNullExpressionValue(country, "newLocale.country");
            interfaceC1880Ea.mo55905y(new VP1(null, null, null, country, z, 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$w */
    /* loaded from: classes3.dex */
    public static final class C24908w extends Lambda implements Function1<Pair<? extends Locale, ? extends Locale>, Unit> {
        public C24908w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Locale, ? extends Locale> pair) {
            invoke2((Pair<Locale, Locale>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Locale, Locale> pair) {
            C43341jV1.this.f92788i.accept(pair.component1());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jV1$x */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C24909x extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C24909x f92849b = new C24909x();

        public C24909x() {
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

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationDocumentType;", "kotlin.jvm.PlatformType", "newDocType", "", C17296a.f69688o, "(Lco/bird/android/model/identification/IdentificationDocumentType;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jV1$y */
    /* loaded from: classes3.dex */
    public static final class C24910y extends Lambda implements Function1<IdentificationDocumentType, Unit> {
        public C24910y() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m30427a(IdentificationDocumentType identificationDocumentType) {
            boolean z;
            String wire;
            IdentificationIntentPermissionStatus m73012b;
            ZV1 m30523W = C43341jV1.this.m30523W();
            if (m30523W != null && (m73012b = m30523W.m73012b()) != null) {
                String country = ((Locale) C43341jV1.this.f92788i.getValue()).getCountry();
                Intrinsics.checkNotNullExpressionValue(country, "currentLocale.value.country");
                Set<IdentificationDocumentType> allowedDocumentTypes = m73012b.allowedDocumentTypes(country, C43341jV1.f92777m.m30445a());
                if (allowedDocumentTypes != null && allowedDocumentTypes.contains(identificationDocumentType)) {
                    z = true;
                    InterfaceC1880Ea interfaceC1880Ea = C43341jV1.this.f92787h;
                    wire = identificationDocumentType.toWire();
                    if (wire == null) {
                        wire = "unknown";
                    }
                    interfaceC1880Ea.mo55905y(new WP1(null, null, null, wire, z, 7, null));
                }
            }
            z = false;
            InterfaceC1880Ea interfaceC1880Ea2 = C43341jV1.this.f92787h;
            wire = identificationDocumentType.toWire();
            if (wire == null) {
            }
            interfaceC1880Ea2.mo55905y(new WP1(null, null, null, wire, z, 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdentificationDocumentType identificationDocumentType) {
            m30427a(identificationDocumentType);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationDocumentType;", "kotlin.jvm.PlatformType", "newDocType", "", C17296a.f69688o, "(Lco/bird/android/model/identification/IdentificationDocumentType;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jV1$z */
    /* loaded from: classes3.dex */
    public static final class C24911z extends Lambda implements Function1<IdentificationDocumentType, Unit> {
        public C24911z() {
            super(1);
        }

        /* renamed from: a */
        public final void m30426a(IdentificationDocumentType newDocType) {
            C37791a94 c37791a94 = C43341jV1.this.f92789j;
            Intrinsics.checkNotNullExpressionValue(newDocType, "newDocType");
            c37791a94.accept(newDocType);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdentificationDocumentType identificationDocumentType) {
            m30426a(identificationDocumentType);
            return Unit.INSTANCE;
        }
    }

    static {
        Set<IdentificationEntryMethod> of;
        of = SetsKt__SetsKt.setOf((Object[]) new IdentificationEntryMethod[]{IdentificationEntryMethod.SCAN_FRONT, IdentificationEntryMethod.SCAN_BACK, IdentificationEntryMethod.SCAN_FRONT_AND_BACK});
        f92778n = of;
        f92779o = new IdentificationDebugResponse(25, 365, 1.0d, IdentificationIngestionResult.SUCCESS, 2);
    }

    public C43341jV1(InterfaceC45102mT1 identificationManager, C41571gW1 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, C40951fT1 converter, C22454gl appPreference, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager) {
        Intrinsics.checkNotNullParameter(identificationManager, "identificationManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f92780a = identificationManager;
        this.f92781b = ui;
        this.f92782c = scopeProvider;
        this.f92783d = navigator;
        this.f92784e = converter;
        this.f92785f = appPreference;
        this.f92786g = reactiveConfig;
        this.f92787h = analyticsManager;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        this.f92788i = C37791a94.C10586a.create$default(c10586a, Locale.getDefault(), null, 2, null);
        this.f92789j = C37791a94.C10586a.create$default(c10586a, IdentificationDocumentType.DRIVER_LICENSE, null, 2, null);
        Optional.C14443a c14443a = Optional.f63040c;
        this.f92790k = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f92791l = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
    }

    /* renamed from: A0 */
    public static final void m30566A0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B0 */
    public static final void m30564B0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C0 */
    public static final void m30562C0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D0 */
    public static final void m30560D0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E0 */
    public static final InterfaceC24574u m30558E0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: F0 */
    public static final void m30556F0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G0 */
    public static final void m30554G0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H0 */
    public static final InterfaceC24574u m30552H0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: I0 */
    public static final void m30550I0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J0 */
    public static final void m30548J0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K0 */
    public static final InterfaceC24574u m30546K0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: L0 */
    public static final void m30544L0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M0 */
    public static final void m30542M0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N0 */
    public static final InterfaceC24574u m30540N0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: O0 */
    public static final void m30538O0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P0 */
    public static final void m30536P0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q0 */
    public static final InterfaceC24574u m30534Q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: R0 */
    public static final void m30532R0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S0 */
    public static final void m30530S0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m30520Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final Boolean m30519Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m30517a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final void m30515b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final IdentificationIntentPermissionStatus m30513c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (IdentificationIntentPermissionStatus) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final boolean m30511d0(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: e0 */
    public static final void m30509e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final InterfaceC23496h m30507f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m30505g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m30503h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final InterfaceC23447K m30501i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final void m30499j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final void m30497k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final void m30495l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final void m30493m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final void m30491n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final void m30487p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q0 */
    public static final void m30485q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final void m30483r0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final void m30481s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final void m30479t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u0 */
    public static final void m30477u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v0 */
    public static final InterfaceC24574u m30475v0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final InterfaceC23447K m30473w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: x0 */
    public static final InterfaceC24574u m30471x0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: y0 */
    public static final void m30469y0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z0 */
    public static final void m30467z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T0 */
    public final void m30528T0(int i, int i2, Intent intent) {
        if (i == 10041 && i2 == -1) {
            this.f92783d.mo37050b1(-1);
        }
    }

    /* renamed from: U */
    public final String m30527U(IdentificationRejectionReason identificationRejectionReason, IdentificationIngestionResult identificationIngestionResult) {
        String str;
        int i;
        boolean z;
        Integer explanationResId;
        if (identificationIngestionResult != null && (explanationResId = identificationIngestionResult.explanationResId()) != null) {
            str = this.f92781b.getString(explanationResId.intValue(), new Object[0]);
        } else {
            str = null;
        }
        if (identificationRejectionReason != null) {
            if (str != null) {
                z = true;
            } else {
                z = false;
            }
            i = identificationRejectionReason.explanationResId(z);
        } else {
            i = C45871nl4.identification_reject_explanation_unknown;
        }
        if (identificationRejectionReason == IdentificationRejectionReason.INGESTION_FAILURE && str != null) {
            return this.f92781b.getString(i, str);
        }
        return this.f92781b.getString(i, new Object[0]);
    }

    /* renamed from: U0 */
    public final void m30526U0() {
        this.f92788i.accept(this.f92785f.m37671V());
        IdentificationDocumentType m37675U = this.f92785f.m37675U();
        if (m37675U != null) {
            this.f92789j.accept(m37675U);
        }
        IdentificationDebugResponse m37679T = this.f92785f.m37679T();
        if (m37679T == null) {
            m37679T = f92779o;
        }
        this.f92790k.accept(Optional.f63040c.m59032c(m37679T));
        m30521X();
    }

    /* renamed from: V */
    public final IdentificationRequestIdentifier m30525V() {
        return this.f92780a.mo25559j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r8 == null) goto L28;
     */
    /* renamed from: V0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m30524V0() {
        IdentificationIntentPermissionStatus identificationIntentPermissionStatus;
        String str;
        String str2;
        IdentificationEntry idCard;
        IdentificationIngestionResult ingestionResult;
        IdentificationRejectionReason rejectionReason;
        String name;
        IdentificationStatus status;
        String name2;
        ZV1 m30523W = m30523W();
        String str3 = null;
        if (m30523W != null) {
            identificationIntentPermissionStatus = m30523W.m73012b();
        } else {
            identificationIntentPermissionStatus = null;
        }
        InterfaceC1880Ea interfaceC1880Ea = this.f92787h;
        if (identificationIntentPermissionStatus != null && (status = identificationIntentPermissionStatus.getStatus()) != null && (name2 = status.name()) != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            str = name2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(locale)");
        }
        str = "unknown";
        if (identificationIntentPermissionStatus != null && (rejectionReason = identificationIntentPermissionStatus.getRejectionReason()) != null && (name = rejectionReason.name()) != null) {
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
            str2 = name.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String).toLowerCase(locale)");
        } else {
            str2 = null;
        }
        if (identificationIntentPermissionStatus != null && (idCard = identificationIntentPermissionStatus.getIdCard()) != null && (ingestionResult = idCard.getIngestionResult()) != null) {
            str3 = ingestionResult.toWire();
        }
        String country = this.f92788i.getValue().getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "currentLocale.value.country");
        String name3 = this.f92789j.getValue().name();
        Locale locale3 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale3, "getDefault()");
        String lowerCase = name3.toLowerCase(locale3);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        interfaceC1880Ea.mo55905y(new XP1(null, null, null, str, str2, str3, country, lowerCase, 7, null));
        m30489o0();
    }

    /* renamed from: W */
    public final ZV1 m30523W() {
        return this.f92780a.mo25562g().m73665a().m59035e();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* renamed from: W0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m30522W0(IdentificationIntentPermissionStatus identificationIntentPermissionStatus) {
        String str;
        DateTime dateTime;
        IdentificationEntry idCard;
        boolean z;
        IdentificationEntry idCard2;
        String expiresAt;
        int i = C24883b.$EnumSwitchMapping$0[identificationIntentPermissionStatus.getStatus().ordinal()];
        if (i != 1) {
            IdentificationIngestionResult identificationIngestionResult = null;
            if (i != 2) {
                if (!(this.f92780a.mo25566c().m73665a() instanceof ZS1)) {
                    return null;
                }
                this.f92780a.mo25567b();
                return this.f92781b.getString(C45871nl4.identification_status_failed_to_submit, new Object[0]);
            }
            try {
                idCard2 = identificationIntentPermissionStatus.getIdCard();
            } catch (Exception e) {
                IdentificationEntry idCard3 = identificationIntentPermissionStatus.getIdCard();
                if (idCard3 != null) {
                    str = idCard3.getExpiresAt();
                } else {
                    str = null;
                }
                C41318g46.m40161c(e, "Could not parse date from string " + str, new Object[0]);
            }
            if (idCard2 != null && (expiresAt = idCard2.getExpiresAt()) != null) {
                dateTime = DateTime.parse(expiresAt);
                if (identificationIntentPermissionStatus.getRejectionReason() == IdentificationRejectionReason.EXPIRED) {
                    if (dateTime != null && dateTime.isAfterNow()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return this.f92781b.getString(C45871nl4.please_scan_id_again, new Object[0]) + " " + this.f92781b.getString(C45871nl4.rescan_explanation, new Object[0]);
                    }
                }
                C41571gW1 c41571gW1 = this.f92781b;
                int i2 = C45871nl4.identification_status_rejected_with_reason;
                Object[] objArr = new Object[1];
                IdentificationRejectionReason rejectionReason = identificationIntentPermissionStatus.getRejectionReason();
                idCard = identificationIntentPermissionStatus.getIdCard();
                if (idCard != null) {
                    identificationIngestionResult = idCard.getIngestionResult();
                }
                objArr[0] = m30527U(rejectionReason, identificationIngestionResult);
                return c41571gW1.getString(i2, objArr);
            }
            dateTime = null;
            if (identificationIntentPermissionStatus.getRejectionReason() == IdentificationRejectionReason.EXPIRED) {
            }
            C41571gW1 c41571gW12 = this.f92781b;
            int i22 = C45871nl4.identification_status_rejected_with_reason;
            Object[] objArr2 = new Object[1];
            IdentificationRejectionReason rejectionReason2 = identificationIntentPermissionStatus.getRejectionReason();
            idCard = identificationIntentPermissionStatus.getIdCard();
            if (idCard != null) {
            }
            objArr2[0] = m30527U(rejectionReason2, identificationIngestionResult);
            return c41571gW12.getString(i22, objArr2);
        }
        return this.f92781b.getString(C45871nl4.identification_status_pending, new Object[0]);
    }

    /* renamed from: X */
    public final void m30521X() {
        IdentificationRequestIdentifier m30525V;
        AbstractC23442F<ZV1> mo25560i;
        AbstractC23461c m33159G;
        AbstractC23461c m33069Q;
        if (m30523W() == null && (m30525V = m30525V()) != null && (mo25560i = this.f92780a.mo25560i(m30525V)) != null && (m33159G = mo25560i.m33159G()) != null) {
            final C24899n c24899n = C24899n.f92840g;
            AbstractC23461c m33084B = m33159G.m33084B(new InterfaceC23484g() { // from class: pU1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C43341jV1.m30505g0(Function1.this, obj);
                }
            });
            if (m33084B != null && (m33069Q = m33084B.m33069Q()) != null) {
                Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(this.f92782c));
                Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                CompletableSubscribeProxy completableSubscribeProxy = (CompletableSubscribeProxy) m33041n;
                if (completableSubscribeProxy != null) {
                    completableSubscribeProxy.subscribe();
                }
            }
        }
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable m74575T = C37279Yf5.m74575T(this.f92780a.mo25562g(), C24900o.f92841g);
        final C24901p c24901p = new C24901p();
        Observable doOnNext = m74575T.doOnNext(new InterfaceC23484g() { // from class: gV1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30503h0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "private fun initializeSt…)\n      .subscribe()\n\n  }");
        Observable combineLatest = Observable.combineLatest(doOnNext, this.f92788i, this.f92789j, this.f92790k, C24884c.f92826a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…> Quad(t1, t2, t3, t4) })");
        final C24902q c24902q = new C24902q();
        Observable observeOn = combineLatest.switchMapSingle(new InterfaceC23492o() { // from class: hV1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m30501i0;
                m30501i0 = C43341jV1.m30501i0(Function1.this, obj);
                return m30501i0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "private fun initializeSt…)\n      .subscribe()\n\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f92782c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24903r c24903r = new C24903r(this.f92781b);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: iV1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30499j0(Function1.this, obj);
            }
        };
        final C24904s c24904s = C24904s.f92844b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: qU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30497k0(Function1.this, obj);
            }
        });
        Observable combineLatest2 = Observable.combineLatest(this.f92788i, this.f92789j, C24885d.f92827a);
        Intrinsics.checkNotNullExpressionValue(combineLatest2, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        Observable retry = combineLatest2.retry();
        Intrinsics.checkNotNullExpressionValue(retry, "Observables.combineLates…ype,\n    )\n      .retry()");
        Object m33094as2 = retry.m33094as(AutoDispose.m45239a(this.f92782c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24905t c24905t = new C24905t();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: rU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30495l0(Function1.this, obj);
            }
        };
        final C24906u c24906u = C24906u.f92846b;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: sU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30493m0(Function1.this, obj);
            }
        });
        Observable<Optional<IdentificationAcceptableMethod>> observeOn2 = this.f92791l.retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "currentAcceptableMethod\n…dSchedulers.mainThread())");
        Object m33094as3 = observeOn2.m33094as(AutoDispose.m45239a(this.f92782c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24886e c24886e = new C24886e();
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: tU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30491n0(Function1.this, obj);
            }
        };
        final C24887f c24887f = C24887f.f92829b;
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: uU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30520Y(Function1.this, obj);
            }
        });
        Observable<Optional<ZV1>> distinctUntilChanged = this.f92780a.mo25562g().distinctUntilChanged();
        final C24888g c24888g = C24888g.f92830g;
        Observable observeOn3 = distinctUntilChanged.map(new InterfaceC23492o() { // from class: vU1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m30519Z;
                m30519Z = C43341jV1.m30519Z(Function1.this, obj);
                return m30519Z;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "identificationManager.id…dSchedulers.mainThread())");
        Object m33094as4 = observeOn3.m33094as(AutoDispose.m45239a(this.f92782c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24889h c24889h = new C24889h();
        InterfaceC23484g interfaceC23484g4 = new InterfaceC23484g() { // from class: AU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30517a0(Function1.this, obj);
            }
        };
        final C24890i c24890i = C24890i.f92832b;
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g4, new InterfaceC23484g() { // from class: LU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30515b0(Function1.this, obj);
            }
        });
        Z84<Optional<ZV1>> mo25562g = this.f92780a.mo25562g();
        final C24891j c24891j = C24891j.f92833g;
        Observable<R> map = mo25562g.map(new InterfaceC23492o() { // from class: WU1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                IdentificationIntentPermissionStatus m30513c0;
                m30513c0 = C43341jV1.m30513c0(Function1.this, obj);
                return m30513c0;
            }
        });
        final C24892k c24892k = C24892k.f92834g;
        Observable observeOn4 = map.distinctUntilChanged(new InterfaceC23481d() { // from class: dV1
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m30511d0;
                m30511d0 = C43341jV1.m30511d0(Function2.this, obj, obj2);
                return m30511d0;
            }
        }).observeOn(C23454a.m33087a());
        final C24893l c24893l = new C24893l();
        Observable observeOn5 = observeOn4.doOnNext(new InterfaceC23484g() { // from class: eV1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30509e0(Function1.this, obj);
            }
        }).observeOn(C24542a.m31932c());
        final C24895m c24895m = new C24895m();
        AbstractC23461c m33066T = observeOn5.switchMapCompletable(new InterfaceC23492o() { // from class: fV1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m30507f0;
                m30507f0 = C43341jV1.m30507f0(Function1.this, obj);
                return m30507f0;
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "private fun initializeSt…)\n      .subscribe()\n\n  }");
        Object m33041n2 = m33066T.m33041n(AutoDispose.m45239a(this.f92782c));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n2).subscribe();
    }

    /* renamed from: o0 */
    public final void m30489o0() {
        boolean isBlank;
        IdentificationIntentPermissionStatus m73012b;
        Observable<Unit> observeOn = this.f92781b.m39222b0().retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.primaryButtonClicks()…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f92782c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24855F c24855f = new C24855F();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: wU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30487p0(Function1.this, obj);
            }
        };
        final C24870Q c24870q = C24870Q.f92813b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: IU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30485q0(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn2 = this.f92781b.m39206qm().retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.tryAgainButtonClicks(…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f92782c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24872S c24872s = new C24872S();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: UU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30483r0(Function1.this, obj);
            }
        };
        final C24873T c24873t = C24873T.f92816g;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: VU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30481s0(Function1.this, obj);
            }
        });
        C41571gW1 c41571gW1 = this.f92781b;
        isBlank = StringsKt__StringsJVMKt.isBlank(this.f92786g.m82623f8().m73665a().getIdentificationConfig().getIdentificationHelpArticle());
        boolean z = true;
        c41571gW1.m39218em(!isBlank);
        C41571gW1 c41571gW12 = this.f92781b;
        ZV1 m30523W = m30523W();
        if (m30523W == null || (m73012b = m30523W.m73012b()) == null || !m73012b.getManualEntryAllowed()) {
            z = false;
        }
        c41571gW12.m39214im(z);
        Observable<Unit> observeOn3 = this.f92781b.m39205r0().retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.helpButtonClicks()\n  …dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f92782c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24874U c24874u = new C24874U();
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: XU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30479t0(Function1.this, obj);
            }
        };
        final C24875V c24875v = C24875V.f92818b;
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: YU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30477u0(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn4 = this.f92781b.m39224am().retry().observeOn(C23454a.m33087a());
        final C24876W c24876w = new C24876W();
        Observable observeOn5 = observeOn4.flatMapMaybe(new InterfaceC23492o() { // from class: ZU1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m30475v0;
                m30475v0 = C43341jV1.m30475v0(Function1.this, obj);
                return m30475v0;
            }
        }).observeOn(C24542a.m31932c());
        final C24877X c24877x = new C24877X();
        Observable retry = observeOn5.flatMapSingle(new InterfaceC23492o() { // from class: aV1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m30473w0;
                m30473w0 = C43341jV1.m30473w0(Function1.this, obj);
                return m30473w0;
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "private fun initializeUi…      }, (Timber::e))\n  }");
        Object m33094as4 = retry.m33094as(AutoDispose.m45239a(this.f92782c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as4).subscribe();
        Observable<Locale> retry2 = this.f92781b.m39231Tl().retry();
        final C24880Y c24880y = new C24880Y();
        Observable<R> flatMapMaybe = retry2.flatMapMaybe(new InterfaceC23492o() { // from class: bV1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m30471x0;
                m30471x0 = C43341jV1.m30471x0(Function1.this, obj);
                return m30471x0;
            }
        });
        final C24907v c24907v = new C24907v();
        Observable observeOn6 = flatMapMaybe.doOnNext(new InterfaceC23484g() { // from class: cV1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30469y0(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn6, "private fun initializeUi…      }, (Timber::e))\n  }");
        Object m33094as5 = observeOn6.m33094as(AutoDispose.m45239a(this.f92782c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24908w c24908w = new C24908w();
        InterfaceC23484g interfaceC23484g4 = new InterfaceC23484g() { // from class: xU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30467z0(Function1.this, obj);
            }
        };
        final C24909x c24909x = C24909x.f92849b;
        ((ObservableSubscribeProxy) m33094as5).subscribe(interfaceC23484g4, new InterfaceC23484g() { // from class: yU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30566A0(Function1.this, obj);
            }
        });
        Observable<IdentificationDocumentType> distinctUntilChanged = this.f92781b.m39225Zl().retry().distinctUntilChanged();
        final C24910y c24910y = new C24910y();
        Observable<IdentificationDocumentType> observeOn7 = distinctUntilChanged.doOnNext(new InterfaceC23484g() { // from class: zU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30564B0(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn7, "private fun initializeUi…      }, (Timber::e))\n  }");
        Object m33094as6 = observeOn7.m33094as(AutoDispose.m45239a(this.f92782c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24911z c24911z = new C24911z();
        InterfaceC23484g interfaceC23484g5 = new InterfaceC23484g() { // from class: BU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30562C0(Function1.this, obj);
            }
        };
        final C24849A c24849a = C24849A.f92792b;
        ((ObservableSubscribeProxy) m33094as6).subscribe(interfaceC23484g5, new InterfaceC23484g() { // from class: CU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30560D0(Function1.this, obj);
            }
        });
        Observable<Integer> retry3 = this.f92781b.m39226Yl().retry();
        final C24850B c24850b = new C24850B();
        Observable observeOn8 = retry3.flatMapMaybe(new InterfaceC23492o() { // from class: DU1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m30558E0;
                m30558E0 = C43341jV1.m30558E0(Function1.this, obj);
                return m30558E0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn8, "private fun initializeUi…      }, (Timber::e))\n  }");
        Object m33094as7 = observeOn8.m33094as(AutoDispose.m45239a(this.f92782c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24851C c24851c = new C24851C();
        InterfaceC23484g interfaceC23484g6 = new InterfaceC23484g() { // from class: EU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30556F0(Function1.this, obj);
            }
        };
        final C24853D c24853d = C24853D.f92796b;
        ((ObservableSubscribeProxy) m33094as7).subscribe(interfaceC23484g6, new InterfaceC23484g() { // from class: FU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30554G0(Function1.this, obj);
            }
        });
        Observable<Integer> retry4 = this.f92781b.m39230Ul().retry();
        final C24854E c24854e = new C24854E();
        Observable observeOn9 = retry4.flatMapMaybe(new InterfaceC23492o() { // from class: GU1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m30552H0;
                m30552H0 = C43341jV1.m30552H0(Function1.this, obj);
                return m30552H0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn9, "private fun initializeUi…      }, (Timber::e))\n  }");
        Object m33094as8 = observeOn9.m33094as(AutoDispose.m45239a(this.f92782c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24856G c24856g = new C24856G();
        InterfaceC23484g interfaceC23484g7 = new InterfaceC23484g() { // from class: HU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30550I0(Function1.this, obj);
            }
        };
        final C24858H c24858h = C24858H.f92801b;
        ((ObservableSubscribeProxy) m33094as8).subscribe(interfaceC23484g7, new InterfaceC23484g() { // from class: JU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30548J0(Function1.this, obj);
            }
        });
        Observable<Double> retry5 = this.f92781b.m39228Wl().retry();
        final C24859I c24859i = new C24859I();
        Observable observeOn10 = retry5.flatMapMaybe(new InterfaceC23492o() { // from class: KU1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m30546K0;
                m30546K0 = C43341jV1.m30546K0(Function1.this, obj);
                return m30546K0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn10, "private fun initializeUi…      }, (Timber::e))\n  }");
        Object m33094as9 = observeOn10.m33094as(AutoDispose.m45239a(this.f92782c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as9, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24860J c24860j = new C24860J();
        InterfaceC23484g interfaceC23484g8 = new InterfaceC23484g() { // from class: MU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30544L0(Function1.this, obj);
            }
        };
        final C24862K c24862k = C24862K.f92805b;
        ((ObservableSubscribeProxy) m33094as9).subscribe(interfaceC23484g8, new InterfaceC23484g() { // from class: NU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30542M0(Function1.this, obj);
            }
        });
        Observable<IdentificationIngestionResult> retry6 = this.f92781b.m39229Vl().retry();
        final C24863L c24863l = new C24863L();
        Observable observeOn11 = retry6.flatMapMaybe(new InterfaceC23492o() { // from class: OU1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m30540N0;
                m30540N0 = C43341jV1.m30540N0(Function1.this, obj);
                return m30540N0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn11, "private fun initializeUi…      }, (Timber::e))\n  }");
        Object m33094as10 = observeOn11.m33094as(AutoDispose.m45239a(this.f92782c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as10, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24864M c24864m = new C24864M();
        InterfaceC23484g interfaceC23484g9 = new InterfaceC23484g() { // from class: PU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30538O0(Function1.this, obj);
            }
        };
        final C24866N c24866n = C24866N.f92809b;
        ((ObservableSubscribeProxy) m33094as10).subscribe(interfaceC23484g9, new InterfaceC23484g() { // from class: QU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30536P0(Function1.this, obj);
            }
        });
        Observable<Integer> retry7 = this.f92781b.m39227Xl().retry();
        final C24867O c24867o = new C24867O();
        Observable observeOn12 = retry7.flatMapMaybe(new InterfaceC23492o() { // from class: RU1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m30534Q0;
                m30534Q0 = C43341jV1.m30534Q0(Function1.this, obj);
                return m30534Q0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn12, "private fun initializeUi…      }, (Timber::e))\n  }");
        Object m33094as11 = observeOn12.m33094as(AutoDispose.m45239a(this.f92782c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as11, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24868P c24868p = new C24868P();
        InterfaceC23484g interfaceC23484g10 = new InterfaceC23484g() { // from class: SU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30532R0(Function1.this, obj);
            }
        };
        final C24871R c24871r = C24871R.f92814b;
        ((ObservableSubscribeProxy) m33094as11).subscribe(interfaceC23484g10, new InterfaceC23484g() { // from class: TU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43341jV1.m30530S0(Function1.this, obj);
            }
        });
    }
}
