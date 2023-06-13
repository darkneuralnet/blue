package co.bird.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.US5;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,B\u0019\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b+\u0010/B!\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b+\u00102J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R$\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\n\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010#\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R$\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00063"}, m28432d2 = {"Lco/bird/android/widget/CategorySummaryView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "LUS5;", "LKf2;", "viewModel", "", "addChildren", "", "f", "Lyr6;", "b", "Lyr6;", "binding", "Landroid/widget/LinearLayout;", "c", "Landroid/widget/LinearLayout;", "()Landroid/widget/LinearLayout;", "linearLayout", "LVS5;", DateTokenConverter.CONVERTER_KEY, "LVS5;", "()LVS5;", "setManager", "(LVS5;)V", "manager", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "title", "Landroid/widget/Button;", "Landroid/widget/Button;", "getButton", "()Landroid/widget/Button;", "button", "value", "isChecked", "()Z", "setChecked", "(Z)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCategorySummaryView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CategorySummaryView.kt\nco/bird/android/widget/CategorySummaryView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1855#2,2:45\n*S KotlinDebug\n*F\n+ 1 CategorySummaryView.kt\nco/bird/android/widget/CategorySummaryView\n*L\n40#1:45,2\n*E\n"})
/* loaded from: classes4.dex */
public final class CategorySummaryView extends ConstraintLayout implements US5 {

    /* renamed from: b */
    public final C52454yr6 f67259b;

    /* renamed from: c */
    public final LinearLayout f67260c;

    /* renamed from: d */
    public VS5 f67261d;

    /* renamed from: e */
    public final TextView f67262e;

    /* renamed from: f */
    public final Button f67263f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategorySummaryView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C52454yr6 m2384b = C52454yr6.m2384b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m2384b, "inflate(context.layoutInflater, this)");
        this.f67259b = m2384b;
        LinearLayout linearLayout = m2384b.f120343d;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.linearLayout");
        this.f67260c = linearLayout;
        TextView textView = m2384b.f120344e;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.title");
        this.f67262e = textView;
        Button button = m2384b.f120341b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.button");
        this.f67263f = button;
    }

    public static /* synthetic */ void applyViewModel$default(CategorySummaryView categorySummaryView, AbstractC34000Kf2 abstractC34000Kf2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        categorySummaryView.m54642f(abstractC34000Kf2, z);
    }

    @Override // p000.US5
    /* renamed from: b */
    public VS5 mo54645b() {
        return this.f67261d;
    }

    @Override // p000.US5
    /* renamed from: c */
    public LinearLayout mo54644c() {
        return this.f67260c;
    }

    /* renamed from: e */
    public void m54643e(String str) {
        US5.C8301a.m81485a(this, str);
    }

    /* renamed from: f */
    public final void m54642f(AbstractC34000Kf2 viewModel, boolean z) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        setChecked(viewModel.m98622b());
        this.f67262e.setText(viewModel.m98620d());
        this.f67263f.setText(viewModel.m98623a());
        if (z) {
            m54641g();
            for (String str : viewModel.m98621c()) {
                m54643e(str);
            }
        }
    }

    /* renamed from: g */
    public void m54641g() {
        US5.C8301a.m81484b(this);
    }

    public final void setChecked(boolean z) {
        this.f67259b.f120342c.setChecked(z);
    }

    public void setManager(VS5 vs5) {
        this.f67261d = vs5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategorySummaryView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C52454yr6 m2384b = C52454yr6.m2384b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m2384b, "inflate(context.layoutInflater, this)");
        this.f67259b = m2384b;
        LinearLayout linearLayout = m2384b.f120343d;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.linearLayout");
        this.f67260c = linearLayout;
        TextView textView = m2384b.f120344e;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.title");
        this.f67262e = textView;
        Button button = m2384b.f120341b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.button");
        this.f67263f = button;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategorySummaryView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C52454yr6 m2384b = C52454yr6.m2384b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m2384b, "inflate(context.layoutInflater, this)");
        this.f67259b = m2384b;
        LinearLayout linearLayout = m2384b.f120343d;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.linearLayout");
        this.f67260c = linearLayout;
        TextView textView = m2384b.f120344e;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.title");
        this.f67262e = textView;
        Button button = m2384b.f120341b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.button");
        this.f67263f = button;
    }
}
