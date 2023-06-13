package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0002H&J\u001e\u0010\u0006\u001a\u00020\u00052\n\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H&R&\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"Lop;", "", "Lrp;", "c", "failure", "", C17296a.f69688o, "Lrp;", "b", "()Lrp;", DateTokenConverter.CONVERTER_KEY, "(Lrp;)V", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: op */
/* loaded from: classes8.dex */
public abstract class AbstractC27064op {

    /* renamed from: a */
    public AbstractC28006rp<?> f102528a;

    /* renamed from: a */
    public abstract void mo20476a(AbstractC28006rp<?> abstractC28006rp, Object obj);

    /* renamed from: b */
    public final AbstractC28006rp<?> m20475b() {
        AbstractC28006rp<?> abstractC28006rp = this.f102528a;
        if (abstractC28006rp != null) {
            return abstractC28006rp;
        }
        Intrinsics.throwUninitializedPropertyAccessException("atomicOp");
        return null;
    }

    /* renamed from: c */
    public abstract Object mo20474c(AbstractC28006rp<?> abstractC28006rp);

    /* renamed from: d */
    public final void m20473d(AbstractC28006rp<?> abstractC28006rp) {
        this.f102528a = abstractC28006rp;
    }
}
