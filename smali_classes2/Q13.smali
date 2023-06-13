.class public final LQ13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LP13;",
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
            "Ly31;",
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
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "Ly31;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ13;->a:LY94;

    iput-object p2, p0, LQ13;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LQ13;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "Ly31;",
            ">;)",
            "LQ13;"
        }
    .end annotation

    new-instance v0, LQ13;

    invoke-direct {v0, p0, p1}, LQ13;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lco/bird/android/core/mvp/BaseActivity;Ly31;)LP13;
    .locals 1

    new-instance v0, LP13;

    invoke-direct {v0, p0, p1}, LP13;-><init>(Lco/bird/android/core/mvp/BaseActivity;Ly31;)V

    return-object v0
.end method


# virtual methods
.method public b()LP13;
    .locals 2

    iget-object v0, p0, LQ13;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/core/mvp/BaseActivity;

    iget-object v1, p0, LQ13;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly31;

    invoke-static {v0, v1}, LQ13;->c(Lco/bird/android/core/mvp/BaseActivity;Ly31;)LP13;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LQ13;->b()LP13;

    move-result-object v0

    return-object v0
.end method
