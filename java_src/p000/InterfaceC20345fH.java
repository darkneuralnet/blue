package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBird;
import co.bird.api.request.BirdSettingsBody;
import co.bird.api.request.PairBody;
import co.bird.api.request.WireBirdActionPairRequest;
import co.bird.api.response.WireBirdActionPairResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\b\u001a\u00020\u000bH'J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H'J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u000fH'J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\b\u001a\u00020\u0011H'J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\b\u001a\u00020\u0014H'J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\b\u001a\u00020\u0016H'J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\b\u001a\u00020\u0018H'J\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\b\u001a\u00020\u001aH'¨\u0006\u001c"}, m28432d2 = {"LfH;", "", "", "birdId", "Lio/reactivex/F;", "LT24;", "b", "Lco/bird/api/request/PairBody;", "body", "Lco/bird/android/model/wire/WireBird;", "c", "Lco/bird/api/request/WireBirdActionPairRequest;", "Lco/bird/api/response/WireBirdActionPairResponse;", C17296a.f69688o, "i", "Lco/bird/api/request/BirdSettingsBody;", "e", "LZG;", "LzT;", DateTokenConverter.CONVERTER_KEY, "LaH;", "j", "LWG;", "h", "LcH;", "f", "LXG;", "g", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: fH */
/* loaded from: classes4.dex */
public interface InterfaceC20345fH {
    @AD3("/bird/action/pair/v2")
    /* renamed from: a */
    AbstractC23442F<WireBirdActionPairResponse> m41633a(@InterfaceC6404PY WireBirdActionPairRequest wireBirdActionPairRequest);

    @NA1("/bird/action/permissions")
    /* renamed from: b */
    AbstractC23442F<T24> m41632b(@InterfaceC37017Xc4("bird_id") String str);

    @AD3("/bird/action/pair")
    /* renamed from: c */
    AbstractC23442F<WireBird> m41631c(@InterfaceC6404PY PairBody pairBody);

    @AD3("/bird/action/lights")
    /* renamed from: d */
    AbstractC23442F<C31014zT> m41630d(@InterfaceC6404PY C10181ZG c10181zg);

    @AD3("/bird/action/settings")
    /* renamed from: e */
    AbstractC23442F<T24> m41629e(@InterfaceC6404PY BirdSettingsBody birdSettingsBody);

    @AD3("/bird/action/sleep")
    /* renamed from: f */
    AbstractC23442F<C31014zT> m41628f(@InterfaceC6404PY C13483cH c13483cH);

    @AD3("/bird/action/ack_sleep")
    /* renamed from: g */
    AbstractC23442F<C31014zT> m41627g(@InterfaceC6404PY C9395XG c9395xg);

    @AD3("/bird/action/ack_lock")
    /* renamed from: h */
    AbstractC23442F<C31014zT> m41626h(@InterfaceC6404PY C8973WG c8973wg);

    @AD3("/bird/action/unpair")
    /* renamed from: i */
    AbstractC23442F<WireBird> m41625i(@InterfaceC6404PY PairBody pairBody);

    @AD3("/bird/action/lock")
    /* renamed from: j */
    AbstractC23442F<C31014zT> m41624j(@InterfaceC6404PY C10610aH c10610aH);
}
