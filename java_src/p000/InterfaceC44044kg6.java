package p000;

import co.bird.api.request.AgreementAgreeBody;
import co.bird.api.response.AgreementAcceptResponse;
import co.bird.api.response.AgreementResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'J\u001e\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u00052\b\b\u0001\u0010\n\u001a\u00020\tH'J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005H'¨\u0006\u000e"}, m28432d2 = {"Lkg6;", "", "", "id", "partnerId", "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/response/AgreementResponse;", C17296a.f69688o, "Lco/bird/api/request/AgreementAgreeBody;", "body", "Lco/bird/api/response/AgreementAcceptResponse;", "c", "b", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kg6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC44044kg6 {
    @NA1("user-agreement")
    /* renamed from: a */
    AbstractC23442F<HM4<AgreementResponse>> m28648a(@InterfaceC37017Xc4("role") String str, @InterfaceC37017Xc4("partner_id") String str2);

    @NA1("user-agreement/signed")
    /* renamed from: b */
    AbstractC23442F<AgreementResponse> m28647b();

    @AD3("user-agreement/accept")
    /* renamed from: c */
    AbstractC23442F<HM4<AgreementAcceptResponse>> m28646c(@InterfaceC6404PY AgreementAgreeBody agreementAgreeBody);
}
