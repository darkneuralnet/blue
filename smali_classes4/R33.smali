.class public final LR33;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LQ33;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTk3;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LJ33;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTk3;",
            ">;",
            "LY94<",
            "LJ33;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR33;->a:LY94;

    iput-object p2, p0, LR33;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LR33;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTk3;",
            ">;",
            "LY94<",
            "LJ33;",
            ">;)",
            "LR33;"
        }
    .end annotation

    new-instance v0, LR33;

    invoke-direct {v0, p0, p1}, LR33;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(LTk3;LJ33;)LQ33;
    .locals 1

    new-instance v0, LQ33;

    invoke-direct {v0, p0, p1}, LQ33;-><init>(LTk3;LJ33;)V

    return-object v0
.end method


# virtual methods
.method public b()LQ33;
    .locals 2

    iget-object v0, p0, LR33;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTk3;

    iget-object v1, p0, LR33;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJ33;

    invoke-static {v0, v1}, LR33;->c(LTk3;LJ33;)LQ33;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LR33;->b()LQ33;

    move-result-object v0

    return-object v0
.end method
