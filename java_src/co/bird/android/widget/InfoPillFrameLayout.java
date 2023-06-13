package co.bird.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.widget.InfoPillFrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 +2\u00020\u0001:\u0001\u0005B\u0011\b\u0016\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'B\u001b\b\u0016\u0012\u0006\u0010%\u001a\u00020$\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b&\u0010(B#\b\u0016\u0012\u0006\u0010%\u001a\u00020$\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010)\u001a\u00020\t¢\u0006\u0004\b&\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\tH\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR+\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R+\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR+\u0010#\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001e¨\u0006,"}, m28432d2 = {"Lco/bird/android/widget/InfoPillFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/util/AttributeSet;", "attrs", "", "b", "Landroid/graphics/drawable/Drawable;", "background", "setBackgroundDrawable", "", "visibility", "setVisibility", "color", "setBackgroundColor", "LQ12;", "LQ12;", "infoPillDrawable", "<set-?>", "c", "Lkotlin/reflect/KMutableProperty0;", "getBorderColor", "()I", "setBorderColor", "(I)V", "borderColor", "", DateTokenConverter.CONVERTER_KEY, "getBorderStrokeWidth", "()F", "setBorderStrokeWidth", "(F)V", "borderStrokeWidth", "e", "getInteriorPadding", "setInteriorPadding", "interiorPadding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "f", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class InfoPillFrameLayout extends FrameLayout {

    /* renamed from: b */
    public final Q12 f67366b;

    /* renamed from: c */
    public final KMutableProperty0 f67367c;

    /* renamed from: d */
    public final KMutableProperty0 f67368d;

    /* renamed from: e */
    public final KMutableProperty0 f67369e;

    /* renamed from: g */
    public static final /* synthetic */ KProperty<Object>[] f67365g = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(InfoPillFrameLayout.class, "borderColor", "getBorderColor()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(InfoPillFrameLayout.class, "borderStrokeWidth", "getBorderStrokeWidth()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(InfoPillFrameLayout.class, "interiorPadding", "getInteriorPadding()F", 0))};

    /* renamed from: f */
    public static final C16517b f67364f = new C16517b(null);

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, m28432d2 = {"co/bird/android/widget/InfoPillFrameLayout$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "", "getOutline", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInfoPillFrameLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfoPillFrameLayout.kt\nco/bird/android/widget/InfoPillFrameLayout$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
    /* renamed from: co.bird.android.widget.InfoPillFrameLayout$a */
    /* loaded from: classes4.dex */
    public static final class C16516a extends ViewOutlineProvider {
        public C16516a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (outline != null) {
                InfoPillFrameLayout.this.f67366b.getOutline(outline);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/widget/InfoPillFrameLayout$b;", "", "", "DEFAULT_BORDER_COLOR", "I", "", "DEFAULT_BORDER_WIDTH", "F", "DEFAULT_INTERIOR_PADDING_DP", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.InfoPillFrameLayout$b */
    /* loaded from: classes4.dex */
    public static final class C16517b {
        public /* synthetic */ C16517b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16517b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoPillFrameLayout(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        Q12 q12 = new Q12(context2);
        this.f67366b = q12;
        this.f67367c = new MutablePropertyReference0Impl(q12) { // from class: co.bird.android.widget.InfoPillFrameLayout.c
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Integer.valueOf(((Q12) this.receiver).m89123a());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((Q12) this.receiver).m89117g(((Number) obj).intValue());
            }
        };
        this.f67368d = new MutablePropertyReference0Impl(q12) { // from class: co.bird.android.widget.InfoPillFrameLayout.d
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Float.valueOf(((Q12) this.receiver).m89122b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((Q12) this.receiver).m89116h(((Number) obj).floatValue());
            }
        };
        this.f67369e = new MutablePropertyReference0Impl(q12) { // from class: co.bird.android.widget.InfoPillFrameLayout.e
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Float.valueOf(((Q12) this.receiver).m89121c());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((Q12) this.receiver).m89115i(((Number) obj).floatValue());
            }
        };
        setOutlineProvider(new C16516a());
        m54562b(null);
    }

    /* renamed from: c */
    public static final void m54561c(InfoPillFrameLayout this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.invalidateOutline();
    }

    /* renamed from: b */
    public final void m54562b(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C34290Ll4.InfoPillView, 0, 0);
            try {
                setBorderColor(obtainStyledAttributes.getColor(C34290Ll4.InfoPillView_borderColor, -16777216));
                setBorderStrokeWidth(obtainStyledAttributes.getDimension(C34290Ll4.InfoPillView_borderWidth, 1.0f));
                int i = C34290Ll4.InfoPillView_interiorPadding;
                Float valueOf = Float.valueOf(2.0f);
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                setInteriorPadding(obtainStyledAttributes.getDimension(i, C49347td3.m12002a(valueOf, context)));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        setBackground(this.f67366b);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f67366b.m89118f(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable instanceof Q12) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        throw new IllegalStateException("InfoPillView can only be used with InfoPillDrawable as its background.");
    }

    public final void setBorderColor(int i) {
        C94.m112730a(this.f67367c, this, f67365g[0], Integer.valueOf(i));
    }

    public final void setBorderStrokeWidth(float f) {
        C94.m112730a(this.f67368d, this, f67365g[1], Float.valueOf(f));
    }

    public final void setInteriorPadding(float f) {
        C94.m112730a(this.f67369e, this, f67365g[2], Float.valueOf(f));
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        post(new Runnable() { // from class: R12
            @Override // java.lang.Runnable
            public final void run() {
                InfoPillFrameLayout.m54561c(InfoPillFrameLayout.this);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoPillFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        Q12 q12 = new Q12(context2);
        this.f67366b = q12;
        this.f67367c = new MutablePropertyReference0Impl(q12) { // from class: co.bird.android.widget.InfoPillFrameLayout.c
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Integer.valueOf(((Q12) this.receiver).m89123a());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((Q12) this.receiver).m89117g(((Number) obj).intValue());
            }
        };
        this.f67368d = new MutablePropertyReference0Impl(q12) { // from class: co.bird.android.widget.InfoPillFrameLayout.d
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Float.valueOf(((Q12) this.receiver).m89122b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((Q12) this.receiver).m89116h(((Number) obj).floatValue());
            }
        };
        this.f67369e = new MutablePropertyReference0Impl(q12) { // from class: co.bird.android.widget.InfoPillFrameLayout.e
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Float.valueOf(((Q12) this.receiver).m89121c());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((Q12) this.receiver).m89115i(((Number) obj).floatValue());
            }
        };
        setOutlineProvider(new C16516a());
        m54562b(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoPillFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        Q12 q12 = new Q12(context2);
        this.f67366b = q12;
        this.f67367c = new MutablePropertyReference0Impl(q12) { // from class: co.bird.android.widget.InfoPillFrameLayout.c
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Integer.valueOf(((Q12) this.receiver).m89123a());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((Q12) this.receiver).m89117g(((Number) obj).intValue());
            }
        };
        this.f67368d = new MutablePropertyReference0Impl(q12) { // from class: co.bird.android.widget.InfoPillFrameLayout.d
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Float.valueOf(((Q12) this.receiver).m89122b());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((Q12) this.receiver).m89116h(((Number) obj).floatValue());
            }
        };
        this.f67369e = new MutablePropertyReference0Impl(q12) { // from class: co.bird.android.widget.InfoPillFrameLayout.e
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Float.valueOf(((Q12) this.receiver).m89121c());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((Q12) this.receiver).m89115i(((Number) obj).floatValue());
            }
        };
        setOutlineProvider(new C16516a());
        m54562b(attributeSet);
    }
}
