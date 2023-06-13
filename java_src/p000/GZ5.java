package p000;

import co.bird.api.request.TaxInformationBody;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00060\u0004H'¨\u0006\b"}, m28432d2 = {"LGZ5;", "", "Lco/bird/api/request/TaxInformationBody;", "body", "Lio/reactivex/F;", "b", "LHM4;", C17296a.f69688o, "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: GZ5 */
/* loaded from: classes4.dex */
public interface GZ5 {
    @NA1("/v2/taxinfo")
    /* renamed from: a */
    AbstractC23442F<HM4<TaxInformationBody>> m105003a();

    @AD3("/v2/taxinfo")
    /* renamed from: b */
    AbstractC23442F<TaxInformationBody> m105002b(@InterfaceC6404PY TaxInformationBody taxInformationBody);
}
