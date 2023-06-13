.class public final Lu93$d$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu93$d;-><init>(Lu93;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroid/widget/CompoundButton;",
        "Ljava/lang/Boolean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Landroid/widget/CompoundButton;",
        "<anonymous parameter 0>",
        "",
        "isChecked",
        "",
        "a",
        "(Landroid/widget/CompoundButton;Z)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNonRepairSurveyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonRepairSurveyAdapter.kt\nco/bird/android/feature/repair/v3/overview/nonrepair/adapters/NonRepairSurveyAdapter$SubreasonViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,109:1\n1#2:110\n18#3:111\n9#4,4:112\n*S KotlinDebug\n*F\n+ 1 NonRepairSurveyAdapter.kt\nco/bird/android/feature/repair/v3/overview/nonrepair/adapters/NonRepairSurveyAdapter$SubreasonViewHolder$1\n*L\n100#1:111\n100#1:112,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lu93$d;

.field public final synthetic h:Lu93;


# direct methods
.method public constructor <init>(Lu93$d;Lu93;)V
    .locals 0

    iput-object p1, p0, Lu93$d$a;->g:Lu93$d;

    iput-object p2, p0, Lu93$d$a;->h:Lu93;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/widget/CompoundButton;Z)V
    .locals 0

    iget-object p1, p0, Lu93$d$a;->g:Lu93$d;

    invoke-virtual {p1}, Lu93$a;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_2

    iget-object p1, p0, Lu93$d$a;->g:Lu93$d;

    invoke-virtual {p1}, Lw1;->getSafePosition()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p2, p0, Lu93$d$a;->h:Lu93;

    invoke-static {p2}, Lu93;->access$getAdapterData(Lu93;)LE6;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p2, p1}, LE6;->e(I)LG6;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Lkotlin/Pair;

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lkotlin/Pair;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/NonRepairReason;

    if-eqz p1, :cond_2

    new-instance p2, Lco/bird/android/buava/Optional;

    invoke-direct {p2, p1}, Lco/bird/android/buava/Optional;-><init>(Ljava/lang/Object;)V

    iget-object p1, p0, Lu93$d$a;->h:Lu93;

    invoke-static {p1}, Lu93;->access$getOnSubreasonSelected$p(Lu93;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/widget/CompoundButton;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0, p1, p2}, Lu93$d$a;->a(Landroid/widget/CompoundButton;Z)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
