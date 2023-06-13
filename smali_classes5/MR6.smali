.class public final LMR6;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LMb7;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    sget-object v0, LRc7;->h:LRc7;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, LRc7;->n:LRc7;

    invoke-static {}, LXR6;->F()LXR6;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, LMb7;->d(LRc7;Ljava/lang/Object;LRc7;Ljava/lang/Object;)LMb7;

    move-result-object v0

    sput-object v0, LMR6;->a:LMb7;

    return-void
.end method
