.class public final LXd;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000\u00a8\u0006\u0006"
    }
    d2 = {
        "Landroid/graphics/Typeface;",
        "typeface",
        "LIb6;",
        "b",
        "Lkw1;",
        "a",
        "ui-text_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Landroid/graphics/Typeface;)Lkw1;
    .locals 1

    const-string v0, "typeface"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LXd;->b(Landroid/graphics/Typeface;)LIb6;

    move-result-object p0

    invoke-static {p0}, Llw1;->a(LIb6;)Lkw1;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroid/graphics/Typeface;)LIb6;
    .locals 1

    const-string v0, "typeface"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LWd;

    invoke-direct {v0, p0}, LWd;-><init>(Landroid/graphics/Typeface;)V

    return-object v0
.end method
