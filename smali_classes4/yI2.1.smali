.class public final LyI2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LhW0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LVH2;

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
            "LKm1;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LVH2;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LKm1;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LyI2;->a:LVH2;

    iput-object p2, p0, LyI2;->b:LY94;

    iput-object p3, p0, LyI2;->c:LY94;

    iput-object p4, p0, LyI2;->d:LY94;

    return-void
.end method

.method public static a(LVH2;LY94;LY94;LY94;)LyI2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LKm1;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)",
            "LyI2;"
        }
    .end annotation

    new-instance v0, LyI2;

    invoke-direct {v0, p0, p1, p2, p3}, LyI2;-><init>(LVH2;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LVH2;Landroid/content/Context;LKm1;LEa;)LhW0;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LVH2;->D(Landroid/content/Context;LKm1;LEa;)LhW0;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LhW0;

    return-object p0
.end method


# virtual methods
.method public b()LhW0;
    .locals 4

    iget-object v0, p0, LyI2;->a:LVH2;

    iget-object v1, p0, LyI2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, LyI2;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LKm1;

    iget-object v3, p0, LyI2;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LEa;

    invoke-static {v0, v1, v2, v3}, LyI2;->c(LVH2;Landroid/content/Context;LKm1;LEa;)LhW0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LyI2;->b()LhW0;

    move-result-object v0

    return-object v0
.end method
