package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1 */
/* loaded from: classes8.dex */
public final class C25463xaf8327b7 extends Lambda implements Function1<Name, ClassDescriptor> {
    final /* synthetic */ DeserializedClassDescriptor.EnumEntryClassDescriptors this$0;
    final /* synthetic */ DeserializedClassDescriptor this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25463xaf8327b7(DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors, DeserializedClassDescriptor deserializedClassDescriptor) {
        super(1);
        this.this$0 = enumEntryClassDescriptors;
        this.this$1 = deserializedClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ClassDescriptor invoke(Name name) {
        Map map;
        NotNullLazyValue notNullLazyValue;
        Intrinsics.checkNotNullParameter(name, "name");
        map = this.this$0.enumEntryProtos;
        ProtoBuf.EnumEntry enumEntry = (ProtoBuf.EnumEntry) map.get(name);
        if (enumEntry != null) {
            DeserializedClassDescriptor deserializedClassDescriptor = this.this$1;
            DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors = this.this$0;
            StorageManager storageManager = deserializedClassDescriptor.getC().getStorageManager();
            notNullLazyValue = enumEntryClassDescriptors.enumMemberNames;
            return EnumEntrySyntheticClassDescriptor.create(storageManager, deserializedClassDescriptor, name, notNullLazyValue, new DeserializedAnnotations(deserializedClassDescriptor.getC().getStorageManager(), new C25464x65bb8e11(deserializedClassDescriptor, enumEntry)), SourceElement.NO_SOURCE);
        }
        return null;
    }
}
