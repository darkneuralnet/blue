package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001BQ\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\r\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b*\u0010+J\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001Jh\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\r2\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\tHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!R$\u0010\u0011\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&R\"\u0010)\u001a\u00028\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010#\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&¨\u0006,"}, m28432d2 = {"LRa6;", "", "T", "Lco/bird/android/model/wire/configs/Config;", "config", C17296a.f69688o, "previousValue", "", "f", "", "key", "Lkotlin/reflect/KType;", "type", "Lkotlin/Function1;", "configValueAdapter", "Lkotlin/Function2;", "configAdapter", "value", "b", "(Ljava/lang/String;Lkotlin/reflect/KType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)LRa6;", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lkotlin/reflect/KType;", DateTokenConverter.CONVERTER_KEY, "()Lkotlin/reflect/KType;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "e", "Ljava/lang/Object;", "()Ljava/lang/Object;", "h", "(Ljava/lang/Object;)V", "getConfigValue", "g", "configValue", "<init>", "(Ljava/lang/String;Lkotlin/reflect/KType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V", "config_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTweak.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tweak.kt\nco/bird/android/config/tweaks/dsl/Tweak\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
/* renamed from: Ra6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C35597Ra6<T> {

    /* renamed from: a */
    public final String f32247a;

    /* renamed from: b */
    public final KType f32248b;

    /* renamed from: c */
    public final Function1<Config, T> f32249c;

    /* renamed from: d */
    public final Function2<Config, T, Config> f32250d;

    /* renamed from: e */
    public T f32251e;

    /* renamed from: f */
    public T f32252f;

    /* JADX WARN: Multi-variable type inference failed */
    public C35597Ra6(String key, KType type, Function1<? super Config, ? extends T> configValueAdapter, Function2<? super Config, ? super T, Config> configAdapter, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(configValueAdapter, "configValueAdapter");
        Intrinsics.checkNotNullParameter(configAdapter, "configAdapter");
        this.f32247a = key;
        this.f32248b = type;
        this.f32249c = configValueAdapter;
        this.f32250d = configAdapter;
        this.f32251e = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C35597Ra6 copy$default(C35597Ra6 c35597Ra6, String str, KType kType, Function1 function1, Function2 function2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = c35597Ra6.f32247a;
        }
        if ((i & 2) != 0) {
            kType = c35597Ra6.f32248b;
        }
        KType kType2 = kType;
        Function1<Config, T> function12 = function1;
        if ((i & 4) != 0) {
            function12 = c35597Ra6.f32249c;
        }
        Function1 function13 = function12;
        Function2<Config, T, Config> function22 = function2;
        if ((i & 8) != 0) {
            function22 = c35597Ra6.f32250d;
        }
        Function2 function23 = function22;
        T t = obj;
        if ((i & 16) != 0) {
            t = c35597Ra6.f32251e;
        }
        return c35597Ra6.m86602b(str, kType2, function13, function23, t);
    }

    /* renamed from: a */
    public final Config m86603a(Config config) {
        Config invoke;
        Intrinsics.checkNotNullParameter(config, "config");
        try {
            m86597g(this.f32249c.invoke(config));
            T t = this.f32251e;
            if (t != null && (invoke = this.f32250d.invoke(config, t)) != null) {
                return invoke;
            }
            return config;
        } catch (Exception e) {
            String str = this.f32247a;
            throw new RuntimeException("Unrecoverable exception while attempting to update configValue for key " + str, e);
        }
    }

    /* renamed from: b */
    public final C35597Ra6<T> m86602b(String key, KType type, Function1<? super Config, ? extends T> configValueAdapter, Function2<? super Config, ? super T, Config> configAdapter, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(configValueAdapter, "configValueAdapter");
        Intrinsics.checkNotNullParameter(configAdapter, "configAdapter");
        return new C35597Ra6<>(key, type, configValueAdapter, configAdapter, t);
    }

    /* renamed from: c */
    public final String m86601c() {
        return this.f32247a;
    }

    /* renamed from: d */
    public final KType m86600d() {
        return this.f32248b;
    }

    /* renamed from: e */
    public final T m86599e() {
        return this.f32251e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C35597Ra6) {
            C35597Ra6 c35597Ra6 = (C35597Ra6) obj;
            return Intrinsics.areEqual(this.f32247a, c35597Ra6.f32247a) && Intrinsics.areEqual(this.f32248b, c35597Ra6.f32248b) && Intrinsics.areEqual(this.f32249c, c35597Ra6.f32249c) && Intrinsics.areEqual(this.f32250d, c35597Ra6.f32250d) && Intrinsics.areEqual(this.f32251e, c35597Ra6.f32251e);
        }
        return false;
    }

    /* renamed from: f */
    public final void m86598f(Object obj) {
        if (obj == null) {
            obj = (T) null;
        }
        this.f32251e = (T) obj;
    }

    /* renamed from: g */
    public final void m86597g(T t) {
        Intrinsics.checkNotNullParameter(t, "<set-?>");
        this.f32252f = t;
    }

    /* renamed from: h */
    public final void m86596h(T t) {
        this.f32251e = t;
    }

    public int hashCode() {
        int hashCode = ((((((this.f32247a.hashCode() * 31) + this.f32248b.hashCode()) * 31) + this.f32249c.hashCode()) * 31) + this.f32250d.hashCode()) * 31;
        T t = this.f32251e;
        return hashCode + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        String str = this.f32247a;
        KType kType = this.f32248b;
        Function1<Config, T> function1 = this.f32249c;
        Function2<Config, T, Config> function2 = this.f32250d;
        T t = this.f32251e;
        return "Tweak(key=" + str + ", type=" + kType + ", configValueAdapter=" + function1 + ", configAdapter=" + function2 + ", value=" + t + ")";
    }

    public /* synthetic */ C35597Ra6(String str, KType kType, Function1 function1, Function2 function2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, kType, function1, function2, (i & 16) != 0 ? null : obj);
    }
}
