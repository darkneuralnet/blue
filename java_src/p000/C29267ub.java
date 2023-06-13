package p000;

import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u001a\u0010\b\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¨\u0006\t"}, m28432d2 = {"Lrb;", "Landroid/view/ViewStructure;", "root", "", "b", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", C17296a.f69688o, "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidAutofill.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n151#2,3:231\n33#2,4:234\n154#2,2:238\n38#2:240\n156#2:241\n37#3,2:242\n*S KotlinDebug\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n*L\n96#1:231,3\n96#1:234,4\n96#1:238,2\n96#1:240\n96#1:241\n96#1:242,2\n*E\n"})
/* renamed from: ub */
/* loaded from: classes.dex */
public final class C29267ub {
    /* renamed from: a */
    public static final void m10006a(C27951rb c27951rb, SparseArray<AutofillValue> values) {
        Intrinsics.checkNotNullParameter(c27951rb, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        int size = values.size();
        for (int i = 0; i < size; i++) {
            int keyAt = values.keyAt(i);
            AutofillValue value = C28791tb.m12028a(values.get(keyAt));
            C4612Ku c4612Ku = C4612Ku.f20330a;
            Intrinsics.checkNotNullExpressionValue(value, "value");
            if (c4612Ku.m98191d(value)) {
                c27951rb.m15728d().m87645b(keyAt, c4612Ku.m98186i(value).toString());
            } else if (!c4612Ku.m98193b(value)) {
                if (!c4612Ku.m98192c(value)) {
                    if (c4612Ku.m98190e(value)) {
                        throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                } else {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
            } else {
                throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
            }
        }
    }

    /* renamed from: b */
    public static final void m10005b(C27951rb c27951rb, ViewStructure root) {
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        int roundToInt4;
        Intrinsics.checkNotNullParameter(c27951rb, "<this>");
        Intrinsics.checkNotNullParameter(root, "root");
        int m114971a = C0299Au.f1322a.m114971a(root, c27951rb.m15728d().m87646a().size());
        for (Map.Entry<Integer, C6560Pu> entry : c27951rb.m15728d().m87646a().entrySet()) {
            int intValue = entry.getKey().intValue();
            C6560Pu value = entry.getValue();
            C0299Au c0299Au = C0299Au.f1322a;
            ViewStructure m114970b = c0299Au.m114970b(root, m114971a);
            if (m114970b != null) {
                C4612Ku c4612Ku = C4612Ku.f20330a;
                AutofillId m98194a = c4612Ku.m98194a(root);
                Intrinsics.checkNotNull(m98194a);
                c4612Ku.m98188g(m114970b, m98194a, intValue);
                c0299Au.m114968d(m114970b, intValue, c27951rb.m15727e().getContext().getPackageName(), null, null);
                c4612Ku.m98187h(m114970b, 1);
                List<EnumC7283Ru> m89457c = value.m89457c();
                ArrayList arrayList = new ArrayList(m89457c.size());
                int size = m89457c.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(C28357sb.m13972a(m89457c.get(i)));
                }
                c4612Ku.m98189f(m114970b, (String[]) arrayList.toArray(new String[0]));
                C35055Os4 m89456d = value.m89456d();
                if (m89456d != null) {
                    roundToInt = MathKt__MathJVMKt.roundToInt(m89456d.m91258i());
                    roundToInt2 = MathKt__MathJVMKt.roundToInt(m89456d.m91255l());
                    roundToInt3 = MathKt__MathJVMKt.roundToInt(m89456d.m91257j());
                    roundToInt4 = MathKt__MathJVMKt.roundToInt(m89456d.m91262e());
                    C0299Au.f1322a.m114969c(m114970b, roundToInt, roundToInt2, 0, 0, roundToInt3 - roundToInt, roundToInt4 - roundToInt2);
                } else {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                }
            }
            m114971a++;
        }
    }
}
