.class public final LcR1$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LcR1;->W0(Lco/bird/android/model/wire/WireBird;[Lco/bird/android/model/wire/WirePart;)V
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
        "Lkotlin/Pair<",
        "+",
        "Ljava/util/List<",
        "+",
        "LH6;",
        ">;+",
        "Ljava/lang/Boolean;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0010\n\u001ar\u00122\u0008\u0001\u0012.\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003 \u0007*8\u00122\u0008\u0001\u0012.\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "",
        "e",
        "Lio/reactivex/K;",
        "Lkotlin/Pair;",
        "",
        "LH6;",
        "",
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


# instance fields
.field public final synthetic g:LcR1;


# direct methods
.method public constructor <init>(LcR1;)V
    .locals 0

    iput-object p1, p0, LcR1$j;->g:LcR1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

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
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "LH6;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LcR1$j;->g:LcR1;

    invoke-static {v0}, LcR1;->access$getOption(LcR1;)Lco/bird/android/model/IdToolOption;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/IdToolOption;->BRAIN:Lco/bird/android/model/IdToolOption;

    if-ne v0, v1, :cond_0

    iget-object p1, p0, LcR1$j;->g:LcR1;

    invoke-static {p1}, LcR1;->access$getUi(LcR1;)LGR1;

    move-result-object p1

    invoke-interface {p1}, LaM5;->errorGeneric()V

    invoke-static {}, Lio/reactivex/F;->M()Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LcR1$j;->g:LcR1;

    invoke-static {v0, p1}, LcR1;->access$onError(LcR1;Ljava/lang/Throwable;)Lio/reactivex/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LcR1$j;->invoke(Ljava/lang/Throwable;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
