.class public final Lib6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lco/bird/android/config/tweaks/dsl/Tweaks;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LOh;",
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
            "LOh;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lib6;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Lib6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LOh;",
            ">;)",
            "Lib6;"
        }
    .end annotation

    new-instance v0, Lib6;

    invoke-direct {v0, p0}, Lib6;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LOh;)Lco/bird/android/config/tweaks/dsl/Tweaks;
    .locals 0

    invoke-static {p0}, Lgb6;->a(LOh;)Lco/bird/android/config/tweaks/dsl/Tweaks;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/config/tweaks/dsl/Tweaks;

    return-object p0
.end method


# virtual methods
.method public b()Lco/bird/android/config/tweaks/dsl/Tweaks;
    .locals 1

    iget-object v0, p0, Lib6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LOh;

    invoke-static {v0}, Lib6;->c(LOh;)Lco/bird/android/config/tweaks/dsl/Tweaks;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lib6;->b()Lco/bird/android/config/tweaks/dsl/Tweaks;

    move-result-object v0

    return-object v0
.end method
