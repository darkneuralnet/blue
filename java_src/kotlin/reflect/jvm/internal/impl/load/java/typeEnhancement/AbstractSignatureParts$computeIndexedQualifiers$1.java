package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@SourceDebugExtension({"SMAP\nAbstractSignatureParts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts$computeIndexedQualifiers$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n1#2:229\n*E\n"})
/* loaded from: classes8.dex */
public final class AbstractSignatureParts$computeIndexedQualifiers$1 extends Lambda implements Function1<Integer, JavaTypeQualifiers> {
    final /* synthetic */ JavaTypeQualifiers[] $computedResult;
    final /* synthetic */ TypeEnhancementInfo $predefined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractSignatureParts$computeIndexedQualifiers$1(TypeEnhancementInfo typeEnhancementInfo, JavaTypeQualifiers[] javaTypeQualifiersArr) {
        super(1);
        this.$predefined = typeEnhancementInfo;
        this.$computedResult = javaTypeQualifiersArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ JavaTypeQualifiers invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final JavaTypeQualifiers invoke(int i) {
        int lastIndex;
        Map<Integer, JavaTypeQualifiers> map;
        JavaTypeQualifiers javaTypeQualifiers;
        TypeEnhancementInfo typeEnhancementInfo = this.$predefined;
        if (typeEnhancementInfo == null || (map = typeEnhancementInfo.getMap()) == null || (javaTypeQualifiers = map.get(Integer.valueOf(i))) == null) {
            JavaTypeQualifiers[] javaTypeQualifiersArr = this.$computedResult;
            if (i >= 0) {
                lastIndex = ArraysKt___ArraysKt.getLastIndex(javaTypeQualifiersArr);
                if (i <= lastIndex) {
                    return javaTypeQualifiersArr[i];
                }
            }
            return JavaTypeQualifiers.Companion.getNONE();
        }
        return javaTypeQualifiers;
    }
}
