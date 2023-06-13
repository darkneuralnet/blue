.class public final LlX5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LkX5;",
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
            "LZ4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LIW5;",
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
            "LZ4;",
            ">;",
            "LY94<",
            "LIW5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LlX5;->a:LY94;

    iput-object p2, p0, LlX5;->b:LY94;

    iput-object p3, p0, LlX5;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LlX5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "LZ4;",
            ">;",
            "LY94<",
            "LIW5;",
            ">;)",
            "LlX5;"
        }
    .end annotation

    new-instance v0, LlX5;

    invoke-direct {v0, p0, p1, p2}, LlX5;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lco/bird/android/core/mvp/BaseActivity;LZ4;LIW5;)LkX5;
    .locals 1

    new-instance v0, LkX5;

    invoke-direct {v0, p0, p1, p2}, LkX5;-><init>(Lco/bird/android/core/mvp/BaseActivity;LZ4;LIW5;)V

    return-object v0
.end method


# virtual methods
.method public b()LkX5;
    .locals 3

    iget-object v0, p0, LlX5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/core/mvp/BaseActivity;

    iget-object v1, p0, LlX5;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZ4;

    iget-object v2, p0, LlX5;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LIW5;

    invoke-static {v0, v1, v2}, LlX5;->c(Lco/bird/android/core/mvp/BaseActivity;LZ4;LIW5;)LkX5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LlX5;->b()LkX5;

    move-result-object v0

    return-object v0
.end method
