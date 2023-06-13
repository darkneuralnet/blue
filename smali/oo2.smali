.class public final Loo2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\"\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0005"
    }
    d2 = {
        "LjO5;",
        "LA52;",
        "a",
        "LjO5;",
        "InterruptionSpec",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LjO5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LjO5<",
            "LA52;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    sget-object v0, LA52;->b:LA52$a;

    invoke-static {v0}, LDu6;->c(LA52$a;)J

    move-result-wide v0

    invoke-static {v0, v1}, LA52;->b(J)LA52;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/high16 v4, 0x43c80000    # 400.0f

    invoke-static {v3, v4, v0, v1, v2}, Lmf;->i(FFLjava/lang/Object;ILjava/lang/Object;)LjO5;

    move-result-object v0

    sput-object v0, Loo2;->a:LjO5;

    return-void
.end method

.method public static final synthetic a()LjO5;
    .locals 1

    sget-object v0, Loo2;->a:LjO5;

    return-object v0
.end method
