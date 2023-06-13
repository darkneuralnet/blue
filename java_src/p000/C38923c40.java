package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import co.bird.api.response.OpsBatchJobActionKind;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\t0\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m28432d2 = {"Lc40;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lio/reactivex/Observable;", "Lco/bird/api/response/OpsBatchJobActionKind;", "v", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "actionSubject", "<init>", "()V", C17296a.f69688o, "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: c40  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38923c40 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<OpsBatchJobActionKind> f60023c;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000b¨\u0006\u0011"}, m28432d2 = {"Lc40$a;", "Lw1;", "", "position", "", "bind", "Les6;", "b", "Les6;", "binding", "Ld40;", "()Ld40;", "viewModel", "Landroid/view/View;", "view", "<init>", "(Lc40;Landroid/view/View;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBulkActionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkActionAdapter.kt\nco/bird/android/feature/bulkscanner/update/BulkActionAdapter$ViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,72:1\n18#2:73\n9#3,4:74\n*S KotlinDebug\n*F\n+ 1 BulkActionAdapter.kt\nco/bird/android/feature/bulkscanner/update/BulkActionAdapter$ViewHolder\n*L\n36#1:73\n36#1:74,4\n*E\n"})
    /* renamed from: c40$a */
    /* loaded from: classes3.dex */
    public final class C13384a extends C29735w1 {

        /* renamed from: b */
        public final C40606es6 f60024b;

        /* renamed from: c */
        public final /* synthetic */ C38923c40 f60025c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nBulkActionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkActionAdapter.kt\nco/bird/android/feature/bulkscanner/update/BulkActionAdapter$ViewHolder$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1603#2,9:73\n1855#2:82\n1856#2:89\n1612#2:90\n288#2,2:91\n350#2,7:93\n18#3:83\n9#4,4:84\n1#5:88\n1#5:100\n*S KotlinDebug\n*F\n+ 1 BulkActionAdapter.kt\nco/bird/android/feature/bulkscanner/update/BulkActionAdapter$ViewHolder$1\n*L\n45#1:73,9\n45#1:82\n45#1:89\n45#1:90\n46#1:91,2\n52#1:93,7\n45#1:83\n45#1:84,4\n45#1:88\n*E\n"})
        /* renamed from: c40$a$a */
        /* loaded from: classes3.dex */
        public static final class C13385a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C38923c40 f60026g;

            /* renamed from: h */
            public final /* synthetic */ C13384a f60027h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13385a(C38923c40 c38923c40, C13384a c13384a) {
                super(1);
                this.f60026g = c38923c40;
                this.f60027h = c13384a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object obj;
                OpsBatchJobActionKind m44649b;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = this.f60026g.m94545o().m109394h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object m105816c = ((C2637G6) it.next()).m105816c();
                    C39534d40 c39534d40 = (C39534d40) (m105816c instanceof C39534d40 ? m105816c : null);
                    if (c39534d40 != null) {
                        arrayList.add(c39534d40);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((C39534d40) next).m44647d()) {
                        obj = next;
                        break;
                    }
                }
                C39534d40 c39534d402 = (C39534d40) obj;
                if (c39534d402 != null) {
                    int i = 0;
                    c39534d402.m44646e(false);
                    Iterator<C2637G6> it3 = this.f60026g.m94545o().m109394h().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            i = -1;
                            break;
                        } else if (Intrinsics.areEqual(it3.next().m105816c(), c39534d402)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i != -1) {
                        this.f60026g.notifyItemChanged(i);
                    }
                }
                C39534d40 m61981b = this.f60027h.m61981b();
                if (m61981b != null) {
                    m61981b.m44646e(true);
                }
                C39534d40 m61981b2 = this.f60027h.m61981b();
                if (m61981b2 == null || (m44649b = m61981b2.m44649b()) == null) {
                    return;
                }
                this.f60026g.f60023c.onNext(m44649b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13384a(C38923c40 c38923c40, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f60025c = c38923c40;
            C40606es6 m42471a = C40606es6.m42471a(view);
            Intrinsics.checkNotNullExpressionValue(m42471a, "bind(view)");
            this.f60024b = m42471a;
            RadioButton radioButton = m42471a.f79040b;
            Intrinsics.checkNotNullExpressionValue(radioButton, "binding.actionRadioButton");
            C34585Ms2.m94661j(radioButton, new C13385a(c38923c40, this));
        }

        /* renamed from: b */
        public final C39534d40 m61981b() {
            boolean z;
            int adapterPosition = getAdapterPosition();
            C39534d40 c39534d40 = null;
            if (adapterPosition == -1) {
                return null;
            }
            Object m105816c = this.f60025c.m94545o().m109394h().get(adapterPosition).m105816c();
            if (m105816c != null) {
                z = m105816c instanceof C39534d40;
            } else {
                z = true;
            }
            if (z) {
                c39534d40 = m105816c;
            }
            return c39534d40;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            C39534d40 m61981b = m61981b();
            if (m61981b != null) {
                this.f60024b.f79040b.setChecked(m61981b.m44647d());
                this.f60024b.f79040b.setText(this.itemView.getContext().getString(m61981b.m44648c()));
            }
        }
    }

    public C38923c40() {
        C24558d<OpsBatchJobActionKind> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<OpsBatchJobActionKind>()");
        this.f60023c = m31902e;
    }

    /* renamed from: v */
    public final Observable<OpsBatchJobActionKind> m61983v() {
        Observable<OpsBatchJobActionKind> hide = this.f60023c.startWith((C24558d<OpsBatchJobActionKind>) OpsBatchJobActionKind.UNKNOWN).hide();
        Intrinsics.checkNotNullExpressionValue(hide, "actionSubject.startWith(…ctionKind.UNKNOWN).hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        return new C13384a(this, C40788fB0.m41761u(context, i, parent, false));
    }
}
