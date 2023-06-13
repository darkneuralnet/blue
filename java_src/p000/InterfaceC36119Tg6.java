package p000;

import co.bird.android.model.Balance;
import co.bird.android.model.Link;
import co.bird.android.model.TransactionSummary;
import co.bird.android.model.User;
import co.bird.android.model.Zone;
import co.bird.android.model.wire.configs.Config;
import co.bird.api.request.AutoPayBody;
import co.bird.api.request.AutoPayBodyPaymentIntent;
import co.bird.api.request.BalanceRefundRequest;
import co.bird.api.request.PushBody;
import co.bird.api.request.UpdateUserBody;
import co.bird.api.request.UserByIdsBody;
import co.bird.api.request.UserRequestBody;
import co.bird.api.request.UserUpdateHomeLocationRequest;
import co.bird.api.response.BalanceRefundResponse;
import co.bird.api.response.CollectionResponse;
import co.bird.api.response.UserDeleteResponse;
import co.bird.api.response.UserRequestResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.Map;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H'J\u0012\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H'J\b\u0010\u000b\u001a\u00020\tH'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\fH'J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u000eH'J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0010H'J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0002H'J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0005H'J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0005H'J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\b\b\u0001\u0010\b\u001a\u00020\u001cH'J\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\b\b\u0001\u0010\b\u001a\u00020\u001eH'J\b\u0010 \u001a\u00020\tH'J\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00022\b\b\u0001\u0010\"\u001a\u00020!H'J.\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00190(0\u00052\b\b\u0001\u0010&\u001a\u00020%2\b\b\u0001\u0010'\u001a\u00020%H'J*\u0010-\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030,0(0\u00052\b\b\u0001\u0010\"\u001a\u00020+H'J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0005H'J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020.0\u0005H'J\u0018\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00052\b\b\u0001\u0010\b\u001a\u000201H'¨\u00064"}, m28432d2 = {"LTg6;", "", "Lio/reactivex/Observable;", "Lco/bird/android/model/User;", C17296a.f69688o, "Lio/reactivex/F;", "getUser", "Lco/bird/api/request/UserUpdateHomeLocationRequest;", "request", "Lio/reactivex/c;", "x", "n", "Lco/bird/api/request/UpdateUserBody;", "v", "Lco/bird/api/request/PushBody;", "D", "", "role", "habitatId", "Lco/bird/android/model/wire/configs/Config;", "y", "Lco/bird/android/model/Zone;", "getZone", "Lco/bird/android/model/Link;", "w", "Lco/bird/api/response/CollectionResponse;", "Lco/bird/android/model/Balance;", "t", "Lco/bird/api/request/AutoPayBody;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lco/bird/api/request/AutoPayBodyPaymentIntent;", "A", "q", "Lco/bird/api/request/UserRequestBody;", "body", "Lco/bird/api/response/UserRequestResponse;", "z", "", "offset", "limit", "LHM4;", "Lco/bird/android/model/TransactionSummary;", "u", "Lco/bird/api/request/UserByIdsBody;", "", "B", "Lco/bird/api/response/UserDeleteResponse;", "p", "r", "Lco/bird/api/request/BalanceRefundRequest;", "Lco/bird/api/response/BalanceRefundResponse;", "s", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Tg6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC36119Tg6 {
    @AD3("user/v2/auto-pay-update")
    /* renamed from: A */
    AbstractC23442F<Balance> m83184A(@InterfaceC6404PY AutoPayBodyPaymentIntent autoPayBodyPaymentIntent);

    @AD3("user/by-ids")
    /* renamed from: B */
    AbstractC23442F<HM4<Map<String, User>>> m83183B(@InterfaceC6404PY UserByIdsBody userByIdsBody);

    @AD3("user/auto-pay-update")
    /* renamed from: C */
    AbstractC23442F<Balance> m83182C(@InterfaceC6404PY AutoPayBody autoPayBody);

    @CD3("user/push")
    /* renamed from: D */
    Observable<User> m83181D(@InterfaceC6404PY PushBody pushBody);

    @NA1("user")
    @InterfaceC36098Te3
    /* renamed from: a */
    Observable<User> m83180a();

    @NA1("user")
    @InterfaceC36098Te3
    AbstractC23442F<User> getUser();

    @NA1("zone")
    Observable<Zone> getZone();

    @AD3("user/session-start")
    /* renamed from: n */
    AbstractC23461c m83179n();

    @AD3("user/delete")
    /* renamed from: p */
    AbstractC23442F<UserDeleteResponse> m83178p();

    @AD3("user/verify-email")
    /* renamed from: q */
    AbstractC23461c m83177q();

    @NA1("user/delete")
    /* renamed from: r */
    AbstractC23442F<UserDeleteResponse> m83176r();

    @AD3("user-support/self-balance-refund")
    /* renamed from: s */
    AbstractC23442F<BalanceRefundResponse> m83175s(@InterfaceC6404PY BalanceRefundRequest balanceRefundRequest);

    @NA1("user/balance")
    /* renamed from: t */
    AbstractC23442F<CollectionResponse<Balance>> m83174t();

    @NA1("user/transaction-history")
    /* renamed from: u */
    AbstractC23442F<HM4<CollectionResponse<TransactionSummary>>> m83173u(@InterfaceC37017Xc4("offset") int i, @InterfaceC37017Xc4("limit") int i2);

    @CD3("user/update")
    @InterfaceC36098Te3
    /* renamed from: v */
    Observable<User> m83172v(@InterfaceC6404PY UpdateUserBody updateUserBody);

    @NA1("link")
    /* renamed from: w */
    AbstractC23442F<Link> m83171w();

    @CD3("user/update-home-location")
    /* renamed from: x */
    AbstractC23461c m83170x(@InterfaceC6404PY UserUpdateHomeLocationRequest userUpdateHomeLocationRequest);

    @NA1("config")
    /* renamed from: y */
    AbstractC23442F<Config> m83169y(@InterfaceC37017Xc4("role") String str, @InterfaceC37017Xc4("habitat_id") String str2);

    @CD3("request/accept")
    /* renamed from: z */
    Observable<UserRequestResponse> m83168z(@InterfaceC6404PY UserRequestBody userRequestBody);
}
