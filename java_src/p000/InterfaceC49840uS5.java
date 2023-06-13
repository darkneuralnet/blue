package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.api.request.BankRedirectOneTimeRefillRequest;
import co.bird.api.request.BankRedirectOneTimeRefillResponse;
import co.bird.api.request.CreateEphemeralKeyBody;
import co.bird.api.request.SourceBody;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Customer;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
import okhttp3.ResponseBody;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'¨\u0006\u0010"}, m28432d2 = {"LuS5;", "", "Lco/bird/api/request/CreateEphemeralKeyBody;", "body", "Lio/reactivex/F;", "LHM4;", "Lokhttp3/ResponseBody;", "c", "Lco/bird/api/request/SourceBody;", "Lcom/stripe/android/model/Customer;", "e", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "Lco/bird/api/request/BankRedirectOneTimeRefillRequest;", "Lco/bird/api/request/BankRedirectOneTimeRefillResponse;", "b", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uS5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC49840uS5 {
    @AD3("stripe/source/detach")
    /* renamed from: a */
    AbstractC23442F<Customer> m10269a(@InterfaceC6404PY SourceBody sourceBody);

    @AD3("stripe/bank-redirect-one-time-refill")
    /* renamed from: b */
    AbstractC23442F<BankRedirectOneTimeRefillResponse> m10268b(@InterfaceC6404PY BankRedirectOneTimeRefillRequest bankRedirectOneTimeRefillRequest);

    @AD3("stripe/key")
    /* renamed from: c */
    AbstractC23442F<HM4<ResponseBody>> m10267c(@InterfaceC6404PY CreateEphemeralKeyBody createEphemeralKeyBody);

    @AD3("stripe/source/default")
    /* renamed from: d */
    AbstractC23442F<Customer> m10266d(@InterfaceC6404PY SourceBody sourceBody);

    @AD3("stripe/source/attach")
    /* renamed from: e */
    AbstractC23442F<Customer> m10265e(@InterfaceC6404PY SourceBody sourceBody);
}
