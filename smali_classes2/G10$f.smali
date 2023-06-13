.class public LG10$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgd4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG10;->Ba()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LG10;


# direct methods
.method public constructor <init>(LG10;)V
    .locals 0

    iput-object p1, p0, LG10$f;->a:LG10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, LG10$f;->a:LG10;

    invoke-static {v0}, LG10;->A9(LG10;)LCx0;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, LG10$f;->a:LG10;

    invoke-static {v0}, LG10;->A9(LG10;)LCx0;

    move-result-object v0

    iget-object v1, p0, LG10$f;->a:LG10;

    invoke-virtual {v1}, LG10;->ea()Lex0;

    move-result-object v1

    invoke-interface {v0, v1}, LCx0;->k(Lex0;)V

    return-void
.end method
