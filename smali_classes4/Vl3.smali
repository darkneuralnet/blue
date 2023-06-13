.class public final LVl3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LUl3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lbn;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
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
            "LEa;",
            ">;",
            "LY94<",
            "Lbn;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVl3;->a:LY94;

    iput-object p2, p0, LVl3;->b:LY94;

    iput-object p3, p0, LVl3;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LVl3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Lbn;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)",
            "LVl3;"
        }
    .end annotation

    new-instance v0, LVl3;

    invoke-direct {v0, p0, p1, p2}, LVl3;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LEa;Lbn;LTq4;)LUl3;
    .locals 1

    new-instance v0, LUl3;

    invoke-direct {v0, p0, p1, p2}, LUl3;-><init>(LEa;Lbn;LTq4;)V

    return-object v0
.end method


# virtual methods
.method public b()LUl3;
    .locals 3

    iget-object v0, p0, LVl3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    iget-object v1, p0, LVl3;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbn;

    iget-object v2, p0, LVl3;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LTq4;

    invoke-static {v0, v1, v2}, LVl3;->c(LEa;Lbn;LTq4;)LUl3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LVl3;->b()LUl3;

    move-result-object v0

    return-object v0
.end method
