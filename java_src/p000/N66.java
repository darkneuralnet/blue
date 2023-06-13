package p000;

import androidx.recyclerview.widget.C11905h;
import com.chuckerteam.chucker.internal.data.entity.C17147a;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LN66;", "Landroidx/recyclerview/widget/h$f;", "Lcom/chuckerteam/chucker/internal/data/entity/a;", "oldItem", "newItem", "", "b", C17296a.f69688o, "", "c", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: N66 */
/* loaded from: classes5.dex */
public final class N66 extends C11905h.AbstractC11911f<C17147a> {

    /* renamed from: a */
    public static final N66 f24158a = new N66();

    private N66() {
    }

    @Override // androidx.recyclerview.widget.C11905h.AbstractC11911f
    /* renamed from: a */
    public boolean areContentsTheSame(C17147a oldItem, C17147a newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.C11905h.AbstractC11911f
    /* renamed from: b */
    public boolean areItemsTheSame(C17147a oldItem, C17147a newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (oldItem.m53017g() == newItem.m53017g()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void m94363c(C17147a oldItem, C17147a newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
    }

    @Override // androidx.recyclerview.widget.C11905h.AbstractC11911f
    public /* bridge */ /* synthetic */ Object getChangePayload(C17147a c17147a, C17147a c17147a2) {
        m94363c(c17147a, c17147a2);
        return Unit.INSTANCE;
    }
}
