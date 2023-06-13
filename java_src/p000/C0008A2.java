package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.AbstractC11940o;
import co.bird.android.model.wire.WireMerchantAction;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"LA2;", "Landroidx/recyclerview/widget/o;", "Lco/bird/android/model/wire/WireMerchantAction;", "LE2;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "q", "holder", "position", "", "p", "Lma4;", "b", "Lma4;", "_actionClicks", "Lio/reactivex/Observable;", "c", "Lio/reactivex/Observable;", "o", "()Lio/reactivex/Observable;", "actionClicks", "<init>", "()V", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: A2 */
/* loaded from: classes3.dex */
public final class C0008A2 extends AbstractC11940o<WireMerchantAction, C1710E2> {

    /* renamed from: b */
    public final C45168ma4<WireMerchantAction> f36b;

    /* renamed from: c */
    public final Observable<WireMerchantAction> f37c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: A2$a */
    /* loaded from: classes3.dex */
    public static final class C0009a extends Lambda implements Function1<View, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C1710E2 f38g;

        /* renamed from: h */
        public final /* synthetic */ C0008A2 f39h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0009a(C1710E2 c1710e2, C0008A2 c0008a2) {
            super(1);
            this.f38g = c1710e2;
            this.f39h = c0008a2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            int adapterPosition = this.f38g.getAdapterPosition();
            if (adapterPosition != -1) {
                this.f39h.f36b.accept(C0008A2.access$getItem(this.f39h, adapterPosition));
            }
        }
    }

    public C0008A2() {
        super(C1334D2.f5098a);
        C45168ma4<WireMerchantAction> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create()");
        this.f36b = m25409g;
        this.f37c = m25409g;
    }

    public static final /* synthetic */ WireMerchantAction access$getItem(C0008A2 c0008a2, int i) {
        return c0008a2.getItem(i);
    }

    /* renamed from: o */
    public final Observable<WireMerchantAction> m116184o() {
        return this.f37c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: p */
    public void onBindViewHolder(C1710E2 holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        WireMerchantAction item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(position)");
        holder.m109491a(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: q */
    public C1710E2 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        C1710E2 m109489a = C1710E2.f6861c.m109489a(parent);
        FrameLayout frameLayout = m109489a.m109490b().f102209c;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.actionButtonContainer");
        C34585Ms2.m94661j(frameLayout, new C0009a(m109489a, this));
        return m109489a;
    }
}
