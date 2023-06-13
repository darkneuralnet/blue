.class public final LYv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LXv0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lhw0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LWv0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LPv0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(LXv0;LWv0;)V
    .locals 0

    iput-object p1, p0, LXv0;->c:LWv0;

    return-void
.end method

.method public static b(LXv0;LPv0;)V
    .locals 0

    iput-object p1, p0, LXv0;->d:LPv0;

    return-void
.end method

.method public static d(LXv0;Lhw0;)V
    .locals 0

    iput-object p1, p0, LXv0;->b:Lhw0;

    return-void
.end method


# virtual methods
.method public c(LXv0;)V
    .locals 1

    iget-object v0, p0, LYv0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhw0;

    invoke-static {p1, v0}, LYv0;->d(LXv0;Lhw0;)V

    iget-object v0, p0, LYv0;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LWv0;

    invoke-static {p1, v0}, LYv0;->a(LXv0;LWv0;)V

    iget-object v0, p0, LYv0;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPv0;

    invoke-static {p1, v0}, LYv0;->b(LXv0;LPv0;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LXv0;

    invoke-virtual {p0, p1}, LYv0;->c(LXv0;)V

    return-void
.end method
