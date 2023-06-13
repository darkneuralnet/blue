package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B1\b\u0000\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0017J!\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR&\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LTH2;", "I", "O", "LB5;", "", "c", "input", "LE4;", "options", "b", "(Ljava/lang/Object;LE4;)V", "LC5;", C17296a.f69688o, "LC5;", "launcher", "LsP5;", "Lv5;", "LsP5;", "contract", "<init>", "(LC5;LsP5;)V", "activity-compose_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: TH2 */
/* loaded from: classes.dex */
public final class TH2<I, O> extends AbstractC0407B5<I> {

    /* renamed from: a */
    public final C0854C5<I> f35164a;

    /* renamed from: b */
    public final InterfaceC48627sP5<AbstractC29414v5<I, O>> f35165b;

    /* JADX WARN: Multi-variable type inference failed */
    public TH2(C0854C5<I> launcher, InterfaceC48627sP5<? extends AbstractC29414v5<I, O>> contract) {
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        Intrinsics.checkNotNullParameter(contract, "contract");
        this.f35164a = launcher;
        this.f35165b = contract;
    }

    @Override // p000.AbstractC0407B5
    /* renamed from: b */
    public void mo67436b(I i, C1727E4 c1727e4) {
        this.f35164a.m112904a(i, c1727e4);
    }

    @Override // p000.AbstractC0407B5
    @Deprecated(message = "Registration is automatically handled by rememberLauncherForActivityResult")
    /* renamed from: c */
    public void mo67435c() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
