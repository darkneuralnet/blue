package co.bird.android.feature.bulkscanner.widgets;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import ch.qos.logback.core.CoreConstants;
import co.bird.api.response.OperatorBatchError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u001d\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\f\u0010\u0010B'\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/feature/bulkscanner/widgets/BulkBatchErrorView;", "Landroidx/cardview/widget/CardView;", "Lco/bird/api/response/OperatorBatchError;", "batchError", "", "setErrorDetail", "Lcs6;", "k", "Lcs6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBulkBatchErrorView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkBatchErrorView.kt\nco/bird/android/feature/bulkscanner/widgets/BulkBatchErrorView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
/* loaded from: classes3.dex */
public final class BulkBatchErrorView extends CardView {

    /* renamed from: k */
    public final C39421cs6 f63577k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkBatchErrorView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(C35901Si4.view_operator_batch_error, this);
        C39421cs6 m44939a = C39421cs6.m44939a(this);
        Intrinsics.checkNotNullExpressionValue(m44939a, "bind(this)");
        this.f63577k = m44939a;
    }

    public final void setErrorDetail(OperatorBatchError batchError) {
        Spanned spanned;
        Intrinsics.checkNotNullParameter(batchError, "batchError");
        TextView textView = this.f63577k.f75752b;
        String message = batchError.getMessage();
        if (message != null) {
            spanned = Html.fromHtml(message);
        } else {
            spanned = null;
        }
        textView.setText(spanned);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkBatchErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(C35901Si4.view_operator_batch_error, this);
        C39421cs6 m44939a = C39421cs6.m44939a(this);
        Intrinsics.checkNotNullExpressionValue(m44939a, "bind(this)");
        this.f63577k = m44939a;
    }

    public /* synthetic */ BulkBatchErrorView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkBatchErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(C35901Si4.view_operator_batch_error, this);
        C39421cs6 m44939a = C39421cs6.m44939a(this);
        Intrinsics.checkNotNullExpressionValue(m44939a, "bind(this)");
        this.f63577k = m44939a;
    }

    public /* synthetic */ BulkBatchErrorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
