package p000;

import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.ER3;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010*\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0000\u0018\u0000 (*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001)B\u0017\u0012\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e¢\u0006\u0004\b&\u0010'J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000bH\u0016J%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u0011J\u001f\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010!R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010\u001d\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006*"}, m28432d2 = {"LrE5;", "E", "LUY1;", "La1;", "element", "LER3;", "add", "(Ljava/lang/Object;)LER3;", "", "elements", "addAll", "Lkotlin/Function1;", "", "predicate", "b1", "", "index", "(ILjava/lang/Object;)LER3;", "U1", "LER3$a;", "builder", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "get", "(I)Ljava/lang/Object;", "set", "size", "", "", "b", "(I)[Ljava/lang/Object;", "[Ljava/lang/Object;", "buffer", "getSize", "()I", "<init>", "([Ljava/lang/Object;)V", "c", C17296a.f69688o, "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSmallPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,161:1\n41#2:162\n41#2:163\n26#3:164\n*S KotlinDebug\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n*L\n48#1:162\n91#1:163\n159#1:164\n*E\n"})
/* renamed from: rE5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47936rE5<E> extends AbstractC10505a1<E> implements UY1<E> {

    /* renamed from: c */
    public static final C27886a f106749c = new C27886a(null);

    /* renamed from: d */
    public static final C47936rE5 f106750d = new C47936rE5(new Object[0]);

    /* renamed from: b */
    public final Object[] f106751b;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"LrE5$a;", "", "LrE5;", "", "EMPTY", "LrE5;", C17296a.f69688o, "()LrE5;", "<init>", "()V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: rE5$a */
    /* loaded from: classes.dex */
    public static final class C27886a {
        public /* synthetic */ C27886a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C47936rE5 m16169a() {
            return C47936rE5.f106750d;
        }

        private C27886a() {
        }
    }

    public C47936rE5(Object[] buffer) {
        boolean z;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f106751b = buffer;
        if (buffer.length <= 32) {
            z = true;
        } else {
            z = false;
        }
        C49464tp0.m11730a(z);
    }

    @Override // p000.ER3
    /* renamed from: U1 */
    public ER3<E> mo16173U1(int i) {
        C38213as2.m65373a(i, size());
        if (size() == 1) {
            return f106750d;
        }
        Object[] copyOf = Arrays.copyOf(this.f106751b, size() - 1);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        ArraysKt___ArraysJvmKt.copyInto(this.f106751b, copyOf, i, i + 1, size());
        return new C47936rE5(copyOf);
    }

    @Override // java.util.Collection, java.util.List, p000.ER3
    public ER3<E> add(E e) {
        if (size() < 32) {
            Object[] copyOf = Arrays.copyOf(this.f106751b, size() + 1);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            copyOf[size()] = e;
            return new C47936rE5(copyOf);
        }
        return new OR3(this.f106751b, C36371Ui6.m80983c(e), size() + 1, 0);
    }

    @Override // p000.AbstractC10505a1, java.util.Collection, java.util.List, p000.ER3
    public ER3<E> addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (size() + elements.size() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.f106751b, size() + elements.size());
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            int size = size();
            for (E e : elements) {
                copyOf[size] = e;
                size++;
            }
            return new C47936rE5(copyOf);
        }
        ER3.InterfaceC1825a<E> builder = builder();
        builder.addAll(elements);
        return builder.build();
    }

    /* renamed from: b */
    public final Object[] m16171b(int i) {
        return new Object[i];
    }

    @Override // p000.ER3
    /* renamed from: b1 */
    public ER3<E> mo16170b1(Function1<? super E, Boolean> predicate) {
        Object[] copyOfRange;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f106751b;
        int size = size();
        int size2 = size();
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = this.f106751b[i];
            if (predicate.invoke(obj).booleanValue()) {
                if (!z) {
                    Object[] objArr2 = this.f106751b;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, size)");
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArr[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        if (size != 0) {
            copyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(objArr, 0, size);
            return new C47936rE5(copyOfRange);
        }
        return f106750d;
    }

    @Override // p000.ER3
    public ER3.InterfaceC1825a<E> builder() {
        return new PR3(this, null, this.f106751b, 0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int i) {
        C38213as2.m65373a(i, size());
        return (E) this.f106751b[i];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f106751b.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int indexOf;
        indexOf = ArraysKt___ArraysKt.indexOf(this.f106751b, obj);
        return indexOf;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int lastIndexOf;
        lastIndexOf = ArraysKt___ArraysKt.lastIndexOf(this.f106751b, obj);
        return lastIndexOf;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        C38213as2.m65372b(i, size());
        return new C43081j30(this.f106751b, i, size());
    }

    @Override // kotlin.collections.AbstractList, java.util.List, p000.ER3
    public ER3<E> set(int i, E e) {
        C38213as2.m65373a(i, size());
        Object[] objArr = this.f106751b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i] = e;
        return new C47936rE5(copyOf);
    }

    @Override // java.util.List, p000.ER3
    public ER3<E> add(int i, E e) {
        C38213as2.m65372b(i, size());
        if (i == size()) {
            return add((C47936rE5<E>) e);
        }
        if (size() < 32) {
            Object[] m16171b = m16171b(size() + 1);
            ArraysKt___ArraysJvmKt.copyInto$default(this.f106751b, m16171b, 0, 0, i, 6, (Object) null);
            ArraysKt___ArraysJvmKt.copyInto(this.f106751b, m16171b, i + 1, i, size());
            m16171b[i] = e;
            return new C47936rE5(m16171b);
        }
        Object[] objArr = this.f106751b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.copyInto(this.f106751b, copyOf, i + 1, i, size() - 1);
        copyOf[i] = e;
        return new OR3(copyOf, C36371Ui6.m80983c(this.f106751b[31]), size() + 1, 0);
    }
}
