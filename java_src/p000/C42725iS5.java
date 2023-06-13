package p000;

import ch.qos.logback.classic.spi.CallerData;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\"\"\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u0012\u0004\b\n\u0010\u000b¨\u0006\r"}, m28432d2 = {"Ljava/lang/StringBuilder;", "b", "builder", "", "count", "", C17296a.f69688o, "", "", "[Ljava/lang/String;", "getEMPTY_STRING_ARRAY$annotations", "()V", "EMPTY_STRING_ARRAY", "room-runtime_release"}, m28431k = 2, m28430mv = {1, 7, 1})
@JvmName(name = "StringUtil")
/* renamed from: iS5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42725iS5 {
    @JvmField

    /* renamed from: a */
    public static final String[] f87345a = new String[0];

    /* renamed from: a */
    public static final void m33906a(StringBuilder builder, int i) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (int i2 = 0; i2 < i; i2++) {
            builder.append(CallerData.f61059NA);
            if (i2 < i - 1) {
                builder.append(",");
            }
        }
    }

    /* renamed from: b */
    public static final StringBuilder m33905b() {
        return new StringBuilder();
    }
}
