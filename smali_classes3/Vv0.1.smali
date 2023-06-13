.class public final LVv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LTv0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LDw0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LPv0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LKv0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(LTv0;LKv0;)V
    .locals 0

    iput-object p1, p0, LTv0;->d:LKv0;

    return-void
.end method

.method public static b(LTv0;LPv0;)V
    .locals 0

    iput-object p1, p0, LTv0;->c:LPv0;

    return-void
.end method

.method public static d(LTv0;LDw0;)V
    .locals 0

    iput-object p1, p0, LTv0;->b:LDw0;

    return-void
.end method


# virtual methods
.method public c(LTv0;)V
    .locals 1

    iget-object v0, p0, LVv0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDw0;

    invoke-static {p1, v0}, LVv0;->d(LTv0;LDw0;)V

    iget-object v0, p0, LVv0;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPv0;

    invoke-static {p1, v0}, LVv0;->b(LTv0;LPv0;)V

    iget-object v0, p0, LVv0;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LKv0;

    invoke-static {p1, v0}, LVv0;->a(LTv0;LKv0;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LTv0;

    invoke-virtual {p0, p1}, LVv0;->c(LTv0;)V

    return-void
.end method
