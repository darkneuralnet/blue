package p000;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import co.bird.android.widget.BlockingEnterLocationView;
import co.bird.android.widget.OperatorInfoCard;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m28432d2 = {"LTx6;", "Lcom/uber/autodispose/ScopeProvider;", "Lio/reactivex/Observable;", "", "W7", "Lco/bird/android/model/DialogResponse;", "z5", "v1", "D0", "LUx6;", TransferTable.COLUMN_STATE, "e8", "Landroidx/appcompat/app/AppCompatActivity;", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "activity", "Lsx4;", "w1", "()Lsx4;", "rendererDelegate", "Lco/bird/android/widget/OperatorInfoCard;", "p1", "()Lco/bird/android/widget/OperatorInfoCard;", "operatorInfoCard", "Lco/bird/android/widget/BlockingEnterLocationView;", "d7", "()Lco/bird/android/widget/BlockingEnterLocationView;", "blockingEnterLocationView", "Lma4;", "a7", "()Lma4;", "warehouseVerificationRelay", "warehouse-checker_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Tx6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC36272Tx6 extends ScopeProvider {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Tx6$a */
    /* loaded from: classes4.dex */
    public static final class C8157a {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Tx6$a$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C8158a extends FunctionReferenceImpl implements Function1<DialogResponse, Unit> {
            public C8158a(Object obj) {
                super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            }

            /* renamed from: a */
            public final void m82217a(DialogResponse p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C45168ma4) this.receiver).accept(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
                m82217a(dialogResponse);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: a */
        public static Observable<Unit> m82221a(InterfaceC36272Tx6 interfaceC36272Tx6) {
            return C44626lf5.clicksThrottle$default(interfaceC36272Tx6.mo56406d7().m54752a(), 0L, 1, null);
        }

        /* renamed from: b */
        public static Observable<Unit> m82220b(InterfaceC36272Tx6 interfaceC36272Tx6) {
            return C44626lf5.clicksThrottle$default(interfaceC36272Tx6.mo56404p1(), 0L, 1, null);
        }

        /* renamed from: c */
        public static void m82219c(InterfaceC36272Tx6 interfaceC36272Tx6, C36506Ux6 state) {
            boolean z;
            String str;
            String imageUrl;
            Intrinsics.checkNotNullParameter(state, "state");
            String str2 = null;
            C49520tu6.show$default(interfaceC36272Tx6.mo56406d7(), state.m80584c(), 0, 2, null);
            OperatorInfoCard mo56404p1 = interfaceC36272Tx6.mo56404p1();
            if (state.m80582e() != null && state.m80581f() != null) {
                z = true;
            } else {
                z = false;
            }
            C49520tu6.show$default(mo56404p1, z, 0, 2, null);
            TextView m54518f = interfaceC36272Tx6.mo56404p1().m54518f();
            User m80582e = state.m80582e();
            if (m80582e != null) {
                str = m80582e.getName();
            } else {
                str = null;
            }
            m54518f.setText(str);
            TextView m54517g = interfaceC36272Tx6.mo56404p1().m54517g();
            Warehouse m80581f = state.m80581f();
            if (m80581f != null) {
                str2 = m80581f.getName();
            }
            m54517g.setText(str2);
            User m80582e2 = state.m80582e();
            if (m80582e2 != null && (imageUrl = m80582e2.getImageUrl()) != null) {
                ComponentCallbacks2C17096a.m53138t(interfaceC36272Tx6.mo56404p1().getContext()).m81653k(imageUrl).m16096R0(interfaceC36272Tx6.mo56404p1().m54519e());
            }
            Warehouse m80583d = state.m80583d();
            if (m80583d != null) {
                if (state.m80581f() != null) {
                    C43641jz6 m29515a = C43641jz6.f93709e.m29515a(state.m80581f(), m80583d);
                    m29515a.show(interfaceC36272Tx6.getActivity().getSupportFragmentManager(), "WarehouseVerificationBottomSheet");
                    m29515a.m29516t8(new C8158a(interfaceC36272Tx6.mo56408a7()));
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            Throwable m80585b = state.m80585b();
            if (m80585b != null) {
                C38689bg5.m64178c(interfaceC36272Tx6.mo56401w1(), m80585b);
            }
        }

        /* renamed from: d */
        public static Observable<DialogResponse> m82218d(InterfaceC36272Tx6 interfaceC36272Tx6) {
            Observable<DialogResponse> hide = interfaceC36272Tx6.mo56408a7().hide();
            Intrinsics.checkNotNullExpressionValue(hide, "warehouseVerificationRelay.hide()");
            return hide;
        }
    }

    /* renamed from: D0 */
    Observable<Unit> mo56414D0();

    /* renamed from: W7 */
    Observable<Unit> mo56409W7();

    /* renamed from: a7 */
    C45168ma4<DialogResponse> mo56408a7();

    /* renamed from: d7 */
    BlockingEnterLocationView mo56406d7();

    /* renamed from: e8 */
    void mo56405e8(C36506Ux6 c36506Ux6);

    AppCompatActivity getActivity();

    /* renamed from: p1 */
    OperatorInfoCard mo56404p1();

    /* renamed from: v1 */
    Observable<Unit> mo56402v1();

    /* renamed from: w1 */
    C48955sx4 mo56401w1();

    /* renamed from: z5 */
    Observable<DialogResponse> mo56400z5();
}
