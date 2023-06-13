package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bç\u0080\u0001\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0011\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016J\"\u0010\u0012\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0013\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, m28432d2 = {"LxO2;", "", "LzO2;", "", "LvO2;", "measurables", "Lkz0;", "constraints", "LyO2;", C17296a.f69688o, "(LzO2;Ljava/util/List;J)LyO2;", "LZ62;", "LX62;", "", "height", "c", "width", "e", "b", DateTokenConverter.CONVERTER_KEY, "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,163:1\n151#2,3:164\n33#2,4:167\n154#2,2:171\n38#2:173\n156#2:174\n151#2,3:175\n33#2,4:178\n154#2,2:182\n38#2:184\n156#2:185\n151#2,3:186\n33#2,4:189\n154#2,2:193\n38#2:195\n156#2:196\n151#2,3:197\n33#2,4:200\n154#2,2:204\n38#2:206\n156#2:207\n*S KotlinDebug\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n*L\n102#1:164,3\n102#1:167,4\n102#1:171,2\n102#1:173\n102#1:174\n120#1:175,3\n120#1:178,4\n120#1:182,2\n120#1:184\n120#1:185\n137#1:186,3\n137#1:189,4\n137#1:193,2\n137#1:195\n137#1:196\n154#1:197,3\n154#1:200,4\n154#1:204,2\n154#1:206\n154#1:207\n*E\n"})
/* renamed from: xO2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC51579xO2 {
    /* renamed from: a */
    InterfaceC52172yO2 mo3160a(InterfaceC52765zO2 interfaceC52765zO2, List<? extends InterfaceC50393vO2> list, long j);

    /* renamed from: b */
    default int mo5313b(Z62 z62, List<? extends X62> measurables, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new PX0(measurables.get(i2), EnumC37769a72.Max, EnumC39566d72.Width));
        }
        return mo3160a(new C40158e72(z62, z62.getLayoutDirection()), arrayList, C46007nz0.m22042b(0, 0, 0, i, 7, null)).getWidth();
    }

    /* renamed from: c */
    default int mo5312c(Z62 z62, List<? extends X62> measurables, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new PX0(measurables.get(i2), EnumC37769a72.Min, EnumC39566d72.Width));
        }
        return mo3160a(new C40158e72(z62, z62.getLayoutDirection()), arrayList, C46007nz0.m22042b(0, 0, 0, i, 7, null)).getWidth();
    }

    /* renamed from: d */
    default int mo5311d(Z62 z62, List<? extends X62> measurables, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new PX0(measurables.get(i2), EnumC37769a72.Max, EnumC39566d72.Height));
        }
        return mo3160a(new C40158e72(z62, z62.getLayoutDirection()), arrayList, C46007nz0.m22042b(0, i, 0, 0, 13, null)).getHeight();
    }

    /* renamed from: e */
    default int mo5310e(Z62 z62, List<? extends X62> measurables, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new PX0(measurables.get(i2), EnumC37769a72.Min, EnumC39566d72.Height));
        }
        return mo3160a(new C40158e72(z62, z62.getLayoutDirection()), arrayList, C46007nz0.m22042b(0, i, 0, 0, 13, null)).getHeight();
    }
}
