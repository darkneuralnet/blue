package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.NonRepair;
import co.bird.android.model.Repair;
import co.bird.android.model.RepairCategory;
import co.bird.android.model.wire.WireQuickLink;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\u000eJ\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00110\u000eR\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u000f0\u000f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR:\u0010\u001e\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013 \u0019*\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00110\u00110\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR:\u0010 \u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016 \u0019*\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00110\u00110\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b¨\u0006%"}, m28432d2 = {"LjE4;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireQuickLink;", "x", "Lkotlin/Pair;", "Lco/bird/android/model/Repair;", "", "w", "", "Lco/bird/android/model/NonRepair;", "v", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "trainingGuideClicksSubject", DateTokenConverter.CONVERTER_KEY, "repairSelectsSubject", "e", "nonRepairSelectsSubject", "<init>", "()V", C17296a.f69688o, "b", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jE4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43191jE4 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<WireQuickLink> f92306c;

    /* renamed from: d */
    public final C24558d<Pair<Repair, Boolean>> f92307d;

    /* renamed from: e */
    public final C24558d<Pair<String, NonRepair>> f92308e;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LjE4$a;", "Lw1;", "", "position", "", "bind", "Lhf2;", "b", "Lhf2;", "binding", "LQE4;", "c", "LQE4;", "adapter", "Landroid/view/View;", "view", "<init>", "(LjE4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairV3IssueAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssueAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueAdapter$IssueViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,128:1\n18#2:129\n9#3,4:130\n*S KotlinDebug\n*F\n+ 1 RepairV3IssueAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueAdapter$IssueViewHolder\n*L\n77#1:129\n77#1:130,4\n*E\n"})
    /* renamed from: jE4$a */
    /* loaded from: classes3.dex */
    public final class C24741a extends C29735w1 {

        /* renamed from: b */
        public final C42251hf2 f92309b;

        /* renamed from: c */
        public final QE4 f92310c;

        /* renamed from: d */
        public final /* synthetic */ C43191jE4 f92311d;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: jE4$a$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C24742a extends FunctionReferenceImpl implements Function1<Pair<? extends Repair, ? extends Boolean>, Unit> {
            public C24742a(Object obj) {
                super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Repair, ? extends Boolean> pair) {
                invoke2((Pair<Repair, Boolean>) pair);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Pair<Repair, Boolean> p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C24558d) this.receiver).onNext(p0);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/NonRepair;", "nonRepair", "", C17296a.f69688o, "(Lco/bird/android/model/NonRepair;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRepairV3IssueAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssueAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueAdapter$IssueViewHolder$3\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n18#2:129\n9#3,4:130\n1#4:134\n*S KotlinDebug\n*F\n+ 1 RepairV3IssueAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueAdapter$IssueViewHolder$3\n*L\n69#1:129\n69#1:130,4\n*E\n"})
        /* renamed from: jE4$a$b */
        /* loaded from: classes3.dex */
        public static final class C24743b extends Lambda implements Function1<NonRepair, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C43191jE4 f92313h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24743b(C43191jE4 c43191jE4) {
                super(1);
                this.f92313h = c43191jE4;
            }

            /* renamed from: a */
            public final void m30964a(NonRepair nonRepair) {
                Intrinsics.checkNotNullParameter(nonRepair, "nonRepair");
                int adapterPosition = C24741a.this.getAdapterPosition();
                if (adapterPosition != -1) {
                    Object m105816c = this.f92313h.m94545o().m109397e(adapterPosition).m105816c();
                    if (!(m105816c instanceof DA4)) {
                        m105816c = null;
                    }
                    DA4 da4 = (DA4) m105816c;
                    if (da4 != null) {
                        this.f92313h.f92308e.onNext(TuplesKt.m28425to(da4.m110815a().getId(), nonRepair));
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(NonRepair nonRepair) {
                m30964a(nonRepair);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24741a(C43191jE4 c43191jE4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f92311d = c43191jE4;
            C42251hf2 m36108a = C42251hf2.m36108a(view);
            Intrinsics.checkNotNullExpressionValue(m36108a, "bind(view)");
            this.f92309b = m36108a;
            QE4 qe4 = new QE4();
            this.f92310c = qe4;
            RecyclerView recyclerView = m36108a.f85639c;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.itemView.getContext()));
            recyclerView.setItemAnimator(new C11894g());
            recyclerView.setAdapter(qe4);
            qe4.m88706w(new C24742a(c43191jE4.f92307d));
            qe4.m88707v(new C24743b(c43191jE4));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f92311d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof DA4)) {
                m105816c = null;
            }
            DA4 da4 = (DA4) m105816c;
            if (da4 != null) {
                this.f92309b.f85638b.setText(da4.m110811e().getDisplay());
                this.f92309b.f85638b.setTextColor(da4.m110809g());
                this.f92309b.f85638b.setCompoundDrawablesRelativeWithIntrinsicBounds(da4.m110812d(), (Drawable) null, (Drawable) null, (Drawable) null);
                this.f92309b.f85638b.setBackgroundTintList(da4.m110813c());
                this.f92310c.mo24871u(da4.m110810f());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LjE4$b;", "Lw1;", "", "position", "", "bind", "Lgf2;", "b", "Lgf2;", "binding", "LQE4;", "c", "LQE4;", "adapter", "Landroid/view/View;", "view", "<init>", "(LjE4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairV3IssueAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssueAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueAdapter$TrainingGuideViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n18#2:129\n9#3,4:130\n1#4:134\n*S KotlinDebug\n*F\n+ 1 RepairV3IssueAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueAdapter$TrainingGuideViewHolder\n*L\n121#1:129\n121#1:130,4\n*E\n"})
    /* renamed from: jE4$b */
    /* loaded from: classes3.dex */
    public final class C24744b extends C29735w1 {

        /* renamed from: b */
        public final C41658gf2 f92314b;

        /* renamed from: c */
        public final QE4 f92315c;

        /* renamed from: d */
        public final /* synthetic */ C43191jE4 f92316d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nRepairV3IssueAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssueAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueAdapter$TrainingGuideViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n18#2:129\n9#3,4:130\n1#4:134\n*S KotlinDebug\n*F\n+ 1 RepairV3IssueAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueAdapter$TrainingGuideViewHolder$1\n*L\n98#1:129\n98#1:130,4\n*E\n"})
        /* renamed from: jE4$b$a */
        /* loaded from: classes3.dex */
        public static final class C24745a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C43191jE4 f92318h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24745a(C43191jE4 c43191jE4) {
                super(1);
                this.f92318h = c43191jE4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                int adapterPosition = C24744b.this.getAdapterPosition();
                if (adapterPosition != -1) {
                    Object m105816c = this.f92318h.m94545o().m109397e(adapterPosition).m105816c();
                    if (!(m105816c instanceof C46082o66)) {
                        m105816c = null;
                    }
                    C46082o66 c46082o66 = (C46082o66) m105816c;
                    if (c46082o66 != null) {
                        C43191jE4 c43191jE4 = this.f92318h;
                        c43191jE4.f92306c.onNext(c46082o66.m21771a());
                    }
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/NonRepair;", "nonRepair", "", C17296a.f69688o, "(Lco/bird/android/model/NonRepair;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRepairV3IssueAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssueAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueAdapter$TrainingGuideViewHolder$3\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n18#2:129\n9#3,4:130\n1#4:134\n*S KotlinDebug\n*F\n+ 1 RepairV3IssueAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueAdapter$TrainingGuideViewHolder$3\n*L\n113#1:129\n113#1:130,4\n*E\n"})
        /* renamed from: jE4$b$b */
        /* loaded from: classes3.dex */
        public static final class C24746b extends Lambda implements Function1<NonRepair, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C43191jE4 f92320h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24746b(C43191jE4 c43191jE4) {
                super(1);
                this.f92320h = c43191jE4;
            }

            /* renamed from: a */
            public final void m30963a(NonRepair nonRepair) {
                Intrinsics.checkNotNullParameter(nonRepair, "nonRepair");
                int adapterPosition = C24744b.this.getAdapterPosition();
                if (adapterPosition != -1) {
                    Object m105816c = this.f92320h.m94545o().m109397e(adapterPosition).m105816c();
                    if (!(m105816c instanceof C46082o66)) {
                        m105816c = null;
                    }
                    C46082o66 c46082o66 = (C46082o66) m105816c;
                    if (c46082o66 != null) {
                        C43191jE4 c43191jE4 = this.f92320h;
                        RepairCategory m21770b = c46082o66.m21770b();
                        if (m21770b != null && m21770b.getId() != null) {
                            c43191jE4.f92308e.onNext(TuplesKt.m28425to(m21770b.getId(), nonRepair));
                        }
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(NonRepair nonRepair) {
                m30963a(nonRepair);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24744b(C43191jE4 c43191jE4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f92316d = c43191jE4;
            C41658gf2 m37923a = C41658gf2.m37923a(view);
            Intrinsics.checkNotNullExpressionValue(m37923a, "bind(view)");
            this.f92314b = m37923a;
            QE4 qe4 = new QE4();
            this.f92315c = qe4;
            C34585Ms2.m94661j(view, new C24745a(c43191jE4));
            RecyclerView recyclerView = m37923a.f83998e;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.itemView.getContext()));
            recyclerView.setItemAnimator(new C11894g());
            recyclerView.setAdapter(qe4);
            qe4.m88707v(new C24746b(c43191jE4));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            List listOf;
            Object m105816c = this.f92316d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C46082o66)) {
                m105816c = null;
            }
            C46082o66 c46082o66 = (C46082o66) m105816c;
            if (c46082o66 != null) {
                WireQuickLink m21771a = c46082o66.m21771a();
                C3023H6 m21769c = c46082o66.m21769c();
                this.f92314b.f83996c.setText(m21771a.getDisplay());
                if (m21769c != null) {
                    QE4 qe4 = this.f92315c;
                    listOf = CollectionsKt__CollectionsJVMKt.listOf(m21769c);
                    qe4.mo24871u(listOf);
                }
            }
        }
    }

    public C43191jE4() {
        C24558d<WireQuickLink> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<WireQuickLink>()");
        this.f92306c = m31902e;
        C24558d<Pair<Repair, Boolean>> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Pair<Repair, Boolean>>()");
        this.f92307d = m31902e2;
        C24558d<Pair<String, NonRepair>> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<Pair<String, NonRepair>>()");
        this.f92308e = m31902e3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C44970mE4());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C43784kE4();
    }

    /* renamed from: v */
    public final Observable<Pair<String, NonRepair>> m30967v() {
        Observable<Pair<String, NonRepair>> hide = this.f92308e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "nonRepairSelectsSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<Pair<Repair, Boolean>> m30966w() {
        Observable<Pair<Repair, Boolean>> hide = this.f92307d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "repairSelectsSubject.hide()");
        return hide;
    }

    /* renamed from: x */
    public final Observable<WireQuickLink> m30965x() {
        Observable<WireQuickLink> hide = this.f92306c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "trainingGuideClicksSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C32634Ej4.item_repair_v3_issue ? new C24741a(this, m41761u) : i == C32634Ej4.item_repair_training_guide ? new C24744b(this, m41761u) : new C29735w1(m41761u);
    }
}
