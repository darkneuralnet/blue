package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0011"}, m28432d2 = {"LG82;", "LrE;", "LD82;", "", "itemName", "", "count", "Lio/reactivex/F;", "", "LH6;", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: G82 */
/* loaded from: classes3.dex */
public final class G82 extends AbstractC27883rE implements D82 {

    /* renamed from: a */
    public final Context f11041a;

    public G82(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f11041a = context;
    }

    /* renamed from: o */
    public static final List m105713o(G82 this$0, String itemNameFormatted) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(itemNameFormatted, "$itemNameFormatted");
        int i = C48193rg4.ic_filled_issue_triangle;
        String string = this$0.f11041a.getString(C45871nl4.inventory_bins_failed_update_status, itemNameFormatted);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…tatus, itemNameFormatted)");
        return this$0.m16197k(new DQ5(i, string));
    }

    /* renamed from: p */
    public static final List m105712p(G82 this$0, String itemNameFormatted, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(itemNameFormatted, "$itemNameFormatted");
        int i2 = C48193rg4.ic_filled_check_circle;
        String string = this$0.f11041a.getString(C45871nl4.inventory_bins_successful_update_status, itemNameFormatted, Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…itemNameFormatted, count)");
        return this$0.m16197k(new DQ5(i2, string));
    }

    @Override // p000.D82
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo105717a(String itemName) {
        final String replace$default;
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        replace$default = StringsKt__StringsJVMKt.replace$default(itemName, "_", " ", false, 4, (Object) null);
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: F82
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m105713o;
                m105713o = G82.m105713o(G82.this, replace$default);
                return m105713o;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      cre…Schedulers.computation())");
        return m33142Y;
    }

    @Override // p000.D82
    /* renamed from: d */
    public AbstractC23442F<List<C3023H6>> mo105716d(String itemName, final int i) {
        final String replace$default;
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        replace$default = StringsKt__StringsJVMKt.replace$default(itemName, "_", " ", false, 4, (Object) null);
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: E82
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m105712p;
                m105712p = G82.m105712p(G82.this, replace$default, i);
                return m105712p;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      cre…Schedulers.computation())");
        return m33142Y;
    }
}
