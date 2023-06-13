package p000;

import co.bird.api.request.AgreementAgreeBody;
import co.bird.api.request.UserGuestRequest;
import co.bird.api.response.AgreementAcceptResponse;
import co.bird.api.response.AgreementResponse;
import co.bird.api.response.UserGuestResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H'JG\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\n\u001a\u00020\u00072\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\r0\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¨\u0006\u0015"}, m28432d2 = {"LVg6;", "", "Lco/bird/api/request/UserGuestRequest;", "request", "Lio/reactivex/F;", "Lco/bird/api/response/UserGuestResponse;", "c", "", "id", "partnerId", "userGuestId", "", "noAgreementContentRequested", "LHM4;", "Lco/bird/api/response/AgreementResponse;", C17296a.f69688o, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/F;", "Lco/bird/api/request/AgreementAgreeBody;", "body", "Lco/bird/api/response/AgreementAcceptResponse;", "b", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Vg6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC36587Vg6 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vg6$a */
    /* loaded from: classes4.dex */
    public static final class C8722a {
        public static /* synthetic */ AbstractC23442F createOrUpdateUserGuest$default(InterfaceC36587Vg6 interfaceC36587Vg6, UserGuestRequest userGuestRequest, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    userGuestRequest = new UserGuestRequest(null, 1, null);
                }
                return interfaceC36587Vg6.m79573c(userGuestRequest);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createOrUpdateUserGuest");
        }

        public static /* synthetic */ AbstractC23442F getGuestDisplayAgreement$default(InterfaceC36587Vg6 interfaceC36587Vg6, String str, String str2, String str3, Boolean bool, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                if ((i & 8) != 0) {
                    bool = Boolean.FALSE;
                }
                return interfaceC36587Vg6.m79575a(str, str2, str3, bool);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGuestDisplayAgreement");
        }
    }

    @NA1("user-guest/agreement")
    /* renamed from: a */
    AbstractC23442F<HM4<AgreementResponse>> m79575a(@InterfaceC37017Xc4("role") String str, @InterfaceC37017Xc4("partner_id") String str2, @InterfaceC37017Xc4("user_guest_id") String str3, @InterfaceC37017Xc4("no_agreement_content") Boolean bool);

    @AD3("user-guest/agreement/accept")
    /* renamed from: b */
    AbstractC23442F<HM4<AgreementAcceptResponse>> m79574b(@InterfaceC6404PY AgreementAgreeBody agreementAgreeBody);

    @AD3("user-guest")
    /* renamed from: c */
    AbstractC23442F<UserGuestResponse> m79573c(@InterfaceC6404PY UserGuestRequest userGuestRequest);
}
