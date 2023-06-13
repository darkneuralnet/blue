package p000;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.IssueType;
import co.bird.android.widget.VehicleSummaryView;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C50651vp2;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0007 !\u0015\u0018\u001a\u001c\"B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eR\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\n0\n0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00100\u00100\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00100\u00100\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\n0\n0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016¨\u0006#"}, m28432d2 = {"Lvp2;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/Observable;", "w", "", "v", "z", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "commandSubject", DateTokenConverter.CONVERTER_KEY, "categorySubject", "e", "noteSubject", "f", "submitSubject", "<init>", "()V", C17296a.f69688o, "b", "g", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vp2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50651vp2 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<Unit> f114738c;

    /* renamed from: d */
    public final C24558d<String> f114739d;

    /* renamed from: e */
    public final C24558d<String> f114740e;

    /* renamed from: f */
    public final C24558d<Unit> f114741f;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"Lvp2$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/TextView;", "category", "Landroid/widget/CheckBox;", "c", "Landroid/widget/CheckBox;", "check", "Landroid/view/View;", "view", "<init>", "(Lvp2;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLegacyWorkOrderInspectionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyWorkOrderInspectionAdapter.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/LegacyWorkOrderInspectionAdapter$CategoryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,167:1\n18#2:168\n9#3,4:169\n*S KotlinDebug\n*F\n+ 1 LegacyWorkOrderInspectionAdapter.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/LegacyWorkOrderInspectionAdapter$CategoryViewHolder\n*L\n90#1:168\n90#1:169,4\n*E\n"})
    /* renamed from: vp2$a */
    /* loaded from: classes3.dex */
    public final class C29650a extends C29735w1 {

        /* renamed from: b */
        public final TextView f114742b;

        /* renamed from: c */
        public final CheckBox f114743c;

        /* renamed from: d */
        public final /* synthetic */ C50651vp2 f114744d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29650a(C50651vp2 c50651vp2, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f114744d = c50651vp2;
            this.f114742b = (TextView) view.findViewById(C44062ki4.category);
            this.f114743c = (CheckBox) view.findViewById(C44062ki4.check);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f114744d.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof C34475Mg0)) {
                m105816c = null;
            }
            C34475Mg0 c34475Mg0 = (C34475Mg0) m105816c;
            if (c34475Mg0 != null) {
                TextView textView = this.f114742b;
                int m95069d = c34475Mg0.m95069d();
                String m95071b = c34475Mg0.m95071b();
                textView.setText(m95069d + ". " + m95071b);
                this.f114743c.setChecked(c34475Mg0.m95070c());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lvp2$b;", "Lw1;", "", "position", "", "bind", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "commandButton", "Landroid/view/View;", "view", "<init>", "(Lvp2;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLegacyWorkOrderInspectionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyWorkOrderInspectionAdapter.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/LegacyWorkOrderInspectionAdapter$CommandViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,167:1\n18#2:168\n9#3,4:169\n*S KotlinDebug\n*F\n+ 1 LegacyWorkOrderInspectionAdapter.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/LegacyWorkOrderInspectionAdapter$CommandViewHolder\n*L\n81#1:168\n81#1:169,4\n*E\n"})
    /* renamed from: vp2$b */
    /* loaded from: classes3.dex */
    public final class C29651b extends C29735w1 {

        /* renamed from: b */
        public final Button f114745b;

        /* renamed from: c */
        public final /* synthetic */ C50651vp2 f114746c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: vp2$b$a */
        /* loaded from: classes3.dex */
        public static final class C29652a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C50651vp2 f114747g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29652a(C50651vp2 c50651vp2) {
                super(1);
                this.f114747g = c50651vp2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f114747g.f114738c.onNext(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29651b(C50651vp2 c50651vp2, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f114746c = c50651vp2;
            Button button = (Button) view;
            this.f114745b = button;
            C34585Ms2.m94661j(button, new C29652a(c50651vp2));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            Button button = this.f114745b;
            Object m105816c = this.f114746c.m94545o().m109394h().get(i).m105816c();
            if (m105816c != null) {
                z = m105816c instanceof CharSequence;
            } else {
                z = true;
            }
            if (!z) {
                m105816c = null;
            }
            button.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lvp2$c;", "Lw1;", "", "position", "", "bind", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "button", "Landroid/view/View;", "view", "<init>", "(Lvp2;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLegacyWorkOrderInspectionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyWorkOrderInspectionAdapter.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/LegacyWorkOrderInspectionAdapter$IssueButtonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,167:1\n18#2:168\n9#3,4:169\n*S KotlinDebug\n*F\n+ 1 LegacyWorkOrderInspectionAdapter.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/LegacyWorkOrderInspectionAdapter$IssueButtonViewHolder\n*L\n120#1:168\n120#1:169,4\n*E\n"})
    /* renamed from: vp2$c */
    /* loaded from: classes3.dex */
    public final class C29653c extends C29735w1 {

        /* renamed from: b */
        public final Button f114748b;

        /* renamed from: c */
        public final /* synthetic */ C50651vp2 f114749c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nLegacyWorkOrderInspectionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyWorkOrderInspectionAdapter.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/LegacyWorkOrderInspectionAdapter$IssueButtonViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n18#2:168\n9#3,4:169\n1#4:173\n*S KotlinDebug\n*F\n+ 1 LegacyWorkOrderInspectionAdapter.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/LegacyWorkOrderInspectionAdapter$IssueButtonViewHolder$1\n*L\n113#1:168\n113#1:169,4\n*E\n"})
        /* renamed from: vp2$c$a */
        /* loaded from: classes3.dex */
        public static final class C29654a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C50651vp2 f114750g;

            /* renamed from: h */
            public final /* synthetic */ C29653c f114751h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29654a(C50651vp2 c50651vp2, C29653c c29653c) {
                super(1);
                this.f114750g = c50651vp2;
                this.f114751h = c29653c;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                String str;
                Object m105816c = this.f114750g.m94545o().m109394h().get(this.f114751h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof Pair)) {
                    m105816c = null;
                }
                Pair pair = (Pair) m105816c;
                if (pair == null || (str = (String) pair.getFirst()) == null) {
                    return;
                }
                this.f114750g.f114739d.onNext(str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29653c(C50651vp2 c50651vp2, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f114749c = c50651vp2;
            Button button = (Button) view;
            this.f114748b = button;
            C34585Ms2.m94661j(button, new C29654a(c50651vp2, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Button button = this.f114748b;
            Object m105816c = this.f114749c.m94545o().m109394h().get(i).m105816c();
            String str = null;
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                str = (String) pair.getSecond();
            }
            button.setText(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u0011"}, m28432d2 = {"Lvp2$d;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/TextView;", "issue", "c", Stripe3ds2AuthParams.FIELD_SOURCE, "Landroid/view/View;", "view", "<init>", "(Lvp2;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLegacyWorkOrderInspectionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyWorkOrderInspectionAdapter.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/LegacyWorkOrderInspectionAdapter$IssueTypeViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,167:1\n18#2:168\n9#3,4:169\n*S KotlinDebug\n*F\n+ 1 LegacyWorkOrderInspectionAdapter.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/LegacyWorkOrderInspectionAdapter$IssueTypeViewHolder\n*L\n102#1:168\n102#1:169,4\n*E\n"})
    /* renamed from: vp2$d */
    /* loaded from: classes3.dex */
    public final class C29655d extends C29735w1 {

        /* renamed from: b */
        public final TextView f114752b;

        /* renamed from: c */
        public final TextView f114753c;

        /* renamed from: d */
        public final /* synthetic */ C50651vp2 f114754d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29655d(C50651vp2 c50651vp2, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f114754d = c50651vp2;
            this.f114752b = (TextView) view.findViewById(C44062ki4.issue);
            this.f114753c = (TextView) view.findViewById(C44062ki4.source);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f114754d.m94545o().m109394h().get(i).m105816c();
            String str = null;
            if (!(m105816c instanceof IssueType)) {
                m105816c = null;
            }
            IssueType issueType = (IssueType) m105816c;
            TextView textView = this.f114752b;
            if (issueType != null) {
                str = issueType.getDisplay();
            }
            textView.setText(str);
            this.f114753c.setText(this.itemView.getContext().getString(C45871nl4.field_repair_source_operator));
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lvp2$e;", "Lw1;", "", "position", "", "bind", "Landroid/widget/EditText;", "b", "Landroid/widget/EditText;", "notes", "", "c", "Z", "dataBound", "Landroid/view/View;", "view", "<init>", "(Lvp2;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLegacyWorkOrderInspectionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyWorkOrderInspectionAdapter.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/LegacyWorkOrderInspectionAdapter$NotesViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,167:1\n18#2:168\n9#3,4:169\n*S KotlinDebug\n*F\n+ 1 LegacyWorkOrderInspectionAdapter.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/LegacyWorkOrderInspectionAdapter$NotesViewHolder\n*L\n147#1:168\n147#1:169,4\n*E\n"})
    /* renamed from: vp2$e */
    /* loaded from: classes3.dex */
    public final class C29656e extends C29735w1 {

        /* renamed from: b */
        public final EditText f114755b;

        /* renamed from: c */
        public boolean f114756c;

        /* renamed from: d */
        public final /* synthetic */ C50651vp2 f114757d;

        @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n"}, m28432d2 = {"vp2$e$a", "Ld36;", "", "s", "", "start", "before", "count", "", "onTextChanged", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: vp2$e$a */
        /* loaded from: classes3.dex */
        public static final class C29657a extends C39530d36 {

            /* renamed from: c */
            public final /* synthetic */ C50651vp2 f114759c;

            public C29657a(C50651vp2 c50651vp2) {
                this.f114759c = c50651vp2;
            }

            @Override // p000.C39530d36, android.text.TextWatcher
            public void onTextChanged(CharSequence s, int i, int i2, int i3) {
                Intrinsics.checkNotNullParameter(s, "s");
                if (!C29656e.this.f114756c) {
                    return;
                }
                this.f114759c.f114740e.onNext(s.toString());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29656e(final C50651vp2 c50651vp2, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f114757d = c50651vp2;
            EditText editText = (EditText) view;
            this.f114755b = editText;
            this.f114756c = false;
            editText.addTextChangedListener(new C29657a(c50651vp2));
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: wp2
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z) {
                    C50651vp2.C29656e.m7967e(C50651vp2.C29656e.this, c50651vp2, view2, z);
                }
            });
        }

        /* renamed from: e */
        public static final void m7967e(C29656e this$0, final C50651vp2 this$1, View view, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (z) {
                ViewParent parent = this$0.f114755b.getParent();
                Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                final RecyclerView recyclerView = (RecyclerView) parent;
                new Handler().postDelayed(new Runnable() { // from class: xp2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C50651vp2.C29656e.m7965j(RecyclerView.this, this$1);
                    }
                }, 50L);
            }
        }

        /* renamed from: j */
        public static final void m7965j(RecyclerView recyclerView, C50651vp2 this$0) {
            Intrinsics.checkNotNullParameter(recyclerView, "$recyclerView");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            recyclerView.smoothScrollToPosition(this$0.m94545o().m109394h().size() - 1);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            EditText editText = this.f114755b;
            Object m105816c = this.f114757d.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            editText.setText((CharSequence) m105816c);
            this.f114756c = true;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lvp2$f;", "Lw1;", "", "position", "", "bind", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "submitButton", "Landroid/view/View;", "view", "<init>", "(Lvp2;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLegacyWorkOrderInspectionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyWorkOrderInspectionAdapter.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/LegacyWorkOrderInspectionAdapter$SubmitViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,167:1\n18#2:168\n9#3,4:169\n*S KotlinDebug\n*F\n+ 1 LegacyWorkOrderInspectionAdapter.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/LegacyWorkOrderInspectionAdapter$SubmitViewHolder\n*L\n160#1:168\n160#1:169,4\n*E\n"})
    /* renamed from: vp2$f */
    /* loaded from: classes3.dex */
    public final class C29658f extends C29735w1 {

        /* renamed from: b */
        public final Button f114760b;

        /* renamed from: c */
        public final /* synthetic */ C50651vp2 f114761c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: vp2$f$a */
        /* loaded from: classes3.dex */
        public static final class C29659a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C50651vp2 f114762g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29659a(C50651vp2 c50651vp2) {
                super(1);
                this.f114762g = c50651vp2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f114762g.f114741f.onNext(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29658f(C50651vp2 c50651vp2, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f114761c = c50651vp2;
            Button button = (Button) view;
            this.f114760b = button;
            C34585Ms2.m94661j(button, new C29659a(c50651vp2));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f114761c.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof C40362eT5)) {
                m105816c = null;
            }
            C40362eT5 c40362eT5 = (C40362eT5) m105816c;
            if (c40362eT5 != null) {
                this.f114760b.setText(c40362eT5.m42855c());
                this.f114760b.setEnabled(c40362eT5.m42856b());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lvp2$g;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/widget/VehicleSummaryView;", "b", "Lco/bird/android/widget/VehicleSummaryView;", "vehicleSummaryView", "Landroid/view/View;", "view", "<init>", "(Lvp2;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLegacyWorkOrderInspectionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyWorkOrderInspectionAdapter.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/LegacyWorkOrderInspectionAdapter$VehicleSummaryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n18#2:168\n9#3,4:169\n1#4:173\n*S KotlinDebug\n*F\n+ 1 LegacyWorkOrderInspectionAdapter.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/LegacyWorkOrderInspectionAdapter$VehicleSummaryViewHolder\n*L\n69#1:168\n69#1:169,4\n*E\n"})
    /* renamed from: vp2$g */
    /* loaded from: classes3.dex */
    public final class C29660g extends C29735w1 {

        /* renamed from: b */
        public final VehicleSummaryView f114763b;

        /* renamed from: c */
        public final /* synthetic */ C50651vp2 f114764c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29660g(C50651vp2 c50651vp2, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f114764c = c50651vp2;
            this.f114763b = (VehicleSummaryView) view;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f114764c.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof C50043un6)) {
                m105816c = null;
            }
            C50043un6 c50043un6 = (C50043un6) m105816c;
            if (c50043un6 != null) {
                this.f114763b.m54355e(c50043un6);
            }
        }
    }

    public C50651vp2() {
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f114738c = m31902e;
        C24558d<String> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<String>()");
        this.f114739d = m31902e2;
        C24558d<String> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<String>()");
        this.f114740e = m31902e3;
        C24558d<Unit> m31902e4 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e4, "create<Unit>()");
        this.f114741f = m31902e4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C53023zp2());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C52430yp2();
    }

    /* renamed from: v */
    public final Observable<String> m7972v() {
        Observable<String> hide = this.f114739d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "categorySubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<Unit> m7971w() {
        Observable<Unit> hide = this.f114738c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "commandSubject.hide()");
        return hide;
    }

    /* renamed from: z */
    public final Observable<String> m7970z() {
        Observable<String> hide = this.f114740e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "noteSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C37080Xj4.item_vehicle_summary ? new C29660g(this, m41761u) : i == C45268mk4.item_button_secondary ? new C29651b(this, m41761u) : i == C37080Xj4.item_category_header ? new C29650a(this, m41761u) : i == C37080Xj4.item_issue_header ? new C29655d(this, m41761u) : i == C37080Xj4.item_work_order_notes ? new C29656e(this, m41761u) : i == C37080Xj4.item_dropdown_button ? new C29653c(this, m41761u) : i == C45268mk4.item_button ? new C29658f(this, m41761u) : new C29735w1(m41761u);
    }
}
