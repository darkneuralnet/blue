package co.bird.android.statusdialog.adapters;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.C11905h;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.widget.adapter.ViewHolderSupplier;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\t\u0010\n\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0003HÖ\u0001¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier;", "Lco/bird/android/widget/adapter/ViewHolderSupplier;", "LeT0;", "", "layoutId", "Landroid/view/View;", "view", C17296a.f69688o, "LF6;", "s2", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "<init>", "()V", "b", "c", "status-dialog_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public class StatusViewHolderSupplier implements ViewHolderSupplier<AbstractC40357eT0> {
    public static final Parcelable.Creator<StatusViewHolderSupplier> CREATOR = new C16420a();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.statusdialog.adapters.StatusViewHolderSupplier$a */
    /* loaded from: classes4.dex */
    public static final class C16420a implements Parcelable.Creator<StatusViewHolderSupplier> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final StatusViewHolderSupplier createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new StatusViewHolderSupplier();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final StatusViewHolderSupplier[] newArray(int i) {
            return new StatusViewHolderSupplier[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier$b;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "status-dialog_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.statusdialog.adapters.StatusViewHolderSupplier$b */
    /* loaded from: classes4.dex */
    public static class C16421b implements InterfaceC2152F6 {
        @Override // p000.InterfaceC2152F6
        /* renamed from: a */
        public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
            return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
        }

        @Override // p000.InterfaceC2152F6
        /* renamed from: b */
        public String mo29b(C2637G6 adapterItem) {
            Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
            if (adapterItem.m105816c() instanceof DQ5) {
                return "header";
            }
            return "";
        }

        @Override // p000.InterfaceC2152F6
        /* renamed from: c */
        public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return true;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier$c;", "LeT0;", "LG6;", "item", "", C17296a.f69688o, "LIf2;", "c", "LIf2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lco/bird/android/statusdialog/adapters/StatusViewHolderSupplier;Landroid/view/View;)V", "status-dialog_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nStatusViewHolderSupplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatusViewHolderSupplier.kt\nco/bird/android/statusdialog/adapters/StatusViewHolderSupplier$StatusHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,48:1\n18#2:49\n9#3,4:50\n*S KotlinDebug\n*F\n+ 1 StatusViewHolderSupplier.kt\nco/bird/android/statusdialog/adapters/StatusViewHolderSupplier$StatusHeaderViewHolder\n*L\n27#1:49\n27#1:50,4\n*E\n"})
    /* renamed from: co.bird.android.statusdialog.adapters.StatusViewHolderSupplier$c */
    /* loaded from: classes4.dex */
    public final class C16422c extends AbstractC40357eT0 {

        /* renamed from: c */
        public final C33532If2 f67074c;

        /* renamed from: d */
        public final /* synthetic */ StatusViewHolderSupplier f67075d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16422c(StatusViewHolderSupplier statusViewHolderSupplier, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f67075d = statusViewHolderSupplier;
            C33532If2 m101829a = C33532If2.m101829a(view);
            Intrinsics.checkNotNullExpressionValue(m101829a, "bind(view)");
            this.f67074c = m101829a;
        }

        @Override // p000.AbstractC40357eT0
        /* renamed from: a */
        public void mo42868a(C2637G6 item) {
            Intrinsics.checkNotNullParameter(item, "item");
            Object m105816c = item.m105816c();
            if (!(m105816c instanceof DQ5)) {
                m105816c = null;
            }
            DQ5 dq5 = (DQ5) m105816c;
            if (dq5 != null) {
                this.f67074c.f15995b.setImageDrawable(NA0.m94299e(this.itemView.getContext(), dq5.m110474b()));
                this.f67074c.f15996c.setText(dq5.m110473c());
            }
        }
    }

    @Override // co.bird.android.widget.adapter.ViewHolderSupplier
    /* renamed from: a */
    public AbstractC40357eT0 getViewHolderForLayout(int i, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return new C16422c(this, view);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // co.bird.android.widget.adapter.ViewHolderSupplier
    /* renamed from: q3 */
    public RecyclerView.AbstractC11854o mo54244q3() {
        return ViewHolderSupplier.C16630a.m54242a(this);
    }

    @Override // co.bird.android.widget.adapter.ViewHolderSupplier
    /* renamed from: s2 */
    public InterfaceC2152F6 mo54243s2() {
        return new C16421b();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(1);
    }
}
