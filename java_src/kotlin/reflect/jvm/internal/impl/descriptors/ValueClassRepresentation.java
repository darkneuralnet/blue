package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
@SourceDebugExtension({"SMAP\nValueClassRepresentation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassRepresentation.kt\norg/jetbrains/kotlin/descriptors/ValueClassRepresentation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n1549#2:51\n1620#2,3:52\n*S KotlinDebug\n*F\n+ 1 ValueClassRepresentation.kt\norg/jetbrains/kotlin/descriptors/ValueClassRepresentation\n*L\n22#1:51\n22#1:52,3\n*E\n"})
/* loaded from: classes8.dex */
public abstract class ValueClassRepresentation<Type extends SimpleTypeMarker> {
    public /* synthetic */ ValueClassRepresentation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract List<Pair<Name, Type>> getUnderlyingPropertyNamesToTypes();

    public final <Other extends SimpleTypeMarker> ValueClassRepresentation<Other> mapUnderlyingType(Function1<? super Type, ? extends Other> transform) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (this instanceof InlineClassRepresentation) {
            InlineClassRepresentation inlineClassRepresentation = (InlineClassRepresentation) this;
            return new InlineClassRepresentation(inlineClassRepresentation.getUnderlyingPropertyName(), transform.invoke(inlineClassRepresentation.getUnderlyingType()));
        } else if (this instanceof MultiFieldValueClassRepresentation) {
            List<Pair<Name, Type>> underlyingPropertyNamesToTypes = getUnderlyingPropertyNamesToTypes();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(underlyingPropertyNamesToTypes, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<T> it = underlyingPropertyNamesToTypes.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                arrayList.add(TuplesKt.m28425to((Name) pair.component1(), transform.invoke((SimpleTypeMarker) pair.component2())));
            }
            return new MultiFieldValueClassRepresentation(arrayList);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private ValueClassRepresentation() {
    }
}
