package p000;

import co.bird.android.model.persistence.NestFlightSheetDetails;
import co.bird.android.model.persistence.nestedstructures.NestButtons;
import co.bird.android.model.persistence.nestedstructures.NestFavoritePartner;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24567g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fRF\u0010\u0018\u001a4\u00120\u0012.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012 \u0015*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0018\u00010\f0\f0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"Li33;", "Lf1;", "Lj33;", "Lk33;", "renderer", "", "u", "Lom3;", "e", "Lom3;", "operatorManager", "Lio/reactivex/subjects/g;", "", "", "f", "Lio/reactivex/subjects/g;", "nestPartnerSelects", "Lma4;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/NestFavoritePartner;", "", "kotlin.jvm.PlatformType", "g", "Lma4;", "nestFavoritePartners", "<init>", "(Lom3;Lio/reactivex/subjects/g;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestFavoritePartnerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFavoritePartnerPresenter.kt\nco/bird/android/app/feature/operator/dialogs/nest/favorite/NestFavoritePartnerPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n*L\n1#1,68:1\n180#2:69\n180#2:70\n180#2:71\n180#2:73\n233#3:72\n*S KotlinDebug\n*F\n+ 1 NestFavoritePartnerPresenter.kt\nco/bird/android/app/feature/operator/dialogs/nest/favorite/NestFavoritePartnerPresenter\n*L\n24#1:69\n33#1:70\n52#1:71\n64#1:73\n57#1:72\n*E\n"})
/* renamed from: i33  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42491i33 extends AbstractC20169f1<InterfaceC43084j33, C43677k33> {

    /* renamed from: e */
    public final InterfaceC46473om3 f86669e;

    /* renamed from: f */
    public final C24567g<List<String>> f86670f;

    /* renamed from: g */
    public final C45168ma4<List<Pair<NestFavoritePartner, Boolean>>> f86671g;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 NestFavoritePartnerPresenter.kt\nco/bird/android/app/feature/operator/dialogs/nest/favorite/NestFavoritePartnerPresenter\n*L\n1#1,304:1\n57#2:305\n*E\n"})
    /* renamed from: i33$a */
    /* loaded from: classes2.dex */
    public static final class C23111a<T1, T2, R> implements InterfaceC23480c<Unit, List<? extends Pair<? extends NestFavoritePartner, ? extends Boolean>>, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(Unit unit, List<? extends Pair<? extends NestFavoritePartner, ? extends Boolean>> list) {
            return (R) list;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "nestFavoritePartners", "", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/NestFavoritePartner;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i33$b */
    /* loaded from: classes2.dex */
    public static final class C23112b extends Lambda implements Function1<List<? extends Pair<? extends NestFavoritePartner, ? extends Boolean>>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lk33;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lk33;)Lk33;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: i33$b$a */
        /* loaded from: classes2.dex */
        public static final class C23113a extends Lambda implements Function1<C43677k33, C43677k33> {

            /* renamed from: g */
            public final /* synthetic */ List<Pair<NestFavoritePartner, Boolean>> f86673g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23113a(List<Pair<NestFavoritePartner, Boolean>> list) {
                super(1);
                this.f86673g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C43677k33 invoke(C43677k33 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                List<Pair<NestFavoritePartner, Boolean>> nestFavoritePartners = this.f86673g;
                Intrinsics.checkNotNullExpressionValue(nestFavoritePartners, "nestFavoritePartners");
                return state.m29388a(nestFavoritePartners);
            }
        }

        public C23112b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Pair<? extends NestFavoritePartner, ? extends Boolean>> list) {
            invoke2((List<Pair<NestFavoritePartner, Boolean>>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<Pair<NestFavoritePartner, Boolean>> list) {
            C42491i33.this.m42279i(new C23113a(list));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i33$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C23114c extends FunctionReferenceImpl implements Function1<String, Observable<NestFlightSheetDetails>> {
        public C23114c(Object obj) {
            super(1, obj, InterfaceC46473om3.class, "streamNestFlightSheet", "streamNestFlightSheet(Ljava/lang/String;)Lio/reactivex/Observable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Observable<NestFlightSheetDetails> invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InterfaceC46473om3) this.receiver).mo8134S(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/NestFlightSheetDetails;", "nestFlightSheetDetails", "", "Lco/bird/android/model/persistence/nestedstructures/NestFavoritePartner;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/NestFlightSheetDetails;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i33$d */
    /* loaded from: classes2.dex */
    public static final class C23115d extends Lambda implements Function1<NestFlightSheetDetails, List<? extends NestFavoritePartner>> {

        /* renamed from: g */
        public static final C23115d f86674g = new C23115d();

        public C23115d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<NestFavoritePartner> invoke(NestFlightSheetDetails nestFlightSheetDetails) {
            List<NestFavoritePartner> emptyList;
            List<NestFavoritePartner> availableFavoritePartners;
            Intrinsics.checkNotNullParameter(nestFlightSheetDetails, "nestFlightSheetDetails");
            NestButtons nestButtons = nestFlightSheetDetails.getNestButtons();
            if (nestButtons == null || (availableFavoritePartners = nestButtons.getAvailableFavoritePartners()) == null) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return emptyList;
            }
            return availableFavoritePartners;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "nestFavoritePartners", "", "Lco/bird/android/model/persistence/nestedstructures/NestFavoritePartner;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nNestFavoritePartnerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFavoritePartnerPresenter.kt\nco/bird/android/app/feature/operator/dialogs/nest/favorite/NestFavoritePartnerPresenter$consume$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1549#2:69\n1620#2,3:70\n*S KotlinDebug\n*F\n+ 1 NestFavoritePartnerPresenter.kt\nco/bird/android/app/feature/operator/dialogs/nest/favorite/NestFavoritePartnerPresenter$consume$4\n*L\n36#1:69\n36#1:70,3\n*E\n"})
    /* renamed from: i33$e */
    /* loaded from: classes2.dex */
    public static final class C23116e extends Lambda implements Function1<List<? extends NestFavoritePartner>, Unit> {
        public C23116e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends NestFavoritePartner> list) {
            invoke2((List<NestFavoritePartner>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<NestFavoritePartner> nestFavoritePartners) {
            int collectionSizeOrDefault;
            C45168ma4 c45168ma4 = C42491i33.this.f86671g;
            Intrinsics.checkNotNullExpressionValue(nestFavoritePartners, "nestFavoritePartners");
            List<NestFavoritePartner> list = nestFavoritePartners;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (NestFavoritePartner nestFavoritePartner : list) {
                arrayList.add(TuplesKt.m28425to(nestFavoritePartner, Boolean.FALSE));
            }
            c45168ma4.accept(arrayList);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002 \u0005*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u00010\u00012J\u0010\u0006\u001aF\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u00120\u0012.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002 \u0005*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u00010\u00010\u0002H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/NestFavoritePartner;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nNestFavoritePartnerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFavoritePartnerPresenter.kt\nco/bird/android/app/feature/operator/dialogs/nest/favorite/NestFavoritePartnerPresenter$consume$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1549#2:69\n1620#2,3:70\n*S KotlinDebug\n*F\n+ 1 NestFavoritePartnerPresenter.kt\nco/bird/android/app/feature/operator/dialogs/nest/favorite/NestFavoritePartnerPresenter$consume$5\n*L\n44#1:69\n44#1:70,3\n*E\n"})
    /* renamed from: i33$f */
    /* loaded from: classes2.dex */
    public static final class C23117f extends Lambda implements Function1<Pair<? extends Pair<? extends NestFavoritePartner, ? extends Boolean>, ? extends List<? extends Pair<? extends NestFavoritePartner, ? extends Boolean>>>, List<? extends Pair<? extends NestFavoritePartner, ? extends Boolean>>> {

        /* renamed from: g */
        public static final C23117f f86676g = new C23117f();

        public C23117f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends Pair<? extends NestFavoritePartner, ? extends Boolean>> invoke(Pair<? extends Pair<? extends NestFavoritePartner, ? extends Boolean>, ? extends List<? extends Pair<? extends NestFavoritePartner, ? extends Boolean>>> pair) {
            return invoke2((Pair<Pair<NestFavoritePartner, Boolean>, ? extends List<Pair<NestFavoritePartner, Boolean>>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<Pair<NestFavoritePartner, Boolean>> invoke2(Pair<Pair<NestFavoritePartner, Boolean>, ? extends List<Pair<NestFavoritePartner, Boolean>>> pair) {
            int collectionSizeOrDefault;
            Pair m28425to;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Pair<NestFavoritePartner, Boolean> component1 = pair.component1();
            List<Pair<NestFavoritePartner, Boolean>> nestFavoritePartners = pair.component2();
            Intrinsics.checkNotNullExpressionValue(nestFavoritePartners, "nestFavoritePartners");
            List<Pair<NestFavoritePartner, Boolean>> list = nestFavoritePartners;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pair pair2 = (Pair) it.next();
                NestFavoritePartner nestFavoritePartner = (NestFavoritePartner) pair2.component1();
                boolean booleanValue = ((Boolean) pair2.component2()).booleanValue();
                if (Intrinsics.areEqual(nestFavoritePartner, component1.getFirst())) {
                    m28425to = TuplesKt.m28425to(nestFavoritePartner, component1.getSecond());
                } else {
                    m28425to = TuplesKt.m28425to(nestFavoritePartner, Boolean.valueOf(booleanValue));
                }
                arrayList.add(m28425to);
            }
            return arrayList;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i33$g */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C23118g extends FunctionReferenceImpl implements Function1<List<? extends Pair<? extends NestFavoritePartner, ? extends Boolean>>, Unit> {
        public C23118g(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Pair<? extends NestFavoritePartner, ? extends Boolean>> list) {
            invoke2((List<Pair<NestFavoritePartner, Boolean>>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<Pair<NestFavoritePartner, Boolean>> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00000\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/NestFavoritePartner;", "", "nestFavoritePartners", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNestFavoritePartnerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFavoritePartnerPresenter.kt\nco/bird/android/app/feature/operator/dialogs/nest/favorite/NestFavoritePartnerPresenter$consume$8\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1603#2,9:69\n1855#2:78\n1856#2:80\n1612#2:81\n1#3:79\n*S KotlinDebug\n*F\n+ 1 NestFavoritePartnerPresenter.kt\nco/bird/android/app/feature/operator/dialogs/nest/favorite/NestFavoritePartnerPresenter$consume$8\n*L\n59#1:69,9\n59#1:78\n59#1:80\n59#1:81\n59#1:79\n*E\n"})
    /* renamed from: i33$h */
    /* loaded from: classes2.dex */
    public static final class C23119h extends Lambda implements Function1<List<? extends Pair<? extends NestFavoritePartner, ? extends Boolean>>, List<? extends String>> {

        /* renamed from: g */
        public static final C23119h f86677g = new C23119h();

        public C23119h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(List<Pair<NestFavoritePartner, Boolean>> nestFavoritePartners) {
            String partnerId;
            Intrinsics.checkNotNullParameter(nestFavoritePartners, "nestFavoritePartners");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = nestFavoritePartners.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                NestFavoritePartner nestFavoritePartner = (NestFavoritePartner) pair.component1();
                if (!((Boolean) pair.component2()).booleanValue()) {
                    partnerId = null;
                } else {
                    partnerId = nestFavoritePartner.getPartnerId();
                }
                if (partnerId != null) {
                    arrayList.add(partnerId);
                }
            }
            return arrayList;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i33$i */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C23120i extends FunctionReferenceImpl implements Function1<List<? extends String>, Unit> {
        public C23120i(Object obj) {
            super(1, obj, C24567g.class, "onSuccess", "onSuccess(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
            invoke2((List<String>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<String> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24567g) this.receiver).onSuccess(p0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42491i33(InterfaceC46473om3 operatorManager, C24567g<List<String>> nestPartnerSelects) {
        super(new C43677k33(null, 1, null));
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(nestPartnerSelects, "nestPartnerSelects");
        this.f86669e = operatorManager;
        this.f86670f = nestPartnerSelects;
        C45168ma4<List<Pair<NestFavoritePartner, Boolean>>> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<List<Pair<NestFavoritePartner, Boolean>>>()");
        this.f86671g = m25409g;
    }

    /* renamed from: A */
    public static final List m34530A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m34529B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m34528f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final InterfaceC23434B m34518v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final List m34517w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m34516x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final List m34515y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m34514z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: u */
    public void consume(InterfaceC43084j33 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Object m33094as = this.f86671g.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23112b c23112b = new C23112b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: a33
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42491i33.m34528f(Function1.this, obj);
            }
        });
        Observable<String> mo31216N = renderer.mo31216N();
        final C23114c c23114c = new C23114c(this.f86669e);
        Observable<R> flatMap = mo31216N.flatMap(new InterfaceC23492o() { // from class: b33
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m34518v;
                m34518v = C42491i33.m34518v(Function1.this, obj);
                return m34518v;
            }
        });
        final C23115d c23115d = C23115d.f86674g;
        Observable map = flatMap.map(new InterfaceC23492o() { // from class: c33
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m34517w;
                m34517w = C42491i33.m34517w(Function1.this, obj);
                return m34517w;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "renderer.nestId()\n      …Partners ?: emptyList() }");
        Object m33094as2 = map.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23116e c23116e = new C23116e();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: d33
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42491i33.m34516x(Function1.this, obj);
            }
        });
        Observable m31950a = C24527f.m31950a(renderer.mo31214m7(), this.f86671g);
        final C23117f c23117f = C23117f.f86676g;
        Observable map2 = m31950a.map(new InterfaceC23492o() { // from class: e33
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m34515y;
                m34515y = C42491i33.m34515y(Function1.this, obj);
                return m34515y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "renderer.nestPartnerChec…      }\n        }\n      }");
        Object m33094as3 = map2.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23118g c23118g = new C23118g(this.f86671g);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: f33
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42491i33.m34514z(Function1.this, obj);
            }
        });
        Observable<R> withLatestFrom = renderer.mo31215f().withLatestFrom(this.f86671g, new C23111a());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        final C23119h c23119h = C23119h.f86677g;
        Observable map3 = withLatestFrom.map(new InterfaceC23492o() { // from class: g33
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m34530A;
                m34530A = C42491i33.m34530A(Function1.this, obj);
                return m34530A;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "renderer.confirmClicks()…rtnerId\n        }\n      }");
        Object m33094as4 = map3.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23120i c23120i = new C23120i(this.f86670f);
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: h33
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42491i33.m34529B(Function1.this, obj);
            }
        });
    }
}
