.class public final LGS3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LgT3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LFS3;

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
.method public constructor <init>(LFS3;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LFS3;",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGS3;->a:LFS3;

    iput-object p2, p0, LGS3;->b:LY94;

    return-void
.end method

.method public static a(LFS3;LY94;)LGS3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LFS3;",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;)",
            "LGS3;"
        }
    .end annotation

    new-instance v0, LGS3;

    invoke-direct {v0, p0, p1}, LGS3;-><init>(LFS3;LY94;)V

    return-object v0
.end method

.method public static c(LFS3;Lco/bird/android/core/mvp/BaseActivity;)LgT3;
    .locals 0

    invoke-virtual {p0, p1}, LFS3;->a(Lco/bird/android/core/mvp/BaseActivity;)LgT3;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LgT3;

    return-object p0
.end method


# virtual methods
.method public b()LgT3;
    .locals 2

    iget-object v0, p0, LGS3;->a:LFS3;

    iget-object v1, p0, LGS3;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/core/mvp/BaseActivity;

    invoke-static {v0, v1}, LGS3;->c(LFS3;Lco/bird/android/core/mvp/BaseActivity;)LgT3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LGS3;->b()LgT3;

    move-result-object v0

    return-object v0
.end method
