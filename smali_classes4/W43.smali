.class public final LW43;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LMN4;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LP43;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LMN4$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LP43;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LMN4$b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW43;->a:LP43;

    iput-object p2, p0, LW43;->b:LY94;

    iput-object p3, p0, LW43;->c:LY94;

    iput-object p4, p0, LW43;->d:LY94;

    return-void
.end method

.method public static a(LP43;LY94;LY94;LY94;)LW43;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LMN4$b;",
            ">;)",
            "LW43;"
        }
    .end annotation

    new-instance v0, LW43;

    invoke-direct {v0, p0, p1, p2, p3}, LW43;-><init>(LP43;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LP43;Landroid/content/Context;Lgl;LMN4$b;)LMN4;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LP43;->h(Landroid/content/Context;Lgl;LMN4$b;)LMN4;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LMN4;

    return-object p0
.end method


# virtual methods
.method public b()LMN4;
    .locals 4

    iget-object v0, p0, LW43;->a:LP43;

    iget-object v1, p0, LW43;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, LW43;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgl;

    iget-object v3, p0, LW43;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LMN4$b;

    invoke-static {v0, v1, v2, v3}, LW43;->c(LP43;Landroid/content/Context;Lgl;LMN4$b;)LMN4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LW43;->b()LMN4;

    move-result-object v0

    return-object v0
.end method
