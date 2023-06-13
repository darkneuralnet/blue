package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.NonRepair;
import co.bird.android.model.NonRepairReason;
import co.bird.android.model.RepairCategory;
import co.bird.android.model.RepairIssue;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u0014B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u001a\u0010\u000f\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\fJ&\u0010\u0013\u001a\u00020\n2\u001e\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0004\u0012\u00020\n0\fR$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R.\u0010\u0017\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0004\u0012\u00020\n0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u001c"}, m28432d2 = {"LXE4;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Lkotlin/Function1;", "Lco/bird/android/model/RepairIssue;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "v", "Lkotlin/Pair;", "Lco/bird/android/model/RepairCategory;", "Lco/bird/android/model/NonRepair;", "w", "c", "Lkotlin/jvm/functions/Function1;", DateTokenConverter.CONVERTER_KEY, "onNonRepairClick", "<init>", "()V", C17296a.f69688o, "b", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: XE4 */
/* loaded from: classes3.dex */
public final class XE4 extends AbstractC52206yS0 {

    /* renamed from: c */
    public Function1<? super RepairIssue, Unit> f42913c;

    /* renamed from: d */
    public Function1<? super Pair<RepairCategory, NonRepair>, Unit> f42914d = C9392d.f42925g;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LXE4$a;", "Lw1;", "", "position", "", "bind", "Lbf2;", "b", "Lbf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LXE4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairV3OverviewIssueAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3OverviewIssueAdapter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewIssueAdapter$DividerViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,161:1\n18#2:162\n9#3,4:163\n*S KotlinDebug\n*F\n+ 1 RepairV3OverviewIssueAdapter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewIssueAdapter$DividerViewHolder\n*L\n151#1:162\n151#1:163,4\n*E\n"})
    /* renamed from: XE4$a */
    /* loaded from: classes3.dex */
    public final class C9387a extends C29735w1 {

        /* renamed from: b */
        public final C38676bf2 f42915b;

        /* renamed from: c */
        public final /* synthetic */ XE4 f42916c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9387a(XE4 xe4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f42916c = xe4;
            C38676bf2 m64204a = C38676bf2.m64204a(view);
            Intrinsics.checkNotNullExpressionValue(m64204a, "bind(view)");
            this.f42915b = m64204a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            TextView root = this.f42915b.getRoot();
            Object m105816c = this.f42916c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            root.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LXE4$b;", "Lw1;", "", "position", "", "bind", "Lcf2;", "b", "Lcf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LXE4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairV3OverviewIssueAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3OverviewIssueAdapter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewIssueAdapter$NonRepairViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n18#2:162\n9#3,4:163\n1#4:167\n*S KotlinDebug\n*F\n+ 1 RepairV3OverviewIssueAdapter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewIssueAdapter$NonRepairViewHolder\n*L\n122#1:162\n122#1:163,4\n*E\n"})
    /* renamed from: XE4$b */
    /* loaded from: classes3.dex */
    public final class C9388b extends C29735w1 {

        /* renamed from: b */
        public final C39269cf2 f42917b;

        /* renamed from: c */
        public final /* synthetic */ XE4 f42918c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nRepairV3OverviewIssueAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3OverviewIssueAdapter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewIssueAdapter$NonRepairViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,161:1\n1#2:162\n18#3:163\n9#4,4:164\n*S KotlinDebug\n*F\n+ 1 RepairV3OverviewIssueAdapter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewIssueAdapter$NonRepairViewHolder$1\n*L\n116#1:163\n116#1:164,4\n*E\n"})
        /* renamed from: XE4$b$a */
        /* loaded from: classes3.dex */
        public static final class C9389a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ XE4 f42920h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9389a(XE4 xe4) {
                super(1);
                this.f42920h = xe4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C2637G6 m109397e;
                Integer safePosition = C9388b.this.getSafePosition();
                if (safePosition == null || (m109397e = this.f42920h.m94545o().m109397e(safePosition.intValue())) == null) {
                    return;
                }
                Object m105816c = m109397e.m105816c();
                if (!(m105816c instanceof Pair)) {
                    m105816c = null;
                }
                Pair pair = (Pair) m105816c;
                if (pair != null) {
                    this.f42920h.f42914d.invoke(pair);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9388b(XE4 xe4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f42918c = xe4;
            C39269cf2 m61083a = C39269cf2.m61083a(view);
            Intrinsics.checkNotNullExpressionValue(m61083a, "bind(view)");
            this.f42917b = m61083a;
            ConstraintLayout root = m61083a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C9389a(xe4));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Drawable m94299e;
            int m94301c;
            int m94301c2;
            Object m105816c = this.f42918c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                NonRepair nonRepair = (NonRepair) pair.component2();
                this.f42917b.f61022d.setText(nonRepair.getDisplay());
                if (H93.m104262a(nonRepair)) {
                    m94299e = NA0.m94299e(getContext(), C48193rg4.ic_check);
                    m94301c = NA0.m94301c(getContext(), C32364Df4.birdWhite);
                    m94301c2 = NA0.m94301c(getContext(), C32364Df4.primaryText);
                } else {
                    m94299e = NA0.m94299e(getContext(), C48193rg4.ic_cancelled);
                    m94301c = NA0.m94301c(getContext(), C32364Df4.primaryText);
                    m94301c2 = NA0.m94301c(getContext(), C32364Df4.baseBG);
                }
                this.f42917b.f61022d.setTextColor(m94301c);
                this.f42917b.f61021c.setImageDrawable(m94299e);
                this.f42917b.f61021c.setImageTintList(ColorStateList.valueOf(m94301c));
                this.f42917b.f61020b.setImageTintList(ColorStateList.valueOf(m94301c));
                this.f42917b.getRoot().setBackgroundTintList(ColorStateList.valueOf(m94301c2));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LXE4$c;", "Lw1;", "", "position", "", "bind", "Lff2;", "b", "Lff2;", "binding", "Landroid/view/View;", "view", "<init>", "(LXE4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairV3OverviewIssueAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3OverviewIssueAdapter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewIssueAdapter$RepairIssueViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n18#2:162\n9#3,4:163\n288#4,2:167\n288#4,2:169\n*S KotlinDebug\n*F\n+ 1 RepairV3OverviewIssueAdapter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewIssueAdapter$RepairIssueViewHolder\n*L\n72#1:162\n72#1:163,4\n93#1:167,2\n97#1:169,2\n*E\n"})
    /* renamed from: XE4$c */
    /* loaded from: classes3.dex */
    public final class C9390c extends C29735w1 {

        /* renamed from: b */
        public final C41065ff2 f42921b;

        /* renamed from: c */
        public final /* synthetic */ XE4 f42922c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nRepairV3OverviewIssueAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3OverviewIssueAdapter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewIssueAdapter$RepairIssueViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n18#2:162\n9#3,4:163\n1#4:167\n*S KotlinDebug\n*F\n+ 1 RepairV3OverviewIssueAdapter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewIssueAdapter$RepairIssueViewHolder$1\n*L\n65#1:162\n65#1:163,4\n*E\n"})
        /* renamed from: XE4$c$a */
        /* loaded from: classes3.dex */
        public static final class C9391a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ XE4 f42924h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9391a(XE4 xe4) {
                super(1);
                this.f42924h = xe4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Function1 function1;
                int adapterPosition = C9390c.this.getAdapterPosition();
                if (adapterPosition != -1) {
                    Object m105816c = this.f42924h.m94545o().m109397e(adapterPosition).m105816c();
                    if (!(m105816c instanceof RepairIssue)) {
                        m105816c = null;
                    }
                    RepairIssue repairIssue = (RepairIssue) m105816c;
                    if (repairIssue == null || (function1 = this.f42924h.f42913c) == null) {
                        return;
                    }
                    function1.invoke(repairIssue);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9390c(XE4 xe4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f42922c = xe4;
            C41065ff2 m41064a = C41065ff2.m41064a(view);
            Intrinsics.checkNotNullExpressionValue(m41064a, "bind(view)");
            this.f42921b = m41064a;
            ConstraintLayout root = m41064a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C9391a(xe4));
        }

        @Override // p000.C29735w1
        @SuppressLint({"SetTextI18n"})
        public void bind(int i) {
            Drawable drawable;
            Object obj;
            Drawable drawable2;
            Object m105816c = this.f42922c.m94545o().m109397e(i).m105816c();
            Object obj2 = null;
            if (!(m105816c instanceof RepairIssue)) {
                m105816c = null;
            }
            RepairIssue repairIssue = (RepairIssue) m105816c;
            if (repairIssue != null) {
                this.f42921b.f80411d.setText(repairIssue.getDisplay());
                if (repairIssue.getCompleted()) {
                    Drawable m94299e = NA0.m94299e(this.f42921b.getRoot().getContext(), C48193rg4.ic_check);
                    if (m94299e != null) {
                        Context context = this.f42921b.getRoot().getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "binding.root.context");
                        drawable2 = YE4.m75392a(m94299e, context, C32364Df4.birdGreen);
                    } else {
                        drawable2 = null;
                    }
                    this.f42921b.f80410c.setImageDrawable(drawable2);
                    ImageView imageView = this.f42921b.f80409b;
                    Intrinsics.checkNotNullExpressionValue(imageView, "binding.arrow");
                    C49520tu6.m11232s(imageView, false, 4);
                    C41065ff2 c41065ff2 = this.f42921b;
                    c41065ff2.f80411d.setTextColor(NA0.m94301c(c41065ff2.getRoot().getContext(), C32364Df4.birdNewRoad));
                    this.f42921b.getRoot().setBackgroundTintList(ColorStateList.valueOf(NA0.m94301c(this.f42921b.getRoot().getContext(), C32364Df4.passedIssueGreen)));
                } else {
                    Drawable m94299e2 = NA0.m94299e(this.f42921b.getRoot().getContext(), C48193rg4.ic_issue_triangle);
                    if (m94299e2 != null) {
                        Context context2 = this.f42921b.getRoot().getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "binding.root.context");
                        drawable = YE4.m75392a(m94299e2, context2, C32364Df4.birdRed);
                    } else {
                        drawable = null;
                    }
                    this.f42921b.f80410c.setImageDrawable(drawable);
                    ImageView imageView2 = this.f42921b.f80409b;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "binding.arrow");
                    C49520tu6.m11233r(imageView2);
                    C41065ff2 c41065ff22 = this.f42921b;
                    c41065ff22.f80411d.setTextColor(NA0.m94301c(c41065ff22.getRoot().getContext(), C32364Df4.birdRed));
                    this.f42921b.getRoot().setBackgroundTintList(ColorStateList.valueOf(NA0.m94301c(this.f42921b.getRoot().getContext(), C32364Df4.failedIssueRed)));
                }
                Iterator<T> it = repairIssue.getNonRepairs().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((NonRepair) obj).getSelected()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                NonRepair nonRepair = (NonRepair) obj;
                if (nonRepair != null) {
                    TextView textView = this.f42921b.f80412e;
                    Intrinsics.checkNotNullExpressionValue(textView, "binding.nonRepair");
                    C49520tu6.m11233r(textView);
                    Iterator<T> it2 = nonRepair.getReasons().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((NonRepairReason) next).getSelected()) {
                            obj2 = next;
                            break;
                        }
                    }
                    NonRepairReason nonRepairReason = (NonRepairReason) obj2;
                    if (nonRepairReason != null) {
                        this.f42921b.f80412e.setText(nonRepair.getDisplay() + " (" + nonRepairReason.getDisplay() + ")");
                        return;
                    }
                    this.f42921b.f80412e.setText(nonRepair.getDisplay());
                    return;
                }
                TextView textView2 = this.f42921b.f80412e;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.nonRepair");
                C49520tu6.show$default(textView2, false, 0, 2, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lco/bird/android/model/RepairCategory;", "Lco/bird/android/model/NonRepair;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: XE4$d */
    /* loaded from: classes3.dex */
    public static final class C9392d extends Lambda implements Function1<Pair<? extends RepairCategory, ? extends NonRepair>, Unit> {

        /* renamed from: g */
        public static final C9392d f42925g = new C9392d();

        public C9392d() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<RepairCategory, NonRepair> it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends RepairCategory, ? extends NonRepair> pair) {
            invoke2((Pair<RepairCategory, NonRepair>) pair);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new ZE4());
        }
    }

    /* renamed from: v */
    public final void m77167v(Function1<? super RepairIssue, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f42913c = listener;
    }

    /* renamed from: w */
    public final void m77166w(Function1<? super Pair<RepairCategory, NonRepair>, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f42914d = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C32634Ej4.item_repair_issue ? new C9390c(this, m41761u) : i == C32634Ej4.item_repair_category_non_repair ? new C9388b(this, m41761u) : i == C32634Ej4.item_repair_category_divider ? new C9387a(this, m41761u) : new C29735w1(m41761u);
    }
}
