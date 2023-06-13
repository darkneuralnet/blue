.class public final Lm86;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Ll86;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lu86;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Ll86;Lu86;)V
    .locals 0

    iput-object p1, p0, Ll86;->e:Lu86;

    return-void
.end method


# virtual methods
.method public a(Ll86;)V
    .locals 1

    iget-object v0, p0, Lm86;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu86;

    invoke-static {p1, v0}, Lm86;->b(Ll86;Lu86;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ll86;

    invoke-virtual {p0, p1}, Lm86;->a(Ll86;)V

    return-void
.end method
