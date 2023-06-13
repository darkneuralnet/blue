package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J)\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LWy5;", "Lq1;", "LUy5;", "flow", "", "c", "", "Lkotlin/coroutines/Continuation;", "", DateTokenConverter.CONVERTER_KEY, "(LUy5;)[Lkotlin/coroutines/Continuation;", "", C17296a.f69688o, "J", "index", "b", "Lkotlin/coroutines/Continuation;", "cont", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Wy5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C36982Wy5 extends AbstractC27450q1<C36514Uy5<?>> {
    @JvmField

    /* renamed from: a */
    public long f42424a = -1;
    @JvmField

    /* renamed from: b */
    public Continuation<? super Unit> f42425b;

    @Override // p000.AbstractC27450q1
    /* renamed from: c */
    public boolean mo6872a(C36514Uy5<?> c36514Uy5) {
        if (this.f42424a >= 0) {
            return false;
        }
        this.f42424a = c36514Uy5.m80537W();
        return true;
    }

    @Override // p000.AbstractC27450q1
    /* renamed from: d */
    public Continuation<Unit>[] mo6871b(C36514Uy5<?> c36514Uy5) {
        long j = this.f42424a;
        this.f42424a = -1L;
        this.f42425b = null;
        return c36514Uy5.m80538V(j);
    }
}
