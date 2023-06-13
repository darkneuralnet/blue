package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC11940o;
import co.bird.android.model.AddressGuess;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C41318g46;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Le8;", "Landroidx/recyclerview/widget/o;", "Lco/bird/android/model/AddressGuess;", "Lg8;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "r", "holder", "position", "", "q", "LO11;", "b", "LO11;", "viewModel", "Lg46$b;", "p", "()Lg46$b;", "logger", "<init>", "(LO11;)V", "destination-rider_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: e8 */
/* loaded from: classes3.dex */
public final class C19966e8 extends AbstractC11940o<AddressGuess, C20758g8> {

    /* renamed from: b */
    public final O11 f77985b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19966e8(O11 viewModel) {
        super(N31.f24065a);
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f77985b = viewModel;
    }

    /* renamed from: t */
    public static final void m43237t(C20758g8 this_apply, C19966e8 this$0, View view) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this_apply.getAdapterPosition() == -1) {
            this$0.m43240p().mo7214x("An address was selected with no adapter position.", new Object[0]);
            return;
        }
        AddressGuess item = this$0.getItem(this_apply.getAdapterPosition());
        if (item != null) {
            this$0.f77985b.m93001j(item);
        }
    }

    /* renamed from: p */
    public final C41318g46.AbstractC20723b m43240p() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("address-adapter");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"address-adapter\")");
        return m40153k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: q */
    public void onBindViewHolder(C20758g8 holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AddressGuess item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(position)");
        holder.m39986a(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: r */
    public C20758g8 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        final C20758g8 m39985a = C20758g8.f81651c.m39985a(parent);
        m39985a.itemView.setOnClickListener(new View.OnClickListener() { // from class: d8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19966e8.m43237t(C20758g8.this, this, view);
            }
        });
        return m39985a;
    }
}
