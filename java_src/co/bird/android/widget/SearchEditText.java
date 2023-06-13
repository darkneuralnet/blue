package co.bird.android.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatTextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0003$\u000e\u0011B'\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\tH\u0002R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001a¨\u0006%"}, m28432d2 = {"Lco/bird/android/widget/SearchEditText;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyPreIme", "show", "", "setClearIndicatorVisibility$widget_release", "(Z)V", "setClearIndicatorVisibility", "f", "b", "I", "textHintColor", "c", "iconColor", "Landroid/graphics/drawable/Drawable;", DateTokenConverter.CONVERTER_KEY, "Landroid/graphics/drawable/Drawable;", "icon", "e", "close", "", "Ljava/lang/String;", "hint", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "g", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class SearchEditText extends AppCompatTextView {

    /* renamed from: g */
    public static final C16578b f67639g = new C16578b(null);

    /* renamed from: h */
    public static final int f67640h = 1;

    /* renamed from: i */
    public static final int f67641i = 2;

    /* renamed from: j */
    public static final int f67642j = 3;

    /* renamed from: b */
    public final int f67643b;

    /* renamed from: c */
    public final int f67644c;

    /* renamed from: d */
    public final Drawable f67645d;

    /* renamed from: e */
    public final Drawable f67646e;

    /* renamed from: f */
    public final String f67647f;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, m28432d2 = {"Lco/bird/android/widget/SearchEditText$a;", "Landroid/view/View$OnTouchListener;", "Landroid/view/View;", "v", "Landroid/view/MotionEvent;", "event", "", "onTouch", "<init>", "(Lco/bird/android/widget/SearchEditText;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.SearchEditText$a */
    /* loaded from: classes4.dex */
    public final class View$OnTouchListenerC16577a implements View.OnTouchListener {
        public View$OnTouchListenerC16577a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View v, MotionEvent event) {
            Drawable drawable;
            Intrinsics.checkNotNullParameter(v, "v");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event.getAction() == 1 && (drawable = SearchEditText.this.getCompoundDrawables()[SearchEditText.f67641i]) != null && event.getRawX() >= (SearchEditText.this.getRight() - SearchEditText.this.getPaddingRight()) - drawable.getBounds().width()) {
                SearchEditText.this.setText("");
                return false;
            }
            return false;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, m28432d2 = {"Lco/bird/android/widget/SearchEditText$b;", "", "", "BOTTOM", "I", "LEFT", "RIGHT", "TOP", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.SearchEditText$b */
    /* loaded from: classes4.dex */
    public static final class C16578b {
        public /* synthetic */ C16578b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16578b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/widget/SearchEditText$c;", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "<init>", "(Lco/bird/android/widget/SearchEditText;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.SearchEditText$c */
    /* loaded from: classes4.dex */
    public final class C16579c implements TextWatcher {
        public C16579c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            boolean z;
            Intrinsics.checkNotNullParameter(s, "s");
            SearchEditText searchEditText = SearchEditText.this;
            if (s.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            searchEditText.setClearIndicatorVisibility$widget_release(z);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchEditText(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: f */
    public final void m54395f() {
        setClearIndicatorVisibility$widget_release(false);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getKeyCode() == 4 && event.getAction() == 1) {
            clearFocus();
            Object systemService = getContext().getApplicationContext().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 0);
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    public final void setClearIndicatorVisibility$widget_release(boolean z) {
        if (z) {
            setCompoundDrawablesWithIntrinsicBounds(this.f67645d, (Drawable) null, this.f67646e, (Drawable) null);
        } else {
            setCompoundDrawablesWithIntrinsicBounds(this.f67645d, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SearchEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable mutate = C40788fB0.m41773i(context, C48193rg4.ic_search_old).mutate();
        Intrinsics.checkNotNullExpressionValue(mutate, "context.getDrawableCompa…e.ic_search_old).mutate()");
        this.f67645d = mutate;
        int m94301c = NA0.m94301c(context, C32364Df4.lighterGray);
        this.f67644c = m94301c;
        Drawable m41769m = C40788fB0.m41769m(context, C48193rg4.ic_close, C48183rf4.navigationColorControlNormal, C40788fB0.m41776f(context, C32364Df4.birdNewRoad), true);
        this.f67646e = m41769m;
        this.f67647f = getHint().toString();
        setBackgroundColor(-1);
        setCompoundDrawablesWithIntrinsicBounds(mutate, (Drawable) null, m41769m, (Drawable) null);
        C42529i71.m34432a(mutate, m94301c);
        this.f67643b = getCurrentHintTextColor();
        setFocusableInTouchMode(true);
        setFocusable(true);
        setCompoundDrawablePadding(C49520tu6.m11248c(this, 10.0f));
        setOnTouchListener(new View$OnTouchListenerC16577a());
        addTextChangedListener(new C16579c());
        setMaxLines(1);
        m54395f();
    }
}
