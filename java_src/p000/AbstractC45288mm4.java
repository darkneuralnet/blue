package p000;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
/* renamed from: mm4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC45288mm4 extends AbstractC25649lB {

    /* renamed from: a */
    public static final Set<C37051Xg2> f98732a;

    /* renamed from: b */
    public static final Set<C36312Uc1> f98733b = C41965hA0.f84763a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(C37051Xg2.f43551e);
        linkedHashSet.add(C37051Xg2.f43552f);
        linkedHashSet.add(C37051Xg2.f43553g);
        linkedHashSet.add(C37051Xg2.f43554h);
        linkedHashSet.add(C37051Xg2.f43555i);
        f98732a = Collections.unmodifiableSet(linkedHashSet);
    }

    public AbstractC45288mm4() {
        super(f98732a, C41965hA0.f84763a);
    }

    @Override // p000.AbstractC25649lB, p000.InterfaceC31669Ag2
    public /* bridge */ /* synthetic */ C39289ch2 getJCAContext() {
        return super.getJCAContext();
    }

    @Override // p000.AbstractC25649lB, p000.InterfaceC40492eh2
    public /* bridge */ /* synthetic */ Set supportedEncryptionMethods() {
        return super.supportedEncryptionMethods();
    }

    @Override // p000.AbstractC25649lB, p000.InterfaceC40492eh2
    public /* bridge */ /* synthetic */ Set supportedJWEAlgorithms() {
        return super.supportedJWEAlgorithms();
    }
}
