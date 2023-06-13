package p000;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0010\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00142\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¨\u0006\u001d"}, m28432d2 = {"Lcf1;", "T", "Lgz5;", "LqV5;", "statement", "entity", "", "i", "(LqV5;Ljava/lang/Object;)V", "k", "(Ljava/lang/Object;)V", "", "entities", "l", "([Ljava/lang/Object;)V", "", "j", "", "m", "(Ljava/lang/Object;)J", "", "o", "([Ljava/lang/Object;)Ljava/util/List;", "", "n", "LEb5;", "database", "<init>", "(LEb5;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: cf1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39268cf1<T> extends AbstractC41861gz5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC39268cf1(AbstractC32563Eb5 database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    /* renamed from: i */
    public abstract void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, T t);

    /* renamed from: j */
    public final void m61089j(Iterable<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        InterfaceC47496qV5 m37254b = m37254b();
        try {
            for (T t : entities) {
                mo3701i(m37254b, t);
                m37254b.mo17481y2();
            }
        } finally {
            m37249h(m37254b);
        }
    }

    /* renamed from: k */
    public final void m61088k(T t) {
        InterfaceC47496qV5 m37254b = m37254b();
        try {
            mo3701i(m37254b, t);
            m37254b.mo17481y2();
        } finally {
            m37249h(m37254b);
        }
    }

    /* renamed from: l */
    public final void m61087l(T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        InterfaceC47496qV5 m37254b = m37254b();
        try {
            for (T t : entities) {
                mo3701i(m37254b, t);
                m37254b.mo17481y2();
            }
        } finally {
            m37249h(m37254b);
        }
    }

    /* renamed from: m */
    public final long m61086m(T t) {
        InterfaceC47496qV5 m37254b = m37254b();
        try {
            mo3701i(m37254b, t);
            return m37254b.mo17481y2();
        } finally {
            m37249h(m37254b);
        }
    }

    /* renamed from: n */
    public final List<Long> m61085n(Collection<? extends T> entities) {
        List createListBuilder;
        List<Long> build;
        Intrinsics.checkNotNullParameter(entities, "entities");
        InterfaceC47496qV5 m37254b = m37254b();
        try {
            createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            for (T t : entities) {
                mo3701i(m37254b, t);
                createListBuilder.add(Long.valueOf(m37254b.mo17481y2()));
            }
            build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            return build;
        } finally {
            m37249h(m37254b);
        }
    }

    /* renamed from: o */
    public final List<Long> m61084o(T[] entities) {
        List createListBuilder;
        List<Long> build;
        Intrinsics.checkNotNullParameter(entities, "entities");
        InterfaceC47496qV5 m37254b = m37254b();
        try {
            createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            for (T t : entities) {
                mo3701i(m37254b, t);
                createListBuilder.add(Long.valueOf(m37254b.mo17481y2()));
            }
            build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            return build;
        } finally {
            m37249h(m37254b);
        }
    }
}
