.class public final LSS$q$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSS$q;->b(LHM4;)Lio/reactivex/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSS$q$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/DialogResponse;",
        "Lio/reactivex/B<",
        "+",
        "LHM4<",
        "Lco/bird/android/model/BirdScan;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lco/bird/android/model/DialogResponse;",
        "dialogResponse",
        "Lio/reactivex/B;",
        "LHM4;",
        "Lco/bird/android/model/BirdScan;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LHM4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LHM4<",
            "Lco/bird/android/model/BirdScan;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:LSS;


# direct methods
.method public constructor <init>(LHM4;LSS;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/android/model/BirdScan;",
            ">;",
            "LSS;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LSS$q$a;->g:LHM4;

    iput-object p2, p0, LSS$q$a;->h:LSS;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/DialogResponse;)Lio/reactivex/B;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/DialogResponse;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "LHM4<",
            "Lco/bird/android/model/BirdScan;",
            ">;>;"
        }
    .end annotation

    const-string v0, "dialogResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSS$q$a$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LSS$q$a;->g:LHM4;

    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LSS$q$a;->h:LSS;

    invoke-static {p1}, LSS;->access$getNavigator$p(LSS;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->e3()V

    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/DialogResponse;

    invoke-virtual {p0, p1}, LSS$q$a;->a(Lco/bird/android/model/DialogResponse;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
