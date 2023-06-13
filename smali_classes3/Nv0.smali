.class public final LNv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LKv0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LPv0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(LKv0;LPv0;)V
    .locals 0

    iput-object p1, p0, LKv0;->g:LPv0;

    return-void
.end method


# virtual methods
.method public b(LKv0;)V
    .locals 1

    iget-object v0, p0, LNv0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPv0;

    invoke-static {p1, v0}, LNv0;->a(LKv0;LPv0;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LKv0;

    invoke-virtual {p0, p1}, LNv0;->b(LKv0;)V

    return-void
.end method
