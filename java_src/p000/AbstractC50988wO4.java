package p000;

import android.view.ViewGroup;
import androidx.recyclerview.widget.C11905h;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC11834D;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\t\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0007H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H&J\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007¨\u0006\u0019"}, m28432d2 = {"LwO4;", "T", "Landroidx/recyclerview/widget/RecyclerView$D;", "VH", "", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;", "holder", RequestHeadersFactory.MODEL, "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$D;Ljava/lang/Object;I)V", "", "isClickable", "(Ljava/lang/Object;)Z", "Landroidx/recyclerview/widget/h$f;", C17296a.f69688o, "b", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wO4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC50988wO4<T, VH extends RecyclerView.AbstractC11834D> {
    /* renamed from: a */
    public abstract C11905h.AbstractC11911f<T> mo6901a();

    /* renamed from: b */
    public final int m6900b(int i) {
        return 0;
    }

    public abstract boolean isClickable(T t);

    public abstract void onBindViewHolder(VH vh, T t, int i);

    public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);
}
