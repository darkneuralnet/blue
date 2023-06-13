package p000;

import co.bird.android.model.persistence.OperatorFilter;
import co.bird.android.model.persistence.WarehouseMarker;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.InterfaceC46545ot5;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"Laz6;", "LYy6;", "", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "Lio/reactivex/c;", C17296a.f69688o, "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/WarehouseMarker;", "b", "Lot5;", "Lot5;", "serverDrivenFilterManager", "Lcz6;", "Lcz6;", "repo", "<init>", "(Lot5;Lcz6;)V", "warehouse-marker_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: az6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38287az6 implements InterfaceC37451Yy6 {

    /* renamed from: a */
    public final InterfaceC46545ot5 f56747a;

    /* renamed from: b */
    public final InterfaceC39491cz6 f56748b;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/OperatorFilter;", "filters", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: az6$a */
    /* loaded from: classes4.dex */
    public static final class C12258a extends Lambda implements Function1<List<? extends OperatorFilter>, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ List<Geolocation> f56750h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12258a(List<Geolocation> list) {
            super(1);
            this.f56750h = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(List<? extends OperatorFilter> filters) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            return C38287az6.this.f56748b.mo37247H1(this.f56750h, C52473yt5.m2323c(filters));
        }
    }

    public C38287az6(InterfaceC46545ot5 serverDrivenFilterManager, InterfaceC39491cz6 repo) {
        Intrinsics.checkNotNullParameter(serverDrivenFilterManager, "serverDrivenFilterManager");
        Intrinsics.checkNotNullParameter(repo, "repo");
        this.f56747a = serverDrivenFilterManager;
        this.f56748b = repo;
    }

    /* renamed from: d */
    public static final InterfaceC23496h m65163d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC37451Yy6
    /* renamed from: a */
    public AbstractC23461c mo65166a(List<Geolocation> viewport) {
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        AbstractC23442F firstOrError = InterfaceC46545ot5.C27099a.streamOperatorFilters$default(this.f56747a, false, 1, null).firstOrError();
        final C12258a c12258a = new C12258a(viewport);
        AbstractC23461c m33063X = firstOrError.m33164B(new InterfaceC23492o() { // from class: Zy6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m65163d;
                m65163d = C38287az6.m65163d(Function1.this, obj);
                return m65163d;
            }
        }).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "override fun fetchWareho…beOn(Schedulers.io())\n  }");
        return m33063X;
    }

    @Override // p000.InterfaceC37451Yy6
    /* renamed from: b */
    public Observable<List<WarehouseMarker>> mo65165b() {
        Observable<List<WarehouseMarker>> subscribeOn = this.f56748b.mo37243p1().subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "repo.streamWarehouseMark…scribeOn(Schedulers.io())");
        return subscribeOn;
    }
}
