package co.bird.android.feature.coreinventory.scan;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LmX5;", "b", "()LmX5;"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class CoreInventoryScanActivity$swipeHelper$2 extends Lambda implements Function0<C45142mX5> {

    /* renamed from: g */
    public final /* synthetic */ CoreInventoryScanActivity f63829g;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroidx/recyclerview/widget/RecyclerView$D;", "viewHolder", "", C17296a.f69688o, "(Landroidx/recyclerview/widget/RecyclerView$D;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.coreinventory.scan.CoreInventoryScanActivity$swipeHelper$2$1 */
    /* loaded from: classes3.dex */
    public static final class C147571 extends Lambda implements Function1<RecyclerView.AbstractC11834D, Boolean> {

        /* renamed from: g */
        public static final C147571 f63830g = new C147571();

        public C147571() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(RecyclerView.AbstractC11834D viewHolder) {
            boolean z;
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            if (viewHolder.getBindingAdapterPosition() != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInventoryScanActivity$swipeHelper$2(CoreInventoryScanActivity coreInventoryScanActivity) {
        super(0);
        this.f63829g = coreInventoryScanActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: b */
    public final C45142mX5 invoke() {
        return new C45142mX5(this.f63829g, 0, C147571.f63830g, null, 10, null);
    }
}
