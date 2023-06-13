package p000;

import android.util.LruCache;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a?\u0010\n\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m28432d2 = {"K", "V", "Landroid/util/LruCache;", "key", "value", "", "b", "(Landroid/util/LruCache;Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "generator", C17296a.f69688o, "(Landroid/util/LruCache;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLruCache+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache+.kt\nco/bird/android/library/extension/LruCache_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,12:1\n1#2:13\n*E\n"})
/* renamed from: wE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50896wE2 {
    /* renamed from: a */
    public static final <K, V> V m7192a(LruCache<K, V> lruCache, K k, Function0<? extends V> generator) {
        Intrinsics.checkNotNullParameter(lruCache, "<this>");
        Intrinsics.checkNotNullParameter(generator, "generator");
        V v = lruCache.get(k);
        if (v == null) {
            V invoke = generator.invoke();
            lruCache.put(k, invoke);
            return invoke;
        }
        return v;
    }

    /* renamed from: b */
    public static final <K, V> void m7191b(LruCache<K, V> lruCache, K k, V v) {
        Intrinsics.checkNotNullParameter(lruCache, "<this>");
        lruCache.put(k, v);
    }
}
