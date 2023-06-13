.class public final LXC4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LWC4;",
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
            "Li5;",
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
            "Li5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXC4;->a:LY94;

    iput-object p2, p0, LXC4;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LXC4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "Li5;",
            ">;)",
            "LXC4;"
        }
    .end annotation

    new-instance v0, LXC4;

    invoke-direct {v0, p0, p1}, LXC4;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lco/bird/android/core/mvp/BaseActivity;Li5;)LWC4;
    .locals 1

    new-instance v0, LWC4;

    invoke-direct {v0, p0, p1}, LWC4;-><init>(Lco/bird/android/core/mvp/BaseActivity;Li5;)V

    return-object v0
.end method


# virtual methods
.method public b()LWC4;
    .locals 2

    iget-object v0, p0, LXC4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/core/mvp/BaseActivity;

    iget-object v1, p0, LXC4;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li5;

    invoke-static {v0, v1}, LXC4;->c(Lco/bird/android/core/mvp/BaseActivity;Li5;)LWC4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LXC4;->b()LWC4;

    move-result-object v0

    return-object v0
.end method
