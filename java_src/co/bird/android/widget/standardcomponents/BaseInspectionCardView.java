package co.bird.android.widget.standardcomponents;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AB\u0019\b\u0016\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010C\u001a\u00020B¢\u0006\u0004\b@\u0010DB!\b\u0016\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010F\u001a\u00020E¢\u0006\u0004\b@\u0010GJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u001c\u0010\u0007\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00020\u0004J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0014\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0006\u0010\u000e\u001a\u00020\u0002R6\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\u00188DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001b\u0010%\u001a\u00020!8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R&\u0010.\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010-R.\u00104\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b/\u00101\"\u0004\b2\u00103R'\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0002058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107R'\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0002058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b;\u0010\u001a\u0012\u0004\b<\u00109\u001a\u0004\b;\u00107¨\u0006H"}, m28432d2 = {"Lco/bird/android/widget/standardcomponents/BaseInspectionCardView;", "Lco/bird/android/widget/standardcomponents/InspectionCard;", "", "onFinishInflate", "Lkotlin/Function1;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "enabled", "setEnabled", "", "LH6;", "sections", "B", "u", "LMy;", "value", "o", "LMy;", "getAdapter", "()LMy;", "setAdapter", "(LMy;)V", "adapter", "Landroid/widget/Button;", "p", "Lkotlin/Lazy;", "y", "()Landroid/widget/Button;", "passButton", "q", "w", "failButton", "Landroidx/recyclerview/widget/RecyclerView;", "r", "A", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "LZj0;", "s", "LZj0;", "detector", "t", "Z", "initialized", "Lkotlin/jvm/functions/Function1;", "toggleListener", "v", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setAccepted", "(Ljava/lang/Boolean;)V", "accepted", "Lio/reactivex/Observable;", "z", "()Lio/reactivex/Observable;", "getPassClicks$annotations", "()V", "passClicks", "x", "getFailClicks$annotations", "failClicks", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseInspectionCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseInspectionCardView.kt\nco/bird/android/widget/standardcomponents/BaseInspectionCardView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1855#2,2:99\n1855#2,2:101\n*S KotlinDebug\n*F\n+ 1 BaseInspectionCardView.kt\nco/bird/android/widget/standardcomponents/BaseInspectionCardView\n*L\n45#1:99,2\n49#1:101,2\n*E\n"})
/* loaded from: classes4.dex */
public abstract class BaseInspectionCardView extends InspectionCard {

    /* renamed from: o */
    public AbstractC5440My<?> f68101o;

    /* renamed from: p */
    public final Lazy f68102p;

    /* renamed from: q */
    public final Lazy f68103q;

    /* renamed from: r */
    public final Lazy f68104r;

    /* renamed from: s */
    public final C37544Zj0 f68105s;

    /* renamed from: t */
    public boolean f68106t;

    /* renamed from: u */
    public Function1<? super Boolean, Unit> f68107u;

    /* renamed from: v */
    public Boolean f68108v;

    /* renamed from: w */
    public final Lazy f68109w;

    /* renamed from: x */
    public final Lazy f68110x;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Landroid/widget/Button;", "kotlin.jvm.PlatformType", "b", "()Landroid/widget/Button;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.standardcomponents.BaseInspectionCardView$a */
    /* loaded from: classes4.dex */
    public static final class C16691a extends Lambda implements Function0<Button> {
        public C16691a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Button invoke() {
            return (Button) BaseInspectionCardView.this.findViewById(C52955zi4.fail);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.standardcomponents.BaseInspectionCardView$b */
    /* loaded from: classes4.dex */
    public static final class C16692b extends Lambda implements Function0<Observable<Unit>> {
        public C16692b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            return C44626lf5.clicksThrottle$default(BaseInspectionCardView.this.m53978w(), 0L, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "v", "Landroid/view/MotionEvent;", "event", "", C17296a.f69688o, "(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.standardcomponents.BaseInspectionCardView$c */
    /* loaded from: classes4.dex */
    public static final class C16693c extends Lambda implements Function2<View, MotionEvent, Boolean> {
        public C16693c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(View v, MotionEvent event) {
            Intrinsics.checkNotNullParameter(v, "v");
            Intrinsics.checkNotNullParameter(event, "event");
            if (BaseInspectionCardView.this.f68105s.m72646a(event)) {
                BaseInspectionCardView baseInspectionCardView = BaseInspectionCardView.this;
                Boolean m53979v = baseInspectionCardView.m53979v();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.areEqual(m53979v, bool)) {
                    bool = null;
                }
                baseInspectionCardView.setAccepted(bool);
            }
            return Boolean.FALSE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "<anonymous parameter 0>", "Landroid/view/MotionEvent;", "event", "", C17296a.f69688o, "(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.standardcomponents.BaseInspectionCardView$d */
    /* loaded from: classes4.dex */
    public static final class C16694d extends Lambda implements Function2<View, MotionEvent, Boolean> {
        public C16694d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(View view, MotionEvent event) {
            Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(event, "event");
            if (BaseInspectionCardView.this.f68105s.m72646a(event)) {
                BaseInspectionCardView baseInspectionCardView = BaseInspectionCardView.this;
                Boolean m53979v = baseInspectionCardView.m53979v();
                Boolean bool = Boolean.FALSE;
                if (Intrinsics.areEqual(m53979v, bool)) {
                    bool = null;
                }
                baseInspectionCardView.setAccepted(bool);
            }
            return Boolean.FALSE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Landroid/widget/Button;", "kotlin.jvm.PlatformType", "b", "()Landroid/widget/Button;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.standardcomponents.BaseInspectionCardView$e */
    /* loaded from: classes4.dex */
    public static final class C16695e extends Lambda implements Function0<Button> {
        public C16695e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Button invoke() {
            return (Button) BaseInspectionCardView.this.findViewById(C52955zi4.pass);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.standardcomponents.BaseInspectionCardView$f */
    /* loaded from: classes4.dex */
    public static final class C16696f extends Lambda implements Function0<Observable<Unit>> {
        public C16696f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            return C44626lf5.clicksThrottle$default(BaseInspectionCardView.this.m53976y(), 0L, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "b", "()Landroidx/recyclerview/widget/RecyclerView;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.standardcomponents.BaseInspectionCardView$g */
    /* loaded from: classes4.dex */
    public static final class C16697g extends Lambda implements Function0<RecyclerView> {
        public C16697g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final RecyclerView invoke() {
            return (RecyclerView) BaseInspectionCardView.this.findViewById(C52955zi4.recyclerView);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseInspectionCardView(Context context) {
        super(context);
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Intrinsics.checkNotNullParameter(context, "context");
        lazy = LazyKt__LazyJVMKt.lazy(new C16695e());
        this.f68102p = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C16691a());
        this.f68103q = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C16697g());
        this.f68104r = lazy3;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f68105s = new C37544Zj0(context2);
        lazy4 = LazyKt__LazyJVMKt.lazy(new C16696f());
        this.f68109w = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new C16692b());
        this.f68110x = lazy5;
    }

    @Deprecated(message = "Should not be exposing an RxStream from a View. Use toggleChanges() instead")
    public static /* synthetic */ void getFailClicks$annotations() {
    }

    @Deprecated(message = "Should not be exposing an RxStream from a View. Use toggleChanges() instead")
    public static /* synthetic */ void getPassClicks$annotations() {
    }

    /* renamed from: A */
    public final RecyclerView m53983A() {
        Object value = this.f68104r.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-recyclerView>(...)");
        return (RecyclerView) value;
    }

    /* renamed from: B */
    public final void m53982B(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        AbstractC5440My<?> abstractC5440My = this.f68101o;
        if (abstractC5440My != null) {
            abstractC5440My.mo24871u(sections);
        }
    }

    /* renamed from: C */
    public final void m53981C(Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f68107u = listener;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        List<Drawable> filterNotNull;
        List<Drawable> filterNotNull2;
        super.onFinishInflate();
        if (this.f68106t) {
            return;
        }
        m53983A().setLayoutManager(new LinearLayoutManager(getContext()));
        m53983A().setItemAnimator(new C11894g());
        Drawable[] compoundDrawablesRelative = m53976y().getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative, "passButton.compoundDrawablesRelative");
        filterNotNull = ArraysKt___ArraysKt.filterNotNull(compoundDrawablesRelative);
        for (Drawable drawable : filterNotNull) {
            drawable.setTintList(NA0.m94300d(getContext(), C32364Df4.inspection_button_state_list));
        }
        Drawable[] compoundDrawablesRelative2 = m53978w().getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative2, "failButton.compoundDrawablesRelative");
        filterNotNull2 = ArraysKt___ArraysKt.filterNotNull(compoundDrawablesRelative2);
        for (Drawable drawable2 : filterNotNull2) {
            drawable2.setTintList(NA0.m94300d(getContext(), C32364Df4.inspection_button_state_list));
        }
        C34585Ms2.m94649v(m53976y(), new C16693c());
        C34585Ms2.m94649v(m53978w(), new C16694d());
        this.f68106t = true;
    }

    @Override // co.bird.android.widget.standardcomponents.InspectionCard
    public void setAccepted(Boolean bool) {
        this.f68108v = bool;
        m53976y().setSelected(Intrinsics.areEqual(this.f68108v, Boolean.TRUE));
        m53978w().setSelected(Intrinsics.areEqual(this.f68108v, Boolean.FALSE));
        Function1<? super Boolean, Unit> function1 = this.f68107u;
        if (function1 != null) {
            function1.invoke(this.f68108v);
        }
    }

    public final void setAdapter(AbstractC5440My<?> abstractC5440My) {
        this.f68101o = abstractC5440My;
        m53983A().setAdapter(this.f68101o);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        m53976y().setEnabled(z);
        m53978w().setEnabled(z);
    }

    /* renamed from: u */
    public final void m53980u() {
        List emptyList;
        AbstractC5440My<?> abstractC5440My = this.f68101o;
        if (abstractC5440My != null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            abstractC5440My.mo24871u(emptyList);
        }
    }

    /* renamed from: v */
    public Boolean m53979v() {
        return this.f68108v;
    }

    /* renamed from: w */
    public final Button m53978w() {
        Object value = this.f68103q.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-failButton>(...)");
        return (Button) value;
    }

    /* renamed from: x */
    public final Observable<Unit> m53977x() {
        return (Observable) this.f68110x.getValue();
    }

    /* renamed from: y */
    public final Button m53976y() {
        Object value = this.f68102p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-passButton>(...)");
        return (Button) value;
    }

    /* renamed from: z */
    public final Observable<Unit> m53975z() {
        return (Observable) this.f68109w.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseInspectionCardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        lazy = LazyKt__LazyJVMKt.lazy(new C16695e());
        this.f68102p = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C16691a());
        this.f68103q = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C16697g());
        this.f68104r = lazy3;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f68105s = new C37544Zj0(context2);
        lazy4 = LazyKt__LazyJVMKt.lazy(new C16696f());
        this.f68109w = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new C16692b());
        this.f68110x = lazy5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseInspectionCardView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        lazy = LazyKt__LazyJVMKt.lazy(new C16695e());
        this.f68102p = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C16691a());
        this.f68103q = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C16697g());
        this.f68104r = lazy3;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f68105s = new C37544Zj0(context2);
        lazy4 = LazyKt__LazyJVMKt.lazy(new C16696f());
        this.f68109w = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new C16692b());
        this.f68110x = lazy5;
    }
}
