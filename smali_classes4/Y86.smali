.class public final LY86;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LX86;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lf96;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LX86;Lf96;)V
    .locals 0

    iput-object p1, p0, LX86;->e:Lf96;

    return-void
.end method


# virtual methods
.method public a(LX86;)V
    .locals 1

    iget-object v0, p0, LY86;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf96;

    invoke-static {p1, v0}, LY86;->b(LX86;Lf96;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LX86;

    invoke-virtual {p0, p1}, LY86;->a(LX86;)V

    return-void
.end method
