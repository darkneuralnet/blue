package p000;

import co.bird.android.buava.Optional;
import co.bird.android.model.IdToolOption;
import co.bird.android.model.persistence.BrainSwapRecord;
import co.bird.android.model.wire.WireBird;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C40942fS1;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B9\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\n*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, m28432d2 = {"LfS1;", "Lf1;", "LlS1;", "LmS1;", "renderer", "", "y", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/BrainSwapRecord;", "Lio/reactivex/c;", "K", "Ln10;", "e", "Ln10;", "brainSwapManager", "Lom3;", "f", "Lom3;", "operatorManager", "LEa;", "g", "LEa;", "analyticsManager", "LTq4;", "h", "LTq4;", "reactiveConfig", "Le13;", "i", "Le13;", "navigator", "", "j", "Ljava/lang/String;", "sessionId", "<init>", "(Ln10;Lom3;LEa;LTq4;Le13;Ljava/lang/String;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdToolsLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsLandingPresenter.kt\nco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingPresenter\n+ 2 observable.kt\nio/reactivex/rxkotlin/ObservableKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,181:1\n103#2:182\n103#2:184\n180#3:183\n180#3:185\n180#3:186\n180#3:187\n180#3:188\n180#3:189\n237#3:190\n237#3:191\n*S KotlinDebug\n*F\n+ 1 IdToolsLandingPresenter.kt\nco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingPresenter\n*L\n51#1:182\n75#1:184\n54#1:183\n78#1:185\n85#1:186\n93#1:187\n102#1:188\n125#1:189\n138#1:190\n149#1:191\n*E\n"})
/* renamed from: fS1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40942fS1 extends AbstractC20169f1<InterfaceC44500lS1, C45093mS1> {

    /* renamed from: e */
    public final InterfaceC45433n10 f80136e;

    /* renamed from: f */
    public final InterfaceC46473om3 f80137f;

    /* renamed from: g */
    public final InterfaceC1880Ea f80138g;

    /* renamed from: h */
    public final C36207Tq4 f80139h;

    /* renamed from: i */
    public final InterfaceC40099e13 f80140i;

    /* renamed from: j */
    public final String f80141j;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000 \u0004*\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u00000\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "R", "", "kotlin.jvm.PlatformType", "it", C17296a.f69688o, "([Ljava/lang/Object;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nobservable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 observable.kt\nio/reactivex/rxkotlin/ObservableKt$combineLatest$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 IdToolsLandingPresenter.kt\nco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingPresenter\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n1313#2:181\n1382#2,3:182\n1603#2,9:186\n1855#2:195\n1856#2:197\n1612#2:198\n52#3:185\n1#4:196\n*S KotlinDebug\n*F\n+ 1 observable.kt\nio/reactivex/rxkotlin/ObservableKt$combineLatest$1\n+ 2 IdToolsLandingPresenter.kt\nco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingPresenter\n*L\n103#1:181\n103#1:182,3\n52#2:186,9\n52#2:195\n52#2:197\n52#2:198\n52#2:196\n*E\n"})
    /* renamed from: fS1$a */
    /* loaded from: classes3.dex */
    public static final class C20403a<T, R> implements InterfaceC23492o<Object[], R> {
        /* JADX WARN: Type inference failed for: r3v4, types: [R, java.util.Collection, java.util.ArrayList] */
        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public final R apply(Object[] objArr) {
            List asList;
            int collectionSizeOrDefault;
            asList = ArraysKt___ArraysJvmKt.asList(objArr);
            List list = asList;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList<Optional> arrayList = new ArrayList(collectionSizeOrDefault);
            for (T t : list) {
                if (t != null) {
                    arrayList.add(t);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type T");
                }
            }
            ?? r3 = (R) new ArrayList();
            for (Optional optional : arrayList) {
                IdToolOption idToolOption = (IdToolOption) optional.m59035e();
                if (idToolOption != null) {
                    r3.add(idToolOption);
                }
            }
            return r3;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000 \u0004*\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u00000\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "R", "", "kotlin.jvm.PlatformType", "it", C17296a.f69688o, "([Ljava/lang/Object;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nobservable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 observable.kt\nio/reactivex/rxkotlin/ObservableKt$combineLatest$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 IdToolsLandingPresenter.kt\nco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingPresenter\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n1313#2:181\n1382#2,3:182\n1603#2,9:186\n1855#2:195\n1856#2:197\n1612#2:198\n76#3:185\n1#4:196\n*S KotlinDebug\n*F\n+ 1 observable.kt\nio/reactivex/rxkotlin/ObservableKt$combineLatest$1\n+ 2 IdToolsLandingPresenter.kt\nco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingPresenter\n*L\n103#1:181\n103#1:182,3\n76#2:186,9\n76#2:195\n76#2:197\n76#2:198\n76#2:196\n*E\n"})
    /* renamed from: fS1$b */
    /* loaded from: classes3.dex */
    public static final class C20404b<T, R> implements InterfaceC23492o<Object[], R> {
        /* JADX WARN: Type inference failed for: r3v4, types: [R, java.util.Collection, java.util.ArrayList] */
        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public final R apply(Object[] objArr) {
            List asList;
            int collectionSizeOrDefault;
            asList = ArraysKt___ArraysJvmKt.asList(objArr);
            List list = asList;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList<Optional> arrayList = new ArrayList(collectionSizeOrDefault);
            for (T t : list) {
                if (t != null) {
                    arrayList.add(t);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type T");
                }
            }
            ?? r3 = (R) new ArrayList();
            for (Optional optional : arrayList) {
                IdToolOption idToolOption = (IdToolOption) optional.m59035e();
                if (idToolOption != null) {
                    r3.add(idToolOption);
                }
            }
            return r3;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "wireBird", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fS1$c */
    /* loaded from: classes3.dex */
    public static final class C20405c extends Lambda implements Function1<WireBird, Unit> {
        public C20405c() {
            super(1);
        }

        /* renamed from: a */
        public final void m41334a(WireBird wireBird) {
            C40942fS1.this.f80140i.mo37097S0(IdToolOption.BRAIN, wireBird, false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m41334a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/BrainSwapRecord;", "record", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/BrainSwapRecord;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fS1$d */
    /* loaded from: classes3.dex */
    public static final class C20406d extends Lambda implements Function1<BrainSwapRecord, String> {

        /* renamed from: g */
        public static final C20406d f80143g = new C20406d();

        public C20406d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(BrainSwapRecord record) {
            Intrinsics.checkNotNullParameter(record, "record");
            return record.getBirdId();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fS1$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C20407e extends FunctionReferenceImpl implements Function1<String, AbstractC23461c> {
        public C20407e(Object obj) {
            super(1, obj, InterfaceC45433n10.class, "deleteBrainSwapRecordById", "deleteBrainSwapRecordById(Ljava/lang/String;)Lio/reactivex/Completable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23461c invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InterfaceC45433n10) this.receiver).mo21981h0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/BrainSwapRecord;", "records", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "b", "(Ljava/util/List;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fS1$f */
    /* loaded from: classes3.dex */
    public static final class C20408f extends Lambda implements Function1<List<? extends BrainSwapRecord>, InterfaceC23434B<? extends List<? extends BrainSwapRecord>>> {

        /* renamed from: g */
        public static final C20408f f80144g = new C20408f();

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "", "Lco/bird/android/model/persistence/BrainSwapRecord;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Long;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: fS1$f$a */
        /* loaded from: classes3.dex */
        public static final class C20409a extends Lambda implements Function1<Long, List<? extends BrainSwapRecord>> {

            /* renamed from: g */
            public final /* synthetic */ List<BrainSwapRecord> f80145g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20409a(List<BrainSwapRecord> list) {
                super(1);
                this.f80145g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<BrainSwapRecord> invoke(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f80145g;
            }
        }

        public C20408f() {
            super(1);
        }

        /* renamed from: c */
        public static final List m41329c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends List<BrainSwapRecord>> invoke(List<BrainSwapRecord> records) {
            Intrinsics.checkNotNullParameter(records, "records");
            Observable<Long> interval = Observable.interval(0L, 1L, TimeUnit.MINUTES);
            final C20409a c20409a = new C20409a(records);
            return interval.map(new InterfaceC23492o() { // from class: gS1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m41329c;
                    m41329c = C40942fS1.C20408f.m41329c(Function1.this, obj);
                    return m41329c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "options", "", "Lco/bird/android/model/IdToolOption;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fS1$g */
    /* loaded from: classes3.dex */
    public static final class C20410g extends Lambda implements Function1<List<? extends IdToolOption>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LmS1;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LmS1;)LmS1;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: fS1$g$a */
        /* loaded from: classes3.dex */
        public static final class C20411a extends Lambda implements Function1<C45093mS1, C45093mS1> {

            /* renamed from: g */
            public final /* synthetic */ List<IdToolOption> f80147g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C20411a(List<? extends IdToolOption> list) {
                super(1);
                this.f80147g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C45093mS1 invoke(C45093mS1 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                List<IdToolOption> options = this.f80147g;
                Intrinsics.checkNotNullExpressionValue(options, "options");
                return C45093mS1.copy$default(state, options, null, null, 0, 14, null);
            }
        }

        public C20410g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends IdToolOption> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends IdToolOption> list) {
            C40942fS1.this.m42279i(new C20411a(list));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "options", "", "Lco/bird/android/model/IdToolOption;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fS1$h */
    /* loaded from: classes3.dex */
    public static final class C20412h extends Lambda implements Function1<List<? extends IdToolOption>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LmS1;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LmS1;)LmS1;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: fS1$h$a */
        /* loaded from: classes3.dex */
        public static final class C20413a extends Lambda implements Function1<C45093mS1, C45093mS1> {

            /* renamed from: g */
            public final /* synthetic */ List<IdToolOption> f80149g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C20413a(List<? extends IdToolOption> list) {
                super(1);
                this.f80149g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C45093mS1 invoke(C45093mS1 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                List<IdToolOption> options = this.f80149g;
                Intrinsics.checkNotNullExpressionValue(options, "options");
                return C45093mS1.copy$default(state, null, options, null, 0, 13, null);
            }
        }

        public C20412h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends IdToolOption> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends IdToolOption> list) {
            C40942fS1.this.m42279i(new C20413a(list));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/IdToolOption;", "kotlin.jvm.PlatformType", "option", "", C17296a.f69688o, "(Lco/bird/android/model/IdToolOption;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fS1$i */
    /* loaded from: classes3.dex */
    public static final class C20414i extends Lambda implements Function1<IdToolOption, Unit> {
        public C20414i() {
            super(1);
        }

        /* renamed from: a */
        public final void m41325a(IdToolOption option) {
            InterfaceC40099e13 interfaceC40099e13 = C40942fS1.this.f80140i;
            Intrinsics.checkNotNullExpressionValue(option, "option");
            InterfaceC40099e13.C19924a.goToAssociateId$default(interfaceC40099e13, option, null, false, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdToolOption idToolOption) {
            m41325a(idToolOption);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/IdToolOption;", "kotlin.jvm.PlatformType", "option", "", C17296a.f69688o, "(Lco/bird/android/model/IdToolOption;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fS1$j */
    /* loaded from: classes3.dex */
    public static final class C20415j extends Lambda implements Function1<IdToolOption, Unit> {
        public C20415j() {
            super(1);
        }

        /* renamed from: a */
        public final void m41324a(IdToolOption option) {
            InterfaceC40099e13 interfaceC40099e13 = C40942fS1.this.f80140i;
            Intrinsics.checkNotNullExpressionValue(option, "option");
            InterfaceC40099e13.C19924a.goToDissociateId$default(interfaceC40099e13, option, null, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdToolOption idToolOption) {
            m41324a(idToolOption);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "records", "", "Lco/bird/android/model/persistence/BrainSwapRecord;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fS1$k */
    /* loaded from: classes3.dex */
    public static final class C20416k extends Lambda implements Function1<List<? extends BrainSwapRecord>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LmS1;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LmS1;)LmS1;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: fS1$k$a */
        /* loaded from: classes3.dex */
        public static final class C20417a extends Lambda implements Function1<C45093mS1, C45093mS1> {

            /* renamed from: g */
            public final /* synthetic */ List<BrainSwapRecord> f80153g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20417a(List<BrainSwapRecord> list) {
                super(1);
                this.f80153g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C45093mS1 invoke(C45093mS1 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                List<BrainSwapRecord> records = this.f80153g;
                Intrinsics.checkNotNullExpressionValue(records, "records");
                return C45093mS1.copy$default(state, null, null, records, 0, 11, null);
            }
        }

        public C20416k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends BrainSwapRecord> list) {
            invoke2((List<BrainSwapRecord>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<BrainSwapRecord> list) {
            C40942fS1.this.m42279i(new C20417a(list));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/BrainSwapRecord;", "record", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fS1$l */
    /* loaded from: classes3.dex */
    public static final class C20418l extends Lambda implements Function1<BrainSwapRecord, InterfaceC23447K<? extends WireBird>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: fS1$l$a */
        /* loaded from: classes3.dex */
        public static final class C20419a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C40942fS1 f80155g;

            @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LmS1;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LmS1;)LmS1;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: fS1$l$a$a */
            /* loaded from: classes3.dex */
            public static final class C20420a extends Lambda implements Function1<C45093mS1, C45093mS1> {

                /* renamed from: g */
                public static final C20420a f80156g = new C20420a();

                public C20420a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final C45093mS1 invoke(C45093mS1 state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    return C45093mS1.copy$default(state, null, null, null, state.m25609e() + 1, 7, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20419a(C40942fS1 c40942fS1) {
                super(1);
                this.f80155g = c40942fS1;
            }

            /* renamed from: a */
            public final void m41318a(InterfaceC23465c interfaceC23465c) {
                this.f80155g.m42279i(C20420a.f80156g);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m41318a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LmS1;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LmS1;)LmS1;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: fS1$l$b */
        /* loaded from: classes3.dex */
        public static final class C20421b extends Lambda implements Function1<C45093mS1, C45093mS1> {

            /* renamed from: g */
            public static final C20421b f80157g = new C20421b();

            public C20421b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C45093mS1 invoke(C45093mS1 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return C45093mS1.copy$default(state, null, null, null, state.m25609e() - 1, 7, null);
            }
        }

        public C20418l() {
            super(1);
        }

        /* renamed from: d */
        public static final void m41319d(C40942fS1 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.m42279i(C20421b.f80157g);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends WireBird> invoke(BrainSwapRecord record) {
            Intrinsics.checkNotNullParameter(record, "record");
            AbstractC23442F<HM4<WireBird>> mo8116b = C40942fS1.this.f80137f.mo8116b(record.getBirdId());
            final C20419a c20419a = new C20419a(C40942fS1.this);
            AbstractC23442F<HM4<WireBird>> m33102v = mo8116b.m33102v(new InterfaceC23484g() { // from class: hS1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C40942fS1.C20418l.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C40942fS1 c40942fS1 = C40942fS1.this;
            AbstractC23442F<HM4<WireBird>> m33110r = m33102v.m33110r(new InterfaceC23478a() { // from class: iS1
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C40942fS1.C20418l.m41319d(C40942fS1.this);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33110r, "override fun consume(ren…e)\n      .subscribe()\n  }");
            return C38096ag5.m70883l(m33110r);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fS1$m */
    /* loaded from: classes3.dex */
    public static final class C20422m extends Lambda implements Function1<Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LmS1;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LmS1;)LmS1;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nIdToolsLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsLandingPresenter.kt\nco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingPresenter$consume$9$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1#2:182\n*E\n"})
        /* renamed from: fS1$m$a */
        /* loaded from: classes3.dex */
        public static final class C20423a extends Lambda implements Function1<C45093mS1, C45093mS1> {

            /* renamed from: g */
            public final /* synthetic */ Throwable f80159g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20423a(Throwable th) {
                super(1);
                this.f80159g = th;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C45093mS1 invoke(C45093mS1 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                C45093mS1 copy$default = C45093mS1.copy$default(state, null, null, null, 0, 15, null);
                copy$default.m25607g(this.f80159g);
                return copy$default;
            }
        }

        public C20422m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C40942fS1.this.m42279i(new C20423a(th));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/BrainSwapRecord;", "records", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIdToolsLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsLandingPresenter.kt\nco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingPresenter$queryOrUpdatePendingSwaps$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n766#2:182\n857#2,2:183\n1549#2:185\n1620#2,3:186\n*S KotlinDebug\n*F\n+ 1 IdToolsLandingPresenter.kt\nco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingPresenter$queryOrUpdatePendingSwaps$1\n*L\n158#1:182\n158#1:183,2\n164#1:185\n164#1:186,3\n*E\n"})
    /* renamed from: fS1$n */
    /* loaded from: classes3.dex */
    public static final class C20424n extends Lambda implements Function1<List<? extends BrainSwapRecord>, InterfaceC23496h> {
        public C20424n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(List<BrainSwapRecord> records) {
            int collectionSizeOrDefault;
            AbstractC23461c mo21983U;
            boolean z;
            Intrinsics.checkNotNullParameter(records, "records");
            int brainSwapTimeoutSeconds = C40942fS1.this.f80139h.m82623f8().m73665a().getOperatorConfig().getFeatures().getIdTool().getBrainSwapTimeoutSeconds();
            ArrayList<BrainSwapRecord> arrayList = new ArrayList();
            for (Object obj : records) {
                if (((BrainSwapRecord) obj).getStatus() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            C40942fS1 c40942fS1 = C40942fS1.this;
            if (arrayList.isEmpty()) {
                return AbstractC23461c.m33039p();
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (BrainSwapRecord brainSwapRecord : arrayList) {
                if (brainSwapRecord.getCreatedAt().plusSeconds(brainSwapTimeoutSeconds).isAfterNow()) {
                    mo21983U = c40942fS1.f80136e.mo21985B0(brainSwapRecord.getImei());
                } else {
                    mo21983U = c40942fS1.f80136e.mo21983U(brainSwapRecord.getImei(), Boolean.FALSE);
                }
                arrayList2.add(mo21983U);
            }
            return AbstractC23461c.m33074L(arrayList2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40942fS1(InterfaceC45433n10 brainSwapManager, InterfaceC46473om3 operatorManager, InterfaceC1880Ea analyticsManager, C36207Tq4 reactiveConfig, InterfaceC40099e13 navigator, String sessionId) {
        super(new C45093mS1(null, null, null, 0, 15, null));
        Intrinsics.checkNotNullParameter(brainSwapManager, "brainSwapManager");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f80136e = brainSwapManager;
        this.f80137f = operatorManager;
        this.f80138g = analyticsManager;
        this.f80139h = reactiveConfig;
        this.f80140i = navigator;
        this.f80141j = sessionId;
    }

    /* renamed from: A */
    public static final void m41362A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final String m41361B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final InterfaceC23496h m41360C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final InterfaceC23434B m41359D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m41358E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m41357F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m41356G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m41355H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m41354I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final InterfaceC23447K m41353J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final InterfaceC23496h m41351L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m41337z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public final AbstractC23461c m41352K(Observable<List<BrainSwapRecord>> observable) {
        final C20424n c20424n = new C20424n();
        AbstractC23461c flatMapCompletable = observable.flatMapCompletable(new InterfaceC23492o() { // from class: VR1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m41351L;
                m41351L = C40942fS1.m41351L(Function1.this, obj);
                return m41351L;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "private fun Observable<L…    )\n        }\n    }\n  }");
        return flatMapCompletable;
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: y */
    public void consume(InterfaceC44500lS1 renderer) {
        Observable m28957b;
        Observable m28957b2;
        Observable m28957b3;
        Observable m28957b4;
        Observable m28957b5;
        Observable m28957b6;
        Observable m28957b7;
        Observable m28957b8;
        Observable m28957b9;
        Observable m28957b10;
        Observable m28957b11;
        Observable m28957b12;
        Observable m28957b13;
        Observable m28957b14;
        List listOf;
        Observable m28957b15;
        Observable m28957b16;
        Observable m28957b17;
        Observable m28957b18;
        Observable m28957b19;
        Observable m28957b20;
        Observable m28957b21;
        Observable m28957b22;
        Observable m28957b23;
        Observable m28957b24;
        Observable m28957b25;
        Observable m28957b26;
        Observable m28957b27;
        Observable m28957b28;
        List listOf2;
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        this.f80138g.mo55905y(new IS1(null, null, null, this.f80141j, 7, null));
        Observable<Boolean> m82792P4 = this.f80139h.m82792P4();
        IdToolOption idToolOption = IdToolOption.QR_CODE;
        m28957b = C43907kS1.m28957b(m82792P4, idToolOption);
        Observable<Boolean> m82892F4 = this.f80139h.m82892F4();
        IdToolOption idToolOption2 = IdToolOption.LICENSE_PLATE;
        m28957b2 = C43907kS1.m28957b(m82892F4, idToolOption2);
        Observable<Boolean> m82495r4 = this.f80139h.m82495r4();
        IdToolOption idToolOption3 = IdToolOption.BRAIN;
        m28957b3 = C43907kS1.m28957b(m82495r4, idToolOption3);
        Observable<Boolean> m82412z4 = this.f80139h.m82412z4();
        IdToolOption idToolOption4 = IdToolOption.HANDLEBAR;
        m28957b4 = C43907kS1.m28957b(m82412z4, idToolOption4);
        Observable<Boolean> m82432x4 = this.f80139h.m82432x4();
        IdToolOption idToolOption5 = IdToolOption.GERMAN_LICENSE_PLATE;
        m28957b5 = C43907kS1.m28957b(m82432x4, idToolOption5);
        Observable<Boolean> m82912D4 = this.f80139h.m82912D4();
        IdToolOption idToolOption6 = IdToolOption.IL_LICENSE_PLATE;
        m28957b6 = C43907kS1.m28957b(m82912D4, idToolOption6);
        Observable<Boolean> m82852J4 = this.f80139h.m82852J4();
        IdToolOption idToolOption7 = IdToolOption.ONE_CODE;
        m28957b7 = C43907kS1.m28957b(m82852J4, idToolOption7);
        Observable<Boolean> m82473t4 = this.f80139h.m82473t4();
        IdToolOption idToolOption8 = IdToolOption.BATTERY_SERIAL;
        m28957b8 = C43907kS1.m28957b(m82473t4, idToolOption8);
        Observable<Boolean> m82772R4 = this.f80139h.m82772R4();
        IdToolOption idToolOption9 = IdToolOption.US_CA_PLATE;
        m28957b9 = C43907kS1.m28957b(m82772R4, idToolOption9);
        Observable<Boolean> m82872H4 = this.f80139h.m82872H4();
        IdToolOption idToolOption10 = IdToolOption.MOTOR;
        m28957b10 = C43907kS1.m28957b(m82872H4, idToolOption10);
        Observable<Boolean> m82832L4 = this.f80139h.m82832L4();
        IdToolOption idToolOption11 = IdToolOption.PCM;
        m28957b11 = C43907kS1.m28957b(m82832L4, idToolOption11);
        Observable<Boolean> m82452v4 = this.f80139h.m82452v4();
        IdToolOption idToolOption12 = IdToolOption.BEACON;
        m28957b12 = C43907kS1.m28957b(m82452v4, idToolOption12);
        Observable<Boolean> m82932B4 = this.f80139h.m82932B4();
        IdToolOption idToolOption13 = IdToolOption.HELMET;
        m28957b13 = C43907kS1.m28957b(m82932B4, idToolOption13);
        Observable<Boolean> m82812N4 = this.f80139h.m82812N4();
        IdToolOption idToolOption14 = IdToolOption.PHYSICAL_LOCK_STICKER;
        m28957b14 = C43907kS1.m28957b(m82812N4, idToolOption14);
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Observable[]{m28957b, m28957b2, m28957b3, m28957b4, m28957b5, m28957b6, m28957b7, m28957b8, m28957b9, m28957b10, m28957b11, m28957b12, m28957b13, m28957b14});
        Observable combineLatest = Observable.combineLatest(listOf, new C20403a());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…List().map { it as T }) }");
        Object m33094as = combineLatest.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20410g c20410g = new C20410g();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: TR1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40942fS1.m41358E(Function1.this, obj);
            }
        });
        m28957b15 = C43907kS1.m28957b(this.f80139h.m82891F5(), idToolOption);
        m28957b16 = C43907kS1.m28957b(this.f80139h.m82451v5(), idToolOption2);
        m28957b17 = C43907kS1.m28957b(this.f80139h.m82604h5(), idToolOption3);
        m28957b18 = C43907kS1.m28957b(this.f80139h.m82516p5(), idToolOption4);
        m28957b19 = C43907kS1.m28957b(this.f80139h.m82538n5(), idToolOption5);
        m28957b20 = C43907kS1.m28957b(this.f80139h.m82472t5(), idToolOption6);
        m28957b21 = C43907kS1.m28957b(this.f80139h.m82411z5(), idToolOption7);
        m28957b22 = C43907kS1.m28957b(this.f80139h.m82582j5(), idToolOption8);
        m28957b23 = C43907kS1.m28957b(this.f80139h.m82871H5(), idToolOption9);
        m28957b24 = C43907kS1.m28957b(this.f80139h.m82431x5(), idToolOption10);
        m28957b25 = C43907kS1.m28957b(this.f80139h.m82931B5(), idToolOption11);
        m28957b26 = C43907kS1.m28957b(this.f80139h.m82560l5(), idToolOption12);
        m28957b27 = C43907kS1.m28957b(this.f80139h.m82494r5(), idToolOption13);
        m28957b28 = C43907kS1.m28957b(this.f80139h.m82911D5(), idToolOption14);
        listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Observable[]{m28957b15, m28957b16, m28957b17, m28957b18, m28957b19, m28957b20, m28957b21, m28957b22, m28957b23, m28957b24, m28957b25, m28957b26, m28957b27, m28957b28});
        Observable combineLatest2 = Observable.combineLatest(listOf2, new C20404b());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest2, "Observable.combineLatest…List().map { it as T }) }");
        Object m33094as2 = combineLatest2.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20412h c20412h = new C20412h();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: XR1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40942fS1.m41357F(Function1.this, obj);
            }
        });
        Object m33094as3 = renderer.mo27278d2().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20414i c20414i = new C20414i();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: YR1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40942fS1.m41356G(Function1.this, obj);
            }
        });
        Object m33094as4 = renderer.mo27279D2().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20415j c20415j = new C20415j();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: ZR1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40942fS1.m41355H(Function1.this, obj);
            }
        });
        Object m33094as5 = this.f80136e.mo21982V().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20416k c20416k = new C20416k();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: aS1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40942fS1.m41354I(Function1.this, obj);
            }
        });
        Observable<BrainSwapRecord> mo27277d6 = renderer.mo27277d6();
        final C20418l c20418l = new C20418l();
        Observable<R> flatMapSingle = mo27277d6.flatMapSingle(new InterfaceC23492o() { // from class: bS1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m41353J;
                m41353J = C40942fS1.m41353J(Function1.this, obj);
                return m41353J;
            }
        });
        final C20422m c20422m = new C20422m();
        Observable retry = flatMapSingle.doOnError(new InterfaceC23484g() { // from class: cS1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40942fS1.m41337z(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun consume(ren…e)\n      .subscribe()\n  }");
        Object m33094as6 = retry.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20405c c20405c = new C20405c();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: dS1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40942fS1.m41362A(Function1.this, obj);
            }
        });
        Observable<BrainSwapRecord> mo27276s2 = renderer.mo27276s2();
        final C20406d c20406d = C20406d.f80143g;
        Observable<R> map = mo27276s2.map(new InterfaceC23492o() { // from class: eS1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m41361B;
                m41361B = C40942fS1.m41361B(Function1.this, obj);
                return m41361B;
            }
        });
        final C20407e c20407e = new C20407e(this.f80136e);
        AbstractC23461c flatMapCompletable = map.flatMapCompletable(new InterfaceC23492o() { // from class: UR1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m41360C;
                m41360C = C40942fS1.m41360C(Function1.this, obj);
                return m41360C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "renderer.brainSwapSwipes…eleteBrainSwapRecordById)");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Observable<List<BrainSwapRecord>> mo21982V = this.f80136e.mo21982V();
        final C20408f c20408f = C20408f.f80144g;
        Observable<List<BrainSwapRecord>> switchMap = mo21982V.switchMap(new InterfaceC23492o() { // from class: WR1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m41359D;
                m41359D = C40942fS1.m41359D(Function1.this, obj);
                return m41359D;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMap, "brainSwapManager.streamB… .map { records }\n      }");
        Object m33041n2 = m41352K(switchMap).m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n2).subscribe();
    }
}
