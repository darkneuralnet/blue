.class public final LSv3$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSv3;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lio/reactivex/Observable<",
        "Lco/bird/android/model/persistence/nestedstructures/OperatorTask;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a&\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/persistence/nestedstructures/OperatorTask;",
        "kotlin.jvm.PlatformType",
        "c",
        "()Lio/reactivex/Observable;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LSv3;


# direct methods
.method public constructor <init>(LSv3;)V
    .locals 0

    iput-object p1, p0, LSv3$g;->g:LSv3;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/OperatorTask;
    .locals 0

    invoke-static {p0, p1}, LSv3$g;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/OperatorTask;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LG6;
    .locals 0

    invoke-static {p0, p1}, LSv3$g;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LG6;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LG6;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LG6;

    return-object p0
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/OperatorTask;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/persistence/nestedstructures/OperatorTask;

    return-object p0
.end method


# virtual methods
.method public final c()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/nestedstructures/OperatorTask;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LSv3$g;->g:LSv3;

    invoke-static {v0}, LSv3;->access$getSwipeHelper(LSv3;)LmX5;

    move-result-object v0

    invoke-virtual {v0}, LmX5;->b()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, LSv3$g$a;

    iget-object v2, p0, LSv3$g;->g:LSv3;

    invoke-static {v2}, LSv3;->access$getAdapter$p(LSv3;)LMv3;

    move-result-object v2

    invoke-direct {v1, v2}, LSv3$g$a;-><init>(Ljava/lang/Object;)V

    new-instance v2, LUv3;

    invoke-direct {v2, v1}, LUv3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, LSv3$g$b;->g:LSv3$g$b;

    new-instance v2, LVv3;

    invoke-direct {v2, v1}, LVv3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LSv3$g;->c()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
