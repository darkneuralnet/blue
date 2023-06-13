package co.bird.android.widget;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.persistence.OperatorOptionFilter;
import co.bird.android.model.persistence.nestedstructures.OperatorFilterOption;
import co.bird.android.widget.RangeFilterCardView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-B\u0019\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b,\u0010.B!\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b,\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R)\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u000f0\u000f0\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R0\u0010)\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00062"}, m28432d2 = {"Lco/bird/android/widget/RangeFilterCardView;", "Landroidx/cardview/widget/CardView;", "", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/util/AttributeSet;", "attrs", "v", "Lio/reactivex/disposables/c;", "w", "Lco/bird/android/widget/RangeFilterView;", "k", "Lco/bird/android/widget/RangeFilterView;", "rangeFilterView", "La94;", "Lco/bird/android/model/persistence/OperatorOptionFilter;", "l", "La94;", "filtersRelay", "m", "Lio/reactivex/disposables/c;", "rangeChangeDisposable", "LZ84;", "kotlin.jvm.PlatformType", "n", "Lkotlin/Lazy;", "getFiltersPropertyObservable", "()LZ84;", "filtersPropertyObservable", "filter", "t", "()Lco/bird/android/model/persistence/OperatorOptionFilter;", "setFilter", "(Lco/bird/android/model/persistence/OperatorOptionFilter;)V", "", "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;", "list", "u", "()Ljava/util/List;", "setOptions", "(Ljava/util/List;)V", "options", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRangeFilterCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RangeFilterCardView.kt\nco/bird/android/widget/RangeFilterCardView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,89:1\n350#2,7:90\n378#2,7:98\n1#3:97\n52#4,2:105\n*S KotlinDebug\n*F\n+ 1 RangeFilterCardView.kt\nco/bird/android/widget/RangeFilterCardView\n*L\n52#1:90,7\n53#1:98,7\n74#1:105,2\n*E\n"})
/* loaded from: classes4.dex */
public final class RangeFilterCardView extends CardView {

    /* renamed from: k */
    public final RangeFilterView f67533k;

    /* renamed from: l */
    public final C37791a94<OperatorOptionFilter> f67534l;

    /* renamed from: m */
    public InterfaceC23465c f67535m;

    /* renamed from: n */
    public final Lazy f67536n;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "Lco/bird/android/model/persistence/OperatorOptionFilter;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.RangeFilterCardView$a */
    /* loaded from: classes4.dex */
    public static final class C16563a extends Lambda implements Function0<Z84<OperatorOptionFilter>> {
        public C16563a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<OperatorOptionFilter> invoke() {
            return Z84.f47888d.m73663b(RangeFilterCardView.this.f67534l);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: co.bird.android.widget.RangeFilterCardView$b */
    /* loaded from: classes4.dex */
    public static final class C16564b<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C16564b<T1, T2, R> f67538a = new C16564b<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRangeFilterCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RangeFilterCardView.kt\nco/bird/android/widget/RangeFilterCardView$listenForRangeChanges$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n1559#2:90\n1590#2,4:91\n*S KotlinDebug\n*F\n+ 1 RangeFilterCardView.kt\nco/bird/android/widget/RangeFilterCardView$listenForRangeChanges$1\n*L\n80#1:90\n80#1:91,4\n*E\n"})
    /* renamed from: co.bird.android.widget.RangeFilterCardView$c */
    /* loaded from: classes4.dex */
    public static final class C16565c extends Lambda implements Function1<Pair<? extends Integer, ? extends Integer>, Unit> {
        public C16565c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Integer, ? extends Integer> pair) {
            invoke2((Pair<Integer, Integer>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Integer, Integer> pair) {
            int collectionSizeOrDefault;
            OperatorOptionFilter copy;
            List listOf;
            int intValue = pair.component1().intValue();
            int intValue2 = pair.component2().intValue();
            RangeFilterCardView rangeFilterCardView = RangeFilterCardView.this;
            OperatorOptionFilter m54457t = rangeFilterCardView.m54457t();
            List<OperatorFilterOption> options = RangeFilterCardView.this.m54457t().getOptions();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(options, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            int i = 0;
            for (Object obj : options) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                OperatorFilterOption operatorFilterOption = (OperatorFilterOption) obj;
                Integer valueOf = Integer.valueOf(i);
                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)});
                arrayList.add(OperatorFilterOption.copy$default(operatorFilterOption, null, null, null, C10733aZ.m71221a(valueOf, listOf), null, null, 55, null));
                i = i2;
            }
            copy = m54457t.copy((r24 & 1) != 0 ? m54457t.f66683id : null, (r24 & 2) != 0 ? m54457t.kind : null, (r24 & 4) != 0 ? m54457t.ordinal : 0, (r24 & 8) != 0 ? m54457t.type : null, (r24 & 16) != 0 ? m54457t.label : null, (r24 & 32) != 0 ? m54457t.options : arrayList, (r24 & 64) != 0 ? m54457t.logicOperator : null, (r24 & 128) != 0 ? m54457t.icon : null, (r24 & 256) != 0 ? m54457t.iconColor : null, (r24 & 512) != 0 ? m54457t.coloredIcon : null, (r24 & 1024) != 0 ? m54457t.iconBackgroundColor : null);
            rangeFilterCardView.setFilter(copy);
            RangeFilterCardView.this.f67534l.accept(RangeFilterCardView.this.m54457t());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.RangeFilterCardView$d */
    /* loaded from: classes4.dex */
    public static final class C16566d extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C16566d f67540g = new C16566d();

        public C16566d() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeFilterCardView(Context context) {
        super(context);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_range_filter_card, this, true);
        setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_vertical_margin));
        setBackground(new ColorDrawable(NA0.m94301c(getContext(), C32364Df4.white)));
        View findViewById = findViewById(C52955zi4.rangeFilterView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.rangeFilterView)");
        this.f67533k = (RangeFilterView) findViewById;
        this.f67534l = C37791a94.C10586a.create$default(C37791a94.f49908h, new OperatorOptionFilter("", null, 0, null, null, null, null, null, null, null, null, 2046, null), null, 2, null);
        lazy = LazyKt__LazyJVMKt.lazy(new C16563a());
        this.f67536n = lazy;
        m54455v(null);
    }

    /* renamed from: x */
    public static final void m54453x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m54452y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f67535m = m54454w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC23465c interfaceC23465c = this.f67535m;
        if (interfaceC23465c != null) {
            interfaceC23465c.dispose();
        }
    }

    public final void setFilter(OperatorOptionFilter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f67533k.setTag(filter);
        this.f67533k.setTitle(filter.getLabel());
        setOptions(filter.getOptions());
    }

    public final void setOptions(List<OperatorFilterOption> list) {
        boolean z;
        int i;
        int i2;
        int lastIndex;
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator<OperatorFilterOption> it = list.iterator();
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            if (it.hasNext()) {
                if (it.next().getEnabled()) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i3);
        if (valueOf.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        Integer num = null;
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            i = 0;
        }
        ListIterator<OperatorFilterOption> listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (listIterator.previous().getEnabled()) {
                    i2 = listIterator.nextIndex();
                    break;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        Integer valueOf2 = Integer.valueOf(i2);
        int intValue = valueOf2.intValue();
        if (intValue != -1 && intValue != i) {
            z2 = true;
        }
        if (z2) {
            num = valueOf2;
        }
        if (num != null) {
            lastIndex = num.intValue();
        } else {
            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        }
        this.f67533k.setMinLabel(list.get(i).getName());
        this.f67533k.setMaxLabel(list.get(lastIndex).getName());
        this.f67533k.setNumSteps(list.size());
        this.f67533k.setSelectedIndices(i, lastIndex);
    }

    /* renamed from: t */
    public final OperatorOptionFilter m54457t() {
        OperatorOptionFilter copy;
        Object tag = this.f67533k.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type co.bird.android.model.persistence.OperatorOptionFilter");
        copy = r3.copy((r24 & 1) != 0 ? r3.f66683id : null, (r24 & 2) != 0 ? r3.kind : null, (r24 & 4) != 0 ? r3.ordinal : 0, (r24 & 8) != 0 ? r3.type : null, (r24 & 16) != 0 ? r3.label : null, (r24 & 32) != 0 ? r3.options : m54456u(), (r24 & 64) != 0 ? r3.logicOperator : null, (r24 & 128) != 0 ? r3.icon : null, (r24 & 256) != 0 ? r3.iconColor : null, (r24 & 512) != 0 ? r3.coloredIcon : null, (r24 & 1024) != 0 ? ((OperatorOptionFilter) tag).iconBackgroundColor : null);
        return copy;
    }

    /* renamed from: u */
    public final List<OperatorFilterOption> m54456u() {
        Object tag = this.f67533k.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type co.bird.android.model.persistence.OperatorOptionFilter");
        return ((OperatorOptionFilter) tag).getOptions();
    }

    /* renamed from: v */
    public final void m54455v(AttributeSet attributeSet) {
    }

    /* renamed from: w */
    public final InterfaceC23465c m54454w() {
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(this.f67533k.m54446e(), this.f67533k.m54447d(), C16564b.f67538a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        Observable observeOn = combineLatest.observeOn(C23454a.m33087a());
        final C16565c c16565c = new C16565c();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: gn4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RangeFilterCardView.m54453x(Function1.this, obj);
            }
        };
        final C16566d c16566d = C16566d.f67540g;
        InterfaceC23465c subscribe = observeOn.subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: hn4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RangeFilterCardView.m54452y(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "private fun listenForRan…)\n      }, {\n      })\n  }");
        return subscribe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeFilterCardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_range_filter_card, this, true);
        setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_vertical_margin));
        setBackground(new ColorDrawable(NA0.m94301c(getContext(), C32364Df4.white)));
        View findViewById = findViewById(C52955zi4.rangeFilterView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.rangeFilterView)");
        this.f67533k = (RangeFilterView) findViewById;
        this.f67534l = C37791a94.C10586a.create$default(C37791a94.f49908h, new OperatorOptionFilter("", null, 0, null, null, null, null, null, null, null, null, 2046, null), null, 2, null);
        lazy = LazyKt__LazyJVMKt.lazy(new C16563a());
        this.f67536n = lazy;
        m54455v(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeFilterCardView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_range_filter_card, this, true);
        setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_vertical_margin));
        setBackground(new ColorDrawable(NA0.m94301c(getContext(), C32364Df4.white)));
        View findViewById = findViewById(C52955zi4.rangeFilterView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.rangeFilterView)");
        this.f67533k = (RangeFilterView) findViewById;
        this.f67534l = C37791a94.C10586a.create$default(C37791a94.f49908h, new OperatorOptionFilter("", null, 0, null, null, null, null, null, null, null, null, 2046, null), null, 2, null);
        lazy = LazyKt__LazyJVMKt.lazy(new C16563a());
        this.f67536n = lazy;
        m54455v(attrs);
    }
}
