package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"LbL3;", "LSC0;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "B", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "y", "LK41;", "c", "LK41;", "dispatchQueue", "<init>", "()V", "lifecycle-common"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bL3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38492bL3 extends SC0 {
    @JvmField

    /* renamed from: c */
    public final K41 f57297c = new K41();

    @Override // p000.SC0
    /* renamed from: B */
    public boolean mo14157B(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (T41.m84376c().mo14156G().mo14157B(context)) {
            return true;
        }
        return !this.f57297c.m99270b();
    }

    @Override // p000.SC0
    /* renamed from: y */
    public void mo14150y(CoroutineContext context, Runnable block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f57297c.m99269c(context, block);
    }
}
