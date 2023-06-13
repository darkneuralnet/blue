package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import p000.ConcurrentMapC51543xK2.AbstractC30111n;
import p000.ConcurrentMapC51543xK2.InterfaceC30106i;
/* renamed from: xK2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class ConcurrentMapC51543xK2<K, V, E extends InterfaceC30106i<K, V, E>, S extends AbstractC30111n<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* renamed from: k */
    public static final InterfaceC30095B<Object, Object, C30102e> f117370k = new C30098a();
    private static final long serialVersionUID = 5;

    /* renamed from: b */
    public final transient int f117371b;

    /* renamed from: c */
    public final transient int f117372c;

    /* renamed from: d */
    public final transient AbstractC30111n<K, V, E, S>[] f117373d;

    /* renamed from: e */
    public final int f117374e;

    /* renamed from: f */
    public final AbstractC35637Rf1<Object> f117375f;

    /* renamed from: g */
    public final transient InterfaceC30107j<K, V, E, S> f117376g;

    /* renamed from: h */
    public transient Set<K> f117377h;

    /* renamed from: i */
    public transient Collection<V> f117378i;

    /* renamed from: j */
    public transient Set<Map.Entry<K, V>> f117379j;

    /* renamed from: xK2$A */
    /* loaded from: classes6.dex */
    public interface InterfaceC30094A<K, V, E extends InterfaceC30106i<K, V, E>> extends InterfaceC30106i<K, V, E> {
        /* renamed from: b */
        InterfaceC30095B<K, V, E> mo5463b();
    }

    /* renamed from: xK2$B */
    /* loaded from: classes6.dex */
    public interface InterfaceC30095B<K, V, E extends InterfaceC30106i<K, V, E>> {
        /* renamed from: a */
        InterfaceC30095B<K, V, E> mo5538a(ReferenceQueue<V> referenceQueue, E e);

        /* renamed from: b */
        E mo5537b();

        void clear();

        V get();
    }

    /* renamed from: xK2$C */
    /* loaded from: classes6.dex */
    public static final class C30096C<K, V, E extends InterfaceC30106i<K, V, E>> extends WeakReference<V> implements InterfaceC30095B<K, V, E> {

        /* renamed from: a */
        public final E f117380a;

        public C30096C(ReferenceQueue<V> referenceQueue, V v, E e) {
            super(v, referenceQueue);
            this.f117380a = e;
        }

        @Override // p000.ConcurrentMapC51543xK2.InterfaceC30095B
        /* renamed from: a */
        public InterfaceC30095B<K, V, E> mo5538a(ReferenceQueue<V> referenceQueue, E e) {
            return new C30096C(referenceQueue, get(), e);
        }

        @Override // p000.ConcurrentMapC51543xK2.InterfaceC30095B
        /* renamed from: b */
        public E mo5537b() {
            return this.f117380a;
        }
    }

    /* renamed from: xK2$D */
    /* loaded from: classes6.dex */
    public final class C30097D extends AbstractC5804O0<K, V> {

        /* renamed from: b */
        public final K f117381b;

        /* renamed from: c */
        public V f117382c;

        public C30097D(K k, V v) {
            this.f117381b = k;
            this.f117382c = v;
        }

        @Override // p000.AbstractC5804O0, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.f117381b.equals(entry.getKey()) || !this.f117382c.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // p000.AbstractC5804O0, java.util.Map.Entry
        public K getKey() {
            return this.f117381b;
        }

        @Override // p000.AbstractC5804O0, java.util.Map.Entry
        public V getValue() {
            return this.f117382c;
        }

        @Override // p000.AbstractC5804O0, java.util.Map.Entry
        public int hashCode() {
            return this.f117381b.hashCode() ^ this.f117382c.hashCode();
        }

        @Override // p000.AbstractC5804O0, java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) ConcurrentMapC51543xK2.this.put(this.f117381b, v);
            this.f117382c = v;
            return v2;
        }
    }

    /* renamed from: xK2$a */
    /* loaded from: classes6.dex */
    public class C30098a implements InterfaceC30095B<Object, Object, C30102e> {
        @Override // p000.ConcurrentMapC51543xK2.InterfaceC30095B
        /* renamed from: c */
        public InterfaceC30095B<Object, Object, C30102e> mo5538a(ReferenceQueue<Object> referenceQueue, C30102e c30102e) {
            return this;
        }

        @Override // p000.ConcurrentMapC51543xK2.InterfaceC30095B
        public void clear() {
        }

        @Override // p000.ConcurrentMapC51543xK2.InterfaceC30095B
        /* renamed from: d */
        public C30102e mo5537b() {
            return null;
        }

        @Override // p000.ConcurrentMapC51543xK2.InterfaceC30095B
        public Object get() {
            return null;
        }
    }

    /* renamed from: xK2$b */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC30099b<K, V> extends AbstractConcurrentMapC32055Bx1<K, V> implements Serializable {
        private static final long serialVersionUID = 3;

        /* renamed from: b */
        public final EnumC30113p f117384b;

        /* renamed from: c */
        public final EnumC30113p f117385c;

        /* renamed from: d */
        public final AbstractC35637Rf1<Object> f117386d;

        /* renamed from: e */
        public final AbstractC35637Rf1<Object> f117387e;

        /* renamed from: f */
        public final int f117388f;

        /* renamed from: g */
        public transient ConcurrentMap<K, V> f117389g;

        public AbstractC30099b(EnumC30113p enumC30113p, EnumC30113p enumC30113p2, AbstractC35637Rf1<Object> abstractC35637Rf1, AbstractC35637Rf1<Object> abstractC35637Rf12, int i, ConcurrentMap<K, V> concurrentMap) {
            this.f117384b = enumC30113p;
            this.f117385c = enumC30113p2;
            this.f117386d = abstractC35637Rf1;
            this.f117387e = abstractC35637Rf12;
            this.f117388f = i;
            this.f117389g = concurrentMap;
        }

        @Override // p000.AbstractConcurrentMapC32055Bx1, p000.AbstractC33459Hx1, p000.AbstractC33927Jx1
        /* renamed from: b */
        public ConcurrentMap<K, V> delegate() {
            return this.f117389g;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public void m5532c(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            while (true) {
                Object readObject = objectInputStream.readObject();
                if (readObject == null) {
                    return;
                }
                this.f117389g.put(readObject, objectInputStream.readObject());
            }
        }

        /* renamed from: e */
        public C50950wK2 m5531e(ObjectInputStream objectInputStream) throws IOException {
            return new C50950wK2().m6998g(objectInputStream.readInt()).m6995j(this.f117384b).m6994k(this.f117385c).m6997h(this.f117386d).m7004a(this.f117388f);
        }

        /* renamed from: f */
        public void m5530f(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.f117389g.size());
            for (Map.Entry<K, V> entry : this.f117389g.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    /* renamed from: xK2$c */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC30100c<K, V, E extends InterfaceC30106i<K, V, E>> implements InterfaceC30106i<K, V, E> {

        /* renamed from: a */
        public final K f117390a;

        /* renamed from: b */
        public final int f117391b;

        /* renamed from: c */
        public final E f117392c;

        public AbstractC30100c(K k, int i, E e) {
            this.f117390a = k;
            this.f117391b = i;
            this.f117392c = e;
        }

        @Override // p000.ConcurrentMapC51543xK2.InterfaceC30106i
        /* renamed from: a */
        public E mo5522a() {
            return this.f117392c;
        }

        @Override // p000.ConcurrentMapC51543xK2.InterfaceC30106i
        /* renamed from: c */
        public int mo5521c() {
            return this.f117391b;
        }

        @Override // p000.ConcurrentMapC51543xK2.InterfaceC30106i
        public K getKey() {
            return this.f117390a;
        }
    }

    /* renamed from: xK2$d */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC30101d<K, V, E extends InterfaceC30106i<K, V, E>> extends WeakReference<K> implements InterfaceC30106i<K, V, E> {

        /* renamed from: a */
        public final int f117393a;

        /* renamed from: b */
        public final E f117394b;

        public AbstractC30101d(ReferenceQueue<K> referenceQueue, K k, int i, E e) {
            super(k, referenceQueue);
            this.f117393a = i;
            this.f117394b = e;
        }

        @Override // p000.ConcurrentMapC51543xK2.InterfaceC30106i
        /* renamed from: a */
        public E mo5522a() {
            return this.f117394b;
        }

        @Override // p000.ConcurrentMapC51543xK2.InterfaceC30106i
        /* renamed from: c */
        public int mo5521c() {
            return this.f117393a;
        }

        @Override // p000.ConcurrentMapC51543xK2.InterfaceC30106i
        public K getKey() {
            return get();
        }
    }

    /* renamed from: xK2$e */
    /* loaded from: classes6.dex */
    public static final class C30102e implements InterfaceC30106i<Object, Object, C30102e> {
        private C30102e() {
            throw new AssertionError();
        }

        @Override // p000.ConcurrentMapC51543xK2.InterfaceC30106i
        /* renamed from: c */
        public int mo5521c() {
            throw new AssertionError();
        }

        @Override // p000.ConcurrentMapC51543xK2.InterfaceC30106i
        /* renamed from: d */
        public C30102e mo5522a() {
            throw new AssertionError();
        }

        @Override // p000.ConcurrentMapC51543xK2.InterfaceC30106i
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // p000.ConcurrentMapC51543xK2.InterfaceC30106i
        public Object getValue() {
            throw new AssertionError();
        }
    }

    /* renamed from: xK2$f */
    /* loaded from: classes6.dex */
    public final class C30103f extends ConcurrentMapC51543xK2<K, V, E, S>.AbstractC30105h<Map.Entry<K, V>> {
        public C30103f(ConcurrentMapC51543xK2 concurrentMapC51543xK2) {
            super();
        }

        @Override // java.util.Iterator
        /* renamed from: f */
        public Map.Entry<K, V> next() {
            return m5525c();
        }
    }

    /* renamed from: xK2$g */
    /* loaded from: classes6.dex */
    public final class C30104g extends AbstractC30110m<Map.Entry<K, V>> {
        public C30104g() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            ConcurrentMapC51543xK2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = ConcurrentMapC51543xK2.this.get(key)) == null || !ConcurrentMapC51543xK2.this.m5539m().m86471d(entry.getValue(), obj2)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return ConcurrentMapC51543xK2.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C30103f(ConcurrentMapC51543xK2.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || !ConcurrentMapC51543xK2.this.remove(key, entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ConcurrentMapC51543xK2.this.size();
        }
    }

    /* renamed from: xK2$h */
    /* loaded from: classes6.dex */
    public abstract class AbstractC30105h<T> implements Iterator<T> {

        /* renamed from: b */
        public int f117396b;

        /* renamed from: c */
        public int f117397c = -1;

        /* renamed from: d */
        public AbstractC30111n<K, V, E, S> f117398d;

        /* renamed from: e */
        public AtomicReferenceArray<E> f117399e;

        /* renamed from: f */
        public E f117400f;

        /* renamed from: g */
        public ConcurrentMapC51543xK2<K, V, E, S>.C30097D f117401g;

        /* renamed from: h */
        public ConcurrentMapC51543xK2<K, V, E, S>.C30097D f117402h;

        public AbstractC30105h() {
            this.f117396b = ConcurrentMapC51543xK2.this.f117373d.length - 1;
            m5527a();
        }

        /* renamed from: a */
        public final void m5527a() {
            this.f117401g = null;
            if (m5524d() || m5523e()) {
                return;
            }
            while (true) {
                int i = this.f117396b;
                if (i >= 0) {
                    AbstractC30111n<K, V, E, S>[] abstractC30111nArr = ConcurrentMapC51543xK2.this.f117373d;
                    this.f117396b = i - 1;
                    AbstractC30111n<K, V, E, S> abstractC30111n = abstractC30111nArr[i];
                    this.f117398d = abstractC30111n;
                    if (abstractC30111n.f117406c != 0) {
                        AtomicReferenceArray<E> atomicReferenceArray = this.f117398d.f117409f;
                        this.f117399e = atomicReferenceArray;
                        this.f117397c = atomicReferenceArray.length() - 1;
                        if (m5523e()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public boolean m5526b(E e) {
            try {
                Object key = e.getKey();
                Object m5548d = ConcurrentMapC51543xK2.this.m5548d(e);
                if (m5548d != null) {
                    this.f117401g = new C30097D(key, m5548d);
                    this.f117398d.m5500r();
                    return true;
                }
                this.f117398d.m5500r();
                return false;
            } catch (Throwable th) {
                this.f117398d.m5500r();
                throw th;
            }
        }

        /* renamed from: c */
        public ConcurrentMapC51543xK2<K, V, E, S>.C30097D m5525c() {
            ConcurrentMapC51543xK2<K, V, E, S>.C30097D c30097d = this.f117401g;
            if (c30097d != null) {
                this.f117402h = c30097d;
                m5527a();
                return this.f117402h;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: d */
        public boolean m5524d() {
            E e = this.f117400f;
            if (e == null) {
                return false;
            }
            while (true) {
                this.f117400f = (E) e.mo5522a();
                E e2 = this.f117400f;
                if (e2 != null) {
                    if (m5526b(e2)) {
                        return true;
                    }
                    e = this.f117400f;
                } else {
                    return false;
                }
            }
        }

        /* renamed from: e */
        public boolean m5523e() {
            while (true) {
                int i = this.f117397c;
                if (i >= 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f117399e;
                    this.f117397c = i - 1;
                    E e = atomicReferenceArray.get(i);
                    this.f117400f = e;
                    if (e != null && (m5526b(e) || m5524d())) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f117401g != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            if (this.f117402h != null) {
                z = true;
            } else {
                z = false;
            }
            C39948dm0.m43731d(z);
            ConcurrentMapC51543xK2.this.remove(this.f117402h.getKey());
            this.f117402h = null;
        }
    }

    /* renamed from: xK2$i */
    /* loaded from: classes6.dex */
    public interface InterfaceC30106i<K, V, E extends InterfaceC30106i<K, V, E>> {
        /* renamed from: a */
        E mo5522a();

        /* renamed from: c */
        int mo5521c();

        K getKey();

        V getValue();
    }

    /* renamed from: xK2$j */
    /* loaded from: classes6.dex */
    public interface InterfaceC30107j<K, V, E extends InterfaceC30106i<K, V, E>, S extends AbstractC30111n<K, V, E, S>> {
        /* renamed from: a */
        void mo5460a(S s, E e, V v);

        /* renamed from: b */
        EnumC30113p mo5459b();

        /* renamed from: c */
        S mo5458c(ConcurrentMapC51543xK2<K, V, E, S> concurrentMapC51543xK2, int i, int i2);

        /* renamed from: d */
        EnumC30113p mo5457d();

        /* renamed from: e */
        E mo5456e(S s, K k, int i, E e);

        /* renamed from: f */
        E mo5455f(S s, E e, E e2);
    }

    /* renamed from: xK2$k */
    /* loaded from: classes6.dex */
    public final class C30108k extends ConcurrentMapC51543xK2<K, V, E, S>.AbstractC30105h<K> {
        public C30108k(ConcurrentMapC51543xK2 concurrentMapC51543xK2) {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return m5525c().getKey();
        }
    }

    /* renamed from: xK2$l */
    /* loaded from: classes6.dex */
    public final class C30109l extends AbstractC30110m<K> {
        public C30109l() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            ConcurrentMapC51543xK2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return ConcurrentMapC51543xK2.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return ConcurrentMapC51543xK2.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C30108k(ConcurrentMapC51543xK2.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return ConcurrentMapC51543xK2.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ConcurrentMapC51543xK2.this.size();
        }
    }

    /* renamed from: xK2$m */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC30110m<E> extends AbstractSet<E> {
        private AbstractC30110m() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return ConcurrentMapC51543xK2.m5541k(this).toArray();
        }

        public /* synthetic */ AbstractC30110m(C30098a c30098a) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) ConcurrentMapC51543xK2.m5541k(this).toArray(tArr);
        }
    }

    /* renamed from: xK2$n */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC30111n<K, V, E extends InterfaceC30106i<K, V, E>, S extends AbstractC30111n<K, V, E, S>> extends ReentrantLock {

        /* renamed from: b */
        public final ConcurrentMapC51543xK2<K, V, E, S> f117405b;

        /* renamed from: c */
        public volatile int f117406c;

        /* renamed from: d */
        public int f117407d;

        /* renamed from: e */
        public int f117408e;

        /* renamed from: f */
        public volatile AtomicReferenceArray<E> f117409f;

        /* renamed from: g */
        public final int f117410g;

        /* renamed from: h */
        public final AtomicInteger f117411h = new AtomicInteger();

        public AbstractC30111n(ConcurrentMapC51543xK2<K, V, E, S> concurrentMapC51543xK2, int i, int i2) {
            this.f117405b = concurrentMapC51543xK2;
            this.f117410g = i2;
            m5503m(m5501q(i));
        }

        /* renamed from: n */
        public static <K, V, E extends InterfaceC30106i<K, V, E>> boolean m5502n(E e) {
            return e.getValue() == null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: A */
        public boolean m5520A(K k, int i, V v, V v2) {
            lock();
            try {
                m5499s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f117409f;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC30106i interfaceC30106i = e; interfaceC30106i != null; interfaceC30106i = interfaceC30106i.mo5522a()) {
                    Object key = interfaceC30106i.getKey();
                    if (interfaceC30106i.mo5521c() == i && key != null && this.f117405b.f117375f.m86471d(k, key)) {
                        Object value = interfaceC30106i.getValue();
                        if (value == null) {
                            if (m5502n(interfaceC30106i)) {
                                this.f117407d++;
                                atomicReferenceArray.set(length, m5493y(e, interfaceC30106i));
                                this.f117406c--;
                            }
                            return false;
                        } else if (!this.f117405b.m5539m().m86471d(v, value)) {
                            return false;
                        } else {
                            this.f117407d++;
                            m5517E(interfaceC30106i, v2);
                            return true;
                        }
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        /* renamed from: B */
        public void m5519B() {
            m5518C();
        }

        /* renamed from: C */
        public void m5518C() {
            if (tryLock()) {
                try {
                    mo5444p();
                    this.f117411h.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: D */
        public abstract S mo5449D();

        /* renamed from: E */
        public void m5517E(E e, V v) {
            this.f117405b.f117376g.mo5460a(mo5449D(), e, v);
        }

        /* renamed from: F */
        public void m5516F() {
            if (tryLock()) {
                try {
                    mo5444p();
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: a */
        public void m5515a() {
            if (this.f117406c != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f117409f;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    mo5445o();
                    this.f117411h.set(0);
                    this.f117407d++;
                    this.f117406c = 0;
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: b */
        public <T> void m5514b(ReferenceQueue<T> referenceQueue) {
            do {
            } while (referenceQueue.poll() != null);
        }

        /* renamed from: c */
        public boolean m5513c(Object obj, int i) {
            try {
                boolean z = false;
                if (this.f117406c == 0) {
                    return false;
                }
                E m5505k = m5505k(obj, i);
                if (m5505k != null) {
                    if (m5505k.getValue() != null) {
                        z = true;
                    }
                }
                return z;
            } finally {
                m5500r();
            }
        }

        /* renamed from: d */
        public E m5512d(E e, E e2) {
            return this.f117405b.f117376g.mo5455f(mo5449D(), e, e2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: e */
        public void m5511e(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> poll = referenceQueue.poll();
                if (poll != null) {
                    this.f117405b.m5545g((InterfaceC30106i) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* renamed from: f */
        public void m5510f(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends V> poll = referenceQueue.poll();
                if (poll != null) {
                    this.f117405b.m5544h((InterfaceC30095B) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public void m5509g() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f117409f;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.f117406c;
            AtomicReferenceArray<E> atomicReferenceArray2 = (AtomicReferenceArray<E>) m5501q(length << 1);
            this.f117408e = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                E e = atomicReferenceArray.get(i2);
                if (e != null) {
                    InterfaceC30106i mo5522a = e.mo5522a();
                    int mo5521c = e.mo5521c() & length2;
                    if (mo5522a == null) {
                        atomicReferenceArray2.set(mo5521c, e);
                    } else {
                        InterfaceC30106i interfaceC30106i = e;
                        while (mo5522a != null) {
                            int mo5521c2 = mo5522a.mo5521c() & length2;
                            if (mo5521c2 != mo5521c) {
                                interfaceC30106i = mo5522a;
                                mo5521c = mo5521c2;
                            }
                            mo5522a = mo5522a.mo5522a();
                        }
                        atomicReferenceArray2.set(mo5521c, interfaceC30106i);
                        while (e != interfaceC30106i) {
                            int mo5521c3 = e.mo5521c() & length2;
                            InterfaceC30106i m5512d = m5512d(e, (InterfaceC30106i) atomicReferenceArray2.get(mo5521c3));
                            if (m5512d != null) {
                                atomicReferenceArray2.set(mo5521c3, m5512d);
                            } else {
                                i--;
                            }
                            e = e.mo5522a();
                        }
                    }
                }
            }
            this.f117409f = atomicReferenceArray2;
            this.f117406c = i;
        }

        /* renamed from: h */
        public V m5508h(Object obj, int i) {
            try {
                E m5505k = m5505k(obj, i);
                if (m5505k == null) {
                    m5500r();
                    return null;
                }
                V v = (V) m5505k.getValue();
                if (v == null) {
                    m5516F();
                }
                return v;
            } finally {
                m5500r();
            }
        }

        /* renamed from: i */
        public E m5507i(Object obj, int i) {
            if (this.f117406c != 0) {
                for (E m5506j = m5506j(i); m5506j != null; m5506j = (E) m5506j.mo5522a()) {
                    if (m5506j.mo5521c() == i) {
                        Object key = m5506j.getKey();
                        if (key == null) {
                            m5516F();
                        } else if (this.f117405b.f117375f.m86471d(obj, key)) {
                            return m5506j;
                        }
                    }
                }
                return null;
            }
            return null;
        }

        /* renamed from: j */
        public E m5506j(int i) {
            AtomicReferenceArray<E> atomicReferenceArray = this.f117409f;
            return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        /* renamed from: k */
        public E m5505k(Object obj, int i) {
            return m5507i(obj, i);
        }

        /* renamed from: l */
        public V m5504l(E e) {
            if (e.getKey() == null) {
                m5516F();
                return null;
            }
            V v = (V) e.getValue();
            if (v == null) {
                m5516F();
                return null;
            }
            return v;
        }

        /* renamed from: m */
        public void m5503m(AtomicReferenceArray<E> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f117408e = length;
            if (length == this.f117410g) {
                this.f117408e = length + 1;
            }
            this.f117409f = atomicReferenceArray;
        }

        /* renamed from: o */
        public void mo5445o() {
        }

        /* renamed from: p */
        public void mo5444p() {
        }

        /* renamed from: q */
        public AtomicReferenceArray<E> m5501q(int i) {
            return new AtomicReferenceArray<>(i);
        }

        /* renamed from: r */
        public void m5500r() {
            if ((this.f117411h.incrementAndGet() & 63) == 0) {
                m5519B();
            }
        }

        /* renamed from: s */
        public void m5499s() {
            m5518C();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: t */
        public V m5498t(K k, int i, V v, boolean z) {
            lock();
            try {
                m5499s();
                int i2 = this.f117406c + 1;
                if (i2 > this.f117408e) {
                    m5509g();
                    i2 = this.f117406c + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f117409f;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC30106i interfaceC30106i = e; interfaceC30106i != null; interfaceC30106i = interfaceC30106i.mo5522a()) {
                    Object key = interfaceC30106i.getKey();
                    if (interfaceC30106i.mo5521c() == i && key != null && this.f117405b.f117375f.m86471d(k, key)) {
                        V v2 = (V) interfaceC30106i.getValue();
                        if (v2 == null) {
                            this.f117407d++;
                            m5517E(interfaceC30106i, v);
                            this.f117406c = this.f117406c;
                            return null;
                        } else if (z) {
                            return v2;
                        } else {
                            this.f117407d++;
                            m5517E(interfaceC30106i, v);
                            return v2;
                        }
                    }
                }
                this.f117407d++;
                E mo5456e = this.f117405b.f117376g.mo5456e(mo5449D(), k, i, e);
                m5517E(mo5456e, v);
                atomicReferenceArray.set(length, mo5456e);
                this.f117406c = i2;
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: u */
        public boolean m5497u(E e, int i) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f117409f;
                int length = i & (atomicReferenceArray.length() - 1);
                E e2 = atomicReferenceArray.get(length);
                for (InterfaceC30106i interfaceC30106i = e2; interfaceC30106i != null; interfaceC30106i = interfaceC30106i.mo5522a()) {
                    if (interfaceC30106i == e) {
                        this.f117407d++;
                        atomicReferenceArray.set(length, m5493y(e2, interfaceC30106i));
                        this.f117406c--;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: v */
        public boolean m5496v(K k, int i, InterfaceC30095B<K, V, E> interfaceC30095B) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f117409f;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC30106i interfaceC30106i = e; interfaceC30106i != null; interfaceC30106i = interfaceC30106i.mo5522a()) {
                    Object key = interfaceC30106i.getKey();
                    if (interfaceC30106i.mo5521c() == i && key != null && this.f117405b.f117375f.m86471d(k, key)) {
                        if (((InterfaceC30094A) interfaceC30106i).mo5463b() != interfaceC30095B) {
                            return false;
                        }
                        this.f117407d++;
                        atomicReferenceArray.set(length, m5493y(e, interfaceC30106i));
                        this.f117406c--;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: w */
        public V m5495w(Object obj, int i) {
            lock();
            try {
                m5499s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f117409f;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC30106i interfaceC30106i = e; interfaceC30106i != null; interfaceC30106i = interfaceC30106i.mo5522a()) {
                    Object key = interfaceC30106i.getKey();
                    if (interfaceC30106i.mo5521c() == i && key != null && this.f117405b.f117375f.m86471d(obj, key)) {
                        V v = (V) interfaceC30106i.getValue();
                        if (v == null && !m5502n(interfaceC30106i)) {
                            return null;
                        }
                        this.f117407d++;
                        atomicReferenceArray.set(length, m5493y(e, interfaceC30106i));
                        this.f117406c--;
                        return v;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
            if (r8.f117405b.m5539m().m86471d(r11, r4.getValue()) == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
            if (m5502n(r4) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
            r8.f117407d++;
            r0.set(r1, m5493y(r3, r4));
            r8.f117406c--;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
            return false;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: x */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean m5494x(Object obj, int i, Object obj2) {
            lock();
            try {
                m5499s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f117409f;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                InterfaceC30106i interfaceC30106i = e;
                while (true) {
                    boolean z = false;
                    if (interfaceC30106i == null) {
                        return false;
                    }
                    Object key = interfaceC30106i.getKey();
                    if (interfaceC30106i.mo5521c() == i && key != null && this.f117405b.f117375f.m86471d(obj, key)) {
                        break;
                    }
                    interfaceC30106i = interfaceC30106i.mo5522a();
                }
            } finally {
                unlock();
            }
        }

        /* renamed from: y */
        public E m5493y(E e, E e2) {
            int i = this.f117406c;
            E e3 = (E) e2.mo5522a();
            while (e != e2) {
                E m5512d = m5512d(e, e3);
                if (m5512d != null) {
                    e3 = m5512d;
                } else {
                    i--;
                }
                e = (E) e.mo5522a();
            }
            this.f117406c = i;
            return e3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: z */
        public V m5492z(K k, int i, V v) {
            lock();
            try {
                m5499s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f117409f;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InterfaceC30106i interfaceC30106i = e; interfaceC30106i != null; interfaceC30106i = interfaceC30106i.mo5522a()) {
                    Object key = interfaceC30106i.getKey();
                    if (interfaceC30106i.mo5521c() == i && key != null && this.f117405b.f117375f.m86471d(k, key)) {
                        V v2 = (V) interfaceC30106i.getValue();
                        if (v2 == null) {
                            if (m5502n(interfaceC30106i)) {
                                this.f117407d++;
                                atomicReferenceArray.set(length, m5493y(e, interfaceC30106i));
                                this.f117406c--;
                            }
                            return null;
                        }
                        this.f117407d++;
                        m5517E(interfaceC30106i, v);
                        return v2;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }
    }

    /* renamed from: xK2$o */
    /* loaded from: classes6.dex */
    public static final class C30112o<K, V> extends AbstractC30099b<K, V> {
        private static final long serialVersionUID = 3;

        public C30112o(EnumC30113p enumC30113p, EnumC30113p enumC30113p2, AbstractC35637Rf1<Object> abstractC35637Rf1, AbstractC35637Rf1<Object> abstractC35637Rf12, int i, ConcurrentMap<K, V> concurrentMap) {
            super(enumC30113p, enumC30113p2, abstractC35637Rf1, abstractC35637Rf12, i, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f117389g = m5531e(objectInputStream).m6996i();
            m5532c(objectInputStream);
        }

        private Object readResolve() {
            return this.f117389g;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            m5530f(objectOutputStream);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: xK2$p */
    /* loaded from: classes6.dex */
    public static abstract class EnumC30113p {

        /* renamed from: b */
        public static final EnumC30113p f117412b = new C30114a("STRONG", 0);

        /* renamed from: c */
        public static final EnumC30113p f117413c = new C30115b("WEAK", 1);

        /* renamed from: d */
        public static final /* synthetic */ EnumC30113p[] f117414d = m5491a();

        /* renamed from: xK2$p$a */
        /* loaded from: classes6.dex */
        public enum C30114a extends EnumC30113p {
            public C30114a(String str, int i) {
                super(str, i, null);
            }

            @Override // p000.ConcurrentMapC51543xK2.EnumC30113p
            /* renamed from: b */
            public AbstractC35637Rf1<Object> mo5490b() {
                return AbstractC35637Rf1.m86472c();
            }
        }

        /* renamed from: xK2$p$b */
        /* loaded from: classes6.dex */
        public enum C30115b extends EnumC30113p {
            public C30115b(String str, int i) {
                super(str, i, null);
            }

            @Override // p000.ConcurrentMapC51543xK2.EnumC30113p
            /* renamed from: b */
            public AbstractC35637Rf1<Object> mo5490b() {
                return AbstractC35637Rf1.m86469f();
            }
        }

        public EnumC30113p(String str, int i) {
        }

        /* renamed from: a */
        public static /* synthetic */ EnumC30113p[] m5491a() {
            return new EnumC30113p[]{f117412b, f117413c};
        }

        public static EnumC30113p valueOf(String str) {
            return (EnumC30113p) Enum.valueOf(EnumC30113p.class, str);
        }

        public static EnumC30113p[] values() {
            return (EnumC30113p[]) f117414d.clone();
        }

        /* renamed from: b */
        public abstract AbstractC35637Rf1<Object> mo5490b();

        public /* synthetic */ EnumC30113p(String str, int i, C30098a c30098a) {
            this(str, i);
        }
    }

    /* renamed from: xK2$q */
    /* loaded from: classes6.dex */
    public static final class C30116q<K, V> extends AbstractC30100c<K, V, C30116q<K, V>> {

        /* renamed from: d */
        public volatile V f117415d;

        /* renamed from: xK2$q$a */
        /* loaded from: classes6.dex */
        public static final class C30117a<K, V> implements InterfaceC30107j<K, V, C30116q<K, V>, C30118r<K, V>> {

            /* renamed from: a */
            public static final C30117a<?, ?> f117416a = new C30117a<>();

            /* renamed from: h */
            public static <K, V> C30117a<K, V> m5486h() {
                return (C30117a<K, V>) f117416a;
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: b */
            public EnumC30113p mo5459b() {
                return EnumC30113p.f117412b;
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: d */
            public EnumC30113p mo5457d() {
                return EnumC30113p.f117412b;
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: g */
            public C30116q<K, V> mo5455f(C30118r<K, V> c30118r, C30116q<K, V> c30116q, C30116q<K, V> c30116q2) {
                return c30116q.m5489d(c30116q2);
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: i */
            public C30116q<K, V> mo5456e(C30118r<K, V> c30118r, K k, int i, C30116q<K, V> c30116q) {
                return new C30116q<>(k, i, c30116q);
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: j */
            public C30118r<K, V> mo5458c(ConcurrentMapC51543xK2<K, V, C30116q<K, V>, C30118r<K, V>> concurrentMapC51543xK2, int i, int i2) {
                return new C30118r<>(concurrentMapC51543xK2, i, i2);
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: k */
            public void mo5460a(C30118r<K, V> c30118r, C30116q<K, V> c30116q, V v) {
                c30116q.m5488e(v);
            }
        }

        public C30116q(K k, int i, C30116q<K, V> c30116q) {
            super(k, i, c30116q);
            this.f117415d = null;
        }

        /* renamed from: d */
        public C30116q<K, V> m5489d(C30116q<K, V> c30116q) {
            C30116q<K, V> c30116q2 = new C30116q<>(this.f117390a, this.f117391b, c30116q);
            c30116q2.f117415d = this.f117415d;
            return c30116q2;
        }

        /* renamed from: e */
        public void m5488e(V v) {
            this.f117415d = v;
        }

        @Override // p000.ConcurrentMapC51543xK2.InterfaceC30106i
        public V getValue() {
            return this.f117415d;
        }
    }

    /* renamed from: xK2$r */
    /* loaded from: classes6.dex */
    public static final class C30118r<K, V> extends AbstractC30111n<K, V, C30116q<K, V>, C30118r<K, V>> {
        public C30118r(ConcurrentMapC51543xK2<K, V, C30116q<K, V>, C30118r<K, V>> concurrentMapC51543xK2, int i, int i2) {
            super(concurrentMapC51543xK2, i, i2);
        }

        @Override // p000.ConcurrentMapC51543xK2.AbstractC30111n
        /* renamed from: H */
        public C30118r<K, V> mo5449D() {
            return this;
        }
    }

    /* renamed from: xK2$s */
    /* loaded from: classes6.dex */
    public static final class C30119s<K, V> extends AbstractC30100c<K, V, C30119s<K, V>> implements InterfaceC30094A<K, V, C30119s<K, V>> {

        /* renamed from: d */
        public volatile InterfaceC30095B<K, V, C30119s<K, V>> f117417d;

        /* renamed from: xK2$s$a */
        /* loaded from: classes6.dex */
        public static final class C30120a<K, V> implements InterfaceC30107j<K, V, C30119s<K, V>, C30121t<K, V>> {

            /* renamed from: a */
            public static final C30120a<?, ?> f117418a = new C30120a<>();

            /* renamed from: h */
            public static <K, V> C30120a<K, V> m5478h() {
                return (C30120a<K, V>) f117418a;
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: b */
            public EnumC30113p mo5459b() {
                return EnumC30113p.f117412b;
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: d */
            public EnumC30113p mo5457d() {
                return EnumC30113p.f117413c;
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: g */
            public C30119s<K, V> mo5455f(C30121t<K, V> c30121t, C30119s<K, V> c30119s, C30119s<K, V> c30119s2) {
                if (AbstractC30111n.m5502n(c30119s)) {
                    return null;
                }
                return c30119s.m5481d(c30121t.f117419i, c30119s2);
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: i */
            public C30119s<K, V> mo5456e(C30121t<K, V> c30121t, K k, int i, C30119s<K, V> c30119s) {
                return new C30119s<>(k, i, c30119s);
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: j */
            public C30121t<K, V> mo5458c(ConcurrentMapC51543xK2<K, V, C30119s<K, V>, C30121t<K, V>> concurrentMapC51543xK2, int i, int i2) {
                return new C30121t<>(concurrentMapC51543xK2, i, i2);
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: k */
            public void mo5460a(C30121t<K, V> c30121t, C30119s<K, V> c30119s, V v) {
                c30119s.m5480e(v, c30121t.f117419i);
            }
        }

        public C30119s(K k, int i, C30119s<K, V> c30119s) {
            super(k, i, c30119s);
            this.f117417d = ConcurrentMapC51543xK2.m5540l();
        }

        @Override // p000.ConcurrentMapC51543xK2.InterfaceC30094A
        /* renamed from: b */
        public InterfaceC30095B<K, V, C30119s<K, V>> mo5463b() {
            return this.f117417d;
        }

        /* renamed from: d */
        public C30119s<K, V> m5481d(ReferenceQueue<V> referenceQueue, C30119s<K, V> c30119s) {
            C30119s<K, V> c30119s2 = new C30119s<>(this.f117390a, this.f117391b, c30119s);
            c30119s2.f117417d = this.f117417d.mo5538a(referenceQueue, c30119s2);
            return c30119s2;
        }

        /* renamed from: e */
        public void m5480e(V v, ReferenceQueue<V> referenceQueue) {
            InterfaceC30095B<K, V, C30119s<K, V>> interfaceC30095B = this.f117417d;
            this.f117417d = new C30096C(referenceQueue, v, this);
            interfaceC30095B.clear();
        }

        @Override // p000.ConcurrentMapC51543xK2.InterfaceC30106i
        public V getValue() {
            return this.f117417d.get();
        }
    }

    /* renamed from: xK2$t */
    /* loaded from: classes6.dex */
    public static final class C30121t<K, V> extends AbstractC30111n<K, V, C30119s<K, V>, C30121t<K, V>> {

        /* renamed from: i */
        public final ReferenceQueue<V> f117419i;

        public C30121t(ConcurrentMapC51543xK2<K, V, C30119s<K, V>, C30121t<K, V>> concurrentMapC51543xK2, int i, int i2) {
            super(concurrentMapC51543xK2, i, i2);
            this.f117419i = new ReferenceQueue<>();
        }

        @Override // p000.ConcurrentMapC51543xK2.AbstractC30111n
        /* renamed from: I */
        public C30121t<K, V> mo5449D() {
            return this;
        }

        @Override // p000.ConcurrentMapC51543xK2.AbstractC30111n
        /* renamed from: o */
        public void mo5445o() {
            m5514b((ReferenceQueue<V>) this.f117419i);
        }

        @Override // p000.ConcurrentMapC51543xK2.AbstractC30111n
        /* renamed from: p */
        public void mo5444p() {
            m5510f(this.f117419i);
        }
    }

    /* renamed from: xK2$u */
    /* loaded from: classes6.dex */
    public final class C30122u extends ConcurrentMapC51543xK2<K, V, E, S>.AbstractC30105h<V> {
        public C30122u(ConcurrentMapC51543xK2 concurrentMapC51543xK2) {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return m5525c().getValue();
        }
    }

    /* renamed from: xK2$v */
    /* loaded from: classes6.dex */
    public final class C30123v extends AbstractCollection<V> {
        public C30123v() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ConcurrentMapC51543xK2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ConcurrentMapC51543xK2.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return ConcurrentMapC51543xK2.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C30122u(ConcurrentMapC51543xK2.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return ConcurrentMapC51543xK2.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return ConcurrentMapC51543xK2.m5541k(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) ConcurrentMapC51543xK2.m5541k(this).toArray(tArr);
        }
    }

    /* renamed from: xK2$w */
    /* loaded from: classes6.dex */
    public static final class C30124w<K, V> extends AbstractC30101d<K, V, C30124w<K, V>> {

        /* renamed from: c */
        public volatile V f117421c;

        /* renamed from: xK2$w$a */
        /* loaded from: classes6.dex */
        public static final class C30125a<K, V> implements InterfaceC30107j<K, V, C30124w<K, V>, C30126x<K, V>> {

            /* renamed from: a */
            public static final C30125a<?, ?> f117422a = new C30125a<>();

            /* renamed from: h */
            public static <K, V> C30125a<K, V> m5469h() {
                return (C30125a<K, V>) f117422a;
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: b */
            public EnumC30113p mo5459b() {
                return EnumC30113p.f117413c;
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: d */
            public EnumC30113p mo5457d() {
                return EnumC30113p.f117412b;
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: g */
            public C30124w<K, V> mo5455f(C30126x<K, V> c30126x, C30124w<K, V> c30124w, C30124w<K, V> c30124w2) {
                if (c30124w.getKey() == null) {
                    return null;
                }
                return c30124w.m5472d(c30126x.f117423i, c30124w2);
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: i */
            public C30124w<K, V> mo5456e(C30126x<K, V> c30126x, K k, int i, C30124w<K, V> c30124w) {
                return new C30124w<>(c30126x.f117423i, k, i, c30124w);
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: j */
            public C30126x<K, V> mo5458c(ConcurrentMapC51543xK2<K, V, C30124w<K, V>, C30126x<K, V>> concurrentMapC51543xK2, int i, int i2) {
                return new C30126x<>(concurrentMapC51543xK2, i, i2);
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: k */
            public void mo5460a(C30126x<K, V> c30126x, C30124w<K, V> c30124w, V v) {
                c30124w.m5471e(v);
            }
        }

        public C30124w(ReferenceQueue<K> referenceQueue, K k, int i, C30124w<K, V> c30124w) {
            super(referenceQueue, k, i, c30124w);
            this.f117421c = null;
        }

        /* renamed from: d */
        public C30124w<K, V> m5472d(ReferenceQueue<K> referenceQueue, C30124w<K, V> c30124w) {
            C30124w<K, V> c30124w2 = new C30124w<>(referenceQueue, getKey(), this.f117393a, c30124w);
            c30124w2.m5471e(this.f117421c);
            return c30124w2;
        }

        /* renamed from: e */
        public void m5471e(V v) {
            this.f117421c = v;
        }

        @Override // p000.ConcurrentMapC51543xK2.InterfaceC30106i
        public V getValue() {
            return this.f117421c;
        }
    }

    /* renamed from: xK2$x */
    /* loaded from: classes6.dex */
    public static final class C30126x<K, V> extends AbstractC30111n<K, V, C30124w<K, V>, C30126x<K, V>> {

        /* renamed from: i */
        public final ReferenceQueue<K> f117423i;

        public C30126x(ConcurrentMapC51543xK2<K, V, C30124w<K, V>, C30126x<K, V>> concurrentMapC51543xK2, int i, int i2) {
            super(concurrentMapC51543xK2, i, i2);
            this.f117423i = new ReferenceQueue<>();
        }

        @Override // p000.ConcurrentMapC51543xK2.AbstractC30111n
        /* renamed from: I */
        public C30126x<K, V> mo5449D() {
            return this;
        }

        @Override // p000.ConcurrentMapC51543xK2.AbstractC30111n
        /* renamed from: o */
        public void mo5445o() {
            m5514b((ReferenceQueue<K>) this.f117423i);
        }

        @Override // p000.ConcurrentMapC51543xK2.AbstractC30111n
        /* renamed from: p */
        public void mo5444p() {
            m5511e(this.f117423i);
        }
    }

    /* renamed from: xK2$y */
    /* loaded from: classes6.dex */
    public static final class C30127y<K, V> extends AbstractC30101d<K, V, C30127y<K, V>> implements InterfaceC30094A<K, V, C30127y<K, V>> {

        /* renamed from: c */
        public volatile InterfaceC30095B<K, V, C30127y<K, V>> f117424c;

        /* renamed from: xK2$y$a */
        /* loaded from: classes6.dex */
        public static final class C30128a<K, V> implements InterfaceC30107j<K, V, C30127y<K, V>, C30129z<K, V>> {

            /* renamed from: a */
            public static final C30128a<?, ?> f117425a = new C30128a<>();

            /* renamed from: h */
            public static <K, V> C30128a<K, V> m5453h() {
                return (C30128a<K, V>) f117425a;
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: b */
            public EnumC30113p mo5459b() {
                return EnumC30113p.f117413c;
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: d */
            public EnumC30113p mo5457d() {
                return EnumC30113p.f117413c;
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: g */
            public C30127y<K, V> mo5455f(C30129z<K, V> c30129z, C30127y<K, V> c30127y, C30127y<K, V> c30127y2) {
                if (c30127y.getKey() == null || AbstractC30111n.m5502n(c30127y)) {
                    return null;
                }
                return c30127y.m5462d(c30129z.f117426i, c30129z.f117427j, c30127y2);
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: i */
            public C30127y<K, V> mo5456e(C30129z<K, V> c30129z, K k, int i, C30127y<K, V> c30127y) {
                return new C30127y<>(c30129z.f117426i, k, i, c30127y);
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: j */
            public C30129z<K, V> mo5458c(ConcurrentMapC51543xK2<K, V, C30127y<K, V>, C30129z<K, V>> concurrentMapC51543xK2, int i, int i2) {
                return new C30129z<>(concurrentMapC51543xK2, i, i2);
            }

            @Override // p000.ConcurrentMapC51543xK2.InterfaceC30107j
            /* renamed from: k */
            public void mo5460a(C30129z<K, V> c30129z, C30127y<K, V> c30127y, V v) {
                c30127y.m5461e(v, c30129z.f117427j);
            }
        }

        public C30127y(ReferenceQueue<K> referenceQueue, K k, int i, C30127y<K, V> c30127y) {
            super(referenceQueue, k, i, c30127y);
            this.f117424c = ConcurrentMapC51543xK2.m5540l();
        }

        @Override // p000.ConcurrentMapC51543xK2.InterfaceC30094A
        /* renamed from: b */
        public InterfaceC30095B<K, V, C30127y<K, V>> mo5463b() {
            return this.f117424c;
        }

        /* renamed from: d */
        public C30127y<K, V> m5462d(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, C30127y<K, V> c30127y) {
            C30127y<K, V> c30127y2 = new C30127y<>(referenceQueue, getKey(), this.f117393a, c30127y);
            c30127y2.f117424c = this.f117424c.mo5538a(referenceQueue2, c30127y2);
            return c30127y2;
        }

        /* renamed from: e */
        public void m5461e(V v, ReferenceQueue<V> referenceQueue) {
            InterfaceC30095B<K, V, C30127y<K, V>> interfaceC30095B = this.f117424c;
            this.f117424c = new C30096C(referenceQueue, v, this);
            interfaceC30095B.clear();
        }

        @Override // p000.ConcurrentMapC51543xK2.InterfaceC30106i
        public V getValue() {
            return this.f117424c.get();
        }
    }

    /* renamed from: xK2$z */
    /* loaded from: classes6.dex */
    public static final class C30129z<K, V> extends AbstractC30111n<K, V, C30127y<K, V>, C30129z<K, V>> {

        /* renamed from: i */
        public final ReferenceQueue<K> f117426i;

        /* renamed from: j */
        public final ReferenceQueue<V> f117427j;

        public C30129z(ConcurrentMapC51543xK2<K, V, C30127y<K, V>, C30129z<K, V>> concurrentMapC51543xK2, int i, int i2) {
            super(concurrentMapC51543xK2, i, i2);
            this.f117426i = new ReferenceQueue<>();
            this.f117427j = new ReferenceQueue<>();
        }

        @Override // p000.ConcurrentMapC51543xK2.AbstractC30111n
        /* renamed from: J */
        public C30129z<K, V> mo5449D() {
            return this;
        }

        @Override // p000.ConcurrentMapC51543xK2.AbstractC30111n
        /* renamed from: o */
        public void mo5445o() {
            m5514b((ReferenceQueue<K>) this.f117426i);
        }

        @Override // p000.ConcurrentMapC51543xK2.AbstractC30111n
        /* renamed from: p */
        public void mo5444p() {
            m5511e(this.f117426i);
            m5510f(this.f117427j);
        }
    }

    public ConcurrentMapC51543xK2(C50950wK2 c50950wK2, InterfaceC30107j<K, V, E, S> interfaceC30107j) {
        this.f117374e = Math.min(c50950wK2.m7003b(), 65536);
        this.f117375f = c50950wK2.m7001d();
        this.f117376g = interfaceC30107j;
        int min = Math.min(c50950wK2.m7002c(), 1073741824);
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 < this.f117374e) {
            i3++;
            i4 <<= 1;
        }
        this.f117372c = 32 - i3;
        this.f117371b = i4 - 1;
        this.f117373d = m5546f(i4);
        int i5 = min / i4;
        while (i2 < (i4 * i5 < min ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        while (true) {
            AbstractC30111n<K, V, E, S>[] abstractC30111nArr = this.f117373d;
            if (i < abstractC30111nArr.length) {
                abstractC30111nArr[i] = m5549c(i2, -1);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static <K, V> ConcurrentMapC51543xK2<K, V, ? extends InterfaceC30106i<K, V, ?>, ?> m5550b(C50950wK2 c50950wK2) {
        EnumC30113p m7000e = c50950wK2.m7000e();
        EnumC30113p enumC30113p = EnumC30113p.f117412b;
        if (m7000e == enumC30113p && c50950wK2.m6999f() == enumC30113p) {
            return new ConcurrentMapC51543xK2<>(c50950wK2, C30116q.C30117a.m5486h());
        }
        if (c50950wK2.m7000e() == enumC30113p && c50950wK2.m6999f() == EnumC30113p.f117413c) {
            return new ConcurrentMapC51543xK2<>(c50950wK2, C30119s.C30120a.m5478h());
        }
        EnumC30113p m7000e2 = c50950wK2.m7000e();
        EnumC30113p enumC30113p2 = EnumC30113p.f117413c;
        if (m7000e2 == enumC30113p2 && c50950wK2.m6999f() == enumC30113p) {
            return new ConcurrentMapC51543xK2<>(c50950wK2, C30124w.C30125a.m5469h());
        }
        if (c50950wK2.m7000e() == enumC30113p2 && c50950wK2.m6999f() == enumC30113p2) {
            return new ConcurrentMapC51543xK2<>(c50950wK2, C30127y.C30128a.m5453h());
        }
        throw new AssertionError();
    }

    /* renamed from: i */
    public static int m5543i(int i) {
        int i2 = i + ((i << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* renamed from: k */
    public static <E> ArrayList<E> m5541k(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        C52933zg2.m597a(arrayList, collection.iterator());
        return arrayList;
    }

    /* renamed from: l */
    public static <K, V, E extends InterfaceC30106i<K, V, E>> InterfaceC30095B<K, V, E> m5540l() {
        return (InterfaceC30095B<K, V, E>) f117370k;
    }

    /* renamed from: c */
    public AbstractC30111n<K, V, E, S> m5549c(int i, int i2) {
        return (S) this.f117376g.mo5458c(this, i, i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (AbstractC30111n<K, V, E, S> abstractC30111n : this.f117373d) {
            abstractC30111n.m5515a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int m5547e = m5547e(obj);
        return m5542j(m5547e).m5513c(obj, m5547e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v0, types: [xK2$n] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [xK2$n<K, V, E extends xK2$i<K, V, E>, S extends xK2$n<K, V, E, S>>[]] */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        AbstractC30111n<K, V, E, S>[] abstractC30111nArr = this.f117373d;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = abstractC30111nArr.length;
            long j2 = 0;
            for (int i2 = z; i2 < length; i2++) {
                ?? r11 = abstractC30111nArr[i2];
                int i3 = r11.f117406c;
                AtomicReferenceArray<E> atomicReferenceArray = r11.f117409f;
                for (int i4 = z; i4 < atomicReferenceArray.length(); i4++) {
                    for (E e = atomicReferenceArray.get(i4); e != null; e = e.mo5522a()) {
                        Object m5504l = r11.m5504l(e);
                        if (m5504l != null && m5539m().m86471d(obj, m5504l)) {
                            return true;
                        }
                    }
                }
                j2 += r11.f117407d;
                z = false;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            z = false;
        }
        return z;
    }

    /* renamed from: d */
    public V m5548d(E e) {
        if (e.getKey() == null) {
            return null;
        }
        return (V) e.getValue();
    }

    /* renamed from: e */
    public int m5547e(Object obj) {
        return m5543i(this.f117375f.m86470e(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f117379j;
        if (set == null) {
            C30104g c30104g = new C30104g();
            this.f117379j = c30104g;
            return c30104g;
        }
        return set;
    }

    /* renamed from: f */
    public final AbstractC30111n<K, V, E, S>[] m5546f(int i) {
        return new AbstractC30111n[i];
    }

    /* renamed from: g */
    public void m5545g(E e) {
        int mo5521c = e.mo5521c();
        m5542j(mo5521c).m5497u(e, mo5521c);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int m5547e = m5547e(obj);
        return m5542j(m5547e).m5508h(obj, m5547e);
    }

    /* renamed from: h */
    public void m5544h(InterfaceC30095B<K, V, E> interfaceC30095B) {
        E mo5537b = interfaceC30095B.mo5537b();
        int mo5521c = mo5537b.mo5521c();
        m5542j(mo5521c).m5496v((K) mo5537b.getKey(), mo5521c, interfaceC30095B);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        AbstractC30111n<K, V, E, S>[] abstractC30111nArr = this.f117373d;
        long j = 0;
        for (int i = 0; i < abstractC30111nArr.length; i++) {
            if (abstractC30111nArr[i].f117406c != 0) {
                return false;
            }
            j += abstractC30111nArr[i].f117407d;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < abstractC30111nArr.length; i2++) {
            if (abstractC30111nArr[i2].f117406c != 0) {
                return false;
            }
            j -= abstractC30111nArr[i2].f117407d;
        }
        if (j != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public AbstractC30111n<K, V, E, S> m5542j(int i) {
        return this.f117373d[(i >>> this.f117372c) & this.f117371b];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f117377h;
        if (set == null) {
            C30109l c30109l = new C30109l();
            this.f117377h = c30109l;
            return c30109l;
        }
        return set;
    }

    /* renamed from: m */
    public AbstractC35637Rf1<Object> m5539m() {
        return this.f117376g.mo5457d().mo5490b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        EZ3.m108801n(k);
        EZ3.m108801n(v);
        int m5547e = m5547e(k);
        return m5542j(m5547e).m5498t(k, m5547e, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k, V v) {
        EZ3.m108801n(k);
        EZ3.m108801n(v);
        int m5547e = m5547e(k);
        return m5542j(m5547e).m5498t(k, m5547e, v, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int m5547e = m5547e(obj);
        return m5542j(m5547e).m5495w(obj, m5547e);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k, V v, V v2) {
        EZ3.m108801n(k);
        EZ3.m108801n(v2);
        if (v == null) {
            return false;
        }
        int m5547e = m5547e(k);
        return m5542j(m5547e).m5520A(k, m5547e, v, v2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j = 0;
        for (AbstractC30111n<K, V, E, S> abstractC30111n : this.f117373d) {
            j += abstractC30111n.f117406c;
        }
        return C41344g72.m39991b(j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f117378i;
        if (collection == null) {
            C30123v c30123v = new C30123v();
            this.f117378i = c30123v;
            return c30123v;
        }
        return collection;
    }

    public Object writeReplace() {
        return new C30112o(this.f117376g.mo5459b(), this.f117376g.mo5457d(), this.f117375f, this.f117376g.mo5457d().mo5490b(), this.f117374e, this);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int m5547e = m5547e(obj);
        return m5542j(m5547e).m5494x(obj, m5547e, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k, V v) {
        EZ3.m108801n(k);
        EZ3.m108801n(v);
        int m5547e = m5547e(k);
        return m5542j(m5547e).m5492z(k, m5547e, v);
    }
}
