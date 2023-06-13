package p000;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aO\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001ø\u0001\u0001\u001a!\u0010\u0012\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0010\u001a\u00020\u000eH\u0001ø\u0001\u0001\u001a3\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0010\u001a\u00020\u000eH\u0001ø\u0001\u0001\u001a)\u0010\u0017\u001a\u00020\u00162\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0002ø\u0001\u0001*\n\u0010\u0018\"\u00020\n2\u00020\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, m28432d2 = {"LCe3;", "from", "to", "", "Lpm0;", "colors", "", "colorStops", "Lc46;", "tileMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", C17296a.f69688o, "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "", "b", "numTransparentColors", "", "c", "stops", "", DateTokenConverter.CONVERTER_KEY, "", "e", "Shader", "ui-graphics_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidShader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,205:1\n69#2,6:206\n*S KotlinDebug\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n*L\n141#1:206,6\n*E\n"})
/* renamed from: Md */
/* loaded from: classes.dex */
public final class C5321Md {
    /* renamed from: a */
    public static final Shader m95114a(long j, long j2, List<C47063pm0> colors, List<Float> list, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        m95110e(colors, list);
        int m95113b = m95113b(colors);
        return new LinearGradient(C32120Ce3.m111944o(j), C32120Ce3.m111943p(j), C32120Ce3.m111944o(j2), C32120Ce3.m111943p(j2), m95112c(colors, m95113b), m95111d(list, colors, m95113b), C8337Ud.m81226a(i));
    }

    /* renamed from: b */
    public static final int m95113b(List<C47063pm0> colors) {
        int lastIndex;
        boolean z;
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(colors);
        int i = 0;
        for (int i2 = 1; i2 < lastIndex; i2++) {
            if (C47063pm0.m18740p(colors.get(i2).m18733w()) == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static final int[] m95112c(List<C47063pm0> colors, int i) {
        int lastIndex;
        boolean z;
        int i2;
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (Build.VERSION.SDK_INT >= 26) {
            int size = colors.size();
            int[] iArr = new int[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = C50619vm0.m8173h(colors.get(i3).m18733w());
            }
            return iArr;
        }
        int[] iArr2 = new int[colors.size() + i];
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(colors);
        int size2 = colors.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            long m18733w = colors.get(i5).m18733w();
            if (C47063pm0.m18740p(m18733w) == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i5 == 0) {
                    i2 = i4 + 1;
                    iArr2[i4] = C50619vm0.m8173h(C47063pm0.m18743m(colors.get(1).m18733w(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i5 == lastIndex) {
                    i2 = i4 + 1;
                    iArr2[i4] = C50619vm0.m8173h(C47063pm0.m18743m(colors.get(i5 - 1).m18733w(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i6 = i4 + 1;
                    iArr2[i4] = C50619vm0.m8173h(C47063pm0.m18743m(colors.get(i5 - 1).m18733w(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i4 = i6 + 1;
                    iArr2[i6] = C50619vm0.m8173h(C47063pm0.m18743m(colors.get(i5 + 1).m18733w(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i4 = i2;
            } else {
                iArr2[i4] = C50619vm0.m8173h(m18733w);
                i4++;
            }
        }
        return iArr2;
    }

    /* renamed from: d */
    public static final float[] m95111d(List<Float> list, List<C47063pm0> colors, int i) {
        float f;
        int lastIndex;
        float f2;
        int lastIndex2;
        int lastIndex3;
        float f3;
        boolean z;
        float[] floatArray;
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (i == 0) {
            if (list != null) {
                floatArray = CollectionsKt___CollectionsKt.toFloatArray(list);
                return floatArray;
            }
            return null;
        }
        float[] fArr = new float[colors.size() + i];
        if (list != null) {
            f = list.get(0).floatValue();
        } else {
            f = 0.0f;
        }
        fArr[0] = f;
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(colors);
        int i2 = 1;
        for (int i3 = 1; i3 < lastIndex; i3++) {
            long m18733w = colors.get(i3).m18733w();
            if (list != null) {
                f3 = list.get(i3).floatValue();
            } else {
                lastIndex3 = CollectionsKt__CollectionsKt.getLastIndex(colors);
                f3 = i3 / lastIndex3;
            }
            int i4 = i2 + 1;
            fArr[i2] = f3;
            if (C47063pm0.m18740p(m18733w) == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i2 = i4 + 1;
                fArr[i4] = f3;
            } else {
                i2 = i4;
            }
        }
        if (list != null) {
            lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(colors);
            f2 = list.get(lastIndex2).floatValue();
        } else {
            f2 = 1.0f;
        }
        fArr[i2] = f2;
        return fArr;
    }

    /* renamed from: e */
    public static final void m95110e(List<C47063pm0> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() == list2.size()) {
        } else {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
