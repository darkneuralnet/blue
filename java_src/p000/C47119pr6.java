package p000;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.wire.WireMerchantTransaction;
import co.bird.android.model.wire.WireTransaction;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.networking.FraudDetectionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u0010"}, m28432d2 = {"Lpr6;", "Landroidx/recyclerview/widget/RecyclerView$D;", "Lco/bird/android/model/wire/WireMerchantTransaction;", RequestHeadersFactory.MODEL, "", C17296a.f69688o, "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", FraudDetectionData.KEY_TIMESTAMP, "c", "cost", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pr6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47119pr6 extends RecyclerView.AbstractC11834D {

    /* renamed from: b */
    public final TextView f104188b;

    /* renamed from: c */
    public final TextView f104189c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47119pr6(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f104188b = (TextView) C49520tu6.m11243h(view, C31914Bh4.timestamp);
        this.f104189c = (TextView) C49520tu6.m11243h(view, C31914Bh4.cost);
    }

    /* renamed from: a */
    public final void m18632a(WireMerchantTransaction model) {
        Intrinsics.checkNotNullParameter(model, "model");
        WireTransaction transaction = model.getTransaction();
        StringBuilder sb = new StringBuilder();
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        sb.append(c51916xx1.m4390v(transaction.getTransactionDate()));
        sb.append(" · ");
        sb.append(c51916xx1.m4392t(transaction.getTransactionDate()));
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder()\n      .a…nDate))\n      .toString()");
        this.f104188b.setText(sb2);
        this.f104189c.setText(C51916xx1.currency$default(c51916xx1, transaction.getAmount(), C45097mS5.m25591o(transaction.getCurrency()), null, 4, null));
    }
}
