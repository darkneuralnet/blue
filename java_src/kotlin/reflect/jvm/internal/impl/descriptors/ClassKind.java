package kotlin.reflect.jvm.internal.impl.descriptors;

import ch.qos.logback.core.joran.action.Action;
/* loaded from: classes8.dex */
public enum ClassKind {
    CLASS(Action.CLASS_ATTRIBUTE),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");
    
    private final String codeRepresentation;

    ClassKind(String str) {
        this.codeRepresentation = str;
    }

    public final boolean isSingleton() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
