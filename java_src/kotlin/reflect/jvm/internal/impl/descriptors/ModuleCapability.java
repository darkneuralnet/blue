package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
/* loaded from: classes8.dex */
public final class ModuleCapability<T> {
    private final String name;

    public ModuleCapability(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
