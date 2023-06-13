.class public final Lco/bird/android/foregroundservice/ForegroundService$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/foregroundservice/ForegroundService;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "Lqx1;",
        "+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\t\u001a\u00020\u000620\u0010\u0005\u001a,\u0012\t\u0012\u00070\u0001\u00a2\u0006\u0002\u0008\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0015\u0012\t\u0012\u00070\u0001\u00a2\u0006\u0002\u0008\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lqx1;",
        "Lkotlin/jvm/JvmSuppressWildcards;",
        "",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "invoke",
        "(Lkotlin/Pair;)V",
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
.field public final synthetic g:Lco/bird/android/foregroundservice/ForegroundService;


# direct methods
.method public constructor <init>(Lco/bird/android/foregroundservice/ForegroundService;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/foregroundservice/ForegroundService$d;->g:Lco/bird/android/foregroundservice/ForegroundService;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco/bird/android/foregroundservice/ForegroundService$d;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lqx1;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqx1;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    const-string v1, "shouldForeground"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lco/bird/android/foregroundservice/ForegroundService$d;->g:Lco/bird/android/foregroundservice/ForegroundService;

    invoke-static {p1}, Lco/bird/android/foregroundservice/ForegroundService;->access$getActivePlugins$p(Lco/bird/android/foregroundservice/ForegroundService;)Lio/reactivex/subjects/a;

    move-result-object p1

    invoke-static {p1, v0}, Lex1;->access$addPlugin(Lio/reactivex/subjects/a;Lqx1;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lco/bird/android/foregroundservice/ForegroundService$d;->g:Lco/bird/android/foregroundservice/ForegroundService;

    invoke-static {p1}, Lco/bird/android/foregroundservice/ForegroundService;->access$getActivePlugins$p(Lco/bird/android/foregroundservice/ForegroundService;)Lio/reactivex/subjects/a;

    move-result-object p1

    invoke-static {p1, v0}, Lex1;->access$removePlugin(Lio/reactivex/subjects/a;Lqx1;)V

    :goto_0
    return-void
.end method
