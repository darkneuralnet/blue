.class public final LIT4$o0;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIT4;-><init>(Landroid/content/Context;LNP4;LXW2;Lef6;LKn6;LpJ;LpM3;LTq4;LUz1;LpU4;LEa;LTo0;LV74;LEg1;LRh6;)V
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
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/String;",
        "+",
        "Lco/bird/android/model/RideState$Status;",
        ">;>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\t\u001a<\u00128\u00126\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005 \u0006*\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005\u0018\u00010\u00010\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "LZ84;",
        "Lco/bird/android/buava/Optional;",
        "Lkotlin/Pair;",
        "",
        "Lco/bird/android/model/RideState$Status;",
        "Lco/bird/android/coreinterface/manager/RideActionRequest;",
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
.field public final synthetic g:LIT4;


# direct methods
.method public constructor <init>(LIT4;)V
    .locals 0

    iput-object p1, p0, LIT4$o0;->g:LIT4;

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
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Lco/bird/android/model/RideState$Status;",
            ">;>;>;"
        }
    .end annotation

    sget-object v0, LZ84;->d:LZ84$a;

    iget-object v1, p0, LIT4$o0;->g:LIT4;

    invoke-static {v1}, LIT4;->access$getMutableRideActionRequests$p(LIT4;)La94;

    move-result-object v1

    invoke-virtual {v0, v1}, LZ84$a;->b(Lio/reactivex/Observable;)LZ84;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LIT4$o0;->invoke()LZ84;

    move-result-object v0

    return-object v0
.end method