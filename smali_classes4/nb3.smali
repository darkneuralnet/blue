.class public final Lnb3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lmb3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Loa3;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lro3;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LBc3;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LPc3;",
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
            "Loa3;",
            ">;",
            "LY94<",
            "Lro3;",
            ">;",
            "LY94<",
            "LBc3;",
            ">;",
            "LY94<",
            "LPc3;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb3;->a:LY94;

    iput-object p2, p0, Lnb3;->b:LY94;

    iput-object p3, p0, Lnb3;->c:LY94;

    iput-object p4, p0, Lnb3;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)Lnb3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Loa3;",
            ">;",
            "LY94<",
            "Lro3;",
            ">;",
            "LY94<",
            "LBc3;",
            ">;",
            "LY94<",
            "LPc3;",
            ">;)",
            "Lnb3;"
        }
    .end annotation

    new-instance v0, Lnb3;

    invoke-direct {v0, p0, p1, p2, p3}, Lnb3;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Loa3;Lro3;LBc3;LPc3;)Lmb3;
    .locals 1

    new-instance v0, Lmb3;

    invoke-direct {v0, p0, p1, p2, p3}, Lmb3;-><init>(Loa3;Lro3;LBc3;LPc3;)V

    return-object v0
.end method


# virtual methods
.method public b()Lmb3;
    .locals 4

    iget-object v0, p0, Lnb3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loa3;

    iget-object v1, p0, Lnb3;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lro3;

    iget-object v2, p0, Lnb3;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBc3;

    iget-object v3, p0, Lnb3;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LPc3;

    invoke-static {v0, v1, v2, v3}, Lnb3;->c(Loa3;Lro3;LBc3;LPc3;)Lmb3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnb3;->b()Lmb3;

    move-result-object v0

    return-object v0
.end method
