.class public final LXL;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LWL;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ldr4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYR4;",
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
            "LTq4;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXL;->a:LY94;

    iput-object p2, p0, LXL;->b:LY94;

    iput-object p3, p0, LXL;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LXL;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;)",
            "LXL;"
        }
    .end annotation

    new-instance v0, LXL;

    invoke-direct {v0, p0, p1, p2}, LXL;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LTq4;Ldr4;LYR4;)LWL;
    .locals 1

    new-instance v0, LWL;

    invoke-direct {v0, p0, p1, p2}, LWL;-><init>(LTq4;Ldr4;LYR4;)V

    return-object v0
.end method


# virtual methods
.method public b()LWL;
    .locals 3

    iget-object v0, p0, LXL;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    iget-object v1, p0, LXL;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldr4;

    iget-object v2, p0, LXL;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYR4;

    invoke-static {v0, v1, v2}, LXL;->c(LTq4;Ldr4;LYR4;)LWL;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LXL;->b()LWL;

    move-result-object v0

    return-object v0
.end method
