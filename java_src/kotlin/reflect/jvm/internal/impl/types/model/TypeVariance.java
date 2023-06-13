package kotlin.reflect.jvm.internal.impl.types.model;
/* loaded from: classes8.dex */
public enum TypeVariance {
    IN("in"),
    OUT("out"),
    INV("");
    
    private final String presentation;

    TypeVariance(String str) {
        this.presentation = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.presentation;
    }
}
