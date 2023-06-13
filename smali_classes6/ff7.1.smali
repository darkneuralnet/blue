.class public final synthetic Lff7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYm9;


# instance fields
.field public final synthetic a:LG59;


# direct methods
.method public synthetic constructor <init>(LG59;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lff7;->a:LG59;

    return-void
.end method


# virtual methods
.method public final zza()LRl9;
    .locals 3

    iget-object v0, p0, Lff7;->a:LG59;

    new-instance v1, LW59;

    invoke-direct {v1}, LW59;-><init>()V

    invoke-static {}, LCC7;->f()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Ly59;->e:Ly59;

    goto :goto_0

    :cond_0
    sget-object v2, Ly59;->d:Ly59;

    :goto_0
    invoke-virtual {v1, v2}, LW59;->e(Ly59;)LW59;

    new-instance v2, Lf89;

    invoke-direct {v2}, Lf89;-><init>()V

    invoke-virtual {v2, v0}, Lf89;->b(LG59;)Lf89;

    invoke-virtual {v2}, Lf89;->c()Lv89;

    move-result-object v0

    invoke-virtual {v1, v0}, LW59;->h(Lv89;)LW59;

    invoke-static {v1}, Lwn9;->d(LW59;)LRl9;

    move-result-object v0

    return-object v0
.end method
