package co.bird.android.widget.scan;

import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\n\u0010\u000eB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/widget/scan/PDFBarcodeScanView;", "Lco/bird/android/widget/scan/BarcodeScanView;", "LPx;", "l", "LPx;", "w", "()LPx;", "analyzer", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class PDFBarcodeScanView extends BarcodeScanView {

    /* renamed from: l */
    public final C6587Px f68086l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PDFBarcodeScanView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f68086l = new C6587Px(2048);
    }

    @Override // co.bird.android.widget.scan.BarcodeScanView
    /* renamed from: w */
    public C6587Px mo54007w() {
        return this.f68086l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PDFBarcodeScanView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f68086l = new C6587Px(2048);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PDFBarcodeScanView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f68086l = new C6587Px(2048);
    }
}
