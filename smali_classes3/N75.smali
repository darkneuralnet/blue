.class public final LN75;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LM75;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTo2;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LJf;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lbg;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LR5;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEO4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTo2;",
            ">;",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "LJf;",
            ">;",
            "LY94<",
            "Lbg;",
            ">;",
            "LY94<",
            "LR5;",
            ">;",
            "LY94<",
            "LEO4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN75;->a:LY94;

    iput-object p2, p0, LN75;->b:LY94;

    iput-object p3, p0, LN75;->c:LY94;

    iput-object p4, p0, LN75;->d:LY94;

    iput-object p5, p0, LN75;->e:LY94;

    iput-object p6, p0, LN75;->f:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;)LN75;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTo2;",
            ">;",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "LJf;",
            ">;",
            "LY94<",
            "Lbg;",
            ">;",
            "LY94<",
            "LR5;",
            ">;",
            "LY94<",
            "LEO4;",
            ">;)",
            "LN75;"
        }
    .end annotation

    new-instance v7, LN75;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LN75;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static c(LTo2;Lco/bird/android/core/mvp/BaseActivity;LJf;Lbg;LR5;LEO4;)LM75;
    .locals 8

    new-instance v7, LM75;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LM75;-><init>(LTo2;Lco/bird/android/core/mvp/BaseActivity;LJf;Lbg;LR5;LEO4;)V

    return-object v7
.end method


# virtual methods
.method public b()LM75;
    .locals 7

    iget-object v0, p0, LN75;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LTo2;

    iget-object v0, p0, LN75;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lco/bird/android/core/mvp/BaseActivity;

    iget-object v0, p0, LN75;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LJf;

    iget-object v0, p0, LN75;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lbg;

    iget-object v0, p0, LN75;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LR5;

    iget-object v0, p0, LN75;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LEO4;

    invoke-static/range {v1 .. v6}, LN75;->c(LTo2;Lco/bird/android/core/mvp/BaseActivity;LJf;Lbg;LR5;LEO4;)LM75;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN75;->b()LM75;

    move-result-object v0

    return-object v0
.end method
