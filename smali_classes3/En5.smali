.class public final LEn5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LDn5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LFn5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LDn5;LFn5;)V
    .locals 0

    iput-object p1, p0, LDn5;->b:LFn5;

    return-void
.end method


# virtual methods
.method public a(LDn5;)V
    .locals 1

    iget-object v0, p0, LEn5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFn5;

    invoke-static {p1, v0}, LEn5;->b(LDn5;LFn5;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LDn5;

    invoke-virtual {p0, p1}, LEn5;->a(LDn5;)V

    return-void
.end method
