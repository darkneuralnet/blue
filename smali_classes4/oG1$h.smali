.class public final LoG1$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LoG1;->o(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHM4<",
        "Lco/bird/api/response/HardCountScanResponse;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "LHM4<",
        "Lco/bird/api/response/HardCountScanResponse;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LHM4;",
        "Lco/bird/api/response/HardCountScanResponse;",
        "response",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "b",
        "(LHM4;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LoG1;

.field public final synthetic h:Lco/bird/api/request/HardCountCreateRequest;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Z


# direct methods
.method public constructor <init>(LoG1;Lco/bird/api/request/HardCountCreateRequest;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, LoG1$h;->g:LoG1;

    iput-object p2, p0, LoG1$h;->h:Lco/bird/api/request/HardCountCreateRequest;

    iput-object p3, p0, LoG1$h;->i:Ljava/lang/String;

    iput-object p4, p0, LoG1$h;->j:Ljava/lang/String;

    iput-boolean p5, p0, LoG1$h;->k:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LoG1;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/HardCountCreateRequest;LHM4;Z)Lio/reactivex/h;
    .locals 0

    invoke-static/range {p0 .. p5}, LoG1$h;->c(LoG1;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/HardCountCreateRequest;LHM4;Z)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LoG1;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/HardCountCreateRequest;LHM4;Z)Lio/reactivex/h;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$scanIdentifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$request"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$response"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p0 .. p5}, LoG1;->access$updateAndCacheHardCountScan(LoG1;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/HardCountCreateRequest;LHM4;Z)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(LHM4;)Lio/reactivex/K;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/api/response/HardCountScanResponse;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "LHM4<",
            "Lco/bird/api/response/HardCountScanResponse;",
            ">;>;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LoG1$h;->g:LoG1;

    iget-object v1, p0, LoG1$h;->h:Lco/bird/api/request/HardCountCreateRequest;

    invoke-static {v0, v1, p1}, LoG1;->access$maybeIncrementLapScanCount(LoG1;Lco/bird/api/request/HardCountCreateRequest;LHM4;)Lio/reactivex/c;

    move-result-object v0

    iget-object v2, p0, LoG1$h;->g:LoG1;

    iget-object v3, p0, LoG1$h;->i:Ljava/lang/String;

    iget-object v4, p0, LoG1$h;->j:Ljava/lang/String;

    iget-object v5, p0, LoG1$h;->h:Lco/bird/api/request/HardCountCreateRequest;

    iget-boolean v7, p0, LoG1$h;->k:Z

    new-instance v8, LqG1;

    move-object v1, v8

    move-object v6, p1

    invoke-direct/range {v1 .. v7}, LqG1;-><init>(LoG1;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/HardCountCreateRequest;LHM4;Z)V

    invoke-static {v8}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object v0

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LoG1$h;->b(LHM4;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
