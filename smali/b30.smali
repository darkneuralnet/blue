.class public final Lb30;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001\u00a8\u0006\u0005"
    }
    d2 = {
        "Landroid/graphics/Shader;",
        "Landroidx/compose/ui/graphics/Shader;",
        "shader",
        "LLx5;",
        "a",
        "ui-graphics_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Landroid/graphics/Shader;)LLx5;
    .locals 1

    const-string v0, "shader"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb30$a;

    invoke-direct {v0, p0}, Lb30$a;-><init>(Landroid/graphics/Shader;)V

    return-object v0
.end method
