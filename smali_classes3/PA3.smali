.class public final LPA3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LOA3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LkI;",
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
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LkI;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPA3;->a:LY94;

    iput-object p2, p0, LPA3;->b:LY94;

    iput-object p3, p0, LPA3;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LPA3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LkI;",
            ">;)",
            "LPA3;"
        }
    .end annotation

    new-instance v0, LPA3;

    invoke-direct {v0, p0, p1, p2}, LPA3;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;LTq4;LkI;)LOA3;
    .locals 1

    new-instance v0, LOA3;

    invoke-direct {v0, p0, p1, p2}, LOA3;-><init>(Landroid/content/Context;LTq4;LkI;)V

    return-object v0
.end method


# virtual methods
.method public b()LOA3;
    .locals 3

    iget-object v0, p0, LPA3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, LPA3;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LTq4;

    iget-object v2, p0, LPA3;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LkI;

    invoke-static {v0, v1, v2}, LPA3;->c(Landroid/content/Context;LTq4;LkI;)LOA3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LPA3;->b()LOA3;

    move-result-object v0

    return-object v0
.end method
