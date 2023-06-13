package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000e\u0010\rJ\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¨\u0006\u0017"}, m28432d2 = {"Landroidx/recyclerview/widget/e;", "Landroidx/recyclerview/widget/RecyclerView$D;", "", "i", "j", "", "flags", "mask", "l", "(II)V", C17296a.f69688o, "(I)V", "b", "()V", "k", "", "previousBound", "currentBound", "e", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: classes.dex */
public abstract class AbstractC11890e extends RecyclerView.AbstractC11834D {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC11890e(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11834D
    /* renamed from: a */
    public void addFlags(int i) {
        boolean isBound = isBound();
        super.addFlags(i);
        m66319e(isBound, isBound());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11834D
    /* renamed from: b */
    public void clearPayload() {
        boolean isBound = isBound();
        super.clearPayload();
        m66319e(isBound, isBound());
    }

    /* renamed from: e */
    public final void m66319e(boolean z, boolean z2) {
        if (z && !z2) {
            mo66317j();
        } else if (!z && z2) {
            mo66318i();
        }
    }

    /* renamed from: i */
    public abstract void mo66318i();

    /* renamed from: j */
    public abstract void mo66317j();

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11834D
    /* renamed from: k */
    public void resetInternal() {
        boolean isBound = isBound();
        super.resetInternal();
        m66319e(isBound, isBound());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11834D
    /* renamed from: l */
    public void setFlags(int i, int i2) {
        boolean isBound = isBound();
        super.setFlags(i, i2);
        m66319e(isBound, isBound());
    }
}
