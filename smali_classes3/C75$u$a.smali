.class public final LC75$u$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC75$u;->a(Lkotlin/Triple;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
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
.field public final synthetic g:LC75;

.field public final synthetic h:Lco/bird/android/model/wire/WireRide;


# direct methods
.method public constructor <init>(LC75;Lco/bird/android/model/wire/WireRide;)V
    .locals 0

    iput-object p1, p0, LC75$u$a;->g:LC75;

    iput-object p2, p0, LC75$u$a;->h:Lco/bird/android/model/wire/WireRide;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LC75$u$a;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 8

    iget-object v0, p0, LC75$u$a;->g:LC75;

    invoke-static {v0}, LC75;->access$getFeedbackManager$p(LC75;)LFk1;

    move-result-object v1

    iget-object v2, p0, LC75$u$a;->h:Lco/bird/android/model/wire/WireRide;

    const/high16 v3, 0x40a00000    # 5.0f

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, LFk1$a;->submitRideFeedbackAsync$default(LFk1;Lco/bird/android/model/wire/WireRide;FLjava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    iget-object v0, p0, LC75$u$a;->g:LC75;

    invoke-static {v0}, LC75;->access$getRideSummaryUi$p(LC75;)LF75;

    move-result-object v0

    sget v1, Lnl4;->feedback_thank_you:I

    sget-object v2, Lf56;->d:Lf56;

    invoke-interface {v0, v1, v2}, Lh56;->topToast(ILf56;)V

    iget-object v0, p0, LC75$u$a;->g:LC75;

    invoke-static {v0}, LC75;->access$getNavigator$p(LC75;)Le13;

    move-result-object v0

    invoke-interface {v0}, Le13;->close()V

    return-void
.end method
