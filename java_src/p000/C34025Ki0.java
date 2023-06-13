package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LKi0;", "LAh2;", "LJi0;", "", "cause", "", "P", "", DateTokenConverter.CONVERTER_KEY, "LLi0;", "f", "LLi0;", "childJob", "Lzh2;", "getParent", "()Lzh2;", "parent", "<init>", "(LLi0;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Ki0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C34025Ki0 extends AbstractC31678Ah2 implements InterfaceC33791Ji0 {
    @JvmField

    /* renamed from: f */
    public final InterfaceC34259Li0 f20076f;

    public C34025Ki0(InterfaceC34259Li0 interfaceC34259Li0) {
        this.f20076f = interfaceC34259Li0;
    }

    @Override // p000.AbstractC48901ss0
    /* renamed from: P */
    public void mo13153P(Throwable th) {
        this.f20076f.mo85074z(m89917Q());
    }

    @Override // p000.InterfaceC33791Ji0
    /* renamed from: d */
    public boolean mo78793d(Throwable th) {
        return m89917Q().mo78318g0(th);
    }

    @Override // p000.InterfaceC33791Ji0
    public InterfaceC52943zh2 getParent() {
        return m89917Q();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo13153P(th);
        return Unit.INSTANCE;
    }
}
