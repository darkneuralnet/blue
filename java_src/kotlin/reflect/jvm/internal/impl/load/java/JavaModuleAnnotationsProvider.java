package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
/* loaded from: classes8.dex */
public interface JavaModuleAnnotationsProvider {
    List<JavaAnnotation> getAnnotationsForModuleOwnerOfClass(ClassId classId);
}
