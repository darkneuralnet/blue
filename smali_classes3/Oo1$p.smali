.class public final LOo1$p;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOo1;->s(Ljava/lang/String;Ljava/lang/String;)V
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
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "e",
        "",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFleetListPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetListPresenter.kt\nco/bird/android/feature/fleetstatus/state/list/FleetListPresenter$onResume$9\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LOo1;


# direct methods
.method public constructor <init>(LOo1;)V
    .locals 0

    iput-object p1, p0, LOo1$p;->g:LOo1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LOo1$p;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 3

    invoke-static {p1}, Lg46;->e(Ljava/lang/Throwable;)V

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LR36;->c(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    instance-of v1, v0, Lco/bird/api/error/RetrofitException;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lco/bird/api/error/RetrofitException;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    const-class v1, Ltg1;

    invoke-virtual {v0, v1}, Lco/bird/api/error/RetrofitException;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltg1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ltg1;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object p1, p0, LOo1$p;->g:LOo1;

    invoke-static {p1}, LOo1;->access$getUi$p(LOo1;)Lcp1;

    move-result-object p1

    invoke-virtual {p1, v0}, LXC;->error(Ljava/lang/String;)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_2

    :cond_1
    instance-of v0, p1, Lco/bird/api/exception/HttpException;

    if-eqz v0, :cond_2

    check-cast p1, Lco/bird/api/exception/HttpException;

    goto :goto_1

    :cond_2
    move-object p1, v2

    :goto_1
    if-eqz p1, :cond_3

    iget-object v0, p0, LOo1$p;->g:LOo1;

    invoke-static {v0}, LOo1;->access$getUi$p(LOo1;)Lcp1;

    move-result-object v0

    invoke-virtual {v0, p1}, LXC;->error(Ljava/lang/Throwable;)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_3
    :goto_2
    if-nez v2, :cond_4

    iget-object p1, p0, LOo1$p;->g:LOo1;

    invoke-static {p1}, LOo1;->access$getUi$p(LOo1;)Lcp1;

    move-result-object p1

    invoke-virtual {p1}, LXC;->errorGeneric()V

    :cond_4
    return-void
.end method
