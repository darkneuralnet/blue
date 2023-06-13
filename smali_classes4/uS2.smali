.class public final LuS2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LtS2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LRh6;",
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
            "LBQ2;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LeT2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LRh6;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LBQ2;",
            ">;",
            "LY94<",
            "LeT2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LuS2;->a:LY94;

    iput-object p2, p0, LuS2;->b:LY94;

    iput-object p3, p0, LuS2;->c:LY94;

    iput-object p4, p0, LuS2;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)LuS2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LRh6;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LBQ2;",
            ">;",
            "LY94<",
            "LeT2;",
            ">;)",
            "LuS2;"
        }
    .end annotation

    new-instance v0, LuS2;

    invoke-direct {v0, p0, p1, p2, p3}, LuS2;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LRh6;LTq4;LBQ2;LeT2;)LtS2;
    .locals 1

    new-instance v0, LtS2;

    invoke-direct {v0, p0, p1, p2, p3}, LtS2;-><init>(LRh6;LTq4;LBQ2;LeT2;)V

    return-object v0
.end method


# virtual methods
.method public b()LtS2;
    .locals 4

    iget-object v0, p0, LuS2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LRh6;

    iget-object v1, p0, LuS2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LTq4;

    iget-object v2, p0, LuS2;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBQ2;

    iget-object v3, p0, LuS2;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LeT2;

    invoke-static {v0, v1, v2, v3}, LuS2;->c(LRh6;LTq4;LBQ2;LeT2;)LtS2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LuS2;->b()LtS2;

    move-result-object v0

    return-object v0
.end method
