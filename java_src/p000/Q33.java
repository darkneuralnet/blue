package p000;

import co.bird.android.model.persistence.NestFlightSheetDetails;
import co.bird.android.model.wire.WireNestFlightSheetDetails;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.O33;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LQ33;", "LO33;", "", "nestId", "Lio/reactivex/c;", "G0", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/NestFlightSheetDetails;", "S", "clear", "LTk3;", C17296a.f69688o, "LTk3;", "operatorClient", "LJ33;", "b", "LJ33;", "nestFlightSheetDao", "<init>", "(LTk3;LJ33;)V", "co.bird.android.repository.nest-flight-sheet"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Q33 */
/* loaded from: classes4.dex */
public final class Q33 implements O33 {

    /* renamed from: a */
    public final InterfaceC36152Tk3 f29752a;

    /* renamed from: b */
    public final J33 f29753b;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireNestFlightSheetDetails;", "details", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireNestFlightSheetDetails;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Q33$a */
    /* loaded from: classes4.dex */
    public static final class C6668a extends Lambda implements Function1<WireNestFlightSheetDetails, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ String f29755h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6668a(String str) {
            super(1);
            this.f29755h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(WireNestFlightSheetDetails details) {
            Intrinsics.checkNotNullParameter(details, "details");
            return Q33.this.f29753b.mo99298b(F33.m108050a(details, this.f29755h));
        }
    }

    public Q33(InterfaceC36152Tk3 operatorClient, J33 nestFlightSheetDao) {
        Intrinsics.checkNotNullParameter(operatorClient, "operatorClient");
        Intrinsics.checkNotNullParameter(nestFlightSheetDao, "nestFlightSheetDao");
        this.f29752a = operatorClient;
        this.f29753b = nestFlightSheetDao;
    }

    /* renamed from: M1 */
    public static final InterfaceC23496h m88993M1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.O33
    /* renamed from: G0 */
    public AbstractC23461c mo88997G0(String nestId) {
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        AbstractC23442F<WireNestFlightSheetDetails> m83043A = this.f29752a.m83043A(nestId);
        final C6668a c6668a = new C6668a(nestId);
        AbstractC23461c m33164B = m83043A.m33164B(new InterfaceC23492o() { // from class: P33
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m88993M1;
                m88993M1 = Q33.m88993M1(Function1.this, obj);
                return m88993M1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchNestFl…      .clearOnError()\n  }");
        return m88995K1(m33164B);
    }

    /* renamed from: K1 */
    public AbstractC23461c m88995K1(AbstractC23461c abstractC23461c) {
        return O33.C5819a.m92963a(this, abstractC23461c);
    }

    /* renamed from: L1 */
    public <T> Observable<T> m88994L1(Observable<T> observable) {
        return O33.C5819a.m92962b(this, observable);
    }

    @Override // p000.O33
    /* renamed from: S */
    public Observable<NestFlightSheetDetails> mo88992S(String nestId) {
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        return m88994L1(this.f29753b.mo99297c(nestId));
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        return this.f29753b.mo99299a();
    }
}
