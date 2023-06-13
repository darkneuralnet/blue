package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.wire.WireServiceCenterStatus;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J$\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LZu5;", "LrE;", "LVu5;", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "status", "Lio/reactivex/F;", "", "LH6;", "j", "", "e", "i", "", "birdCode", "", "minHibernateBattery", "g", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Zu5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37648Zu5 extends AbstractC27883rE implements InterfaceC36712Vu5 {

    /* renamed from: a */
    public final Context f49464a;

    public C37648Zu5(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49464a = context;
    }

    /* renamed from: p */
    public static final List m72317p(C37648Zu5 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = C48193rg4.ic_filled_issue_triangle;
        String string = this$0.f49464a.getString(C45871nl4.service_center_status_failure_message);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…r_status_failure_message)");
        return this$0.m16197k(new DQ5(i, string));
    }

    /* renamed from: q */
    public static final List m72316q(C37648Zu5 this$0, String birdCode, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(birdCode, "$birdCode");
        int i2 = C48193rg4.ic_filled_issue_triangle;
        String string = this$0.f49464a.getString(C45871nl4.service_center_status_hibernate_failure_message_format, birdCode, Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…ode, minHibernateBattery)");
        return this$0.m16197k(new DQ5(i2, string));
    }

    /* renamed from: r */
    public static final List m72315r(C37648Zu5 this$0, WireServiceCenterStatus status) {
        List mutableListOf;
        List listOf;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(status, "$status");
        String string = this$0.f49464a.getString(C45871nl4.service_center_status_success_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…ter_status_success_title)");
        C2637G6 m16196l = this$0.m16196l(new DQ5(C48193rg4.ic_filled_check_circle, string));
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(status, C44082kk4.item_status_message, false, 4, null));
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableListOf, m16196l, null, 4, null));
        return listOf;
    }

    @Override // p000.InterfaceC36712Vu5
    /* renamed from: g */
    public AbstractC23442F<List<C3023H6>> mo72323g(final String birdCode, final int i) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: Xu5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m72316q;
                m72316q = C37648Zu5.m72316q(C37648Zu5.this, birdCode, i);
                return m72316q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      val…er(headerViewModel)\n    }");
        return m33161E;
    }

    @Override // p000.InterfaceC36712Vu5
    /* renamed from: i */
    public AbstractC23442F<List<C3023H6>> mo72322i(Throwable th) {
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: Yu5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m72317p;
                m72317p = C37648Zu5.m72317p(C37648Zu5.this);
                return m72317p;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      val…er(headerViewModel)\n    }");
        return m33161E;
    }

    @Override // p000.InterfaceC36712Vu5
    /* renamed from: j */
    public AbstractC23442F<List<C3023H6>> mo72321j(final WireServiceCenterStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: Wu5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m72315r;
                m72315r = C37648Zu5.m72315r(C37648Zu5.this, status);
                return m72315r;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      val…Item), headerItem))\n    }");
        return m33161E;
    }
}
