.class public final LBa3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lya3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lab3;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lsa3;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LOl1;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LDl1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(Lya3;Lsa3;)V
    .locals 0

    iput-object p1, p0, Lya3;->c:Lsa3;

    return-void
.end method

.method public static b(Lya3;LDl1;)V
    .locals 0

    iput-object p1, p0, Lya3;->e:LDl1;

    return-void
.end method

.method public static c(Lya3;LOl1;)V
    .locals 0

    iput-object p1, p0, Lya3;->d:LOl1;

    return-void
.end method

.method public static e(Lya3;Lab3;)V
    .locals 0

    iput-object p1, p0, Lya3;->b:Lab3;

    return-void
.end method


# virtual methods
.method public d(Lya3;)V
    .locals 1

    iget-object v0, p0, LBa3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lab3;

    invoke-static {p1, v0}, LBa3;->e(Lya3;Lab3;)V

    iget-object v0, p0, LBa3;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsa3;

    invoke-static {p1, v0}, LBa3;->a(Lya3;Lsa3;)V

    iget-object v0, p0, LBa3;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LOl1;

    invoke-static {p1, v0}, LBa3;->c(Lya3;LOl1;)V

    iget-object v0, p0, LBa3;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDl1;

    invoke-static {p1, v0}, LBa3;->b(Lya3;LDl1;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lya3;

    invoke-virtual {p0, p1}, LBa3;->d(Lya3;)V

    return-void
.end method
