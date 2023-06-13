package p000;

import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableList;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0017J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u0006J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fH&J%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0011\u001a\u00020\u0010H&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, m28432d2 = {"LER3;", "E", "LUY1;", "", "element", "add", "(Ljava/lang/Object;)LER3;", "", "elements", "addAll", "remove", "removeAll", "Lkotlin/Function1;", "", "predicate", "b1", "", "index", "set", "(ILjava/lang/Object;)LER3;", "U1", "LER3$a;", "builder", C17296a.f69688o, "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ER3 */
/* loaded from: classes.dex */
public interface ER3<E> extends UY1<E>, RY1 {

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m28432d2 = {"LER3$a;", "E", "", "", "LER3;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ER3$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1825a<E> extends List<E>, Collection, KMutableCollection, KMutableList {
        ER3<E> build();
    }

    /* renamed from: U1 */
    ER3<E> mo16173U1(int i);

    @Override // java.util.List
    ER3<E> add(int i, E e);

    @Override // java.util.List, java.util.Collection
    ER3<E> add(E e);

    @Override // java.util.List, java.util.Collection
    ER3<E> addAll(Collection<? extends E> collection);

    /* renamed from: b1 */
    ER3<E> mo16170b1(Function1<? super E, Boolean> function1);

    InterfaceC1825a<E> builder();

    @Override // java.util.List, java.util.Collection
    ER3<E> remove(E e);

    @Override // java.util.List, java.util.Collection
    ER3<E> removeAll(Collection<? extends E> collection);

    @Override // java.util.List
    ER3<E> set(int i, E e);
}
