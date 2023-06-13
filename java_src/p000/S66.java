package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C11905h;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.TransactionSummary;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, m28432d2 = {"LS66;", "LwO4;", "Lco/bird/android/model/TransactionSummary;", "Lor6;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "e", "holder", RequestHeadersFactory.MODEL, "position", "", DateTokenConverter.CONVERTER_KEY, "", "c", "Landroidx/recyclerview/widget/h$f;", C17296a.f69688o, "Z", "enableRiderParkingReview", "<init>", "(Z)V", "b", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: S66 */
/* loaded from: classes2.dex */
public final class S66 extends AbstractC50988wO4<TransactionSummary, C46526or6> {

    /* renamed from: b */
    public static final C7332b f33166b = new C7332b(null);

    /* renamed from: c */
    public static final C7331a f33167c = new C7331a();

    /* renamed from: a */
    public final boolean f33168a;

    @Metadata(m28433d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\b"}, m28432d2 = {"S66$a", "Landroidx/recyclerview/widget/h$f;", "Lco/bird/android/model/TransactionSummary;", "oldItem", "newItem", "", "b", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: S66$a */
    /* loaded from: classes2.dex */
    public static final class C7331a extends C11905h.AbstractC11911f<TransactionSummary> {
        @Override // androidx.recyclerview.widget.C11905h.AbstractC11911f
        /* renamed from: a */
        public boolean areContentsTheSame(TransactionSummary oldItem, TransactionSummary newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11911f
        /* renamed from: b */
        public boolean areItemsTheSame(TransactionSummary oldItem, TransactionSummary newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.primaryKey(), newItem.primaryKey());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006*\u0001\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LS66$b;", "", "S66$a", "DIFFER", "LS66$a;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: S66$b */
    /* loaded from: classes2.dex */
    public static final class C7332b {
        public /* synthetic */ C7332b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7332b() {
        }
    }

    public S66(boolean z) {
        this.f33168a = z;
    }

    @Override // p000.AbstractC50988wO4
    /* renamed from: a */
    public C11905h.AbstractC11911f<TransactionSummary> mo6901a() {
        return f33167c;
    }

    @Override // p000.AbstractC50988wO4
    /* renamed from: c */
    public boolean isClickable(TransactionSummary model) {
        boolean m84306a;
        Intrinsics.checkNotNullParameter(model, "model");
        m84306a = T66.m84306a(model);
        return m84306a;
    }

    @Override // p000.AbstractC50988wO4
    /* renamed from: d */
    public void onBindViewHolder(C46526or6 holder, TransactionSummary model, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "model");
        holder.m20426b(model);
    }

    @Override // p000.AbstractC50988wO4
    /* renamed from: e */
    public C46526or6 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(C39311cj4.item_transaction_history, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "from(parent.context).inf…false /* attachToRoot */)");
        return new C46526or6(inflate, this.f33168a);
    }
}
