.class public final LTs1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LSs1;",
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
            "LBs1;",
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
            "LBs1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTs1;->a:LY94;

    iput-object p2, p0, LTs1;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LTs1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTk3;",
            ">;",
            "LY94<",
            "LBs1;",
            ">;)",
            "LTs1;"
        }
    .end annotation

    new-instance v0, LTs1;

    invoke-direct {v0, p0, p1}, LTs1;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(LTk3;LBs1;)LSs1;
    .locals 1

    new-instance v0, LSs1;

    invoke-direct {v0, p0, p1}, LSs1;-><init>(LTk3;LBs1;)V

    return-object v0
.end method


# virtual methods
.method public b()LSs1;
    .locals 2

    iget-object v0, p0, LTs1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTk3;

    iget-object v1, p0, LTs1;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBs1;

    invoke-static {v0, v1}, LTs1;->c(LTk3;LBs1;)LSs1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LTs1;->b()LSs1;

    move-result-object v0

    return-object v0
.end method
