package co.bird.android.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 92\u00020\u0001:\u0001:B\u0011\b\u0016\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103B\u001b\b\u0016\u0012\u0006\u00101\u001a\u000200\u0012\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b2\u00106B#\b\u0016\u0012\u0006\u00101\u001a\u000200\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\u0006\u00107\u001a\u00020\u0007¢\u0006\u0004\b2\u00108J\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0014J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R+\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R+\u0010&\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u0014\u0010(\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010*R \u0010/\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006;"}, m28432d2 = {"Lco/bird/android/widget/TaskMarkerTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "init", "Landroid/graphics/drawable/Drawable;", "background", "setBackgroundDrawable", "", "color", "setBackgroundColor", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "f", "index", "g", "LQ12;", "b", "LQ12;", "infoPillDrawable", "<set-?>", "c", "Lkotlin/reflect/KMutableProperty0;", "getBorderColor", "()I", "setBorderColor", "(I)V", "borderColor", "", DateTokenConverter.CONVERTER_KEY, "getBorderStrokeWidth", "()F", "setBorderStrokeWidth", "(F)V", "borderStrokeWidth", "e", "getInteriorPadding", "setInteriorPadding", "interiorPadding", "F", "dpToPx", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "paddingRect", "", "h", "[Landroid/graphics/drawable/Drawable;", "drawables", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "i", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class TaskMarkerTextView extends AppCompatTextView {

    /* renamed from: b */
    public final Q12 f67684b;

    /* renamed from: c */
    public final KMutableProperty0 f67685c;

    /* renamed from: d */
    public final KMutableProperty0 f67686d;

    /* renamed from: e */
    public final KMutableProperty0 f67687e;

    /* renamed from: f */
    public final float f67688f;

    /* renamed from: g */
    public Rect f67689g;

    /* renamed from: h */
    public Drawable[] f67690h;

    /* renamed from: j */
    public static final /* synthetic */ KProperty<Object>[] f67683j = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(TaskMarkerTextView.class, "borderColor", "getBorderColor()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(TaskMarkerTextView.class, "borderStrokeWidth", "getBorderStrokeWidth()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(TaskMarkerTextView.class, "interiorPadding", "getInteriorPadding()F", 0))};

    /* renamed from: i */
    public static final C16588a f67682i = new C16588a(null);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/widget/TaskMarkerTextView$a;", "", "", "TEXT_PADDING_DP", "F", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.TaskMarkerTextView$a */
    /* loaded from: classes4.dex */
    public static final class C16588a {
        public /* synthetic */ C16588a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16588a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskMarkerTextView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        Q12 q12 = new Q12(context2);
        this.f67684b = q12;
        this.f67685c = new MutablePropertyReference0Impl(q12) { // from class: co.bird.android.widget.TaskMarkerTextView.b
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Integer.valueOf(((Q12) this.receiver).m89123a());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((Q12) this.receiver).m89117g(((Number) obj).intValue());
            }
        };
        this.f67686d = new MutablePropertyReference0Impl(q12) { // from class: co.bird.android.widget.TaskMarkerTextView.c
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Float.valueOf(((Q12) this.receiver).m89122b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((Q12) this.receiver).m89116h(((Number) obj).floatValue());
            }
        };
        this.f67687e = new MutablePropertyReference0Impl(q12) { // from class: co.bird.android.widget.TaskMarkerTextView.d
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Float.valueOf(((Q12) this.receiver).m89121c());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((Q12) this.receiver).m89115i(((Number) obj).floatValue());
            }
        };
        this.f67688f = TypedValue.applyDimension(1, 1.0f, getContext().getResources().getDisplayMetrics());
        this.f67689g = new Rect();
        init();
    }

    /* renamed from: f */
    public final void m54357f() {
        this.f67690h = getCompoundDrawables();
        getBackground().getPadding(this.f67689g);
        setPadding(this.f67689g.left + m54356g(0), getPaddingTop(), this.f67689g.right + m54356g(2), getPaddingBottom());
    }

    /* renamed from: g */
    public final int m54356g(int i) {
        Drawable drawable;
        Drawable[] drawableArr = this.f67690h;
        if (drawableArr != null) {
            drawable = drawableArr[i];
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return 0;
        }
        return getCompoundDrawablePadding();
    }

    public final void init() {
        int roundToInt;
        setLayerType(1, null);
        roundToInt = MathKt__MathJVMKt.roundToInt(this.f67688f * 8.0f);
        setCompoundDrawablePadding(roundToInt);
        super.setBackgroundDrawable(this.f67684b);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        m54357f();
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f67684b.m89118f(i);
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        throw new IllegalStateException("TaskMarkerTextView can only be used with InfoPillDrawable as its background.");
    }

    public final void setBorderColor(int i) {
        C94.m112730a(this.f67685c, this, f67683j[0], Integer.valueOf(i));
    }

    public final void setBorderStrokeWidth(float f) {
        C94.m112730a(this.f67686d, this, f67683j[1], Float.valueOf(f));
    }

    public final void setInteriorPadding(float f) {
        C94.m112730a(this.f67687e, this, f67683j[2], Float.valueOf(f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskMarkerTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        Q12 q12 = new Q12(context2);
        this.f67684b = q12;
        this.f67685c = new MutablePropertyReference0Impl(q12) { // from class: co.bird.android.widget.TaskMarkerTextView.b
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Integer.valueOf(((Q12) this.receiver).m89123a());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((Q12) this.receiver).m89117g(((Number) obj).intValue());
            }
        };
        this.f67686d = new MutablePropertyReference0Impl(q12) { // from class: co.bird.android.widget.TaskMarkerTextView.c
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Float.valueOf(((Q12) this.receiver).m89122b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((Q12) this.receiver).m89116h(((Number) obj).floatValue());
            }
        };
        this.f67687e = new MutablePropertyReference0Impl(q12) { // from class: co.bird.android.widget.TaskMarkerTextView.d
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Float.valueOf(((Q12) this.receiver).m89121c());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((Q12) this.receiver).m89115i(((Number) obj).floatValue());
            }
        };
        this.f67688f = TypedValue.applyDimension(1, 1.0f, getContext().getResources().getDisplayMetrics());
        this.f67689g = new Rect();
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskMarkerTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        Q12 q12 = new Q12(context2);
        this.f67684b = q12;
        this.f67685c = new MutablePropertyReference0Impl(q12) { // from class: co.bird.android.widget.TaskMarkerTextView.b
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Integer.valueOf(((Q12) this.receiver).m89123a());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((Q12) this.receiver).m89117g(((Number) obj).intValue());
            }
        };
        this.f67686d = new MutablePropertyReference0Impl(q12) { // from class: co.bird.android.widget.TaskMarkerTextView.c
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Float.valueOf(((Q12) this.receiver).m89122b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((Q12) this.receiver).m89116h(((Number) obj).floatValue());
            }
        };
        this.f67687e = new MutablePropertyReference0Impl(q12) { // from class: co.bird.android.widget.TaskMarkerTextView.d
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Float.valueOf(((Q12) this.receiver).m89121c());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((Q12) this.receiver).m89115i(((Number) obj).floatValue());
            }
        };
        this.f67688f = TypedValue.applyDimension(1, 1.0f, getContext().getResources().getDisplayMetrics());
        this.f67689g = new Rect();
        init();
    }
}
