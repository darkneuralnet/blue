package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KProperty;
import p000.GR3;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00040\u0002B>\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012'\u0010 \u001a#\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0\u0017¢\u0006\u0004\b*\u0010+J\u001e\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\"\u0010\t\u001a\u001c\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00040\bH\u0016J$\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J*\u0010\u000e\u001a\u00020\u000b2 \u0010\r\u001a\u001c\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00040\bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R8\u0010 \u001a#\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0\u00178\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR3\u0010%\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00040\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, m28432d2 = {"LKv2;", "V", "LGR3;", "Ljava/util/Locale;", "", "", "key", "j", "", "e", "value", "", "t", "from", "f", "i", C17296a.f69688o, "", "b", "Ljava/util/Set;", "getLocales", "()Ljava/util/Set;", "locales", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "locale", "LAM4;", "c", "Lkotlin/jvm/functions/Function1;", "getPersistentMapFactory", "()Lkotlin/jvm/functions/Function1;", "persistentMapFactory", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Lazy;", "l", "()Ljava/util/Map;", "delegateMaps", "", "o", "()I", "size", "<init>", "(Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Kv2  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34144Kv2<V> implements GR3<Locale, Map<String, V>> {

    /* renamed from: b */
    public final Set<Locale> f20366b;

    /* renamed from: c */
    public final Function1<Locale, AM4<V>> f20367c;

    /* renamed from: d */
    public final Lazy f20368d;

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: Kv2$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C4625a extends FunctionReferenceImpl implements Function0<Map<Locale, Map<String, V>>> {

        /* renamed from: b */
        public static final C4625a f20369b = new C4625a();

        public C4625a() {
            super(0, MapsKt.class, "mutableMapOf", "mutableMapOf()Ljava/util/Map;", 1);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Map<Locale, Map<String, V>> invoke() {
            return new LinkedHashMap();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C34144Kv2(Set<Locale> locales, Function1<? super Locale, AM4<V>> persistentMapFactory) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(locales, "locales");
        Intrinsics.checkNotNullParameter(persistentMapFactory, "persistentMapFactory");
        this.f20366b = locales;
        this.f20367c = persistentMapFactory;
        lazy = LazyKt__LazyJVMKt.lazy(C4625a.f20369b);
        this.f20368d = lazy;
    }

    @Override // p000.InterfaceC36619Vk2
    /* renamed from: a */
    public void mo65175a() {
        this.f20366b.clear();
        Iterator<T> it = m98155l().values().iterator();
        while (it.hasNext()) {
            ((Map) it.next()).clear();
        }
        m98155l().clear();
    }

    @Override // java.util.Map
    public void clear() {
        GR3.C2849a.m105121a(this);
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof Locale) {
            return m98160d((Locale) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (TypeIntrinsics.isMutableMap(obj)) {
            return m98159h((Map) obj);
        }
        return false;
    }

    /* renamed from: d */
    public boolean m98160d(Locale locale) {
        return GR3.C2849a.m105120b(this, locale);
    }

    @Override // p000.InterfaceC36619Vk2
    /* renamed from: e */
    public Map<? extends Locale, Map<String, V>> mo65171e() {
        return m98155l();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<Locale, Map<String, V>>> entrySet() {
        return m98154m();
    }

    @Override // p000.InterfaceC36619Vk2
    /* renamed from: f */
    public void mo65170f(Map<? extends Locale, ? extends Map<String, V>> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.f20366b.addAll(from.keySet());
        for (Map.Entry<? extends Locale, ? extends Map<String, V>> entry : from.entrySet()) {
            mo65169g(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof Locale) {
            return m98156k((Locale) obj);
        }
        return null;
    }

    /* renamed from: h */
    public boolean m98159h(Map<String, V> map) {
        return GR3.C2849a.m105119c(this, map);
    }

    @Override // p000.InterfaceC36619Vk2
    /* renamed from: i */
    public void mo65174b(Locale key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f20366b.remove(key);
        m98155l().remove(key);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return GR3.C2849a.m105112j(this);
    }

    @Override // p000.InterfaceC36619Vk2
    /* renamed from: j */
    public Map<String, V> mo65173c(Locale key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (m98155l().get(key) == null) {
            this.f20366b.add(key);
            m98155l().put(key, this.f20367c.invoke(key));
        }
        return m98155l().get(key);
    }

    /* renamed from: k */
    public Map<String, V> m98156k(Locale locale) {
        return (Map) GR3.C2849a.m105118d(this, locale);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Locale> keySet() {
        return m98153n();
    }

    /* renamed from: l */
    public final Map<Locale, Map<String, V>> m98155l() {
        return (Map) this.f20368d.getValue();
    }

    /* renamed from: m */
    public Set<Map.Entry<Locale, Map<String, V>>> m98154m() {
        return GR3.C2849a.m105117e(this);
    }

    /* renamed from: n */
    public Set<Locale> m98153n() {
        return GR3.C2849a.m105116f(this);
    }

    /* renamed from: o */
    public int m98152o() {
        return this.f20366b.size();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    /* renamed from: p */
    public Map<Locale, Map<String, V>> getValue(Object obj, KProperty<?> kProperty) {
        return GR3.C2849a.m105114h(this, obj, kProperty);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends Locale, ? extends Map<String, V>> map) {
        GR3.C2849a.m105110l(this, map);
    }

    /* renamed from: q */
    public Collection<Map<String, V>> m98150q() {
        return GR3.C2849a.m105113i(this);
    }

    @Override // java.util.Map
    /* renamed from: r */
    public Map<String, V> put(Locale locale, Map<String, V> map) {
        return (Map) GR3.C2849a.m105111k(this, locale, map);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof Locale) {
            return m98148s((Locale) obj);
        }
        return null;
    }

    /* renamed from: s */
    public Map<String, V> m98148s(Locale locale) {
        return (Map) GR3.C2849a.m105109m(this, locale);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m98152o();
    }

    @Override // p000.InterfaceC36619Vk2
    /* renamed from: t */
    public void mo65169g(Locale key, Map<String, V> value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (m98155l().containsKey(key)) {
            return;
        }
        this.f20366b.add(key);
        m98155l().put(key, this.f20367c.invoke(key));
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Map<String, V>> values() {
        return m98150q();
    }
}
