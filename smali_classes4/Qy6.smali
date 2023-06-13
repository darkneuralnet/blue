.class public final LQy6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LPy6;",
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
            "LKy6;",
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
            "LKy6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQy6;->a:LY94;

    iput-object p2, p0, LQy6;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LQy6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTk3;",
            ">;",
            "LY94<",
            "LKy6;",
            ">;)",
            "LQy6;"
        }
    .end annotation

    new-instance v0, LQy6;

    invoke-direct {v0, p0, p1}, LQy6;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(LTk3;LKy6;)LPy6;
    .locals 1

    new-instance v0, LPy6;

    invoke-direct {v0, p0, p1}, LPy6;-><init>(LTk3;LKy6;)V

    return-object v0
.end method


# virtual methods
.method public b()LPy6;
    .locals 2

    iget-object v0, p0, LQy6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTk3;

    iget-object v1, p0, LQy6;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LKy6;

    invoke-static {v0, v1}, LQy6;->c(LTk3;LKy6;)LPy6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LQy6;->b()LPy6;

    move-result-object v0

    return-object v0
.end method
