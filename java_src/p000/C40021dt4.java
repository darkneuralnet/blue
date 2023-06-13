package p000;

import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0018"}, m28432d2 = {"Ldt4;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Landroidx/recyclerview/widget/RecyclerView;", C17296a.f69688o, "Landroidx/recyclerview/widget/RecyclerView;", "()Landroidx/recyclerview/widget/RecyclerView;", "view", "b", "I", "getDx", "()I", "dx", "c", "getDy", "dy", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "rxbinding-recyclerview_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: dt4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40021dt4 {

    /* renamed from: a */
    public final RecyclerView f77346a;

    /* renamed from: b */
    public final int f77347b;

    /* renamed from: c */
    public final int f77348c;

    public C40021dt4(RecyclerView recyclerView, int i, int i2) {
        this.f77346a = recyclerView;
        this.f77347b = i;
        this.f77348c = i2;
    }

    /* renamed from: a */
    public final RecyclerView m43549a() {
        return this.f77346a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C40021dt4) {
                C40021dt4 c40021dt4 = (C40021dt4) obj;
                if (Intrinsics.areEqual(this.f77346a, c40021dt4.f77346a)) {
                    if (this.f77347b == c40021dt4.f77347b) {
                        if (this.f77348c == c40021dt4.f77348c) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        RecyclerView recyclerView = this.f77346a;
        return ((((recyclerView != null ? recyclerView.hashCode() : 0) * 31) + this.f77347b) * 31) + this.f77348c;
    }

    public String toString() {
        return "RecyclerViewScrollEvent(view=" + this.f77346a + ", dx=" + this.f77347b + ", dy=" + this.f77348c + ")";
    }
}
