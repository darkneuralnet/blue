.class public final LiJ6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LgJ6;",
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
            "LCI6;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LMI6;",
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
            "LTk3;",
            ">;",
            "LY94<",
            "LCI6;",
            ">;",
            "LY94<",
            "LMI6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LiJ6;->a:LY94;

    iput-object p2, p0, LiJ6;->b:LY94;

    iput-object p3, p0, LiJ6;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LiJ6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTk3;",
            ">;",
            "LY94<",
            "LCI6;",
            ">;",
            "LY94<",
            "LMI6;",
            ">;)",
            "LiJ6;"
        }
    .end annotation

    new-instance v0, LiJ6;

    invoke-direct {v0, p0, p1, p2}, LiJ6;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LTk3;LCI6;LMI6;)LgJ6;
    .locals 1

    new-instance v0, LgJ6;

    invoke-direct {v0, p0, p1, p2}, LgJ6;-><init>(LTk3;LCI6;LMI6;)V

    return-object v0
.end method


# virtual methods
.method public b()LgJ6;
    .locals 3

    iget-object v0, p0, LiJ6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTk3;

    iget-object v1, p0, LiJ6;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LCI6;

    iget-object v2, p0, LiJ6;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LMI6;

    invoke-static {v0, v1, v2}, LiJ6;->c(LTk3;LCI6;LMI6;)LgJ6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LiJ6;->b()LgJ6;

    move-result-object v0

    return-object v0
.end method
