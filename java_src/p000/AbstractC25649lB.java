package p000;

import java.util.Collections;
import java.util.Set;
/* renamed from: lB */
/* loaded from: classes6.dex */
public abstract class AbstractC25649lB implements InterfaceC40492eh2 {
    private final Set<C37051Xg2> algs;
    private final Set<C36312Uc1> encs;
    private final C39289ch2 jcaContext = new C39289ch2();

    public AbstractC25649lB(Set<C37051Xg2> set, Set<C36312Uc1> set2) {
        if (set != null) {
            this.algs = Collections.unmodifiableSet(set);
            if (set2 != null) {
                this.encs = set2;
                return;
            }
            throw new IllegalArgumentException("The supported encryption methods must not be null");
        }
        throw new IllegalArgumentException("The supported JWE algorithm set must not be null");
    }

    @Override // p000.InterfaceC40492eh2
    public Set<C36312Uc1> supportedEncryptionMethods() {
        return this.encs;
    }

    @Override // p000.InterfaceC40492eh2
    public Set<C37051Xg2> supportedJWEAlgorithms() {
        return this.algs;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.InterfaceC31669Ag2
    public C39289ch2 getJCAContext() {
        return this.jcaContext;
    }
}
