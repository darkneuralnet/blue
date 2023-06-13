.class public final LnO4$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LnO4;->b0(Lio/reactivex/F;LUD3$c;LZt4;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LcO4<",
        "TValue;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00028\u0001 \u0003*\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Key",
        "Value",
        "LcO4;",
        "kotlin.jvm.PlatformType",
        "result",
        "",
        "a",
        "(LcO4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LZt4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZt4<",
            "Lco/bird/android/model/ContiguousDataState;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:LUD3$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LUD3$c<",
            "TValue;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZt4;LUD3$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZt4<",
            "Lco/bird/android/model/ContiguousDataState;",
            ">;",
            "LUD3$c<",
            "TValue;>;)V"
        }
    .end annotation

    iput-object p1, p0, LnO4$k;->g:LZt4;

    iput-object p2, p0, LnO4$k;->h:LUD3$c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LcO4;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LcO4<",
            "TValue;>;)V"
        }
    .end annotation

    instance-of v0, p1, LcO4$a;

    if-eqz v0, :cond_1

    check-cast p1, LcO4$a;

    invoke-virtual {p1}, LcO4$a;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LnO4$k;->g:LZt4;

    sget-object v1, Lco/bird/android/model/ContiguousDataState$Done;->INSTANCE:Lco/bird/android/model/ContiguousDataState$Done;

    invoke-virtual {v0, v1}, LZt4;->accept(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, LnO4$k;->h:LUD3$c;

    invoke-virtual {p1}, LcO4$a;->b()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, LUD3$c;->a(Ljava/util/List;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, LcO4$b;

    if-eqz v0, :cond_2

    iget-object v0, p0, LnO4$k;->g:LZt4;

    new-instance v1, Lco/bird/android/model/ContiguousDataState$Error;

    check-cast p1, LcO4$b;

    invoke-virtual {p1}, LcO4$b;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lco/bird/android/model/ContiguousDataState$Error;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LZt4;->accept(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LcO4;

    invoke-virtual {p0, p1}, LnO4$k;->a(LcO4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
