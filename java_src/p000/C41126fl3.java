package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.feature.filters.operator.p012v2.view.LogicOperatorView;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.ColoredIcon;
import co.bird.android.model.constant.FilterLogicToggleOption;
import co.bird.android.model.constant.OperatorFilterType;
import co.bird.android.model.persistence.OperatorFilter;
import co.bird.android.model.persistence.OperatorOptionFilter;
import co.bird.android.model.persistence.OperatorToggleFilter;
import co.bird.android.model.persistence.nestedstructures.OperatorFilterOption;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.widget.RangeSeekBar;
import com.facebook.share.internal.C17296a;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import p000.C41126fl3;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 $2\u00020\u0001:\u0005%&\u0017\u001b\u001eB\u0007¢\u0006\u0004\b\"\u0010#J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\u000eJ\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u000f0\u000f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR:\u0010\u001f\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013 \u001a*\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00110\u00110\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\"\u0010!\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00150\u00150\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001c¨\u0006'"}, m28432d2 = {"Lfl3;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "LF6;", "r", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/OperatorFilter;", "S4", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/OperatorOptionFilter;", "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;", "w", "Lco/bird/android/model/constant/FilterLogicToggleOption;", "v", "c", "Landroidx/recyclerview/widget/RecyclerView;", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/d;", "filterSubject", "e", "optionSubject", "f", "logicOperatorSubject", "<init>", "()V", "g", C17296a.f69688o, "b", "filters_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: fl3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41126fl3 extends AbstractC52206yS0 {

    /* renamed from: g */
    public static final C20505a f80579g = new C20505a(null);

    /* renamed from: c */
    public RecyclerView f80580c;

    /* renamed from: d */
    public final C24558d<OperatorFilter> f80581d;

    /* renamed from: e */
    public final C24558d<Pair<OperatorOptionFilter, OperatorFilterOption>> f80582e;

    /* renamed from: f */
    public final C24558d<FilterLogicToggleOption> f80583f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lfl3$a;", "", "", "BATTERY_FILTER_ID", "Ljava/lang/String;", "<init>", "()V", "filters_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: fl3$a */
    /* loaded from: classes3.dex */
    public static final class C20505a {
        public /* synthetic */ C20505a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C20505a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m28432d2 = {"Lfl3$b;", "Lw1;", "", "position", "", "bind", C17296a.f69688o, "LRd2;", "b", "LRd2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lfl3;Landroid/view/View;)V", "filters_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorFilterV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$MultiSelectFilterViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n18#2:299\n18#2:306\n9#3,4:300\n9#3,4:307\n1855#4,2:304\n1747#4,3:311\n1549#4:314\n1620#4,3:315\n1549#4:318\n1620#4,3:319\n1855#4,2:322\n*S KotlinDebug\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$MultiSelectFilterViewHolder\n*L\n186#1:299\n209#1:306\n186#1:300,4\n209#1:307,4\n188#1:304,2\n209#1:311,3\n211#1:314\n211#1:315,3\n212#1:318\n212#1:319,3\n213#1:322,2\n*E\n"})
    /* renamed from: fl3$b */
    /* loaded from: classes3.dex */
    public final class C20506b extends C29735w1 {

        /* renamed from: b */
        public final C35620Rd2 f80584b;

        /* renamed from: c */
        public final /* synthetic */ C41126fl3 f80585c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: fl3$b$a */
        /* loaded from: classes3.dex */
        public static final class C20507a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C41126fl3 f80586g;

            /* renamed from: h */
            public final /* synthetic */ OperatorOptionFilter f80587h;

            /* renamed from: i */
            public final /* synthetic */ OperatorFilterOption f80588i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20507a(C41126fl3 c41126fl3, OperatorOptionFilter operatorOptionFilter, OperatorFilterOption operatorFilterOption) {
                super(1);
                this.f80586g = c41126fl3;
                this.f80587h = operatorOptionFilter;
                this.f80588i = operatorFilterOption;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f80586g.f80582e.onNext(TuplesKt.m28425to(this.f80587h, this.f80588i));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20506b(C41126fl3 c41126fl3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f80585c = c41126fl3;
            C35620Rd2 m86538a = C35620Rd2.m86538a(view);
            Intrinsics.checkNotNullExpressionValue(m86538a, "bind(view)");
            this.f80584b = m86538a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
            if (r0 == true) goto L18;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m40895a() {
            boolean z;
            IntRange until;
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            List<OperatorFilterOption> options;
            boolean z2;
            int adapterPosition = getAdapterPosition();
            if (adapterPosition == -1) {
                return;
            }
            Object m105816c = this.f80585c.m94545o().m109397e(adapterPosition).m105816c();
            if (!(m105816c instanceof OperatorOptionFilter)) {
                m105816c = null;
            }
            OperatorOptionFilter operatorOptionFilter = (OperatorOptionFilter) m105816c;
            if (operatorOptionFilter != null && (options = operatorOptionFilter.getOptions()) != null) {
                List<OperatorFilterOption> list = options;
                z = true;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (OperatorFilterOption operatorFilterOption : list) {
                        if (!operatorFilterOption.getEnabled()) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
            }
            z = false;
            until = RangesKt___RangesKt.until(0, this.f80584b.getRoot().getChildCount());
            ChipGroup root = this.f80584b.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
            ArrayList<View> arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                arrayList.add(root.getChildAt(((IntIterator) it).nextInt()));
            }
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList<Chip> arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (View view : arrayList) {
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
                arrayList2.add((Chip) view);
            }
            for (Chip chip : arrayList2) {
                chip.setChecked(z);
            }
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Drawable drawable;
            Object m105816c = this.f80585c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof OperatorOptionFilter)) {
                m105816c = null;
            }
            OperatorOptionFilter operatorOptionFilter = (OperatorOptionFilter) m105816c;
            if (operatorOptionFilter != null) {
                C41126fl3 c41126fl3 = this.f80585c;
                this.f80584b.getRoot().removeAllViews();
                for (OperatorFilterOption operatorFilterOption : operatorOptionFilter.getOptions()) {
                    Context context = this.f80584b.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "binding.root.context");
                    C34961Oi0 m91669c = C34961Oi0.m91669c(C40788fB0.m41772j(context), this.f80584b.getRoot(), false);
                    Intrinsics.checkNotNullExpressionValue(m91669c, "inflate(binding.root.con…ter, binding.root, false)");
                    m91669c.getRoot().setText(operatorFilterOption.getName());
                    Chip root = m91669c.getRoot();
                    ClientIcon icon = operatorFilterOption.getIcon();
                    if (icon != null) {
                        Context context2 = this.f80584b.getRoot().getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "binding.root.context");
                        Drawable m103484a = C33341Hk0.m103484a(icon, context2);
                        if (m103484a != null && (drawable = m103484a.mutate()) != null) {
                            drawable.setTintList(NA0.m94300d(this.f80584b.getRoot().getContext(), C32598Ef4.filter_chip_icon_color_state_list));
                            drawable.setTintMode(PorterDuff.Mode.SRC_ATOP);
                            root.setChipIcon(drawable);
                            m91669c.getRoot().setChecked(operatorFilterOption.getEnabled());
                            Chip root2 = m91669c.getRoot();
                            Intrinsics.checkNotNullExpressionValue(root2, "chip.root");
                            C34585Ms2.m94661j(root2, new C20507a(c41126fl3, operatorOptionFilter, operatorFilterOption));
                            this.f80584b.getRoot().addView(m91669c.getRoot());
                        }
                    }
                    ColoredIcon coloredIcon = operatorFilterOption.getColoredIcon();
                    if (coloredIcon != null) {
                        Context context3 = this.f80584b.getRoot().getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "binding.root.context");
                        drawable = C34295Lm0.m96371a(coloredIcon, context3);
                    } else {
                        drawable = null;
                    }
                    root.setChipIcon(drawable);
                    m91669c.getRoot().setChecked(operatorFilterOption.getEnabled());
                    Chip root22 = m91669c.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root22, "chip.root");
                    C34585Ms2.m94661j(root22, new C20507a(c41126fl3, operatorOptionFilter, operatorFilterOption));
                    this.f80584b.getRoot().addView(m91669c.getRoot());
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m28432d2 = {"Lfl3$c;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;", "minOption", "maxOption", "e", "LZd2;", "b", "LZd2;", "viewBinding", "", "c", "Z", "binding", "Landroid/view/View;", "view", "<init>", "(Lfl3;Landroid/view/View;)V", "filters_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorFilterV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$RangeSelectFilterViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n18#2:299\n18#2:312\n9#3,4:300\n9#3,4:313\n288#4,2:304\n533#4,6:306\n766#4:317\n857#4,2:318\n1855#4,2:320\n777#4:322\n788#4:323\n1864#4,2:324\n789#4,2:326\n1866#4:328\n791#4:329\n1549#4:330\n1620#4,3:331\n1855#4,2:334\n766#4:336\n857#4,2:337\n1549#4:339\n1620#4,3:340\n1855#4,2:343\n*S KotlinDebug\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$RangeSelectFilterViewHolder\n*L\n254#1:299\n227#1:312\n254#1:300,4\n227#1:313,4\n255#1:304,2\n256#1:306,6\n230#1:317\n230#1:318,2\n231#1:320,2\n234#1:322\n234#1:323\n234#1:324,2\n234#1:326,2\n234#1:328\n234#1:329\n235#1:330\n235#1:331,3\n236#1:334,2\n242#1:336\n242#1:337,2\n243#1:339\n243#1:340,3\n244#1:343,2\n*E\n"})
    /* renamed from: fl3$c */
    /* loaded from: classes3.dex */
    public final class C20508c extends C29735w1 {

        /* renamed from: b */
        public final C37492Zd2 f80589b;

        /* renamed from: c */
        public boolean f80590c;

        /* renamed from: d */
        public final /* synthetic */ C41126fl3 f80591d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20508c(final C41126fl3 c41126fl3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f80591d = c41126fl3;
            C37492Zd2 m72846a = C37492Zd2.m72846a(view);
            Intrinsics.checkNotNullExpressionValue(m72846a, "bind(view)");
            this.f80589b = m72846a;
            m72846a.f48853b.setOnRangeSeekBarChangeListener(new RangeSeekBar.InterfaceC16570c() { // from class: gl3
                @Override // co.bird.android.widget.RangeSeekBar.InterfaceC16570c
                /* renamed from: a */
                public final void mo33485a(RangeSeekBar rangeSeekBar, Number number, Number number2) {
                    C41126fl3.C20508c.m40893b(C41126fl3.C20508c.this, c41126fl3, rangeSeekBar, (Integer) number, (Integer) number2);
                }
            });
        }

        /* renamed from: b */
        public static final void m40893b(C20508c this$0, C41126fl3 this$1, RangeSeekBar rangeSeekBar, Integer minIdx, Integer maxIdx) {
            int adapterPosition;
            int collectionSizeOrDefault;
            Set of;
            int collectionSizeOrDefault2;
            boolean z;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (this$0.f80590c || (adapterPosition = this$0.getAdapterPosition()) == -1) {
                return;
            }
            Object m105816c = this$1.m94545o().m109397e(adapterPosition).m105816c();
            if (!(m105816c instanceof OperatorOptionFilter)) {
                m105816c = null;
            }
            OperatorOptionFilter operatorOptionFilter = (OperatorOptionFilter) m105816c;
            if (operatorOptionFilter != null) {
                if (minIdx != null && minIdx.intValue() == 0) {
                    int size = operatorOptionFilter.getOptions().size() - 1;
                    if (maxIdx != null && maxIdx.intValue() == size) {
                        ArrayList<OperatorFilterOption> arrayList = new ArrayList();
                        for (Object obj : operatorOptionFilter.getOptions()) {
                            if (((OperatorFilterOption) obj).getEnabled()) {
                                arrayList.add(obj);
                            }
                        }
                        for (OperatorFilterOption operatorFilterOption : arrayList) {
                            this$1.f80582e.onNext(TuplesKt.m28425to(operatorOptionFilter, operatorFilterOption));
                        }
                        List<OperatorFilterOption> options = operatorOptionFilter.getOptions();
                        Intrinsics.checkNotNullExpressionValue(minIdx, "minIdx");
                        List<OperatorFilterOption> options2 = operatorOptionFilter.getOptions();
                        Intrinsics.checkNotNullExpressionValue(maxIdx, "maxIdx");
                        this$0.m40892e(options.get(minIdx.intValue()), options2.get(maxIdx.intValue()));
                    }
                }
                ArrayList<OperatorFilterOption> arrayList2 = new ArrayList();
                int i = 0;
                for (Object obj2 : operatorOptionFilter.getOptions()) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    if (((OperatorFilterOption) obj2).getEnabled() && ((minIdx == null || i != minIdx.intValue()) && (maxIdx == null || i != maxIdx.intValue()))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList2.add(obj2);
                    }
                    i = i2;
                }
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
                ArrayList<Pair> arrayList3 = new ArrayList(collectionSizeOrDefault);
                for (OperatorFilterOption operatorFilterOption2 : arrayList2) {
                    arrayList3.add(TuplesKt.m28425to(operatorOptionFilter, operatorFilterOption2));
                }
                C24558d c24558d = this$1.f80582e;
                for (Pair pair : arrayList3) {
                    c24558d.onNext(pair);
                }
                List<OperatorFilterOption> options3 = operatorOptionFilter.getOptions();
                Intrinsics.checkNotNullExpressionValue(minIdx, "minIdx");
                List<OperatorFilterOption> options4 = operatorOptionFilter.getOptions();
                Intrinsics.checkNotNullExpressionValue(maxIdx, "maxIdx");
                of = SetsKt__SetsKt.setOf((Object[]) new OperatorFilterOption[]{options3.get(minIdx.intValue()), options4.get(maxIdx.intValue())});
                ArrayList<OperatorFilterOption> arrayList4 = new ArrayList();
                for (Object obj3 : of) {
                    if (!((OperatorFilterOption) obj3).getEnabled()) {
                        arrayList4.add(obj3);
                    }
                }
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10);
                ArrayList<Pair> arrayList5 = new ArrayList(collectionSizeOrDefault2);
                for (OperatorFilterOption operatorFilterOption3 : arrayList4) {
                    arrayList5.add(TuplesKt.m28425to(operatorOptionFilter, operatorFilterOption3));
                }
                C24558d c24558d2 = this$1.f80582e;
                for (Pair pair2 : arrayList5) {
                    c24558d2.onNext(pair2);
                }
                List<OperatorFilterOption> options5 = operatorOptionFilter.getOptions();
                Intrinsics.checkNotNullExpressionValue(minIdx, "minIdx");
                List<OperatorFilterOption> options22 = operatorOptionFilter.getOptions();
                Intrinsics.checkNotNullExpressionValue(maxIdx, "maxIdx");
                this$0.m40892e(options5.get(minIdx.intValue()), options22.get(maxIdx.intValue()));
            }
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object obj;
            Object last;
            Object first;
            this.f80590c = true;
            Object m105816c = this.f80591d.m94545o().m109397e(i).m105816c();
            OperatorFilterOption operatorFilterOption = null;
            if (!(m105816c instanceof OperatorOptionFilter)) {
                m105816c = null;
            }
            OperatorOptionFilter operatorOptionFilter = (OperatorOptionFilter) m105816c;
            if (operatorOptionFilter != null) {
                Iterator<T> it = operatorOptionFilter.getOptions().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((OperatorFilterOption) obj).getEnabled()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                OperatorFilterOption operatorFilterOption2 = (OperatorFilterOption) obj;
                if (operatorFilterOption2 == null) {
                    first = CollectionsKt___CollectionsKt.first((List<? extends Object>) operatorOptionFilter.getOptions());
                    operatorFilterOption2 = (OperatorFilterOption) first;
                }
                List<OperatorFilterOption> options = operatorOptionFilter.getOptions();
                ListIterator<OperatorFilterOption> listIterator = options.listIterator(options.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    OperatorFilterOption previous = listIterator.previous();
                    if (previous.getEnabled()) {
                        operatorFilterOption = previous;
                        break;
                    }
                }
                OperatorFilterOption operatorFilterOption3 = operatorFilterOption;
                if (operatorFilterOption3 == null) {
                    last = CollectionsKt___CollectionsKt.last((List<? extends Object>) operatorOptionFilter.getOptions());
                    operatorFilterOption3 = (OperatorFilterOption) last;
                }
                m40892e(operatorFilterOption2, operatorFilterOption3);
                this.f80589b.f48853b.setRangeValues(0, Integer.valueOf(operatorOptionFilter.getOptions().size() - 1));
                this.f80589b.f48853b.setSelectedMinValue(Integer.valueOf(operatorOptionFilter.getOptions().indexOf(operatorFilterOption2)));
                this.f80589b.f48853b.setSelectedMaxValue(Integer.valueOf(operatorOptionFilter.getOptions().indexOf(operatorFilterOption3)));
            }
            this.f80590c = false;
        }

        /* renamed from: e */
        public final void m40892e(OperatorFilterOption operatorFilterOption, OperatorFilterOption operatorFilterOption2) {
            this.f80589b.f48855d.setText(operatorFilterOption.getName());
            this.f80589b.f48854c.setText(operatorFilterOption2.getName());
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J0\u0010\r\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"Lfl3$d;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/model/constant/ClientIcon;", "clientIcon", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "iconColor", "iconBackgroundColor", "Lco/bird/android/model/constant/ColoredIcon;", "coloredIcon", "b", "LOd2;", "LOd2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lfl3;Landroid/view/View;)V", "filters_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorFilterV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$TitleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,298:1\n18#2:299\n9#3,4:300\n1726#4,3:304\n1#5:307\n177#6,2:308\n177#6,2:310\n*S KotlinDebug\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$TitleViewHolder\n*L\n114#1:299\n114#1:300,4\n124#1:304,3\n164#1:308,2\n177#1:310,2\n*E\n"})
    /* renamed from: fl3$d */
    /* loaded from: classes3.dex */
    public final class C20509d extends C29735w1 {

        /* renamed from: b */
        public final C34918Od2 f80592b;

        /* renamed from: c */
        public final /* synthetic */ C41126fl3 f80593c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nOperatorFilterV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$TitleViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n18#2:299\n18#2:313\n18#2:319\n9#3,4:300\n9#3,4:314\n9#3,4:320\n1549#4:304\n1620#4,3:305\n1549#4:308\n1620#4,3:309\n288#4:312\n289#4:318\n1747#4,3:324\n*S KotlinDebug\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$TitleViewHolder$1\n*L\n88#1:299\n99#1:313\n103#1:319\n88#1:300,4\n99#1:314,4\n103#1:320,4\n93#1:304\n93#1:305,3\n94#1:308\n94#1:309,3\n96#1:312\n96#1:318\n103#1:324,3\n*E\n"})
        /* renamed from: fl3$d$a */
        /* loaded from: classes3.dex */
        public static final class C20510a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C41126fl3 f80595h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20510a(C41126fl3 c41126fl3) {
                super(1);
                this.f80595h = c41126fl3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:73:0x00e2 A[EDGE_INSN: B:73:0x00e2->B:45:0x00e2 ?: BREAK  , SYNTHETIC] */
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke2(View view) {
                IntRange until;
                int collectionSizeOrDefault;
                int collectionSizeOrDefault2;
                List filterIsInstance;
                Object obj;
                List<OperatorFilterOption> options;
                boolean z;
                boolean z2;
                int adapterPosition = C20509d.this.getAdapterPosition();
                if (adapterPosition == -1) {
                    return;
                }
                Object m105816c = this.f80595h.m94545o().m109397e(adapterPosition).m105816c();
                if (!(m105816c instanceof OperatorOptionFilter)) {
                    m105816c = null;
                }
                OperatorOptionFilter operatorOptionFilter = (OperatorOptionFilter) m105816c;
                if (operatorOptionFilter == null) {
                    return;
                }
                this.f80595h.f80581d.onNext(operatorOptionFilter);
                RecyclerView recyclerView = this.f80595h.f80580c;
                if (recyclerView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                    recyclerView = null;
                }
                boolean z3 = false;
                until = RangesKt___RangesKt.until(0, recyclerView.getChildCount());
                RecyclerView recyclerView2 = this.f80595h.f80580c;
                if (recyclerView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                    recyclerView2 = null;
                }
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
                ArrayList<View> arrayList = new ArrayList(collectionSizeOrDefault);
                Iterator<Integer> it = until.iterator();
                while (it.hasNext()) {
                    arrayList.add(recyclerView2.getChildAt(((IntIterator) it).nextInt()));
                }
                RecyclerView recyclerView3 = this.f80595h.f80580c;
                if (recyclerView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                    recyclerView3 = null;
                }
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                for (View view2 : arrayList) {
                    arrayList2.add(recyclerView3.getChildViewHolder(view2));
                }
                filterIsInstance = CollectionsKt___CollectionsJvmKt.filterIsInstance(arrayList2, C20506b.class);
                C41126fl3 c41126fl3 = this.f80595h;
                Iterator it2 = filterIsInstance.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    int adapterPosition2 = ((C20506b) obj).getAdapterPosition();
                    if (adapterPosition2 != -1) {
                        Object m105816c2 = c41126fl3.m94545o().m109397e(adapterPosition2).m105816c();
                        if (!(m105816c2 instanceof OperatorOptionFilter)) {
                            m105816c2 = null;
                        }
                        if (Intrinsics.areEqual(m105816c2, operatorOptionFilter)) {
                            z2 = true;
                            continue;
                            if (z2) {
                                break;
                            }
                        }
                    }
                    z2 = false;
                    continue;
                    if (z2) {
                    }
                }
                C20506b c20506b = (C20506b) obj;
                if (c20506b != null) {
                    c20506b.m40895a();
                }
                Object m105816c3 = this.f80595h.m94545o().m109397e(adapterPosition).m105816c();
                OperatorOptionFilter operatorOptionFilter2 = m105816c3 instanceof OperatorOptionFilter ? m105816c3 : null;
                if (operatorOptionFilter2 != null && (options = operatorOptionFilter2.getOptions()) != null) {
                    List<OperatorFilterOption> list = options;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (OperatorFilterOption operatorFilterOption : list) {
                            if (!operatorFilterOption.getEnabled()) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        z3 = true;
                    }
                }
                C20509d.this.f80592b.f26949b.setChecked(z3);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nOperatorFilterV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$TitleViewHolder$2\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,298:1\n18#2:299\n9#3,4:300\n*S KotlinDebug\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$TitleViewHolder$2\n*L\n108#1:299\n108#1:300,4\n*E\n"})
        /* renamed from: fl3$d$b */
        /* loaded from: classes3.dex */
        public static final class C20511b extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C41126fl3 f80596g;

            /* renamed from: h */
            public final /* synthetic */ C20509d f80597h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20511b(C41126fl3 c41126fl3, C20509d c20509d) {
                super(1);
                this.f80596g = c41126fl3;
                this.f80597h = c20509d;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f80596g.m94545o().m109397e(this.f80597h.getBindingAdapterPosition()).m105816c();
                if (!(m105816c instanceof OperatorOptionFilter)) {
                    m105816c = null;
                }
                OperatorOptionFilter operatorOptionFilter = (OperatorOptionFilter) m105816c;
                if (operatorOptionFilter == null) {
                    return;
                }
                C24558d c24558d = this.f80596g.f80583f;
                FilterLogicToggleOption logicOperator = operatorOptionFilter.getLogicOperator();
                if (logicOperator == null) {
                    logicOperator = FilterLogicToggleOption.AND;
                }
                c24558d.onNext(logicOperator);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20509d(C41126fl3 c41126fl3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f80593c = c41126fl3;
            C34918Od2 m91784a = C34918Od2.m91784a(view);
            Intrinsics.checkNotNullExpressionValue(m91784a, "bind(view)");
            this.f80592b = m91784a;
            ConstraintLayout root = m91784a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C20510a(c41126fl3));
            LogicOperatorView logicOperatorView = m91784a.f26951d;
            Intrinsics.checkNotNullExpressionValue(logicOperatorView, "binding.logicOperator");
            C34585Ms2.m94661j(logicOperatorView, new C20511b(c41126fl3, this));
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m40890b(ClientIcon clientIcon, ThemedColors themedColors, ThemedColors themedColors2, ColoredIcon coloredIcon) {
            boolean z;
            Unit unit;
            ConstraintLayout.LayoutParams layoutParams;
            ConstraintLayout.LayoutParams layoutParams2;
            ColorStateList valueOf;
            ImageView imageView = this.f80592b.f26950c;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.icon");
            if (clientIcon == null && coloredIcon == null) {
                z = false;
            } else {
                z = true;
            }
            ConstraintLayout.LayoutParams layoutParams3 = null;
            C49520tu6.show$default(imageView, z, 0, 2, null);
            if (clientIcon != null) {
                Context context = this.f80592b.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "binding.root.context");
                Drawable m103484a = C33341Hk0.m103484a(clientIcon, context);
                if (m103484a != null) {
                    this.f80592b.f26950c.setImageDrawable(m103484a);
                    if (themedColors != null && (valueOf = ColorStateList.valueOf(themedColors.getLightMode())) != null) {
                        ImageView imageView2 = this.f80592b.f26950c;
                        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.icon");
                        imageView2.setImageTintList(valueOf);
                    }
                }
            }
            if (coloredIcon != null) {
                Context context2 = this.f80592b.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "binding.root.context");
                Drawable m96371a = C34295Lm0.m96371a(coloredIcon, context2);
                if (m96371a != null) {
                    this.f80592b.f26950c.setImageDrawable(m96371a);
                    this.f80592b.f26950c.setImageTintList(null);
                }
            }
            if (themedColors2 != null) {
                int lightMode = themedColors2.getLightMode();
                ImageView imageView3 = this.f80592b.f26950c;
                ViewGroup.LayoutParams layoutParams4 = imageView3.getLayoutParams();
                if (layoutParams4 instanceof ConstraintLayout.LayoutParams) {
                    layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams4;
                } else {
                    layoutParams2 = null;
                }
                if (layoutParams2 != null) {
                    int m12001b = (int) C49347td3.m12001b(40);
                    ((ViewGroup.MarginLayoutParams) layoutParams2).width = m12001b;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).height = m12001b;
                } else {
                    layoutParams2 = null;
                }
                imageView3.setLayoutParams(layoutParams2);
                ImageView imageView4 = this.f80592b.f26950c;
                Intrinsics.checkNotNullExpressionValue(imageView4, "binding.icon");
                int m12001b2 = (int) C49347td3.m12001b(8);
                imageView4.setPadding(m12001b2, m12001b2, m12001b2, m12001b2);
                ColorStateList valueOf2 = ColorStateList.valueOf(lightMode);
                if (valueOf2 != null) {
                    ImageView imageView5 = this.f80592b.f26950c;
                    Intrinsics.checkNotNullExpressionValue(imageView5, "binding.icon");
                    imageView5.setBackgroundTintList(valueOf2);
                    unit = Unit.INSTANCE;
                    if (unit != null) {
                        this.f80592b.f26950c.setBackgroundTintList(ColorStateList.valueOf(0));
                        ImageView imageView6 = this.f80592b.f26950c;
                        ViewGroup.LayoutParams layoutParams5 = imageView6.getLayoutParams();
                        if (layoutParams5 instanceof ConstraintLayout.LayoutParams) {
                            layoutParams = (ConstraintLayout.LayoutParams) layoutParams5;
                        } else {
                            layoutParams = null;
                        }
                        if (layoutParams != null) {
                            int m12001b3 = (int) C49347td3.m12001b(24);
                            ((ViewGroup.MarginLayoutParams) layoutParams).width = m12001b3;
                            ((ViewGroup.MarginLayoutParams) layoutParams).height = m12001b3;
                            layoutParams3 = layoutParams;
                        }
                        imageView6.setLayoutParams(layoutParams3);
                        ImageView imageView7 = this.f80592b.f26950c;
                        Intrinsics.checkNotNullExpressionValue(imageView7, "binding.icon");
                        imageView7.setPadding(0, 0, 0, 0);
                        return;
                    }
                    return;
                }
            }
            unit = null;
            if (unit != null) {
            }
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            boolean z2;
            Object m105816c = this.f80593c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof OperatorFilter)) {
                m105816c = null;
            }
            OperatorFilter operatorFilter = (OperatorFilter) m105816c;
            if (operatorFilter != null) {
                if (operatorFilter instanceof OperatorOptionFilter) {
                    OperatorOptionFilter operatorOptionFilter = (OperatorOptionFilter) operatorFilter;
                    this.f80592b.f26953f.setText(operatorOptionFilter.getLabel());
                    ImageView imageView = this.f80592b.f26950c;
                    Intrinsics.checkNotNullExpressionValue(imageView, "binding.icon");
                    boolean z3 = true;
                    if (operatorOptionFilter.getIcon() == null && operatorOptionFilter.getColoredIcon() == null) {
                        z = false;
                    } else {
                        z = true;
                    }
                    C49520tu6.show$default(imageView, z, 0, 2, null);
                    m40890b(operatorOptionFilter.getIcon(), operatorOptionFilter.getIconColor(), operatorOptionFilter.getIconBackgroundColor(), operatorOptionFilter.getColoredIcon());
                    if (operatorFilter.getType() == OperatorFilterType.MULTI_SELECT) {
                        CheckBox checkBox = this.f80592b.f26949b;
                        List<OperatorFilterOption> options = operatorOptionFilter.getOptions();
                        if (!(options instanceof Collection) || !options.isEmpty()) {
                            for (OperatorFilterOption operatorFilterOption : options) {
                                if (!operatorFilterOption.getEnabled()) {
                                    z2 = false;
                                    break;
                                }
                            }
                        }
                        z2 = true;
                        checkBox.setChecked(z2);
                    } else {
                        CheckBox checkBox2 = this.f80592b.f26949b;
                        Intrinsics.checkNotNullExpressionValue(checkBox2, "binding.checkbox");
                        C49520tu6.m11239l(checkBox2);
                    }
                    FilterLogicToggleOption logicOperator = operatorOptionFilter.getLogicOperator();
                    if (logicOperator != null) {
                        this.f80592b.f26951d.m58226e(logicOperator);
                    }
                    LogicOperatorView logicOperatorView = this.f80592b.f26951d;
                    Intrinsics.checkNotNullExpressionValue(logicOperatorView, "binding.logicOperator");
                    if (operatorOptionFilter.getLogicOperator() == null) {
                        z3 = false;
                    }
                    C49520tu6.show$default(logicOperatorView, z3, 0, 2, null);
                } else if (operatorFilter instanceof OperatorToggleFilter) {
                    OperatorToggleFilter operatorToggleFilter = (OperatorToggleFilter) operatorFilter;
                    this.f80592b.f26953f.setText(operatorToggleFilter.getTitle());
                    m40890b(operatorToggleFilter.getIcon(), operatorToggleFilter.getIconColor(), operatorToggleFilter.getIconBackgroundColor(), operatorToggleFilter.getColoredIcon());
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lfl3$e;", "Lw1;", "", "position", "", "bind", "Lfe2;", "b", "Lfe2;", "viewBinding", "", "c", "Z", "binding", "Landroid/view/View;", "view", "<init>", "(Lfl3;Landroid/view/View;)V", "filters_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorFilterV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$ToggleSelectFilterViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,298:1\n18#2:299\n9#3,4:300\n*S KotlinDebug\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$ToggleSelectFilterViewHolder\n*L\n289#1:299\n289#1:300,4\n*E\n"})
    /* renamed from: fl3$e */
    /* loaded from: classes3.dex */
    public final class C20512e extends C29735w1 {

        /* renamed from: b */
        public final C41055fe2 f80598b;

        /* renamed from: c */
        public boolean f80599c;

        /* renamed from: d */
        public final /* synthetic */ C41126fl3 f80600d;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nOperatorFilterV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$ToggleSelectFilterViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,298:1\n1#2:299\n18#3:300\n9#4,4:301\n*S KotlinDebug\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$ToggleSelectFilterViewHolder$1\n*L\n281#1:300\n281#1:301,4\n*E\n"})
        /* renamed from: fl3$e$a */
        /* loaded from: classes3.dex */
        public static final class C20513a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C41126fl3 f80602h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20513a(C41126fl3 c41126fl3) {
                super(2);
                this.f80602h = c41126fl3;
            }

            /* renamed from: a */
            public final void m40888a(CompoundButton compoundButton, boolean z) {
                Integer safePosition;
                C2637G6 m109397e;
                if (!C20512e.this.f80599c && (safePosition = C20512e.this.getSafePosition()) != null && (m109397e = this.f80602h.m94545o().m109397e(safePosition.intValue())) != null) {
                    Object m105816c = m109397e.m105816c();
                    if (!(m105816c instanceof OperatorToggleFilter)) {
                        m105816c = null;
                    }
                    OperatorToggleFilter operatorToggleFilter = (OperatorToggleFilter) m105816c;
                    if (operatorToggleFilter != null) {
                        this.f80602h.f80581d.onNext(operatorToggleFilter);
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
                m40888a(compoundButton, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20512e(C41126fl3 c41126fl3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f80600d = c41126fl3;
            C41055fe2 m41085a = C41055fe2.m41085a(view);
            Intrinsics.checkNotNullExpressionValue(m41085a, "bind(view)");
            this.f80598b = m41085a;
            SwitchCompat switchCompat = m41085a.f80389b;
            Intrinsics.checkNotNullExpressionValue(switchCompat, "viewBinding.filter");
            C34585Ms2.m94663h(switchCompat, new C20513a(c41126fl3));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f80599c = true;
            Object m105816c = this.f80600d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof OperatorToggleFilter)) {
                m105816c = null;
            }
            OperatorToggleFilter operatorToggleFilter = (OperatorToggleFilter) m105816c;
            if (operatorToggleFilter != null) {
                this.f80598b.f80389b.setText(operatorToggleFilter.getToggleTitle());
                this.f80598b.f80389b.setChecked(operatorToggleFilter.getEnabled());
            }
            this.f80599c = false;
        }
    }

    public C41126fl3() {
        C24558d<OperatorFilter> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<OperatorFilter>()");
        this.f80581d = m31902e;
        C24558d<Pair<OperatorOptionFilter, OperatorFilterOption>> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Pair<OperatorOpti… OperatorFilterOption>>()");
        this.f80582e = m31902e2;
        C24558d<FilterLogicToggleOption> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<FilterLogicToggleOption>()");
        this.f80583f = m31902e3;
    }

    /* renamed from: S4 */
    public final Observable<OperatorFilter> m40898S4() {
        Observable<OperatorFilter> hide = this.f80581d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "filterSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f80580c = recyclerView;
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C46463ol3());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C42312hl3();
    }

    /* renamed from: v */
    public final Observable<FilterLogicToggleOption> m40897v() {
        Observable<FilterLogicToggleOption> hide = this.f80583f.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "logicOperatorSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<Pair<OperatorOptionFilter, OperatorFilterOption>> m40896w() {
        Observable<Pair<OperatorOptionFilter, OperatorFilterOption>> hide = this.f80582e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "optionSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C37539Zi4.item_operator_filter_title ? new C20509d(this, m41761u) : i == C37539Zi4.item_operator_multi_select_filter ? new C20506b(this, m41761u) : i == C37539Zi4.item_operator_range_select_filter ? new C20508c(this, m41761u) : i == C37539Zi4.item_operator_toggle_select_filter ? new C20512e(this, m41761u) : new C29735w1(m41761u);
    }
}
