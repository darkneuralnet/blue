package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002B\u0007¢\u0006\u0004\b0\u00101J$\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ3\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u000fH\u0096\u0002J,\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u0006\u0010\u001c\u001a\u00020\u0000J\u0013\u0010\u001e\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020!H\u0016R&\u0010%\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\"\u0010+\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*¨\u00062"}, m28432d2 = {"Lbs5;", "Lss5;", "", "", "Lrs5;", "", "T", "key", "f", "(Lrs5;)Ljava/lang/Object;", "Lkotlin/Function0;", "defaultValue", "h", "(Lrs5;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "j", "", "iterator", "value", "", C17296a.f69688o, "(Lrs5;Ljava/lang/Object;)V", "", "c", "child", "u", "(Lbs5;)V", "peer", "b", "e", LegacyRepairType.OTHER_KEY, "equals", "", "hashCode", "", "toString", "", "Ljava/util/Map;", "props", "Z", "s", "()Z", "w", "(Z)V", "isMergingSemanticsOfDescendants", DateTokenConverter.CONVERTER_KEY, "o", "v", "isClearingSemantics", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bs5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38809bs5 implements InterfaceC48906ss5, Iterable<Map.Entry<? extends C48314rs5<?>, ? extends Object>>, KMappedMarker {

    /* renamed from: b */
    public final Map<C48314rs5<?>, Object> f59663b = new LinkedHashMap();

    /* renamed from: c */
    public boolean f59664c;

    /* renamed from: d */
    public boolean f59665d;

    @Override // p000.InterfaceC48906ss5
    /* renamed from: a */
    public <T> void mo13560a(C48314rs5<T> key, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f59663b.put(key, t);
    }

    /* renamed from: b */
    public final void m62261b(C38809bs5 peer) {
        Intrinsics.checkNotNullParameter(peer, "peer");
        if (peer.f59664c) {
            this.f59664c = true;
        }
        if (peer.f59665d) {
            this.f59665d = true;
        }
        for (Map.Entry<C48314rs5<?>, Object> entry : peer.f59663b.entrySet()) {
            C48314rs5<?> key = entry.getKey();
            Object value = entry.getValue();
            if (!this.f59663b.containsKey(key)) {
                this.f59663b.put(key, value);
            } else if (value instanceof C4297K1) {
                Object obj = this.f59663b.get(key);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                C4297K1 c4297k1 = (C4297K1) obj;
                Map<C48314rs5<?>, Object> map = this.f59663b;
                String m99356b = c4297k1.m99356b();
                if (m99356b == null) {
                    m99356b = ((C4297K1) value).m99356b();
                }
                Function m99357a = c4297k1.m99357a();
                if (m99357a == null) {
                    m99357a = ((C4297K1) value).m99357a();
                }
                map.put(key, new C4297K1(m99356b, m99357a));
            }
        }
    }

    /* renamed from: c */
    public final <T> boolean m62260c(C48314rs5<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f59663b.containsKey(key);
    }

    /* renamed from: e */
    public final C38809bs5 m62259e() {
        C38809bs5 c38809bs5 = new C38809bs5();
        c38809bs5.f59664c = this.f59664c;
        c38809bs5.f59665d = this.f59665d;
        c38809bs5.f59663b.putAll(this.f59663b);
        return c38809bs5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38809bs5)) {
            return false;
        }
        C38809bs5 c38809bs5 = (C38809bs5) obj;
        if (Intrinsics.areEqual(this.f59663b, c38809bs5.f59663b) && this.f59664c == c38809bs5.f59664c && this.f59665d == c38809bs5.f59665d) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final <T> T m62258f(C48314rs5<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t = (T) this.f59663b.get(key);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Key not present: " + key + " - consider getOrElse or getOrNull");
    }

    /* renamed from: h */
    public final <T> T m62257h(C48314rs5<T> key, Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t = (T) this.f59663b.get(key);
        if (t == null) {
            return defaultValue.invoke();
        }
        return t;
    }

    public int hashCode() {
        return (((this.f59663b.hashCode() * 31) + Boolean.hashCode(this.f59664c)) * 31) + Boolean.hashCode(this.f59665d);
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<? extends C48314rs5<?>, ? extends Object>> iterator() {
        return this.f59663b.entrySet().iterator();
    }

    /* renamed from: j */
    public final <T> T m62256j(C48314rs5<T> key, Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t = (T) this.f59663b.get(key);
        if (t == null) {
            return defaultValue.invoke();
        }
        return t;
    }

    /* renamed from: o */
    public final boolean m62255o() {
        return this.f59665d;
    }

    /* renamed from: s */
    public final boolean m62254s() {
        return this.f59664c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.f59664c) {
            sb.append("");
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f59665d) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry<C48314rs5<?>, Object> entry : this.f59663b.entrySet()) {
            Object value = entry.getValue();
            sb.append(str);
            sb.append(entry.getKey().m15148a());
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return C33100Gj2.m104826a(this, null) + "{ " + ((Object) sb) + " }";
    }

    /* renamed from: u */
    public final void m62253u(C38809bs5 child) {
        Intrinsics.checkNotNullParameter(child, "child");
        for (Map.Entry<C48314rs5<?>, Object> entry : child.f59663b.entrySet()) {
            C48314rs5<?> key = entry.getKey();
            Object value = entry.getValue();
            Object obj = this.f59663b.get(key);
            Intrinsics.checkNotNull(key, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object m15147b = key.m15147b(obj, value);
            if (m15147b != null) {
                this.f59663b.put(key, m15147b);
            }
        }
    }

    /* renamed from: v */
    public final void m62252v(boolean z) {
        this.f59665d = z;
    }

    /* renamed from: w */
    public final void m62251w(boolean z) {
        this.f59664c = z;
    }
}
