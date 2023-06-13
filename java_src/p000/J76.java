package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¨\u0006\u0014"}, m28432d2 = {"LJ76;", "LMy;", "Lh0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "w", "holder", "position", "", "v", "LF6;", "r", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: J76 */
/* loaded from: classes3.dex */
public final class J76 extends AbstractC5440My<C22528h0> {

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LJ76$a;", "Lh0;", "", "position", "", "bind", "LUf2;", "f", "LUf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LJ76;Landroid/view/View;)V", "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTransactionReceiptAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionReceiptAdapter.kt\nco/bird/android/feature/selfservepayment/receipt/adapter/TransactionReceiptAdapter$ReceiptItemViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,52:1\n18#2:53\n9#3,4:54\n*S KotlinDebug\n*F\n+ 1 TransactionReceiptAdapter.kt\nco/bird/android/feature/selfservepayment/receipt/adapter/TransactionReceiptAdapter$ReceiptItemViewHolder\n*L\n40#1:53\n40#1:54,4\n*E\n"})
    /* renamed from: J76$a */
    /* loaded from: classes3.dex */
    public final class C3895a extends C22528h0 {

        /* renamed from: f */
        public final C36340Uf2 f16875f;

        /* renamed from: g */
        public final /* synthetic */ J76 f16876g;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: J76$a$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C3896a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC42976is4.values().length];
                try {
                    iArr[EnumC42976is4.TOTAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3895a(J76 j76, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f16876g = j76;
            C36340Uf2 m81205a = C36340Uf2.m81205a(view);
            Intrinsics.checkNotNullExpressionValue(m81205a, "bind(view)");
            this.f16875f = m81205a;
        }

        @Override // p000.C22528h0
        public void bind(int i) {
            super.bind(i);
            Object m105816c = this.f16876g.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C42383hs4)) {
                m105816c = null;
            }
            C42383hs4 c42383hs4 = (C42383hs4) m105816c;
            if (c42383hs4 != null) {
                this.f16875f.f37723c.setText(c42383hs4.m35685c());
                this.f16875f.f37722b.setText(c42383hs4.m35686b());
                TextView textView = this.f16875f.f37722b;
                Typeface typeface = textView.getTypeface();
                int i2 = 1;
                if (C3896a.$EnumSwitchMapping$0[c42383hs4.m35684d().ordinal()] != 1) {
                    i2 = 0;
                }
                textView.setTypeface(typeface, i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new L76());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new M76();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: v */
    public void onBindViewHolder(C22528h0 holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: w */
    public C22528h0 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        if (i == C34506Mj4.item_transaction_receipt_item) {
            return new C3895a(this, m41761u);
        }
        return new C22528h0(m41761u);
    }
}
