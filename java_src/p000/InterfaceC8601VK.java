package p000;

import co.bird.android.model.BirdLocations;
import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireArea;
import co.bird.android.model.wire.WireBird;
import co.bird.api.request.AlarmBirdBody;
import co.bird.api.request.BirdAssignStickerHourlyBody;
import co.bird.api.request.BirdIdBody;
import co.bird.api.request.BluetoothTrackBody;
import co.bird.api.request.ChirpBirdBody;
import co.bird.api.request.LockBirdBody;
import co.bird.api.request.MarkMissingBirdBody;
import co.bird.api.request.NearbyBirdsByIdsRequest;
import co.bird.api.request.RepairLogSubmitBody;
import co.bird.api.request.TokenBody;
import co.bird.api.request.TrackBirdBody;
import co.bird.api.request.UnlockCableBody;
import co.bird.api.request.UnlockHelmetLockBody;
import co.bird.api.request.UnlockMechanicalBody;
import co.bird.api.request.WireBirdByCellsRequest;
import co.bird.api.request.ZoneRegionRequest;
import co.bird.api.response.BirdCodeWithStatus;
import co.bird.api.response.BirdsResponse;
import co.bird.api.response.HibernationResultResponse;
import co.bird.api.response.ZoneRegionResponse;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\n\u001a\u00020\tH'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\n\u001a\u00020\fH'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H'J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'J\u0012\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0014\u001a\u00020\u0016H'J\u0012\u0010\u001a\u001a\u00020\u00172\b\b\u0001\u0010\u0014\u001a\u00020\u0019H'J&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u000fH'J\u001e\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u001f0\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u001eH'J\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u001eH'J\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110#2\b\b\u0001\u0010\u0014\u001a\u00020\"H'J\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110#2\b\b\u0001\u0010\u0014\u001a\u00020%H'J\u0018\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110#2\b\b\u0001\u0010\u0014\u001a\u00020'H'J\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110#2\b\b\u0001\u0010\u0014\u001a\u00020)H'J\u0018\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00110#2\b\b\u0001\u0010\u0014\u001a\u00020)H'J\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00062\b\b\u0001\u0010\u0014\u001a\u00020)H'J\u0018\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110#2\b\b\u0001\u0010\u0014\u001a\u00020)H'J\u0018\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00062\b\b\u0001\u0010\u0014\u001a\u00020/H'JE\u00107\u001a\b\u0012\u0004\u0012\u0002060#2\n\b\u0003\u00103\u001a\u0004\u0018\u0001022\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u00104\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u00105\u001a\u0004\u0018\u00010\u000fH'¢\u0006\u0004\b7\u00108J<\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;0#2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010:\u001a\u000209H'J\u0018\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00062\b\b\u0001\u0010\n\u001a\u00020>H'J.\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0;0\u001f0\u00062\b\b\u0001\u0010A\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'JD\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0\u001f0\u00062\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u00104\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010D\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010E\u001a\u0004\u0018\u00010\u000fH'J\u001e\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0\u001f0\u00062\b\b\u0001\u0010\u0014\u001a\u00020HH'J\u001e\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\u001f0\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'J\u001e\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0\u001f0\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'J\u0012\u0010P\u001a\u00020\u00172\b\b\u0001\u0010\u0014\u001a\u00020OH'¨\u0006Q"}, m28432d2 = {"LVK;", "", "", "latitude", "longitude", "radius", "Lio/reactivex/F;", "Lco/bird/api/response/BirdsResponse;", "z", "Lco/bird/api/request/WireBirdByCellsRequest;", "request", "F", "Lco/bird/api/request/NearbyBirdsByIdsRequest;", "u", "A", "", "birdId", "Lco/bird/android/model/wire/WireBird;", "b", "Lco/bird/api/request/LockBirdBody;", "body", "K", "Lco/bird/api/request/UnlockMechanicalBody;", "Lio/reactivex/c;", "p", "Lco/bird/api/request/UnlockCableBody;", "q", "serialNumber", "birdCode", "v", "Lco/bird/api/request/BirdAssignStickerHourlyBody;", "LHM4;", "G", "r", "Lco/bird/api/request/AlarmBirdBody;", "Lio/reactivex/Observable;", "t", "Lco/bird/api/request/ChirpBirdBody;", "E", "Lco/bird/api/request/MarkMissingBirdBody;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lco/bird/api/request/BirdIdBody;", "w", "B", "Lco/bird/api/response/HibernationResultResponse;", "M", "x", "Lco/bird/api/request/TrackBirdBody;", "Lco/bird/api/request/BluetoothTrackBody;", "H", "", "distance", "imei", "bleMacAddress", "Lco/bird/api/request/TokenBody;", "L", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Observable;", "", "includeMerged", "", "Lco/bird/android/model/wire/WireArea;", "I", "Lco/bird/api/request/ZoneRegionRequest;", "Lco/bird/api/response/ZoneRegionResponse;", "N", "role", "Lco/bird/android/model/LegacyRepairType;", "D", "beaconHash", "proximityUUID", "Lco/bird/api/response/BirdCodeWithStatus;", "s", "Lco/bird/api/request/RepairLogSubmitBody;", "", "J", "Lco/bird/android/model/BirdSummaryBody;", "o", "Lco/bird/android/model/BirdLocations;", "y", "Lco/bird/api/request/UnlockHelmetLockBody;", "O", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: VK */
/* loaded from: classes4.dex */
public interface InterfaceC8601VK {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: VK$a */
    /* loaded from: classes4.dex */
    public static final class C8602a {
        public static /* synthetic */ AbstractC23442F getBirdByBluetoothId$default(InterfaceC8601VK interfaceC8601VK, String str, String str2, String str3, String str4, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                if ((i & 2) != 0) {
                    str2 = null;
                }
                if ((i & 4) != 0) {
                    str3 = null;
                }
                if ((i & 8) != 0) {
                    str4 = null;
                }
                return interfaceC8601VK.m79964s(str, str2, str3, str4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBirdByBluetoothId");
        }

        public static /* synthetic */ Observable getNearbyAreas$default(InterfaceC8601VK interfaceC8601VK, double d, double d2, double d3, boolean z, int i, Object obj) {
            if (obj == null) {
                return interfaceC8601VK.m79976I(d, d2, d3, (i & 8) != 0 ? false : z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNearbyAreas");
        }

        public static /* synthetic */ Observable getToken$default(InterfaceC8601VK interfaceC8601VK, Integer num, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    num = 0;
                }
                if ((i & 2) != 0) {
                    str = null;
                }
                if ((i & 4) != 0) {
                    str2 = null;
                }
                if ((i & 8) != 0) {
                    str3 = null;
                }
                return interfaceC8601VK.m79973L(num, str, str2, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getToken");
        }

        public static /* synthetic */ AbstractC23442F validate$default(InterfaceC8601VK interfaceC8601VK, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                if ((i & 2) != 0) {
                    str2 = null;
                }
                return interfaceC8601VK.m79961v(str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: validate");
        }
    }

    @NA1("bird/contractor-task")
    /* renamed from: A */
    AbstractC23442F<BirdsResponse> m79984A();

    @CD3("bird/sleep")
    /* renamed from: B */
    Observable<WireBird> m79983B(@InterfaceC6404PY BirdIdBody birdIdBody);

    @CD3("bird/missing")
    /* renamed from: C */
    Observable<WireBird> m79982C(@InterfaceC6404PY MarkMissingBirdBody markMissingBirdBody);

    @NA1("repair-log/schema")
    /* renamed from: D */
    AbstractC23442F<HM4<List<LegacyRepairType>>> m79981D(@InterfaceC37017Xc4("request_role") String str, @InterfaceC37017Xc4("bird_id") String str2);

    @CD3("bird/chirp")
    /* renamed from: E */
    Observable<WireBird> m79980E(@InterfaceC6404PY ChirpBirdBody chirpBirdBody);

    @AD3("bird/nearby-by-cells")
    /* renamed from: F */
    AbstractC23442F<BirdsResponse> m79979F(@InterfaceC6404PY WireBirdByCellsRequest wireBirdByCellsRequest);

    @CD3("bird/assign-sticker")
    /* renamed from: G */
    AbstractC23442F<HM4<WireBird>> m79978G(@InterfaceC6404PY BirdAssignStickerHourlyBody birdAssignStickerHourlyBody);

    @CD3("bird/track")
    /* renamed from: H */
    AbstractC23442F<BluetoothTrackBody> m79977H(@InterfaceC6404PY TrackBirdBody trackBirdBody);

    @NA1("area/nearby")
    /* renamed from: I */
    Observable<List<WireArea>> m79976I(@InterfaceC37017Xc4("latitude") double d, @InterfaceC37017Xc4("longitude") double d2, @InterfaceC37017Xc4("radius") double d3, @InterfaceC37017Xc4("include_merged") boolean z);

    @AD3("repair-log/submit")
    /* renamed from: J */
    AbstractC23442F<HM4<Unit>> m79975J(@InterfaceC6404PY RepairLogSubmitBody repairLogSubmitBody);

    @CD3("bird/lock")
    /* renamed from: K */
    AbstractC23442F<WireBird> m79974K(@InterfaceC6404PY LockBirdBody lockBirdBody);

    @NA1("bird/token")
    /* renamed from: L */
    Observable<TokenBody> m79973L(@InterfaceC37017Xc4("distance") Integer num, @InterfaceC37017Xc4("serial_number") String str, @InterfaceC37017Xc4("imei") String str2, @InterfaceC37017Xc4("ble_mac_address") String str3);

    @CD3("bird/hibernate")
    /* renamed from: M */
    AbstractC23442F<HibernationResultResponse> m79972M(@InterfaceC6404PY BirdIdBody birdIdBody);

    @AD3("map/rider-geometry")
    /* renamed from: N */
    AbstractC23442F<ZoneRegionResponse> m79971N(@InterfaceC6404PY ZoneRegionRequest zoneRegionRequest);

    @CD3("bird/unlock-helmet-lock")
    /* renamed from: O */
    AbstractC23461c m79970O(@InterfaceC6404PY UnlockHelmetLockBody unlockHelmetLockBody);

    @NA1("bird")
    /* renamed from: b */
    AbstractC23442F<WireBird> m79969b(@InterfaceC37017Xc4("bird_id") String str);

    @NA1("bird/bird-summary")
    /* renamed from: o */
    AbstractC23442F<HM4<BirdSummaryBody>> m79968o(@InterfaceC37017Xc4("bird_id") String str);

    @CD3("bird/unlock-mechanical")
    /* renamed from: p */
    AbstractC23461c m79967p(@InterfaceC6404PY UnlockMechanicalBody unlockMechanicalBody);

    @CD3("bird/unlock-cable-lock")
    /* renamed from: q */
    AbstractC23461c m79966q(@InterfaceC6404PY UnlockCableBody unlockCableBody);

    @CD3("bird/assign-sticker")
    /* renamed from: r */
    AbstractC23442F<WireBird> m79965r(@InterfaceC6404PY BirdAssignStickerHourlyBody birdAssignStickerHourlyBody);

    @NA1("bird/by-bluetooth-identifier")
    /* renamed from: s */
    AbstractC23442F<HM4<BirdCodeWithStatus>> m79964s(@InterfaceC37017Xc4("serial_number") String str, @InterfaceC37017Xc4("imei") String str2, @InterfaceC37017Xc4("beacon_hash") String str3, @InterfaceC37017Xc4("proximity_uuid") String str4);

    @CD3("bird/alarm")
    /* renamed from: t */
    Observable<WireBird> m79963t(@InterfaceC6404PY AlarmBirdBody alarmBirdBody);

    @AD3("bird/nearby-by-ids")
    /* renamed from: u */
    AbstractC23442F<BirdsResponse> m79962u(@InterfaceC6404PY NearbyBirdsByIdsRequest nearbyBirdsByIdsRequest);

    @NA1("bird/validate")
    /* renamed from: v */
    AbstractC23442F<WireBird> m79961v(@InterfaceC37017Xc4("serial_number") String str, @InterfaceC37017Xc4("bird_code") String str2);

    @CD3("bird/mark_asleep")
    /* renamed from: w */
    Observable<WireBird> m79960w(@InterfaceC6404PY BirdIdBody birdIdBody);

    @CD3("bird/mark-awake")
    /* renamed from: x */
    Observable<WireBird> m79959x(@InterfaceC6404PY BirdIdBody birdIdBody);

    @NA1("bird/locations")
    /* renamed from: y */
    AbstractC23442F<HM4<BirdLocations>> m79958y(@InterfaceC37017Xc4("bird_id") String str);

    @NA1("bird/nearby")
    /* renamed from: z */
    AbstractC23442F<BirdsResponse> m79957z(@InterfaceC37017Xc4("latitude") double d, @InterfaceC37017Xc4("longitude") double d2, @InterfaceC37017Xc4("radius") double d3);
}
