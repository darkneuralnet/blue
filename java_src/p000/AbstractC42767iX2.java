package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
/* renamed from: iX2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC42767iX2<K0, V0> {

    /* renamed from: iX2$a */
    /* loaded from: classes6.dex */
    public class C23278a extends AbstractC23280c<K0> {

        /* renamed from: a */
        public final /* synthetic */ Class f87447a;

        public C23278a(Class cls) {
            this.f87447a = cls;
        }

        @Override // p000.AbstractC42767iX2.AbstractC23280c
        /* renamed from: a */
        public <K extends K0, V> Map<K, Collection<V>> mo33841a() {
            return new EnumMap(this.f87447a);
        }
    }

    /* renamed from: iX2$b */
    /* loaded from: classes6.dex */
    public static final class C23279b<V> implements YU5<Set<V>>, Serializable {

        /* renamed from: b */
        public final int f87448b;

        public C23279b(int i) {
            this.f87448b = C39948dm0.m43733b(i, "expectedValuesPerKey");
        }

        @Override // p000.YU5
        /* renamed from: a */
        public Set<V> get() {
            return C49865uV3.m10207d(this.f87448b);
        }
    }

    /* renamed from: iX2$c */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC23280c<K0> {

        /* renamed from: iX2$c$a */
        /* loaded from: classes6.dex */
        public class C23281a extends AbstractC23282d<K0, Object> {

            /* renamed from: a */
            public final /* synthetic */ int f87449a;

            public C23281a(int i) {
                this.f87449a = i;
            }

            @Override // p000.AbstractC42767iX2.AbstractC23282d
            /* renamed from: b */
            public <K extends K0, V> InterfaceC37423Yv5<K, V> mo33838b() {
                return C43360jX2.m30369d(AbstractC23280c.this.mo33841a(), new C23279b(this.f87449a));
            }
        }

        /* renamed from: a */
        public abstract <K extends K0, V> Map<K, Collection<V>> mo33841a();

        /* renamed from: b */
        public AbstractC23282d<K0, Object> m33840b() {
            return m33839c(2);
        }

        /* renamed from: c */
        public AbstractC23282d<K0, Object> m33839c(int i) {
            C39948dm0.m43733b(i, "expectedValuesPerKey");
            return new C23281a(i);
        }
    }

    /* renamed from: iX2$d */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC23282d<K0, V0> extends AbstractC42767iX2<K0, V0> {
        public AbstractC23282d() {
            super(null);
        }

        /* renamed from: b */
        public abstract <K extends K0, V extends V0> InterfaceC37423Yv5<K, V> mo33838b();
    }

    public /* synthetic */ AbstractC42767iX2(C42174hX2 c42174hX2) {
        this();
    }

    /* renamed from: a */
    public static <K0 extends Enum<K0>> AbstractC23280c<K0> m33843a(Class<K0> cls) {
        EZ3.m108801n(cls);
        return new C23278a(cls);
    }

    private AbstractC42767iX2() {
    }
}
