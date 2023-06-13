package kotlin.reflect.jvm.internal;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.full.KClassifiers;
@Metadata(m28433d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0011\u001a\u00020\u0012H\u0000\u001a6\u0010\u0013\u001a\u00020\u0002\"\b\b\u0000\u0010\u0014*\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0018\u001a\u00020\bH\u0000\u001a6\u0010\u0019\u001a\u00020\u0002\"\b\b\u0000\u0010\u0014*\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0018\u001a\u00020\bH\u0002\u001a&\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00140\f\"\b\b\u0000\u0010\u0014*\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0016H\u0000\u001a \u0010\u001b\u001a\u00020\u001c\"\b\b\u0000\u0010\u0014*\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0016H\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"6\u0010\u0003\u001a*\u0012&\u0012$\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0005j\u0002`\t\u0012\u0004\u0012\u00020\u00020\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"$\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000*0\b\u0002\u0010\u001d\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u00052\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0005¨\u0006\u001e"}, m28432d2 = {"CACHE_FOR_BASE_CLASSIFIERS", "Lkotlin/reflect/jvm/internal/CacheByClass;", "Lkotlin/reflect/KType;", "CACHE_FOR_GENERIC_CLASSIFIERS", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Pair;", "", "Lkotlin/reflect/KTypeProjection;", "", "Lkotlin/reflect/jvm/internal/Key;", "CACHE_FOR_NULLABLE_BASE_CLASSIFIERS", "K_CLASS_CACHE", "Lkotlin/reflect/jvm/internal/KClassImpl;", "", "kotlin.jvm.PlatformType", "K_PACKAGE_CACHE", "Lkotlin/reflect/jvm/internal/KPackageImpl;", "clearCaches", "", "getOrCreateKType", "T", "jClass", "Ljava/lang/Class;", "arguments", "isMarkedNullable", "getOrCreateKTypeWithTypeArguments", "getOrCreateKotlinClass", "getOrCreateKotlinPackage", "Lkotlin/reflect/KDeclarationContainer;", "Key", "kotlin-reflection"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\ncaches.kt\nKotlin\n*S Kotlin\n*F\n+ 1 caches.kt\nkotlin/reflect/jvm/internal/CachesKt\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n73#2,2:75\n1#3:77\n*S KotlinDebug\n*F\n+ 1 caches.kt\nkotlin/reflect/jvm/internal/CachesKt\n*L\n68#1:75,2\n68#1:77\n*E\n"})
/* loaded from: classes8.dex */
public final class CachesKt {
    private static final CacheByClass<KClassImpl<? extends Object>> K_CLASS_CACHE = CacheByClassKt.createCache(CachesKt$K_CLASS_CACHE$1.INSTANCE);
    private static final CacheByClass<KPackageImpl> K_PACKAGE_CACHE = CacheByClassKt.createCache(CachesKt$K_PACKAGE_CACHE$1.INSTANCE);
    private static final CacheByClass<KType> CACHE_FOR_BASE_CLASSIFIERS = CacheByClassKt.createCache(CachesKt$CACHE_FOR_BASE_CLASSIFIERS$1.INSTANCE);
    private static final CacheByClass<KType> CACHE_FOR_NULLABLE_BASE_CLASSIFIERS = CacheByClassKt.createCache(CachesKt$CACHE_FOR_NULLABLE_BASE_CLASSIFIERS$1.INSTANCE);
    private static final CacheByClass<ConcurrentHashMap<Pair<List<KTypeProjection>, Boolean>, KType>> CACHE_FOR_GENERIC_CLASSIFIERS = CacheByClassKt.createCache(CachesKt$CACHE_FOR_GENERIC_CLASSIFIERS$1.INSTANCE);

    public static final void clearCaches() {
        K_CLASS_CACHE.clear();
        K_PACKAGE_CACHE.clear();
        CACHE_FOR_BASE_CLASSIFIERS.clear();
        CACHE_FOR_NULLABLE_BASE_CLASSIFIERS.clear();
        CACHE_FOR_GENERIC_CLASSIFIERS.clear();
    }

    public static final <T> KType getOrCreateKType(Class<T> jClass, List<KTypeProjection> arguments, boolean z) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (arguments.isEmpty()) {
            if (z) {
                return CACHE_FOR_NULLABLE_BASE_CLASSIFIERS.get(jClass);
            }
            return CACHE_FOR_BASE_CLASSIFIERS.get(jClass);
        }
        return getOrCreateKTypeWithTypeArguments(jClass, arguments, z);
    }

    private static final <T> KType getOrCreateKTypeWithTypeArguments(Class<T> cls, List<KTypeProjection> list, boolean z) {
        List emptyList;
        ConcurrentHashMap<Pair<List<KTypeProjection>, Boolean>, KType> concurrentHashMap = CACHE_FOR_GENERIC_CLASSIFIERS.get(cls);
        Pair<List<KTypeProjection>, Boolean> m28425to = TuplesKt.m28425to(list, Boolean.valueOf(z));
        KType kType = concurrentHashMap.get(m28425to);
        if (kType == null) {
            KClassImpl orCreateKotlinClass = getOrCreateKotlinClass(cls);
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            KType createType = KClassifiers.createType(orCreateKotlinClass, list, z, emptyList);
            KType putIfAbsent = concurrentHashMap.putIfAbsent(m28425to, createType);
            if (putIfAbsent == null) {
                kType = createType;
            } else {
                kType = putIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(kType, "cache.getOrPut(arguments…lable, emptyList())\n    }");
        return kType;
    }

    public static final <T> KClassImpl<T> getOrCreateKotlinClass(Class<T> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        KClassImpl<? extends Object> kClassImpl = K_CLASS_CACHE.get(jClass);
        Intrinsics.checkNotNull(kClassImpl, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (KClassImpl<T>) kClassImpl;
    }

    public static final <T> KDeclarationContainer getOrCreateKotlinPackage(Class<T> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        return K_PACKAGE_CACHE.get(jClass);
    }
}
