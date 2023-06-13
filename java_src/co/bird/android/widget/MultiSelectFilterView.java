package co.bird.android.widget;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.persistence.OperatorOptionFilter;
import co.bird.android.model.persistence.nestedstructures.OperatorFilterOption;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106B\u0019\b\u0016\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b5\u00107B!\b\u0016\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u00109\u001a\u000208¢\u0006\u0004\b5\u0010:J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R)\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00140\u00140\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010*\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R0\u00102\u001a\b\u0012\u0004\u0012\u00020,0+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006;"}, m28432d2 = {"Lco/bird/android/widget/MultiSelectFilterView;", "Landroidx/cardview/widget/CardView;", "Landroid/util/AttributeSet;", "attrs", "", "t", "Landroid/widget/CompoundButton;", "checkBox", "", "isChecked", "u", "Landroid/widget/TextView;", "k", "Landroid/widget/TextView;", "headerText", "Landroid/widget/LinearLayout;", "l", "Landroid/widget/LinearLayout;", "optionsContainer", "La94;", "Lco/bird/android/model/persistence/OperatorOptionFilter;", "m", "La94;", "filtersRelay", "LZ84;", "kotlin.jvm.PlatformType", "n", "Lkotlin/Lazy;", "getFiltersPropertyObservable", "()LZ84;", "filtersPropertyObservable", "filter", "r", "()Lco/bird/android/model/persistence/OperatorOptionFilter;", "setFilter", "(Lco/bird/android/model/persistence/OperatorOptionFilter;)V", "", "value", "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", "title", "", "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;", "list", "s", "()Ljava/util/List;", "setOptions", "(Ljava/util/List;)V", "options", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMultiSelectFilterView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiSelectFilterView.kt\nco/bird/android/widget/MultiSelectFilterView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1855#2,2:112\n1549#2:114\n1620#2,3:115\n*S KotlinDebug\n*F\n+ 1 MultiSelectFilterView.kt\nco/bird/android/widget/MultiSelectFilterView\n*L\n74#1:112,2\n99#1:114\n99#1:115,3\n*E\n"})
/* loaded from: classes4.dex */
public final class MultiSelectFilterView extends CardView {

    /* renamed from: k */
    public final TextView f67399k;

    /* renamed from: l */
    public final LinearLayout f67400l;

    /* renamed from: m */
    public final C37791a94<OperatorOptionFilter> f67401m;

    /* renamed from: n */
    public final Lazy f67402n;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "Lco/bird/android/model/persistence/OperatorOptionFilter;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.MultiSelectFilterView$a */
    /* loaded from: classes4.dex */
    public static final class C16537a extends Lambda implements Function0<Z84<OperatorOptionFilter>> {
        public C16537a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<OperatorOptionFilter> invoke() {
            return Z84.f47888d.m73663b(MultiSelectFilterView.this.f67401m);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/view/View;", "checkbox", "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;", C17296a.f69688o, "(Landroid/view/View;)Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMultiSelectFilterView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiSelectFilterView.kt\nco/bird/android/widget/MultiSelectFilterView$options$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n1#2:112\n*E\n"})
    /* renamed from: co.bird.android.widget.MultiSelectFilterView$b */
    /* loaded from: classes4.dex */
    public static final class C16538b extends Lambda implements Function1<View, OperatorFilterOption> {

        /* renamed from: g */
        public static final C16538b f67404g = new C16538b();

        public C16538b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final OperatorFilterOption invoke(View checkbox) {
            CompoundButton compoundButton;
            boolean z;
            Intrinsics.checkNotNullParameter(checkbox, "checkbox");
            Object tag = checkbox.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type co.bird.android.model.persistence.nestedstructures.OperatorFilterOption");
            OperatorFilterOption operatorFilterOption = (OperatorFilterOption) tag;
            if (checkbox instanceof CompoundButton) {
                compoundButton = (CompoundButton) checkbox;
            } else {
                compoundButton = null;
            }
            if (compoundButton != null) {
                z = compoundButton.isChecked();
            } else {
                z = false;
            }
            OperatorFilterOption copy$default = OperatorFilterOption.copy$default(operatorFilterOption, null, null, null, z, null, null, 55, null);
            checkbox.setTag(copy$default);
            return copy$default;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "buttonView", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMultiSelectFilterView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiSelectFilterView.kt\nco/bird/android/widget/MultiSelectFilterView$options$2$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n1#2:112\n*E\n"})
    /* renamed from: co.bird.android.widget.MultiSelectFilterView$c */
    /* loaded from: classes4.dex */
    public static final class C16539c extends Lambda implements Function2<CompoundButton, Boolean, Unit> {
        public C16539c() {
            super(2);
        }

        /* renamed from: a */
        public final void m54537a(CompoundButton compoundButton, boolean z) {
            if (compoundButton != null) {
                MultiSelectFilterView.this.m54539u(compoundButton, z);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
            m54537a(compoundButton, bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiSelectFilterView(Context context) {
        super(context);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_multi_select_filter, this, true);
        setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_vertical_margin));
        setBackground(new ColorDrawable(NA0.m94301c(getContext(), C32364Df4.white)));
        View findViewById = findViewById(C52955zi4.headerText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.headerText)");
        this.f67399k = (TextView) findViewById;
        View findViewById2 = findViewById(C52955zi4.options);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.options)");
        this.f67400l = (LinearLayout) findViewById2;
        this.f67401m = C37791a94.C10586a.create$default(C37791a94.f49908h, new OperatorOptionFilter("", null, 0, null, null, null, null, null, null, null, null, 2046, null), null, 2, null);
        lazy = LazyKt__LazyJVMKt.lazy(new C16537a());
        this.f67402n = lazy;
        m54540t(null);
    }

    /* renamed from: r */
    public final OperatorOptionFilter m54542r() {
        OperatorOptionFilter copy;
        Object tag = this.f67399k.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type co.bird.android.model.persistence.OperatorOptionFilter");
        copy = r3.copy((r24 & 1) != 0 ? r3.f66683id : null, (r24 & 2) != 0 ? r3.kind : null, (r24 & 4) != 0 ? r3.ordinal : 0, (r24 & 8) != 0 ? r3.type : null, (r24 & 16) != 0 ? r3.label : null, (r24 & 32) != 0 ? r3.options : m54541s(), (r24 & 64) != 0 ? r3.logicOperator : null, (r24 & 128) != 0 ? r3.icon : null, (r24 & 256) != 0 ? r3.iconColor : null, (r24 & 512) != 0 ? r3.coloredIcon : null, (r24 & 1024) != 0 ? ((OperatorOptionFilter) tag).iconBackgroundColor : null);
        return copy;
    }

    /* renamed from: s */
    public final List<OperatorFilterOption> m54541s() {
        Sequence map;
        List<OperatorFilterOption> list;
        map = SequencesKt___SequencesKt.map(C41782gr6.m37379b(this.f67400l), C16538b.f67404g);
        list = SequencesKt___SequencesKt.toList(map);
        return list;
    }

    public final void setFilter(OperatorOptionFilter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f67399k.setTag(filter);
        setTitle(filter.getLabel());
        setOptions(filter.getOptions());
    }

    public final void setOptions(List<OperatorFilterOption> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f67400l.removeAllViews();
        for (OperatorFilterOption operatorFilterOption : list) {
            View.inflate(getContext(), C45268mk4.item_multi_select_filter_checkbox, this.f67400l);
            LinearLayout linearLayout = this.f67400l;
            View m37380a = C41782gr6.m37380a(linearLayout, linearLayout.getChildCount() - 1);
            Intrinsics.checkNotNull(m37380a, "null cannot be cast to non-null type android.widget.CheckBox");
            CheckBox checkBox = (CheckBox) m37380a;
            checkBox.setTag(operatorFilterOption);
            checkBox.setText(operatorFilterOption.getName());
            checkBox.setChecked(operatorFilterOption.getEnabled());
            C34585Ms2.m94663h(checkBox, new C16539c());
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.f67399k.setText(charSequence);
    }

    /* renamed from: t */
    public final void m54540t(AttributeSet attributeSet) {
    }

    /* renamed from: u */
    public final void m54539u(CompoundButton compoundButton, boolean z) {
        OperatorFilterOption operatorFilterOption;
        int collectionSizeOrDefault;
        OperatorOptionFilter copy;
        Object tag = compoundButton.getTag();
        OperatorFilterOption operatorFilterOption2 = null;
        if (tag instanceof OperatorFilterOption) {
            operatorFilterOption = (OperatorFilterOption) tag;
        } else {
            operatorFilterOption = null;
        }
        if (operatorFilterOption != null) {
            operatorFilterOption2 = OperatorFilterOption.copy$default(operatorFilterOption, null, null, null, z, null, null, 55, null);
        }
        compoundButton.setTag(operatorFilterOption2);
        if (operatorFilterOption2 != null) {
            OperatorOptionFilter m54542r = m54542r();
            List<OperatorFilterOption> options = m54542r().getOptions();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(options, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (OperatorFilterOption operatorFilterOption3 : options) {
                if (Intrinsics.areEqual(operatorFilterOption3.getValue(), operatorFilterOption2.getValue())) {
                    operatorFilterOption3 = operatorFilterOption2;
                }
                arrayList.add(operatorFilterOption3);
            }
            copy = m54542r.copy((r24 & 1) != 0 ? m54542r.f66683id : null, (r24 & 2) != 0 ? m54542r.kind : null, (r24 & 4) != 0 ? m54542r.ordinal : 0, (r24 & 8) != 0 ? m54542r.type : null, (r24 & 16) != 0 ? m54542r.label : null, (r24 & 32) != 0 ? m54542r.options : arrayList, (r24 & 64) != 0 ? m54542r.logicOperator : null, (r24 & 128) != 0 ? m54542r.icon : null, (r24 & 256) != 0 ? m54542r.iconColor : null, (r24 & 512) != 0 ? m54542r.coloredIcon : null, (r24 & 1024) != 0 ? m54542r.iconBackgroundColor : null);
            setFilter(copy);
        }
        this.f67401m.accept(m54542r());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiSelectFilterView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_multi_select_filter, this, true);
        setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_vertical_margin));
        setBackground(new ColorDrawable(NA0.m94301c(getContext(), C32364Df4.white)));
        View findViewById = findViewById(C52955zi4.headerText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.headerText)");
        this.f67399k = (TextView) findViewById;
        View findViewById2 = findViewById(C52955zi4.options);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.options)");
        this.f67400l = (LinearLayout) findViewById2;
        this.f67401m = C37791a94.C10586a.create$default(C37791a94.f49908h, new OperatorOptionFilter("", null, 0, null, null, null, null, null, null, null, null, 2046, null), null, 2, null);
        lazy = LazyKt__LazyJVMKt.lazy(new C16537a());
        this.f67402n = lazy;
        m54540t(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiSelectFilterView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C40788fB0.m41761u(context2, C45268mk4.view_multi_select_filter, this, true);
        setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_vertical_margin));
        setBackground(new ColorDrawable(NA0.m94301c(getContext(), C32364Df4.white)));
        View findViewById = findViewById(C52955zi4.headerText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.headerText)");
        this.f67399k = (TextView) findViewById;
        View findViewById2 = findViewById(C52955zi4.options);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.options)");
        this.f67400l = (LinearLayout) findViewById2;
        this.f67401m = C37791a94.C10586a.create$default(C37791a94.f49908h, new OperatorOptionFilter("", null, 0, null, null, null, null, null, null, null, null, 2046, null), null, 2, null);
        lazy = LazyKt__LazyJVMKt.lazy(new C16537a());
        this.f67402n = lazy;
        m54540t(attrs);
    }
}
