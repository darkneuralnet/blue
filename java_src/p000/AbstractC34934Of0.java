package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u00152\u00020\u0001:\u0003B\u001b\u0003B\u0011\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b@\u0010AJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J8\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J \u0010\u0015\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fH\u0016R\u0014\u0010\u001d\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R&\u0010+\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000f0%8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R,\u00101\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0,8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R,\u00104\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0,8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u00100R\u0018\u00107\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00106R0\u0010<\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020908j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u000209`:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010>¨\u0006C"}, m28432d2 = {"LOf0;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDraw", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "", "sectionSize", "sectionPosition", "adapterPosition", "viewType", "i", "j", "LH6;", "section", "idx", "", "g", "b", "I", "cardDrawableRes", "", "F", "getCardElevation", "()F", "n", "(F)V", "cardElevation", "Lkotlin/Function1;", "Landroid/content/Context;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function1;", "h", "()Lkotlin/jvm/functions/Function1;", "horizontalMargin", "Lkotlin/Function2;", "e", "Lkotlin/jvm/functions/Function2;", "l", "()Lkotlin/jvm/functions/Function2;", "verticalPaddingTop", "f", "k", "verticalPaddingBottom", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable;", "cardDrawable", "Ljava/util/HashMap;", "LOf0$b;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "drawableMap", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "shadowPaint", "<init>", "(I)V", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCardItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardItemDecoration.kt\nco/bird/android/itemdecorations/CardItemDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,259:1\n1549#2:260\n1620#2,3:261\n1855#2,2:264\n215#3,2:266\n*S KotlinDebug\n*F\n+ 1 CardItemDecoration.kt\nco/bird/android/itemdecorations/CardItemDecoration\n*L\n58#1:260\n58#1:261,3\n59#1:264,2\n81#1:266,2\n*E\n"})
/* renamed from: Of0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC34934Of0 extends RecyclerView.AbstractC11854o {

    /* renamed from: j */
    public static final C6089a f26998j = new C6089a(null);

    /* renamed from: k */
    public static final AccelerateDecelerateInterpolator f26999k = new AccelerateDecelerateInterpolator();

    /* renamed from: b */
    public final int f27000b;

    /* renamed from: c */
    public float f27001c;

    /* renamed from: g */
    public Drawable f27005g;

    /* renamed from: d */
    public final Function1<Context, Integer> f27002d = C6092d.f27013g;

    /* renamed from: e */
    public final Function2<Context, Integer, Integer> f27003e = C6094f.f27015g;

    /* renamed from: f */
    public final Function2<Context, Integer, Integer> f27004f = C6093e.f27014g;

    /* renamed from: h */
    public final HashMap<Integer, C6090b> f27006h = new HashMap<>();

    /* renamed from: i */
    public final Paint f27007i = new Paint(5);

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m28432d2 = {"LOf0$a;", "", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "INTERPOLATOR", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "", "MIN_DURATION", "J", "", "SHADOW_COLOR", "Ljava/lang/String;", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Of0$a */
    /* loaded from: classes3.dex */
    public static final class C6089a {
        public /* synthetic */ C6089a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C6089a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0003\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u001b"}, m28432d2 = {"LOf0$b;", "", "", C17296a.f69688o, "I", "b", "()I", "g", "(I)V", "height", "c", "h", "startHeight", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "()Landroid/animation/ValueAnimator;", "f", "(Landroid/animation/ValueAnimator;)V", "animator", "", "e", "()Z", "isStarted", DateTokenConverter.CONVERTER_KEY, "isAnimating", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Of0$b */
    /* loaded from: classes3.dex */
    public static final class C6090b {

        /* renamed from: a */
        public int f27008a;

        /* renamed from: b */
        public int f27009b;

        /* renamed from: c */
        public ValueAnimator f27010c;

        /* renamed from: a */
        public final ValueAnimator m91736a() {
            return this.f27010c;
        }

        /* renamed from: b */
        public final int m91735b() {
            return this.f27008a;
        }

        /* renamed from: c */
        public final int m91734c() {
            return this.f27009b;
        }

        /* renamed from: d */
        public final boolean m91733d() {
            ValueAnimator valueAnimator = this.f27010c;
            if (valueAnimator != null) {
                return valueAnimator.isRunning();
            }
            return false;
        }

        /* renamed from: e */
        public final boolean m91732e() {
            ValueAnimator valueAnimator = this.f27010c;
            if (valueAnimator != null) {
                return valueAnimator.isStarted();
            }
            return false;
        }

        /* renamed from: f */
        public final void m91731f(ValueAnimator valueAnimator) {
            this.f27010c = valueAnimator;
        }

        /* renamed from: g */
        public final void m91730g(int i) {
            this.f27008a = i;
        }

        /* renamed from: h */
        public final void m91729h(int i) {
            this.f27009b = i;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR0\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0010"}, m28432d2 = {"LOf0$c;", "", "Lkotlin/Pair;", "Landroid/view/View;", "", C17296a.f69688o, "Lkotlin/Pair;", "b", "()Lkotlin/Pair;", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/Pair;)V", "headerItem", "c", "footerItem", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Of0$c */
    /* loaded from: classes3.dex */
    public static final class C6091c {

        /* renamed from: a */
        public Pair<? extends View, Integer> f27011a;

        /* renamed from: b */
        public Pair<? extends View, Integer> f27012b;

        /* renamed from: a */
        public final Pair<View, Integer> m91728a() {
            return this.f27012b;
        }

        /* renamed from: b */
        public final Pair<View, Integer> m91727b() {
            return this.f27011a;
        }

        /* renamed from: c */
        public final void m91726c(Pair<? extends View, Integer> pair) {
            this.f27012b = pair;
        }

        /* renamed from: d */
        public final void m91725d(Pair<? extends View, Integer> pair) {
            this.f27011a = pair;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", "it", "", C17296a.f69688o, "(Landroid/content/Context;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Of0$d */
    /* loaded from: classes3.dex */
    public static final class C6092d extends Lambda implements Function1<Context, Integer> {

        /* renamed from: g */
        public static final C6092d f27013g = new C6092d();

        public C6092d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return 0;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/content/Context;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", C17296a.f69688o, "(Landroid/content/Context;I)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Of0$e */
    /* loaded from: classes3.dex */
    public static final class C6093e extends Lambda implements Function2<Context, Integer, Integer> {

        /* renamed from: g */
        public static final C6093e f27014g = new C6093e();

        public C6093e() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m91723a(Context context, int i) {
            Intrinsics.checkNotNullParameter(context, "<anonymous parameter 0>");
            return 0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Context context, Integer num) {
            return m91723a(context, num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/content/Context;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", C17296a.f69688o, "(Landroid/content/Context;I)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Of0$f */
    /* loaded from: classes3.dex */
    public static final class C6094f extends Lambda implements Function2<Context, Integer, Integer> {

        /* renamed from: g */
        public static final C6094f f27015g = new C6094f();

        public C6094f() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m91722a(Context context, int i) {
            Intrinsics.checkNotNullParameter(context, "<anonymous parameter 0>");
            return 0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Context context, Integer num) {
            return m91722a(context, num.intValue());
        }
    }

    public AbstractC34934Of0(int i) {
        this.f27000b = i;
    }

    /* renamed from: m */
    public static final void m91738m(RecyclerView parent, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(parent, "$parent");
        Intrinsics.checkNotNullParameter(it, "it");
        parent.invalidateItemDecorations();
    }

    /* renamed from: g */
    public boolean mo419g(C3023H6 section, int i) {
        Intrinsics.checkNotNullParameter(section, "section");
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C11872z state) {
        AbstractC5440My abstractC5440My;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.AbstractC11855p layoutManager = parent.getLayoutManager();
        if (layoutManager != null) {
            int m66564x0 = layoutManager.m66564x0(view);
            try {
                RecyclerView.AbstractC11843h adapter = parent.getAdapter();
                if (adapter != null) {
                    int itemViewType = adapter.getItemViewType(m66564x0);
                    RecyclerView.AbstractC11834D childViewHolder = parent.getChildViewHolder(view);
                    if (childViewHolder == null) {
                        return;
                    }
                    if (childViewHolder.getItemViewType() != itemViewType) {
                        mo416j(outRect, parent, view);
                        return;
                    }
                    RecyclerView.AbstractC11843h adapter2 = parent.getAdapter();
                    if (adapter2 instanceof AbstractC5440My) {
                        abstractC5440My = (AbstractC5440My) adapter2;
                    } else {
                        abstractC5440My = null;
                    }
                    if (abstractC5440My == null) {
                        return;
                    }
                    C2637G6 m94544p = abstractC5440My.m94544p(m66564x0);
                    C3023H6 m94543q = abstractC5440My.m94543q(m66564x0);
                    int indexOf = m94543q.m104408e().indexOf(m94544p);
                    int m104407f = abstractC5440My.m94543q(m66564x0).m104407f();
                    if (mo419g(m94543q, abstractC5440My.m94542t(m94543q))) {
                        Function1<Context, Integer> mo418h = mo418h();
                        Context context = parent.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
                        outRect.left = mo418h.invoke(context).intValue();
                        Function1<Context, Integer> mo418h2 = mo418h();
                        Context context2 = parent.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
                        outRect.right = mo418h2.invoke(context2).intValue();
                    }
                    mo417i(outRect, parent, m104407f, indexOf, m66564x0, itemViewType);
                    if (!mo419g(m94543q, abstractC5440My.m94542t(m94543q))) {
                        return;
                    }
                    if (indexOf == 0) {
                        int i = outRect.top;
                        Function2<Context, Integer, Integer> mo414l = mo414l();
                        Context context3 = parent.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "parent.context");
                        outRect.top = i + mo414l.invoke(context3, Integer.valueOf(itemViewType)).intValue();
                        return;
                    } else if (indexOf == m104407f - 1) {
                        int i2 = outRect.bottom;
                        Function2<Context, Integer, Integer> mo415k = mo415k();
                        Context context4 = parent.getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "parent.context");
                        outRect.bottom = i2 + mo415k.invoke(context4, Integer.valueOf(itemViewType)).intValue();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            } catch (IndexOutOfBoundsException unused) {
                mo416j(outRect, parent, view);
                return;
            }
        }
        mo416j(outRect, parent, view);
    }

    /* renamed from: h */
    public Function1<Context, Integer> mo418h() {
        return this.f27002d;
    }

    /* renamed from: i */
    public void mo417i(Rect outRect, RecyclerView parent, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(parent, "parent");
    }

    /* renamed from: j */
    public void mo416j(Rect outRect, RecyclerView parent, View view) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* renamed from: k */
    public Function2<Context, Integer, Integer> mo415k() {
        return this.f27004f;
    }

    /* renamed from: l */
    public Function2<Context, Integer, Integer> mo414l() {
        return this.f27003e;
    }

    /* renamed from: n */
    public final void m91737n(float f) {
        this.f27001c = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02db  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas c, final RecyclerView parent, RecyclerView.C11872z state) {
        IntRange until;
        int collectionSizeOrDefault;
        int i;
        int m12002a;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        RecyclerView.AbstractC11849m itemAnimator;
        int m91734c;
        C6090b c6090b;
        Drawable drawable;
        float f;
        Drawable drawable2;
        GradientDrawable gradientDrawable;
        Rect rect;
        Object obj;
        Integer num;
        AbstractC5440My abstractC5440My;
        Object first;
        Object last;
        C6091c c6091c;
        C6091c c6091c2;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f27005g == null) {
            this.f27005g = NA0.m94299e(parent.getContext(), this.f27000b);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i6 = 0;
        until = RangesKt___RangesKt.until(0, parent.getChildCount());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList<View> arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(parent.getChildAt(((IntIterator) it).nextInt()));
        }
        for (View child : arrayList) {
            Intrinsics.checkNotNullExpressionValue(child, "child");
            Integer m40591a = C41207ft4.m40591a(parent, child);
            if (m40591a != null) {
                int intValue = m40591a.intValue();
                RecyclerView.AbstractC11843h adapter = parent.getAdapter();
                if (adapter instanceof AbstractC5440My) {
                    abstractC5440My = (AbstractC5440My) adapter;
                } else {
                    abstractC5440My = null;
                }
                if (abstractC5440My != null) {
                    C3023H6 m94543q = abstractC5440My.m94543q(intValue);
                    int m94542t = abstractC5440My.m94542t(m94543q);
                    if (mo419g(m94543q, m94542t)) {
                        if (!linkedHashMap.containsKey(Integer.valueOf(m94542t))) {
                            linkedHashMap.put(Integer.valueOf(m94542t), new C6091c());
                        }
                        C2637G6 m94544p = abstractC5440My.m94544p(intValue);
                        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) m94543q.m104408e());
                        if (Intrinsics.areEqual(first, m94544p) && (c6091c2 = (C6091c) linkedHashMap.get(Integer.valueOf(m94542t))) != null) {
                            c6091c2.m91725d(TuplesKt.m28425to(child, Integer.valueOf(m94544p.m105817b())));
                        }
                        last = CollectionsKt___CollectionsKt.last((List<? extends Object>) m94543q.m104408e());
                        if (Intrinsics.areEqual(last, m94544p) && (c6091c = (C6091c) linkedHashMap.get(Integer.valueOf(m94542t))) != null) {
                            c6091c.m91726c(TuplesKt.m28425to(child, Integer.valueOf(m94544p.m105817b())));
                        }
                    }
                }
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int intValue2 = ((Number) entry.getKey()).intValue();
            C6091c c6091c3 = (C6091c) entry.getValue();
            Function1<Context, Integer> mo418h = mo418h();
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "parent.context");
            int intValue3 = mo418h.invoke(context).intValue();
            Pair<View, Integer> m91727b = c6091c3.m91727b();
            if (m91727b != null) {
                int top = m91727b.getFirst().getTop() + ((int) m91727b.getFirst().getTranslationY());
                Function2<Context, Integer, Integer> mo414l = mo414l();
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
                i = top - mo414l.invoke(context2, m91727b.getSecond()).intValue();
            } else {
                Context context3 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "parent.context");
                i = -((int) C49347td3.m12002a(16, context3));
            }
            int right = parent.getRight();
            Function1<Context, Integer> mo418h2 = mo418h();
            Context context4 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "parent.context");
            int intValue4 = right - mo418h2.invoke(context4).intValue();
            Pair<View, Integer> m91728a = c6091c3.m91728a();
            if (m91728a != null) {
                int bottom = m91728a.getFirst().getBottom() + ((int) m91728a.getFirst().getTranslationY());
                Function2<Context, Integer, Integer> mo415k = mo415k();
                Context context5 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "parent.context");
                m12002a = bottom + mo415k.invoke(context5, m91728a.getSecond()).intValue();
            } else {
                int bottom2 = parent.getBottom();
                Context context6 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "parent.context");
                m12002a = ((int) C49347td3.m12002a(16, context6)) + bottom2;
            }
            int i7 = m12002a - i;
            C6090b c6090b2 = this.f27006h.get(Integer.valueOf(intValue2));
            if (c6090b2 != null && c6090b2.m91733d()) {
                i2 = 1;
            } else {
                i2 = i6;
            }
            if (i2 != 0) {
                ValueAnimator m91736a = c6090b2.m91736a();
                if (m91736a != null) {
                    obj = m91736a.getAnimatedValue();
                } else {
                    obj = null;
                }
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                } else {
                    num = null;
                }
                if (num != null) {
                    m91734c = num.intValue();
                } else {
                    m91734c = i6;
                }
            } else {
                if (c6090b2 != null && c6090b2.m91732e()) {
                    i3 = 1;
                } else {
                    i3 = i6;
                }
                if (i3 != 0) {
                    m91734c = c6090b2.m91734c();
                } else {
                    if (c6090b2 != null && c6090b2.m91735b() != i7 && !c6090b2.m91733d()) {
                        int[] iArr = new int[2];
                        iArr[i6] = c6090b2.m91735b();
                        iArr[1] = i7;
                        ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
                        RecyclerView.AbstractC11849m itemAnimator2 = parent.getItemAnimator();
                        long j2 = 0;
                        if (itemAnimator2 != null) {
                            long addDuration = itemAnimator2.getAddDuration();
                            i4 = intValue2;
                            i5 = intValue3;
                            j = addDuration;
                        } else {
                            i4 = intValue2;
                            i5 = intValue3;
                            j = 0;
                        }
                        ofInt.setDuration(Math.max(j, 150L));
                        if (c6090b2.m91735b() > i7 && (itemAnimator = parent.getItemAnimator()) != null) {
                            j2 = itemAnimator.getRemoveDuration();
                        }
                        ofInt.setStartDelay(j2);
                        ofInt.setInterpolator(f26999k);
                        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Nf0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                AbstractC34934Of0.m91738m(RecyclerView.this, valueAnimator);
                            }
                        });
                        ofInt.start();
                        c6090b2.m91731f(ofInt);
                        c6090b2.m91729h(c6090b2.m91735b());
                        m12002a = i + c6090b2.m91735b();
                        if (!this.f27006h.containsKey(Integer.valueOf(i4))) {
                            this.f27006h.put(Integer.valueOf(i4), new C6090b());
                        }
                        c6090b = this.f27006h.get(Integer.valueOf(i4));
                        if (c6090b != null) {
                            c6090b.m91730g(i7);
                        }
                        drawable = this.f27005g;
                        if (drawable != null) {
                            drawable.setBounds(i5, i, intValue4, m12002a);
                        }
                        f = this.f27001c;
                        float f2 = 0.0f;
                        if (f > 0.0f) {
                            Paint paint = this.f27007i;
                            Float valueOf = Float.valueOf(f);
                            Context context7 = parent.getContext();
                            Intrinsics.checkNotNullExpressionValue(context7, "parent.context");
                            float m12002a2 = C49347td3.m12002a(valueOf, context7);
                            Float valueOf2 = Float.valueOf(this.f27001c);
                            Context context8 = parent.getContext();
                            Intrinsics.checkNotNullExpressionValue(context8, "parent.context");
                            paint.setShadowLayer(m12002a2, 0.0f, C49347td3.m12002a(valueOf2, context8) / 2, Color.parseColor("#1A000000"));
                            Drawable drawable3 = this.f27005g;
                            if (drawable3 instanceof GradientDrawable) {
                                gradientDrawable = (GradientDrawable) drawable3;
                            } else {
                                gradientDrawable = null;
                            }
                            if (gradientDrawable != null) {
                                f2 = gradientDrawable.getCornerRadius();
                            }
                            Drawable drawable4 = this.f27005g;
                            if (drawable4 != null) {
                                rect = drawable4.getBounds();
                            } else {
                                rect = null;
                            }
                            c.drawRoundRect(new RectF(rect), f2, f2, this.f27007i);
                        }
                        drawable2 = this.f27005g;
                        if (drawable2 != null) {
                            drawable2.draw(c);
                        }
                        i6 = 0;
                    }
                    i4 = intValue2;
                    i5 = intValue3;
                    if (!this.f27006h.containsKey(Integer.valueOf(i4))) {
                    }
                    c6090b = this.f27006h.get(Integer.valueOf(i4));
                    if (c6090b != null) {
                    }
                    drawable = this.f27005g;
                    if (drawable != null) {
                    }
                    f = this.f27001c;
                    float f22 = 0.0f;
                    if (f > 0.0f) {
                    }
                    drawable2 = this.f27005g;
                    if (drawable2 != null) {
                    }
                    i6 = 0;
                }
            }
            m12002a = m91734c + i;
            i4 = intValue2;
            i5 = intValue3;
            if (!this.f27006h.containsKey(Integer.valueOf(i4))) {
            }
            c6090b = this.f27006h.get(Integer.valueOf(i4));
            if (c6090b != null) {
            }
            drawable = this.f27005g;
            if (drawable != null) {
            }
            f = this.f27001c;
            float f222 = 0.0f;
            if (f > 0.0f) {
            }
            drawable2 = this.f27005g;
            if (drawable2 != null) {
            }
            i6 = 0;
        }
    }
}
