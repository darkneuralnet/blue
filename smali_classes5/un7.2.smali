.class public final Lun7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LAo7;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "shared-acceleration-allowlist"

    invoke-static {v0}, Lgp7;->b(Ljava/lang/String;)LAo7;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lun7;->a:LAo7;

    return-void
.end method


# virtual methods
.method public final a(LGn7;)V
    .locals 1

    sget-object v0, LWk7;->o2:LWk7;

    invoke-virtual {p0, p1, v0}, Lun7;->c(LGn7;LWk7;)V

    return-void
.end method

.method public final b(LGn7;)V
    .locals 1

    sget-object v0, LWk7;->n2:LWk7;

    invoke-virtual {p0, p1, v0}, Lun7;->c(LGn7;LWk7;)V

    return-void
.end method

.method public final c(LGn7;LWk7;)V
    .locals 2

    iget-object v0, p0, Lun7;->a:LAo7;

    new-instance v1, LXk7;

    invoke-direct {v1}, LXk7;-><init>()V

    invoke-virtual {p1}, LGn7;->a()LZy9;

    move-result-object p1

    invoke-virtual {p1}, LZy9;->k()Ldz9;

    move-result-object p1

    invoke-virtual {v1, p1}, LXk7;->c(Ldz9;)LXk7;

    invoke-static {v1}, LYo7;->d(LXk7;)Lso7;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, LAo7;->b(Lso7;LWk7;)V

    return-void
.end method
