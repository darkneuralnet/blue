package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0012\u0010\t\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007\u001a\u0012\u0010\u000b\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007\u001a\u0012\u0010\f\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002\u001a\u001c\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u001a\u0016\u0010\u0013\u001a\u00020\u0002*\u00020\u00002\b\b\u0001\u0010\u0012\u001a\u00020\u0002H\u0007\u001a\u0014\u0010\u0014\u001a\u00020\u0002*\u00020\u00002\b\b\u0001\u0010\u0012\u001a\u00020\u0002\u001a\n\u0010\u0015\u001a\u00020\r*\u00020\u0000\u001a\n\u0010\u0016\u001a\u00020\u0010*\u00020\u0000\u001a\u0012\u0010\u001a\u001a\u00020\u0010*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0018\u001a\n\u0010\u001b\u001a\u00020\u0010*\u00020\u0000\u001a\u001e\u0010\u001e\u001a\u00020\u0010*\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u001a\u0014\u0010 \u001a\u00020\u0010*\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u0007\u001a\u001a\u0010$\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0002\u001a\u001a\u0010(\u001a\u00020\u0010*\u00020\u00002\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&\u001a\u0012\u0010+\u001a\u00020\u0010*\u00020)2\u0006\u0010*\u001a\u00020\r\u001a\u0012\u0010/\u001a\u00020\u0010*\u00020,2\u0006\u0010.\u001a\u00020-\u001a\u001e\u00101\u001a\u00020\u0010*\u00020\u00002\b\b\u0002\u00100\u001a\u00020&2\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u001a\u0014\u00102\u001a\u00020\u0010*\u00020\u00002\b\b\u0002\u00100\u001a\u00020&\"\u0015\u00106\u001a\u000203*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, m28432d2 = {"Landroid/view/View;", "T", "", "id", "h", "(Landroid/view/View;I)Landroid/view/View;", "m", "", "px", "n", "dp", "c", DateTokenConverter.CONVERTER_KEY, "", "show", "hiddenState", "", "s", "resId", "j", "k", "u", "r", "Landroid/widget/TextView;", "", "value", "t", "l", "", Entry.TYPE_TEXT, "p", "distance", "b", "Landroid/graphics/drawable/Drawable;", "drawable", "color", "o", "view", "", "animationDuration", "f", "Landroid/view/MenuItem;", "visible", "q", "Landroid/widget/EditText;", "Landroid/text/InputFilter;", "filter", C17296a.f69688o, "durationMs", "g", "e", "Landroid/app/Activity;", "i", "(Landroid/view/View;)Landroid/app/Activity;", "activity", "widget_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: tu6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49520tu6 {

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"tu6$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: tu6$a */
    /* loaded from: classes4.dex */
    public static final class C28961a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f111362a;

        /* renamed from: b */
        public final /* synthetic */ int f111363b;

        public C28961a(View view, int i) {
            this.f111362a = view;
            this.f111363b = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.f111362a.setVisibility(this.f111363b);
            this.f111362a.setAlpha(1.0f);
        }
    }

    /* renamed from: a */
    public static final void m11250a(EditText editText, InputFilter filter) {
        Object[] plus;
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(filter, "filter");
        InputFilter[] filters = editText.getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "filters");
        plus = ArraysKt___ArraysJvmKt.plus(filters, filter);
        editText.setFilters((InputFilter[]) plus);
    }

    public static /* synthetic */ void animateSlideUp$default(View view, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 100.0f;
        }
        m11249b(view, f);
    }

    /* renamed from: b */
    public static final void m11249b(View view, float f) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTranslationY(f);
        view.animate().setDuration(500L).translationY(-f).setInterpolator(new OvershootInterpolator()).setStartDelay(50L).start();
    }

    /* renamed from: c */
    public static final int m11248c(View view, float f) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (int) (f * view.getContext().getResources().getDisplayMetrics().density);
    }

    /* renamed from: d */
    public static final int m11247d(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (int) (i * view.getContext().getResources().getDisplayMetrics().density);
    }

    /* renamed from: e */
    public static final void m11246e(View view, long j) {
        boolean z;
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.animate().cancel();
        if (view.getVisibility() == 0) {
            if (view.getAlpha() == 1.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
        }
        if (view.getVisibility() == 8 || view.getVisibility() == 4) {
            view.setAlpha(0.0f);
            m11233r(view);
        }
        view.animate().setDuration(((float) j) * (1 - view.getAlpha())).alpha(1.0f).setListener(null);
    }

    /* renamed from: f */
    public static final void m11245f(View view, View view2, long j) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(view2, "view");
        view.animate().alpha(0.0f).setDuration(j);
        view2.animate().alpha(1.0f).setDuration(j);
        view2.bringToFront();
    }

    public static /* synthetic */ void fadeIn$default(View view, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 700;
        }
        m11246e(view, j);
    }

    public static /* synthetic */ void fadeOut$default(View view, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = 700;
        }
        if ((i2 & 2) != 0) {
            i = 8;
        }
        m11244g(view, j, i);
    }

    /* renamed from: g */
    public static final void m11244g(View view, long j, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.animate().cancel();
        if (view.getVisibility() != 8 && view.getVisibility() != 4) {
            if (view.getAlpha() == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                view.animate().setDuration(((float) j) * view.getAlpha()).alpha(0.0f).setListener(new C28961a(view, i));
            }
        }
    }

    /* renamed from: h */
    public static final <T extends View> T m11243h(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        T t = (T) view.findViewById(i);
        Intrinsics.checkNotNullExpressionValue(t, "findViewById(id)");
        return t;
    }

    /* renamed from: i */
    public static final Activity m11242i(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getContext() instanceof Activity) {
            Context context = view.getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            return (Activity) context;
        }
        Context context2 = view.getContext();
        while (context2 instanceof ContextWrapper) {
            if (context2 instanceof Activity) {
                return (Activity) context2;
            }
            context2 = ((ContextWrapper) context2).getBaseContext();
            if (context2 == null) {
                throw new UnsupportedOperationException("No base Activity context for this View");
            }
        }
        throw new UnsupportedOperationException("No base Activity context for this View");
    }

    /* renamed from: j */
    public static final int m11241j(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return C40788fB0.m41776f(context, i);
    }

    /* renamed from: k */
    public static final int m11240k(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getContext().getResources().getDimensionPixelSize(i);
    }

    /* renamed from: l */
    public static final void m11239l(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(8);
    }

    /* renamed from: m */
    public static final <T extends View> T m11238m(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (T) view.findViewById(i);
    }

    /* renamed from: n */
    public static final int m11237n(View view, float f) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (int) (f / view.getContext().getResources().getDisplayMetrics().density);
    }

    /* renamed from: o */
    public static final void m11236o(View view, Drawable drawable, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        drawable.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: p */
    public static final void m11235p(TextView textView, CharSequence charSequence, int i) {
        boolean z;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setText(charSequence);
        textView.setMovementMethod(new ScrollingMovementMethod());
        if (charSequence != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(charSequence);
            if (!isBlank) {
                z = false;
                m11232s(textView, !z, i);
            }
        }
        z = true;
        m11232s(textView, !z, i);
    }

    /* renamed from: q */
    public static final void m11234q(MenuItem menuItem, boolean z) {
        Intrinsics.checkNotNullParameter(menuItem, "<this>");
        menuItem.setVisible(z);
    }

    /* renamed from: r */
    public static final void m11233r(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(0);
    }

    /* renamed from: s */
    public static final void m11232s(View view, boolean z, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    public static /* synthetic */ void setTextAndVisibility$default(TextView textView, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8;
        }
        m11235p(textView, charSequence, i);
    }

    public static /* synthetic */ void show$default(View view, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8;
        }
        m11232s(view, z, i);
    }

    /* renamed from: t */
    public static final void m11231t(TextView textView, String value) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        textView.setVisibility(0);
        textView.setText(value);
    }

    /* renamed from: u */
    public static final boolean m11230u(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }
}
