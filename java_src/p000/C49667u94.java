package p000;

import android.content.Intent;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.PropertyReportAction;
import co.bird.android.model.PropertyReportActionOption;
import co.bird.android.model.PropertyReportNextStep;
import co.bird.android.model.PropertyReportNextStepOption;
import co.bird.android.model.wire.WireBird;
import co.bird.api.response.CannotAccessReportResponse;
import co.bird.api.response.PropertyReport;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.C24576w;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C49667u94;
import p000.InterfaceC41921h56;
import p000.S74;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010(\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010$0$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, m28432d2 = {"Lu94;", "Lf94;", "Landroid/content/Intent;", "intent", "", "b", "p", "LaM;", C17296a.f69688o, "LaM;", "birdManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "Lz94;", "c", "Lz94;", "ui", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "Lco/bird/android/model/wire/WireBird;", "e", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/PropertyReportAction;", "f", "Lco/bird/android/model/PropertyReportAction;", "selectedAction", "Lco/bird/android/model/PropertyReportNextStep;", "g", "Lco/bird/android/model/PropertyReportNextStep;", "selectedNextStep", "LAG;", "", "kotlin.jvm.PlatformType", "h", "LAG;", "cannotAccessReportIdRelay", "<init>", "(LaM;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lz94;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPropertyReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PropertyReportPresenter.kt\nco/bird/android/app/feature/propertyreport/PropertyReportPresenterImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 Observables.kt\nio/reactivex/rxkotlin/Observables\n*L\n1#1,160:1\n11335#2:161\n11670#2,3:162\n11335#2:165\n11670#2,3:166\n180#3:169\n180#3:170\n180#3:173\n180#3:174\n218#3:175\n22#4,2:171\n*S KotlinDebug\n*F\n+ 1 PropertyReportPresenter.kt\nco/bird/android/app/feature/propertyreport/PropertyReportPresenterImpl\n*L\n61#1:161\n61#1:162,3\n65#1:165\n65#1:166,3\n75#1:169\n81#1:170\n92#1:173\n123#1:174\n148#1:175\n86#1:171,2\n*E\n"})
/* renamed from: u94  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49667u94 implements InterfaceC40773f94 {

    /* renamed from: a */
    public final InterfaceC10636aM f111830a;

    /* renamed from: b */
    public final LifecycleScopeProvider<EnumC7097RE> f111831b;

    /* renamed from: c */
    public final InterfaceC52631z94 f111832c;

    /* renamed from: d */
    public final InterfaceC40099e13 f111833d;

    /* renamed from: e */
    public WireBird f111834e;

    /* renamed from: f */
    public PropertyReportAction f111835f;

    /* renamed from: g */
    public PropertyReportNextStep f111836g;

    /* renamed from: h */
    public final C0058AG<String> f111837h;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u94$a */
    /* loaded from: classes2.dex */
    public static final class C29082a extends Lambda implements Function1<Throwable, Unit> {
        public C29082a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            InterfaceC52631z94 interfaceC52631z94 = C49667u94.this.f111832c;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC52631z94.error(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/CannotAccessReportResponse;", "kotlin.jvm.PlatformType", "report", "", C17296a.f69688o, "(Lco/bird/api/response/CannotAccessReportResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPropertyReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PropertyReportPresenter.kt\nco/bird/android/app/feature/propertyreport/PropertyReportPresenterImpl$loadLatestCannotAccessReport$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1#2:161\n*E\n"})
    /* renamed from: u94$b */
    /* loaded from: classes2.dex */
    public static final class C29083b extends Lambda implements Function1<CannotAccessReportResponse, Unit> {
        public C29083b() {
            super(1);
        }

        /* renamed from: a */
        public final void m10739a(CannotAccessReportResponse cannotAccessReportResponse) {
            Spanned spanned;
            C49667u94.this.f111832c.mo1747Pf(cannotAccessReportResponse.getBirdsDiscovered());
            C49667u94.this.f111832c.mo1740zl(cannotAccessReportResponse.getBirdsReported());
            InterfaceC52631z94 interfaceC52631z94 = C49667u94.this.f111832c;
            String notes = cannotAccessReportResponse.getNotes();
            if (notes != null) {
                spanned = Html.fromHtml(notes);
            } else {
                spanned = null;
            }
            interfaceC52631z94.mo1743ld(spanned);
            C0058AG c0058ag = C49667u94.this.f111837h;
            String id = cannotAccessReportResponse.getId();
            Intrinsics.checkNotNull(id);
            c0058ag.accept(id);
            List<String> photoUrls = cannotAccessReportResponse.getPhotoUrls();
            if (photoUrls != null) {
                C49667u94.this.f111832c.mo1741w6(photoUrls);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CannotAccessReportResponse cannotAccessReportResponse) {
            m10739a(cannotAccessReportResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u94$c */
    /* loaded from: classes2.dex */
    public static final class C29084c extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C29084c f111840g = new C29084c();

        public C29084c() {
            super(1);
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

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$1\n+ 2 PropertyReportPresenter.kt\nco/bird/android/app/feature/propertyreport/PropertyReportPresenterImpl\n*L\n1#1,304:1\n90#2:305\n*E\n"})
    /* renamed from: u94$d */
    /* loaded from: classes2.dex */
    public static final class C29085d<T1, T2, R> implements InterfaceC23480c<T1, T2, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(T1 t1, T2 t2) {
            boolean z;
            Boolean bool = (Boolean) t2;
            if (((Boolean) t1).booleanValue() && bool.booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            return (R) Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/w;", "Lco/bird/api/response/PropertyReport;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/w;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u94$e */
    /* loaded from: classes2.dex */
    public static final class C29086e extends Lambda implements Function1<C24576w<PropertyReport>, Unit> {
        public C29086e() {
            super(1);
        }

        /* renamed from: a */
        public final void m10738a(C24576w<PropertyReport> c24576w) {
            S74.C7343a.showProgress$default(C49667u94.this.f111832c, false, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C24576w<PropertyReport> c24576w) {
            m10738a(c24576w);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/PropertyReport;", "kotlin.jvm.PlatformType", "report", "", C17296a.f69688o, "(Lco/bird/api/response/PropertyReport;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u94$f */
    /* loaded from: classes2.dex */
    public static final class C29087f extends Lambda implements Function1<PropertyReport, Unit> {
        public C29087f() {
            super(1);
        }

        /* renamed from: a */
        public final void m10737a(PropertyReport propertyReport) {
            WireBird wireBird = null;
            InterfaceC41921h56.C22549a.topToast$default(C49667u94.this.f111832c, C45871nl4.property_report_submission_success, (EnumC40735f56) null, 2, (Object) null);
            Intent intent = new Intent();
            intent.putExtra("activity_result", propertyReport);
            WireBird wireBird2 = C49667u94.this.f111834e;
            if (wireBird2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
            } else {
                wireBird = wireBird2;
            }
            intent.putExtra("bird", wireBird);
            C49667u94.this.f111833d.mo37029e4(-1, intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PropertyReport propertyReport) {
            m10737a(propertyReport);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u94$g */
    /* loaded from: classes2.dex */
    public static final class C29088g extends Lambda implements Function1<Throwable, Unit> {
        public C29088g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            C49667u94.this.f111832c.error(C45871nl4.property_report_submission_error);
            C49667u94.this.f111832c.mo1742p(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/PropertyReportActionOption;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/PropertyReportActionOption;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u94$h */
    /* loaded from: classes2.dex */
    public static final class C29089h extends Lambda implements Function1<PropertyReportActionOption, Unit> {
        public C29089h() {
            super(1);
        }

        /* renamed from: a */
        public final void m10736a(PropertyReportActionOption propertyReportActionOption) {
            C49667u94.this.f111835f = propertyReportActionOption.getAction();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PropertyReportActionOption propertyReportActionOption) {
            m10736a(propertyReportActionOption);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/PropertyReportNextStepOption;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/PropertyReportNextStepOption;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u94$i */
    /* loaded from: classes2.dex */
    public static final class C29090i extends Lambda implements Function1<PropertyReportNextStepOption, Unit> {
        public C29090i() {
            super(1);
        }

        /* renamed from: a */
        public final void m10735a(PropertyReportNextStepOption propertyReportNextStepOption) {
            C49667u94.this.f111836g = propertyReportNextStepOption.getAction();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PropertyReportNextStepOption propertyReportNextStepOption) {
            m10735a(propertyReportNextStepOption);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/PropertyReportActionOption;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/PropertyReportActionOption;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u94$j */
    /* loaded from: classes2.dex */
    public static final class C29091j extends Lambda implements Function1<PropertyReportActionOption, Boolean> {

        /* renamed from: g */
        public static final C29091j f111846g = new C29091j();

        public C29091j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(PropertyReportActionOption it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getChecked());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/PropertyReportNextStepOption;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/PropertyReportNextStepOption;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u94$k */
    /* loaded from: classes2.dex */
    public static final class C29092k extends Lambda implements Function1<PropertyReportNextStepOption, Boolean> {

        /* renamed from: g */
        public static final C29092k f111847g = new C29092k();

        public C29092k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(PropertyReportNextStepOption it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getChecked());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "validated", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u94$l */
    /* loaded from: classes2.dex */
    public static final class C29093l extends Lambda implements Function1<Boolean, Unit> {
        public C29093l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean validated) {
            InterfaceC52631z94 interfaceC52631z94 = C49667u94.this.f111832c;
            Intrinsics.checkNotNullExpressionValue(validated, "validated");
            interfaceC52631z94.mo1742p(validated.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u94$m */
    /* loaded from: classes2.dex */
    public static final class C29094m extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C29094m f111849g = new C29094m();

        public C29094m() {
            super(1);
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

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u94$n */
    /* loaded from: classes2.dex */
    public static final class C29095n extends Lambda implements Function1<Pair<? extends Unit, ? extends String>, Unit> {
        public C29095n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends String> pair) {
            invoke2((Pair<Unit, String>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, String> pair) {
            S74.C7343a.showProgress$default(C49667u94.this.f111832c, true, 0, 2, null);
            C49667u94.this.f111832c.mo1742p(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/api/response/PropertyReport;", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u94$o */
    /* loaded from: classes2.dex */
    public static final class C29096o extends Lambda implements Function1<Pair<? extends Unit, ? extends String>, InterfaceC23447K<? extends PropertyReport>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: u94$o$a */
        /* loaded from: classes2.dex */
        public static final class C29097a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C49667u94 f111852g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29097a(C49667u94 c49667u94) {
                super(1);
                this.f111852g = c49667u94;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f111852g.f111832c.error(C45871nl4.property_report_submission_error);
                S74.C7343a.showProgress$default(this.f111852g.f111832c, false, 0, 2, null);
                this.f111852g.f111832c.mo1742p(true);
            }
        }

        public C29096o() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends PropertyReport> invoke(Pair<Unit, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String reportId = pair.component2();
            InterfaceC10636aM interfaceC10636aM = C49667u94.this.f111830a;
            WireBird wireBird = C49667u94.this.f111834e;
            if (wireBird == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird = null;
            }
            String id = wireBird.getId();
            Intrinsics.checkNotNullExpressionValue(reportId, "reportId");
            PropertyReportAction propertyReportAction = C49667u94.this.f111835f;
            if (propertyReportAction == null) {
                Intrinsics.throwUninitializedPropertyAccessException("selectedAction");
                propertyReportAction = null;
            }
            PropertyReportNextStep propertyReportNextStep = C49667u94.this.f111836g;
            if (propertyReportNextStep == null) {
                Intrinsics.throwUninitializedPropertyAccessException("selectedNextStep");
                propertyReportNextStep = null;
            }
            AbstractC23442F<PropertyReport> m33152N = interfaceC10636aM.mo71598K0(id, reportId, propertyReportAction, propertyReportNextStep, C49667u94.this.f111832c.mo1746U()).m33152N(C23454a.m33087a());
            final C29097a c29097a = new C29097a(C49667u94.this);
            return m33152N.m33106t(new InterfaceC23484g() { // from class: v94
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C49667u94.C29096o.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
    }

    public C49667u94(InterfaceC10636aM birdManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC52631z94 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f111830a = birdManager;
        this.f111831b = scopeProvider;
        this.f111832c = ui;
        this.f111833d = navigator;
        C0058AG<String> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<String>()");
        this.f111837h = m115951g;
    }

    /* renamed from: A */
    public static final Boolean m10769A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m10768B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m10767C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m10766D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m10749q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m10748r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m10747s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final InterfaceC23447K m10746t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m10745u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m10744v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m10743w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m10742x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m10741y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final Boolean m10740z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC40773f94
    /* renamed from: b */
    public void mo10764b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Parcelable parcelableExtra = intent.getParcelableExtra("bird");
        Intrinsics.checkNotNull(parcelableExtra);
        this.f111834e = (WireBird) parcelableExtra;
        PropertyReportAction[] values = PropertyReportAction.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (PropertyReportAction propertyReportAction : values) {
            arrayList.add(new PropertyReportActionOption(propertyReportAction));
        }
        PropertyReportNextStep[] values2 = PropertyReportNextStep.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (PropertyReportNextStep propertyReportNextStep : values2) {
            arrayList2.add(new PropertyReportNextStepOption(propertyReportNextStep));
        }
        this.f111832c.mo1745Ub(arrayList);
        this.f111832c.mo1748Nc(arrayList2);
        m10750p();
        Object m33094as = this.f111832c.mo1750G6().m33094as(AutoDispose.m45239a(this.f111831b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29089h c29089h = new C29089h();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: g94
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49667u94.m10742x(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f111832c.mo1749I6().m33094as(AutoDispose.m45239a(this.f111831b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29090i c29090i = new C29090i();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: m94
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49667u94.m10741y(Function1.this, obj);
            }
        });
        C24523e c24523e = C24523e.f91168a;
        Observable<PropertyReportActionOption> mo1750G6 = this.f111832c.mo1750G6();
        final C29091j c29091j = C29091j.f111846g;
        InterfaceC23434B map = mo1750G6.map(new InterfaceC23492o() { // from class: n94
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m10740z;
                m10740z = C49667u94.m10740z(Function1.this, obj);
                return m10740z;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "ui.actionOptionClicks().map { it.checked }");
        Observable<PropertyReportNextStepOption> mo1749I6 = this.f111832c.mo1749I6();
        final C29092k c29092k = C29092k.f111847g;
        InterfaceC23434B map2 = mo1749I6.map(new InterfaceC23492o() { // from class: o94
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m10769A;
                m10769A = C49667u94.m10769A(Function1.this, obj);
                return m10769A;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "ui.nextStepOptionClicks().map { it.checked }");
        Observable combineLatest = Observable.combineLatest(map, map2, new C29085d());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        Object m33094as3 = combineLatest.m33094as(AutoDispose.m45239a(this.f111831b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29093l c29093l = new C29093l();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: p94
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49667u94.m10768B(Function1.this, obj);
            }
        };
        final C29094m c29094m = C29094m.f111849g;
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: q94
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49667u94.m10767C(Function1.this, obj);
            }
        });
        Observable m31950a = C24527f.m31950a(this.f111832c.mo1744e(), this.f111837h);
        final C29095n c29095n = new C29095n();
        Observable doOnNext = m31950a.doOnNext(new InterfaceC23484g() { // from class: r94
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49667u94.m10766D(Function1.this, obj);
            }
        });
        final C29096o c29096o = new C29096o();
        Observable observeOn = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: s94
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m10746t;
                m10746t = C49667u94.m10746t(Function1.this, obj);
                return m10746t;
            }
        }).retry().observeOn(C23454a.m33087a());
        final C29086e c29086e = new C29086e();
        Observable doOnEach = observeOn.doOnEach(new InterfaceC23484g() { // from class: t94
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49667u94.m10745u(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnEach, "override fun onCreate(in…abled(true)\n      })\n\n  }");
        Object m33094as4 = doOnEach.m33094as(AutoDispose.m45239a(this.f111831b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29087f c29087f = new C29087f();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: h94
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49667u94.m10744v(Function1.this, obj);
            }
        };
        final C29088g c29088g = new C29088g();
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: l94
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49667u94.m10743w(Function1.this, obj);
            }
        });
    }

    /* renamed from: p */
    public final void m10750p() {
        InterfaceC10636aM interfaceC10636aM = this.f111830a;
        WireBird wireBird = this.f111834e;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        AbstractC23442F m33146T = C38096ag5.m70883l(C28237sD.progress$default(interfaceC10636aM.mo71573l(wireBird.getId()), this.f111832c, 0, 2, (Object) null)).m33146T(1L);
        final C29082a c29082a = new C29082a();
        AbstractC24507p m32065J = m33146T.m33106t(new InterfaceC23484g() { // from class: i94
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49667u94.m10749q(Function1.this, obj);
            }
        }).m33125j0().m32065J();
        Intrinsics.checkNotNullExpressionValue(m32065J, "private fun loadLatestCa…Timber.e(it)\n      })\n  }");
        Object m32048b = m32065J.m32048b(AutoDispose.m45239a(this.f111831b));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29083b c29083b = new C29083b();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: j94
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49667u94.m10748r(Function1.this, obj);
            }
        };
        final C29084c c29084c = C29084c.f111840g;
        ((MaybeSubscribeProxy) m32048b).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: k94
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49667u94.m10747s(Function1.this, obj);
            }
        });
    }
}
