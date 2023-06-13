.class public final Lnm3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lmm3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Llh6;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnm3;->a:LY94;

    iput-object p2, p0, Lnm3;->b:LY94;

    iput-object p3, p0, Lnm3;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)Lnm3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)",
            "Lnm3;"
        }
    .end annotation

    new-instance v0, Lnm3;

    invoke-direct {v0, p0, p1, p2}, Lnm3;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lgl;Llh6;Le13;)Lmm3;
    .locals 1

    new-instance v0, Lmm3;

    invoke-direct {v0, p0, p1, p2}, Lmm3;-><init>(Lgl;Llh6;Le13;)V

    return-object v0
.end method


# virtual methods
.method public b()Lmm3;
    .locals 3

    iget-object v0, p0, Lnm3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    iget-object v1, p0, Lnm3;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llh6;

    iget-object v2, p0, Lnm3;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le13;

    invoke-static {v0, v1, v2}, Lnm3;->c(Lgl;Llh6;Le13;)Lmm3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnm3;->b()Lmm3;

    move-result-object v0

    return-object v0
.end method
