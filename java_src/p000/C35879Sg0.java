package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0083@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0088\u0001\u000e\u0092\u0001\u00020\rø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"LSg0;", "", "", "index", "b", "([II)I", "value", "", DateTokenConverter.CONVERTER_KEY, "([III)V", "c", "([I)I", "mid", "", MessageExtension.FIELD_DATA, C17296a.f69688o, "([I)[I", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: Sg0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35879Sg0 {
    /* renamed from: a */
    public static int[] m85148a(int[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data;
    }

    /* renamed from: b */
    public static final int m85147b(int[] iArr, int i) {
        return iArr[i + m85146c(iArr)];
    }

    /* renamed from: c */
    public static final int m85146c(int[] iArr) {
        return iArr.length / 2;
    }

    /* renamed from: d */
    public static final void m85145d(int[] iArr, int i, int i2) {
        iArr[i + m85146c(iArr)] = i2;
    }
}
