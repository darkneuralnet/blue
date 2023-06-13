package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0006\u001a\u00020\u00052\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR$\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, m28432d2 = {"LL36;", "", "Lv36;", "element", "value", "", C17296a.f69688o, "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "b", "Lkotlin/coroutines/CoroutineContext;", "", "[Ljava/lang/Object;", "values", "c", "[Lv36;", "elements", "", DateTokenConverter.CONVERTER_KEY, "I", "i", "n", "<init>", "(Lkotlin/coroutines/CoroutineContext;I)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: L36 */
/* loaded from: classes8.dex */
public final class L36 {
    @JvmField

    /* renamed from: a */
    public final CoroutineContext f20653a;

    /* renamed from: b */
    public final Object[] f20654b;

    /* renamed from: c */
    public final InterfaceC50201v36<Object>[] f20655c;

    /* renamed from: d */
    public int f20656d;

    public L36(CoroutineContext coroutineContext, int i) {
        this.f20653a = coroutineContext;
        this.f20654b = new Object[i];
        this.f20655c = new InterfaceC50201v36[i];
    }

    /* renamed from: a */
    public final void m97889a(InterfaceC50201v36<?> interfaceC50201v36, Object obj) {
        Object[] objArr = this.f20654b;
        int i = this.f20656d;
        objArr[i] = obj;
        InterfaceC50201v36<Object>[] interfaceC50201v36Arr = this.f20655c;
        this.f20656d = i + 1;
        interfaceC50201v36Arr[i] = interfaceC50201v36;
    }

    /* renamed from: b */
    public final void m97888b(CoroutineContext coroutineContext) {
        int length = this.f20655c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            InterfaceC50201v36<Object> interfaceC50201v36 = this.f20655c[length];
            Intrinsics.checkNotNull(interfaceC50201v36);
            interfaceC50201v36.m9263q(coroutineContext, this.f20654b[length]);
            if (i >= 0) {
                length = i;
            } else {
                return;
            }
        }
    }
}
