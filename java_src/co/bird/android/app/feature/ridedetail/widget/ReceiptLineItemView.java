package co.bird.android.app.feature.ridedetail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.wire.WireRideTransactionItem;
import com.facebook.share.internal.C17296a;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0012\u0010\u0016B#\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0018J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/app/feature/ridedetail/widget/ReceiptLineItemView;", "Landroid/widget/RelativeLayout;", "Lco/bird/android/model/wire/WireRideTransactionItem;", "item", "Ljava/util/Currency;", "receiptCurrency", "", "setReceiptItem", "", "amount", "", C17296a.f69688o, "LUe2;", "b", "LUe2;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ReceiptLineItemView extends RelativeLayout {

    /* renamed from: b */
    public final C36331Ue2 f62702b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptLineItemView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C36331Ue2 m81215b = C36331Ue2.m81215b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m81215b, "inflate(context.layoutInflater, this)");
        this.f62702b = m81215b;
    }

    /* renamed from: a */
    public final String m59450a(int i, Currency currency) {
        return C51916xx1.currency$default(C51916xx1.f118396a, i, currency, null, 4, null);
    }

    public final void setReceiptItem(WireRideTransactionItem item, Currency receiptCurrency) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(receiptCurrency, "receiptCurrency");
        Integer valueAmount = item.getValueAmount();
        if (valueAmount != null) {
            int intValue = valueAmount.intValue();
            this.f62702b.f37713c.setText(item.getTitle());
            this.f62702b.f37712b.setText(m59450a(intValue, receiptCurrency));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptLineItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C36331Ue2 m81215b = C36331Ue2.m81215b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m81215b, "inflate(context.layoutInflater, this)");
        this.f62702b = m81215b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptLineItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C36331Ue2 m81215b = C36331Ue2.m81215b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m81215b, "inflate(context.layoutInflater, this)");
        this.f62702b = m81215b;
    }
}
