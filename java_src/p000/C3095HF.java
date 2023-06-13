package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBatch;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000  2\u00020\u0001:\u0001!B1\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR.\u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R.\u0010\n\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00100\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\""}, m28432d2 = {"LHF;", "LtF;", "Lio/reactivex/subjects/d;", "", "Lco/bird/android/model/wire/WireBatch;", "kotlin.jvm.PlatformType", C17296a.f69688o, "Lio/reactivex/subjects/d;", "batchesSubject", "b", "nextBatchesSubject", "", "c", "I", "offset", "Lio/reactivex/subjects/a;", "", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/a;", "searchTermSubject", "LJF;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "navigator", "LoF;", "converter", "Lom3;", "operatorManager", "<init>", "(LJF;Lcom/uber/autodispose/ScopeProvider;Le13;LoF;Lom3;)V", "e", "m", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBatchSearchPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BatchSearchPresenter.kt\nco/bird/android/feature/servicecenter/batches/batchsearch/BatchSearchPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,95:1\n180#2:96\n180#2:97\n180#2:98\n*S KotlinDebug\n*F\n+ 1 BatchSearchPresenter.kt\nco/bird/android/feature/servicecenter/batches/batchsearch/BatchSearchPresenterImpl\n*L\n63#1:96\n68#1:97\n91#1:98\n*E\n"})
/* renamed from: HF */
/* loaded from: classes3.dex */
public final class C3095HF implements InterfaceC28663tF {

    /* renamed from: e */
    public static final C3108m f13121e = new C3108m(null);

    /* renamed from: a */
    public final C24558d<List<WireBatch>> f13122a;

    /* renamed from: b */
    public final C24558d<List<WireBatch>> f13123b;

    /* renamed from: c */
    public int f13124c;

    /* renamed from: d */
    public final C24552a<String> f13125d;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052«\u0001\u0010\u0004\u001a¦\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001 \u0003*R\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/model/wire/WireBatch;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: HF$a */
    /* loaded from: classes3.dex */
    public static final class C3096a extends Lambda implements Function1<Triple<? extends List<? extends WireBatch>, ? extends List<? extends WireBatch>, ? extends List<? extends WireBatch>>, Unit> {
        public C3096a() {
            super(1);
        }

        /* renamed from: a */
        public final void m104116a(Triple<? extends List<WireBatch>, ? extends List<WireBatch>, ? extends List<WireBatch>> triple) {
            List plus;
            List<WireBatch> currentlyDisplayedBatches = triple.component2();
            List<WireBatch> nextBatchesFromPreviousPass = triple.component3();
            C24558d c24558d = C3095HF.this.f13122a;
            Intrinsics.checkNotNullExpressionValue(currentlyDisplayedBatches, "currentlyDisplayedBatches");
            Intrinsics.checkNotNullExpressionValue(nextBatchesFromPreviousPass, "nextBatchesFromPreviousPass");
            plus = CollectionsKt___CollectionsKt.plus((Collection) currentlyDisplayedBatches, (Iterable) nextBatchesFromPreviousPass);
            c24558d.onNext(plus);
            C3095HF.this.f13123b.onNext(triple.component1());
            C3095HF.this.f13124c += 20;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends List<? extends WireBatch>, ? extends List<? extends WireBatch>, ? extends List<? extends WireBatch>> triple) {
            m104116a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00020\u0002 \b* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00020\u0002\u0018\u00010\u00060\u00062N\u0010\u0005\u001aJ\u0012(\u0012&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lwb4;", "Lkotlin/Triple;", "", "Lco/bird/android/model/wire/WireBatch;", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lwb4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: HF$b */
    /* loaded from: classes3.dex */
    public static final class C3097b extends Lambda implements Function1<C51106wb4<? extends Triple<? extends List<? extends WireBatch>, ? extends List<? extends WireBatch>, ? extends List<? extends WireBatch>>, ? extends List<? extends WireBatch>, ? extends List<? extends WireBatch>, ? extends Integer>, InterfaceC23447K<? extends List<? extends C3023H6>>> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC26874oF f13127g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3097b(InterfaceC26874oF interfaceC26874oF) {
            super(1);
            this.f13127g = interfaceC26874oF;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(C51106wb4<? extends Triple<? extends List<WireBatch>, ? extends List<WireBatch>, ? extends List<WireBatch>>, ? extends List<WireBatch>, ? extends List<WireBatch>, Integer> c51106wb4) {
            Intrinsics.checkNotNullParameter(c51106wb4, "<name for destructuring parameter 0>");
            int intValue = c51106wb4.m6611d().intValue();
            return this.f13127g.mo17741a(c51106wb4.m6613b(), c51106wb4.m6612c(), intValue);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: HF$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3098c extends FunctionReferenceImpl implements Function1<Collection<? extends C3023H6>, Unit> {
        public C3098c(Object obj) {
            super(1, obj, InterfaceC3940JF.class, "populateAdapter", "populateAdapter(Ljava/util/Collection;)V", 0);
        }

        /* renamed from: a */
        public final void m104114a(Collection<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC3940JF) this.receiver).mo94152o(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Collection<? extends C3023H6> collection) {
            m104114a(collection);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: HF$d */
    /* loaded from: classes3.dex */
    public static final class C3099d extends Lambda implements Function1<Pair<? extends Unit, ? extends String>, Boolean> {

        /* renamed from: g */
        public static final C3099d f13128g = new C3099d();

        public C3099d() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Unit, String> pair) {
            boolean isBlank;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String searchTerm = pair.component2();
            Intrinsics.checkNotNullExpressionValue(searchTerm, "searchTerm");
            isBlank = StringsKt__StringsJVMKt.isBlank(searchTerm);
            return Boolean.valueOf(!isBlank);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Unit, ? extends String> pair) {
            return invoke2((Pair<Unit, String>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: HF$e */
    /* loaded from: classes3.dex */
    public static final class C3100e extends Lambda implements Function1<Pair<? extends Unit, ? extends String>, Unit> {
        public C3100e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends String> pair) {
            invoke2((Pair<Unit, String>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, String> pair) {
            C3095HF.this.f13125d.onNext(pair.component2());
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0003* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "Lco/bird/android/model/wire/WireBatch;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: HF$f */
    /* loaded from: classes3.dex */
    public static final class C3101f extends Lambda implements Function1<Pair<? extends Unit, ? extends String>, InterfaceC23447K<? extends List<? extends WireBatch>>> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC46473om3 f13130g;

        /* renamed from: h */
        public final /* synthetic */ C3095HF f13131h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC3940JF f13132i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3101f(InterfaceC46473om3 interfaceC46473om3, C3095HF c3095hf, InterfaceC3940JF interfaceC3940JF) {
            super(1);
            this.f13130g = interfaceC46473om3;
            this.f13131h = c3095hf;
            this.f13132i = interfaceC3940JF;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<WireBatch>> invoke(Pair<Unit, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String searchTerm = pair.component2();
            InterfaceC46473om3 interfaceC46473om3 = this.f13130g;
            Intrinsics.checkNotNullExpressionValue(searchTerm, "searchTerm");
            return C28237sD.progress$default(C38096ag5.m70883l(interfaceC46473om3.mo8114c(searchTerm, Integer.valueOf(this.f13131h.f13124c), 40)), this.f13132i, 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "batches", "", "Lco/bird/android/model/wire/WireBatch;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: HF$g */
    /* loaded from: classes3.dex */
    public static final class C3102g extends Lambda implements Function1<List<? extends WireBatch>, Unit> {
        public C3102g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireBatch> list) {
            invoke2((List<WireBatch>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireBatch> batches) {
            List take;
            Intrinsics.checkNotNullExpressionValue(batches, "batches");
            take = CollectionsKt___CollectionsKt.take(batches, 20);
            C3095HF.this.f13122a.onNext(take);
            C3095HF.this.f13123b.onNext(batches.subList(take.size(), batches.size()));
            C3095HF.this.f13124c += 40;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireBatch;", "batches", "Lio/reactivex/K;", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: HF$h */
    /* loaded from: classes3.dex */
    public static final class C3103h extends Lambda implements Function1<List<? extends WireBatch>, InterfaceC23447K<? extends List<? extends C3023H6>>> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC26874oF f13134g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3103h(InterfaceC26874oF interfaceC26874oF) {
            super(1);
            this.f13134g = interfaceC26874oF;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(List<WireBatch> batches) {
            List<WireBatch> take;
            Intrinsics.checkNotNullParameter(batches, "batches");
            take = CollectionsKt___CollectionsKt.take(batches, 20);
            return this.f13134g.mo17741a(take, batches.subList(take.size(), batches.size()), 20);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: HF$i */
    /* loaded from: classes3.dex */
    public static final class C3104i extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC3940JF f13135g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3104i(InterfaceC3940JF interfaceC3940JF) {
            super(1);
            this.f13135g = interfaceC3940JF;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.f13135g.error(th.getMessage());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: HF$j */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3105j extends FunctionReferenceImpl implements Function1<Collection<? extends C3023H6>, Unit> {
        public C3105j(Object obj) {
            super(1, obj, InterfaceC3940JF.class, "populateAdapter", "populateAdapter(Ljava/util/Collection;)V", 0);
        }

        /* renamed from: a */
        public final void m104111a(Collection<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC3940JF) this.receiver).mo94152o(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Collection<? extends C3023H6> collection) {
            m104111a(collection);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBatch;", "kotlin.jvm.PlatformType", "batch", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBatch;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: HF$k */
    /* loaded from: classes3.dex */
    public static final class C3106k extends Lambda implements Function1<WireBatch, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC40099e13 f13136g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3106k(InterfaceC40099e13 interfaceC40099e13) {
            super(1);
            this.f13136g = interfaceC40099e13;
        }

        /* renamed from: a */
        public final void m104110a(WireBatch batch) {
            InterfaceC40099e13 interfaceC40099e13 = this.f13136g;
            Intrinsics.checkNotNullExpressionValue(batch, "batch");
            interfaceC40099e13.mo36940t3(batch);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBatch wireBatch) {
            m104110a(wireBatch);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0003* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "Lco/bird/android/model/wire/WireBatch;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: HF$l */
    /* loaded from: classes3.dex */
    public static final class C3107l extends Lambda implements Function1<Pair<? extends Unit, ? extends String>, InterfaceC23447K<? extends List<? extends WireBatch>>> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC46473om3 f13137g;

        /* renamed from: h */
        public final /* synthetic */ C3095HF f13138h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC3940JF f13139i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3107l(InterfaceC46473om3 interfaceC46473om3, C3095HF c3095hf, InterfaceC3940JF interfaceC3940JF) {
            super(1);
            this.f13137g = interfaceC46473om3;
            this.f13138h = c3095hf;
            this.f13139i = interfaceC3940JF;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<WireBatch>> invoke(Pair<Unit, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String searchTerm = pair.component2();
            InterfaceC46473om3 interfaceC46473om3 = this.f13137g;
            Intrinsics.checkNotNullExpressionValue(searchTerm, "searchTerm");
            return C28237sD.progress$default(C38096ag5.m70883l(interfaceC46473om3.mo8114c(searchTerm, Integer.valueOf(this.f13138h.f13124c), 20)), this.f13139i, 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LHF$m;", "", "", "MAXIMUM_BATCHES_WITHOUT_PAGINATION_LIMIT", "I", "<init>", "()V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: HF$m */
    /* loaded from: classes3.dex */
    public static final class C3108m {
        public /* synthetic */ C3108m(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3108m() {
        }
    }

    public C3095HF(InterfaceC3940JF ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, InterfaceC26874oF converter, InterfaceC46473om3 operatorManager) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        C24558d<List<WireBatch>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<List<WireBatch>>()");
        this.f13122a = m31902e;
        C24558d<List<WireBatch>> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<List<WireBatch>>()");
        this.f13123b = m31902e2;
        C24552a<String> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<String>()");
        this.f13125d = m31922e;
        Observable m31950a = C24527f.m31950a(ui.mo94153k7(), ui.mo94163H());
        final C3099d c3099d = C3099d.f13128g;
        Observable filter = m31950a.filter(new InterfaceC23494q() { // from class: uF
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m104129n;
                m104129n = C3095HF.m104129n(Function1.this, obj);
                return m104129n;
            }
        });
        final C3100e c3100e = new C3100e();
        Observable doOnNext = filter.doOnNext(new InterfaceC23484g() { // from class: BF
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C3095HF.m104128o(Function1.this, obj);
            }
        });
        final C3101f c3101f = new C3101f(operatorManager, this, ui);
        Observable flatMapSingle = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: CF
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m104124s;
                m104124s = C3095HF.m104124s(Function1.this, obj);
                return m104124s;
            }
        });
        final C3102g c3102g = new C3102g();
        Observable doOnNext2 = flatMapSingle.doOnNext(new InterfaceC23484g() { // from class: DF
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C3095HF.m104123t(Function1.this, obj);
            }
        });
        final C3103h c3103h = new C3103h(converter);
        Observable observeOn = doOnNext2.flatMapSingle(new InterfaceC23492o() { // from class: EF
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m104122u;
                m104122u = C3095HF.m104122u(Function1.this, obj);
                return m104122u;
            }
        }).observeOn(C23454a.m33087a());
        final C3104i c3104i = new C3104i(ui);
        Observable doOnError = observeOn.doOnError(new InterfaceC23484g() { // from class: FF
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C3095HF.m104121v(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "ui.searchClicks()\n      … { ui.error(it.message) }");
        Object m33094as = doOnError.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3105j c3105j = new C3105j(ui);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: GF
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C3095HF.m104120w(Function1.this, obj);
            }
        });
        Observable<WireBatch> observeOn2 = ui.mo94154j1().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.batchClicks()\n      .…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3106k c3106k = new C3106k(navigator);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: vF
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C3095HF.m104119x(Function1.this, obj);
            }
        });
        Observable m31950a2 = C24527f.m31950a(ui.mo94162Mg(), m31922e);
        final C3107l c3107l = new C3107l(operatorManager, this, ui);
        Observable flatMapSingle2 = m31950a2.flatMapSingle(new InterfaceC23492o() { // from class: wF
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m104118y;
                m104118y = C3095HF.m104118y(Function1.this, obj);
                return m104118y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle2, "ui.loadMoreClicks()\n    …    .progress(ui)\n      }");
        Observable m31949b = C24527f.m31949b(flatMapSingle2, m31902e, m31902e2);
        final C3096a c3096a = new C3096a();
        Observable withLatestFrom = m31949b.doOnNext(new InterfaceC23484g() { // from class: xF
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C3095HF.m104117z(Function1.this, obj);
            }
        }).withLatestFrom(m31902e, m31902e2, ui.mo94155Yk(), new InterfaceC23486i() { // from class: yF
            @Override // io.reactivex.functions.InterfaceC23486i
            public final Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
                C51106wb4 m104127p;
                m104127p = C3095HF.m104127p((Triple) obj, (List) obj2, (List) obj3, ((Integer) obj4).intValue());
                return m104127p;
            }
        });
        final C3097b c3097b = new C3097b(converter);
        Observable observeOn3 = withLatestFrom.flatMapSingle(new InterfaceC23492o() { // from class: zF
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m104126q;
                m104126q = C3095HF.m104126q(Function1.this, obj);
                return m104126q;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.loadMoreClicks()\n    …dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3098c c3098c = new C3098c(ui);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: AF
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C3095HF.m104125r(Function1.this, obj);
            }
        });
    }

    /* renamed from: n */
    public static final boolean m104129n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: o */
    public static final void m104128o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final C51106wb4 m104127p(Triple t1, List t2, List t3, int i) {
        Intrinsics.checkNotNullParameter(t1, "t1");
        Intrinsics.checkNotNullParameter(t2, "t2");
        Intrinsics.checkNotNullParameter(t3, "t3");
        return new C51106wb4(t1, t2, t3, Integer.valueOf(i));
    }

    /* renamed from: q */
    public static final InterfaceC23447K m104126q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m104125r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final InterfaceC23447K m104124s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m104123t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final InterfaceC23447K m104122u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m104121v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m104120w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m104119x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final InterfaceC23447K m104118y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m104117z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }
}
