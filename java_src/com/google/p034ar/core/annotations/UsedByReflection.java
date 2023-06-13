package com.google.p034ar.core.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})
/* renamed from: com.google.ar.core.annotations.UsedByReflection */
/* loaded from: classes6.dex */
public @interface UsedByReflection {
    String value();
}
