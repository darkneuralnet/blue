package com.stripe.android.core.injection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0017J\u001a\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\n2\b\b\u0001\u0010\u0015\u001a\u00020\u000bH\u0016J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u0017\u001a\u00020\u000bH\u0016R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R(\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;", "Lcom/stripe/android/core/injection/InjectorRegistry;", "()V", "CURRENT_REGISTER_KEY", "Ljava/util/concurrent/atomic/AtomicInteger;", "getCURRENT_REGISTER_KEY$annotations", "getCURRENT_REGISTER_KEY", "()Ljava/util/concurrent/atomic/AtomicInteger;", "staticCacheMap", "Ljava/util/WeakHashMap;", "Lcom/stripe/android/core/injection/Injector;", "", "getStaticCacheMap$annotations", "getStaticCacheMap", "()Ljava/util/WeakHashMap;", "clear", "", "nextKey", "prefix", "register", "injector", "key", "retrieve", "injectorKey", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nWeakMapInjectorRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakMapInjectorRegistry.kt\ncom/stripe/android/core/injection/WeakMapInjectorRegistry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n288#2,2:58\n*S KotlinDebug\n*F\n+ 1 WeakMapInjectorRegistry.kt\ncom/stripe/android/core/injection/WeakMapInjectorRegistry\n*L\n41#1:58,2\n*E\n"})
/* loaded from: classes6.dex */
public final class WeakMapInjectorRegistry implements InjectorRegistry {
    public static final WeakMapInjectorRegistry INSTANCE = new WeakMapInjectorRegistry();
    private static final WeakHashMap<Injector, String> staticCacheMap = new WeakHashMap<>();
    private static final AtomicInteger CURRENT_REGISTER_KEY = new AtomicInteger(0);

    private WeakMapInjectorRegistry() {
    }

    public static /* synthetic */ void getCURRENT_REGISTER_KEY$annotations() {
    }

    public static /* synthetic */ void getStaticCacheMap$annotations() {
    }

    public final void clear() {
        WeakHashMap<Injector, String> weakHashMap = staticCacheMap;
        synchronized (weakHashMap) {
            weakHashMap.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final AtomicInteger getCURRENT_REGISTER_KEY() {
        return CURRENT_REGISTER_KEY;
    }

    public final WeakHashMap<Injector, String> getStaticCacheMap() {
        return staticCacheMap;
    }

    @Override // com.stripe.android.core.injection.InjectorRegistry
    @InjectorKey
    public String nextKey(String prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        int incrementAndGet = CURRENT_REGISTER_KEY.incrementAndGet();
        return prefix + incrementAndGet;
    }

    @Override // com.stripe.android.core.injection.InjectorRegistry
    public synchronized void register(Injector injector, @InjectorKey String key) {
        Intrinsics.checkNotNullParameter(injector, "injector");
        Intrinsics.checkNotNullParameter(key, "key");
        staticCacheMap.put(injector, key);
    }

    @Override // com.stripe.android.core.injection.InjectorRegistry
    public synchronized Injector retrieve(@InjectorKey String injectorKey) {
        Injector injector;
        Object obj;
        Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
        Set<Map.Entry<Injector, String>> entrySet = staticCacheMap.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "staticCacheMap.entries");
        Iterator<T> it = entrySet.iterator();
        while (true) {
            injector = null;
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((Map.Entry) obj).getValue(), injectorKey)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            injector = (Injector) entry.getKey();
        }
        return injector;
    }
}
