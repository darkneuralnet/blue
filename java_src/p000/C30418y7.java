package p000;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.C11905h;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003'\u0014\u001aB\u0007¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0014\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R%\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR=\u0010$\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020! \u0019*\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0018\u00010\u001f0\u001f0\u00178\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001d¨\u0006("}, m28432d2 = {"Ly7;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lw1;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "getItemViewType", "", "LH6;", "adapterSections", "r", "o", "LE6;", "b", "LE6;", "adapterData", "Lio/reactivex/subjects/d;", "", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "q", "()Lio/reactivex/subjects/d;", "searchPublisher", "Lkotlin/Pair;", "Lco/bird/android/model/LegacyRepairType;", "", DateTokenConverter.CONVERTER_KEY, "p", "repairChecksPublisher", "<init>", "()V", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: y7 */
/* loaded from: classes3.dex */
public final class C30418y7 extends RecyclerView.AbstractC11843h<C29735w1> {

    /* renamed from: b */
    public final C1737E6 f118765b = new C1737E6(this);

    /* renamed from: c */
    public final C24558d<CharSequence> f118766c;

    /* renamed from: d */
    public final C24558d<Pair<LegacyRepairType, Boolean>> f118767d;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Ly7$a;", "Lw1;", "", "position", "", "bind", "Lht6;", "b", "Lht6;", "binding", "Landroid/view/View;", "view", "<init>", "(Ly7;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAddRepairListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddRepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/addrepair/adapters/AddRepairListAdapter$RepairItemViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,134:1\n18#2:135\n18#2:140\n9#3,4:136\n9#3,4:141\n*S KotlinDebug\n*F\n+ 1 AddRepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/addrepair/adapters/AddRepairListAdapter$RepairItemViewHolder\n*L\n109#1:135\n110#1:140\n109#1:136,4\n110#1:141,4\n*E\n"})
    /* renamed from: y7$a */
    /* loaded from: classes3.dex */
    public final class C30419a extends C29735w1 {

        /* renamed from: b */
        public final C42395ht6 f118768b;

        /* renamed from: c */
        public final /* synthetic */ C30418y7 f118769c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: y7$a$a */
        /* loaded from: classes3.dex */
        public static final class C30420a extends Lambda implements Function1<View, Unit> {
            public C30420a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C30419a.this.f118768b.f86067b.setChecked(!C30419a.this.f118768b.f86067b.isChecked());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "checked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nAddRepairListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddRepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/addrepair/adapters/AddRepairListAdapter$RepairItemViewHolder$2\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n18#2:135\n9#3,4:136\n1#4:140\n*S KotlinDebug\n*F\n+ 1 AddRepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/addrepair/adapters/AddRepairListAdapter$RepairItemViewHolder$2\n*L\n101#1:135\n101#1:136,4\n*E\n"})
        /* renamed from: y7$a$b */
        /* loaded from: classes3.dex */
        public static final class C30421b extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C30418y7 f118771g;

            /* renamed from: h */
            public final /* synthetic */ C30419a f118772h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30421b(C30418y7 c30418y7, C30419a c30419a) {
                super(2);
                this.f118771g = c30418y7;
                this.f118772h = c30419a;
            }

            /* renamed from: a */
            public final void m4124a(CompoundButton compoundButton, boolean z) {
                LegacyRepairType m85824f;
                Object m105816c = this.f118771g.f118765b.m109394h().get(this.f118772h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof SD4)) {
                    m105816c = null;
                }
                SD4 sd4 = (SD4) m105816c;
                if (sd4 != null) {
                    sd4.m85823g(z);
                }
                if (sd4 != null && (m85824f = sd4.m85824f()) != null) {
                    this.f118771g.m4128p().onNext(new Pair<>(m85824f, Boolean.valueOf(z)));
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
                m4124a(compoundButton, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30419a(C30418y7 c30418y7, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f118769c = c30418y7;
            C42395ht6 m35620a = C42395ht6.m35620a(view);
            Intrinsics.checkNotNullExpressionValue(m35620a, "bind(view)");
            this.f118768b = m35620a;
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            C34585Ms2.m94661j(itemView, new C30420a());
            CheckBox checkBox = m35620a.f86067b;
            Intrinsics.checkNotNullExpressionValue(checkBox, "binding.checkbox");
            C34585Ms2.m94663h(checkBox, new C30421b(c30418y7, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            String str;
            boolean z;
            C2637G6 c2637g6 = this.f118769c.f118765b.m109394h().get(i);
            TextView textView = this.f118768b.f86068c;
            Object m105816c = c2637g6.m105816c();
            SD4 sd4 = null;
            if (!(m105816c instanceof SD4)) {
                m105816c = null;
            }
            SD4 sd42 = (SD4) m105816c;
            if (sd42 != null) {
                str = sd42.m85826d();
            } else {
                str = null;
            }
            textView.setText(str);
            CheckBox checkBox = this.f118768b.f86067b;
            Object m105816c2 = c2637g6.m105816c();
            if (m105816c2 instanceof SD4) {
                sd4 = m105816c2;
            }
            SD4 sd43 = sd4;
            if (sd43 != null) {
                z = sd43.m85827c();
            } else {
                z = false;
            }
            checkBox.setChecked(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Ly7$b;", "Lw1;", "", "position", "", "bind", "Lkt6;", "b", "Lkt6;", "binding", "Landroid/view/View;", "view", "<init>", "(Ly7;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAddRepairListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddRepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/addrepair/adapters/AddRepairListAdapter$SearchViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,134:1\n18#2:135\n9#3,4:136\n*S KotlinDebug\n*F\n+ 1 AddRepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/addrepair/adapters/AddRepairListAdapter$SearchViewHolder\n*L\n91#1:135\n91#1:136,4\n*E\n"})
    /* renamed from: y7$b */
    /* loaded from: classes3.dex */
    public final class C30422b extends C29735w1 {

        /* renamed from: b */
        public final C44174kt6 f118773b;

        /* renamed from: c */
        public final /* synthetic */ C30418y7 f118774c;

        @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n"}, m28432d2 = {"y7$b$a", "Ld36;", "", "s", "", "start", "before", "count", "", "onTextChanged", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: y7$b$a */
        /* loaded from: classes3.dex */
        public static final class C30423a extends C39530d36 {

            /* renamed from: b */
            public final /* synthetic */ C30418y7 f118775b;

            public C30423a(C30418y7 c30418y7) {
                this.f118775b = c30418y7;
            }

            @Override // p000.C39530d36, android.text.TextWatcher
            public void onTextChanged(CharSequence s, int i, int i2, int i3) {
                Intrinsics.checkNotNullParameter(s, "s");
                super.onTextChanged(s, i, i2, i3);
                this.f118775b.m4127q().onNext(s);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/widget/TextView;", "<anonymous parameter 0>", "", "actionId", "Landroid/view/KeyEvent;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: y7$b$b */
        /* loaded from: classes3.dex */
        public static final class C30424b extends Lambda implements Function3<TextView, Integer, KeyEvent, Boolean> {
            public C30424b() {
                super(3);
            }

            /* renamed from: a */
            public final Boolean m4123a(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 3) {
                    Object systemService = C30422b.this.itemView.getContext().getSystemService("input_method");
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(C30422b.this.itemView.getWindowToken(), 0);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Boolean invoke(TextView textView, Integer num, KeyEvent keyEvent) {
                return m4123a(textView, num.intValue(), keyEvent);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30422b(C30418y7 c30418y7, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f118774c = c30418y7;
            C44174kt6 m28231a = C44174kt6.m28231a(view);
            Intrinsics.checkNotNullExpressionValue(m28231a, "bind(view)");
            this.f118773b = m28231a;
            m28231a.f95164e.addTextChangedListener(new C30423a(c30418y7));
            EditText editText = m28231a.f95164e;
            Intrinsics.checkNotNullExpressionValue(editText, "binding.search");
            C34585Ms2.m94658m(editText, new C30424b());
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            String model;
            super.bind(i);
            TextView textView = this.f118773b.f95162c;
            Object m105816c = this.f118774c.f118765b.m109394h().get(i).m105816c();
            String str = null;
            if (!(m105816c instanceof WireBird)) {
                m105816c = null;
            }
            WireBird wireBird = (WireBird) m105816c;
            if (wireBird != null && (model = wireBird.getModel()) != null) {
                str = model.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toUpperCase()");
            }
            textView.setText(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Ly7$c;", "Lw1;", "", "position", "", "bind", "Lit6;", "b", "Lit6;", "binding", "Landroid/view/View;", "view", "<init>", "(Ly7;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAddRepairListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddRepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/addrepair/adapters/AddRepairListAdapter$SubRepairItemViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,134:1\n18#2:135\n18#2:140\n18#2:145\n9#3,4:136\n9#3,4:141\n9#3,4:146\n*S KotlinDebug\n*F\n+ 1 AddRepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/addrepair/adapters/AddRepairListAdapter$SubRepairItemViewHolder\n*L\n128#1:135\n129#1:140\n130#1:145\n128#1:136,4\n129#1:141,4\n130#1:146,4\n*E\n"})
    /* renamed from: y7$c */
    /* loaded from: classes3.dex */
    public final class C30425c extends C29735w1 {

        /* renamed from: b */
        public final C42988it6 f118777b;

        /* renamed from: c */
        public final /* synthetic */ C30418y7 f118778c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: y7$c$a */
        /* loaded from: classes3.dex */
        public static final class C30426a extends Lambda implements Function1<View, Unit> {
            public C30426a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C30425c.this.f118777b.f91656b.setChecked(!C30425c.this.f118777b.f91656b.isChecked());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "checked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nAddRepairListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddRepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/addrepair/adapters/AddRepairListAdapter$SubRepairItemViewHolder$2\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n18#2:135\n9#3,4:136\n1#4:140\n*S KotlinDebug\n*F\n+ 1 AddRepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/addrepair/adapters/AddRepairListAdapter$SubRepairItemViewHolder$2\n*L\n120#1:135\n120#1:136,4\n*E\n"})
        /* renamed from: y7$c$b */
        /* loaded from: classes3.dex */
        public static final class C30427b extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C30418y7 f118780g;

            /* renamed from: h */
            public final /* synthetic */ C30425c f118781h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30427b(C30418y7 c30418y7, C30425c c30425c) {
                super(2);
                this.f118780g = c30418y7;
                this.f118781h = c30425c;
            }

            /* renamed from: a */
            public final void m4121a(CompoundButton compoundButton, boolean z) {
                LegacyRepairType m85824f;
                Object m105816c = this.f118780g.f118765b.m109394h().get(this.f118781h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof SD4)) {
                    m105816c = null;
                }
                SD4 sd4 = (SD4) m105816c;
                if (sd4 != null) {
                    sd4.m85823g(z);
                }
                if (sd4 != null && (m85824f = sd4.m85824f()) != null) {
                    this.f118780g.m4128p().onNext(new Pair<>(m85824f, Boolean.valueOf(z)));
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
                m4121a(compoundButton, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30425c(C30418y7 c30418y7, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f118778c = c30418y7;
            C42988it6 m31674a = C42988it6.m31674a(view);
            Intrinsics.checkNotNullExpressionValue(m31674a, "bind(view)");
            this.f118777b = m31674a;
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            C34585Ms2.m94661j(itemView, new C30426a());
            CheckBox checkBox = m31674a.f91656b;
            Intrinsics.checkNotNullExpressionValue(checkBox, "binding.checkbox");
            C34585Ms2.m94663h(checkBox, new C30427b(c30418y7, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            String str;
            String str2;
            boolean z;
            C2637G6 c2637g6 = this.f118778c.f118765b.m109394h().get(i);
            TextView textView = this.f118777b.f91657c;
            Object m105816c = c2637g6.m105816c();
            SD4 sd4 = null;
            if (!(m105816c instanceof SD4)) {
                m105816c = null;
            }
            SD4 sd42 = (SD4) m105816c;
            if (sd42 != null) {
                str = sd42.m85826d();
            } else {
                str = null;
            }
            textView.setText(str);
            TextView textView2 = this.f118777b.f91658d;
            Object m105816c2 = c2637g6.m105816c();
            if (!(m105816c2 instanceof SD4)) {
                m105816c2 = null;
            }
            SD4 sd43 = (SD4) m105816c2;
            if (sd43 != null) {
                str2 = sd43.m85828b();
            } else {
                str2 = null;
            }
            textView2.setText(str2);
            CheckBox checkBox = this.f118777b.f91656b;
            Object m105816c3 = c2637g6.m105816c();
            if (m105816c3 instanceof SD4) {
                sd4 = m105816c3;
            }
            SD4 sd44 = sd4;
            if (sd44 != null) {
                z = sd44.m85827c();
            } else {
                z = false;
            }
            checkBox.setChecked(z);
        }
    }

    public C30418y7() {
        C24558d<CharSequence> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<CharSequence>()");
        this.f118766c = m31902e;
        C24558d<Pair<LegacyRepairType, Boolean>> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Pair<LegacyRepairType, Boolean>>()");
        this.f118767d = m31902e2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f118765b.m109395g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemViewType(int i) {
        return this.f118765b.m109394h().get(i).m105817b();
    }

    /* renamed from: o */
    public final List<C3023H6> m4129o() {
        return this.f118765b.m109392j();
    }

    /* renamed from: p */
    public final C24558d<Pair<LegacyRepairType, Boolean>> m4128p() {
        return this.f118767d;
    }

    /* renamed from: q */
    public final C24558d<CharSequence> m4127q() {
        return this.f118766c;
    }

    /* renamed from: r */
    public final void m4126r(List<C3023H6> adapterSections) {
        Intrinsics.checkNotNullParameter(adapterSections, "adapterSections");
        if (this.f118765b.m109392j().isEmpty()) {
            this.f118765b.m109400b(adapterSections);
            return;
        }
        C11905h.C11910e mo30a = new C28179s7().mo30a(this.f118765b.m109392j(), adapterSections);
        this.f118765b.m109399c();
        this.f118765b.m109401a(adapterSections);
        mo30a.m66261d(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(C29735w1 holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C34740Nj4.view_repair_logger_search ? new C30422b(this, m41761u) : i == C34740Nj4.view_repair_logger_add_repair ? new C30419a(this, m41761u) : i == C34740Nj4.view_repair_logger_add_sub_repair ? new C30425c(this, m41761u) : new C29735w1(m41761u);
    }
}
