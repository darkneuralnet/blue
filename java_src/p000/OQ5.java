package p000;

import co.bird.android.model.Sticker;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LOQ5;", "LNQ5;", "", "stickerId", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/Sticker;", "b", "stickerCode", C17296a.f69688o, "LMQ5;", "LMQ5;", "stickerClient", "<init>", "(LMQ5;)V", "sticker_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: OQ5 */
/* loaded from: classes4.dex */
public final class OQ5 implements NQ5 {

    /* renamed from: a */
    public final MQ5 f26559a;

    public OQ5(MQ5 stickerClient) {
        Intrinsics.checkNotNullParameter(stickerClient, "stickerClient");
        this.f26559a = stickerClient;
    }

    @Override // p000.NQ5
    /* renamed from: a */
    public AbstractC23442F<HM4<Sticker>> mo92318a(String stickerCode) {
        Intrinsics.checkNotNullParameter(stickerCode, "stickerCode");
        AbstractC23442F<HM4<Sticker>> m33142Y = this.f26559a.m95306a(stickerCode).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "stickerClient.getSticker…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.NQ5
    /* renamed from: b */
    public AbstractC23442F<HM4<Sticker>> mo92317b(String stickerId) {
        Intrinsics.checkNotNullParameter(stickerId, "stickerId");
        AbstractC23442F<HM4<Sticker>> m33142Y = this.f26559a.m95305b(stickerId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "stickerClient.getSticker…scribeOn(Schedulers.io())");
        return m33142Y;
    }
}
