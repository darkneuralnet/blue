.class public final LYk6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LXk6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lal6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LXk6;Lal6;)V
    .locals 0

    iput-object p1, p0, LXk6;->b:Lal6;

    return-void
.end method


# virtual methods
.method public a(LXk6;)V
    .locals 1

    iget-object v0, p0, LYk6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lal6;

    invoke-static {p1, v0}, LYk6;->b(LXk6;Lal6;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LXk6;

    invoke-virtual {p0, p1}, LYk6;->a(LXk6;)V

    return-void
.end method
