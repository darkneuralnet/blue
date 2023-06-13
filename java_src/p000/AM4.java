package p000;

import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import p000.GR3;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000e\u001a\u00020\n2\u0014\u0010\r\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LAM4;", "T", "LGR3;", "", "key", "i", "(Ljava/lang/String;)Ljava/lang/Object;", "", "e", "value", "", "r", "(Ljava/lang/String;Ljava/lang/Object;)V", "from", "f", "h", C17296a.f69688o, "LVk2;", "b", "LVk2;", "keyValueStore", "<init>", "(LVk2;)V", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: AM4 */
/* loaded from: classes7.dex */
public final class AM4<T> implements GR3<String, T> {

    /* renamed from: b */
    public final InterfaceC36619Vk2<String, T> f425b;

    public AM4(InterfaceC36619Vk2<String, T> keyValueStore) {
        Intrinsics.checkNotNullParameter(keyValueStore, "keyValueStore");
        this.f425b = keyValueStore;
    }

    @Override // p000.InterfaceC36619Vk2
    /* renamed from: a */
    public void mo65175a() {
        this.f425b.mo65175a();
    }

    @Override // java.util.Map
    public void clear() {
        GR3.C2849a.m105121a(this);
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return m115877d((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return GR3.C2849a.m105119c(this, obj);
    }

    /* renamed from: d */
    public boolean m115877d(String str) {
        return GR3.C2849a.m105120b(this, str);
    }

    @Override // p000.InterfaceC36619Vk2
    /* renamed from: e */
    public Map<? extends String, T> mo65171e() {
        return this.f425b.mo65171e();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, T>> entrySet() {
        return m115873k();
    }

    @Override // p000.InterfaceC36619Vk2
    /* renamed from: f */
    public void mo65170f(Map<? extends String, ? extends T> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.f425b.mo65170f(from);
    }

    @Override // java.util.Map
    public final /* bridge */ T get(Object obj) {
        if (obj instanceof String) {
            return m115874j((String) obj);
        }
        return null;
    }

    @Override // p000.InterfaceC36619Vk2
    /* renamed from: h */
    public void mo65174b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f425b.mo65174b(key);
    }

    @Override // p000.InterfaceC36619Vk2
    /* renamed from: i */
    public T mo65173c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f425b.mo65173c(key);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return GR3.C2849a.m105112j(this);
    }

    /* renamed from: j */
    public T m115874j(String str) {
        return (T) GR3.C2849a.m105118d(this, str);
    }

    /* renamed from: k */
    public Set<Map.Entry<String, T>> m115873k() {
        return GR3.C2849a.m105117e(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return m115872l();
    }

    /* renamed from: l */
    public Set<String> m115872l() {
        return GR3.C2849a.m105116f(this);
    }

    /* renamed from: m */
    public int m115871m() {
        return GR3.C2849a.m105115g(this);
    }

    @Override // kotlin.properties.ReadOnlyProperty
    /* renamed from: n */
    public Map<String, T> getValue(Object obj, KProperty<?> kProperty) {
        return GR3.C2849a.m105114h(this, obj, kProperty);
    }

    /* renamed from: o */
    public Collection<T> m115869o() {
        return GR3.C2849a.m105113i(this);
    }

    @Override // java.util.Map
    /* renamed from: p */
    public T put(String str, T t) {
        return (T) GR3.C2849a.m105111k(this, str, t);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends T> map) {
        GR3.C2849a.m105110l(this, map);
    }

    /* renamed from: q */
    public T m115867q(String str) {
        return (T) GR3.C2849a.m105109m(this, str);
    }

    @Override // p000.InterfaceC36619Vk2
    /* renamed from: r */
    public void mo65169g(String key, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f425b.mo65169g(key, t);
    }

    @Override // java.util.Map
    public final /* bridge */ T remove(Object obj) {
        if (obj instanceof String) {
            return m115867q((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m115871m();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<T> values() {
        return m115869o();
    }
}
