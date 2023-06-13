package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.WX2;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rRP\u0010\u0015\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 \u0012*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u0010 \u0012*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 \u0012*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u0010\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014RP\u0010\u0017\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 \u0012*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u0010 \u0012*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 \u0012*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u0010\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R&\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\t\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"LZX2;", "LWX2;", "Lio/reactivex/c;", "refresh", "", "birdId", "", "b", "Lq54;", C17296a.f69688o, "Lq54;", "privateBirdsManager", "LTq4;", "LTq4;", "config", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/Observable;", "enabledOwnedBirds", DateTokenConverter.CONVERTER_KEY, "enabledRentalBirds", "e", "()Lio/reactivex/Observable;", "privateBirds", "<init>", "(Lq54;LTq4;)V", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMyBirdsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyBirdsManagerImpl.kt\nco/bird/android/manager/ride/MyBirdsManagerImpl\n+ 2 Observables.kt\nio/reactivex/rxkotlin/Observables\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n22#2,2:48\n1#3:50\n*S KotlinDebug\n*F\n+ 1 MyBirdsManagerImpl.kt\nco/bird/android/manager/ride/MyBirdsManagerImpl\n*L\n35#1:48,2\n*E\n"})
/* renamed from: ZX2 */
/* loaded from: classes4.dex */
public final class ZX2 implements WX2 {

    /* renamed from: a */
    public final InterfaceC47256q54 f48716a;

    /* renamed from: b */
    public final C36207Tq4 f48717b;

    /* renamed from: c */
    public final Observable<List<WireBird>> f48718c;

    /* renamed from: d */
    public final Observable<List<WireBird>> f48719d;

    /* renamed from: e */
    public final Observable<List<WireBird>> f48720e;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireBird;", "birds", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMyBirdsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyBirdsManagerImpl.kt\nco/bird/android/manager/ride/MyBirdsManagerImpl$enabledOwnedBirds$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n766#2:48\n857#2,2:49\n*S KotlinDebug\n*F\n+ 1 MyBirdsManagerImpl.kt\nco/bird/android/manager/ride/MyBirdsManagerImpl$enabledOwnedBirds$1\n*L\n23#1:48\n23#1:49,2\n*E\n"})
    /* renamed from: ZX2$a */
    /* loaded from: classes4.dex */
    public static final class C10287a extends Lambda implements Function1<List<? extends WireBird>, List<? extends WireBird>> {
        public C10287a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireBird> invoke(List<WireBird> birds) {
            Intrinsics.checkNotNullParameter(birds, "birds");
            ZX2 zx2 = ZX2.this;
            ArrayList arrayList = new ArrayList();
            for (Object obj : birds) {
                if (C36441Uq4.m80769c(zx2.f48717b, (WireBird) obj).getPrivateBirdConfig().getEnableMyBirdScreenOwners()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireBird;", "birds", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMyBirdsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyBirdsManagerImpl.kt\nco/bird/android/manager/ride/MyBirdsManagerImpl$enabledRentalBirds$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n766#2:48\n857#2,2:49\n*S KotlinDebug\n*F\n+ 1 MyBirdsManagerImpl.kt\nco/bird/android/manager/ride/MyBirdsManagerImpl$enabledRentalBirds$1\n*L\n30#1:48\n30#1:49,2\n*E\n"})
    /* renamed from: ZX2$b */
    /* loaded from: classes4.dex */
    public static final class C10288b extends Lambda implements Function1<List<? extends WireBird>, List<? extends WireBird>> {
        public C10288b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireBird> invoke(List<WireBird> birds) {
            Intrinsics.checkNotNullParameter(birds, "birds");
            ZX2 zx2 = ZX2.this;
            ArrayList arrayList = new ArrayList();
            for (Object obj : birds) {
                if (C36441Uq4.m80769c(zx2.f48717b, (WireBird) obj).getPrivateBirdConfig().getEnableMyBirdScreenRenters()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$1\n+ 2 MyBirdsManagerImpl.kt\nco/bird/android/manager/ride/MyBirdsManagerImpl\n*L\n1#1,304:1\n39#2:305\n*E\n"})
    /* renamed from: ZX2$c */
    /* loaded from: classes4.dex */
    public static final class C10289c<T1, T2, R> implements InterfaceC23480c<T1, T2, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(T1 t1, T2 t2) {
            List plus;
            plus = CollectionsKt___CollectionsKt.plus((Collection) ((List) t1), (Iterable) ((List) t2));
            return (R) plus;
        }
    }

    public ZX2(InterfaceC47256q54 privateBirdsManager, C36207Tq4 config) {
        Intrinsics.checkNotNullParameter(privateBirdsManager, "privateBirdsManager");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f48716a = privateBirdsManager;
        this.f48717b = config;
        Z84<List<WireBird>> mo18205i = privateBirdsManager.mo18205i();
        final C10287a c10287a = new C10287a();
        Observable enabledOwnedBirds = mo18205i.map(new InterfaceC23492o() { // from class: XX2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m72982e;
                m72982e = ZX2.m72982e(Function1.this, obj);
                return m72982e;
            }
        });
        this.f48718c = enabledOwnedBirds;
        Z84<List<WireBird>> mo18211c = privateBirdsManager.mo18211c();
        final C10288b c10288b = new C10288b();
        Observable enabledRentalBirds = mo18211c.map(new InterfaceC23492o() { // from class: YX2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m72981f;
                m72981f = ZX2.m72981f(Function1.this, obj);
                return m72981f;
            }
        });
        this.f48719d = enabledRentalBirds;
        C24523e c24523e = C24523e.f91168a;
        Intrinsics.checkNotNullExpressionValue(enabledOwnedBirds, "enabledOwnedBirds");
        Intrinsics.checkNotNullExpressionValue(enabledRentalBirds, "enabledRentalBirds");
        Observable<List<WireBird>> combineLatest = Observable.combineLatest(enabledOwnedBirds, enabledRentalBirds, new C10289c());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        this.f48720e = combineLatest;
    }

    /* renamed from: e */
    public static final List m72982e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final List m72981f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    @Override // p000.WX2
    /* renamed from: a */
    public Observable<List<WireBird>> mo72986a() {
        return this.f48720e;
    }

    @Override // p000.WX2
    /* renamed from: b */
    public boolean mo72985b(String birdId) {
        Object obj;
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        List<WireBird> blockingFirst = mo72986a().blockingFirst();
        Intrinsics.checkNotNullExpressionValue(blockingFirst, "privateBirds.blockingFirst()");
        Iterator<T> it = blockingFirst.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((WireBird) obj).getId(), birdId)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    @Override // p000.WX2
    public boolean isEmpty() {
        return WX2.C9078a.m78249c(this);
    }

    @Override // p000.WX2
    public AbstractC23461c refresh() {
        return this.f48716a.refresh();
    }
}
