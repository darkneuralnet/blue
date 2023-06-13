package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.CurrentRental;
import co.bird.android.model.CurrentRentalResponse;
import co.bird.android.model.LongTermRentalMap;
import co.bird.android.model.RentalPlansResponse;
import co.bird.android.model.constant.RentalKind;
import co.bird.api.request.CancelLongTermRentalBody;
import co.bird.api.request.EndLongTermRentalBody;
import co.bird.api.request.ScheduleLongTermRentalBody;
import co.bird.api.response.CollectionResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'J4\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH'J8\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u000b0\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000e2\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'J\u001e\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000b0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u0016H'J\u001e\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000b0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u001aH'J\u001e\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000b0\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u001cH'¨\u0006\u001e"}, m28432d2 = {"Lxx4;", "", "", "targetLatitude", "targetLongitude", "radius", "Lio/reactivex/F;", "Lco/bird/android/model/LongTermRentalMap;", "f", "Lco/bird/android/model/constant/RentalKind;", "kind", "LHM4;", "Lco/bird/android/model/RentalPlansResponse;", "e", "", "offset", "limit", "", "active", "Lco/bird/api/response/CollectionResponse;", "Lco/bird/android/model/CurrentRental;", "c", "Lco/bird/api/request/ScheduleLongTermRentalBody;", "body", "Lco/bird/android/model/CurrentRentalResponse;", C17296a.f69688o, "Lco/bird/api/request/CancelLongTermRentalBody;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/api/request/EndLongTermRentalBody;", "b", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xx4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC51919xx4 {
    @AD3("long-term-rental")
    /* renamed from: a */
    AbstractC23442F<HM4<CurrentRentalResponse>> m4386a(@InterfaceC6404PY ScheduleLongTermRentalBody scheduleLongTermRentalBody);

    @AD3("long-term-rental/end")
    /* renamed from: b */
    AbstractC23442F<HM4<CurrentRentalResponse>> m4385b(@InterfaceC6404PY EndLongTermRentalBody endLongTermRentalBody);

    @NA1("long-term-rental/all")
    /* renamed from: c */
    AbstractC23442F<HM4<CollectionResponse<CurrentRental>>> m4384c(@InterfaceC37017Xc4("offset") int i, @InterfaceC37017Xc4("limit") int i2, @InterfaceC37017Xc4("active") boolean z);

    @AD3("long-term-rental/cancel")
    /* renamed from: d */
    AbstractC23442F<HM4<CurrentRentalResponse>> m4383d(@InterfaceC6404PY CancelLongTermRentalBody cancelLongTermRentalBody);

    @NA1("long-term-rental/availability")
    /* renamed from: e */
    AbstractC23442F<HM4<RentalPlansResponse>> m4382e(@InterfaceC37017Xc4("latitude") double d, @InterfaceC37017Xc4("longitude") double d2, @InterfaceC37017Xc4("kind") RentalKind rentalKind);

    @NA1("long-term-rental/map")
    /* renamed from: f */
    AbstractC23442F<LongTermRentalMap> m4381f(@InterfaceC37017Xc4("latitude") double d, @InterfaceC37017Xc4("longitude") double d2, @InterfaceC37017Xc4("radius") double d3);
}
