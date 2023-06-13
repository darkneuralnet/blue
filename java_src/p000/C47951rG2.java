package p000;

import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, m28432d2 = {"LrG2;", "", "LpG2;", C17296a.f69688o, "", "b", "Z", "FAST_SERVICE_LOADER_ENABLED", "c", "LpG2;", "dispatcher", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: rG2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47951rG2 {

    /* renamed from: a */
    public static final C47951rG2 f106776a;

    /* renamed from: b */
    public static final boolean f106777b;
    @JvmField

    /* renamed from: c */
    public static final AbstractC46765pG2 f106778c;

    static {
        C47951rG2 c47951rG2 = new C47951rG2();
        f106776a = c47951rG2;
        f106777b = C42779iY5.m33822e("kotlinx.coroutines.fast.service.loader", true);
        f106778c = c47951rG2.m16138a();
    }

    private C47951rG2() {
    }

    /* renamed from: a */
    public final AbstractC46765pG2 m16138a() {
        Sequence asSequence;
        List<InterfaceC47358qG2> list;
        Object next;
        AbstractC46765pG2 m14486e;
        try {
            if (f106777b) {
                list = C34737Nj1.f25026a.m93542c();
            } else {
                asSequence = SequencesKt__SequencesKt.asSequence(ServiceLoader.load(InterfaceC47358qG2.class, InterfaceC47358qG2.class.getClassLoader()).iterator());
                list = SequencesKt___SequencesKt.toList(asSequence);
            }
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int mo12289a = ((InterfaceC47358qG2) next).mo12289a();
                    do {
                        Object next2 = it.next();
                        int mo12289a2 = ((InterfaceC47358qG2) next2).mo12289a();
                        if (mo12289a < mo12289a2) {
                            next = next2;
                            mo12289a = mo12289a2;
                        }
                    } while (it.hasNext());
                }
            }
            InterfaceC47358qG2 interfaceC47358qG2 = (InterfaceC47358qG2) next;
            if (interfaceC47358qG2 == null || (m14486e = C48543sG2.m14486e(interfaceC47358qG2, list)) == null) {
                return C48543sG2.m14489b(null, null, 3, null);
            }
            return m14486e;
        } catch (Throwable th) {
            return C48543sG2.m14489b(th, null, 2, null);
        }
    }
}
