package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
@SourceDebugExtension({"SMAP\nNewCapturedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeConstructor$refine$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,290:1\n1549#2:291\n1620#2,3:292\n*S KotlinDebug\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeConstructor$refine$1$1\n*L\n271#1:291\n271#1:292,3\n*E\n"})
/* loaded from: classes8.dex */
public final class NewCapturedTypeConstructor$refine$1$1 extends Lambda implements Function0<List<? extends UnwrappedType>> {
    final /* synthetic */ KotlinTypeRefiner $kotlinTypeRefiner;
    final /* synthetic */ NewCapturedTypeConstructor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor$refine$1$1(NewCapturedTypeConstructor newCapturedTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
        super(0);
        this.this$0 = newCapturedTypeConstructor;
        this.$kotlinTypeRefiner = kotlinTypeRefiner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends UnwrappedType> invoke() {
        int collectionSizeOrDefault;
        List<UnwrappedType> mo118091getSupertypes = this.this$0.mo118091getSupertypes();
        KotlinTypeRefiner kotlinTypeRefiner = this.$kotlinTypeRefiner;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(mo118091getSupertypes, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (UnwrappedType unwrappedType : mo118091getSupertypes) {
            arrayList.add(unwrappedType.refine(kotlinTypeRefiner));
        }
        return arrayList;
    }
}
