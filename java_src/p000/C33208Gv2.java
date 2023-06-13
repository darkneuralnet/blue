package p000;

import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import p000.JR3;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0016\u0010\u000b\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\bH\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LGv2;", "LJR3;", "Ljava/util/Locale;", "key", "u", "", "e", "element", "", "y", "elements", "f", "s", C17296a.f69688o, "LMj6;", "b", "LMj6;", "valueSetStore", "<init>", "(LMj6;)V", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Gv2  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33208Gv2 implements JR3<Locale> {

    /* renamed from: b */
    public final InterfaceC34508Mj6<Locale> f12616b;

    public C33208Gv2(InterfaceC34508Mj6<Locale> valueSetStore) {
        Intrinsics.checkNotNullParameter(valueSetStore, "valueSetStore");
        this.f12616b = valueSetStore;
    }

    @Override // p000.InterfaceC34508Mj6
    /* renamed from: a */
    public void mo40385a() {
        this.f12616b.mo40385a();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends Locale> collection) {
        return JR3.C4083a.m100476b(this, collection);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        JR3.C4083a.m100475c(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Locale) {
            return m104592o((Locale) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        return JR3.C4083a.m100473e(this, collection);
    }

    @Override // p000.InterfaceC34508Mj6
    /* renamed from: e */
    public Collection<Locale> mo40382e() {
        return this.f12616b.mo40382e();
    }

    @Override // p000.InterfaceC34508Mj6
    /* renamed from: f */
    public void mo40381f(Collection<Locale> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f12616b.mo40381f(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return JR3.C4083a.m100470h(this);
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Locale> iterator() {
        return JR3.C4083a.m100469i(this);
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: j */
    public boolean add(Locale locale) {
        return JR3.C4083a.m100477a(this, locale);
    }

    /* renamed from: o */
    public boolean m104592o(Locale locale) {
        return JR3.C4083a.m100474d(this, locale);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Locale) {
            return m104587x((Locale) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        return JR3.C4083a.m100467k(this, collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        return JR3.C4083a.m100466l(this, collection);
    }

    @Override // p000.InterfaceC34508Mj6
    /* renamed from: s */
    public void mo40384b(Locale element) {
        Intrinsics.checkNotNullParameter(element, "element");
        this.f12616b.mo40384b(element);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return m104589v();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // p000.InterfaceC34508Mj6
    /* renamed from: u */
    public Locale mo40383c(Locale key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f12616b.mo40383c(key);
    }

    /* renamed from: v */
    public int m104589v() {
        return JR3.C4083a.m100472f(this);
    }

    @Override // kotlin.properties.ReadOnlyProperty
    /* renamed from: w */
    public Set<Locale> getValue(Object obj, KProperty<?> kProperty) {
        return JR3.C4083a.m100471g(this, obj, kProperty);
    }

    /* renamed from: x */
    public boolean m104587x(Locale locale) {
        return JR3.C4083a.m100468j(this, locale);
    }

    @Override // p000.InterfaceC34508Mj6
    /* renamed from: y */
    public void mo40380h(Locale element) {
        Intrinsics.checkNotNullParameter(element, "element");
        this.f12616b.mo40380h(element);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }
}
