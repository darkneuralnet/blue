package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.wire.WireMerchantAction;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\n\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u0010"}, m28432d2 = {"LE2;", "Landroidx/recyclerview/widget/RecyclerView$D;", "Lco/bird/android/model/wire/WireMerchantAction;", "item", "", C17296a.f69688o, "Lod2;", "b", "Lod2;", "()Lod2;", "binding", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "c", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: E2 */
/* loaded from: classes3.dex */
public final class C1710E2 extends RecyclerView.AbstractC11834D {

    /* renamed from: c */
    public static final C1711a f6861c = new C1711a(null);

    /* renamed from: b */
    public final C46382od2 f6862b;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m28432d2 = {"LE2$a;", "", "Landroid/view/ViewGroup;", "parent", "LE2;", C17296a.f69688o, "<init>", "()V", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: E2$a */
    /* loaded from: classes3.dex */
    public static final class C1711a {
        public /* synthetic */ C1711a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C1710E2 m109489a(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View inflate = LayoutInflater.from(parent.getContext()).inflate(C33336Hj4.item_merchant_action, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(parent.context).inf…nt,\n        false\n      )");
            return new C1710E2(inflate);
        }

        private C1711a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1710E2(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        C46382od2 m20772a = C46382od2.m20772a(itemView);
        Intrinsics.checkNotNullExpressionValue(m20772a, "bind(itemView)");
        this.f6862b = m20772a;
    }

    /* renamed from: a */
    public final void m109491a(WireMerchantAction item) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = this.f6862b.f102212f;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.actionTitleText");
        boolean z3 = true;
        if (item.getTitle() != null) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(textView, z, 0, 2, null);
        this.f6862b.f102212f.setText(item.getTitle());
        TextView textView2 = this.f6862b.f102211e;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.actionSubtitleText");
        if (item.getSubtitle() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C49520tu6.show$default(textView2, z2, 0, 2, null);
        this.f6862b.f102211e.setText(item.getSubtitle());
        FrameLayout frameLayout = this.f6862b.f102209c;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.actionButtonContainer");
        if (item.getButtonTitle().length() <= 0) {
            z3 = false;
        }
        C49520tu6.show$default(frameLayout, z3, 0, 2, null);
        this.f6862b.f102208b.setText(item.getButtonTitle());
    }

    /* renamed from: b */
    public final C46382od2 m109490b() {
        return this.f6862b;
    }
}
