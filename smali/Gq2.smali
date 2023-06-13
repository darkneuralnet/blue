.class public final LGq2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "LLifecycleOwner;",
        "Lzq2;",
        "a",
        "(LLifecycleOwner;)Lzq2;",
        "lifecycleScope",
        "lifecycle-common"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(LLifecycleOwner;)Lzq2;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p0

    invoke-static {p0}, LBq2;->a(Landroidx/lifecycle/f;)Lzq2;

    move-result-object p0

    return-object p0
.end method
