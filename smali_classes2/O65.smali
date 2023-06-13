.class public final LO65;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lz65;",
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
            "LYR4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lw65;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lp65;",
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
            "Lgl;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "Lw65;",
            ">;",
            "LY94<",
            "Lp65;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO65;->a:LY94;

    iput-object p2, p0, LO65;->b:LY94;

    iput-object p3, p0, LO65;->c:LY94;

    iput-object p4, p0, LO65;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)LO65;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "Lw65;",
            ">;",
            "LY94<",
            "Lp65;",
            ">;)",
            "LO65;"
        }
    .end annotation

    new-instance v0, LO65;

    invoke-direct {v0, p0, p1, p2, p3}, LO65;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lgl;LYR4;Lw65;Lp65;)Lz65;
    .locals 1

    new-instance v0, Lz65;

    invoke-direct {v0, p0, p1, p2, p3}, Lz65;-><init>(Lgl;LYR4;Lw65;Lp65;)V

    return-object v0
.end method


# virtual methods
.method public b()Lz65;
    .locals 4

    iget-object v0, p0, LO65;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    iget-object v1, p0, LO65;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYR4;

    iget-object v2, p0, LO65;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw65;

    iget-object v3, p0, LO65;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp65;

    invoke-static {v0, v1, v2, v3}, LO65;->c(Lgl;LYR4;Lw65;Lp65;)Lz65;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LO65;->b()Lz65;

    move-result-object v0

    return-object v0
.end method
