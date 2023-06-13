package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\nJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\fJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u000eJ\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\nH\u0002¨\u0006\u001a"}, m28432d2 = {"LPm;", "LtA;", "Lgo;", "areaModel", "", "LH6;", "r", "LMn;", RequestHeadersFactory.MODEL, "u", "Le01;", "s", "LOj6;", "v", "Lds4;", "t", "bottomSheetModel", "y", "A", "w", "z", "x", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.operator.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Pm */
/* loaded from: classes3.dex */
public final class C6487Pm extends AbstractC28540tA {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6487Pm(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: A */
    public final C3023H6 m89808A(C34976Oj6 c34976Oj6) {
        Long l;
        List mutableListOf;
        C2637G6[] c2637g6Arr = new C2637G6[1];
        String m91606c = c34976Oj6.m91606c();
        Integer m91604e = c34976Oj6.m91604e();
        int m91605d = c34976Oj6.m91605d();
        String m91607b = c34976Oj6.m91607b();
        String m91603f = c34976Oj6.m91603f();
        if (m91603f != null) {
            l = StringsKt__StringNumberConversionsKt.toLongOrNull(m91603f);
        } else {
            l = null;
        }
        c2637g6Arr[0] = new C2637G6(new C38346b56(m91604e, m91606c, m91605d, m91607b, l), C32409Dk4.item_title_message, false, 4, null);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(c2637g6Arr);
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: r */
    public final List<C3023H6> m89807r(C22473go areaModel) {
        List<C3023H6> listOfNotNull;
        Intrinsics.checkNotNullParameter(areaModel, "areaModel");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(m89802w(areaModel));
        return listOfNotNull;
    }

    /* renamed from: s */
    public final List<C3023H6> m89806s(C40087e01 model) {
        List<C3023H6> listOfNotNull;
        Intrinsics.checkNotNullParameter(model, "model");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(m89801x(model));
        return listOfNotNull;
    }

    /* renamed from: t */
    public final List<C3023H6> m89805t(C40011ds4 model) {
        List<C3023H6> listOfNotNull;
        Intrinsics.checkNotNullParameter(model, "model");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(m89800y(model));
        return listOfNotNull;
    }

    /* renamed from: u */
    public final List<C3023H6> m89804u(C5374Mn model) {
        List<C3023H6> listOfNotNull;
        Intrinsics.checkNotNullParameter(model, "model");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(m89799z(model));
        return listOfNotNull;
    }

    /* renamed from: v */
    public final List<C3023H6> m89803v(C34976Oj6 model) {
        List<C3023H6> listOfNotNull;
        Intrinsics.checkNotNullParameter(model, "model");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(m89808A(model));
        return listOfNotNull;
    }

    /* renamed from: w */
    public final C3023H6 m89802w(C22473go c22473go) {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new C52911ze0(c22473go.m37465k(m12962m()), c22473go.m37474b(), c22473go.m37473c(), c22473go.m37472d(), c22473go.m37470f(), c22473go.m37469g(), c22473go.m37468h(), c22473go.m37467i(), c22473go.m37471e(), c22473go.m37466j()), C32409Dk4.item_cap_restriction, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: x */
    public final C3023H6 m89801x(C40087e01 c40087e01) {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new C40680f01(c40087e01.m43409c(), c40087e01.m43410b()), C32409Dk4.item_demand_area, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: y */
    public final C3023H6 m89800y(C40011ds4 c40011ds4) {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new C38346b56(c40011ds4.m43570e(), c40011ds4.m43572c(), c40011ds4.m43571d(), c40011ds4.m43573b(), null, 16, null), C32409Dk4.item_title_message, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: z */
    public final C3023H6 m89799z(C5374Mn c5374Mn) {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(c5374Mn.m94841b(), C32409Dk4.item_refresh, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }
}
