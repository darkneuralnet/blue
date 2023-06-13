package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C1577Df;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a4\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¨\u0006\u0007"}, m28432d2 = {"", "LDf$b;", "LTU3;", "", "start", "end", "b", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsicsKt\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,152:1\n35#2,3:153\n38#2,2:160\n40#2:163\n33#3,4:156\n38#3:162\n151#3,5:164\n38#3:169\n156#3:170\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsicsKt\n*L\n141#1:153,3\n141#1:160,2\n141#1:163\n141#1:156,4\n141#1:162\n141#1:164,5\n141#1:169\n141#1:170\n*E\n"})
/* renamed from: TW2 */
/* loaded from: classes.dex */
public final class TW2 {
    /* renamed from: b */
    public static final List<C1577Df.C1580b<TU3>> m83489b(List<C1577Df.C1580b<TU3>> list, int i, int i2) {
        boolean z;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1577Df.C1580b<TU3> c1580b = list.get(i3);
            C1577Df.C1580b<TU3> c1580b2 = c1580b;
            if (C1921Ef.m108601l(i, i2, c1580b2.m110027f(), c1580b2.m110029d())) {
                arrayList.add(c1580b);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C1577Df.C1580b c1580b3 = (C1577Df.C1580b) arrayList.get(i4);
            if (i <= c1580b3.m110027f() && c1580b3.m110029d() <= i2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList2.add(new C1577Df.C1580b(c1580b3.m110028e(), c1580b3.m110027f() - i, c1580b3.m110029d() - i));
            } else {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
            }
        }
        return arrayList2;
    }
}
