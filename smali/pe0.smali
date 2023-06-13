.class public final Lpe0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u000c\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "LC61;",
        "LL61;",
        "c",
        "Lg01;",
        "a",
        "Lg01;",
        "DefaultDensity",
        "ui-graphics_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lg01;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v0}, Li01;->a(FF)Lg01;

    move-result-object v0

    sput-object v0, Lpe0;->a:Lg01;

    return-void
.end method

.method public static final synthetic a(LC61;)LL61;
    .locals 0

    invoke-static {p0}, Lpe0;->c(LC61;)LL61;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()Lg01;
    .locals 1

    sget-object v0, Lpe0;->a:Lg01;

    return-object v0
.end method

.method public static final c(LC61;)LL61;
    .locals 1

    new-instance v0, Lpe0$a;

    invoke-direct {v0, p0}, Lpe0$a;-><init>(LC61;)V

    return-object v0
.end method
