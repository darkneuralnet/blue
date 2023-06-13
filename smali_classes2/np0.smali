.class public final Lnp0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lmp0;",
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
            "LKZ;",
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
            "LKZ;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnp0;->a:LY94;

    iput-object p2, p0, Lnp0;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)Lnp0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "LKZ;",
            ">;)",
            "Lnp0;"
        }
    .end annotation

    new-instance v0, Lnp0;

    invoke-direct {v0, p0, p1}, Lnp0;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lco/bird/android/core/mvp/BaseActivity;LKZ;)Lmp0;
    .locals 1

    new-instance v0, Lmp0;

    invoke-direct {v0, p0, p1}, Lmp0;-><init>(Lco/bird/android/core/mvp/BaseActivity;LKZ;)V

    return-object v0
.end method


# virtual methods
.method public b()Lmp0;
    .locals 2

    iget-object v0, p0, Lnp0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/core/mvp/BaseActivity;

    iget-object v1, p0, Lnp0;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LKZ;

    invoke-static {v0, v1}, Lnp0;->c(Lco/bird/android/core/mvp/BaseActivity;LKZ;)Lmp0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnp0;->b()Lmp0;

    move-result-object v0

    return-object v0
.end method
