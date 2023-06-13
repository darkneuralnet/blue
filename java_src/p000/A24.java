package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.PublishedApi;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b!\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u0003H ¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H ¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00038 X \u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LA24;", "Array", "", "", "requiredCapacity", "", "b", "(I)V", C17296a.f69688o, "()Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "()I", "position", "<init>", "()V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
/* renamed from: A24 */
/* loaded from: classes8.dex */
public abstract class A24<Array> {
    /* renamed from: c */
    public static /* synthetic */ void m116173c(A24 a24, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i2 & 1) != 0) {
            i = a24.mo9204d() + 1;
        }
        a24.mo9205b(i);
    }

    /* renamed from: a */
    public abstract Array mo9206a();

    /* renamed from: b */
    public abstract void mo9205b(int i);

    /* renamed from: d */
    public abstract int mo9204d();
}
