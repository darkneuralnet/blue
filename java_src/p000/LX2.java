package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0013\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003\u000b\u0006\u000eB!\b\u0001\u0012\u000e\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000/\u0012\u0006\u0010?\u001a\u00020\b¢\u0006\u0004\b@\u0010AJ\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u001c\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u0014\u0010\u0011\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u0006\u0010\u0014\u001a\u00020\nJ\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0007J\u0014\u0010\u0016\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\bJ\r\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0005J\u0006\u0010\u001e\u001a\u00020\u0005J\r\u0010\u001f\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010\u001aJ\u0015\u0010 \u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b \u0010\u001cJ\u0015\u0010!\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b!\u0010\u0007J\u0014\u0010\"\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u0015\u0010#\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\u0016\u0010'\u001a\u00020\n2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\bJ\u0014\u0010(\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ \u0010)\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b)\u0010*J\u001e\u0010.\u001a\u00020\n2\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00028\u00000+j\b\u0012\u0004\u0012\u00028\u0000`,R0\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000/8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0006\u00100\u0012\u0004\b5\u00106\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u00109\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00108R$\u0010?\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006B"}, m28432d2 = {"LLX2;", "T", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "element", "", "b", "(Ljava/lang/Object;)Z", "", "index", "", C17296a.f69688o, "(ILjava/lang/Object;)V", "elements", "c", "", "e", "f", "", "g", "h", "j", "l", "capacity", "m", "o", "()Ljava/lang/Object;", "v", "(Ljava/lang/Object;)I", "w", "x", "y", "z", "A", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "(I)Ljava/lang/Object;", "start", "end", "D", "E", "F", "(ILjava/lang/Object;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "G", "", "[Ljava/lang/Object;", "s", "()[Ljava/lang/Object;", "setContent", "([Ljava/lang/Object;)V", "getContent$annotations", "()V", "content", "Ljava/util/List;", "list", "<set-?>", DateTokenConverter.CONVERTER_KEY, "I", "u", "()I", "size", "<init>", "([Ljava/lang/Object;I)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1194:1\n48#1:1198\n48#1:1199\n523#1:1200\n53#1:1203\n523#1:1204\n48#1:1205\n523#1:1206\n523#1:1207\n523#1:1208\n48#1:1209\n523#1:1210\n48#1:1211\n523#1:1212\n523#1:1213\n523#1:1214\n48#1:1215\n523#1:1216\n48#1:1219\n48#1:1220\n48#1:1221\n523#1:1222\n1864#2,3:1195\n1855#2,2:1201\n1855#2,2:1217\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n249#1:1198\n259#1:1199\n260#1:1200\n292#1:1203\n293#1:1204\n307#1:1205\n308#1:1206\n334#1:1207\n359#1:1208\n595#1:1209\n595#1:1210\n637#1:1211\n637#1:1212\n665#1:1213\n675#1:1214\n768#1:1215\n769#1:1216\n794#1:1219\n821#1:1220\n833#1:1221\n834#1:1222\n185#1:1195,3\n281#1:1201,2\n782#1:1217,2\n*E\n"})
/* renamed from: LX2 */
/* loaded from: classes.dex */
public final class LX2<T> implements RandomAccess {

    /* renamed from: e */
    public static final int f21631e = 8;

    /* renamed from: b */
    public T[] f21632b;

    /* renamed from: c */
    public List<T> f21633c;

    /* renamed from: d */
    public int f21634d;

    @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010$¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0018\u0010\f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0096\u0002J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0016\u0010\u0017\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0016\u0010\u001c\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0017\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u0016\u0010\u001e\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J \u0010\u001f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0016R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010%R\u0014\u0010)\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, m28432d2 = {"LLX2$a;", "T", "", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "add", "", "(ILjava/lang/Object;)V", "addAll", "clear", "", "listIterator", "remove", "removeAll", "b", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "LLX2;", "LLX2;", "vector", C17296a.f69688o, "()I", "size", "<init>", "(LLX2;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1194:1\n523#2:1195\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n*L\n941#1:1195\n*E\n"})
    /* renamed from: LX2$a */
    /* loaded from: classes.dex */
    public static final class C5019a<T> implements List<T>, KMutableList {

        /* renamed from: b */
        public final LX2<T> f21635b;

        public C5019a(LX2<T> vector) {
            Intrinsics.checkNotNullParameter(vector, "vector");
            this.f21635b = vector;
        }

        /* renamed from: a */
        public int m96684a() {
            return this.f21635b.m96690u();
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            return this.f21635b.m96701b(t);
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f21635b.m96699e(i, elements);
        }

        /* renamed from: b */
        public T m96683b(int i) {
            MX2.m95181c(this, i);
            return this.f21635b.m96707C(i);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f21635b.m96696h();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f21635b.m96695j(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f21635b.m96694l(elements);
        }

        @Override // java.util.List
        public T get(int i) {
            MX2.m95181c(this, i);
            return this.f21635b.m96691s()[i];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f21635b.m96689v(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f21635b.m96688w();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new C5021c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f21635b.m96685z(obj);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new C5021c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return m96683b(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f21635b.m96708B(elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f21635b.m96705E(elements);
        }

        @Override // java.util.List
        public T set(int i, T t) {
            MX2.m95181c(this, i);
            return this.f21635b.m96704F(i, t);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return m96684a();
        }

        @Override // java.util.List
        public List<T> subList(int i, int i2) {
            MX2.m95180d(this, i, i2);
            return new C5020b(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List
        public void add(int i, T t) {
            this.f21635b.m96702a(i, t);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f21635b.m96698f(elements);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i) {
            return new C5021c(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f21635b.m96709A(obj);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) CollectionToArray.toArray(this, array);
        }
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0017\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010(\u001a\u00020\n\u0012\u0006\u0010*\u001a\u00020\n¢\u0006\u0004\b.\u0010/J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0018\u0010\f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0096\u0002J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0016\u0010\u0017\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0016\u0010\u001c\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0017\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u0016\u0010\u001e\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J \u0010\u001f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0016R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u0014\u0010(\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010-\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, m28432d2 = {"LLX2$b;", "T", "", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "add", "", "(ILjava/lang/Object;)V", "addAll", "clear", "", "listIterator", "remove", "removeAll", "b", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "Ljava/util/List;", "list", "c", "I", "start", DateTokenConverter.CONVERTER_KEY, "end", C17296a.f69688o, "()I", "size", "<init>", "(Ljava/util/List;II)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1194:1\n1855#2,2:1195\n1855#2,2:1197\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n*L\n1013#1:1195,2\n1095#1:1197,2\n*E\n"})
    /* renamed from: LX2$b */
    /* loaded from: classes.dex */
    public static final class C5020b<T> implements List<T>, KMutableList {

        /* renamed from: b */
        public final List<T> f21636b;

        /* renamed from: c */
        public final int f21637c;

        /* renamed from: d */
        public int f21638d;

        public C5020b(List<T> list, int i, int i2) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f21636b = list;
            this.f21637c = i;
            this.f21638d = i2;
        }

        /* renamed from: a */
        public int m96682a() {
            return this.f21638d - this.f21637c;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            List<T> list = this.f21636b;
            int i = this.f21638d;
            this.f21638d = i + 1;
            list.add(i, t);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.f21636b.addAll(i + this.f21637c, elements);
            this.f21638d += elements.size();
            return elements.size() > 0;
        }

        /* renamed from: b */
        public T m96681b(int i) {
            MX2.m95181c(this, i);
            this.f21638d--;
            return this.f21636b.remove(i + this.f21637c);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i = this.f21638d - 1;
            int i2 = this.f21637c;
            if (i2 <= i) {
                while (true) {
                    this.f21636b.remove(i);
                    if (i == i2) {
                        break;
                    }
                    i--;
                }
            }
            this.f21638d = this.f21637c;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i = this.f21638d;
            for (int i2 = this.f21637c; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.f21636b.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i) {
            MX2.m95181c(this, i);
            return this.f21636b.get(i + this.f21637c);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i = this.f21638d;
            for (int i2 = this.f21637c; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.f21636b.get(i2), obj)) {
                    return i2 - this.f21637c;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f21638d == this.f21637c;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new C5021c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i = this.f21638d - 1;
            int i2 = this.f21637c;
            if (i2 <= i) {
                while (!Intrinsics.areEqual(this.f21636b.get(i), obj)) {
                    if (i != i2) {
                        i--;
                    } else {
                        return -1;
                    }
                }
                return i - this.f21637c;
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new C5021c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i) {
            return m96681b(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i = this.f21638d;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            if (i != this.f21638d) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i = this.f21638d;
            int i2 = i - 1;
            int i3 = this.f21637c;
            if (i3 <= i2) {
                while (true) {
                    if (!elements.contains(this.f21636b.get(i2))) {
                        this.f21636b.remove(i2);
                        this.f21638d--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            if (i != this.f21638d) {
                return true;
            }
            return false;
        }

        @Override // java.util.List
        public T set(int i, T t) {
            MX2.m95181c(this, i);
            return this.f21636b.set(i + this.f21637c, t);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return m96682a();
        }

        @Override // java.util.List
        public List<T> subList(int i, int i2) {
            MX2.m95180d(this, i, i2);
            return new C5020b(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List
        public void add(int i, T t) {
            this.f21636b.add(i + this.f21637c, t);
            this.f21638d++;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i) {
            return new C5021c(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i = this.f21638d;
            for (int i2 = this.f21637c; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.f21636b.get(i2), obj)) {
                    this.f21636b.remove(i2);
                    this.f21638d--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) CollectionToArray.toArray(this, array);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.f21636b.addAll(this.f21638d, elements);
            this.f21638d += elements.size();
            return elements.size() > 0;
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0010\u0010\u0005\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000f\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\f\u0010\u0006J\b\u0010\r\u001a\u00020\nH\u0016J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"LLX2$c;", "T", "", "", "hasNext", "next", "()Ljava/lang/Object;", "", "remove", "hasPrevious", "", "nextIndex", "previous", "previousIndex", "element", "add", "(Ljava/lang/Object;)V", "set", "", "b", "Ljava/util/List;", "list", "c", "I", "index", "<init>", "(Ljava/util/List;I)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: LX2$c */
    /* loaded from: classes.dex */
    public static final class C5021c<T> implements ListIterator<T>, KMutableListIterator {

        /* renamed from: b */
        public final List<T> f21639b;

        /* renamed from: c */
        public int f21640c;

        public C5021c(List<T> list, int i) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f21639b = list;
            this.f21640c = i;
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            this.f21639b.add(this.f21640c, t);
            this.f21640c++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f21640c < this.f21639b.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f21640c > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.f21639b;
            int i = this.f21640c;
            this.f21640c = i + 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f21640c;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i = this.f21640c - 1;
            this.f21640c = i;
            return this.f21639b.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f21640c - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i = this.f21640c - 1;
            this.f21640c = i;
            this.f21639b.remove(i);
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            this.f21639b.set(this.f21640c, t);
        }
    }

    @PublishedApi
    public LX2(T[] content, int i) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f21632b = content;
        this.f21634d = i;
    }

    /* renamed from: A */
    public final boolean m96709A(T t) {
        int m96689v = m96689v(t);
        if (m96689v >= 0) {
            m96707C(m96689v);
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public final boolean m96708B(Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        int i = this.f21634d;
        for (T t : elements) {
            m96709A(t);
        }
        if (i == this.f21634d) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public final T m96707C(int i) {
        T[] tArr = this.f21632b;
        T t = tArr[i];
        if (i != m96690u() - 1) {
            ArraysKt___ArraysJvmKt.copyInto(tArr, tArr, i, i + 1, this.f21634d);
        }
        int i2 = this.f21634d - 1;
        this.f21634d = i2;
        tArr[i2] = null;
        return t;
    }

    /* renamed from: D */
    public final void m96706D(int i, int i2) {
        if (i2 > i) {
            int i3 = this.f21634d;
            if (i2 < i3) {
                T[] tArr = this.f21632b;
                ArraysKt___ArraysJvmKt.copyInto(tArr, tArr, i, i2, i3);
            }
            int i4 = this.f21634d - (i2 - i);
            int m96690u = m96690u() - 1;
            if (i4 <= m96690u) {
                int i5 = i4;
                while (true) {
                    this.f21632b[i5] = null;
                    if (i5 == m96690u) {
                        break;
                    }
                    i5++;
                }
            }
            this.f21634d = i4;
        }
    }

    /* renamed from: E */
    public final boolean m96705E(Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = this.f21634d;
        for (int m96690u = m96690u() - 1; -1 < m96690u; m96690u--) {
            if (!elements.contains(m96691s()[m96690u])) {
                m96707C(m96690u);
            }
        }
        if (i != this.f21634d) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public final T m96704F(int i, T t) {
        T[] tArr = this.f21632b;
        T t2 = tArr[i];
        tArr[i] = t;
        return t2;
    }

    /* renamed from: G */
    public final void m96703G(Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArraysKt___ArraysJvmKt.sortWith(this.f21632b, comparator, 0, this.f21634d);
    }

    /* renamed from: a */
    public final void m96702a(int i, T t) {
        m96693m(this.f21634d + 1);
        T[] tArr = this.f21632b;
        int i2 = this.f21634d;
        if (i != i2) {
            ArraysKt___ArraysJvmKt.copyInto(tArr, tArr, i + 1, i, i2);
        }
        tArr[i] = t;
        this.f21634d++;
    }

    /* renamed from: b */
    public final boolean m96701b(T t) {
        m96693m(this.f21634d + 1);
        T[] tArr = this.f21632b;
        int i = this.f21634d;
        tArr[i] = t;
        this.f21634d = i + 1;
        return true;
    }

    /* renamed from: c */
    public final boolean m96700c(int i, LX2<T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.m96688w()) {
            return false;
        }
        m96693m(this.f21634d + elements.f21634d);
        T[] tArr = this.f21632b;
        int i2 = this.f21634d;
        if (i != i2) {
            ArraysKt___ArraysJvmKt.copyInto(tArr, tArr, elements.f21634d + i, i, i2);
        }
        ArraysKt___ArraysJvmKt.copyInto(elements.f21632b, tArr, i, 0, elements.f21634d);
        this.f21634d += elements.f21634d;
        return true;
    }

    /* renamed from: e */
    public final boolean m96699e(int i, Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        m96693m(this.f21634d + elements.size());
        T[] tArr = this.f21632b;
        if (i != this.f21634d) {
            ArraysKt___ArraysJvmKt.copyInto(tArr, tArr, elements.size() + i, i, this.f21634d);
        }
        for (T t : elements) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            tArr[i2 + i] = t;
            i2 = i3;
        }
        this.f21634d += elements.size();
        return true;
    }

    /* renamed from: f */
    public final boolean m96698f(Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m96699e(this.f21634d, elements);
    }

    /* renamed from: g */
    public final List<T> m96697g() {
        List<T> list = this.f21633c;
        if (list == null) {
            C5019a c5019a = new C5019a(this);
            this.f21633c = c5019a;
            return c5019a;
        }
        return list;
    }

    /* renamed from: h */
    public final void m96696h() {
        T[] tArr = this.f21632b;
        int m96690u = m96690u();
        while (true) {
            m96690u--;
            if (-1 < m96690u) {
                tArr[m96690u] = null;
            } else {
                this.f21634d = 0;
                return;
            }
        }
    }

    /* renamed from: j */
    public final boolean m96695j(T t) {
        int m96690u = m96690u() - 1;
        if (m96690u >= 0) {
            for (int i = 0; !Intrinsics.areEqual(m96691s()[i], t); i++) {
                if (i != m96690u) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m96694l(Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (T t : elements) {
            if (!m96695j(t)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final void m96693m(int i) {
        T[] tArr = this.f21632b;
        if (tArr.length < i) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(i, tArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(this, newSize)");
            this.f21632b = tArr2;
        }
    }

    /* renamed from: o */
    public final T m96692o() {
        if (!m96688w()) {
            return m96691s()[0];
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    /* renamed from: s */
    public final T[] m96691s() {
        return this.f21632b;
    }

    /* renamed from: u */
    public final int m96690u() {
        return this.f21634d;
    }

    /* renamed from: v */
    public final int m96689v(T t) {
        int i = this.f21634d;
        if (i > 0) {
            T[] tArr = this.f21632b;
            int i2 = 0;
            while (!Intrinsics.areEqual(t, tArr[i2])) {
                i2++;
                if (i2 >= i) {
                    return -1;
                }
            }
            return i2;
        }
        return -1;
    }

    /* renamed from: w */
    public final boolean m96688w() {
        return this.f21634d == 0;
    }

    /* renamed from: x */
    public final boolean m96687x() {
        return this.f21634d != 0;
    }

    /* renamed from: y */
    public final T m96686y() {
        if (!m96688w()) {
            return m96691s()[m96690u() - 1];
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    /* renamed from: z */
    public final int m96685z(T t) {
        int i = this.f21634d;
        if (i > 0) {
            int i2 = i - 1;
            T[] tArr = this.f21632b;
            while (!Intrinsics.areEqual(t, tArr[i2])) {
                i2--;
                if (i2 < 0) {
                    return -1;
                }
            }
            return i2;
        }
        return -1;
    }
}
