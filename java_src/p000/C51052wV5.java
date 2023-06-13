package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.feature.payment.views.SupportedPaymentBrandsView;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\"\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0014\u0010\u0014\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R0\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m28432d2 = {"LwV5;", "Landroid/widget/BaseAdapter;", "", "LvV5;", "brands", "", "b", "", "getCount", "position", C17296a.f69688o, "p0", "", "getItemId", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "parent", "getView", "I", "itemSize", "<set-?>", "c", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "items", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wV5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51052wV5 extends BaseAdapter {

    /* renamed from: b */
    public final int f116079b;

    /* renamed from: c */
    public List<C50459vV5> f116080c;

    public C51052wV5(Context context) {
        List<C50459vV5> emptyList;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f116079b = context.getResources().getDimensionPixelSize(SupportedPaymentBrandsView.f64502e.m57677a());
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f116080c = emptyList;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public C50459vV5 getItem(int i) {
        return this.f116080c.get(i);
    }

    /* renamed from: b */
    public final void m6727b(List<C50459vV5> brands) {
        Intrinsics.checkNotNullParameter(brands, "brands");
        this.f116080c = brands;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f116080c.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        C52913ze2 m939c = C52913ze2.m939c(C40788fB0.m41772j(context));
        Intrinsics.checkNotNullExpressionValue(m939c, "inflate(parent.context.layoutInflater)");
        m939c.getRoot().setImageResource(this.f116080c.get(i).m8573b());
        ImageView root = m939c.getRoot();
        int i2 = this.f116079b;
        root.setLayoutParams(new ViewGroup.LayoutParams(i2, i2));
        ImageView root2 = m939c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "binding.root");
        return root2;
    }
}
