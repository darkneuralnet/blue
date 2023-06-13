package p000;

import co.bird.android.model.CommandCenterBody;
import co.bird.android.model.CommandCenterNotice;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u0010"}, m28432d2 = {"LUn0;", "LTn0;", "", "birdId", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/CommandCenterBody;", "b", "", "Lco/bird/android/model/CommandCenterNotice;", C17296a.f69688o, "Ljn0;", "Ljn0;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "<init>", "(Ljn0;)V", "contractor_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Un0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36410Un0 implements InterfaceC36176Tn0 {

    /* renamed from: a */
    public final InterfaceC43515jn0 f37986a;

    public C36410Un0(InterfaceC43515jn0 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f37986a = client;
    }

    @Override // p000.InterfaceC36176Tn0
    /* renamed from: a */
    public AbstractC23442F<HM4<List<CommandCenterNotice>>> mo80873a(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<HM4<List<CommandCenterNotice>>> m33142Y = this.f37986a.m29936a(birdId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "client.getCommandCenterN…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC36176Tn0
    /* renamed from: b */
    public AbstractC23442F<HM4<CommandCenterBody>> mo80872b(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<HM4<CommandCenterBody>> m33142Y = this.f37986a.m29935b(birdId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "client.getCommandCenter(…scribeOn(Schedulers.io())");
        return m33142Y;
    }
}
