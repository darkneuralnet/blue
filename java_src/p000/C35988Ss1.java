package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.FlightSheetContext;
import co.bird.android.model.persistence.FlightSheetDetails;
import co.bird.android.model.wire.WireFlightSheetDetails;
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
import p000.InterfaceC35520Qs1;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LSs1;", "LQs1;", "", "vehicleId", "Lco/bird/android/model/constant/FlightSheetContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lio/reactivex/c;", "n0", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/FlightSheetDetails;", "Y", "clear", "LTk3;", C17296a.f69688o, "LTk3;", "operatorClient", "LBs1;", "b", "LBs1;", "flightSheetDetailsDao", "<init>", "(LTk3;LBs1;)V", "co.bird.android.repository.flight-sheet"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ss1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35988Ss1 implements InterfaceC35520Qs1 {

    /* renamed from: a */
    public final InterfaceC36152Tk3 f34364a;

    /* renamed from: b */
    public final AbstractC32010Bs1 f34365b;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireFlightSheetDetails;", "wireFlightSheetDetails", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireFlightSheetDetails;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ss1$a */
    /* loaded from: classes4.dex */
    public static final class C7559a extends Lambda implements Function1<WireFlightSheetDetails, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ String f34366g;

        /* renamed from: h */
        public final /* synthetic */ FlightSheetContext f34367h;

        /* renamed from: i */
        public final /* synthetic */ C35988Ss1 f34368i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7559a(String str, FlightSheetContext flightSheetContext, C35988Ss1 c35988Ss1) {
            super(1);
            this.f34366g = str;
            this.f34367h = flightSheetContext;
            this.f34368i = c35988Ss1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(WireFlightSheetDetails wireFlightSheetDetails) {
            Intrinsics.checkNotNullParameter(wireFlightSheetDetails, "wireFlightSheetDetails");
            return this.f34368i.f34365b.mo111398c(C51866xs1.m4547a(wireFlightSheetDetails, this.f34366g, this.f34367h));
        }
    }

    public C35988Ss1(InterfaceC36152Tk3 operatorClient, AbstractC32010Bs1 flightSheetDetailsDao) {
        Intrinsics.checkNotNullParameter(operatorClient, "operatorClient");
        Intrinsics.checkNotNullParameter(flightSheetDetailsDao, "flightSheetDetailsDao");
        this.f34364a = operatorClient;
        this.f34365b = flightSheetDetailsDao;
    }

    /* renamed from: L1 */
    public static final InterfaceC23496h m84722L1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: K1 */
    public <T> Observable<T> m84723K1(Observable<T> observable) {
        return InterfaceC35520Qs1.C6920a.m87854a(this, observable);
    }

    @Override // p000.InterfaceC35520Qs1
    /* renamed from: Y */
    public Observable<FlightSheetDetails> mo84721Y(String vehicleId, FlightSheetContext context) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(context, "context");
        return m84723K1(this.f34365b.mo111399b(vehicleId, context.toString()));
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        return this.f34365b.mo111400a();
    }

    @Override // p000.InterfaceC35520Qs1
    /* renamed from: n0 */
    public AbstractC23461c mo84720n0(String vehicleId, FlightSheetContext context) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(context, "context");
        AbstractC23442F<WireFlightSheetDetails> m83022u = this.f34364a.m83022u(vehicleId, context.name());
        final C7559a c7559a = new C7559a(vehicleId, context, this);
        AbstractC23461c m33164B = m83022u.m33164B(new InterfaceC23492o() { // from class: Rs1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m84722L1;
                m84722L1 = C35988Ss1.m84722L1(Function1.this, obj);
                return m84722L1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchFlight…htSheetDetails)\n    }\n  }");
        return m33164B;
    }
}
