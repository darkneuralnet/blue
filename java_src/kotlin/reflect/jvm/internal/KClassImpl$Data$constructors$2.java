package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "Lkotlin/reflect/KFunction;", "T", "kotlin.jvm.PlatformType", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nKClassImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data$constructors$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,333:1\n1549#2:334\n1620#2,3:335\n*S KotlinDebug\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data$constructors$2\n*L\n94#1:334\n94#1:335,3\n*E\n"})
/* loaded from: classes8.dex */
public final class KClassImpl$Data$constructors$2 extends Lambda implements Function0<List<? extends KFunction<? extends T>>> {
    final /* synthetic */ KClassImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$constructors$2(KClassImpl<T> kClassImpl) {
        super(0);
        this.this$0 = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<KFunction<T>> invoke() {
        int collectionSizeOrDefault;
        Collection<ConstructorDescriptor> constructorDescriptors = this.this$0.getConstructorDescriptors();
        KDeclarationContainerImpl kDeclarationContainerImpl = this.this$0;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(constructorDescriptors, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (ConstructorDescriptor constructorDescriptor : constructorDescriptors) {
            arrayList.add(new KFunctionImpl(kDeclarationContainerImpl, constructorDescriptor));
        }
        return arrayList;
    }
}
