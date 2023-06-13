package p000;

import co.bird.api.request.AssetCreateRequestBody;
import co.bird.api.response.WireSignedUrl;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.io.File;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u0010"}, m28432d2 = {"LXo;", "LWo;", "", "assetId", "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/response/WireSignedUrl;", C17296a.f69688o, "Ljava/io/File;", "file", "createAsset", "LVo;", "LVo;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "<init>", "(LVo;)V", "asset-repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Xo */
/* loaded from: classes4.dex */
public final class C9495Xo implements InterfaceC9184Wo {

    /* renamed from: a */
    public final InterfaceC8797Vo f43954a;

    public C9495Xo(InterfaceC8797Vo client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f43954a = client;
    }

    @Override // p000.InterfaceC6909Qo
    /* renamed from: a */
    public AbstractC23442F<HM4<WireSignedUrl>> mo4278a(String assetId) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        AbstractC23442F<HM4<WireSignedUrl>> m33142Y = this.f43954a.m79412a(assetId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "client.getAssetById(asse…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC6909Qo
    public AbstractC23442F<HM4<WireSignedUrl>> createAsset(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String mediaType = URLConnection.getFileNameMap().getContentTypeFor(file.getName());
        InterfaceC8797Vo interfaceC8797Vo = this.f43954a;
        long length = file.length();
        Intrinsics.checkNotNullExpressionValue(mediaType, "mediaType");
        AbstractC23442F<HM4<WireSignedUrl>> m33142Y = interfaceC8797Vo.m79411b(new AssetCreateRequestBody(length, mediaType)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "client.createAsset(\n    …scribeOn(Schedulers.io())");
        return m33142Y;
    }
}
