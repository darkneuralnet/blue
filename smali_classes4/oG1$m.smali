.class public final LoG1$m;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LoG1;->e0(Lco/bird/api/request/HardCountCreateRequest;LHM4;)Lio/reactivex/c;
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
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/persistence/HardCountScan;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "<anonymous parameter 0>",
        "Lio/reactivex/u;",
        "Lco/bird/android/model/persistence/HardCountScan;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/lang/Throwable;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:LoG1;


# direct methods
.method public constructor <init>(Ljava/lang/String;LoG1;)V
    .locals 0

    iput-object p1, p0, LoG1$m;->g:Ljava/lang/String;

    iput-object p2, p0, LoG1$m;->h:LoG1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lio/reactivex/u;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/persistence/HardCountScan;",
            ">;"
        }
    .end annotation

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LoG1$m;->g:Ljava/lang/String;

    if-eqz p1, :cond_0

    iget-object p1, p0, LoG1$m;->h:LoG1;

    invoke-static {p1}, LoG1;->access$getHardCountScanDao$p(LoG1;)LlH1;

    move-result-object p1

    iget-object v0, p0, LoG1$m;->h:LoG1;

    invoke-virtual {v0}, LoG1;->Q()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LoG1$m;->g:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, LlH1;->d(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Landroidx/room/EmptyResultSetException;

    const-string v0, "No result returned for empty Bird code."

    invoke-direct {p1, v0}, Landroidx/room/EmptyResultSetException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/p;->v(Ljava/lang/Throwable;)Lio/reactivex/p;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LoG1$m;->a(Ljava/lang/Throwable;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
