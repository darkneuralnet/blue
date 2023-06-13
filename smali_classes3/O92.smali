.class public final LO92;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LN92;",
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
            "LM92;",
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
            "LM92;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO92;->a:LY94;

    iput-object p2, p0, LO92;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LO92;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "LM92;",
            ">;)",
            "LO92;"
        }
    .end annotation

    new-instance v0, LO92;

    invoke-direct {v0, p0, p1}, LO92;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lco/bird/android/core/mvp/BaseActivity;LM92;)LN92;
    .locals 1

    new-instance v0, LN92;

    invoke-direct {v0, p0, p1}, LN92;-><init>(Lco/bird/android/core/mvp/BaseActivity;LM92;)V

    return-object v0
.end method


# virtual methods
.method public b()LN92;
    .locals 2

    iget-object v0, p0, LO92;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/core/mvp/BaseActivity;

    iget-object v1, p0, LO92;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LM92;

    invoke-static {v0, v1}, LO92;->c(Lco/bird/android/core/mvp/BaseActivity;LM92;)LN92;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LO92;->b()LN92;

    move-result-object v0

    return-object v0
.end method
