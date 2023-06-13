package co.bird.android.feature.commandcenter.vehicledetails.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
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
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$B\u0019\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b#\u0010'B!\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b#\u0010*J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\b\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010 \u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006+"}, m28432d2 = {"Lco/bird/android/feature/commandcenter/vehicledetails/views/PastWorkOrderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "LUS5;", "LbJ3;", "viewModel", "", "f", "Landroid/widget/LinearLayout;", "b", "Landroid/widget/LinearLayout;", "c", "()Landroid/widget/LinearLayout;", "linearLayout", "LVS5;", "LVS5;", "()LVS5;", "setManager", "(LVS5;)V", "manager", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/TextView;", "getIssues", "()Landroid/widget/TextView;", "issues", "e", "getDate", "date", "Landroid/widget/Button;", "Landroid/widget/Button;", "h", "()Landroid/widget/Button;", "details", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPastWorkOrderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PastWorkOrderView.kt\nco/bird/android/feature/commandcenter/vehicledetails/views/PastWorkOrderView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1855#2,2:41\n*S KotlinDebug\n*F\n+ 1 PastWorkOrderView.kt\nco/bird/android/feature/commandcenter/vehicledetails/views/PastWorkOrderView\n*L\n37#1:41,2\n*E\n"})
/* loaded from: classes3.dex */
public final class PastWorkOrderView extends ConstraintLayout implements US5 {

    /* renamed from: b */
    public final LinearLayout f63679b;

    /* renamed from: c */
    public VS5 f63680c;

    /* renamed from: d */
    public final TextView f63681d;

    /* renamed from: e */
    public final TextView f63682e;

    /* renamed from: f */
    public final Button f63683f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PastWorkOrderView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C36369Ui4.view_command_center_past_work_order, this, true);
        View findViewById = findViewById(C42273hh4.linearLayout);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.linearLayout)");
        this.f63679b = (LinearLayout) findViewById;
        View findViewById2 = findViewById(C42273hh4.issues);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.issues)");
        this.f63681d = (TextView) findViewById2;
        View findViewById3 = findViewById(C42273hh4.date);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.date)");
        this.f63682e = (TextView) findViewById3;
        View findViewById4 = findViewById(C42273hh4.details);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(R.id.details)");
        this.f63683f = (Button) findViewById4;
    }

    @Override // p000.US5
    /* renamed from: b */
    public VS5 mo54645b() {
        return this.f63680c;
    }

    @Override // p000.US5
    /* renamed from: c */
    public LinearLayout mo54644c() {
        return this.f63679b;
    }

    /* renamed from: e */
    public void m58457e(String str) {
        US5.C8301a.m81485a(this, str);
    }

    /* renamed from: f */
    public final void m58456f(C38474bJ3 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f63681d.setText(viewModel.m64688d());
        this.f63682e.setText(viewModel.m64687e());
        m58455g();
        for (String str : viewModel.m64689c()) {
            m58457e(str);
        }
    }

    /* renamed from: g */
    public void m58455g() {
        US5.C8301a.m81484b(this);
    }

    /* renamed from: h */
    public final Button m58454h() {
        return this.f63683f;
    }

    public void setManager(VS5 vs5) {
        this.f63680c = vs5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PastWorkOrderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C36369Ui4.view_command_center_past_work_order, this, true);
        View findViewById = findViewById(C42273hh4.linearLayout);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.linearLayout)");
        this.f63679b = (LinearLayout) findViewById;
        View findViewById2 = findViewById(C42273hh4.issues);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.issues)");
        this.f63681d = (TextView) findViewById2;
        View findViewById3 = findViewById(C42273hh4.date);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.date)");
        this.f63682e = (TextView) findViewById3;
        View findViewById4 = findViewById(C42273hh4.details);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(R.id.details)");
        this.f63683f = (Button) findViewById4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PastWorkOrderView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C36369Ui4.view_command_center_past_work_order, this, true);
        View findViewById = findViewById(C42273hh4.linearLayout);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.linearLayout)");
        this.f63679b = (LinearLayout) findViewById;
        View findViewById2 = findViewById(C42273hh4.issues);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.issues)");
        this.f63681d = (TextView) findViewById2;
        View findViewById3 = findViewById(C42273hh4.date);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.date)");
        this.f63682e = (TextView) findViewById3;
        View findViewById4 = findViewById(C42273hh4.details);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(R.id.details)");
        this.f63683f = (Button) findViewById4;
    }
}
