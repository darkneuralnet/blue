package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LuD4;", "LrE;", "LrD4;", "", "itemsLogged", "", "birdCode", "Lio/reactivex/F;", "", "LH6;", "e", "f", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uD4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49704uD4 extends AbstractC27883rE implements InterfaceC47926rD4 {

    /* renamed from: a */
    public final Context f111974a;

    public C49704uD4(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f111974a = context;
    }

    /* renamed from: o */
    public static final List m10593o(C49704uD4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = C48193rg4.ic_filled_issue_triangle;
        String string = this$0.f111974a.getString(C45871nl4.repair_logger_toast_failure_message);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…er_toast_failure_message)");
        return this$0.m16197k(new DQ5(i, string));
    }

    /* renamed from: p */
    public static final List m10592p(C49704uD4 this$0, int i, String birdCode) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(birdCode, "$birdCode");
        int i2 = C48193rg4.ic_filled_check_circle;
        String string = this$0.f111974a.getString(C45871nl4.repair_logger_toast_success_message, Integer.valueOf(i), birdCode);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…e, itemsLogged, birdCode)");
        return this$0.m16197k(new DQ5(i2, string));
    }

    @Override // p000.InterfaceC47926rD4
    /* renamed from: e */
    public AbstractC23442F<List<C3023H6>> mo10597e(final int i, final String birdCode) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: tD4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m10592p;
                m10592p = C49704uD4.m10592p(C49704uD4.this, i, birdCode);
                return m10592p;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      val…eader(statusHeader)\n    }");
        return m33161E;
    }

    @Override // p000.InterfaceC47926rD4
    /* renamed from: f */
    public AbstractC23442F<List<C3023H6>> mo10596f() {
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: sD4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m10593o;
                m10593o = C49704uD4.m10593o(C49704uD4.this);
                return m10593o;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      val…eader(statusHeader)\n    }");
        return m33161E;
    }
}
