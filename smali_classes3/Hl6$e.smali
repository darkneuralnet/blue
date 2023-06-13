.class public final LHl6$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LHl6;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LRe4<",
        "+",
        "Lco/bird/android/model/wire/WireBird;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/MobilePartner;",
        ">;+",
        "Lco/bird/android/model/BirdSummaryBody;",
        "+",
        "Lco/bird/android/model/CommandCenterBody;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/CommandCenterNotice;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u000b\u001a\u00020\n2\u00cb\u0001\u0010\t\u001a\u00c6\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0008 \u0002*\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00070\u0007 \u0002*b\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0008 \u0002*\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00070\u0007\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000c"
    }
    d2 = {
        "LRe4;",
        "Lco/bird/android/model/wire/WireBird;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/MobilePartner;",
        "Lco/bird/android/model/BirdSummaryBody;",
        "Lco/bird/android/model/CommandCenterBody;",
        "",
        "Lco/bird/android/model/CommandCenterNotice;",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(LRe4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LHl6;


# direct methods
.method public constructor <init>(LHl6;)V
    .locals 0

    iput-object p1, p0, LHl6$e;->g:LHl6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LRe4;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRe4<",
            "Lco/bird/android/model/wire/WireBird;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/MobilePartner;",
            ">;",
            "Lco/bird/android/model/BirdSummaryBody;",
            "Lco/bird/android/model/CommandCenterBody;",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/CommandCenterNotice;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, LRe4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1}, LRe4;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, LRe4;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/BirdSummaryBody;

    invoke-virtual {p1}, LRe4;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/CommandCenterBody;

    invoke-virtual {p1}, LRe4;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v4, p0, LHl6$e;->g:LHl6;

    invoke-virtual {v4}, LHl6;->v1()Lio/reactivex/subjects/a;

    move-result-object v4

    invoke-virtual {v4, v0}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, LHl6$e;->g:LHl6;

    invoke-static {v0}, LHl6;->access$getPartnerSubject$p(LHl6;)Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, LHl6$e;->g:LHl6;

    invoke-static {v0}, LHl6;->access$getSummarySubject$p(LHl6;)Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, LHl6$e;->g:LHl6;

    invoke-static {v0}, LHl6;->access$getCommandCenterSubject$p(LHl6;)Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, LHl6$e;->g:LHl6;

    invoke-static {v0}, LHl6;->access$getNoticesSubject$p(LHl6;)Lio/reactivex/subjects/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LRe4;

    invoke-virtual {p0, p1}, LHl6$e;->a(LRe4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
