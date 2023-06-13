package kotlin.p053io.path;

import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "Lkotlin/io/path/CopyActionResult;", "Lkotlin/io/path/CopyActionContext;", "src", "Ljava/nio/file/Path;", "dst", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$4 */
/* loaded from: classes8.dex */
public final class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$4 extends Lambda implements Function3<CopyActionContext, Path, Path, CopyActionResult> {
    final /* synthetic */ boolean $followLinks;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathsKt__PathRecursiveFunctionsKt$copyToRecursively$4(boolean z) {
        super(3);
        this.$followLinks = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ CopyActionResult invoke(CopyActionContext copyActionContext, Path path, Path path2) {
        return invoke2(copyActionContext, C41355g83.m39981a(path), C41355g83.m39981a(path2));
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final CopyActionResult invoke2(CopyActionContext copyActionContext, Path src, Path dst) {
        Intrinsics.checkNotNullParameter(copyActionContext, "$this$null");
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(dst, "dst");
        return copyActionContext.copyToIgnoringExistingDirectory(src, dst, this.$followLinks);
    }
}
