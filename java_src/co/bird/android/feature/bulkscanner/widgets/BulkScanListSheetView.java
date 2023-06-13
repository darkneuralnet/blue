package co.bird.android.feature.bulkscanner.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(B\u001d\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b'\u0010+B'\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010-\u001a\u00020,¢\u0006\u0004\b'\u0010.J\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0002R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR0\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b0\u001cj\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006/"}, m28432d2 = {"Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "i", "", "LH6;", "sections", "j", "LDI3;", "viewModel", "e", "k", "Le40;", "b", "Le40;", "f", "()Le40;", "birdAdapter", "Lh40;", "c", "Lh40;", "g", "()Lh40;", "partAdapter", "LRp6;", DateTokenConverter.CONVERTER_KEY, "LRp6;", "binding", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "partMaps", "Landroid/widget/Button;", "h", "()Landroid/widget/Button;", "updateButton", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class BulkScanListSheetView extends ConstraintLayout {

    /* renamed from: b */
    public final C40126e40 f63578b;

    /* renamed from: c */
    public final C41905h40 f63579c;

    /* renamed from: d */
    public final C35732Rp6 f63580d;

    /* renamed from: e */
    public final HashMap<String, DI3> f63581e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkScanListSheetView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        C40126e40 c40126e40 = new C40126e40();
        this.f63578b = c40126e40;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f63579c = new C41905h40(context2);
        LayoutInflater.from(getContext()).inflate(C35901Si4.view_bulk_scanner_list_sheet, this);
        C35732Rp6 m86277a = C35732Rp6.m86277a(this);
        Intrinsics.checkNotNullExpressionValue(m86277a, "bind(this)");
        this.f63580d = m86277a;
        m86277a.f32711b.setLayoutManager(new LinearLayoutManager(getContext()));
        m86277a.f32711b.setItemAnimator(new C34466Mf0(D62.f5249f.mo110910b()));
        m86277a.f32711b.setAdapter(c40126e40);
        this.f63581e = new HashMap<>();
    }

    /* renamed from: e */
    public final void m58535e(DI3 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (this.f63581e.get(viewModel.m110601b().getId()) == null) {
            this.f63579c.m44890w(0, viewModel);
            this.f63581e.put(viewModel.m110601b().getId(), viewModel);
            m58529k();
        }
    }

    /* renamed from: f */
    public final C40126e40 m58534f() {
        return this.f63578b;
    }

    /* renamed from: g */
    public final C41905h40 m58533g() {
        return this.f63579c;
    }

    /* renamed from: h */
    public final Button m58532h() {
        Button button = this.f63580d.f32717h;
        Intrinsics.checkNotNullExpressionValue(button, "binding.updateButton");
        return button;
    }

    /* renamed from: i */
    public final void m58531i() {
        this.f63580d.f32711b.setAdapter(this.f63579c);
    }

    /* renamed from: j */
    public final void m58530j(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f63578b.mo24871u(sections);
        m58529k();
    }

    /* renamed from: k */
    public final void m58529k() {
        this.f63580d.f32715f.setText(String.valueOf(Math.max(this.f63578b.getItemCount(), this.f63581e.size())));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkScanListSheetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        C40126e40 c40126e40 = new C40126e40();
        this.f63578b = c40126e40;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f63579c = new C41905h40(context2);
        LayoutInflater.from(getContext()).inflate(C35901Si4.view_bulk_scanner_list_sheet, this);
        C35732Rp6 m86277a = C35732Rp6.m86277a(this);
        Intrinsics.checkNotNullExpressionValue(m86277a, "bind(this)");
        this.f63580d = m86277a;
        m86277a.f32711b.setLayoutManager(new LinearLayoutManager(getContext()));
        m86277a.f32711b.setItemAnimator(new C34466Mf0(D62.f5249f.mo110910b()));
        m86277a.f32711b.setAdapter(c40126e40);
        this.f63581e = new HashMap<>();
    }

    public /* synthetic */ BulkScanListSheetView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkScanListSheetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C40126e40 c40126e40 = new C40126e40();
        this.f63578b = c40126e40;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f63579c = new C41905h40(context2);
        LayoutInflater.from(getContext()).inflate(C35901Si4.view_bulk_scanner_list_sheet, this);
        C35732Rp6 m86277a = C35732Rp6.m86277a(this);
        Intrinsics.checkNotNullExpressionValue(m86277a, "bind(this)");
        this.f63580d = m86277a;
        m86277a.f32711b.setLayoutManager(new LinearLayoutManager(getContext()));
        m86277a.f32711b.setItemAnimator(new C34466Mf0(D62.f5249f.mo110910b()));
        m86277a.f32711b.setAdapter(c40126e40);
        this.f63581e = new HashMap<>();
    }

    public /* synthetic */ BulkScanListSheetView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
