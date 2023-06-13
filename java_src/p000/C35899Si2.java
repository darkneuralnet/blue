package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.markers.KMappedMarker;
@InterfaceC36928Ws5(with = C36601Vi2.class)
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\u0007\b\u0007\u0018\u0000 #2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0001\bB\u001b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b!\u0010\"J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001H\u0096\u0001J\u0013\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0003J\t\u0010\n\u001a\u00020\u0005H\u0096\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R&\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00140\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u001d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m28432d2 = {"LSi2;", "Lxi2;", "", "", "key", "", C17296a.f69688o, "value", "b", "c", "isEmpty", "", LegacyRepairType.OTHER_KEY, "equals", "", "hashCode", "toString", "Ljava/util/Map;", "content", "", "", "e", "()Ljava/util/Set;", "entries", "f", UserMetadata.KEYDATA_FILENAME, "h", "()I", "size", "", "j", "()Ljava/util/Collection;", "values", "<init>", "(Ljava/util/Map;)V", "Companion", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Si2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C35899Si2 extends AbstractC51767xi2 implements Map<String, AbstractC51767xi2>, KMappedMarker {
    public static final C7513b Companion = new C7513b(null);

    /* renamed from: b */
    public final Map<String, AbstractC51767xi2> f34123b;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "", "Lxi2;", "<name for destructuring parameter 0>", "", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Si2$a */
    /* loaded from: classes8.dex */
    public static final class C7512a extends Lambda implements Function1<Map.Entry<? extends String, ? extends AbstractC51767xi2>, CharSequence> {

        /* renamed from: g */
        public static final C7512a f34124g = new C7512a();

        public C7512a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends AbstractC51767xi2> entry) {
            return invoke2((Map.Entry<String, ? extends AbstractC51767xi2>) entry);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final CharSequence invoke2(Map.Entry<String, ? extends AbstractC51767xi2> entry) {
            Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
            StringBuilder sb = new StringBuilder();
            C37964aS5.m71350c(sb, entry.getKey());
            sb.append(CoreConstants.COLON_CHAR);
            sb.append(entry.getValue());
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"LSi2$b;", "", "LKj2;", "LSi2;", "serializer", "<init>", "()V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Si2$b */
    /* loaded from: classes8.dex */
    public static final class C7513b {
        public /* synthetic */ C7513b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<C35899Si2> serializer() {
            return C36601Vi2.f39503a;
        }

        private C7513b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C35899Si2(Map<String, ? extends AbstractC51767xi2> content) {
        super(null);
        Intrinsics.checkNotNullParameter(content, "content");
        this.f34123b = content;
    }

    /* renamed from: a */
    public boolean m85014a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f34123b.containsKey(key);
    }

    /* renamed from: b */
    public boolean m85013b(AbstractC51767xi2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f34123b.containsValue(value);
    }

    /* renamed from: c */
    public AbstractC51767xi2 m85012c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f34123b.get(key);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ AbstractC51767xi2 compute(String str, BiFunction<? super String, ? super AbstractC51767xi2, ? extends AbstractC51767xi2> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ AbstractC51767xi2 computeIfAbsent(String str, Function<? super String, ? extends AbstractC51767xi2> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ AbstractC51767xi2 computeIfPresent(String str, BiFunction<? super String, ? super AbstractC51767xi2, ? extends AbstractC51767xi2> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return m85014a((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof AbstractC51767xi2) {
            return m85013b((AbstractC51767xi2) obj);
        }
        return false;
    }

    /* renamed from: e */
    public Set<Map.Entry<String, AbstractC51767xi2>> m85011e() {
        return this.f34123b.entrySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, AbstractC51767xi2>> entrySet() {
        return m85011e();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return Intrinsics.areEqual(this.f34123b, obj);
    }

    /* renamed from: f */
    public Set<String> m85010f() {
        return this.f34123b.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC51767xi2 get(Object obj) {
        if (obj instanceof String) {
            return m85012c((String) obj);
        }
        return null;
    }

    /* renamed from: h */
    public int m85009h() {
        return this.f34123b.size();
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f34123b.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f34123b.isEmpty();
    }

    /* renamed from: j */
    public Collection<AbstractC51767xi2> m85008j() {
        return this.f34123b.values();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return m85010f();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ AbstractC51767xi2 merge(String str, AbstractC51767xi2 abstractC51767xi2, BiFunction<? super AbstractC51767xi2, ? super AbstractC51767xi2, ? extends AbstractC51767xi2> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    /* renamed from: o */
    public AbstractC51767xi2 remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ AbstractC51767xi2 put(String str, AbstractC51767xi2 abstractC51767xi2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends AbstractC51767xi2> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ AbstractC51767xi2 putIfAbsent(String str, AbstractC51767xi2 abstractC51767xi2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ AbstractC51767xi2 replace(String str, AbstractC51767xi2 abstractC51767xi2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super AbstractC51767xi2, ? extends AbstractC51767xi2> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m85009h();
    }

    public String toString() {
        String joinToString$default;
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(this.f34123b.entrySet(), ",", "{", "}", 0, null, C7512a.f34124g, 24, null);
        return joinToString$default;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<AbstractC51767xi2> values() {
        return m85008j();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, AbstractC51767xi2 abstractC51767xi2, AbstractC51767xi2 abstractC51767xi22) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
