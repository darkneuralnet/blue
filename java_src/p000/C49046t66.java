package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC11940o;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.chuckerteam.chucker.internal.data.entity.C17147a;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.facebook.share.internal.C17296a;
import java.text.DateFormat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000.C49046t66;
import p000.T94;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001#B%\b\u0000\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b!\u0010\"J\u001c\u0010\b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006H\u0016R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013¨\u0006$"}, m28432d2 = {"Lt66;", "Landroidx/recyclerview/widget/o;", "Lcom/chuckerteam/chucker/internal/data/entity/a;", "Lt66$a;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "x", "holder", "position", "", "w", "Lkotlin/Function1;", "", "b", "Lkotlin/jvm/functions/Function1;", "onTransactionClick", "c", "I", "colorDefault", DateTokenConverter.CONVERTER_KEY, "colorRequested", "e", "colorError", "f", "color500", "g", "color400", "h", "color300", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", C17296a.f69688o, "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: t66  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49046t66 extends AbstractC11940o<C17147a, C28528a> {

    /* renamed from: b */
    public final Function1<Long, Unit> f109875b;

    /* renamed from: c */
    public final int f109876c;

    /* renamed from: d */
    public final int f109877d;

    /* renamed from: e */
    public final int f109878e;

    /* renamed from: f */
    public final int f109879f;

    /* renamed from: g */
    public final int f109880g;

    /* renamed from: h */
    public final int f109881h;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Lt66$a;", "Landroidx/recyclerview/widget/RecyclerView$D;", "Lcom/chuckerteam/chucker/internal/data/entity/a;", "transaction", "", "e", "LT94;", "resources", "i", "j", "Lrj0;", "b", "Lrj0;", "itemBinding", "", "c", "Ljava/lang/Long;", "transactionId", "<init>", "(Lt66;Lrj0;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: t66$a */
    /* loaded from: classes5.dex */
    public final class C28528a extends RecyclerView.AbstractC11834D {

        /* renamed from: b */
        public final C48219rj0 f109882b;

        /* renamed from: c */
        public Long f109883c;

        /* renamed from: d */
        public final /* synthetic */ C49046t66 f109884d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28528a(final C49046t66 c49046t66, C48219rj0 itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.f109884d = c49046t66;
            this.f109882b = itemBinding;
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: s66
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C49046t66.C28528a.m13047b(C49046t66.C28528a.this, c49046t66, view);
                }
            });
        }

        /* renamed from: b */
        public static final void m13047b(C28528a this$0, C49046t66 this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Long l = this$0.f109883c;
            if (l != null) {
                this$1.f109875b.invoke(Long.valueOf(l.longValue()));
            }
        }

        @SuppressLint({"SetTextI18n"})
        /* renamed from: e */
        public final void m13046e(C17147a transaction) {
            T94 c7671a;
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            this.f109883c = Long.valueOf(transaction.m53017g());
            C48219rj0 c48219rj0 = this.f109882b;
            C49639u66.m10854b(c48219rj0, transaction.m53019e(), transaction.m53020d());
            TextView textView = c48219rj0.f107529h;
            String m53016h = transaction.m53016h();
            String m53021c = transaction.m53021c(false);
            textView.setText(m53016h + " " + m53021c);
            c48219rj0.f107528g.setText(transaction.m53018f());
            c48219rj0.f107532k.setText(DateFormat.getTimeInstance().format(transaction.m53015i()));
            if (transaction.m53011m()) {
                c7671a = new T94.C7672b();
            } else {
                c7671a = new T94.C7671a();
            }
            m13045i(c7671a);
            if (transaction.m53013k() == HttpTransaction.EnumC17143a.Complete) {
                c48219rj0.f107523b.setText(String.valueOf(transaction.m53014j()));
                c48219rj0.f107524c.setText(transaction.m53022b());
                c48219rj0.f107530i.setText(transaction.m53012l());
            } else {
                c48219rj0.f107523b.setText("");
                c48219rj0.f107524c.setText("");
                c48219rj0.f107530i.setText("");
            }
            if (transaction.m53013k() == HttpTransaction.EnumC17143a.Failed) {
                c48219rj0.f107523b.setText("!!!");
            }
            m13044j(transaction);
        }

        /* renamed from: i */
        public final void m13045i(T94 t94) {
            this.f109882b.f107531j.setImageDrawable(C29611vi.m8248b(this.itemView.getContext(), t94.m84270b()));
            C51668xY1.m5035c(this.f109882b.f107531j, ColorStateList.valueOf(NA0.m94301c(this.itemView.getContext(), t94.m84271a())));
        }

        /* renamed from: j */
        public final void m13044j(C17147a c17147a) {
            int i;
            if (c17147a.m53013k() == HttpTransaction.EnumC17143a.Failed) {
                i = this.f109884d.f109878e;
            } else if (c17147a.m53013k() == HttpTransaction.EnumC17143a.Requested) {
                i = this.f109884d.f109877d;
            } else if (c17147a.m53014j() == null) {
                i = this.f109884d.f109876c;
            } else {
                Integer m53014j = c17147a.m53014j();
                Intrinsics.checkNotNull(m53014j);
                if (m53014j.intValue() >= 500) {
                    i = this.f109884d.f109879f;
                } else {
                    Integer m53014j2 = c17147a.m53014j();
                    Intrinsics.checkNotNull(m53014j2);
                    if (m53014j2.intValue() >= 400) {
                        i = this.f109884d.f109880g;
                    } else {
                        Integer m53014j3 = c17147a.m53014j();
                        Intrinsics.checkNotNull(m53014j3);
                        if (m53014j3.intValue() >= 300) {
                            i = this.f109884d.f109881h;
                        } else {
                            i = this.f109884d.f109876c;
                        }
                    }
                }
            }
            this.f109882b.f107523b.setTextColor(i);
            this.f109882b.f107529h.setTextColor(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C49046t66(Context context, Function1<? super Long, Unit> onTransactionClick) {
        super(N66.f24158a);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onTransactionClick, "onTransactionClick");
        this.f109875b = onTransactionClick;
        this.f109876c = NA0.m94301c(context, C33066Gf4.chucker_status_default);
        this.f109877d = NA0.m94301c(context, C33066Gf4.chucker_status_requested);
        this.f109878e = NA0.m94301c(context, C33066Gf4.chucker_status_error);
        this.f109879f = NA0.m94301c(context, C33066Gf4.chucker_status_500);
        this.f109880g = NA0.m94301c(context, C33066Gf4.chucker_status_400);
        this.f109881h = NA0.m94301c(context, C33066Gf4.chucker_status_300);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: w */
    public void onBindViewHolder(C28528a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        C17147a item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(position)");
        holder.m13046e(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: x */
    public C28528a onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        C48219rj0 m15545c = C48219rj0.m15545c(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(m15545c, "inflate(\n            Lay…          false\n        )");
        return new C28528a(this, m15545c);
    }
}
