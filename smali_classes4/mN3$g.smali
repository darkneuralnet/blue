.class public final LmN3$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LmN3;->Z()Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lio/reactivex/F<",
        "Lco/bird/api/response/ReloadConfigResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u0010\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lio/reactivex/F;",
        "Lco/bird/api/response/ReloadConfigResponse;",
        "kotlin.jvm.PlatformType",
        "b",
        "()Lio/reactivex/F;"
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

    iput-object p1, p0, LmN3$g;->g:LmN3;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/api/response/ReloadConfigResponse;
    .locals 0

    invoke-static {p0, p1}, LmN3$g;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/api/response/ReloadConfigResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/api/response/ReloadConfigResponse;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/api/response/ReloadConfigResponse;

    return-object p0
.end method


# virtual methods
.method public final b()Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/ReloadConfigResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LmN3$g;->g:LmN3;

    invoke-static {v0}, LmN3;->access$getPaymentClient$p(LmN3;)LML3;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LML3$a;->getReloadOptions$default(LML3;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    const-wide/16 v1, 0x3

    invoke-virtual {v0, v1, v2}, Lio/reactivex/F;->T(J)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LmN3$g$a;

    iget-object v2, p0, LmN3$g;->g:LmN3;

    invoke-direct {v1, v2}, LmN3$g$a;-><init>(LmN3;)V

    new-instance v2, LnN3;

    invoke-direct {v2, v1}, LnN3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LmN3$g;->b()Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method
