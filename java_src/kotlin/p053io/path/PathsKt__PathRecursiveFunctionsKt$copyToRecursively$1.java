package kotlin.p053io.path;

import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/nio/file/Path;", "<anonymous parameter 1>", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$1 */
/* loaded from: classes8.dex */
public final class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$1 extends Lambda implements Function3 {
    public static final PathsKt__PathRecursiveFunctionsKt$copyToRecursively$1 INSTANCE = new PathsKt__PathRecursiveFunctionsKt$copyToRecursively$1();

    public PathsKt__PathRecursiveFunctionsKt$copyToRecursively$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(C41355g83.m39981a(obj), C41355g83.m39981a(obj2), (Exception) obj3);
    }

    public final Void invoke(Path path, Path path2, Exception exception) {
        Intrinsics.checkNotNullParameter(path, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(path2, "<anonymous parameter 1>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        throw exception;
    }
}
