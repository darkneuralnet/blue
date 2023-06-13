.class public final LPI;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LOI;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lsu2;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lrd5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Lsu2;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Lrd5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPI;->a:LY94;

    iput-object p2, p0, LPI;->b:LY94;

    iput-object p3, p0, LPI;->c:LY94;

    iput-object p4, p0, LPI;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)LPI;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Lsu2;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Lrd5;",
            ">;)",
            "LPI;"
        }
    .end annotation

    new-instance v0, LPI;

    invoke-direct {v0, p0, p1, p2, p3}, LPI;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LEa;Lsu2;LTq4;Lrd5;)LOI;
    .locals 1

    new-instance v0, LOI;

    invoke-direct {v0, p0, p1, p2, p3}, LOI;-><init>(LEa;Lsu2;LTq4;Lrd5;)V

    return-object v0
.end method


# virtual methods
.method public b()LOI;
    .locals 4

    iget-object v0, p0, LPI;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    iget-object v1, p0, LPI;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsu2;

    iget-object v2, p0, LPI;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LTq4;

    iget-object v3, p0, LPI;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lrd5;

    invoke-static {v0, v1, v2, v3}, LPI;->c(LEa;Lsu2;LTq4;Lrd5;)LOI;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LPI;->b()LOI;

    move-result-object v0

    return-object v0
.end method
