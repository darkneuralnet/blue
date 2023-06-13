.class public final LJg3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LCx4;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LCx4;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJg3;->a:LY94;

    iput-object p2, p0, LJg3;->b:LY94;

    iput-object p3, p0, LJg3;->c:LY94;

    iput-object p4, p0, LJg3;->d:LY94;

    iput-object p5, p0, LJg3;->e:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;)LJg3;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LCx4;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)",
            "LJg3;"
        }
    .end annotation

    new-instance v6, LJg3;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LJg3;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static c(Lgl;LEa;LCx4;LTq4;Le13;Lcom/uber/autodispose/ScopeProvider;LKg3;)LGg3;
    .locals 9

    new-instance v8, LGg3;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LGg3;-><init>(Lgl;LEa;LCx4;LTq4;Le13;Lcom/uber/autodispose/ScopeProvider;LKg3;)V

    return-object v8
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/ScopeProvider;LKg3;)LGg3;
    .locals 8

    iget-object v0, p0, LJg3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lgl;

    iget-object v0, p0, LJg3;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LEa;

    iget-object v0, p0, LJg3;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LCx4;

    iget-object v0, p0, LJg3;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LTq4;

    iget-object v0, p0, LJg3;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Le13;

    move-object v6, p1

    move-object v7, p2

    invoke-static/range {v1 .. v7}, LJg3;->c(Lgl;LEa;LCx4;LTq4;Le13;Lcom/uber/autodispose/ScopeProvider;LKg3;)LGg3;

    move-result-object p1

    return-object p1
.end method
