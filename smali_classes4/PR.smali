.class public final LPR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LOR;",
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
            "LCR;",
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
            "LCR;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPR;->a:LY94;

    iput-object p2, p0, LPR;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LPR;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTk3;",
            ">;",
            "LY94<",
            "LCR;",
            ">;)",
            "LPR;"
        }
    .end annotation

    new-instance v0, LPR;

    invoke-direct {v0, p0, p1}, LPR;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(LTk3;LCR;)LOR;
    .locals 1

    new-instance v0, LOR;

    invoke-direct {v0, p0, p1}, LOR;-><init>(LTk3;LCR;)V

    return-object v0
.end method


# virtual methods
.method public b()LOR;
    .locals 2

    iget-object v0, p0, LPR;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTk3;

    iget-object v1, p0, LPR;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LCR;

    invoke-static {v0, v1}, LPR;->c(LTk3;LCR;)LOR;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LPR;->b()LOR;

    move-result-object v0

    return-object v0
.end method
