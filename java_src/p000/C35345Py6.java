package p000;

import co.bird.android.model.persistence.WarehouseFlightSheetDetails;
import co.bird.android.model.wire.WireWarehouseFlightSheetDetails;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.InterfaceC34877Ny6;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LPy6;", "LNy6;", "", "warehouseId", "Lio/reactivex/c;", "H0", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;", "T", "clear", "LTk3;", C17296a.f69688o, "LTk3;", "operatorClient", "LKy6;", "b", "LKy6;", "warehouseFlightSheetDao", "<init>", "(LTk3;LKy6;)V", "co.bird.android.repository.warehouse-flight-sheet"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Py6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35345Py6 implements InterfaceC34877Ny6 {

    /* renamed from: a */
    public final InterfaceC36152Tk3 f29499a;

    /* renamed from: b */
    public final AbstractC34175Ky6 f29500b;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireWarehouseFlightSheetDetails;", "details", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireWarehouseFlightSheetDetails;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Py6$a */
    /* loaded from: classes4.dex */
    public static final class C6602a extends Lambda implements Function1<WireWarehouseFlightSheetDetails, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ String f29502h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6602a(String str) {
            super(1);
            this.f29502h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(WireWarehouseFlightSheetDetails details) {
            Intrinsics.checkNotNullParameter(details, "details");
            C35345Py6 c35345Py6 = C35345Py6.this;
            AbstractC23461c m33063X = c35345Py6.f29500b.mo96051b(C33473Hy6.m103141a(details, this.f29502h)).m33063X(C24542a.m31932c());
            Intrinsics.checkNotNullExpressionValue(m33063X, "warehouseFlightSheetDao.…scribeOn(Schedulers.io())");
            return c35345Py6.m89208K1(m33063X);
        }
    }

    public C35345Py6(InterfaceC36152Tk3 operatorClient, AbstractC34175Ky6 warehouseFlightSheetDao) {
        Intrinsics.checkNotNullParameter(operatorClient, "operatorClient");
        Intrinsics.checkNotNullParameter(warehouseFlightSheetDao, "warehouseFlightSheetDao");
        this.f29499a = operatorClient;
        this.f29500b = warehouseFlightSheetDao;
    }

    /* renamed from: L1 */
    public static final InterfaceC23496h m89207L1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC34877Ny6
    /* renamed from: H0 */
    public AbstractC23461c mo89210H0(String warehouseId) {
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        AbstractC23442F<WireWarehouseFlightSheetDetails> m83037f = this.f29499a.m83037f(warehouseId);
        final C6602a c6602a = new C6602a(warehouseId);
        AbstractC23461c m33164B = m83037f.m33164B(new InterfaceC23492o() { // from class: Oy6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m89207L1;
                m89207L1 = C35345Py6.m89207L1(Function1.this, obj);
                return m89207L1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchWareho…learOnError()\n      }\n  }");
        return m33164B;
    }

    /* renamed from: K1 */
    public AbstractC23461c m89208K1(AbstractC23461c abstractC23461c) {
        return InterfaceC34877Ny6.C5786a.m93070a(this, abstractC23461c);
    }

    @Override // p000.InterfaceC34877Ny6
    /* renamed from: T */
    public Observable<WarehouseFlightSheetDetails> mo89206T(String warehouseId) {
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        return this.f29500b.mo96050c(warehouseId);
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        return this.f29500b.mo96052a();
    }
}
