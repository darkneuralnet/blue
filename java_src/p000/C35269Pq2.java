package p000;

import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC11940o;
import co.bird.android.library.lightbox.LightboxImage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, m28432d2 = {"LPq2;", "Landroidx/recyclerview/widget/o;", "Lco/bird/android/library/lightbox/LightboxImage;", "LvX1;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "p", "holder", "position", "", "o", "<init>", "()V", "lightbox_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Pq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35269Pq2 extends AbstractC11940o<LightboxImage, C50473vX1> {
    public C35269Pq2() {
        super(M31.f22534a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: o */
    public void onBindViewHolder(C50473vX1 holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        LightboxImage item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(position)");
        holder.m8530a(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: p */
    public C50473vX1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return C50473vX1.f114219d.m8529a(parent);
    }
}
