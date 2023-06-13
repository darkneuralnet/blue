package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C11905h;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u0013B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR%\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u000e0\u000e0\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, m28432d2 = {"LXC3;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lw1;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "", "Lco/bird/android/model/wire/WireBird;", "birds", "p", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "b", "Lio/reactivex/subjects/d;", "o", "()Lio/reactivex/subjects/d;", "clicks", "", "c", "Ljava/util/List;", "adapterData", "<init>", "()V", C17296a.f69688o, "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: XC3 */
/* loaded from: classes3.dex */
public final class XC3 extends RecyclerView.AbstractC11843h<C29735w1> {

    /* renamed from: b */
    public final C24558d<WireBird> f42874b;

    /* renamed from: c */
    public final List<WireBird> f42875c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0013"}, m28432d2 = {"LXC3$a;", "Landroidx/recyclerview/widget/h$b;", "", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "getOldListSize", "getNewListSize", "areContentsTheSame", "", "Lco/bird/android/model/wire/WireBird;", C17296a.f69688o, "Ljava/util/List;", "oldBirds", "b", "newBirds", "<init>", "(LXC3;Ljava/util/List;Ljava/util/List;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: XC3$a */
    /* loaded from: classes3.dex */
    public final class C9381a extends C11905h.AbstractC11907b {

        /* renamed from: a */
        public final List<WireBird> f42876a;

        /* renamed from: b */
        public final List<WireBird> f42877b;

        /* renamed from: c */
        public final /* synthetic */ XC3 f42878c;

        public C9381a(XC3 xc3, List<WireBird> oldBirds, List<WireBird> newBirds) {
            Intrinsics.checkNotNullParameter(oldBirds, "oldBirds");
            Intrinsics.checkNotNullParameter(newBirds, "newBirds");
            this.f42878c = xc3;
            this.f42876a = oldBirds;
            this.f42877b = newBirds;
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public boolean areContentsTheSame(int i, int i2) {
            WireBird wireBird = this.f42876a.get(i);
            WireBird wireBird2 = this.f42877b.get(i2);
            if (Intrinsics.areEqual(wireBird.getCode(), wireBird2.getCode()) && wireBird.getBatteryLevel() == wireBird2.getBatteryLevel() && Intrinsics.areEqual(wireBird.getLastRideEndedAt(), wireBird2.getLastRideEndedAt())) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public boolean areItemsTheSame(int i, int i2) {
            return this.f42876a.get(i).isSame(this.f42877b.get(i2));
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public int getNewListSize() {
            return this.f42877b.size();
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public int getOldListSize() {
            return this.f42876a.size();
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LXC3$b;", "Lw1;", "", "position", "", "bind", "Loe2;", "b", "Loe2;", "binding", "Landroid/view/View;", "view", "<init>", "(LXC3;Landroid/view/View;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOwnedBirdsListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnedBirdsListAdapter.kt\nco/bird/android/feature/ownedbirds/OwnedBirdsListAdapter$OwnedBirdsListViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
    /* renamed from: XC3$b */
    /* loaded from: classes3.dex */
    public final class C9382b extends C29735w1 {

        /* renamed from: b */
        public final C46392oe2 f42879b;

        /* renamed from: c */
        public final /* synthetic */ XC3 f42880c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: XC3$b$a */
        /* loaded from: classes3.dex */
        public static final class C9383a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ XC3 f42882h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9383a(XC3 xc3) {
                super(1);
                this.f42882h = xc3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                if (C9382b.this.getAdapterPosition() != -1) {
                    this.f42882h.m77187o().onNext(this.f42882h.f42875c.get(C9382b.this.getAdapterPosition()));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9382b(XC3 xc3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f42880c = xc3;
            C46392oe2 m20717a = C46392oe2.m20717a(view);
            Intrinsics.checkNotNullExpressionValue(m20717a, "bind(view)");
            this.f42879b = m20717a;
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            C34585Ms2.m94661j(itemView, new C9383a(xc3));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            String string;
            super.bind(i);
            WireBird wireBird = (WireBird) this.f42880c.f42875c.get(i);
            View view = this.itemView;
            TextView textView = this.f42879b.f102258d;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            textView.setText(C7150RL.m86842a(context, C45871nl4.owned_bird_details_label_bird_code, wireBird.getCode()));
            TextView textView2 = this.f42879b.f102257c;
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            int i2 = C45871nl4.owned_bird_details_label_last_ridden;
            C51916xx1 c51916xx1 = C51916xx1.f118396a;
            textView2.setText(C7150RL.m86842a(context2, i2, C51916xx1.percentage$default(c51916xx1, Float.valueOf(wireBird.getBatteryLevel() / 100.0f), 0, 2, null)));
            DateTime lastRideEndedAt = wireBird.getLastRideEndedAt();
            if (lastRideEndedAt == null || (string = c51916xx1.m4390v(lastRideEndedAt)) == null) {
                string = view.getContext().getString(C45871nl4.owned_bird_details_last_ridden_never);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…etails_last_ridden_never)");
            }
            TextView textView3 = this.f42879b.f102259e;
            Context context3 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            textView3.setText(C7150RL.m86842a(context3, i2, string));
        }
    }

    public XC3() {
        C24558d<WireBird> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<WireBird>()");
        this.f42874b = m31902e;
        this.f42875c = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f42875c.size();
    }

    /* renamed from: o */
    public final C24558d<WireBird> m77187o() {
        return this.f42874b;
    }

    /* renamed from: p */
    public final void m77186p(List<WireBird> birds) {
        Intrinsics.checkNotNullParameter(birds, "birds");
        C11905h.C11910e m66274b = C11905h.m66274b(new C9381a(this, this.f42875c, birds));
        Intrinsics.checkNotNullExpressionValue(m66274b, "calculateDiff(DiffCallba…rData, newBirds = birds))");
        this.f42875c.clear();
        this.f42875c.addAll(birds);
        m66274b.m66261d(this);
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
        return new C9382b(this, C40788fB0.m41761u(context, C31698Aj4.item_owned_bird, parent, false));
    }
}
