package co.bird.android.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.widget.BottomSheetOptionLayout;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001)B%\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#B\u001b\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b\"\u0010&B#\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010'\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u001c\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002J\u0014\u0010\u0012\u001a\u00020\u0004*\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\u0003\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001f\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006*"}, m28432d2 = {"Lco/bird/android/widget/BottomSheetOptionLayout;", "Landroidx/core/widget/NestedScrollView;", "", "title", "", "setTitle", "subtitle", "setSubtitle", "Lco/bird/android/widget/d;", "option", "Landroid/view/View;", "V", "Lco/bird/android/widget/BottomSheetOptionLayout$a;", "layout", "", "headerGravity", "b0", "Landroidx/appcompat/widget/AppCompatTextView;", "W", "Landroid/widget/TextView;", "Z", "()Landroid/widget/TextView;", "Y", "Landroid/widget/Space;", "a0", "()Landroid/widget/Space;", "titleSpace", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "X", "()Landroid/widget/LinearLayout;", "linearLayout", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Lco/bird/android/widget/BottomSheetOptionLayout$a;I)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBottomSheetOptionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetOptionLayout.kt\nco/bird/android/widget/BottomSheetOptionLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,145:1\n1#2:146\n9#3,4:147\n9#3,4:151\n*S KotlinDebug\n*F\n+ 1 BottomSheetOptionLayout.kt\nco/bird/android/widget/BottomSheetOptionLayout\n*L\n75#1:147,4\n76#1:151,4\n*E\n"})
/* loaded from: classes4.dex */
public final class BottomSheetOptionLayout extends NestedScrollView {

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/widget/BottomSheetOptionLayout$a;", "", "", "b", "I", "()I", "layoutId", "<init>", "(Ljava/lang/String;II)V", "c", DateTokenConverter.CONVERTER_KEY, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.BottomSheetOptionLayout$a */
    /* loaded from: classes4.dex */
    public enum EnumC16469a {
        NORMAL(C45268mk4.bottom_sheet_option_layout),
        SMALL_TITLE(C45268mk4.bottom_sheet_option_layout_small_title);
        

        /* renamed from: b */
        public final int f67208b;

        EnumC16469a(int i) {
            this.f67208b = i;
        }

        /* renamed from: b */
        public final int m54704b() {
            return this.f67208b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetOptionLayout(Context context, EnumC16469a layout, int i) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layout, "layout");
        m54708b0(layout, i);
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m54707c0(BottomSheetOptionLayout bottomSheetOptionLayout, EnumC16469a enumC16469a, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            enumC16469a = EnumC16469a.NORMAL;
        }
        if ((i2 & 2) != 0) {
            i = 8388611;
        }
        bottomSheetOptionLayout.m54708b0(enumC16469a, i);
    }

    /* renamed from: d0 */
    public static final void m54706d0(BottomSheetOptionLayout this$0, int i) {
        int height;
        WindowManager windowManager;
        Display defaultDisplay;
        Context context;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (ViewParent parent = this$0.getParent(); parent.getParent().getParent() != null; parent = parent.getParent()) {
        }
        this$0.m54710Z().setGravity(i);
        this$0.m54711Y().setGravity(i);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Context context2 = this$0.getContext();
        Activity activity = null;
        if (!(context2 instanceof Activity)) {
            context2 = null;
        }
        Activity activity2 = (Activity) context2;
        if (activity2 == null) {
            Context context3 = this$0.getContext();
            if (!(context3 instanceof ContextThemeWrapper)) {
                context3 = null;
            }
            ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) context3;
            if (contextThemeWrapper != null) {
                context = contextThemeWrapper.getBaseContext();
            } else {
                context = null;
            }
            if (context instanceof Activity) {
                activity = context;
            }
            activity2 = activity;
        }
        if (activity2 != null && (windowManager = activity2.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        ViewGroup.LayoutParams layoutParams = this$0.getLayoutParams();
        if (this$0.m54712X().getHeight() > displayMetrics.heightPixels) {
            height = -1;
        } else {
            height = this$0.m54712X().getHeight();
        }
        layoutParams.height = height;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b6, code lost:
        if (r5 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003b, code lost:
        if (r3 != null) goto L5;
     */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View m54714V(InterfaceC16662d option) {
        String mo13232e;
        boolean z;
        Intrinsics.checkNotNullParameter(option, "option");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        C9430XZ m76853c = C9430XZ.m76853c(C40788fB0.m41772j(context), this, false);
        Intrinsics.checkNotNullExpressionValue(m76853c, "inflate(context.layoutInflater, this, false)");
        m54712X().addView(m76853c.getRoot());
        AppCompatTextView appCompatTextView = m76853c.f43399e;
        Integer mo13236a = option.mo13236a();
        if (mo13236a != null) {
            mo13232e = getResources().getString(mo13236a.intValue());
        }
        mo13232e = option.mo13232e();
        appCompatTextView.setText(mo13232e);
        AppCompatTextView appCompatTextView2 = m76853c.f43398d;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.secondaryText");
        m54713W(appCompatTextView2, option);
        Integer color = option.getColor();
        if (color != null) {
            m76853c.f43399e.setTextColor(NA0.m94301c(getContext(), color.intValue()));
        }
        ImageView imageView = m76853c.f43397c;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.icon");
        if (option.getIcon() == null && option.mo13233d() == null) {
            z = false;
        } else {
            z = true;
        }
        Unit unit = null;
        C49520tu6.show$default(imageView, z, 0, 2, null);
        Integer icon = option.getIcon();
        if (icon != null) {
            m76853c.f43397c.setImageDrawable(NA0.m94299e(getContext(), icon.intValue()));
            Integer mo13234c = option.mo13234c();
            if (mo13234c != null) {
                m76853c.f43397c.setImageTintList(ColorStateList.valueOf(NA0.m94301c(getContext(), mo13234c.intValue())));
                unit = Unit.INSTANCE;
            }
        }
        String mo13233d = option.mo13233d();
        if (mo13233d != null) {
            ComponentCallbacks2C17096a.m53138t(getContext()).m81653k(mo13233d).m16096R0(m76853c.f43397c);
        }
        if (option.mo13235b()) {
            ViewGroup.LayoutParams layoutParams = m76853c.f43399e.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams).addRule(13, -1);
        }
        Integer mo13229h = option.mo13229h();
        if (mo13229h != null) {
            m76853c.f43396b.setImageResource(mo13229h.intValue());
            ImageView imageView2 = m76853c.f43396b;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.endIcon");
            C49520tu6.m11233r(imageView2);
        }
        RelativeLayout root = m76853c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    /* renamed from: W */
    public final void m54713W(AppCompatTextView appCompatTextView, InterfaceC16662d interfaceC16662d) {
        Unit unit;
        Integer mo13228i = interfaceC16662d.mo13228i();
        if (mo13228i != null) {
            appCompatTextView.setText(appCompatTextView.getResources().getString(mo13228i.intValue()));
            unit = Unit.INSTANCE;
        } else {
            String mo13230g = interfaceC16662d.mo13230g();
            if (mo13230g != null) {
                appCompatTextView.setText(mo13230g);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
        }
        if (unit == null) {
            C49520tu6.m11239l(appCompatTextView);
        }
    }

    /* renamed from: X */
    public final LinearLayout m54712X() {
        return (LinearLayout) findViewById(C52955zi4.linearLayout);
    }

    /* renamed from: Y */
    public final TextView m54711Y() {
        View findViewById = findViewById(C52955zi4.subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.subtitle)");
        return (TextView) findViewById;
    }

    /* renamed from: Z */
    public final TextView m54710Z() {
        View findViewById = findViewById(C52955zi4.title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.title)");
        return (TextView) findViewById;
    }

    /* renamed from: a0 */
    public final Space m54709a0() {
        View findViewById = findViewById(C52955zi4.titleSpace);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.titleSpace)");
        return (Space) findViewById;
    }

    /* renamed from: b0 */
    public final void m54708b0(EnumC16469a enumC16469a, final int i) {
        LayoutInflater.from(getContext()).inflate(enumC16469a.m54704b(), (ViewGroup) this, true);
        post(new Runnable() { // from class: YZ
            @Override // java.lang.Runnable
            public final void run() {
                BottomSheetOptionLayout.m54706d0(BottomSheetOptionLayout.this, i);
            }
        });
    }

    public final void setSubtitle(CharSequence charSequence) {
        boolean isBlank;
        boolean z = true;
        if (charSequence != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(charSequence);
            if (!isBlank) {
                m54711Y().setText(charSequence);
                C49520tu6.show$default(m54711Y(), true, 0, 2, null);
                Space m54709a0 = m54709a0();
                if (!C49520tu6.m11230u(m54710Z()) && !C49520tu6.m11230u(m54711Y())) {
                    z = false;
                }
                C49520tu6.show$default(m54709a0, z, 0, 2, null);
            }
        }
        C49520tu6.show$default(m54711Y(), false, 0, 2, null);
        Space m54709a02 = m54709a0();
        if (!C49520tu6.m11230u(m54710Z())) {
            z = false;
        }
        C49520tu6.show$default(m54709a02, z, 0, 2, null);
    }

    public final void setTitle(CharSequence charSequence) {
        boolean isBlank;
        boolean z = true;
        if (charSequence != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(charSequence);
            if (!isBlank) {
                m54710Z().setText(charSequence);
                C49520tu6.show$default(m54710Z(), true, 0, 2, null);
                Space m54709a0 = m54709a0();
                if (!C49520tu6.m11230u(m54710Z()) && !C49520tu6.m11230u(m54711Y())) {
                    z = false;
                }
                C49520tu6.show$default(m54709a0, z, 0, 2, null);
            }
        }
        C49520tu6.show$default(m54710Z(), false, 0, 2, null);
        Space m54709a02 = m54709a0();
        if (!C49520tu6.m11230u(m54710Z())) {
            z = false;
        }
        C49520tu6.show$default(m54709a02, z, 0, 2, null);
    }

    public /* synthetic */ BottomSheetOptionLayout(Context context, EnumC16469a enumC16469a, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? EnumC16469a.NORMAL : enumC16469a, (i2 & 4) != 0 ? 8388611 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetOptionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        m54707c0(this, null, 0, 3, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetOptionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        m54707c0(this, null, 0, 3, null);
    }
}
