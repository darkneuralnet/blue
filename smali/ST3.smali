.class public final LST3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0002\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "LU94;",
        "LRT3;",
        "a",
        "LU94;",
        "()LU94;",
        "LocalPinnableContainer",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LU94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LU94<",
            "LRT3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget-object v0, LST3$a;->g:LST3$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Lgu0;->c(LEM5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LU94;

    move-result-object v0

    sput-object v0, LST3;->a:LU94;

    return-void
.end method

.method public static final a()LU94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LU94<",
            "LRT3;",
            ">;"
        }
    .end annotation

    sget-object v0, LST3;->a:LU94;

    return-object v0
.end method
