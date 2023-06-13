package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.identification.IdentificationDocumentType;
import com.facebook.share.internal.C17296a;
import com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.AbstractC39429ct4;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0014B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0015"}, m28432d2 = {"LP51;", "Lct4;", "Lco/bird/android/model/identification/IdentificationDocumentType;", "Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView$e;", "", "position", "", "b", "Landroid/view/ViewGroup;", "parent", "viewType", "Landroidx/recyclerview/widget/RecyclerView$D;", "onCreateViewHolder", "holder", "", "onBindViewHolder", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", C17296a.f69688o, "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: P51 */
/* loaded from: classes3.dex */
public final class P51 extends AbstractC39429ct4<IdentificationDocumentType> implements FastScrollRecyclerView.InterfaceC18584e {

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LP51$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/LinearLayout;", "b", "Landroid/widget/LinearLayout;", "getRoot", "()Landroid/widget/LinearLayout;", "root", "LP51;", "c", "LP51;", C17296a.f69688o, "()LP51;", "adapter", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "name", "<init>", "(Landroid/widget/LinearLayout;LP51;)V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: P51$a */
    /* loaded from: classes3.dex */
    public static final class C6238a extends C29735w1 {

        /* renamed from: b */
        public final LinearLayout f27870b;

        /* renamed from: c */
        public final P51 f27871c;

        /* renamed from: d */
        public final TextView f27872d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: P51$a$a */
        /* loaded from: classes3.dex */
        public static final class C6239a extends Lambda implements Function1<View, Unit> {
            public C6239a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                AbstractC39429ct4.InterfaceC19633a<IdentificationDocumentType> m44891v;
                int adapterPosition = C6238a.this.getAdapterPosition();
                if (adapterPosition == -1 || (m44891v = C6238a.this.m90873a().m44891v()) == null) {
                    return;
                }
                Intrinsics.checkNotNull(view);
                m44891v.mo44887a(view, adapterPosition, C6238a.this.m90873a().m44895q(adapterPosition));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6238a(LinearLayout root, P51 adapter) {
            super(root);
            Intrinsics.checkNotNullParameter(root, "root");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.f27870b = root;
            this.f27871c = adapter;
            this.f27872d = (TextView) C49520tu6.m11238m(root, C49981uh4.name);
            C34585Ms2.m94661j(root, new C6239a());
        }

        /* renamed from: a */
        public final P51 m90873a() {
            return this.f27871c;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            IdentificationDocumentType m44895q = this.f27871c.m44895q(i);
            TextView textView = this.f27872d;
            if (textView != null) {
                textView.setText(C33792Ji1.m99932d(m44895q, getContext()));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P51(Context context) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView.InterfaceC18584e
    /* renamed from: b */
    public String mo16260b(int i) {
        return String.valueOf(m44895q(i).name().charAt(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(RecyclerView.AbstractC11834D holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((C29735w1) holder).bind(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public RecyclerView.AbstractC11834D onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View m41761u = C40788fB0.m41761u(m44892u(), C42293hj4.item_document_type_picker, parent, false);
        Intrinsics.checkNotNull(m41761u, "null cannot be cast to non-null type android.widget.LinearLayout");
        return new C6238a((LinearLayout) m41761u, this);
    }
}
