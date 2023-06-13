package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import co.bird.android.model.DialogResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u000b0\u000b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"Lg86;", "Lac5;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lio/reactivex/Observable;", "Lco/bird/android/model/DialogResponse;", "a5", "view", "", "onViewCreated", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "b", "Lio/reactivex/subjects/d;", "dismissSubject", "<init>", "()V", "c", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransferOrderBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferOrderBottomSheet.kt\nco/bird/android/feature/transferorder/dialogs/TransferOrderBottomSheet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
/* renamed from: g86  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41358g86 extends AbstractC38056ac5 {

    /* renamed from: c */
    public static final C20760a f81675c = new C20760a(null);

    /* renamed from: b */
    public final C24558d<DialogResponse> f81676b;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m28432d2 = {"Lg86$a;", "", "", "titleRes", "bodyRes", "", "orderId", "Lg86;", C17296a.f69688o, "TAG", "Ljava/lang/String;", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: g86$a */
    /* loaded from: classes3.dex */
    public static final class C20760a {
        public /* synthetic */ C20760a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C41358g86 m39977a(int i, int i2, String orderId) {
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            C41358g86 c41358g86 = new C41358g86();
            Bundle bundle = new Bundle();
            bundle.putInt("title_res", i);
            bundle.putInt("body_res", i2);
            bundle.putString("transfer_order_id", orderId);
            c41358g86.setArguments(bundle);
            return c41358g86;
        }

        private C20760a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g86$b */
    /* loaded from: classes3.dex */
    public static final class C20761b extends Lambda implements Function1<View, Unit> {
        public C20761b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            C41358g86.this.dismiss();
            C41358g86.this.f81676b.onNext(DialogResponse.OK);
        }
    }

    public C41358g86() {
        C24558d<DialogResponse> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<DialogResponse>()");
        this.f81676b = m31902e;
    }

    /* renamed from: a5 */
    public final Observable<DialogResponse> m39978a5() {
        Observable<DialogResponse> hide = this.f81676b.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "dismissSubject.hide()");
        return hide;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C35442Qj4.bottom_sheet_update_status, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C44237l00 m28029a = C44237l00.m28029a(view);
        Intrinsics.checkNotNullExpressionValue(m28029a, "bind(view)");
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i2 = arguments.getInt("title_res");
            TextView textView = m28029a.f95341d;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.actionTitle");
            textView.setText(i2);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            i = arguments2.getInt("body_res");
        } else {
            i = C45871nl4.sku_order_ready_for_pickup_description;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (string = arguments3.getString("transfer_order_id")) != null) {
            m28029a.f95340c.setText(C50976wN1.m6966a(getResources().getString(i, string), 0));
        }
        Button button = m28029a.f95339b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.actionButton");
        C34585Ms2.m94661j(button, new C20761b());
    }
}
