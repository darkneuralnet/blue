package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u001d\u0010\u0010\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m28432d2 = {"Lbf1;", "T", "Lgz5;", "LqV5;", "statement", "entity", "", "i", "(LqV5;Ljava/lang/Object;)V", "", "j", "(Ljava/lang/Object;)I", "", "entities", "k", "", "l", "([Ljava/lang/Object;)I", "LEb5;", "database", "<init>", "(LEb5;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: bf1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC38675bf1<T> extends AbstractC41861gz5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC38675bf1(AbstractC32563Eb5 database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    /* renamed from: i */
    public abstract void mo42179i(InterfaceC47496qV5 interfaceC47496qV5, T t);

    /* renamed from: j */
    public final int m64207j(T t) {
        InterfaceC47496qV5 m37254b = m37254b();
        try {
            mo42179i(m37254b, t);
            return m37254b.mo17482M();
        } finally {
            m37249h(m37254b);
        }
    }

    /* renamed from: k */
    public final int m64206k(Iterable<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        InterfaceC47496qV5 m37254b = m37254b();
        try {
            int i = 0;
            for (T t : entities) {
                mo42179i(m37254b, t);
                i += m37254b.mo17482M();
            }
            return i;
        } finally {
            m37249h(m37254b);
        }
    }

    /* renamed from: l */
    public final int m64205l(T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        InterfaceC47496qV5 m37254b = m37254b();
        try {
            int i = 0;
            for (T t : entities) {
                mo42179i(m37254b, t);
                i += m37254b.mo17482M();
            }
            return i;
        } finally {
            m37249h(m37254b);
        }
    }
}
