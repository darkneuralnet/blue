package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0011"}, m28432d2 = {"Ly92;", "Lac5;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "<init>", "()V", "b", C17296a.f69688o, "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: y92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52036y92 extends AbstractC38056ac5 {

    /* renamed from: b */
    public static final C30431a f118822b = new C30431a(null);

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"Ly92$a;", "", "", "inventoryRecorded", "Ly92;", C17296a.f69688o, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: y92$a */
    /* loaded from: classes3.dex */
    public static final class C30431a {
        public /* synthetic */ C30431a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C52036y92 m4039a(int i) {
            C52036y92 c52036y92 = new C52036y92();
            Bundle bundle = new Bundle();
            bundle.putInt("part_count", i);
            c52036y92.setArguments(bundle);
            return c52036y92;
        }

        private C30431a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: y92$b */
    /* loaded from: classes3.dex */
    public static final class C30432b extends Lambda implements Function1<View, Unit> {
        public C30432b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            C52036y92.this.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C52965zj4.bottom_sheet_inventory_recorded_confirmation, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i = arguments.getInt("part_count");
            ((TextView) view.findViewById(C34488Mh4.body)).setText(getResources().getQuantityString(C37089Xk4.operator_inventory_inventory_recorded_label, i, Integer.valueOf(i)));
        }
        View findViewById = view.findViewById(C34488Mh4.confirm);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById<Button>(R.id.confirm)");
        C34585Ms2.m94661j(findViewById, new C30432b());
    }
}
