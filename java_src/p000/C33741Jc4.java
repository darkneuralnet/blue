package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0012"}, m28432d2 = {"LJc4;", "LrE;", "LGc4;", "", "vehicleCode", "", "passedQc", "Lio/reactivex/F;", "", "LH6;", "h", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "b", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Jc4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33741Jc4 extends AbstractC27883rE implements InterfaceC33039Gc4 {

    /* renamed from: b */
    public static final C4167a f17902b = new C4167a(null);

    /* renamed from: a */
    public final Context f17903a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LJc4$a;", "", "", "failed", "Ljava/lang/String;", "passed", "<init>", "()V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Jc4$a */
    /* loaded from: classes4.dex */
    public static final class C4167a {
        public /* synthetic */ C4167a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4167a() {
        }
    }

    public C33741Jc4(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17903a = context;
    }

    /* renamed from: o */
    public static final List m100113o(C33741Jc4 this$0, String vehicleCode) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(vehicleCode, "$vehicleCode");
        int i = C48193rg4.ic_filled_issue_triangle;
        String string = this$0.f17903a.getString(C45871nl4.quality_control_fail_dialog_message, vehicleCode);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…log_message, vehicleCode)");
        return this$0.m16197k(new DQ5(i, string));
    }

    /* renamed from: p */
    public static final List m100112p(C33741Jc4 this$0, String statusName, String vehicleCode) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(statusName, "$statusName");
        Intrinsics.checkNotNullParameter(vehicleCode, "$vehicleCode");
        int i = C48193rg4.ic_filled_check_circle;
        String string = this$0.f17903a.getString(C45871nl4.quality_control_success_dialog_message, statusName, vehicleCode);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri… statusName, vehicleCode)");
        String spannableString = C45097mS5.span$default(string, statusName, null, 2, null).toString();
        Intrinsics.checkNotNullExpressionValue(spannableString, "context.getString(L.stri…an(statusName).toString()");
        return this$0.m16197k(new DQ5(i, spannableString));
    }

    @Override // p000.InterfaceC33039Gc4
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo100117a(final String vehicleCode) {
        Intrinsics.checkNotNullParameter(vehicleCode, "vehicleCode");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: Ic4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m100113o;
                m100113o = C33741Jc4.m100113o(C33741Jc4.this, vehicleCode);
                return m100113o;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      cre…Schedulers.computation())");
        return m33142Y;
    }

    @Override // p000.InterfaceC33039Gc4
    /* renamed from: h */
    public AbstractC23442F<List<C3023H6>> mo100116h(final String vehicleCode, boolean z) {
        final String str;
        Intrinsics.checkNotNullParameter(vehicleCode, "vehicleCode");
        if (z) {
            str = "PASSED";
        } else {
            str = "FAILED";
        }
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: Hc4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m100112p;
                m100112p = C33741Jc4.m100112p(C33741Jc4.this, str, vehicleCode);
                return m100112p;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      cre…Schedulers.computation())");
        return m33142Y;
    }
}
