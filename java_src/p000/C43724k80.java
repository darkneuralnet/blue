package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b(\u0010)JT\u0010\t\u001a(\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00030\u00030\u0007\"\u0004\b\u0000\u0010\u00022\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00030\u0003H\u0002JU\u0010\u000f\u001a)\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00030\u000b\"\u0004\b\u0000\u0010\n2\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00030\u0003H\u0002R\u0017\u0010\u0014\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R3\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u00030\u00038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR?\u0010!\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00190\u001e0\u00030\u00038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b \u0010\u001cR9\u0010$\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\"0\u00030\u00038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b\u0010\u0010\u001cR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010&¨\u0006+²\u0006\u001e\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\n8\nX\u008a\u0084\u0002"}, m28432d2 = {"Lk80;", "LIX2;", "R", "", "Ljava/util/Locale;", "", "persistentMap", "Lkotlin/properties/ReadWriteProperty;", "", "g", "T", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "key", "f", C17296a.f69688o, "LIX2;", "getPersistentRepository", "()LIX2;", "persistentRepository", "", "b", "Ljava/util/Set;", "_supportedLocales", "", "c", "Lkotlin/properties/ReadWriteProperty;", "()Ljava/util/Map;", "strings", "", "LDW3;", DateTokenConverter.CONVERTER_KEY, "quantityStrings", "", "e", "stringArrays", "", "()Ljava/util/Set;", "supportedLocales", "<init>", "(LIX2;)V", "map", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: k80  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43724k80 implements IX2 {

    /* renamed from: f */
    public static final /* synthetic */ KProperty<Object>[] f93970f = {Reflection.property1(new PropertyReference1Impl(C43724k80.class, "strings", "getStrings()Ljava/util/Map;", 0)), Reflection.property1(new PropertyReference1Impl(C43724k80.class, "quantityStrings", "getQuantityStrings()Ljava/util/Map;", 0)), Reflection.property1(new PropertyReference1Impl(C43724k80.class, "stringArrays", "getStringArrays()Ljava/util/Map;", 0))};

    /* renamed from: a */
    public final IX2 f93971a;

    /* renamed from: b */
    public final Set<Locale> f93972b;

    /* renamed from: c */
    public final ReadWriteProperty f93973c;

    /* renamed from: d */
    public final ReadWriteProperty f93974d;

    /* renamed from: e */
    public final ReadWriteProperty f93975e;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Ljava/util/Locale;", "locale", "", "", C17296a.f69688o, "(Ljava/util/Locale;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: k80$a */
    /* loaded from: classes7.dex */
    public static final class C25113a extends Lambda implements Function1<Locale, Map<String, T>> {

        /* renamed from: h */
        public static final /* synthetic */ KProperty<Object>[] f93976h = {Reflection.property0(new PropertyReference0Impl(C43724k80.class, "map", "<v#0>", 0))};

        /* renamed from: g */
        public final /* synthetic */ Map<Locale, Map<String, T>> f93977g;

        @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\t\u001a\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0014J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0004H\u0014¨\u0006\r"}, m28432d2 = {"k80$a$a", "Lbe3;", "key", "value", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "from", "c", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)V", C17296a.f69688o, "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: k80$a$a */
        /* loaded from: classes7.dex */
        public static final class C25114a extends AbstractC38667be3<String, T> {

            /* renamed from: e */
            public final /* synthetic */ Map f93978e;

            /* renamed from: f */
            public final /* synthetic */ Locale f93979f;

            /* renamed from: g */
            public final /* synthetic */ Map f93980g;

            /* renamed from: h */
            public final /* synthetic */ Locale f93981h;

            /* renamed from: i */
            public final /* synthetic */ Map f93982i;

            /* renamed from: j */
            public final /* synthetic */ Locale f93983j;

            /* renamed from: k */
            public final /* synthetic */ Map f93984k;

            /* renamed from: l */
            public final /* synthetic */ Locale f93985l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25114a(Map map, Function1 function1, Map map2, Locale locale, Map map3, Locale locale2, Map map4, Locale locale3, Map map5, Locale locale4) {
                super(map, function1);
                this.f93978e = map2;
                this.f93979f = locale;
                this.f93980g = map3;
                this.f93981h = locale2;
                this.f93982i = map4;
                this.f93983j = locale3;
                this.f93984k = map5;
                this.f93985l = locale4;
            }

            @Override // p000.AbstractC38667be3
            /* renamed from: a */
            public void mo29249a() {
                Map map = (Map) this.f93984k.get(this.f93985l);
                if (map != null) {
                    map.clear();
                }
            }

            @Override // p000.AbstractC38667be3
            /* renamed from: b */
            public void mo29248b(String str, T t) {
                String str2 = str;
                Map map = (Map) this.f93978e.get(this.f93979f);
                if (map != null) {
                    map.put(str2, t);
                }
            }

            @Override // p000.AbstractC38667be3
            /* renamed from: c */
            public void mo29247c(Map<? extends String, ? extends T> from) {
                Intrinsics.checkNotNullParameter(from, "from");
                Map map = (Map) this.f93980g.get(this.f93981h);
                if (map != null) {
                    map.putAll(from);
                }
            }

            @Override // p000.AbstractC38667be3
            /* renamed from: d */
            public void mo29246d(String str) {
                String str2 = str;
                Map map = (Map) this.f93982i.get(this.f93983j);
                if (map != null) {
                    map.remove(str2);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25113a(Map<Locale, Map<String, T>> map) {
            super(1);
            this.f93977g = map;
        }

        /* renamed from: b */
        public static final <T> Map<String, T> m29250b(ReadWriteProperty<Object, Map<String, T>> readWriteProperty) {
            return readWriteProperty.getValue(null, f93976h[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Map<String, T> invoke(Locale locale) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            Map<Locale, Map<String, T>> map = this.f93977g;
            return m29250b(new C25114a((Map) this.f93977g.get(locale), C39260ce3.f61014g, map, locale, map, locale, map, locale, map, locale));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\t\u001a\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0014J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0004H\u0014¨\u0006\r"}, m28432d2 = {"k80$b", "Lbe3;", "key", "value", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "from", "c", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)V", C17296a.f69688o, "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: k80$b */
    /* loaded from: classes7.dex */
    public static final class C25115b extends AbstractC38667be3<Locale, Map<String, R>> {

        /* renamed from: e */
        public final /* synthetic */ Map f93986e;

        /* renamed from: f */
        public final /* synthetic */ C43724k80 f93987f;

        /* renamed from: g */
        public final /* synthetic */ Map f93988g;

        /* renamed from: h */
        public final /* synthetic */ Map f93989h;

        /* renamed from: i */
        public final /* synthetic */ Map f93990i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25115b(Map map, Function1 function1, Map map2, C43724k80 c43724k80, Map map3, C43724k80 c43724k802, Map map4, C43724k80 c43724k803, Map map5, C43724k80 c43724k804) {
            super(map, function1);
            this.f93986e = map2;
            this.f93987f = c43724k80;
            this.f93988g = map3;
            this.f93989h = map4;
            this.f93990i = map5;
        }

        @Override // p000.AbstractC38667be3
        /* renamed from: a */
        public void mo29249a() {
            this.f93990i.clear();
            this.f93987f.f93972b.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.AbstractC38667be3
        /* renamed from: b */
        public void mo29248b(Locale locale, Map<String, R> map) {
            Locale locale2 = locale;
            this.f93986e.put(locale2, map);
            this.f93987f.f93972b.add(locale2);
        }

        @Override // p000.AbstractC38667be3
        /* renamed from: c */
        public void mo29247c(Map<? extends Locale, ? extends Map<String, R>> from) {
            Intrinsics.checkNotNullParameter(from, "from");
            this.f93988g.putAll(from);
            this.f93987f.f93972b.addAll(from.keySet());
        }

        @Override // p000.AbstractC38667be3
        /* renamed from: d */
        public void mo29246d(Locale locale) {
            Locale locale2 = locale;
            this.f93989h.remove(locale2);
            this.f93987f.f93972b.remove(locale2);
        }
    }

    public C43724k80(IX2 persistentRepository) {
        Set<Locale> mutableSet;
        Intrinsics.checkNotNullParameter(persistentRepository, "persistentRepository");
        this.f93971a = persistentRepository;
        mutableSet = CollectionsKt___CollectionsKt.toMutableSet(persistentRepository.mo29257b());
        this.f93972b = mutableSet;
        this.f93973c = m29252g(persistentRepository.mo29256c());
        this.f93974d = m29252g(persistentRepository.mo29255d());
        this.f93975e = m29252g(persistentRepository.mo29258a());
    }

    @Override // p000.IX2, p000.InterfaceC38557bS5
    /* renamed from: a */
    public Map<Locale, Map<String, CharSequence[]>> mo29258a() {
        return (Map) this.f93975e.getValue(this, f93970f[2]);
    }

    @Override // p000.IX2, p000.InterfaceC38557bS5
    /* renamed from: b */
    public Set<Locale> mo29257b() {
        return this.f93972b;
    }

    @Override // p000.IX2, p000.InterfaceC38557bS5
    /* renamed from: c */
    public Map<Locale, Map<String, CharSequence>> mo29256c() {
        return (Map) this.f93973c.getValue(this, f93970f[0]);
    }

    @Override // p000.IX2, p000.InterfaceC38557bS5
    /* renamed from: d */
    public Map<Locale, Map<String, Map<DW3, CharSequence>>> mo29255d() {
        return (Map) this.f93974d.getValue(this, f93970f[1]);
    }

    /* renamed from: f */
    public final <T> Function1<Locale, Map<String, T>> m29253f(Map<Locale, Map<String, T>> map) {
        return new C25113a(map);
    }

    /* renamed from: g */
    public final <R> ReadWriteProperty<Object, Map<Locale, Map<String, R>>> m29252g(Map<Locale, Map<String, R>> map) {
        return new C25115b(null, m29253f(map), map, this, map, this, map, this, map, this);
    }
}
