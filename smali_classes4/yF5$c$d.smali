.class public final LyF5$c$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LyF5$c;->o2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/api/response/NokelockResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "throwable",
        "Lio/reactivex/K;",
        "Lco/bird/api/response/NokelockResponse;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Throwable;)Lio/reactivex/K;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LyF5$c$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LyF5$c$d;

    invoke-direct {v0}, LyF5$c$d;-><init>()V

    sput-object v0, LyF5$c$d;->g:LyF5$c$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Throwable;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/api/response/NokelockResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lco/bird/api/error/RetrofitException;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/bird/api/error/RetrofitException;

    invoke-virtual {v0}, Lco/bird/api/error/RetrofitException;->c()LHM4;

    move-result-object v0

    invoke-virtual {v0}, LHM4;->b()I

    move-result v0

    const/16 v1, 0x190

    if-ne v0, v1, :cond_0

    new-instance p1, Lco/bird/api/response/NokelockResponse;

    sget-object v0, Lco/bird/android/model/constant/NokelockResponseType;->UNKNOWN:Lco/bird/android/model/constant/NokelockResponseType;

    sget-object v1, Lco/bird/android/model/wire/WireNokelockUnknownData;->INSTANCE:Lco/bird/android/model/wire/WireNokelockUnknownData;

    invoke-direct {p1, v0, v1}, Lco/bird/api/response/NokelockResponse;-><init>(Lco/bird/android/model/constant/NokelockResponseType;Lco/bird/android/model/wire/WireNokelockResponseData;)V

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lio/reactivex/F;->x(Ljava/lang/Throwable;)Lio/reactivex/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LyF5$c$d;->invoke(Ljava/lang/Throwable;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
