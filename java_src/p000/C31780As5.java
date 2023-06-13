package p000;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u0012\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00028\u0000`\b¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R*\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00028\u0000`\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0011"}, m28432d2 = {"LAs5;", "E", "Lzs5;", "", "J", "", "U", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "g", "Lkotlin/jvm/functions/Function1;", "onUndeliveredElement", "pollResult", "LWc0;", "cont", "<init>", "(Ljava/lang/Object;LWc0;Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: As5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C31780As5<E> extends C53056zs5<E> {
    @JvmField

    /* renamed from: g */
    public final Function1<E, Unit> f1292g;

    /* JADX WARN: Multi-variable type inference failed */
    public C31780As5(E e, InterfaceC36779Wc0<? super Unit> interfaceC36779Wc0, Function1<? super E, Unit> function1) {
        super(e, interfaceC36779Wc0);
        this.f1292g = function1;
    }

    @Override // p000.C38856bx2
    /* renamed from: J */
    public boolean mo62093J() {
        if (!super.mo62093J()) {
            return false;
        }
        mo4531U();
        return true;
    }

    @Override // p000.AbstractC51870xs5
    /* renamed from: U */
    public void mo4531U() {
        C47016ph3.m18974b(this.f1292g, mo197Q(), this.f122414f.getContext());
    }
}
