package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.name.FqName;
/* loaded from: classes8.dex */
public interface KotlinMetadataFinder {
    InputStream findBuiltInsData(FqName fqName);
}