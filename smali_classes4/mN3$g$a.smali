.class public final LmN3$g$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LmN3$g;->b()Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/ReloadConfigResponse;",
        "Lco/bird/api/response/ReloadConfigResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lco/bird/api/response/ReloadConfigResponse;",
        "updatedReloadConfig",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/ReloadConfigResponse;)Lco/bird/api/response/ReloadConfigResponse;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LmN3;


# direct methods
.method public constructor <init>(LmN3;)V
    .locals 0

    iput-object p1, p0, LmN3$g$a;->g:LmN3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/ReloadConfigResponse;)Lco/bird/api/response/ReloadConfigResponse;
    .locals 2

    const-string v0, "updatedReloadConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LmN3$g$a;->g:LmN3;

    invoke-static {v0}, LmN3;->access$getMutablePreloadConfig$p(LmN3;)La94;

    move-result-object v0

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v1, p1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v1

    invoke-virtual {v0, v1}, La94;->accept(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/ReloadConfigResponse;

    invoke-virtual {p0, p1}, LmN3$g$a;->a(Lco/bird/api/response/ReloadConfigResponse;)Lco/bird/api/response/ReloadConfigResponse;

    move-result-object p1

    return-object p1
.end method
