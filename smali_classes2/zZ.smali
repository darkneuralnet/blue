.class public final LzZ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LyZ;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEZ;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LyZ;LEZ;)V
    .locals 0

    iput-object p1, p0, LyZ;->b:LEZ;

    return-void
.end method


# virtual methods
.method public a(LyZ;)V
    .locals 1

    iget-object v0, p0, LzZ;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEZ;

    invoke-static {p1, v0}, LzZ;->b(LyZ;LEZ;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LyZ;

    invoke-virtual {p0, p1}, LzZ;->a(LyZ;)V

    return-void
.end method
