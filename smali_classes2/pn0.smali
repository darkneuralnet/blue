.class public final Lpn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lon0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lrn0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Lon0;Lrn0;)V
    .locals 0

    iput-object p1, p0, Lon0;->b:Lrn0;

    return-void
.end method


# virtual methods
.method public a(Lon0;)V
    .locals 1

    iget-object v0, p0, Lpn0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrn0;

    invoke-static {p1, v0}, Lpn0;->b(Lon0;Lrn0;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lon0;

    invoke-virtual {p0, p1}, Lpn0;->a(Lon0;)V

    return-void
.end method
