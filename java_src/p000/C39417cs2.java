package p000;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt___StringsKt;
import p000.AbstractC39429ct4;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004:\u0001\u0015B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0016"}, m28432d2 = {"Lcs2;", "Landroid/os/Parcelable;", "T", "Lct4;", "Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView$e;", "", "position", "", "b", "Landroid/view/ViewGroup;", "parent", "viewType", "Landroidx/recyclerview/widget/RecyclerView$D;", "onCreateViewHolder", "holder", "", "onBindViewHolder", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", C17296a.f69688o, "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cs2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39417cs2<T extends Parcelable> extends AbstractC39429ct4<T> implements FastScrollRecyclerView.InterfaceC18584e {

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\r\u001a\u00020\b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"Lcs2$a;", "Landroid/os/Parcelable;", "T", "Lw1;", "", "position", "", "bind", "Landroid/widget/LinearLayout;", "b", "Landroid/widget/LinearLayout;", "getRoot", "()Landroid/widget/LinearLayout;", "root", "Lcs2;", "c", "Lcs2;", C17296a.f69688o, "()Lcs2;", "adapter", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "name", "<init>", "(Landroid/widget/LinearLayout;Lcs2;)V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: cs2$a */
    /* loaded from: classes3.dex */
    public static final class C19627a<T extends Parcelable> extends C29735w1 {

        /* renamed from: b */
        public final LinearLayout f75745b;

        /* renamed from: c */
        public final C39417cs2<T> f75746c;

        /* renamed from: d */
        public final TextView f75747d;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "T", "Landroid/os/Parcelable;", "v", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: cs2$a$a */
        /* loaded from: classes3.dex */
        public static final class C19628a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C19627a<T> f75748g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19628a(C19627a<T> c19627a) {
                super(1);
                this.f75748g = c19627a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                AbstractC39429ct4.InterfaceC19633a<T> m44891v;
                int adapterPosition = this.f75748g.getAdapterPosition();
                if (adapterPosition == -1 || (m44891v = this.f75748g.m44942a().m44891v()) == 0) {
                    return;
                }
                Intrinsics.checkNotNull(view);
                m44891v.mo44887a(view, adapterPosition, this.f75748g.m44942a().m44895q(adapterPosition));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19627a(LinearLayout root, C39417cs2<T> adapter) {
            super(root);
            Intrinsics.checkNotNullParameter(root, "root");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.f75745b = root;
            this.f75746c = adapter;
            this.f75747d = (TextView) C49520tu6.m11238m(root, C49981uh4.name);
            C34585Ms2.m94661j(root, new C19628a(this));
        }

        /* renamed from: a */
        public final C39417cs2<T> m44942a() {
            return this.f75746c;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Parcelable parcelable = (Parcelable) this.f75746c.m44895q(i);
            TextView textView = this.f75747d;
            if (textView != null) {
                textView.setText(parcelable.toString());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39417cs2(Context context) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView.InterfaceC18584e
    /* renamed from: b */
    public String mo16260b(int i) {
        char first;
        first = StringsKt___StringsKt.first(m44895q(i).toString());
        return String.valueOf(first);
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
        return new C19627a((LinearLayout) m41761u, this);
    }
}
