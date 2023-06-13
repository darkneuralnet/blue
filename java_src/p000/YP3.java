package p000;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b.\u0010/J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0010J\u001a\u0010\u0016\u001a\u00020\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0014J\u0006\u0010\u0017\u001a\u00020\u0006R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\"R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001dR\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010,¨\u00060"}, m28432d2 = {"LYP3;", "", "", "peekHeight", "", "duration", "", DateTokenConverter.CONVERTER_KEY, "Landroid/view/View;", "itemView", "k", "", "key", "c", "additionalPeekHeight", "b", "", "i", "animateImmediately", "f", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "g", "h", "Landroidx/recyclerview/widget/RecyclerView;", C17296a.f69688o, "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "value", "I", "getPeekHeight", "()I", "j", "(I)V", "Lkotlin/jvm/functions/Function1;", "peekHeightChanges", "", "Ljava/util/Map;", "peekViews", "e", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "peekHeightAnimator", "Landroid/os/Handler;", "Landroid/os/Handler;", "uiThreadHandler", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: YP3 */
/* loaded from: classes4.dex */
public class YP3 {

    /* renamed from: a */
    public final RecyclerView f45854a;

    /* renamed from: b */
    public int f45855b;

    /* renamed from: c */
    public Function1<? super Integer, Unit> f45856c;

    /* renamed from: d */
    public final Map<CharSequence, View> f45857d;

    /* renamed from: e */
    public int f45858e;

    /* renamed from: f */
    public ValueAnimator f45859f;

    /* renamed from: g */
    public final Handler f45860g;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: YP3$a */
    /* loaded from: classes4.dex */
    public static final class C9770a extends Lambda implements Function1<Integer, Unit> {

        /* renamed from: g */
        public static final C9770a f45861g = new C9770a();

        public C9770a() {
            super(1);
        }

        public final void invoke(int i) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"YP3$b", "Ljava/lang/Runnable;", "", "run", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPeekHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeekHelper.kt\nco/bird/android/utility/PeekHelper$recomputeAndSetPeekHeight$updateRunnable$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
    /* renamed from: YP3$b */
    /* loaded from: classes4.dex */
    public static final class RunnableC9771b implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Ref.IntRef f45863c;

        public RunnableC9771b(Ref.IntRef intRef) {
            this.f45863c = intRef;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            int measuredHeight;
            YP3 yp3 = YP3.this;
            Iterator it = YP3.this.f45857d.values().iterator();
            int i = 0;
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                View view = (View) it.next();
                Rect rect = new Rect();
                RecyclerView recyclerView = yp3.f45854a;
                if (recyclerView != null) {
                    recyclerView.getDecoratedBoundsWithMargins(view, rect);
                }
                Integer valueOf = Integer.valueOf(rect.bottom - rect.top);
                if (valueOf.intValue() <= 0) {
                    z = false;
                }
                if (!z) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    measuredHeight = valueOf.intValue();
                } else {
                    measuredHeight = view.getMeasuredHeight();
                }
                i += measuredHeight;
            }
            int i2 = i + YP3.this.f45858e;
            int i3 = this.f45863c.element;
            if (i2 == i3) {
                z = false;
            }
            C41318g46.m40163a("Previously calculated peek height: " + i3 + " | " + i2, new Object[0]);
            this.f45863c.element = i2;
            if (z) {
                YP3.this.f45860g.postDelayed(this, 150L);
            } else {
                YP3.this.m75092d(i2, 150L);
            }
        }
    }

    public YP3(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f45854a = recyclerView;
        this.f45856c = C9770a.f45861g;
        this.f45857d = new LinkedHashMap();
        this.f45860g = new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ void clearPeekViews$default(YP3 yp3, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearPeekViews");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        yp3.m75090f(z);
    }

    /* renamed from: e */
    public static final void m75091e(YP3 this$0, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this$0.m75086j(((Integer) animatedValue).intValue());
    }

    /* renamed from: b */
    public final void m75094b(int i) {
        this.f45858e = i;
    }

    /* renamed from: c */
    public final void m75093c(CharSequence key, View itemView) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        if (Intrinsics.areEqual(this.f45857d.get(key), itemView)) {
            return;
        }
        C41318g46.m40163a("Adding PeekView: " + ((Object) key), new Object[0]);
        this.f45857d.put(key, itemView);
        m75088h();
    }

    /* renamed from: d */
    public final void m75092d(int i, long j) {
        if (this.f45855b == i) {
            return;
        }
        ValueAnimator valueAnimator = this.f45859f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofInt(this.f45855b, i).setDuration(j);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: XP3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                YP3.m75091e(YP3.this, valueAnimator2);
            }
        });
        this.f45859f = duration;
        duration.start();
    }

    /* renamed from: f */
    public final void m75090f(boolean z) {
        this.f45857d.clear();
        this.f45858e = 0;
        if (z) {
            m75092d(0, 150L);
        }
    }

    /* renamed from: g */
    public final void m75089g(Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f45856c = listener;
    }

    /* renamed from: h */
    public final void m75088h() {
        this.f45860g.removeCallbacksAndMessages(null);
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        this.f45860g.post(new RunnableC9771b(intRef));
    }

    /* renamed from: i */
    public final boolean m75087i(CharSequence key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f45857d.containsKey(key)) {
            this.f45857d.remove(key);
            m75088h();
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m75086j(int i) {
        this.f45855b = i;
        this.f45856c.invoke(Integer.valueOf(i));
    }

    /* renamed from: k */
    public final void m75085k(View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        C41318g46.m40163a("updatePeekHeightToViewHeight", new Object[0]);
        m75090f(false);
        this.f45857d.put("", itemView);
        m75088h();
    }
}
