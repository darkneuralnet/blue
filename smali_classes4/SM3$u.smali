.class public final LSM3$u;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSM3;-><init>(Landroid/content/Context;LRh6;LuS5;LLL3;Lw10;LEa;LfL;Lgl;LTq4;Llh6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LZ84<",
        "Lco/bird/android/buava/Optional<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/BirdPayment;",
        ">;>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0007\u001a(\u0012$\u0012\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00010\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LZ84;",
        "Lco/bird/android/buava/Optional;",
        "",
        "Lco/bird/android/model/BirdPayment;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "()LZ84;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LSM3;


# direct methods
.method public constructor <init>(LSM3;)V
    .locals 0

    iput-object p1, p0, LSM3$u;->g:LSM3;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()LZ84;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/util/List<",
            "Lco/bird/android/model/BirdPayment;",
            ">;>;>;"
        }
    .end annotation

    sget-object v0, LZ84;->d:LZ84$a;

    iget-object v1, p0, LSM3$u;->g:LSM3;

    invoke-static {v1}, LSM3;->access$getMutableStripePaymentMethods$p(LSM3;)La94;

    move-result-object v1

    invoke-virtual {v0, v1}, LZ84$a;->b(Lio/reactivex/Observable;)LZ84;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LSM3$u;->invoke()LZ84;

    move-result-object v0

    return-object v0
.end method