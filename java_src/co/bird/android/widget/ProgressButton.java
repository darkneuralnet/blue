package co.bird.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 42\u00020\u0001:\u00015B\u0011\b\u0016\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100B\u001b\b\u0016\u0012\u0006\u0010.\u001a\u00020-\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b/\u00101B#\b\u0016\u0012\u0006\u0010.\u001a\u00020-\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u00102\u001a\u00020\u0002¢\u0006\u0004\b/\u00103J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002R*\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R$\u0010&\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001aR$\u0010,\u001a\u00020'2\u0006\u0010\u000e\u001a\u00020'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u00066"}, m28432d2 = {"Lco/bird/android/widget/ProgressButton;", "Landroidx/appcompat/widget/AppCompatButton;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Landroid/util/AttributeSet;", "attrs", "b", "", "value", "Z", "getInProgress", "()Z", "setInProgress", "(Z)V", "inProgress", "c", "I", "getProgressPadding", "()I", "setProgressPadding", "(I)V", "progressPadding", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/CharSequence;", Entry.TYPE_TEXT, "LGj0;", "e", "LGj0;", "progressDrawable", "getProgressColor", "setProgressColor", "progressColor", "", "getProgressStrokeWidth", "()F", "setProgressStrokeWidth", "(F)V", "progressStrokeWidth", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "f", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nProgressButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressButton.kt\nco/bird/android/widget/ProgressButton\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,102:1\n233#2,3:103\n*S KotlinDebug\n*F\n+ 1 ProgressButton.kt\nco/bird/android/widget/ProgressButton\n*L\n95#1:103,3\n*E\n"})
/* loaded from: classes4.dex */
public final class ProgressButton extends AppCompatButton {

    /* renamed from: f */
    public static final C16559a f67512f = new C16559a(null);

    /* renamed from: b */
    public boolean f67513b;

    /* renamed from: c */
    public int f67514c;

    /* renamed from: d */
    public CharSequence f67515d;

    /* renamed from: e */
    public final C33098Gj0 f67516e;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lco/bird/android/widget/ProgressButton$a;", "", "", "DEFAULT_PROGRESS_PADDING_DP", "I", "DEFAULT_PROGRESS_STROKE_WIDTH_DP", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.ProgressButton$a */
    /* loaded from: classes4.dex */
    public static final class C16559a {
        public /* synthetic */ C16559a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16559a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.ProgressButton$b */
    /* loaded from: classes4.dex */
    public static final class C16560b extends Lambda implements Function0<Unit> {
        public C16560b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ProgressButton.this.invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressButton(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67514c = (int) C49347td3.m12001b(12);
        C33098Gj0 c33098Gj0 = new C33098Gj0();
        c33098Gj0.m104832f(new C16560b());
        this.f67516e = c33098Gj0;
    }

    /* renamed from: b */
    public final void m54468b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34290Ll4.ProgressButton);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…styleable.ProgressButton)");
        this.f67516e.m104833e(obtainStyledAttributes.getColor(C34290Ll4.ProgressButton_progressColor, -1));
        this.f67516e.m104831g(obtainStyledAttributes.getDimension(C34290Ll4.ProgressButton_strokeWidth, C49347td3.m12001b(4)));
        setProgressPadding((int) obtainStyledAttributes.getDimension(C34290Ll4.ProgressButton_progressPadding, C49347td3.m12001b(12)));
        Unit unit = Unit.INSTANCE;
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f67513b) {
            this.f67516e.draw(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < getMeasuredWidth()) {
            int measuredWidth = (getMeasuredWidth() - getMeasuredHeight()) / 2;
            C33098Gj0 c33098Gj0 = this.f67516e;
            int i3 = this.f67514c;
            c33098Gj0.setBounds(measuredWidth + i3, i3, (measuredWidth + getMeasuredHeight()) - this.f67514c, getMeasuredHeight() - this.f67514c);
            return;
        }
        int measuredHeight = (getMeasuredHeight() - getMeasuredWidth()) / 2;
        C33098Gj0 c33098Gj02 = this.f67516e;
        int i4 = this.f67514c;
        c33098Gj02.setBounds(i4, measuredHeight + i4, getMeasuredWidth() - this.f67514c, (measuredHeight + getMeasuredHeight()) - this.f67514c);
    }

    public final void setInProgress(boolean z) {
        this.f67513b = z;
        if (z) {
            this.f67515d = getText();
            setText((CharSequence) null);
        } else {
            CharSequence charSequence = this.f67515d;
            if (charSequence != null) {
                setText(charSequence);
            }
        }
        setEnabled(!this.f67513b);
        if (this.f67513b) {
            this.f67516e.start();
        } else {
            this.f67516e.stop();
        }
        invalidate();
    }

    public final void setProgressColor(int i) {
        this.f67516e.m104833e(i);
    }

    public final void setProgressPadding(int i) {
        this.f67514c = i;
        requestLayout();
    }

    public final void setProgressStrokeWidth(float f) {
        this.f67516e.m104831g(f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67514c = (int) C49347td3.m12001b(12);
        C33098Gj0 c33098Gj0 = new C33098Gj0();
        c33098Gj0.m104832f(new C16560b());
        this.f67516e = c33098Gj0;
        m54468b(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67514c = (int) C49347td3.m12001b(12);
        C33098Gj0 c33098Gj0 = new C33098Gj0();
        c33098Gj0.m104832f(new C16560b());
        this.f67516e = c33098Gj0;
        m54468b(attributeSet);
    }
}
