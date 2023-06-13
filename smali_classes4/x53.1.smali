.class public final Lx53;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lqj0;",
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
            "Lmj0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LP43;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lmj0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx53;->a:LP43;

    iput-object p2, p0, Lx53;->b:LY94;

    iput-object p3, p0, Lx53;->c:LY94;

    return-void
.end method

.method public static a(LP43;LY94;LY94;)Lx53;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lmj0;",
            ">;)",
            "Lx53;"
        }
    .end annotation

    new-instance v0, Lx53;

    invoke-direct {v0, p0, p1, p2}, Lx53;-><init>(LP43;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LP43;Landroid/content/Context;Lmj0;)Lqj0;
    .locals 0

    invoke-virtual {p0, p1, p2}, LP43;->I(Landroid/content/Context;Lmj0;)Lqj0;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lqj0;

    return-object p0
.end method


# virtual methods
.method public b()Lqj0;
    .locals 3

    iget-object v0, p0, Lx53;->a:LP43;

    iget-object v1, p0, Lx53;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lx53;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmj0;

    invoke-static {v0, v1, v2}, Lx53;->c(LP43;Landroid/content/Context;Lmj0;)Lqj0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lx53;->b()Lqj0;

    move-result-object v0

    return-object v0
.end method
