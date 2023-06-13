package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C11905h;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireMerchantTransaction;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0018"}, m28432d2 = {"LFQ2;", "LwO4;", "Lco/bird/android/model/wire/WireMerchantTransaction;", "Lpr6;", "holder", RequestHeadersFactory.MODEL, "", "position", "", DateTokenConverter.CONVERTER_KEY, "Landroid/view/ViewGroup;", "parent", "viewType", "e", "", "c", "Landroidx/recyclerview/widget/h$f;", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "b", "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: FQ2 */
/* loaded from: classes3.dex */
public final class FQ2 extends AbstractC50988wO4<WireMerchantTransaction, C47119pr6> {

    /* renamed from: b */
    public static final C2273b f9348b = new C2273b(null);

    /* renamed from: c */
    public static final C2272a f9349c = new C2272a();

    /* renamed from: a */
    public final Context f9350a;

    @Metadata(m28433d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\b"}, m28432d2 = {"FQ2$a", "Landroidx/recyclerview/widget/h$f;", "Lco/bird/android/model/wire/WireMerchantTransaction;", "oldItem", "newItem", "", "b", C17296a.f69688o, "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: FQ2$a */
    /* loaded from: classes3.dex */
    public static final class C2272a extends C11905h.AbstractC11911f<WireMerchantTransaction> {
        @Override // androidx.recyclerview.widget.C11905h.AbstractC11911f
        /* renamed from: a */
        public boolean areContentsTheSame(WireMerchantTransaction oldItem, WireMerchantTransaction newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (oldItem.getTransaction().getBilledAmount() == newItem.getTransaction().getBilledAmount() && Intrinsics.areEqual(oldItem.getTransaction().getTransactionDate(), newItem.getTransaction().getTransactionDate()) && Intrinsics.areEqual(oldItem.getTransaction().getMerchantSiteId(), newItem.getTransaction().getMerchantSiteId())) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11911f
        /* renamed from: b */
        public boolean areItemsTheSame(WireMerchantTransaction oldItem, WireMerchantTransaction newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getTransaction().getId(), newItem.getTransaction().getId());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006*\u0001\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LFQ2$b;", "", "FQ2$a", "DIFFER", "LFQ2$a;", "<init>", "()V", "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: FQ2$b */
    /* loaded from: classes3.dex */
    public static final class C2273b {
        public /* synthetic */ C2273b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2273b() {
        }
    }

    public FQ2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f9350a = context;
    }

    @Override // p000.AbstractC50988wO4
    /* renamed from: a */
    public C11905h.AbstractC11911f<WireMerchantTransaction> mo6901a() {
        return f9349c;
    }

    @Override // p000.AbstractC50988wO4
    /* renamed from: c */
    public boolean isClickable(WireMerchantTransaction model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return true;
    }

    @Override // p000.AbstractC50988wO4
    /* renamed from: d */
    public void onBindViewHolder(C47119pr6 holder, WireMerchantTransaction model, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "model");
        holder.m18632a(model);
    }

    @Override // p000.AbstractC50988wO4
    /* renamed from: e */
    public C47119pr6 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = LayoutInflater.from(this.f9350a).inflate(C46444oj4.item_merchant_history, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…t_history, parent, false)");
        return new C47119pr6(inflate);
    }
}
