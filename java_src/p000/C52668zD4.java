package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001e\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LzD4;", "LrE;", "LwD4;", "", "birdCode", "", "repairCount", "Lio/reactivex/F;", "", "LH6;", DateTokenConverter.CONVERTER_KEY, "errorMsg", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: zD4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52668zD4 extends AbstractC27883rE implements InterfaceC50889wD4 {

    /* renamed from: a */
    public final Context f120988a;

    public C52668zD4(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f120988a = context;
    }

    /* renamed from: o */
    public static final List m1625o(C52668zD4 this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = C48193rg4.ic_filled_issue_triangle;
        if (str == null) {
            str = this$0.f120988a.getString(C45871nl4.work_order_repairs_error_status);
            Intrinsics.checkNotNullExpressionValue(str, "context.getString(L.stri…der_repairs_error_status)");
        }
        return this$0.m16197k(new DQ5(i, str));
    }

    /* renamed from: p */
    public static final List m1624p(C52668zD4 this$0, int i, String birdCode) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(birdCode, "$birdCode");
        int i2 = C48193rg4.ic_filled_check_circle;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = this$0.f120988a.getString(C45871nl4.work_order_repairs_success_status);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…r_repairs_success_status)");
        String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i), birdCode}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return this$0.m16197k(new DQ5(i2, format));
    }

    @Override // p000.InterfaceC50889wD4
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo1629a(final String str) {
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: yD4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m1625o;
                m1625o = C52668zD4.m1625o(C52668zD4.this, str);
                return m1625o;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      cre…Schedulers.computation())");
        return m33142Y;
    }

    @Override // p000.InterfaceC50889wD4
    /* renamed from: d */
    public AbstractC23442F<List<C3023H6>> mo1628d(final String birdCode, final int i) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: xD4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m1624p;
                m1624p = C52668zD4.m1624p(C52668zD4.this, i, birdCode);
                return m1624p;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      cre…Schedulers.computation())");
        return m33142Y;
    }
}
