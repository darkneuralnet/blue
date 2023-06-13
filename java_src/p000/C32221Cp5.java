package p000;

import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.PhotoBannerViewModel;
import co.bird.android.model.VehicleScrapRequest;
import co.bird.android.model.constant.AssetManagerType;
import co.bird.android.model.constant.ScrapRequestReason;
import co.bird.android.model.constant.TaskPriority;
import co.bird.android.model.wire.WireAsset;
import co.bird.android.model.wire.WireBird;
import co.bird.api.exception.HttpException;
import co.bird.api.response.WireSignedUrl;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24552a;
import java.io.File;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C32221Cp5;
import p000.InterfaceC40099e13;
import p000.InterfaceC48923su2;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(¢\u0006\u0004\b:\u0010;J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R.\u00102\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020. /*\n\u0012\u0004\u0012\u00020.\u0018\u00010-0-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R.\u00105\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 /*\n\u0012\u0004\u0012\u00020\u0004\u0018\u000103030,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00101R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006<"}, m28432d2 = {"LCp5;", "Lnp5;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/VehicleScrapRequest;", "scrapRequest", "", "b", "Ljava/io/File;", "imageFile", C17296a.f69688o, "", "error", "E", "Leo5;", "Leo5;", "scrapManager", "Lsu2;", "Lsu2;", "localAssetManager", "Lcn5;", "c", "Lcn5;", "scrapAnalyticsManager", "LIp5;", DateTokenConverter.CONVERTER_KEY, "LIp5;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "e", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lrn5;", "f", "Lrn5;", "converter", "Le13;", "g", "Le13;", "navigator", "Lco/bird/android/model/PhotoBannerViewModel;", "h", "Lco/bird/android/model/PhotoBannerViewModel;", "photoBannerViewModel", "Lio/reactivex/subjects/a;", "", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "i", "Lio/reactivex/subjects/a;", "photosSubject", "Lco/bird/android/buava/Optional;", "j", "requestSubject", "", "k", "Ljava/lang/String;", "savePath", "<init>", "(Leo5;Lsu2;Lcn5;LIp5;Lcom/uber/autodispose/ScopeProvider;Lrn5;Le13;Lco/bird/android/model/PhotoBannerViewModel;)V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrapPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapPresenter.kt\nco/bird/android/feature/scrap/ScrapPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n180#2:161\n180#2:162\n180#2:165\n180#2:168\n180#2:169\n237#2:170\n61#3,2:163\n71#3,2:166\n37#4,2:171\n9#5,4:173\n1#6:177\n*S KotlinDebug\n*F\n+ 1 ScrapPresenter.kt\nco/bird/android/feature/scrap/ScrapPresenterImpl\n*L\n55#1:161\n66#1:162\n75#1:165\n92#1:168\n130#1:169\n144#1:170\n69#1:163,2\n82#1:166,2\n150#1:171,2\n155#1:173,4\n*E\n"})
/* renamed from: Cp5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32221Cp5 implements InterfaceC45912np5 {

    /* renamed from: a */
    public final InterfaceC40565eo5 f4760a;

    /* renamed from: b */
    public final InterfaceC48923su2 f4761b;

    /* renamed from: c */
    public final InterfaceC39352cn5 f4762c;

    /* renamed from: d */
    public final InterfaceC33625Ip5 f4763d;

    /* renamed from: e */
    public final ScopeProvider f4764e;

    /* renamed from: f */
    public final InterfaceC48264rn5 f4765f;

    /* renamed from: g */
    public final InterfaceC40099e13 f4766g;

    /* renamed from: h */
    public final PhotoBannerViewModel f4767h;

    /* renamed from: i */
    public final C24552a<List<Uri>> f4768i;

    /* renamed from: j */
    public final C24552a<Optional<VehicleScrapRequest>> f4769j;

    /* renamed from: k */
    public final String f4770k;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cp5$a */
    /* loaded from: classes3.dex */
    public static final class C1198a extends Lambda implements Function1<Unit, Unit> {
        public C1198a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToRetakeablePhoto$default(C32221Cp5.this.f4766g, C32221Cp5.this.f4767h, C32221Cp5.this.f4770k, null, 10026, null, false, 52, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cp5$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1199b extends FunctionReferenceImpl implements Function1<List<? extends Uri>, Unit> {
        public C1199b(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Uri> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Uri> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2V\u0010\u0007\u001aR\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0001 \u0006*(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/constant/ScrapRequestReason;", "", "Landroid/net/Uri;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cp5$c */
    /* loaded from: classes3.dex */
    public static final class C1200c extends Lambda implements Function1<Triple<? extends Optional<ScrapRequestReason>, ? extends List<? extends Uri>, ? extends Optional<CharSequence>>, Unit> {
        public C1200c() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m111447a(Triple<Optional<ScrapRequestReason>, ? extends List<? extends Uri>, Optional<CharSequence>> triple) {
            boolean z;
            String obj;
            boolean isBlank;
            List<? extends Uri> component2 = triple.component2();
            Optional<CharSequence> component3 = triple.component3();
            InterfaceC33625Ip5 interfaceC33625Ip5 = C32221Cp5.this.f4763d;
            boolean z2 = false;
            if (triple.component1().m59037c() && (!component2.isEmpty())) {
                CharSequence m59035e = component3.m59035e();
                if (m59035e != null && (obj = m59035e.toString()) != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(obj);
                    if (!isBlank) {
                        z = true;
                        if (z) {
                            z2 = true;
                        }
                    }
                }
                z = false;
                if (z) {
                }
            }
            interfaceC33625Ip5.mo99650p(z2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Optional<ScrapRequestReason>, ? extends List<? extends Uri>, ? extends Optional<CharSequence>> triple) {
            m111447a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\u0007\u001a\u00028\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"T1", "T2", "T3", "T4", "t1", "t2", "t3", "t4", "Lwb4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$3\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: Cp5$d */
    /* loaded from: classes3.dex */
    public static final class C1201d<T1, T2, T3, T4, R> implements InterfaceC23486i {

        /* renamed from: a */
        public static final C1201d<T1, T2, T3, T4, R> f4773a = new C1201d<>();

        @Override // io.reactivex.functions.InterfaceC23486i
        /* renamed from: a */
        public final C51106wb4<T1, T2, T3, T4> apply(T1 t1, T2 t2, T3 t3, T4 t4) {
            return new C51106wb4<>(t1, t2, t3, t4);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cp5$e */
    /* loaded from: classes3.dex */
    public static final class C1202e extends Lambda implements Function1<Unit, Unit> {
        public C1202e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C32221Cp5.this.f4766g.close();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cp5$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1203f extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C1203f(Object obj) {
            super(1, obj, C32221Cp5.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C32221Cp5) this.receiver).m111472E(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\n \u0003*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00050\u0005 \u0003* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\n \u0003*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00050\u0005\u0018\u00010\t0\t2n\u0010\b\u001aj\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0003*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0003*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"Lwb4;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/constant/ScrapRequestReason;", "kotlin.jvm.PlatformType", "", "", "Landroid/net/Uri;", "Lco/bird/android/model/VehicleScrapRequest;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LH6;", C17296a.f69688o, "(Lwb4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cp5$g */
    /* loaded from: classes3.dex */
    public static final class C1204g extends Lambda implements Function1<C51106wb4<? extends Optional<ScrapRequestReason>, ? extends Optional<CharSequence>, ? extends List<? extends Uri>, ? extends Optional<VehicleScrapRequest>>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C1204g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(C51106wb4<Optional<ScrapRequestReason>, Optional<CharSequence>, ? extends List<? extends Uri>, Optional<VehicleScrapRequest>> c51106wb4) {
            String str;
            Intrinsics.checkNotNullParameter(c51106wb4, "<name for destructuring parameter 0>");
            List<? extends Uri> photos = c51106wb4.m6612c();
            Optional<VehicleScrapRequest> m6611d = c51106wb4.m6611d();
            InterfaceC48264rn5 interfaceC48264rn5 = C32221Cp5.this.f4765f;
            ScrapRequestReason m59035e = c51106wb4.m6614a().m59035e();
            CharSequence m59035e2 = c51106wb4.m6613b().m59035e();
            if (m59035e2 != null) {
                str = m59035e2.toString();
            } else {
                str = null;
            }
            Intrinsics.checkNotNullExpressionValue(photos, "photos");
            return interfaceC48264rn5.mo11778a(m59035e, str, photos, m6611d.m59035e());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cp5$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1205h extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C1205h(Object obj) {
            super(1, obj, InterfaceC33625Ip5.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC33625Ip5) this.receiver).mo99654b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cp5$i */
    /* loaded from: classes3.dex */
    public static final class C1206i extends Lambda implements Function1<Unit, Unit> {
        public C1206i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C32221Cp5.this.f4763d.mo99650p(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\t\u001ab\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\b0\b \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\b0\b\u0018\u00010\u00030\u0007 \u0002*0\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\b0\b \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\b0\b\u0018\u00010\u00030\u0007\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "", "Landroid/net/Uri;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "", "c", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cp5$j */
    /* loaded from: classes3.dex */
    public static final class C1207j extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends Uri>>, InterfaceC23447K<? extends List<String>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/net/Uri;", "photo", "Lio/reactivex/K;", "Lco/bird/api/response/WireSignedUrl;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroid/net/Uri;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Cp5$j$a */
        /* loaded from: classes3.dex */
        public static final class C1208a extends Lambda implements Function1<Uri, InterfaceC23447K<? extends WireSignedUrl>> {

            /* renamed from: g */
            public final /* synthetic */ C32221Cp5 f4778g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1208a(C32221Cp5 c32221Cp5) {
                super(1);
                this.f4778g = c32221Cp5;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23447K<? extends WireSignedUrl> invoke(Uri photo) {
                File m106438a;
                Intrinsics.checkNotNullParameter(photo, "photo");
                InterfaceC48923su2 interfaceC48923su2 = this.f4778g.f4761b;
                m106438a = C32923Fp5.m106438a(photo);
                return C28237sD.progress$default(interfaceC48923su2.mo13526i(m106438a, AssetManagerType.REPAIR), this.f4778g.f4763d, 0, 2, (Object) null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WireSignedUrl;", "wireSignedUrl", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/WireSignedUrl;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Cp5$j$b */
        /* loaded from: classes3.dex */
        public static final class C1209b extends Lambda implements Function1<WireSignedUrl, String> {

            /* renamed from: g */
            public static final C1209b f4779g = new C1209b();

            public C1209b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final String invoke(WireSignedUrl wireSignedUrl) {
                Intrinsics.checkNotNullParameter(wireSignedUrl, "wireSignedUrl");
                WireAsset asset = wireSignedUrl.getAsset();
                Intrinsics.checkNotNull(asset);
                return asset.getId();
            }
        }

        public C1207j() {
            super(1);
        }

        /* renamed from: d */
        public static final String m111441d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (String) tmp0.invoke(obj);
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends List<String>> invoke(Pair<Unit, ? extends List<? extends Uri>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Observable fromIterable = Observable.fromIterable(pair.component2());
            final C1208a c1208a = new C1208a(C32221Cp5.this);
            Observable flatMapSingle = fromIterable.flatMapSingle(new InterfaceC23492o() { // from class: Dp5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K invoke$lambda$0;
                    invoke$lambda$0 = C32221Cp5.C1207j.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C1209b c1209b = C1209b.f4779g;
            return flatMapSingle.map(new InterfaceC23492o() { // from class: Ep5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    String m111441d;
                    m111441d = C32221Cp5.C1207j.m111441d(Function1.this, obj);
                    return m111441d;
                }
            }).toList();
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\n0\n \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\n0\n\u0018\u00010\t0\t2d\u0010\b\u001a`\u0012(\u0012&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0003*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u00050\u0000H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"Lkotlin/Triple;", "", "", "kotlin.jvm.PlatformType", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/constant/ScrapRequestReason;", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/VehicleScrapRequest;", C17296a.f69688o, "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cp5$k */
    /* loaded from: classes3.dex */
    public static final class C1210k extends Lambda implements Function1<Triple<? extends List<String>, ? extends Optional<ScrapRequestReason>, ? extends Optional<CharSequence>>, InterfaceC23447K<? extends VehicleScrapRequest>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f4781h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1210k(WireBird wireBird) {
            super(1);
            this.f4781h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends VehicleScrapRequest> invoke(Triple<? extends List<String>, Optional<ScrapRequestReason>, Optional<CharSequence>> triple) {
            String str;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            List<String> assetIds = triple.component1();
            InterfaceC40565eo5 interfaceC40565eo5 = C32221Cp5.this.f4760a;
            WireBird wireBird = this.f4781h;
            Intrinsics.checkNotNullExpressionValue(assetIds, "assetIds");
            ScrapRequestReason m59038b = triple.component2().m59038b();
            CharSequence m59035e = triple.component3().m59035e();
            if (m59035e != null) {
                str = m59035e.toString();
            } else {
                str = null;
            }
            return C38096ag5.m70883l(C28237sD.progress$default(interfaceC40565eo5.mo40799c(wireBird, assetIds, m59038b, str), C32221Cp5.this.f4763d, 0, 2, (Object) null));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cp5$l */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1211l extends FunctionReferenceImpl implements Function1<VehicleScrapRequest, Unit> {
        public C1211l(Object obj) {
            super(1, obj, InterfaceC39352cn5.class, "scrapInspectionCompleted", "scrapInspectionCompleted(Lco/bird/android/model/VehicleScrapRequest;)V", 0);
        }

        /* renamed from: a */
        public final void m111437a(VehicleScrapRequest p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC39352cn5) this.receiver).mo43711b(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(VehicleScrapRequest vehicleScrapRequest) {
            m111437a(vehicleScrapRequest);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/VehicleScrapRequest;", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/VehicleScrapRequest;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cp5$m */
    /* loaded from: classes3.dex */
    public static final class C1212m extends Lambda implements Function1<VehicleScrapRequest, InterfaceC23434B<? extends Unit>> {
        public C1212m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Unit> invoke(VehicleScrapRequest it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C32221Cp5.this.f4763d.mo99655K();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cp5$n */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1213n extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C1213n(Object obj) {
            super(1, obj, C32221Cp5.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C32221Cp5) this.receiver).m111472E(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cp5$o */
    /* loaded from: classes3.dex */
    public static final class C1214o extends Lambda implements Function1<Throwable, Unit> {
        public C1214o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C32221Cp5.this.f4763d.mo99650p(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"T1", "T2", "T3", "t1", "t2", "t3", "Lkotlin/Triple;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$2\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: Cp5$p */
    /* loaded from: classes3.dex */
    public static final class C1215p<T1, T2, T3, R> implements InterfaceC23485h {

        /* renamed from: a */
        public static final C1215p<T1, T2, T3, R> f4784a = new C1215p<>();

        @Override // io.reactivex.functions.InterfaceC23485h
        /* renamed from: a */
        public final Triple<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
            return new Triple<>(t1, t2, t3);
        }
    }

    public C32221Cp5(InterfaceC40565eo5 scrapManager, InterfaceC48923su2 localAssetManager, InterfaceC39352cn5 scrapAnalyticsManager, InterfaceC33625Ip5 ui, ScopeProvider scopeProvider, InterfaceC48264rn5 converter, InterfaceC40099e13 navigator, PhotoBannerViewModel photoBannerViewModel) {
        Intrinsics.checkNotNullParameter(scrapManager, "scrapManager");
        Intrinsics.checkNotNullParameter(localAssetManager, "localAssetManager");
        Intrinsics.checkNotNullParameter(scrapAnalyticsManager, "scrapAnalyticsManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(photoBannerViewModel, "photoBannerViewModel");
        this.f4760a = scrapManager;
        this.f4761b = localAssetManager;
        this.f4762c = scrapAnalyticsManager;
        this.f4763d = ui;
        this.f4764e = scopeProvider;
        this.f4765f = converter;
        this.f4766g = navigator;
        this.f4767h = photoBannerViewModel;
        C24552a<List<Uri>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<List<Uri>>()");
        this.f4768i = m31922e;
        C24552a<Optional<VehicleScrapRequest>> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<Optional<VehicleScrapRequest>>()");
        this.f4769j = m31922e2;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f4770k = uuid;
        Observable<Unit> observeOn = ui.mo99652g().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.addPhotoClicks()\n    …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1198a c1198a = new C1198a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: op5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32221Cp5.m111457q(Function1.this, obj);
            }
        });
        Observable<List<Uri>> distinctUntilChanged = ui.mo99648wd().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "ui.photoUpdates()\n      .distinctUntilChanged()");
        Object m33094as2 = distinctUntilChanged.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1199b c1199b = new C1199b(m31922e);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: tp5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32221Cp5.m111456r(Function1.this, obj);
            }
        });
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(ui.mo99649s(), ui.mo99648wd(), ui.mo99651l7(), C1215p.f4784a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s… -> Triple(t1, t2, t3) })");
        Observable observeOn2 = combineLatest.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as3 = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1200c c1200c = new C1200c();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: up5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32221Cp5.m111455s(Function1.this, obj);
            }
        });
    }

    /* renamed from: A */
    public static final InterfaceC23447K m111476A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final InterfaceC23447K m111475B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m111474C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final InterfaceC23434B m111473D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m111457q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m111456r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m111455s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m111454t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m111453u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m111452v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m111451w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final InterfaceC23447K m111450x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m111449y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m111448z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public final void m111472E(Throwable th) {
        C41318g46.m40159e(th);
        Unit unit = null;
        if (!(th instanceof HttpException)) {
            th = null;
        }
        HttpException httpException = (HttpException) th;
        if (httpException != null) {
            this.f4763d.error(httpException);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f4763d.error(C45871nl4.error_generic_body);
        }
    }

    @Override // p000.InterfaceC45912np5
    /* renamed from: a */
    public void mo22333a(File imageFile) {
        List<Uri> listOf;
        Intrinsics.checkNotNullParameter(imageFile, "imageFile");
        C24552a<List<Uri>> c24552a = this.f4768i;
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(Uri.fromFile(imageFile));
        List<Uri> value = this.f4768i.getValue();
        if (value == null) {
            value = CollectionsKt__CollectionsKt.emptyList();
        }
        spreadBuilder.addSpread(value.toArray(new Uri[0]));
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new Uri[spreadBuilder.size()]));
        c24552a.onNext(listOf);
    }

    @Override // p000.InterfaceC45912np5
    /* renamed from: b */
    public void mo22332b(WireBird bird, VehicleScrapRequest vehicleScrapRequest) {
        List<Uri> emptyList;
        List<String> imageAssetIds;
        Intrinsics.checkNotNullParameter(bird, "bird");
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable<Optional<ScrapRequestReason>> mo99649s = this.f4763d.mo99649s();
        Optional.C14443a c14443a = Optional.f63040c;
        Observable<Optional<ScrapRequestReason>> startWith = mo99649s.startWith((Observable<Optional<ScrapRequestReason>>) c14443a.m59034a());
        Intrinsics.checkNotNullExpressionValue(startWith, "ui.reasonSelects().startWith(Optional.absent())");
        Observable<Optional<CharSequence>> startWith2 = this.f4763d.mo99651l7().startWith((Observable<Optional<CharSequence>>) c14443a.m59034a());
        Intrinsics.checkNotNullExpressionValue(startWith2, "ui.detailsChanges().startWith(Optional.absent())");
        C24552a<List<Uri>> c24552a = this.f4768i;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        Observable<List<Uri>> distinctUntilChanged = c24552a.startWith((C24552a<List<Uri>>) emptyList).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "photosSubject.startWith(…)).distinctUntilChanged()");
        Observable combineLatest = Observable.combineLatest(startWith, startWith2, distinctUntilChanged, this.f4769j, C1201d.f4773a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…> Quad(t1, t2, t3, t4) })");
        final C1204g c1204g = new C1204g();
        Observable observeOn = combineLatest.flatMapSingle(new InterfaceC23492o() { // from class: vp5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m111450x;
                m111450x = C32221Cp5.m111450x(Function1.this, obj);
                return m111450x;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onCreate(bi…   .subscribe()\n    }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f4764e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1205h c1205h = new C1205h(this.f4763d);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: xp5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32221Cp5.m111449y(Function1.this, obj);
            }
        });
        Observable<Unit> mo99653c = this.f4763d.mo99653c();
        final C1206i c1206i = new C1206i();
        Observable<Unit> doOnNext = mo99653c.doOnNext(new InterfaceC23484g() { // from class: yp5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32221Cp5.m111448z(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun onCreate(bi…   .subscribe()\n    }\n  }");
        Observable m31950a = C24527f.m31950a(doOnNext, this.f4763d.mo99648wd());
        final C1207j c1207j = new C1207j();
        Observable flatMapSingle = m31950a.flatMapSingle(new InterfaceC23492o() { // from class: zp5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m111476A;
                m111476A = C32221Cp5.m111476A(Function1.this, obj);
                return m111476A;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun onCreate(bi…   .subscribe()\n    }\n  }");
        Observable m31949b = C24527f.m31949b(flatMapSingle, this.f4763d.mo99649s(), this.f4763d.mo99651l7());
        final C1210k c1210k = new C1210k(bird);
        Observable flatMapSingle2 = m31949b.flatMapSingle(new InterfaceC23492o() { // from class: Ap5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m111475B;
                m111475B = C32221Cp5.m111475B(Function1.this, obj);
                return m111475B;
            }
        });
        final C1211l c1211l = new C1211l(this.f4762c);
        Observable observeOn2 = flatMapSingle2.doOnNext(new InterfaceC23484g() { // from class: Bp5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32221Cp5.m111474C(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        final C1212m c1212m = new C1212m();
        Observable flatMap = observeOn2.flatMap(new InterfaceC23492o() { // from class: pp5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m111473D;
                m111473D = C32221Cp5.m111473D(Function1.this, obj);
                return m111473D;
            }
        });
        final C1213n c1213n = new C1213n(this);
        Observable doOnError = flatMap.doOnError(new InterfaceC23484g() { // from class: qp5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32221Cp5.m111454t(Function1.this, obj);
            }
        });
        final C1214o c1214o = new C1214o();
        Observable retry = doOnError.doOnError(new InterfaceC23484g() { // from class: rp5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32221Cp5.m111453u(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun onCreate(bi…   .subscribe()\n    }\n  }");
        Object m33094as2 = retry.m33094as(AutoDispose.m45239a(this.f4764e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1202e c1202e = new C1202e();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: sp5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32221Cp5.m111452v(Function1.this, obj);
            }
        };
        final C1203f c1203f = new C1203f(this);
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: wp5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32221Cp5.m111451w(Function1.this, obj);
            }
        });
        this.f4762c.mo43712a(bird);
        this.f4769j.onNext(c14443a.m59033b(vehicleScrapRequest));
        if (vehicleScrapRequest != null && (imageAssetIds = vehicleScrapRequest.getImageAssetIds()) != null) {
            Object m33041n = InterfaceC48923su2.C28429a.loadAssets$default(this.f4761b, imageAssetIds, AssetManagerType.REPAIR, TaskPriority.URGENT, null, 8, null).m33041n(AutoDispose.m45239a(this.f4764e));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            ((CompletableSubscribeProxy) m33041n).subscribe();
        }
    }
}
