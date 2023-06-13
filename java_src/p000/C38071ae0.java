package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.constant.IssueStatusReason;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t0\bR>\u0010\u0011\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b \u000e*\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\t0\t0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, m28432d2 = {"Lae0;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/IssueStatus;", "Lco/bird/android/model/constant/IssueStatusReason;", "v", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "statusSubject", "<init>", "()V", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ae0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38071ae0 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<Pair<IssueStatus, IssueStatusReason>> f50849c;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"Lae0$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/ImageView;", "icon", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "description", "Landroid/view/View;", "view", "<init>", "(Lae0;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCantRepairAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CantRepairAdapter.kt\nco/bird/android/feature/repair/v2/subtypes/dialogs/cantrepair/adapters/CantRepairAdapter$StatusViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n18#2:50\n9#3,4:51\n1#4:55\n*S KotlinDebug\n*F\n+ 1 CantRepairAdapter.kt\nco/bird/android/feature/repair/v2/subtypes/dialogs/cantrepair/adapters/CantRepairAdapter$StatusViewHolder\n*L\n42#1:50\n42#1:51,4\n*E\n"})
    /* renamed from: ae0$a */
    /* loaded from: classes3.dex */
    public final class C10781a extends C29735w1 {

        /* renamed from: b */
        public final ImageView f50850b;

        /* renamed from: c */
        public final TextView f50851c;

        /* renamed from: d */
        public final /* synthetic */ C38071ae0 f50852d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nCantRepairAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CantRepairAdapter.kt\nco/bird/android/feature/repair/v2/subtypes/dialogs/cantrepair/adapters/CantRepairAdapter$StatusViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n18#2:50\n9#3,4:51\n1#4:55\n*S KotlinDebug\n*F\n+ 1 CantRepairAdapter.kt\nco/bird/android/feature/repair/v2/subtypes/dialogs/cantrepair/adapters/CantRepairAdapter$StatusViewHolder$1\n*L\n35#1:50\n35#1:51,4\n*E\n"})
        /* renamed from: ae0$a$a */
        /* loaded from: classes3.dex */
        public static final class C10782a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C38071ae0 f50853g;

            /* renamed from: h */
            public final /* synthetic */ C10781a f50854h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10782a(C38071ae0 c38071ae0, C10781a c10781a) {
                super(1);
                this.f50853g = c38071ae0;
                this.f50854h = c10781a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f50853g.m94545o().m109397e(this.f50854h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof C49909ua2)) {
                    m105816c = null;
                }
                C49909ua2 c49909ua2 = (C49909ua2) m105816c;
                if (c49909ua2 != null) {
                    this.f50853g.f50849c.onNext(TuplesKt.m28425to(c49909ua2.m10051a(), c49909ua2.m10050b()));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10781a(C38071ae0 c38071ae0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f50852d = c38071ae0;
            this.f50850b = (ImageView) view.findViewById(C35658Rh4.icon);
            this.f50851c = (TextView) view.findViewById(C35658Rh4.description);
            C34585Ms2.m94661j(view, new C10782a(c38071ae0, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f50852d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C49909ua2)) {
                m105816c = null;
            }
            C49909ua2 c49909ua2 = (C49909ua2) m105816c;
            if (c49909ua2 != null) {
                String m10049c = c49909ua2.m10049c();
                this.f50850b.setImageDrawable(c49909ua2.m10048d());
                this.f50851c.setText(m10049c);
            }
        }
    }

    public C38071ae0() {
        C24558d<Pair<IssueStatus, IssueStatusReason>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<IssueStatus, IssueStatusReason?>>()");
        this.f50849c = m31902e;
    }

    /* renamed from: v */
    public final Observable<Pair<IssueStatus, IssueStatusReason>> m70985v() {
        Observable<Pair<IssueStatus, IssueStatusReason>> hide = this.f50849c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "statusSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        return new C10781a(this, C40788fB0.m41761u(context, i, parent, false));
    }
}
