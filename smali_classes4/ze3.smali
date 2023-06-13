.class public final Lze3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lye3;",
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
            "LO01;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lpe3;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ldr4;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LV74;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LRh6;",
            ">;",
            "LY94<",
            "LO01;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Lpe3;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LV74;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lze3;->a:LY94;

    iput-object p2, p0, Lze3;->b:LY94;

    iput-object p3, p0, Lze3;->c:LY94;

    iput-object p4, p0, Lze3;->d:LY94;

    iput-object p5, p0, Lze3;->e:LY94;

    iput-object p6, p0, Lze3;->f:LY94;

    iput-object p7, p0, Lze3;->g:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lze3;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LRh6;",
            ">;",
            "LY94<",
            "LO01;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Lpe3;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LV74;",
            ">;)",
            "Lze3;"
        }
    .end annotation

    new-instance v8, Lze3;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lze3;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v8
.end method

.method public static c(LRh6;LO01;LEa;Lpe3;Ldr4;LTq4;LV74;)Lye3;
    .locals 9

    new-instance v8, Lye3;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lye3;-><init>(LRh6;LO01;LEa;Lpe3;Ldr4;LTq4;LV74;)V

    return-object v8
.end method


# virtual methods
.method public b()Lye3;
    .locals 8

    iget-object v0, p0, Lze3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LRh6;

    iget-object v0, p0, Lze3;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LO01;

    iget-object v0, p0, Lze3;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LEa;

    iget-object v0, p0, Lze3;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lpe3;

    iget-object v0, p0, Lze3;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ldr4;

    iget-object v0, p0, Lze3;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LTq4;

    iget-object v0, p0, Lze3;->g:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LV74;

    invoke-static/range {v1 .. v7}, Lze3;->c(LRh6;LO01;LEa;Lpe3;Ldr4;LTq4;LV74;)Lye3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lze3;->b()Lye3;

    move-result-object v0

    return-object v0
.end method
