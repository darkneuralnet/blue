package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClassifiers;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "Lkotlin/reflect/KType;", "it", "Ljava/lang/Class;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes8.dex */
public final class CachesKt$CACHE_FOR_NULLABLE_BASE_CLASSIFIERS$1 extends Lambda implements Function1<Class<?>, KType> {
    public static final CachesKt$CACHE_FOR_NULLABLE_BASE_CLASSIFIERS$1 INSTANCE = new CachesKt$CACHE_FOR_NULLABLE_BASE_CLASSIFIERS$1();

    public CachesKt$CACHE_FOR_NULLABLE_BASE_CLASSIFIERS$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final KType invoke(Class<?> it) {
        List emptyList;
        List emptyList2;
        Intrinsics.checkNotNullParameter(it, "it");
        KClassImpl orCreateKotlinClass = CachesKt.getOrCreateKotlinClass(it);
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        return KClassifiers.createType(orCreateKotlinClass, emptyList, true, emptyList2);
    }
}
