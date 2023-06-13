package p000;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import p000.AbstractC38616bZ1;
import p000.AbstractC40412eZ1;
import p000.C37630Zs5;
import p000.XY1;
import p000.YY1;
/* renamed from: dZ1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C39820dZ1<K, V> extends YY1<K, V> implements InterfaceC37423Yv5<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: i */
    public final transient AbstractC38616bZ1<V> f76797i;

    /* renamed from: j */
    public transient AbstractC38616bZ1<Map.Entry<K, V>> f76798j;

    /* renamed from: dZ1$a */
    /* loaded from: classes6.dex */
    public static final class C19793a<K, V> extends YY1.C9807c<K, V> {
        @Override // p000.YY1.C9807c
        /* renamed from: a */
        public Collection<V> mo44125a() {
            return C49865uV3.m10206e();
        }

        /* renamed from: d */
        public C39820dZ1<K, V> m44123d() {
            Collection entrySet = this.f46004a.entrySet();
            Comparator<? super K> comparator = this.f46005b;
            if (comparator != null) {
                entrySet = AbstractC53114zy3.m60a(comparator).m57d().m59b(entrySet);
            }
            return C39820dZ1.m44133D(entrySet, this.f46006c);
        }

        @Override // p000.YY1.C9807c
        /* renamed from: e */
        public C19793a<K, V> mo44124b(K k, V v) {
            super.mo44124b(k, v);
            return this;
        }

        /* renamed from: f */
        public C19793a<K, V> m44121f(Map.Entry<? extends K, ? extends V> entry) {
            super.m74900c(entry);
            return this;
        }
    }

    /* renamed from: dZ1$b */
    /* loaded from: classes6.dex */
    public static final class C19794b<K, V> extends AbstractC38616bZ1<Map.Entry<K, V>> {

        /* renamed from: d */
        public final transient C39820dZ1<K, V> f76799d;

        public C19794b(C39820dZ1<K, V> c39820dZ1) {
            this.f76799d = c39820dZ1;
        }

        @Override // p000.QY1, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return this.f76799d.mo39188g(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // p000.QY1
        /* renamed from: h */
        public boolean mo9378h() {
            return false;
        }

        @Override // p000.AbstractC38616bZ1, p000.QY1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: j */
        public AbstractC48175re6<Map.Entry<K, V>> iterator() {
            return this.f76799d.mo74912m();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f76799d.size();
        }
    }

    /* renamed from: dZ1$c */
    /* loaded from: classes6.dex */
    public static final class C19795c {

        /* renamed from: a */
        public static final C37630Zs5.C10426b<C39820dZ1> f76800a = C37630Zs5.m72363a(C39820dZ1.class, "emptySet");

        private C19795c() {
        }
    }

    public C39820dZ1(XY1<K, AbstractC38616bZ1<V>> xy1, int i, Comparator<? super V> comparator) {
        super(xy1, i);
        this.f76797i = m44135B(comparator);
    }

    /* renamed from: A */
    public static <K, V> C19793a<K, V> m44136A() {
        return new C19793a<>();
    }

    /* renamed from: B */
    public static <V> AbstractC38616bZ1<V> m44135B(Comparator<? super V> comparator) {
        if (comparator == null) {
            return AbstractC38616bZ1.m64368A();
        }
        return AbstractC40412eZ1.m42784N(comparator);
    }

    /* renamed from: D */
    public static <K, V> C39820dZ1<K, V> m44133D(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return m44131F();
        }
        XY1.C9426a c9426a = new XY1.C9426a(collection.size());
        int i = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            AbstractC38616bZ1 m44129I = m44129I(comparator, entry.getValue());
            if (!m44129I.isEmpty()) {
                c9426a.m76874f(key, m44129I);
                i += m44129I.size();
            }
        }
        return new C39820dZ1<>(c9426a.m76877c(), i, comparator);
    }

    /* renamed from: F */
    public static <K, V> C39820dZ1<K, V> m44131F() {
        return C35592Ra1.f32224k;
    }

    /* renamed from: I */
    public static <V> AbstractC38616bZ1<V> m44129I(Comparator<? super V> comparator, Collection<? extends V> collection) {
        if (comparator == null) {
            return AbstractC38616bZ1.m64359w(collection);
        }
        return AbstractC40412eZ1.m42788J(comparator, collection);
    }

    /* renamed from: J */
    public static <V> AbstractC38616bZ1.C12445a<V> m44128J(Comparator<? super V> comparator) {
        if (comparator == null) {
            return new AbstractC38616bZ1.C12445a<>();
        }
        return new AbstractC40412eZ1.C20065a(comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            XY1.C9426a m76888a = XY1.m76888a();
            int i = 0;
            for (int i2 = 0; i2 < readInt; i2++) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    AbstractC38616bZ1.C12445a m44128J = m44128J(comparator);
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        m44128J.mo42771d(objectInputStream.readObject());
                    }
                    AbstractC38616bZ1 mo42769k = m44128J.mo42769k();
                    if (mo42769k.size() == readInt2) {
                        m76888a.m76874f(readObject, mo42769k);
                        i += readInt2;
                    } else {
                        String valueOf = String.valueOf(readObject);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 40);
                        sb.append("Duplicate key-value pairs exist for key ");
                        sb.append(valueOf);
                        throw new InvalidObjectException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(31);
                    sb2.append("Invalid value count ");
                    sb2.append(readInt2);
                    throw new InvalidObjectException(sb2.toString());
                }
            }
            try {
                YY1.C9809e.f46008a.m72357b(this, m76888a.m76877c());
                YY1.C9809e.f46009b.m72358a(this, i);
                C19795c.f76800a.m72357b(this, m44135B(comparator));
                return;
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        }
        StringBuilder sb3 = new StringBuilder(29);
        sb3.append("Invalid key count ");
        sb3.append(readInt);
        throw new InvalidObjectException(sb3.toString());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(m44130H());
        C37630Zs5.m72360d(this, objectOutputStream);
    }

    @Override // p000.YY1
    /* renamed from: C */
    public AbstractC38616bZ1<Map.Entry<K, V>> mo44127t() {
        AbstractC38616bZ1<Map.Entry<K, V>> abstractC38616bZ1 = this.f76798j;
        if (abstractC38616bZ1 == null) {
            C19794b c19794b = new C19794b(this);
            this.f76798j = c19794b;
            return c19794b;
        }
        return abstractC38616bZ1;
    }

    @Override // p000.YY1
    /* renamed from: E */
    public AbstractC38616bZ1<V> mo44126v(K k) {
        return (AbstractC38616bZ1) KV2.m98828a((AbstractC38616bZ1) this.f45995g.get(k), this.f76797i);
    }

    /* renamed from: H */
    public Comparator<? super V> m44130H() {
        AbstractC38616bZ1<V> abstractC38616bZ1 = this.f76797i;
        if (abstractC38616bZ1 instanceof AbstractC40412eZ1) {
            return ((AbstractC40412eZ1) abstractC38616bZ1).comparator();
        }
        return null;
    }
}
