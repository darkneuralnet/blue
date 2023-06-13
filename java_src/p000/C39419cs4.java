package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000.AN2;
import p000.RN2;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b\u000f\u0010\u0010JM\u0010\r\u001a\u00028\u00012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00062\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"Lcs4;", "LRN2;", "VM", "LAN2;", "S", "LBN2;", "Ljava/lang/Class;", "viewModelClass", "stateClass", "LPr6;", "viewModelContext", "LIP5;", "stateRestorer", C17296a.f69688o, "(Ljava/lang/Class;Ljava/lang/Class;LPr6;LIP5;)LAN2;", "<init>", "()V", "mvrx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: cs4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C39419cs4<VM extends RN2<S>, S extends AN2> implements BN2<VM, S> {
    @Override // p000.BN2
    /* renamed from: a */
    public S mo44941a(Class<? extends VM> viewModelClass, Class<? extends S> stateClass, AbstractC35282Pr6 viewModelContext, IP5<VM, S> ip5) {
        Function1<S, S> m102414b;
        S invoke;
        Class<? extends S> m102415a;
        Class<? extends VM> m102413c;
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(stateClass, "stateClass");
        Intrinsics.checkNotNullParameter(viewModelContext, "viewModelContext");
        if (ip5 != null && (m102413c = ip5.m102413c()) != null) {
            viewModelClass = m102413c;
        }
        if (ip5 != null && (m102415a = ip5.m102415a()) != null) {
            stateClass = m102415a;
        }
        S s = (S) DN2.m110554a(viewModelClass, viewModelContext);
        if (s == null) {
            s = (S) DN2.m110553b(viewModelClass, stateClass, viewModelContext.mo16489e());
        }
        return (ip5 == null || (m102414b = ip5.m102414b()) == null || (invoke = m102414b.invoke(s)) == null) ? s : invoke;
    }
}
