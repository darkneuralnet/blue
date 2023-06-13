package co.bird.android.feature.servicecenter.status.single.update.adapters;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.wire.WireServiceCenterStatus;
import co.bird.android.statusdialog.adapters.StatusViewHolderSupplier;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier;", "Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier;", "", "layoutId", "Landroid/view/View;", "view", "LeT0;", C17296a.f69688o, "Landroidx/recyclerview/widget/RecyclerView$o;", "q3", "<init>", "()V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ServiceProgressUpdateStatusViewHolderSupplier extends StatusViewHolderSupplier {

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier$a;", "LeT0;", "LG6;", "item", "", C17296a.f69688o, "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "c", "Landroid/widget/TextView;", "message", "Landroid/view/View;", "view", "<init>", "(Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nServiceProgressUpdateStatusViewHolderSupplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceProgressUpdateStatusViewHolderSupplier.kt\nco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier$MessageViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,48:1\n18#2:49\n9#3,4:50\n*S KotlinDebug\n*F\n+ 1 ServiceProgressUpdateStatusViewHolderSupplier.kt\nco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier$MessageViewHolder\n*L\n42#1:49\n42#1:50,4\n*E\n"})
    /* renamed from: co.bird.android.feature.servicecenter.status.single.update.adapters.ServiceProgressUpdateStatusViewHolderSupplier$a */
    /* loaded from: classes3.dex */
    public final class C15743a extends AbstractC40357eT0 {

        /* renamed from: c */
        public final TextView f65603c;

        /* renamed from: d */
        public final /* synthetic */ ServiceProgressUpdateStatusViewHolderSupplier f65604d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15743a(ServiceProgressUpdateStatusViewHolderSupplier serviceProgressUpdateStatusViewHolderSupplier, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f65604d = serviceProgressUpdateStatusViewHolderSupplier;
            this.f65603c = (TextView) view.findViewById(C51769xi4.message);
        }

        @Override // p000.AbstractC40357eT0
        /* renamed from: a */
        public void mo42868a(C2637G6 item) {
            Intrinsics.checkNotNullParameter(item, "item");
            Object m105816c = item.m105816c();
            if (!(m105816c instanceof WireServiceCenterStatus)) {
                m105816c = null;
            }
            WireServiceCenterStatus wireServiceCenterStatus = (WireServiceCenterStatus) m105816c;
            if (wireServiceCenterStatus != null) {
                TextView textView = this.f65603c;
                String displayName = wireServiceCenterStatus.getDisplayName();
                textView.setText("\"" + displayName + "\"");
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, m28432d2 = {"co/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier$b", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "getItemOffsets", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.servicecenter.status.single.update.adapters.ServiceProgressUpdateStatusViewHolderSupplier$b */
    /* loaded from: classes3.dex */
    public static final class C15744b extends RecyclerView.AbstractC11854o {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C11872z state) {
            RecyclerView.AbstractC11843h adapter;
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (childAdapterPosition != -1 && (adapter = parent.getAdapter()) != null && adapter.getItemViewType(childAdapterPosition) == C44082kk4.item_status_header) {
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "parent.context");
                outRect.bottom = (int) C49347td3.m12002a(16, context);
            }
        }
    }

    @Override // co.bird.android.statusdialog.adapters.StatusViewHolderSupplier, co.bird.android.widget.adapter.ViewHolderSupplier
    /* renamed from: a */
    public AbstractC40357eT0 getViewHolderForLayout(int i, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (i == C44082kk4.item_status_message) {
            return new C15743a(this, view);
        }
        return super.getViewHolderForLayout(i, view);
    }

    @Override // co.bird.android.statusdialog.adapters.StatusViewHolderSupplier, co.bird.android.widget.adapter.ViewHolderSupplier
    /* renamed from: q3 */
    public RecyclerView.AbstractC11854o mo54244q3() {
        return new C15744b();
    }
}
