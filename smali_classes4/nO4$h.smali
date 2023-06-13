.class public final LnO4$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LnO4;->c0(Lio/reactivex/F;LUD3$e;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LbO4<",
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
        "LbO4;",
        "kotlin.jvm.PlatformType",
        "result",
        "",
        "a",
        "(LbO4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LnO4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LnO4<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field

.field public final synthetic h:LUD3$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LUD3$e<",
            "TValue;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LnO4;LUD3$e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LnO4<",
            "TKey;TValue;>;",
            "LUD3$e<",
            "TValue;>;)V"
        }
    .end annotation

    iput-object p1, p0, LnO4$h;->g:LnO4;

    iput-object p2, p0, LnO4$h;->h:LUD3$e;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LbO4;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LbO4<",
            "TValue;>;)V"
        }
    .end annotation

    instance-of v0, p1, LbO4$b;

    if-eqz v0, :cond_3

    iget-object v0, p0, LnO4$h;->g:LnO4;

    invoke-virtual {v0}, LnO4;->X()LAG;

    move-result-object v0

    check-cast p1, LbO4$b;

    invoke-virtual {p1}, LbO4$b;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lco/bird/android/model/ContiguousInitialDataState$Empty;->INSTANCE:Lco/bird/android/model/ContiguousInitialDataState$Empty;

    goto :goto_0

    :cond_0
    sget-object v1, Lco/bird/android/model/ContiguousInitialDataState$Content;->INSTANCE:Lco/bird/android/model/ContiguousInitialDataState$Content;

    :goto_0
    invoke-virtual {v0, v1}, LAG;->accept(Ljava/lang/Object;)V

    invoke-virtual {p1}, LbO4$b;->c()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, LnO4$h;->g:LnO4;

    invoke-virtual {v0}, LnO4;->W()LAG;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/ContiguousDataState$Loading;->INSTANCE:Lco/bird/android/model/ContiguousDataState$Loading;

    invoke-virtual {v0, v1}, LAG;->accept(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {p1}, LbO4$b;->d()I

    move-result v0

    invoke-virtual {p1}, LbO4$b;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1}, LbO4$b;->c()I

    move-result v2

    add-int/2addr v1, v2

    if-le v0, v1, :cond_2

    iget-object v0, p0, LnO4$h;->g:LnO4;

    invoke-virtual {v0}, LnO4;->V()LAG;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/ContiguousDataState$Loading;->INSTANCE:Lco/bird/android/model/ContiguousDataState$Loading;

    invoke-virtual {v0, v1}, LAG;->accept(Ljava/lang/Object;)V

    :cond_2
    iget-object v0, p0, LnO4$h;->h:LUD3$e;

    invoke-virtual {p1}, LbO4$b;->b()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, LbO4$b;->c()I

    move-result v2

    invoke-virtual {p1}, LbO4$b;->d()I

    move-result p1

    invoke-interface {v0, v1, v2, p1}, LUD3$e;->b(Ljava/util/List;II)V

    goto :goto_2

    :cond_3
    instance-of v0, p1, LbO4$a;

    if-eqz v0, :cond_6

    iget-object v0, p0, LnO4$h;->g:LnO4;

    invoke-virtual {v0}, LnO4;->X()LAG;

    move-result-object v0

    check-cast p1, LbO4$a;

    invoke-virtual {p1}, LbO4$a;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v1, Lco/bird/android/model/ContiguousInitialDataState$Empty;->INSTANCE:Lco/bird/android/model/ContiguousInitialDataState$Empty;

    goto :goto_1

    :cond_4
    sget-object v1, Lco/bird/android/model/ContiguousInitialDataState$Content;->INSTANCE:Lco/bird/android/model/ContiguousInitialDataState$Content;

    :goto_1
    invoke-virtual {v0, v1}, LAG;->accept(Ljava/lang/Object;)V

    invoke-virtual {p1}, LbO4$a;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_5

    iget-object v0, p0, LnO4$h;->g:LnO4;

    invoke-virtual {v0}, LnO4;->V()LAG;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/ContiguousDataState$Loading;->INSTANCE:Lco/bird/android/model/ContiguousDataState$Loading;

    invoke-virtual {v0, v1}, LAG;->accept(Ljava/lang/Object;)V

    :cond_5
    iget-object v0, p0, LnO4$h;->h:LUD3$e;

    invoke-virtual {p1}, LbO4$a;->b()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, LUD3$e;->a(Ljava/util/List;)V

    goto :goto_2

    :cond_6
    instance-of v0, p1, LbO4$c;

    if-eqz v0, :cond_7

    iget-object v0, p0, LnO4$h;->g:LnO4;

    invoke-virtual {v0}, LnO4;->X()LAG;

    move-result-object v0

    new-instance v1, Lco/bird/android/model/ContiguousInitialDataState$Error;

    check-cast p1, LbO4$c;

    invoke-virtual {p1}, LbO4$c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lco/bird/android/model/ContiguousInitialDataState$Error;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LAG;->accept(Ljava/lang/Object;)V

    :cond_7
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LbO4;

    invoke-virtual {p0, p1}, LnO4$h;->a(LbO4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
