package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B5\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u000f¢\u0006\u0004\b%\u0010&J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\b\u001a\u00020\u0004H\u0004R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR)\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR0\u0010!\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e\"\u0004\b\u001f\u0010 R0\u0010$\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 ¨\u0006'"}, m28432d2 = {"LCP5;", "K", "V", "", "", "remove", "", "hasNext", "c", "LOM5;", "b", "LOM5;", "e", "()LOM5;", "map", "", "", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", DateTokenConverter.CONVERTER_KEY, "I", "getModification", "()I", "setModification", "(I)V", "modification", "Ljava/util/Map$Entry;", "()Ljava/util/Map$Entry;", "setCurrent", "(Ljava/util/Map$Entry;)V", "current", "f", "setNext", "next", "<init>", "(LOM5;Ljava/util/Iterator;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n305#1,4:361\n1#2:365\n1#2:366\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n*L\n286#1:361,4\n286#1:365\n*E\n"})
/* renamed from: CP5 */
/* loaded from: classes.dex */
public abstract class CP5<K, V> {

    /* renamed from: b */
    public final OM5<K, V> f4038b;

    /* renamed from: c */
    public final Iterator<Map.Entry<K, V>> f4039c;

    /* renamed from: d */
    public int f4040d;

    /* renamed from: e */
    public Map.Entry<? extends K, ? extends V> f4041e;

    /* renamed from: f */
    public Map.Entry<? extends K, ? extends V> f4042f;

    /* JADX WARN: Multi-variable type inference failed */
    public CP5(OM5<K, V> map, Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f4038b = map;
        this.f4039c = iterator;
        this.f4040d = map.m92379d();
        m112250c();
    }

    /* renamed from: c */
    public final void m112250c() {
        Map.Entry<K, V> entry;
        this.f4041e = this.f4042f;
        if (this.f4039c.hasNext()) {
            entry = this.f4039c.next();
        } else {
            entry = null;
        }
        this.f4042f = entry;
    }

    /* renamed from: d */
    public final Map.Entry<K, V> m112249d() {
        return (Map.Entry<? extends K, ? extends V>) this.f4041e;
    }

    /* renamed from: e */
    public final OM5<K, V> m112248e() {
        return this.f4038b;
    }

    /* renamed from: f */
    public final Map.Entry<K, V> m112247f() {
        return (Map.Entry<? extends K, ? extends V>) this.f4042f;
    }

    public final boolean hasNext() {
        return this.f4042f != null;
    }

    public final void remove() {
        if (m112248e().m92379d() == this.f4040d) {
            Map.Entry<? extends K, ? extends V> entry = this.f4041e;
            if (entry != null) {
                this.f4038b.remove(entry.getKey());
                this.f4041e = null;
                Unit unit = Unit.INSTANCE;
                this.f4040d = m112248e().m92379d();
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
