package co.bird.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005R\"\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00030\u00030\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006#"}, m28432d2 = {"Lco/bird/android/widget/IssueView;", "Lco/bird/android/widget/SelectableButton;", "Lio/reactivex/Observable;", "", "g", "", "kind", "label", "", "setIssue", "c", "Z", "f", "()Z", "setOn", "(Z)V", "on", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "e", "()Ljava/lang/String;", "setKind", "(Ljava/lang/String;)V", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/a;", "selectedSubject", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class IssueView extends SelectableButton {

    /* renamed from: c */
    public boolean f67388c;

    /* renamed from: d */
    public String f67389d;

    /* renamed from: e */
    public final C24552a<Boolean> f67390e;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.IssueView$a */
    /* loaded from: classes4.dex */
    public static final class C16534a extends Lambda implements Function1<View, Unit> {
        public C16534a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            IssueView issueView = IssueView.this;
            issueView.setOn(!issueView.m54547f());
            IssueView.this.f67390e.onNext(Boolean.valueOf(IssueView.this.m54547f()));
            boolean m54547f = IssueView.this.m54547f();
            if (m54547f) {
                IssueView.this.m54393c();
            } else if (m54547f) {
            } else {
                IssueView.this.m54394b();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IssueView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: e */
    public final String m54548e() {
        String str = this.f67389d;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("kind");
        return null;
    }

    /* renamed from: f */
    public final boolean m54547f() {
        return this.f67388c;
    }

    /* renamed from: g */
    public final Observable<Boolean> m54546g() {
        return this.f67390e;
    }

    public final void setIssue(String kind, String label) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(label, "label");
        setKind(kind);
        setText(label);
    }

    public final void setKind(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f67389d = str;
    }

    public final void setOn(boolean z) {
        this.f67388c = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IssueView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ IssueView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IssueView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C24552a<Boolean> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Boolean>()");
        this.f67390e = m31922e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C37044Xf4.bird_issue_option_button_height));
        Resources resources = getResources();
        int i2 = C37044Xf4.bird_issue_option_side_margin;
        layoutParams.leftMargin = resources.getDimensionPixelSize(i2);
        layoutParams.rightMargin = getResources().getDimensionPixelSize(i2);
        layoutParams.bottomMargin = getResources().getDimensionPixelSize(C37044Xf4.bird_issue_option_bottom_margin);
        setLayoutParams(layoutParams);
        setTextColor(NA0.m94301c(context, C32364Df4.black));
        setBackgroundResource(C33309Hg4.button_pill_selector_disabled);
        setTextSize(16.0f);
        setGravity(17);
        C34585Ms2.m94661j(this, new C16534a());
    }
}
