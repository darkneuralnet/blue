.class public final LmC2$D;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LmC2;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "Lorg/joda/time/DateTime;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/constant/RentalStatus;",
        ">;+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a\u00020\u00072z\u0010\u0006\u001av\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*:\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lorg/joda/time/DateTime;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/constant/RentalStatus;",
        "",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(Lkotlin/Triple;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LmC2;


# direct methods
.method public constructor <init>(LmC2;)V
    .locals 0

    iput-object p1, p0, LmC2$D;->g:LmC2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lorg/joda/time/DateTime;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/constant/RentalStatus;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/joda/time/DateTime;

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/constant/RentalStatus;->SCHEDULED:Lco/bird/android/model/constant/RentalStatus;

    if-eq v2, v3, :cond_1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget p1, Lnl4;->long_term_rental_return_date_label:I

    goto :goto_1

    :cond_1
    :goto_0
    sget p1, Lnl4;->long_term_rental_return_or_auto_renew_date_label:I

    :goto_1
    invoke-virtual {v0}, Lorg/joda/time/DateTime;->toLocalDate()Lorg/joda/time/LocalDate;

    move-result-object v2

    invoke-static {}, Lorg/joda/time/LocalDate;->now()Lorg/joda/time/LocalDate;

    move-result-object v3

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lco/bird/android/model/constant/RentalStatus;->PICKUP:Lco/bird/android/model/constant/RentalStatus;

    if-eq v4, v5, :cond_2

    invoke-static {}, LmC2;->access$getDATE_FORMATTER$cp()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v4

    invoke-virtual {v4, v0}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    invoke-virtual {v2, v3}, Lorg/joda/time/LocalDate;->compareTo(Lorg/joda/time/ReadablePartial;)I

    move-result v4

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-lez v4, :cond_3

    iget-object v4, p0, LmC2$D;->g:LmC2;

    invoke-static {v4}, LmC2;->access$getContext$p(LmC2;)Landroid/content/Context;

    move-result-object v4

    sget v8, Lnl4;->long_term_rental_return_due_date:I

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {}, LmC2;->access$getDATE_FORMATTER$cp()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v9

    invoke-virtual {v9, v0}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v7, v6

    invoke-virtual {v4, v8, v7}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_3
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v4, p0, LmC2$D;->g:LmC2;

    invoke-static {v4}, LmC2;->access$getContext$p(LmC2;)Landroid/content/Context;

    move-result-object v4

    sget v8, Lnl4;->long_term_rental_return_due_today_date:I

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {}, LmC2;->access$getDATE_FORMATTER$cp()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v9

    invoke-virtual {v9, v0}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v7, v6

    invoke-virtual {v4, v8, v7}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_4
    iget-object v0, p0, LmC2$D;->g:LmC2;

    invoke-static {v0}, LmC2;->access$getContext$p(LmC2;)Landroid/content/Context;

    move-result-object v0

    sget v4, Lnl4;->long_term_rental_return_overdue:I

    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    if-eq v1, v5, :cond_5

    sget v1, LDf4;->colorPrimaryDarkAlt:I

    goto :goto_3

    :cond_5
    invoke-virtual {v2, v3}, Lorg/joda/time/LocalDate;->compareTo(Lorg/joda/time/ReadablePartial;)I

    move-result v1

    if-ltz v1, :cond_6

    sget v1, LDf4;->green:I

    goto :goto_3

    :cond_6
    sget v1, LDf4;->red:I

    :goto_3
    iget-object v2, p0, LmC2$D;->g:LmC2;

    invoke-static {v2}, LmC2;->access$getUi$p(LmC2;)LxC2;

    move-result-object v2

    const-string v3, "date"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1, v0, v1}, LxC2;->gm(ILjava/lang/String;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, LmC2$D;->a(Lkotlin/Triple;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
