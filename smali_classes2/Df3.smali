.class public final LDf3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ldr4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Ldr4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDf3;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LDf3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Ldr4;",
            ">;)",
            "LDf3;"
        }
    .end annotation

    new-instance v0, LDf3;

    invoke-direct {v0, p0}, LDf3;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Lco/bird/android/core/mvp/BaseActivity;LZf3;Ldr4;)LAf3;
    .locals 1

    new-instance v0, LAf3;

    invoke-direct {v0, p0, p1, p2}, LAf3;-><init>(Lco/bird/android/core/mvp/BaseActivity;LZf3;Ldr4;)V

    return-object v0
.end method


# virtual methods
.method public b(Lco/bird/android/core/mvp/BaseActivity;LZf3;)LAf3;
    .locals 1

    iget-object v0, p0, LDf3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldr4;

    invoke-static {p1, p2, v0}, LDf3;->c(Lco/bird/android/core/mvp/BaseActivity;LZf3;Ldr4;)LAf3;

    move-result-object p1

    return-object p1
.end method
