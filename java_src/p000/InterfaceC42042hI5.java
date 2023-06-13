package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.api.request.GenerateKeyBody;
import co.bird.api.request.NokelockMessage;
import co.bird.api.request.PromoteKeyBody;
import co.bird.api.request.PromoteProvisionalSmartlockBody;
import co.bird.api.request.ProvisionSmartlockBody;
import co.bird.api.response.NokelockResponse;
import co.bird.api.response.ProvisionSmartlockResponse;
import co.bird.api.response.ProvisionalSmartlock;
import co.bird.api.response.SmartlockResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H'J\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\fH'J0\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u000fH'J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\b\u001a\u00020\u0015H'J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\b\u001a\u00020\u0017H'¨\u0006\u0019"}, m28432d2 = {"LhI5;", "", "Lco/bird/api/request/NokelockMessage;", "message", "Lio/reactivex/F;", "Lco/bird/api/response/NokelockResponse;", "e", "Lco/bird/api/request/ProvisionSmartlockBody;", "body", "LHM4;", "Lco/bird/api/response/ProvisionSmartlockResponse;", "b", "Lco/bird/api/request/PromoteProvisionalSmartlockBody;", "Lco/bird/api/response/ProvisionalSmartlock;", "c", "", "macAddress", "serialNumber", "vendor", "Lco/bird/api/response/SmartlockResponse;", C17296a.f69688o, "Lco/bird/api/request/GenerateKeyBody;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/api/request/PromoteKeyBody;", "f", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hI5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC42042hI5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hI5$a */
    /* loaded from: classes4.dex */
    public static final class C22610a {
        public static /* synthetic */ AbstractC23442F getLockByIdentifier$default(InterfaceC42042hI5 interfaceC42042hI5, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                if ((i & 4) != 0) {
                    str3 = null;
                }
                return interfaceC42042hI5.m36550a(str, str2, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLockByIdentifier");
        }
    }

    @NA1("smartlock/by-identifier")
    /* renamed from: a */
    AbstractC23442F<SmartlockResponse> m36550a(@InterfaceC37017Xc4("mac_address") String str, @InterfaceC37017Xc4("serial_number") String str2, @InterfaceC37017Xc4("vendor") String str3);

    @AD3("smartlock/nokelock/provisional")
    /* renamed from: b */
    AbstractC23442F<HM4<ProvisionSmartlockResponse>> m36549b(@InterfaceC6404PY ProvisionSmartlockBody provisionSmartlockBody);

    @AD3("/smartlock/nokelock/promote-provisional")
    /* renamed from: c */
    AbstractC23442F<HM4<ProvisionalSmartlock>> m36548c(@InterfaceC6404PY PromoteProvisionalSmartlockBody promoteProvisionalSmartlockBody);

    @AD3("smartlock/generate-key")
    /* renamed from: d */
    AbstractC23442F<SmartlockResponse> m36547d(@InterfaceC6404PY GenerateKeyBody generateKeyBody);

    @AD3("smartlock/nokelock/handle")
    /* renamed from: e */
    AbstractC23442F<NokelockResponse> m36546e(@InterfaceC6404PY NokelockMessage nokelockMessage);

    @AD3("smartlock/promote-key")
    /* renamed from: f */
    AbstractC23442F<SmartlockResponse> m36545f(@InterfaceC6404PY PromoteKeyBody promoteKeyBody);
}
