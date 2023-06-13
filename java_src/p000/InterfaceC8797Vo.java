package p000;

import co.bird.api.request.AssetCreateRequestBody;
import co.bird.api.response.WireSignedUrl;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¨\u0006\u000b"}, m28432d2 = {"LVo;", "", "Lco/bird/api/request/AssetCreateRequestBody;", "body", "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/response/WireSignedUrl;", "b", "", "id", C17296a.f69688o, "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Vo */
/* loaded from: classes4.dex */
public interface InterfaceC8797Vo {
    @NA1("assets/by-id")
    /* renamed from: a */
    AbstractC23442F<HM4<WireSignedUrl>> m79412a(@InterfaceC37017Xc4("id") String str);

    @AD3("assets/create")
    /* renamed from: b */
    AbstractC23442F<HM4<WireSignedUrl>> m79411b(@InterfaceC6404PY AssetCreateRequestBody assetCreateRequestBody);
}
