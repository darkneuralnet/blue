.class public final LJF3$u;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJF3;-><init>(LTq4;Landroid/content/Context;Lgl;Ldr4;Lbn;LEa;LYR4;LTL;Ltm;LXc1;Llw0;Lys0;LpU4;LaM;LMc2;LoI5;)V
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
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "+",
        "LFH3;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0007\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LZ84;",
        "",
        "",
        "LFH3;",
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
.field public final synthetic g:LJF3;


# direct methods
.method public constructor <init>(LJF3;)V
    .locals 0

    iput-object p1, p0, LJF3$u;->g:LJF3;

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
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LFH3;",
            ">;>;"
        }
    .end annotation

    sget-object v0, LZ84;->d:LZ84$a;

    iget-object v1, p0, LJF3$u;->g:LJF3;

    invoke-static {v1}, LJF3;->access$getMutableParkingStatusByRideId$p(LJF3;)La94;

    move-result-object v1

    invoke-virtual {v0, v1}, LZ84$a;->b(Lio/reactivex/Observable;)LZ84;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJF3$u;->invoke()LZ84;

    move-result-object v0

    return-object v0
.end method
