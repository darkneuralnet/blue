package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.ComplaintType;
import co.bird.android.model.RideTrack;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.wire.WireLocation;
import co.bird.api.request.ComplaintSchemaType;
import co.bird.api.response.Complaint;
import co.bird.api.response.ComplaintSchemaResponse;
import co.bird.api.response.RidesNearbyResponse;
import io.reactivex.AbstractC23442F;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H&J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H&J*\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&Jp\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH&J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00070\u00062\u0006\u0010\u0015\u001a\u00020\u0014H&¨\u0006\""}, m28432d2 = {"LKp0;", "", "", "id", "", "photos", "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/response/Complaint;", "e", "Lco/bird/api/request/ComplaintSchemaType;", "type", "birdId", "Lco/bird/api/response/ComplaintSchemaResponse;", DateTokenConverter.CONVERTER_KEY, "rideId", "", "time", "Lco/bird/android/model/RideTrack;", "f", "Lco/bird/android/model/wire/WireLocation;", "location", "Lco/bird/android/model/constant/MapMode;", "role", "Lco/bird/android/model/ComplaintType;", "complaintType", "photoUrls", "", "reasonsAndMessages", "", "fromTaskList", "g", "Lco/bird/api/response/RidesNearbyResponse;", "c", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Kp0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC34088Kp0 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Kp0$a */
    /* loaded from: classes2.dex */
    public static final class C4602a {
        public static /* synthetic */ AbstractC23442F complaintsSchema$default(InterfaceC34088Kp0 interfaceC34088Kp0, ComplaintSchemaType complaintSchemaType, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                return interfaceC34088Kp0.mo96320d(complaintSchemaType, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: complaintsSchema");
        }

        public static /* synthetic */ AbstractC23442F submitComplaint$default(InterfaceC34088Kp0 interfaceC34088Kp0, String str, WireLocation wireLocation, MapMode mapMode, ComplaintType complaintType, List list, String str2, Map map, boolean z, int i, Object obj) {
            if (obj == null) {
                return interfaceC34088Kp0.mo96317g(str, wireLocation, mapMode, complaintType, list, str2, map, (i & 128) != 0 ? false : z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitComplaint");
        }
    }

    /* renamed from: c */
    AbstractC23442F<HM4<RidesNearbyResponse>> mo96321c(WireLocation wireLocation);

    /* renamed from: d */
    AbstractC23442F<ComplaintSchemaResponse> mo96320d(ComplaintSchemaType complaintSchemaType, String str);

    /* renamed from: e */
    AbstractC23442F<HM4<Complaint>> mo96319e(String str, List<String> list);

    /* renamed from: f */
    AbstractC23442F<HM4<List<RideTrack>>> mo96318f(String str, long j);

    /* renamed from: g */
    AbstractC23442F<HM4<Complaint>> mo96317g(String str, WireLocation wireLocation, MapMode mapMode, ComplaintType complaintType, List<String> list, String str2, Map<String, ? extends Object> map, boolean z);
}
