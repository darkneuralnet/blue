.class public final LR84;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LP84;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LT4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lp84;",
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
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "LT4;",
            ">;",
            "LY94<",
            "Lp84;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR84;->a:LY94;

    iput-object p2, p0, LR84;->b:LY94;

    iput-object p3, p0, LR84;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LR84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "LT4;",
            ">;",
            "LY94<",
            "Lp84;",
            ">;)",
            "LR84;"
        }
    .end annotation

    new-instance v0, LR84;

    invoke-direct {v0, p0, p1, p2}, LR84;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lco/bird/android/core/mvp/BaseActivity;LT4;Lp84;)LP84;
    .locals 1

    new-instance v0, LP84;

    invoke-direct {v0, p0, p1, p2}, LP84;-><init>(Lco/bird/android/core/mvp/BaseActivity;LT4;Lp84;)V

    return-object v0
.end method


# virtual methods
.method public b()LP84;
    .locals 3

    iget-object v0, p0, LR84;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/core/mvp/BaseActivity;

    iget-object v1, p0, LR84;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT4;

    iget-object v2, p0, LR84;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp84;

    invoke-static {v0, v1, v2}, LR84;->c(Lco/bird/android/core/mvp/BaseActivity;LT4;Lp84;)LP84;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LR84;->b()LP84;

    move-result-object v0

    return-object v0
.end method
