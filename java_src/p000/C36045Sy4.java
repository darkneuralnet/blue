package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.RepairType;
import co.bird.android.model.constant.IssueStatusReason;
import co.bird.android.widget.standardcomponents.CheckableItemView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0003\u001e\u001f\u0017B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000eJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eR:\u0010\u0019\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011 \u0016*\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f0\u000f0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00130\u00130\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006 "}, m28432d2 = {"LSy4;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "LF6;", "r", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/RepairType;", "", "w", "Lco/bird/android/model/Issue;", "v", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "repairCheckSubject", DateTokenConverter.CONVERTER_KEY, "issueSubject", "<init>", "()V", C17296a.f69688o, "b", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Sy4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36045Sy4 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<Pair<RepairType, Boolean>> f34569c;

    /* renamed from: d */
    public final C24558d<Issue> f34570d;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LSy4$a;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "b", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "checkableItem", "", "c", "Z", "binding", "Landroid/view/View;", "view", "<init>", "(LSy4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairIssueSubtypesAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesAdapter.kt\nco/bird/android/feature/repair/v2/subtypes/adapters/RepairIssueSubtypesAdapter$RepairTypeViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n18#2:115\n9#3,4:116\n1#4:120\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesAdapter.kt\nco/bird/android/feature/repair/v2/subtypes/adapters/RepairIssueSubtypesAdapter$RepairTypeViewHolder\n*L\n83#1:115\n83#1:116,4\n*E\n"})
    /* renamed from: Sy4$a */
    /* loaded from: classes3.dex */
    public final class C7619a extends C29735w1 {

        /* renamed from: b */
        public final CheckableItemView f34571b;

        /* renamed from: c */
        public boolean f34572c;

        /* renamed from: d */
        public final /* synthetic */ C36045Sy4 f34573d;

        @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"Sy4$a$a", "Lco/bird/android/widget/standardcomponents/CheckableItemView$b;", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "view", "", "isChecked", "", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRepairIssueSubtypesAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesAdapter.kt\nco/bird/android/feature/repair/v2/subtypes/adapters/RepairIssueSubtypesAdapter$RepairTypeViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n18#2:115\n9#3,4:116\n1#4:120\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesAdapter.kt\nco/bird/android/feature/repair/v2/subtypes/adapters/RepairIssueSubtypesAdapter$RepairTypeViewHolder$1\n*L\n74#1:115\n74#1:116,4\n*E\n"})
        /* renamed from: Sy4$a$a */
        /* loaded from: classes3.dex */
        public static final class C7620a implements CheckableItemView.InterfaceC16699b {

            /* renamed from: b */
            public final /* synthetic */ C36045Sy4 f34575b;

            public C7620a(C36045Sy4 c36045Sy4) {
                this.f34575b = c36045Sy4;
            }

            @Override // co.bird.android.widget.standardcomponents.CheckableItemView.InterfaceC16699b
            /* renamed from: a */
            public void mo3842a(CheckableItemView view, boolean z) {
                Intrinsics.checkNotNullParameter(view, "view");
                if (!C7619a.this.f34572c && C7619a.this.getAdapterPosition() != -1) {
                    Object m105816c = this.f34575b.m94545o().m109397e(C7619a.this.getAdapterPosition()).m105816c();
                    if (!(m105816c instanceof TD4)) {
                        m105816c = null;
                    }
                    TD4 td4 = (TD4) m105816c;
                    if (td4 != null) {
                        this.f34575b.f34569c.onNext(TuplesKt.m28425to(td4.m84185e(), Boolean.valueOf(z)));
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7619a(C36045Sy4 c36045Sy4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f34573d = c36045Sy4;
            CheckableItemView checkableItemView = (CheckableItemView) view;
            this.f34571b = checkableItemView;
            checkableItemView.setOnCheckChangedListener(new C7620a(c36045Sy4));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f34572c = true;
            Object m105816c = this.f34573d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof TD4)) {
                m105816c = null;
            }
            TD4 td4 = (TD4) m105816c;
            if (td4 != null) {
                this.f34571b.m53967e(td4);
            }
            this.f34572c = false;
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LSy4$b;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "b", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "checkableItem", "", "c", "Z", "binding", "Landroid/view/View;", "view", "<init>", "(LSy4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairIssueSubtypesAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesAdapter.kt\nco/bird/android/feature/repair/v2/subtypes/adapters/RepairIssueSubtypesAdapter$StatusViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n18#2:115\n9#3,4:116\n1#4:120\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesAdapter.kt\nco/bird/android/feature/repair/v2/subtypes/adapters/RepairIssueSubtypesAdapter$StatusViewHolder\n*L\n109#1:115\n109#1:116,4\n*E\n"})
    /* renamed from: Sy4$b */
    /* loaded from: classes3.dex */
    public final class C7621b extends C29735w1 {

        /* renamed from: b */
        public final CheckableItemView f34576b;

        /* renamed from: c */
        public boolean f34577c;

        /* renamed from: d */
        public final /* synthetic */ C36045Sy4 f34578d;

        @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"Sy4$b$a", "Lco/bird/android/widget/standardcomponents/CheckableItemView$b;", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "view", "", "isChecked", "", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRepairIssueSubtypesAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesAdapter.kt\nco/bird/android/feature/repair/v2/subtypes/adapters/RepairIssueSubtypesAdapter$StatusViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n18#2:115\n9#3,4:116\n1#4:120\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesAdapter.kt\nco/bird/android/feature/repair/v2/subtypes/adapters/RepairIssueSubtypesAdapter$StatusViewHolder$1\n*L\n96#1:115\n96#1:116,4\n*E\n"})
        /* renamed from: Sy4$b$a */
        /* loaded from: classes3.dex */
        public static final class C7622a implements CheckableItemView.InterfaceC16699b {

            /* renamed from: b */
            public final /* synthetic */ C36045Sy4 f34580b;

            public C7622a(C36045Sy4 c36045Sy4) {
                this.f34580b = c36045Sy4;
            }

            @Override // co.bird.android.widget.standardcomponents.CheckableItemView.InterfaceC16699b
            /* renamed from: a */
            public void mo3842a(CheckableItemView view, boolean z) {
                Issue copy;
                Issue copy2;
                Intrinsics.checkNotNullParameter(view, "view");
                if (!C7621b.this.f34577c && C7621b.this.getAdapterPosition() != -1) {
                    Object m105816c = this.f34580b.m94545o().m109397e(C7621b.this.getAdapterPosition()).m105816c();
                    if (!(m105816c instanceof C52280ya2)) {
                        m105816c = null;
                    }
                    C52280ya2 c52280ya2 = (C52280ya2) m105816c;
                    if (c52280ya2 != null) {
                        C36045Sy4 c36045Sy4 = this.f34580b;
                        Issue m3246e = c52280ya2.m3246e();
                        IssueStatus m3245f = c52280ya2.m3245f();
                        IssueStatus m3244g = c52280ya2.m3244g();
                        IssueStatusReason m3243h = c52280ya2.m3243h();
                        if (z) {
                            C24558d c24558d = c36045Sy4.f34570d;
                            copy2 = m3246e.copy((r37 & 1) != 0 ? m3246e.f66598id : null, (r37 & 2) != 0 ? m3246e.workOrderId : null, (r37 & 4) != 0 ? m3246e.issueTypeId : null, (r37 & 8) != 0 ? m3246e.display : null, (r37 & 16) != 0 ? m3246e.description : null, (r37 & 32) != 0 ? m3246e.status : m3245f, (r37 & 64) != 0 ? m3246e.statusDisplay : null, (r37 & 128) != 0 ? m3246e.statusColor : null, (r37 & 256) != 0 ? m3246e.statusReasonDisplay : null, (r37 & 512) != 0 ? m3246e.source : null, (r37 & 1024) != 0 ? m3246e.sourceDisplay : null, (r37 & 2048) != 0 ? m3246e.createdBy : null, (r37 & 4096) != 0 ? m3246e.createdAt : null, (r37 & 8192) != 0 ? m3246e.updatedAt : null, (r37 & 16384) != 0 ? m3246e.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? m3246e.assetId : null, (r37 & 65536) != 0 ? m3246e.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? m3246e.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? m3246e.statusReason : null);
                            c24558d.onNext(copy2);
                            return;
                        }
                        C24558d c24558d2 = c36045Sy4.f34570d;
                        copy = m3246e.copy((r37 & 1) != 0 ? m3246e.f66598id : null, (r37 & 2) != 0 ? m3246e.workOrderId : null, (r37 & 4) != 0 ? m3246e.issueTypeId : null, (r37 & 8) != 0 ? m3246e.display : null, (r37 & 16) != 0 ? m3246e.description : null, (r37 & 32) != 0 ? m3246e.status : m3244g, (r37 & 64) != 0 ? m3246e.statusDisplay : null, (r37 & 128) != 0 ? m3246e.statusColor : null, (r37 & 256) != 0 ? m3246e.statusReasonDisplay : null, (r37 & 512) != 0 ? m3246e.source : null, (r37 & 1024) != 0 ? m3246e.sourceDisplay : null, (r37 & 2048) != 0 ? m3246e.createdBy : null, (r37 & 4096) != 0 ? m3246e.createdAt : null, (r37 & 8192) != 0 ? m3246e.updatedAt : null, (r37 & 16384) != 0 ? m3246e.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? m3246e.assetId : null, (r37 & 65536) != 0 ? m3246e.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? m3246e.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? m3246e.statusReason : m3243h);
                        c24558d2.onNext(copy);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7621b(C36045Sy4 c36045Sy4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f34578d = c36045Sy4;
            CheckableItemView checkableItemView = (CheckableItemView) view;
            this.f34576b = checkableItemView;
            checkableItemView.setOnCheckChangedListener(new C7622a(c36045Sy4));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f34577c = true;
            Object m105816c = this.f34578d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C52280ya2)) {
                m105816c = null;
            }
            C52280ya2 c52280ya2 = (C52280ya2) m105816c;
            if (c52280ya2 != null) {
                this.f34576b.m53967e(c52280ya2);
            }
            this.f34577c = false;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LSy4$c;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "subtype", "Landroid/view/View;", "view", "<init>", "(LSy4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairIssueSubtypesAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesAdapter.kt\nco/bird/android/feature/repair/v2/subtypes/adapters/RepairIssueSubtypesAdapter$SubtypeViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n18#2:115\n9#3,4:116\n1#4:120\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesAdapter.kt\nco/bird/android/feature/repair/v2/subtypes/adapters/RepairIssueSubtypesAdapter$SubtypeViewHolder\n*L\n53#1:115\n53#1:116,4\n*E\n"})
    /* renamed from: Sy4$c */
    /* loaded from: classes3.dex */
    public final class C7623c extends C29735w1 {

        /* renamed from: b */
        public final TextView f34581b;

        /* renamed from: c */
        public final /* synthetic */ C36045Sy4 f34582c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7623c(C36045Sy4 c36045Sy4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f34582c = c36045Sy4;
            this.f34581b = (TextView) view;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            int m94301c;
            Object m105816c = this.f34582c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                Issue issue = (Issue) pair.component1();
                if (((Boolean) pair.component2()).booleanValue()) {
                    m94301c = NA0.m94301c(this.f34581b.getContext(), C32364Df4.birdGreen);
                } else {
                    m94301c = NA0.m94301c(this.f34581b.getContext(), C32364Df4.birdRed);
                }
                this.f34581b.setText(issue.getDisplay());
                this.f34581b.setTextColor(m94301c);
            }
        }
    }

    public C36045Sy4() {
        C24558d<Pair<RepairType, Boolean>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<RepairType, Boolean>>()");
        this.f34569c = m31902e;
        C24558d<Issue> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Issue>()");
        this.f34570d = m31902e2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C37215Xy4());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C36279Ty4();
    }

    /* renamed from: v */
    public final Observable<Issue> m84524v() {
        Observable<Issue> hide = this.f34570d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "issueSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<Pair<RepairType, Boolean>> m84523w() {
        Observable<Pair<RepairType, Boolean>> hide = this.f34569c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "repairCheckSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C32634Ej4.item_repair_v2_subtype ? new C7623c(this, m41761u) : i == C32634Ej4.item_repair_v2_subtype_repair_type ? new C7619a(this, m41761u) : i == C32634Ej4.item_repair_v2_subtype_status ? new C7621b(this, m41761u) : new C29735w1(m41761u);
    }
}
