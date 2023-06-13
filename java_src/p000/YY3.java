package p000;

import co.bird.api.request.WhitelistRequest;
import co.bird.api.response.WhitelistResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, m28432d2 = {"LYY3;", "LXY3;", "", "imei", "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/response/WhitelistResponse;", C17296a.f69688o, "LWY3;", "LWY3;", "powerlineClient", "<init>", "(LWY3;)V", "powerline_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: YY3 */
/* loaded from: classes4.dex */
public final class YY3 implements XY3 {

    /* renamed from: a */
    public final WY3 f46013a;

    public YY3(WY3 powerlineClient) {
        Intrinsics.checkNotNullParameter(powerlineClient, "powerlineClient");
        this.f46013a = powerlineClient;
    }

    @Override // p000.XY3
    /* renamed from: a */
    public AbstractC23442F<HM4<WhitelistResponse>> mo74898a(String imei) {
        Intrinsics.checkNotNullParameter(imei, "imei");
        AbstractC23442F<HM4<WhitelistResponse>> m33142Y = this.f46013a.m78178a(new WhitelistRequest(imei)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "powerlineClient.whitelis…scribeOn(Schedulers.io())");
        return m33142Y;
    }
}
