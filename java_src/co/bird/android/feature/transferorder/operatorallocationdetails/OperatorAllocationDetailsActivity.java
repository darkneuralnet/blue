package co.bird.android.feature.transferorder.operatorallocationdetails;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.transferorder.operatorallocationdetails.InterfaceC15813b;
import co.bird.android.feature.transferorder.operatorallocationdetails.OperatorAllocationDetailsActivity;
import co.bird.android.model.wire.WireTransferOrderClosedIncompleteReason;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.S74;
@Metadata(m28433d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bM\u0010NJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\"\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010-\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\u00100\u00100)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u00101\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\u00050\u00050.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\"\u00105\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\u00130\u0013028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R!\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050:8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R!\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00100:8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010>R!\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050:8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bC\u0010<\u001a\u0004\bD\u0010>R!\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00050:8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bF\u0010<\u001a\u0004\bG\u0010>R \u0010L\u001a\b\u0012\u0004\u0012\u00020\u00130:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010>¨\u0006O"}, m28432d2 = {"Lco/bird/android/feature/transferorder/operatorallocationdetails/OperatorAllocationDetailsActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "Lbj3;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Lrv1;", TransferTable.COLUMN_STATE, "U", "", "inbound", "isContinue", "", "Q", "LYi3;", "j", "LYi3;", "S", "()LYi3;", "setPresenter", "(LYi3;)V", "presenter", "Lvi3;", "k", "Lvi3;", "R", "()Lvi3;", "setAdapter", "(Lvi3;)V", "adapter", "LE3;", "l", "LE3;", "binding", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "m", "Lio/reactivex/subjects/d;", "scanCompletedSubject", "Lio/reactivex/subjects/a;", "n", "Lio/reactivex/subjects/a;", "confirmClickedSubject", "Lma4;", "o", "Lma4;", "closeIncompleteRelay", "Lvy3;", "p", "Lvy3;", "dialog", "Lio/reactivex/Observable;", "q", "Lkotlin/Lazy;", "Y5", "()Lio/reactivex/Observable;", "scanClicks", "r", "l4", "scanCompleted", "s", "g7", "confirmClicks", "t", "A7", "closeIncompleteClicks", "u", "Lio/reactivex/Observable;", "Q5", "closeIncomplete", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorAllocationDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorAllocationDetailsActivity.kt\nco/bird/android/feature/transferorder/operatorallocationdetails/OperatorAllocationDetailsActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,125:1\n180#2:126\n199#2:127\n*S KotlinDebug\n*F\n+ 1 OperatorAllocationDetailsActivity.kt\nco/bird/android/feature/transferorder/operatorallocationdetails/OperatorAllocationDetailsActivity\n*L\n91#1:126\n104#1:127\n*E\n"})
/* loaded from: classes3.dex */
public final class OperatorAllocationDetailsActivity extends BaseActivityLite implements InterfaceC38717bj3 {

    /* renamed from: j */
    public C37304Yi3 f65705j;

    /* renamed from: k */
    public C50582vi3 f65706k;

    /* renamed from: l */
    public C1726E3 f65707l;

    /* renamed from: m */
    public final C24558d<Boolean> f65708m;

    /* renamed from: n */
    public final C24552a<Unit> f65709n;

    /* renamed from: o */
    public final C45168ma4<String> f65710o;

    /* renamed from: p */
    public C50742vy3 f65711p;

    /* renamed from: q */
    public final Lazy f65712q;

    /* renamed from: r */
    public final Lazy f65713r;

    /* renamed from: s */
    public final Lazy f65714s;

    /* renamed from: t */
    public final Lazy f65715t;

    /* renamed from: u */
    public final Observable<String> f65716u;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.transferorder.operatorallocationdetails.OperatorAllocationDetailsActivity$a */
    /* loaded from: classes3.dex */
    public static final class C15805a extends Lambda implements Function0<Observable<Unit>> {
        public C15805a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            C1726E3 c1726e3 = OperatorAllocationDetailsActivity.this.f65707l;
            if (c1726e3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c1726e3 = null;
            }
            Button button = c1726e3.f6894d;
            Intrinsics.checkNotNullExpressionValue(button, "binding.closeIncomplete");
            return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/subjects/a;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/subjects/a;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.transferorder.operatorallocationdetails.OperatorAllocationDetailsActivity$b */
    /* loaded from: classes3.dex */
    public static final class C15806b extends Lambda implements Function0<C24552a<Unit>> {
        public C15806b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C24552a<Unit> invoke() {
            return OperatorAllocationDetailsActivity.this.f65709n;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", "reason", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.transferorder.operatorallocationdetails.OperatorAllocationDetailsActivity$c */
    /* loaded from: classes3.dex */
    public static final class C15807c extends Lambda implements Function1<WireTransferOrderClosedIncompleteReason, String> {

        /* renamed from: g */
        public static final C15807c f65719g = new C15807c();

        public C15807c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(WireTransferOrderClosedIncompleteReason reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return reason.getCode();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.transferorder.operatorallocationdetails.OperatorAllocationDetailsActivity$d */
    /* loaded from: classes3.dex */
    public static final class C15808d extends Lambda implements Function0<Observable<Unit>> {
        public C15808d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            C1726E3 c1726e3 = OperatorAllocationDetailsActivity.this.f65707l;
            if (c1726e3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c1726e3 = null;
            }
            Button button = c1726e3.f6892b;
            Intrinsics.checkNotNullExpressionValue(button, "binding.begin");
            return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.transferorder.operatorallocationdetails.OperatorAllocationDetailsActivity$e */
    /* loaded from: classes3.dex */
    public static final class C15809e extends Lambda implements Function0<Observable<Boolean>> {
        public C15809e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Boolean> invoke() {
            return OperatorAllocationDetailsActivity.this.f65708m.hide();
        }
    }

    public OperatorAllocationDetailsActivity() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        C24558d<Boolean> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Boolean>()");
        this.f65708m = m31902e;
        C24552a<Unit> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Unit>()");
        this.f65709n = m31922e;
        C45168ma4<String> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<String>()");
        this.f65710o = m25409g;
        lazy = LazyKt__LazyJVMKt.lazy(new C15808d());
        this.f65712q = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C15809e());
        this.f65713r = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C15806b());
        this.f65714s = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new C15805a());
        this.f65715t = lazy4;
        this.f65716u = m25409g;
    }

    /* renamed from: X */
    public static final String m56515X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC38717bj3
    /* renamed from: A7 */
    public Observable<Unit> mo56522A7() {
        return (Observable) this.f65715t.getValue();
    }

    /* renamed from: Q */
    public final String m56520Q(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                return m58990F().getString(C45871nl4.transfer_orders_continue_return_uppercased, new Object[0]);
            }
            return m58990F().getString(C45871nl4.transfer_orders_begin_return_uppercased, new Object[0]);
        } else if (z2) {
            return m58990F().getString(C45871nl4.transfer_orders_continue_checkout_uppercased, new Object[0]);
        } else {
            return m58990F().getString(C45871nl4.transfer_orders_begin_checkout_uppercased, new Object[0]);
        }
    }

    @Override // p000.InterfaceC38717bj3
    /* renamed from: Q5 */
    public Observable<String> mo56519Q5() {
        return this.f65716u;
    }

    /* renamed from: R */
    public final C50582vi3 m56518R() {
        C50582vi3 c50582vi3 = this.f65706k;
        if (c50582vi3 != null) {
            return c50582vi3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    /* renamed from: S */
    public final C37304Yi3 m56517S() {
        C37304Yi3 c37304Yi3 = this.f65705j;
        if (c37304Yi3 != null) {
            return c37304Yi3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: U */
    public void render(AbstractC48340rv1 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        C1726E3 c1726e3 = null;
        C1726E3 c1726e32 = null;
        C1726E3 c1726e33 = null;
        C1726E3 c1726e34 = null;
        C50742vy3 c50742vy3 = null;
        C50742vy3 c50742vy32 = null;
        if (state instanceof C52470yt2) {
            S74.C7343a.showProgress$default(m58990F(), ((C52470yt2) state).m2332b(), 0, 2, null);
        } else if (state instanceof C35785Rv5) {
            m56518R().mo24871u(((C35785Rv5) state).m86197b());
        } else if (state instanceof C37225Xz5) {
            C1726E3 c1726e35 = this.f65707l;
            if (c1726e35 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c1726e35 = null;
            }
            c1726e35.f6892b.setText(m56520Q(((C37225Xz5) state).m75924b(), false));
            C1726E3 c1726e36 = this.f65707l;
            if (c1726e36 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c1726e32 = c1726e36;
            }
            c1726e32.f6892b.setEnabled(true);
        } else if (state instanceof C39599dA5) {
            C1726E3 c1726e37 = this.f65707l;
            if (c1726e37 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c1726e37 = null;
            }
            c1726e37.f6892b.setText(m56520Q(((C39599dA5) state).m44552b(), true));
            C1726E3 c1726e38 = this.f65707l;
            if (c1726e38 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c1726e33 = c1726e38;
            }
            c1726e33.f6892b.setEnabled(true);
        } else if (state instanceof KM1) {
            C1726E3 c1726e39 = this.f65707l;
            if (c1726e39 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c1726e34 = c1726e39;
            }
            c1726e34.f6892b.setEnabled(false);
        } else if (state instanceof C49678uA5) {
            C49678uA5 c49678uA5 = (C49678uA5) state;
            C50742vy3 m7680a = C50742vy3.f115021e.m7680a(c49678uA5.m10706d(), c49678uA5.m10707c(), c49678uA5.m10708b());
            this.f65711p = m7680a;
            if (m7680a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                m7680a = null;
            }
            m7680a.show(getSupportFragmentManager(), "OrderCompleteBottomSheet");
            C50742vy3 c50742vy33 = this.f65711p;
            if (c50742vy33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
            } else {
                c50742vy3 = c50742vy33;
            }
            Object m33094as = c50742vy3.m7681g7().m33094as(AutoDispose.m45239a(this));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((ObservableSubscribeProxy) m33094as).subscribe(this.f65709n);
        } else if (state instanceof C51335wy3) {
            C50742vy3 c50742vy34 = this.f65711p;
            if (c50742vy34 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
            } else {
                c50742vy32 = c50742vy34;
            }
            c50742vy32.dismiss();
        } else if (state instanceof C48932sv1) {
            m58990F().error(((C48932sv1) state).m13389b());
        } else if (state instanceof C45992nx5) {
            C1726E3 c1726e310 = this.f65707l;
            if (c1726e310 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c1726e310 = null;
            }
            Button button = c1726e310.f6894d;
            Intrinsics.checkNotNullExpressionValue(button, "binding.closeIncomplete");
            C45992nx5 c45992nx5 = (C45992nx5) state;
            C49520tu6.show$default(button, c45992nx5.m22135c(), 0, 2, null);
            C1726E3 c1726e311 = this.f65707l;
            if (c1726e311 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c1726e3 = c1726e311;
            }
            c1726e3.f6894d.setEnabled(c45992nx5.m22136b());
        } else if (state instanceof C49156tI4) {
            C47646ql0 m17149a = C47646ql0.f105721e.m17149a(((C49156tI4) state).m12521b());
            m17149a.show(getSupportFragmentManager(), "CloseIncompleteBottomSheet");
            AbstractC23442F<WireTransferOrderClosedIncompleteReason> m17153T9 = m17149a.m17153T9();
            final C15807c c15807c = C15807c.f65719g;
            AbstractC23442F<R> m33157I = m17153T9.m33157I(new InterfaceC23492o() { // from class: ti3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    String m56515X;
                    m56515X = OperatorAllocationDetailsActivity.m56515X(Function1.this, obj);
                    return m56515X;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33157I, "dialog.selectedReason()\n…{ reason -> reason.code }");
            Object m33135e = m33157I.m33135e(AutoDispose.m45239a(this));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((SingleSubscribeProxy) m33135e).subscribe(this.f65710o);
        }
    }

    @Override // p000.InterfaceC38717bj3
    /* renamed from: Y5 */
    public Observable<Unit> mo56514Y5() {
        return (Observable) this.f65712q.getValue();
    }

    @Override // p000.InterfaceC38717bj3
    /* renamed from: g7 */
    public Observable<Unit> mo56513g7() {
        return (Observable) this.f65714s.getValue();
    }

    @Override // p000.InterfaceC38717bj3
    /* renamed from: l4 */
    public Observable<Boolean> mo56512l4() {
        Object value = this.f65713r.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-scanCompleted>(...)");
        return (Observable) value;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        super.onActivityResult(i, i2, intent);
        if (i == 10050 || i == 10051) {
            C24558d<Boolean> c24558d = this.f65708m;
            if (i2 == -1) {
                z = true;
            } else {
                z = false;
            }
            c24558d.onNext(Boolean.valueOf(z));
        }
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1726E3 m109473c = C1726E3.m109473c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m109473c, "inflate(layoutInflater)");
        this.f65707l = m109473c;
        C1726E3 c1726e3 = null;
        if (m109473c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m109473c = null;
        }
        setContentView(m109473c.getRoot());
        InterfaceC15813b.InterfaceC15814a m56506a = C15810a.m56506a();
        InterfaceC44393lG2 m58989H = m58989H();
        BaseActivityLite.InterfaceC14454a m58991E = m58991E();
        String stringExtra = getIntent().getStringExtra("sku_order_id");
        Intrinsics.checkNotNull(stringExtra);
        m56506a.mo56501a(m58989H, m58991E, stringExtra).mo56502a(this);
        C1726E3 c1726e32 = this.f65707l;
        if (c1726e32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c1726e3 = c1726e32;
        }
        RecyclerView recyclerView = c1726e3.f6896f;
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(m56518R());
        m56517S().consume(this);
    }
}
