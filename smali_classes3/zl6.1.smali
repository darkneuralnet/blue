.class public final Lzl6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lyl6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LAl6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Lyl6;LAl6;)V
    .locals 0

    iput-object p1, p0, Lyl6;->b:LAl6;

    return-void
.end method


# virtual methods
.method public a(Lyl6;)V
    .locals 1

    iget-object v0, p0, Lzl6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LAl6;

    invoke-static {p1, v0}, Lzl6;->b(Lyl6;LAl6;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lyl6;

    invoke-virtual {p0, p1}, Lzl6;->a(Lyl6;)V

    return-void
.end method
