package p000;

import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.RatingBar;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004\u001a/\u0010\f\u001a\u00020\u0003*\u00020\u00072#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0001\u001a9\u0010\u000b\u001a\u00020\u0003*\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2#\u0010\u000f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0001\u001aB\u0010\u0013\u001a\u00020\u0003*\u00020\u000726\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00030\u0010\u001a/\u0010\u0014\u001a\u00020\u0003*\u00020\u00072#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00110\u0001\u001aB\u0010\n\u001a\u00020\u0003*\u00020\u000726\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00110\u0010\u001a+\u0010\u001a\u001a\u00020\u0003*\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u00172\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004\u001aD\u0010\u001e\u001a\u00020\u0003*\u00020\u001b28\u0010\u000b\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\u001b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00030\u0010\u001aY\u0010%\u001a\u00020\u0003*\u00020\u001f2M\u0010\u000b\u001aI\u0012\u0015\u0012\u0013\u0018\u00010\u001f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\"¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00030 \u001a[\u0010)\u001a\u00020\u0003*\u00020\u00002O\u0010\u000b\u001aK\u0012\u0015\u0012\u0013\u0018\u00010\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110&¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b('\u0012\u0015\u0012\u0013\u0018\u00010(¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00110 ¨\u0006*"}, m28432d2 = {"Landroid/widget/TextView;", "Lkotlin/Function1;", "LHJ6;", "", "Lkotlin/ExtensionFunctionType;", "init", "x", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "v", "l", "j", "", "debounceTime", "action", "Lkotlin/Function2;", "", "hasFocus", "o", "r", "Landroid/view/MotionEvent;", "event", "Landroid/widget/AdapterView;", "Landroid/widget/Adapter;", "LGJ6;", "q", "Landroid/widget/CompoundButton;", "buttonView", "isChecked", "h", "Landroid/widget/RatingBar;", "Lkotlin/Function3;", "ratingBar", "", "rating", "fromUser", "t", "", "actionId", "Landroid/view/KeyEvent;", "m", "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Ms2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34585Ms2 {

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, m28432d2 = {"Ms2$a", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "view", "", "onClick", "", "b", "J", "lastClickTime", "extension_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ms2$a */
    /* loaded from: classes3.dex */
    public static final class View$OnClickListenerC5405a implements View.OnClickListener {

        /* renamed from: b */
        public long f23695b;

        /* renamed from: c */
        public final /* synthetic */ long f23696c;

        /* renamed from: d */
        public final /* synthetic */ Function1<View, Unit> f23697d;

        /* JADX WARN: Multi-variable type inference failed */
        public View$OnClickListenerC5405a(long j, Function1<? super View, Unit> function1) {
            this.f23696c = j;
            this.f23697d = function1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SystemClock.elapsedRealtime() - this.f23695b < this.f23696c) {
                return;
            }
            this.f23697d.invoke(view);
            this.f23695b = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: h */
    public static final void m94663h(CompoundButton compoundButton, final Function2<? super CompoundButton, ? super Boolean, Unit> l) {
        Intrinsics.checkNotNullParameter(compoundButton, "<this>");
        Intrinsics.checkNotNullParameter(l, "l");
        compoundButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Gs2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton2, boolean z) {
                C34585Ms2.m94662i(Function2.this, compoundButton2, z);
            }
        });
    }

    /* renamed from: i */
    public static final void m94662i(Function2 tmp0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(compoundButton, Boolean.valueOf(z));
    }

    /* renamed from: j */
    public static final void m94661j(View view, final Function1<? super View, Unit> l) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(l, "l");
        view.setOnClickListener(new View.OnClickListener() { // from class: Ls2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C34585Ms2.m94660k(Function1.this, view2);
            }
        });
    }

    /* renamed from: k */
    public static final void m94660k(Function1 tmp0, View view) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(view);
    }

    /* renamed from: l */
    public static final void m94659l(View view, long j, Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        view.setOnClickListener(new View$OnClickListenerC5405a(j, action));
    }

    /* renamed from: m */
    public static final void m94658m(TextView textView, final Function3<? super TextView, ? super Integer, ? super KeyEvent, Boolean> l) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(l, "l");
        textView.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: Hs2
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i, KeyEvent keyEvent) {
                boolean m94657n;
                m94657n = C34585Ms2.m94657n(Function3.this, textView2, i, keyEvent);
                return m94657n;
            }
        });
    }

    /* renamed from: n */
    public static final boolean m94657n(Function3 tmp0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(textView, Integer.valueOf(i), keyEvent)).booleanValue();
    }

    /* renamed from: o */
    public static final void m94656o(View view, final Function2<? super View, ? super Boolean, Unit> l) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(l, "l");
        view.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: Fs2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                C34585Ms2.m94655p(Function2.this, view2, z);
            }
        });
    }

    public static /* synthetic */ void onClickWithThrottle$default(View view, long j, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        m94659l(view, j, function1);
    }

    /* renamed from: p */
    public static final void m94655p(Function2 tmp0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(view, Boolean.valueOf(z));
    }

    /* renamed from: q */
    public static final void m94654q(AdapterView<? extends Adapter> adapterView, Function1<? super GJ6, Unit> init) {
        Intrinsics.checkNotNullParameter(adapterView, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        GJ6 gj6 = new GJ6();
        init.invoke(gj6);
        adapterView.setOnItemSelectedListener(gj6);
    }

    /* renamed from: r */
    public static final void m94653r(View view, final Function1<? super View, Boolean> l) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(l, "l");
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: Ks2
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                boolean m94652s;
                m94652s = C34585Ms2.m94652s(Function1.this, view2);
                return m94652s;
            }
        });
    }

    /* renamed from: s */
    public static final boolean m94652s(Function1 tmp0, View view) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(view)).booleanValue();
    }

    /* renamed from: t */
    public static final void m94651t(RatingBar ratingBar, final Function3<? super RatingBar, ? super Float, ? super Boolean, Unit> l) {
        Intrinsics.checkNotNullParameter(ratingBar, "<this>");
        Intrinsics.checkNotNullParameter(l, "l");
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: Is2
            @Override // android.widget.RatingBar.OnRatingBarChangeListener
            public final void onRatingChanged(RatingBar ratingBar2, float f, boolean z) {
                C34585Ms2.m94650u(Function3.this, ratingBar2, f, z);
            }
        });
    }

    /* renamed from: u */
    public static final void m94650u(Function3 tmp0, RatingBar ratingBar, float f, boolean z) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(ratingBar, Float.valueOf(f), Boolean.valueOf(z));
    }

    /* renamed from: v */
    public static final void m94649v(View view, final Function2<? super View, ? super MotionEvent, Boolean> l) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(l, "l");
        view.setOnTouchListener(new View.OnTouchListener() { // from class: Js2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean m94648w;
                m94648w = C34585Ms2.m94648w(Function2.this, view2, motionEvent);
                return m94648w;
            }
        });
    }

    /* renamed from: w */
    public static final boolean m94648w(Function2 tmp0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(view, motionEvent)).booleanValue();
    }

    /* renamed from: x */
    public static final void m94647x(TextView textView, Function1<? super HJ6, Unit> init) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        HJ6 hj6 = new HJ6();
        init.invoke(hj6);
        textView.addTextChangedListener(hj6);
    }
}
