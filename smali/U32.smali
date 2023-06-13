.class public final LU32;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"%\u0010\u0006\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "LU94;",
        "",
        "Lau0;",
        "a",
        "LU94;",
        "()LU94;",
        "LocalInspectionTables",
        "runtime_release"
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
            "Ljava/util/Set<",
            "Lau0;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, LU32$a;->g:LU32$a;

    invoke-static {v0}, Lgu0;->d(Lkotlin/jvm/functions/Function0;)LU94;

    move-result-object v0

    sput-object v0, LU32;->a:LU94;

    return-void
.end method

.method public static final a()LU94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LU94<",
            "Ljava/util/Set<",
            "Lau0;",
            ">;>;"
        }
    .end annotation

    sget-object v0, LU32;->a:LU94;

    return-object v0
.end method
