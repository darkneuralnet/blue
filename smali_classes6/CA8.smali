.class public final synthetic LCA8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li49;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:LZN8;


# direct methods
.method public synthetic constructor <init>(ZLZN8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LCA8;->a:Z

    iput-object p2, p0, LCA8;->b:LZN8;

    return-void
.end method


# virtual methods
.method public final zza()Lz59;
    .locals 3

    iget-boolean v0, p0, LCA8;->a:Z

    iget-object v1, p0, LCA8;->b:LZN8;

    new-instance v2, LxO8;

    invoke-direct {v2}, LxO8;-><init>()V

    if-eqz v0, :cond_0

    sget-object v0, LgN8;->e:LgN8;

    goto :goto_0

    :cond_0
    sget-object v0, LgN8;->d:LgN8;

    :goto_0
    invoke-virtual {v2, v0}, LxO8;->e(LgN8;)LxO8;

    new-instance v0, LAR8;

    invoke-direct {v0}, LAR8;-><init>()V

    invoke-virtual {v0, v1}, LAR8;->b(LZN8;)LAR8;

    invoke-virtual {v0}, LAR8;->c()LWR8;

    move-result-object v0

    invoke-virtual {v2, v0}, LxO8;->h(LWR8;)LxO8;

    invoke-static {v2}, Lz59;->d(LxO8;)Lz59;

    move-result-object v0

    return-object v0
.end method
