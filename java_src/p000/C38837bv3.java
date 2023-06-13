package p000;

import co.bird.android.model.persistence.OperatorTaskBanner;
import co.bird.android.model.persistence.OperatorTaskGroup;
import co.bird.android.model.wire.WireOperatorTaskBanner;
import co.bird.android.model.wire.WireOperatorTaskGroup;
import co.bird.api.response.OperatorTaskResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC37646Zu3;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"Lbv3;", "LZu3;", "Lio/reactivex/c;", "j1", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/OperatorTaskBanner;", "L", "Lco/bird/android/model/persistence/OperatorTaskGroup;", "w1", "", "title", "J0", "clear", "LTk3;", C17296a.f69688o, "LTk3;", "operatorClient", "Lww3;", "b", "Lww3;", "operatorTaskV2Dao", "<init>", "(LTk3;Lww3;)V", "co.bird.android.repository.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bv3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38837bv3 implements InterfaceC37646Zu3 {

    /* renamed from: a */
    public final InterfaceC36152Tk3 f59787a;

    /* renamed from: b */
    public final AbstractC51315ww3 f59788b;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/OperatorTaskResponse;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/OperatorTaskResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorTaskGroupRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskGroupRepositoryImpl.kt\nco/bird/android/repository/operatortaskv2/OperatorTaskGroupRepositoryImpl$fetchOperatorTaskGroups$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n1#2:54\n1549#3:55\n1620#3,3:56\n*S KotlinDebug\n*F\n+ 1 OperatorTaskGroupRepositoryImpl.kt\nco/bird/android/repository/operatortaskv2/OperatorTaskGroupRepositoryImpl$fetchOperatorTaskGroups$1\n*L\n26#1:55\n26#1:56,3\n*E\n"})
    /* renamed from: bv3$a */
    /* loaded from: classes4.dex */
    public static final class C13340a extends Lambda implements Function1<OperatorTaskResponse, InterfaceC23496h> {
        public C13340a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(OperatorTaskResponse it) {
            AbstractC23461c abstractC23461c;
            int collectionSizeOrDefault;
            List listOfNotNull;
            OperatorTaskBanner m82273a;
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23461c[] abstractC23461cArr = new AbstractC23461c[4];
            abstractC23461cArr[0] = C38837bv3.this.f59788b.mo4439a();
            abstractC23461cArr[1] = C38837bv3.this.f59788b.mo4438b();
            WireOperatorTaskBanner banner = it.getBanner();
            if (banner != null && (m82273a = C36242Tu3.m82273a(banner)) != null) {
                abstractC23461c = C38837bv3.this.f59788b.mo4437c(m82273a);
            } else {
                abstractC23461c = null;
            }
            abstractC23461cArr[2] = abstractC23461c;
            AbstractC51315ww3 abstractC51315ww3 = C38837bv3.this.f59788b;
            List<WireOperatorTaskGroup> taskGroups = it.getTaskGroups();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(taskGroups, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireOperatorTaskGroup wireOperatorTaskGroup : taskGroups) {
                arrayList.add(C37412Yu3.m74019a(wireOperatorTaskGroup));
            }
            abstractC23461cArr[3] = abstractC51315ww3.mo4436d(arrayList);
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) abstractC23461cArr);
            return AbstractC23461c.m33037r(listOfNotNull);
        }
    }

    public C38837bv3(InterfaceC36152Tk3 operatorClient, AbstractC51315ww3 operatorTaskV2Dao) {
        Intrinsics.checkNotNullParameter(operatorClient, "operatorClient");
        Intrinsics.checkNotNullParameter(operatorTaskV2Dao, "operatorTaskV2Dao");
        this.f59787a = operatorClient;
        this.f59788b = operatorTaskV2Dao;
    }

    /* renamed from: L1 */
    public static final InterfaceC23496h m62137L1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC37646Zu3
    /* renamed from: J0 */
    public Observable<OperatorTaskGroup> mo62141J0(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return m62139K1(this.f59788b.mo4433g(title));
    }

    /* renamed from: K1 */
    public <T> Observable<T> m62139K1(Observable<T> observable) {
        return InterfaceC37646Zu3.C10429a.m72324a(this, observable);
    }

    @Override // p000.InterfaceC37646Zu3
    /* renamed from: L */
    public Observable<List<OperatorTaskBanner>> mo62138L() {
        return m62139K1(this.f59788b.mo4435e());
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        List listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{this.f59788b.mo4439a(), this.f59788b.mo4438b()});
        AbstractC23461c m33037r = AbstractC23461c.m33037r(listOf);
        Intrinsics.checkNotNullExpressionValue(m33037r, "concat(listOf(\n      ope…eratorTaskGroups()\n    ))");
        return m33037r;
    }

    @Override // p000.InterfaceC37646Zu3
    /* renamed from: j1 */
    public AbstractC23461c mo62136j1() {
        AbstractC23442F<OperatorTaskResponse> m83036g = this.f59787a.m83036g();
        final C13340a c13340a = new C13340a();
        AbstractC23461c m33164B = m83036g.m33164B(new InterfaceC23492o() { // from class: av3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m62137L1;
                m62137L1 = C38837bv3.m62137L1(Function1.this, obj);
                return m62137L1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchOperat…))\n        ))\n      }\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC37646Zu3
    /* renamed from: w1 */
    public Observable<List<OperatorTaskGroup>> mo62135w1() {
        return m62139K1(this.f59788b.mo4434f());
    }
}
