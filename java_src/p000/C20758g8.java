package p000;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.AddressGuess;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m28432d2 = {"Lg8;", "Landroidx/recyclerview/widget/RecyclerView$D;", "Lco/bird/android/model/AddressGuess;", PaymentMethod.BillingDetails.PARAM_ADDRESS, "", C17296a.f69688o, "LNa2;", "b", "LNa2;", "binding", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "c", "destination-rider_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: g8 */
/* loaded from: classes3.dex */
public final class C20758g8 extends RecyclerView.AbstractC11834D {

    /* renamed from: c */
    public static final C20759a f81651c = new C20759a(null);

    /* renamed from: b */
    public final C34657Na2 f81652b;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m28432d2 = {"Lg8$a;", "", "Landroid/view/ViewGroup;", "parent", "Lg8;", C17296a.f69688o, "<init>", "()V", "destination-rider_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: g8$a */
    /* loaded from: classes3.dex */
    public static final class C20759a {
        public /* synthetic */ C20759a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C20758g8 m39985a(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View inflate = LayoutInflater.from(parent.getContext()).inflate(C37305Yi4.item_address, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(parent.context).inf…nt,\n        false\n      )");
            return new C20758g8(inflate);
        }

        private C20759a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20758g8(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        C34657Na2 m93745a = C34657Na2.m93745a(view);
        Intrinsics.checkNotNullExpressionValue(m93745a, "bind(view)");
        this.f81652b = m93745a;
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: a */
    public final void m39986a(AddressGuess address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f81652b.f24809b.setText(address.getFirstLine());
        this.f81652b.f24810c.setText(address.getSecondLine());
    }
}
