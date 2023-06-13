package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.RideTrack;
import co.bird.api.request.UpdateComplaintPhotosBody;
import co.bird.api.response.Complaint;
import co.bird.api.response.ComplaintSchemaResponse;
import co.bird.api.response.RidesNearbyResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'J1\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00052\u001b\b\u0001\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\t0\bH'J\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'J(\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\u00052\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u0011H'J.\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u000b0\u00052\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0017H'¨\u0006\u001c"}, m28432d2 = {"LJp0;", "", "", "type", "birdId", "Lio/reactivex/F;", "Lco/bird/api/response/ComplaintSchemaResponse;", "e", "", "Lkotlin/jvm/JvmSuppressWildcards;", "fields", "LHM4;", "Lco/bird/api/response/Complaint;", "b", "Lco/bird/api/request/UpdateComplaintPhotosBody;", "body", "c", "", "latitude", "longitude", "Lco/bird/api/response/RidesNearbyResponse;", DateTokenConverter.CONVERTER_KEY, "rideId", "", "time", "", "Lco/bird/android/model/RideTrack;", C17296a.f69688o, "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Jp0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC33854Jp0 {
    @NA1("complaint/rides-nearby/{rideId}")
    /* renamed from: a */
    AbstractC23442F<HM4<List<RideTrack>>> m99663a(@InterfaceC39678dJ3("rideId") String str, @InterfaceC37017Xc4("time") long j);

    @AD3("complaint/submit")
    /* renamed from: b */
    AbstractC23442F<HM4<Complaint>> m99662b(@InterfaceC6404PY Map<String, Object> map);

    @CD3("complaint/update-photos")
    /* renamed from: c */
    AbstractC23442F<HM4<Complaint>> m99661c(@InterfaceC6404PY UpdateComplaintPhotosBody updateComplaintPhotosBody);

    @NA1("complaint/rides-nearby")
    /* renamed from: d */
    AbstractC23442F<HM4<RidesNearbyResponse>> m99660d(@InterfaceC37017Xc4("latitude") double d, @InterfaceC37017Xc4("longitude") double d2);

    @NA1("complaint/schema")
    /* renamed from: e */
    AbstractC23442F<ComplaintSchemaResponse> m99659e(@InterfaceC37017Xc4("type") String str, @InterfaceC37017Xc4("bird_id") String str2);
}
