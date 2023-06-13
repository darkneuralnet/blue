.class public final LDD4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "LCD4;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LID4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(LCD4;LID4;)V
    .locals 0

    iput-object p1, p0, LCD4;->b:LID4;

    return-void
.end method


# virtual methods
.method public a(LCD4;)V
    .locals 1

    iget-object v0, p0, LDD4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LID4;

    invoke-static {p1, v0}, LDD4;->b(LCD4;LID4;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LCD4;

    invoke-virtual {p0, p1}, LDD4;->a(LCD4;)V

    return-void
.end method
