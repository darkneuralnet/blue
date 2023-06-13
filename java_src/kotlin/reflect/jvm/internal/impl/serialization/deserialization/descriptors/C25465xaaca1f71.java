package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumMemberNames$1 */
/* loaded from: classes8.dex */
public final class C25465xaaca1f71 extends Lambda implements Function0<Set<? extends Name>> {
    final /* synthetic */ DeserializedClassDescriptor.EnumEntryClassDescriptors this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25465xaaca1f71(DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors) {
        super(0);
        this.this$0 = enumEntryClassDescriptors;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends Name> invoke() {
        Set<? extends Name> computeEnumMemberNames;
        computeEnumMemberNames = this.this$0.computeEnumMemberNames();
        return computeEnumMemberNames;
    }
}
