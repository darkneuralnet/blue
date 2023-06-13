package kotlin.reflect.jvm.internal;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
@Metadata(m28433d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a$\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\n¢\u0006\u0002\b\n"}, m28432d2 = {"<anonymous>", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Pair;", "", "Lkotlin/reflect/KTypeProjection;", "", "Lkotlin/reflect/jvm/internal/Key;", "Lkotlin/reflect/KType;", "it", "Ljava/lang/Class;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes8.dex */
public final class CachesKt$CACHE_FOR_GENERIC_CLASSIFIERS$1 extends Lambda implements Function1<Class<?>, ConcurrentHashMap<Pair<? extends List<? extends KTypeProjection>, ? extends Boolean>, KType>> {
    public static final CachesKt$CACHE_FOR_GENERIC_CLASSIFIERS$1 INSTANCE = new CachesKt$CACHE_FOR_GENERIC_CLASSIFIERS$1();

    public CachesKt$CACHE_FOR_GENERIC_CLASSIFIERS$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ConcurrentHashMap<Pair<List<KTypeProjection>, Boolean>, KType> invoke(Class<?> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new ConcurrentHashMap<>();
    }
}
