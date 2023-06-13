package co.bird.android.widget.adapter;

import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC11834D;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u001f\u0010\b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/widget/adapter/ViewHolderSupplier;", "Landroidx/recyclerview/widget/RecyclerView$D;", "T", "Landroid/os/Parcelable;", "", "layoutId", "Landroid/view/View;", "view", "getViewHolderForLayout", "(ILandroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$D;", "LF6;", "s2", "Landroidx/recyclerview/widget/RecyclerView$o;", "q3", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface ViewHolderSupplier<T extends RecyclerView.AbstractC11834D> extends Parcelable {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.adapter.ViewHolderSupplier$a */
    /* loaded from: classes4.dex */
    public static final class C16630a {
        /* renamed from: a */
        public static <T extends RecyclerView.AbstractC11834D> RecyclerView.AbstractC11854o m54242a(ViewHolderSupplier<T> viewHolderSupplier) {
            return null;
        }
    }

    T getViewHolderForLayout(int i, View view);

    /* renamed from: q3 */
    RecyclerView.AbstractC11854o mo54244q3();

    /* renamed from: s2 */
    InterfaceC2152F6 mo54243s2();
}
