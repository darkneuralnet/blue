.class public final LLV4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LKV4;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LBX1;",
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


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LBX1;",
            ">;",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLV4;->a:LY94;

    iput-object p2, p0, LLV4;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LLV4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LBX1;",
            ">;",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;)",
            "LLV4;"
        }
    .end annotation

    new-instance v0, LLV4;

    invoke-direct {v0, p0, p1}, LLV4;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(LBX1;Lco/bird/android/core/mvp/BaseActivity;)LKV4;
    .locals 1

    new-instance v0, LKV4;

    invoke-direct {v0, p0, p1}, LKV4;-><init>(LBX1;Lco/bird/android/core/mvp/BaseActivity;)V

    return-object v0
.end method


# virtual methods
.method public b()LKV4;
    .locals 2

    iget-object v0, p0, LLV4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBX1;

    iget-object v1, p0, LLV4;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/core/mvp/BaseActivity;

    invoke-static {v0, v1}, LLV4;->c(LBX1;Lco/bird/android/core/mvp/BaseActivity;)LKV4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LLV4;->b()LKV4;

    move-result-object v0

    return-object v0
.end method
