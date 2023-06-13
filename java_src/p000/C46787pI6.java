package p000;

import co.bird.android.model.ZendeskUrl;
import co.bird.api.request.ZendeskLoginRequestBody;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\f"}, m28432d2 = {"LpI6;", "LoI6;", "", "url", "Lio/reactivex/F;", "Lco/bird/android/model/ZendeskUrl;", C17296a.f69688o, "LmI6;", "LmI6;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "<init>", "(LmI6;)V", "zendesk_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pI6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46787pI6 implements InterfaceC46194oI6 {

    /* renamed from: a */
    public final InterfaceC45008mI6 f103443a;

    public C46787pI6(InterfaceC45008mI6 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f103443a = client;
    }

    @Override // p000.InterfaceC46194oI6
    /* renamed from: a */
    public AbstractC23442F<ZendeskUrl> mo19559a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return this.f103443a.m25834a(new ZendeskLoginRequestBody(url));
    }
}
