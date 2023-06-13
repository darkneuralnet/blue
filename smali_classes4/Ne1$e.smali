.class public final LNe1$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNe1;->x(Ljava/lang/String;)Lio/reactivex/p;
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
        "it",
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


# instance fields
.field public final synthetic g:Lco/bird/android/model/constant/PartKind;

.field public final synthetic h:LNe1;


# direct methods
.method public constructor <init>(Lco/bird/android/model/constant/PartKind;LNe1;)V
    .locals 0

    iput-object p1, p0, LNe1$e;->g:Lco/bird/android/model/constant/PartKind;

    iput-object p2, p0, LNe1$e;->h:LNe1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LNe1$e;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, LNe1$e;->g:Lco/bird/android/model/constant/PartKind;

    sget-object v0, Lco/bird/android/model/constant/PartKind;->STICKER:Lco/bird/android/model/constant/PartKind;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LNe1$e;->h:LNe1;

    invoke-static {p1}, LNe1;->access$getUi$p(LNe1;)LSe1;

    move-result-object p1

    sget-object v0, Llg1;->d:Llg1;

    invoke-interface {p1, v0}, LSe1;->L9(Llg1;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LNe1$e;->h:LNe1;

    invoke-static {p1}, LNe1;->access$getUi$p(LNe1;)LSe1;

    move-result-object p1

    sget-object v0, Llg1;->e:Llg1;

    invoke-interface {p1, v0}, LSe1;->L9(Llg1;)V

    :goto_0
    return-void
.end method
