package co.bird.android.app.feature.ridedetail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.wire.WireRideTransactionItem;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0013J\u001c\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\t\u001a\u00020\u0007H\u0002¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/app/feature/ridedetail/widget/ReceiptLayout;", "Landroid/widget/LinearLayout;", "", "Lco/bird/android/model/wire/WireRideTransactionItem;", "lineItems", "", "receiptCurrency", "", C17296a.f69688o, "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ReceiptLayout extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptLayout(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        m59451b();
    }

    /* renamed from: a */
    public final void m59452a(List<WireRideTransactionItem> lineItems, String receiptCurrency) {
        int roundToInt;
        int roundToInt2;
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(receiptCurrency, "receiptCurrency");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        roundToInt = MathKt__MathJVMKt.roundToInt(C49347td3.m12002a(12, context));
        layoutParams.topMargin = roundToInt;
        layoutParams.bottomMargin = roundToInt;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        roundToInt2 = MathKt__MathJVMKt.roundToInt(C49347td3.m12002a(16, context2));
        layoutParams.leftMargin = roundToInt2;
        layoutParams.rightMargin = roundToInt2;
        for (WireRideTransactionItem wireRideTransactionItem : lineItems) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            ReceiptLineItemView receiptLineItemView = new ReceiptLineItemView(context3);
            receiptLineItemView.setReceiptItem(wireRideTransactionItem, C45097mS5.m25591o(receiptCurrency));
            addView(receiptLineItemView, layoutParams);
        }
    }

    /* renamed from: b */
    public final void m59451b() {
        LayoutInflater.from(getContext()).inflate(C39311cj4.view_receipt, this);
        setOrientation(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        m59451b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        m59451b();
    }
}
