package p000;

import co.bird.api.response.ReloadConfigResponse;
import co.bird.api.response.ReloadOption;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0004"}, m28432d2 = {"Lco/bird/api/response/ReloadConfigResponse;", "", C17296a.f69688o, "b", "core-interface_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: oN3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46236oN3 {
    /* renamed from: a */
    public static final boolean m21249a(ReloadConfigResponse reloadConfigResponse) {
        Intrinsics.checkNotNullParameter(reloadConfigResponse, "<this>");
        if ((reloadConfigResponse.getAutoReload().getCurrentOption() != null || (!reloadConfigResponse.getAutoReload().getOptions().isEmpty())) && reloadConfigResponse.getAutoReload().getEnabled()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m21248b(ReloadConfigResponse reloadConfigResponse) {
        long j;
        Intrinsics.checkNotNullParameter(reloadConfigResponse, "<this>");
        if (reloadConfigResponse.getAutoReload().getEnabled()) {
            ReloadOption currentOption = reloadConfigResponse.getAutoReload().getCurrentOption();
            if (currentOption != null) {
                j = currentOption.getAmount();
            } else {
                j = 0;
            }
            if (j > 0) {
                return true;
            }
        }
        return false;
    }
}
