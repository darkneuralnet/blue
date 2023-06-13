.class public final Lxa2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lwa2;",
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
            "La4;",
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
            "La4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxa2;->a:LY94;

    iput-object p2, p0, Lxa2;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)Lxa2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "La4;",
            ">;)",
            "Lxa2;"
        }
    .end annotation

    new-instance v0, Lxa2;

    invoke-direct {v0, p0, p1}, Lxa2;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lco/bird/android/core/mvp/BaseActivity;La4;)Lwa2;
    .locals 1

    new-instance v0, Lwa2;

    invoke-direct {v0, p0, p1}, Lwa2;-><init>(Lco/bird/android/core/mvp/BaseActivity;La4;)V

    return-object v0
.end method


# virtual methods
.method public b()Lwa2;
    .locals 2

    iget-object v0, p0, Lxa2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/core/mvp/BaseActivity;

    iget-object v1, p0, Lxa2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La4;

    invoke-static {v0, v1}, Lxa2;->c(Lco/bird/android/core/mvp/BaseActivity;La4;)Lwa2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxa2;->b()Lwa2;

    move-result-object v0

    return-object v0
.end method
