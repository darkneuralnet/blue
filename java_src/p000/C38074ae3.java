package p000;

import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0007J\b\u0010\n\u001a\u00020\tH\u0016J\u0016\u0010\r\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J\u0016\u0010\u000e\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J\u0016\u0010\u000f\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016R.\u0010\u0015\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0012*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00110\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R#\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Lae3;", "E", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "element", "", "add", "(Ljava/lang/Object;)Z", "remove", "", "clear", "", "elements", "addAll", "removeAll", "retainAll", "Lio/reactivex/subjects/d;", "", "kotlin.jvm.PlatformType", "b", "Lio/reactivex/subjects/d;", "hashSetSubject", "Lio/reactivex/Observable;", "c", "Lio/reactivex/Observable;", "e", "()Lio/reactivex/Observable;", "observable", "<init>", "()V", "foreground-service_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ae3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38074ae3<E> extends HashSet<E> {

    /* renamed from: b */
    public final C24558d<Set<E>> f50859b;

    /* renamed from: c */
    public final Observable<Set<E>> f50860c;

    public C38074ae3() {
        C24558d<Set<E>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Set<E>>()");
        this.f50859b = m31902e;
        Observable<Set<E>> hide = m31902e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "hashSetSubject.hide()");
        this.f50860c = hide;
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        Set<E> set;
        boolean add = super.add(e);
        C24558d<Set<E>> c24558d = this.f50859b;
        set = CollectionsKt___CollectionsKt.toSet(this);
        c24558d.onNext(set);
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        Set<E> set;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean addAll = super.addAll(elements);
        C24558d<Set<E>> c24558d = this.f50859b;
        set = CollectionsKt___CollectionsKt.toSet(this);
        c24558d.onNext(set);
        return addAll;
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        Set<E> set;
        super.clear();
        Unit unit = Unit.INSTANCE;
        C24558d<Set<E>> c24558d = this.f50859b;
        set = CollectionsKt___CollectionsKt.toSet(this);
        c24558d.onNext(set);
    }

    /* renamed from: e */
    public final Observable<Set<E>> m70982e() {
        return this.f50860c;
    }

    /* renamed from: f */
    public /* bridge */ int m70981f() {
        return super.size();
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Set<E> set;
        boolean remove = super.remove(obj);
        C24558d<Set<E>> c24558d = this.f50859b;
        set = CollectionsKt___CollectionsKt.toSet(this);
        c24558d.onNext(set);
        return remove;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        Set<E> set;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean removeAll = super.removeAll(elements);
        C24558d<Set<E>> c24558d = this.f50859b;
        set = CollectionsKt___CollectionsKt.toSet(this);
        c24558d.onNext(set);
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        Set<E> set;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean retainAll = super.retainAll(elements);
        C24558d<Set<E>> c24558d = this.f50859b;
        set = CollectionsKt___CollectionsKt.toSet(this);
        c24558d.onNext(set);
        return retainAll;
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return m70981f();
    }
}
