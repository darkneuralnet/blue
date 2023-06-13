package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.constant.HealthStatus;
import co.bird.android.model.wire.WireInventoryPart;
import co.bird.android.model.wire.WirePart;
import co.bird.android.model.wire.WirePartCategory;
import co.bird.api.response.InventoryStatusResponse;
import co.bird.api.response.WireInventory;
import co.bird.api.response.WireInventoryKt;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import p000.C50257v92;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020%¢\u0006\u0004\b1\u00102J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\tR\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R.\u0010-\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 **\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)0)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R.\u00100\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020. **\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00060\u00060(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010,¨\u00063"}, m28432d2 = {"Lv92;", "", "", "query", "", "resultsCount", "", "LH6;", "adapterSections", "", "v", "", "e", "F", "Lco/bird/android/model/wire/WirePartCategory;", "category", "w", "Lco/bird/android/model/constant/HealthStatus;", "healthStatus", "A", "G", "LXl3;", C17296a.f69688o, "LXl3;", "inventoryManager", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "c", "Le13;", "navigator", "Lx92;", DateTokenConverter.CONVERTER_KEY, "Lx92;", "partUi", "LL82;", "LL82;", "partConverter", "Lio/reactivex/subjects/a;", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", "f", "Lio/reactivex/subjects/a;", "orderUrlSubject", "Lco/bird/android/model/wire/WireInventoryPart;", "g", "partResultsSubject", "<init>", "(LXl3;Lcom/uber/autodispose/ScopeProvider;Le13;Lx92;LL82;)V", "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInventoryPartSelectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryPartSelectionPresenter.kt\nco/bird/android/feature/operatorinventory/presenter/InventoryPartSelectionPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,134:1\n199#2:135\n180#2:136\n180#2:137\n180#2:138\n180#2:139\n180#2:140\n180#2:141\n180#2:142\n180#2:143\n*S KotlinDebug\n*F\n+ 1 InventoryPartSelectionPresenter.kt\nco/bird/android/feature/operatorinventory/presenter/InventoryPartSelectionPresenter\n*L\n39#1:135\n44#1:136\n57#1:137\n67#1:138\n77#1:139\n97#1:140\n103#1:141\n109#1:142\n116#1:143\n*E\n"})
/* renamed from: v92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50257v92 {

    /* renamed from: a */
    public final InterfaceC37097Xl3 f113607a;

    /* renamed from: b */
    public final ScopeProvider f113608b;

    /* renamed from: c */
    public final InterfaceC40099e13 f113609c;

    /* renamed from: d */
    public final C51443x92 f113610d;

    /* renamed from: e */
    public final L82 f113611e;

    /* renamed from: f */
    public final C24552a<Optional<String>> f113612f;

    /* renamed from: g */
    public final C24552a<List<WireInventoryPart>> f113613g;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: v92$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29426a extends FunctionReferenceImpl implements Function1<List<? extends WireInventoryPart>, Unit> {
        public C29426a(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireInventoryPart> list) {
            invoke2((List<WireInventoryPart>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireInventoryPart> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: v92$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29427b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C29427b(Object obj) {
            super(1, obj, C50257v92.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C50257v92) this.receiver).m9119F(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireInventoryPart;", "kotlin.jvm.PlatformType", "part", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireInventoryPart;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: v92$c */
    /* loaded from: classes3.dex */
    public static final class C29428c extends Lambda implements Function1<WireInventoryPart, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WirePartCategory f113615h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29428c(WirePartCategory wirePartCategory) {
            super(1);
            this.f113615h = wirePartCategory;
        }

        /* renamed from: a */
        public final void m9077a(WireInventoryPart wireInventoryPart) {
            C50257v92.this.f113609c.mo36977n2(this.f113615h.getName(), wireInventoryPart.getSku());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireInventoryPart wireInventoryPart) {
            m9077a(wireInventoryPart);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/InventoryStatusResponse;", "it", "", "Lco/bird/api/response/WireInventory;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/InventoryStatusResponse;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: v92$d */
    /* loaded from: classes3.dex */
    public static final class C29429d extends Lambda implements Function1<InventoryStatusResponse, List<? extends WireInventory>> {

        /* renamed from: g */
        public final /* synthetic */ HealthStatus f113616g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29429d(HealthStatus healthStatus) {
            super(1);
            this.f113616g = healthStatus;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireInventory> invoke(InventoryStatusResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C47968rI1.m16112a(this.f113616g, it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "inventory", "", "Lco/bird/api/response/WireInventory;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nInventoryPartSelectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryPartSelectionPresenter.kt\nco/bird/android/feature/operatorinventory/presenter/InventoryPartSelectionPresenter$onCreateWithHealthStatus$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n1549#2:135\n1620#2,3:136\n288#2,2:139\n*S KotlinDebug\n*F\n+ 1 InventoryPartSelectionPresenter.kt\nco/bird/android/feature/operatorinventory/presenter/InventoryPartSelectionPresenter$onCreateWithHealthStatus$2\n*L\n59#1:135\n59#1:136,3\n61#1:139,2\n*E\n"})
    /* renamed from: v92$e */
    /* loaded from: classes3.dex */
    public static final class C29430e extends Lambda implements Function1<List<? extends WireInventory>, Unit> {
        public C29430e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireInventory> list) {
            invoke2((List<WireInventory>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireInventory> inventory) {
            int collectionSizeOrDefault;
            Object obj;
            boolean z;
            C24552a c24552a = C50257v92.this.f113613g;
            Intrinsics.checkNotNullExpressionValue(inventory, "inventory");
            List<WireInventory> list = inventory;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireInventory wireInventory : list) {
                arrayList.add(WireInventoryKt.toPart(wireInventory));
            }
            c24552a.onNext(arrayList);
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((WireInventory) obj).getShopifyLink() != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            WireInventory wireInventory2 = (WireInventory) obj;
            C50257v92.this.f113612f.onNext(Optional.f63040c.m59033b(wireInventory2 != null ? wireInventory2.getShopifyLink() : null));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: v92$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29431f extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C29431f(Object obj) {
            super(1, obj, C50257v92.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C50257v92) this.receiver).m9119F(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireInventoryPart;", "kotlin.jvm.PlatformType", "part", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireInventoryPart;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: v92$g */
    /* loaded from: classes3.dex */
    public static final class C29432g extends Lambda implements Function1<WireInventoryPart, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f113619h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29432g(String str) {
            super(1);
            this.f113619h = str;
        }

        /* renamed from: a */
        public final void m9075a(WireInventoryPart wireInventoryPart) {
            C50257v92.this.f113609c.mo36977n2(this.f113619h, wireInventoryPart.getSku());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireInventoryPart wireInventoryPart) {
            m9075a(wireInventoryPart);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: v92$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29433h extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C29433h(Object obj) {
            super(1, obj, C50257v92.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C50257v92) this.receiver).m9119F(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "orderUrlOptional", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: v92$i */
    /* loaded from: classes3.dex */
    public static final class C29434i extends Lambda implements Function1<Optional<String>, Unit> {
        public C29434i() {
            super(1);
        }

        /* renamed from: a */
        public final void m9074a(Optional<String> optional) {
            C50257v92.this.f113610d.m5771bm(optional.m59037c());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<String> optional) {
            m9074a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: v92$j */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29435j extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C29435j(Object obj) {
            super(1, obj, C50257v92.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C50257v92) this.receiver).m9119F(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*$\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: v92$k */
    /* loaded from: classes3.dex */
    public static final class C29436k extends Lambda implements Function1<Pair<? extends Unit, ? extends Optional<String>>, Unit> {
        public C29436k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends Optional<String>> pair) {
            invoke2((Pair<Unit, Optional<String>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, Optional<String>> pair) {
            Optional<String> component2 = pair.component2();
            if (component2.m59037c()) {
                InterfaceC40099e13.C19924a.goToWebView$default(C50257v92.this.f113609c, component2.m59038b(), null, null, false, 14, null);
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: v92$l */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29437l extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C29437l(Object obj) {
            super(1, obj, C50257v92.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C50257v92) this.receiver).m9119F(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireInventoryPart;", "it", "Lio/reactivex/K;", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: v92$m */
    /* loaded from: classes3.dex */
    public static final class C29438m extends Lambda implements Function1<List<? extends WireInventoryPart>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C29438m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(List<WireInventoryPart> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C50257v92.this.f113611e.m97670b(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: v92$n */
    /* loaded from: classes3.dex */
    public static final class C29439n extends Lambda implements Function1<List<? extends C3023H6>, Unit> {
        public C29439n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> it) {
            C51443x92 c51443x92 = C50257v92.this.f113610d;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c51443x92.m5772b(it);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: v92$o */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29440o extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C29440o(Object obj) {
            super(1, obj, C50257v92.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C50257v92) this.receiver).m9119F(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: v92$p */
    /* loaded from: classes3.dex */
    public static final class C29441p extends Lambda implements Function1<String, String> {

        /* renamed from: g */
        public static final C29441p f113624g = new C29441p();

        public C29441p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String it) {
            CharSequence trim;
            Intrinsics.checkNotNullParameter(it, "it");
            trim = StringsKt__StringsKt.trim((CharSequence) it);
            return trim.toString();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a>\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0003*\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00010\u00012.\u0010\u0006\u001a*\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u0001H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/wire/WireInventoryPart;", "<name for destructuring parameter 0>", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nInventoryPartSelectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryPartSelectionPresenter.kt\nco/bird/android/feature/operatorinventory/presenter/InventoryPartSelectionPresenter$onResume$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n766#2:135\n857#2,2:136\n*S KotlinDebug\n*F\n+ 1 InventoryPartSelectionPresenter.kt\nco/bird/android/feature/operatorinventory/presenter/InventoryPartSelectionPresenter$onResume$5\n*L\n87#1:135\n87#1:136,2\n*E\n"})
    /* renamed from: v92$q */
    /* loaded from: classes3.dex */
    public static final class C29442q extends Lambda implements Function1<Pair<? extends String, ? extends List<? extends WireInventoryPart>>, Pair<? extends String, ? extends List<? extends WireInventoryPart>>> {

        /* renamed from: g */
        public static final C29442q f113625g = new C29442q();

        public C29442q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Pair<? extends String, ? extends List<? extends WireInventoryPart>> invoke(Pair<? extends String, ? extends List<? extends WireInventoryPart>> pair) {
            return invoke2((Pair<String, ? extends List<WireInventoryPart>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Pair<String, List<WireInventoryPart>> invoke2(Pair<String, ? extends List<WireInventoryPart>> pair) {
            boolean contains;
            boolean contains2;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String query = pair.component1();
            List<WireInventoryPart> results = pair.component2();
            Intrinsics.checkNotNullExpressionValue(results, "results");
            ArrayList arrayList = new ArrayList();
            for (Object obj : results) {
                WireInventoryPart wireInventoryPart = (WireInventoryPart) obj;
                String name = wireInventoryPart.getName();
                Intrinsics.checkNotNullExpressionValue(query, "query");
                boolean z = true;
                contains = StringsKt__StringsKt.contains((CharSequence) name, (CharSequence) query, true);
                if (!contains) {
                    contains2 = StringsKt__StringsKt.contains((CharSequence) wireInventoryPart.getSku(), (CharSequence) query, true);
                    if (!contains2) {
                        z = false;
                    }
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            return new Pair<>(query, arrayList);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001aª\u0001\u0012N\b\u0001\u0012J\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0003 \u0002*$\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0003\u0018\u00010\u00070\u0007 \u0002*T\u0012N\b\u0001\u0012J\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0003 \u0002*$\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0003\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062 \u0010\u0005\u001a\u001c\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/wire/WireInventoryPart;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lkotlin/Triple;", "", "LH6;", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: v92$r */
    /* loaded from: classes3.dex */
    public static final class C29443r extends Lambda implements Function1<Pair<? extends String, ? extends List<? extends WireInventoryPart>>, InterfaceC23447K<? extends Triple<? extends String, ? extends Integer, ? extends List<? extends C3023H6>>>> {

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0007\u001aJ\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0005*$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "LH6;", "it", "Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: v92$r$a */
        /* loaded from: classes3.dex */
        public static final class C29444a extends Lambda implements Function1<List<? extends C3023H6>, Triple<? extends String, ? extends Integer, ? extends List<? extends C3023H6>>> {

            /* renamed from: g */
            public final /* synthetic */ String f113627g;

            /* renamed from: h */
            public final /* synthetic */ List<WireInventoryPart> f113628h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29444a(String str, List<WireInventoryPart> list) {
                super(1);
                this.f113627g = str;
                this.f113628h = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Triple<String, Integer, List<C3023H6>> invoke(List<C3023H6> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Triple<>(this.f113627g, Integer.valueOf(this.f113628h.size()), it);
            }
        }

        public C29443r() {
            super(1);
        }

        /* renamed from: c */
        public static final Triple m9070c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Triple<String, Integer, List<C3023H6>>> invoke(Pair<String, ? extends List<WireInventoryPart>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<WireInventoryPart> component2 = pair.component2();
            AbstractC23442F<List<C3023H6>> m97670b = C50257v92.this.f113611e.m97670b(component2);
            final C29444a c29444a = new C29444a(pair.component1(), component2);
            return m97670b.m33157I(new InterfaceC23492o() { // from class: w92
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Triple m9070c;
                    m9070c = C50257v92.C29443r.m9070c(Function1.this, obj);
                    return m9070c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072N\u0010\u0006\u001aJ\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0002*$\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "", "", "LH6;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: v92$s */
    /* loaded from: classes3.dex */
    public static final class C29445s extends Lambda implements Function1<Triple<? extends String, ? extends Integer, ? extends List<? extends C3023H6>>, Unit> {
        public C29445s() {
            super(1);
        }

        /* renamed from: a */
        public final void m9068a(Triple<String, Integer, ? extends List<C3023H6>> triple) {
            String query = triple.component1();
            int intValue = triple.component2().intValue();
            List<C3023H6> sections = triple.component3();
            C50257v92 c50257v92 = C50257v92.this;
            Intrinsics.checkNotNullExpressionValue(query, "query");
            Intrinsics.checkNotNullExpressionValue(sections, "sections");
            c50257v92.m9082v(query, intValue, sections);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends String, ? extends Integer, ? extends List<? extends C3023H6>> triple) {
            m9068a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: v92$t */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29446t extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C29446t(Object obj) {
            super(1, obj, C50257v92.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C50257v92) this.receiver).m9119F(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", "part", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WirePart;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: v92$u */
    /* loaded from: classes3.dex */
    public static final class C29447u extends Lambda implements Function1<WirePart, Unit> {
        public C29447u() {
            super(1);
        }

        /* renamed from: a */
        public final void m9067a(WirePart wirePart) {
            InterfaceC40099e13.C19924a.goToInventoryPartDetails$default(C50257v92.this.f113609c, null, wirePart.getKey(), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WirePart wirePart) {
            m9067a(wirePart);
            return Unit.INSTANCE;
        }
    }

    public C50257v92(InterfaceC37097Xl3 inventoryManager, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, C51443x92 partUi, L82 partConverter) {
        Intrinsics.checkNotNullParameter(inventoryManager, "inventoryManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(partUi, "partUi");
        Intrinsics.checkNotNullParameter(partConverter, "partConverter");
        this.f113607a = inventoryManager;
        this.f113608b = scopeProvider;
        this.f113609c = navigator;
        this.f113610d = partUi;
        this.f113611e = partConverter;
        C24552a<Optional<String>> m31921g = C24552a.m31921g(Optional.f63040c.m59034a());
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault<Optional<String>>(Optional.absent())");
        this.f113612f = m31921g;
        C24552a<List<WireInventoryPart>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<List<WireInventoryPart>>()");
        this.f113613g = m31922e;
    }

    /* renamed from: B */
    public static final List m9123B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m9122C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m9121D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m9120E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final String m9117H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final Pair m9116I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final InterfaceC23447K m9115J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m9114K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m9113L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m9112M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m9111N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m9110O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m9109P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m9108Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m9107R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final InterfaceC23447K m9106S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m9105T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m9104U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m9080x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m9079y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m9078z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final void m9124A(HealthStatus healthStatus) {
        Intrinsics.checkNotNullParameter(healthStatus, "healthStatus");
        String m5779Ul = this.f113610d.m5779Ul(C47968rI1.m16111b(healthStatus));
        this.f113610d.m5775Yl(healthStatus);
        this.f113610d.m5774Zl(m5779Ul);
        Observable<InventoryStatusResponse> mo40844g = this.f113607a.mo40844g();
        final C29429d c29429d = new C29429d(healthStatus);
        Observable<R> map = mo40844g.map(new InterfaceC23492o() { // from class: i92
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m9123B;
                m9123B = C50257v92.m9123B(Function1.this, obj);
                return m9123B;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "healthStatus: HealthStat…lthStatus.inventory(it) }");
        Object m33094as = map.m33094as(AutoDispose.m45239a(this.f113608b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29430e c29430e = new C29430e();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: j92
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50257v92.m9122C(Function1.this, obj);
            }
        };
        final C29431f c29431f = new C29431f(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: k92
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50257v92.m9121D(Function1.this, obj);
            }
        });
        Observable<WireInventoryPart> observeOn = this.f113610d.m5777Wl().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "partUi.partClicks()\n    …dSchedulers.mainThread())");
        Object m33094as2 = observeOn.m33094as(AutoDispose.m45239a(this.f113608b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29432g c29432g = new C29432g(m5779Ul);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: m92
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50257v92.m9120E(Function1.this, obj);
            }
        });
    }

    /* renamed from: F */
    public final void m9119F(Throwable th) {
        this.f113610d.error(th);
        C41318g46.m40159e(th);
    }

    /* renamed from: G */
    public final void m9118G() {
        C24552a<List<WireInventoryPart>> c24552a = this.f113613g;
        final C29438m c29438m = new C29438m();
        Observable observeOn = c24552a.flatMapSingle(new InterfaceC23492o() { // from class: a92
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m9106S;
                m9106S = C50257v92.m9106S(Function1.this, obj);
                return m9106S;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "fun onResume() {\n    par…}\n      }, ::onError)\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f113608b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29439n c29439n = new C29439n();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: q92
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50257v92.m9105T(Function1.this, obj);
            }
        };
        final C29440o c29440o = new C29440o(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: r92
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50257v92.m9104U(Function1.this, obj);
            }
        });
        Observable<String> m5776Xl = this.f113610d.m5776Xl();
        final C29441p c29441p = C29441p.f113624g;
        Observable distinctUntilChanged = m5776Xl.map(new InterfaceC23492o() { // from class: s92
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m9117H;
                m9117H = C50257v92.m9117H(Function1.this, obj);
                return m9117H;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "partUi.searchTextChanges…  .distinctUntilChanged()");
        Observable m31950a = C24527f.m31950a(distinctUntilChanged, this.f113613g);
        final C29442q c29442q = C29442q.f113625g;
        Observable map = m31950a.map(new InterfaceC23492o() { // from class: t92
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m9116I;
                m9116I = C50257v92.m9116I(Function1.this, obj);
                return m9116I;
            }
        });
        final C29443r c29443r = new C29443r();
        Observable observeOn2 = map.flatMapSingle(new InterfaceC23492o() { // from class: u92
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m9115J;
                m9115J = C50257v92.m9115J(Function1.this, obj);
                return m9115J;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "fun onResume() {\n    par…}\n      }, ::onError)\n  }");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f113608b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29445s c29445s = new C29445s();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: b92
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50257v92.m9114K(Function1.this, obj);
            }
        };
        final C29446t c29446t = new C29446t(this);
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: c92
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50257v92.m9113L(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f113610d.m8924Ql().m33094as(AutoDispose.m45239a(this.f113608b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29447u c29447u = new C29447u();
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: d92
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50257v92.m9112M(Function1.this, obj);
            }
        };
        final C29433h c29433h = new C29433h(this);
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: e92
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50257v92.m9111N(Function1.this, obj);
            }
        });
        Object m33094as4 = this.f113612f.m33094as(AutoDispose.m45239a(this.f113608b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29434i c29434i = new C29434i();
        InterfaceC23484g interfaceC23484g4 = new InterfaceC23484g() { // from class: l92
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50257v92.m9110O(Function1.this, obj);
            }
        };
        final C29435j c29435j = new C29435j(this);
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g4, new InterfaceC23484g() { // from class: n92
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50257v92.m9109P(Function1.this, obj);
            }
        });
        Object m33094as5 = C24527f.m31950a(this.f113610d.m5778Vl(), this.f113612f).m33094as(AutoDispose.m45239a(this.f113608b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29436k c29436k = new C29436k();
        InterfaceC23484g interfaceC23484g5 = new InterfaceC23484g() { // from class: o92
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50257v92.m9108Q(Function1.this, obj);
            }
        };
        final C29437l c29437l = new C29437l(this);
        ((ObservableSubscribeProxy) m33094as5).subscribe(interfaceC23484g5, new InterfaceC23484g() { // from class: p92
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50257v92.m9107R(Function1.this, obj);
            }
        });
    }

    /* renamed from: v */
    public final void m9082v(String str, int i, List<C3023H6> list) {
        boolean z;
        C51443x92 c51443x92 = this.f113610d;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        c51443x92.m5773am(str, z);
        this.f113610d.m5772b(list);
    }

    /* renamed from: w */
    public final void m9081w(WirePartCategory category) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.f113610d.m5774Zl(category.getName());
        AbstractC23442F<List<WireInventoryPart>> m33146T = this.f113607a.mo40845f(category.getId()).m33146T(3L);
        Intrinsics.checkNotNullExpressionValue(m33146T, "inventoryManager.fetchPa…egory.id)\n      .retry(3)");
        Object m33135e = m33146T.m33135e(AutoDispose.m45239a(this.f113608b));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29426a c29426a = new C29426a(this.f113613g);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: f92
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50257v92.m9080x(Function1.this, obj);
            }
        };
        final C29427b c29427b = new C29427b(this);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: g92
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50257v92.m9079y(Function1.this, obj);
            }
        });
        Observable<WireInventoryPart> observeOn = this.f113610d.m5777Wl().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "partUi.partClicks()\n    …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f113608b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29428c c29428c = new C29428c(category);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: h92
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50257v92.m9078z(Function1.this, obj);
            }
        });
    }
}
