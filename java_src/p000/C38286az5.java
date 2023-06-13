package p000;

import android.content.SharedPreferences;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000e\u001a\u00020\n2\u0014\u0010\r\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"Laz5;", "V", "LVk2;", "", "key", "h", "(Ljava/lang/String;)Ljava/lang/Object;", "", "e", "value", "", "i", "(Ljava/lang/String;Ljava/lang/Object;)V", "from", "f", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "Landroid/content/SharedPreferences;", "b", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lht5;", "c", "Lht5;", "serializer", "<init>", "(Landroid/content/SharedPreferences;Lht5;)V", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: az5  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38286az5<V> implements InterfaceC36619Vk2<String, V> {

    /* renamed from: b */
    public final SharedPreferences f56745b;

    /* renamed from: c */
    public final InterfaceC42394ht5<V, String> f56746c;

    public C38286az5(SharedPreferences sharedPreferences, InterfaceC42394ht5<V, String> serializer) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f56745b = sharedPreferences;
        this.f56746c = serializer;
    }

    @Override // p000.InterfaceC36619Vk2
    /* renamed from: a */
    public void mo65175a() {
        this.f56745b.edit().clear().apply();
    }

    @Override // p000.InterfaceC36619Vk2
    /* renamed from: d */
    public void mo65174b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f56745b.edit().remove(key).apply();
    }

    @Override // p000.InterfaceC36619Vk2
    /* renamed from: e */
    public Map<? extends String, V> mo65171e() {
        int mapCapacity;
        Map<String, ?> all = this.f56745b.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "sharedPreferences.all");
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(all.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        Iterator<T> it = all.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            InterfaceC42394ht5<V, String> interfaceC42394ht5 = this.f56746c;
            Object value = entry.getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put(key, interfaceC42394ht5.mo35621a((String) value));
        }
        return linkedHashMap;
    }

    @Override // p000.InterfaceC36619Vk2
    /* renamed from: f */
    public void mo65170f(Map<? extends String, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        SharedPreferences.Editor edit = this.f56745b.edit();
        for (Map.Entry<? extends String, ? extends V> entry : from.entrySet()) {
            edit.putString(entry.getKey(), this.f56746c.serialize(entry.getValue()));
        }
        edit.apply();
    }

    @Override // p000.InterfaceC36619Vk2
    /* renamed from: h */
    public V mo65173c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String string = this.f56745b.getString(key, null);
        if (string == null) {
            return null;
        }
        return this.f56746c.mo35621a(string);
    }

    @Override // p000.InterfaceC36619Vk2
    /* renamed from: i */
    public void mo65169g(String key, V v) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f56745b.edit().putString(key, this.f56746c.serialize(v)).apply();
    }
}
