.class public final LvR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LuR;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LrP;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LlR;",
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
            "LrP;",
            ">;",
            "LY94<",
            "LlR;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LvR;->a:LY94;

    iput-object p2, p0, LvR;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LvR;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LrP;",
            ">;",
            "LY94<",
            "LlR;",
            ">;)",
            "LvR;"
        }
    .end annotation

    new-instance v0, LvR;

    invoke-direct {v0, p0, p1}, LvR;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(LrP;LlR;)LuR;
    .locals 1

    new-instance v0, LuR;

    invoke-direct {v0, p0, p1}, LuR;-><init>(LrP;LlR;)V

    return-object v0
.end method


# virtual methods
.method public b()LuR;
    .locals 2

    iget-object v0, p0, LvR;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LrP;

    iget-object v1, p0, LvR;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LlR;

    invoke-static {v0, v1}, LvR;->c(LrP;LlR;)LuR;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LvR;->b()LuR;

    move-result-object v0

    return-object v0
.end method
