package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.persistence.RidePassView;
import com.facebook.share.internal.C17296a;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016R\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m28432d2 = {"LEF5;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Lma4;", "Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", "c", "Lma4;", "ridePassClicksRelay", "<init>", "()V", C17296a.f69688o, "b", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: EF5 */
/* loaded from: classes2.dex */
public final class EF5 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C45168ma4<RidePassView> f7151c;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m28432d2 = {"LEF5$a;", "Lw1;", "Lce2;", "b", "Lce2;", "binding", "Landroid/view/View;", "view", "<init>", "(LEF5;Landroid/view/View;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: EF5$a */
    /* loaded from: classes2.dex */
    public final class C1766a extends C29735w1 {

        /* renamed from: b */
        public final C39259ce2 f7152b;

        /* renamed from: c */
        public final /* synthetic */ EF5 f7153c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1766a(EF5 ef5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f7153c = ef5;
            C39259ce2 m61103a = C39259ce2.m61103a(view);
            Intrinsics.checkNotNullExpressionValue(m61103a, "bind(view)");
            this.f7152b = m61103a;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LEF5$b;", "Lw1;", "", "position", "", "bind", "Lbe2;", "b", "Lbe2;", "binding", "Landroid/view/View;", "view", "<init>", "(LEF5;Landroid/view/View;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSmartlockAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockAdapter.kt\nco/bird/android/app/feature/physicallock/smartlock/adapter/SmartlockAdapter$ItemViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n18#2:64\n9#3,4:65\n1#4:69\n*S KotlinDebug\n*F\n+ 1 SmartlockAdapter.kt\nco/bird/android/app/feature/physicallock/smartlock/adapter/SmartlockAdapter$ItemViewHolder\n*L\n51#1:64\n51#1:65,4\n*E\n"})
    /* renamed from: EF5$b */
    /* loaded from: classes2.dex */
    public final class C1767b extends C29735w1 {

        /* renamed from: b */
        public final C38666be2 f7154b;

        /* renamed from: c */
        public final /* synthetic */ EF5 f7155c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1767b(EF5 ef5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f7155c = ef5;
            C38666be2 m64227a = C38666be2.m64227a(view);
            Intrinsics.checkNotNullExpressionValue(m64227a, "bind(view)");
            this.f7154b = m64227a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            boolean z2;
            Object m105816c = this.f7155c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof YL5)) {
                m105816c = null;
            }
            YL5 yl5 = (YL5) m105816c;
            if (yl5 != null) {
                this.f7154b.f57805g.setText(yl5.m75147e());
                this.f7154b.f57800b.setText(yl5.m75150b());
                Integer m75149c = yl5.m75149c();
                if (m75149c != null) {
                    ImageView imageView = this.f7154b.f57802d;
                    Intrinsics.checkNotNullExpressionValue(imageView, "binding.image");
                    imageView.setImageResource(m75149c.intValue());
                }
                CircularProgressIndicator circularProgressIndicator = this.f7154b.f57804f;
                Intrinsics.checkNotNullExpressionValue(circularProgressIndicator, "binding.progressCircle");
                boolean z3 = true;
                if (yl5.m75149c() == null) {
                    z = true;
                } else {
                    z = false;
                }
                C49520tu6.show$default(circularProgressIndicator, z, 0, 2, null);
                ImageView imageView2 = this.f7154b.f57802d;
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.image");
                if (yl5.m75149c() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C49520tu6.show$default(imageView2, z2, 0, 2, null);
                this.f7154b.f57803e.setText(yl5.m75148d());
                TextView textView = this.f7154b.f57803e;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.metadata");
                if (yl5.m75148d() == null) {
                    z3 = false;
                }
                C49520tu6.show$default(textView, z3, 0, 2, null);
            }
        }
    }

    public EF5() {
        C45168ma4<RidePassView> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<RidePassView>()");
        this.f7151c = m25409g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() != 0) {
            recyclerView.removeItemDecorationAt(0);
        }
        recyclerView.addItemDecoration(new C45007mI5());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C39311cj4.item_operator_smartlock_unlock_header ? new C1766a(this, m41761u) : i == C39311cj4.item_operator_smartlock_unlock ? new C1767b(this, m41761u) : new C29735w1(m41761u);
    }
}
