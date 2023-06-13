.class public final LUy1$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUy1;-><init>(Landroid/content/Context;Ljava/lang/String;LnV5$a;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LUy1$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LUy1$c;",
        "b",
        "()LUy1$c;"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic g:LUy1;


# direct methods
.method public constructor <init>(LUy1;)V
    .locals 0

    iput-object p1, p0, LUy1$d;->g:LUy1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LUy1$c;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, LUy1$d;->g:LUy1;

    invoke-static {v1}, LUy1;->d(LUy1;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v0, LUy1$d;->g:LUy1;

    invoke-static {v1}, LUy1;->f(LUy1;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/io/File;

    iget-object v3, v0, LUy1$d;->g:LUy1;

    invoke-static {v3}, LUy1;->c(LUy1;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, LhV5;->a(Landroid/content/Context;)Ljava/io/File;

    move-result-object v3

    iget-object v4, v0, LUy1$d;->g:LUy1;

    invoke-static {v4}, LUy1;->d(LUy1;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v3, LUy1$c;

    iget-object v4, v0, LUy1$d;->g:LUy1;

    invoke-static {v4}, LUy1;->c(LUy1;)Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    new-instance v8, LUy1$b;

    invoke-direct {v8, v2}, LUy1$b;-><init>(LTy1;)V

    iget-object v1, v0, LUy1$d;->g:LUy1;

    invoke-static {v1}, LUy1;->b(LUy1;)LnV5$a;

    move-result-object v9

    iget-object v1, v0, LUy1$d;->g:LUy1;

    invoke-static {v1}, LUy1;->a(LUy1;)Z

    move-result v10

    move-object v5, v3

    invoke-direct/range {v5 .. v10}, LUy1$c;-><init>(Landroid/content/Context;Ljava/lang/String;LUy1$b;LnV5$a;Z)V

    goto :goto_0

    :cond_0
    new-instance v3, LUy1$c;

    iget-object v1, v0, LUy1$d;->g:LUy1;

    invoke-static {v1}, LUy1;->c(LUy1;)Landroid/content/Context;

    move-result-object v12

    iget-object v1, v0, LUy1$d;->g:LUy1;

    invoke-static {v1}, LUy1;->d(LUy1;)Ljava/lang/String;

    move-result-object v13

    new-instance v14, LUy1$b;

    invoke-direct {v14, v2}, LUy1$b;-><init>(LTy1;)V

    iget-object v1, v0, LUy1$d;->g:LUy1;

    invoke-static {v1}, LUy1;->b(LUy1;)LnV5$a;

    move-result-object v15

    iget-object v1, v0, LUy1$d;->g:LUy1;

    invoke-static {v1}, LUy1;->a(LUy1;)Z

    move-result v16

    move-object v11, v3

    invoke-direct/range {v11 .. v16}, LUy1$c;-><init>(Landroid/content/Context;Ljava/lang/String;LUy1$b;LnV5$a;Z)V

    :goto_0
    iget-object v1, v0, LUy1$d;->g:LUy1;

    invoke-static {v1}, LUy1;->g(LUy1;)Z

    move-result v1

    invoke-static {v3, v1}, LfV5;->f(Landroid/database/sqlite/SQLiteOpenHelper;Z)V

    return-object v3
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUy1$d;->b()LUy1$c;

    move-result-object v0

    return-object v0
.end method
