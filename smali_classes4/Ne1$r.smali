.class public final LNe1$r;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNe1;->P(Lio/reactivex/Observable;Lco/bird/android/model/constant/PartKind;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lio/reactivex/u<",
        "+",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "input",
        "Lio/reactivex/u;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Ljava/lang/String;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/constant/PartKind;

.field public final synthetic h:LNe1;


# direct methods
.method public constructor <init>(Lco/bird/android/model/constant/PartKind;LNe1;)V
    .locals 0

    iput-object p1, p0, LNe1$r;->g:Lco/bird/android/model/constant/PartKind;

    iput-object p2, p0, LNe1$r;->h:LNe1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Lio/reactivex/u;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LNe1$r;->g:Lco/bird/android/model/constant/PartKind;

    sget-object v1, Lco/bird/android/model/constant/PartKind;->PLATE:Lco/bird/android/model/constant/PartKind;

    if-ne v0, v1, :cond_1

    invoke-static {}, LNe1;->access$getPLATE_LENGTH_RANGE$cp()Lkotlin/ranges/IntRange;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/ranges/IntProgression;->getFirst()I

    move-result v1

    invoke-virtual {v0}, Lkotlin/ranges/IntProgression;->getLast()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    if-gt v1, v2, :cond_0

    if-gt v2, v0, :cond_0

    const/4 v3, 0x1

    :cond_0
    if-nez v3, :cond_1

    iget-object p1, p0, LNe1$r;->h:LNe1;

    invoke-static {p1}, LNe1;->access$getUi$p(LNe1;)LSe1;

    move-result-object p1

    sget-object v0, Llg1;->c:Llg1;

    invoke-interface {p1, v0}, LSe1;->L9(Llg1;)V

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LNe1$r;->g:Lco/bird/android/model/constant/PartKind;

    sget-object v1, Lco/bird/android/model/constant/PartKind;->PCM:Lco/bird/android/model/constant/PartKind;

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xe

    if-eq v0, v1, :cond_2

    iget-object p1, p0, LNe1$r;->h:LNe1;

    invoke-static {p1}, LNe1;->access$getUi$p(LNe1;)LSe1;

    move-result-object p1

    sget-object v0, Llg1;->g:Llg1;

    invoke-interface {p1, v0}, LSe1;->L9(Llg1;)V

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LNe1$r;->b(Ljava/lang/String;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
