.class public final LNc4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LMc4;",
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
            "LY4;",
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
            "LY4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNc4;->a:LY94;

    iput-object p2, p0, LNc4;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LNc4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "LY4;",
            ">;)",
            "LNc4;"
        }
    .end annotation

    new-instance v0, LNc4;

    invoke-direct {v0, p0, p1}, LNc4;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lco/bird/android/core/mvp/BaseActivity;LY4;)LMc4;
    .locals 1

    new-instance v0, LMc4;

    invoke-direct {v0, p0, p1}, LMc4;-><init>(Lco/bird/android/core/mvp/BaseActivity;LY4;)V

    return-object v0
.end method


# virtual methods
.method public b()LMc4;
    .locals 2

    iget-object v0, p0, LNc4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/core/mvp/BaseActivity;

    iget-object v1, p0, LNc4;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY4;

    invoke-static {v0, v1}, LNc4;->c(Lco/bird/android/core/mvp/BaseActivity;LY4;)LMc4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LNc4;->b()LMc4;

    move-result-object v0

    return-object v0
.end method
