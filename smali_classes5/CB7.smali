.class public final LCB7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LYu7;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    sget-object v0, LIw7;->h:LIw7;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, LIw7;->n:LIw7;

    invoke-static {}, LpD7;->E()LpD7;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, LYu7;->d(LIw7;Ljava/lang/Object;LIw7;Ljava/lang/Object;)LYu7;

    move-result-object v0

    sput-object v0, LCB7;->a:LYu7;

    return-void
.end method
