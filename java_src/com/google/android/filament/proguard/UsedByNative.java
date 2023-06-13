package com.google.android.filament.proguard;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})
/* loaded from: classes5.dex */
public @interface UsedByNative {
    String value();
}
