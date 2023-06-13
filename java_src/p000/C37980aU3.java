package p000;

import androidx.recyclerview.widget.C11905h;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, m28432d2 = {"LaU3;", "Landroidx/recyclerview/widget/h$f;", "LXT3;", "oldItem", "newItem", "", "b", C17296a.f69688o, "<init>", "()V", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: aU3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37980aU3 extends C11905h.AbstractC11911f<XT3> {

    /* renamed from: a */
    public static final C37980aU3 f50543a = new C37980aU3();

    private C37980aU3() {
    }

    @Override // androidx.recyclerview.widget.C11905h.AbstractC11911f
    /* renamed from: a */
    public boolean areContentsTheSame(XT3 oldItem, XT3 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.m76970b(), newItem.m76970b());
    }

    @Override // androidx.recyclerview.widget.C11905h.AbstractC11911f
    /* renamed from: b */
    public boolean areItemsTheSame(XT3 oldItem, XT3 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.m76969c(), newItem.m76969c());
    }
}
