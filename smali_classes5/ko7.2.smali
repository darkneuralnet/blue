.class public final Lko7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LAo7;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "shared-installation-id"

    invoke-static {v0}, Lgp7;->b(Ljava/lang/String;)LAo7;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lko7;->a:LAo7;

    return-void
.end method


# virtual methods
.method public final a(LWk7;Ljo7;)V
    .locals 2

    iget-object v0, p0, Lko7;->a:LAo7;

    new-instance v1, LXk7;

    invoke-direct {v1}, LXk7;-><init>()V

    invoke-virtual {p2}, Ljo7;->a()Lym7;

    move-result-object p2

    invoke-virtual {p2}, Lym7;->i()LBm7;

    move-result-object p2

    invoke-virtual {v1, p2}, LXk7;->e(LBm7;)LXk7;

    invoke-static {v1}, LYo7;->d(LXk7;)Lso7;

    move-result-object p2

    const-string v1, "o:a:mlkit:1.0.0"

    invoke-virtual {v0, p2, p1, v1}, LAo7;->c(Lso7;LWk7;Ljava/lang/String;)V

    return-void
.end method
