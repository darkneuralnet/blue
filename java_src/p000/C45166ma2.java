package p000;

import co.bird.android.model.IssueFlow;
import co.bird.android.model.IssueKind;
import co.bird.api.request.ProgrammaticIssueBody;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016R\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"Lma2;", "Lla2;", "Lco/bird/android/model/IssueFlow;", "flow", "Lco/bird/android/model/IssueKind;", "kind", "", "error", "birdId", "Lio/reactivex/F;", "LHM4;", "", C17296a.f69688o, "Lha2;", "Lha2;", "getClient", "()Lha2;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "Lmn4;", "b", "Lmn4;", "getRatingClient", "()Lmn4;", "ratingClient", "<init>", "(Lha2;Lmn4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ma2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C45166ma2 implements InterfaceC44573la2 {

    /* renamed from: a */
    public final InterfaceC42201ha2 f98351a;

    /* renamed from: b */
    public final InterfaceC45298mn4 f98352b;

    public C45166ma2(InterfaceC42201ha2 client, InterfaceC45298mn4 ratingClient) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(ratingClient, "ratingClient");
        this.f98351a = client;
        this.f98352b = ratingClient;
    }

    @Override // p000.InterfaceC44573la2
    /* renamed from: a */
    public AbstractC23442F<HM4<Unit>> mo25422a(IssueFlow flow, IssueKind kind, String error, String birdId) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return this.f98352b.m24995a(new ProgrammaticIssueBody(flow, kind, error, birdId));
    }
}
