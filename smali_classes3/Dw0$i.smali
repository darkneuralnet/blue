.class public final LDw0$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDw0;->y(LFw0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/Integer;",
        "+",
        "Lco/bird/android/model/persistence/Tutorial;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0004\u0012\u000c\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u000c\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "",
        "Lco/bird/android/model/persistence/Tutorial;",
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
.field public final synthetic g:LDw0;


# direct methods
.method public constructor <init>(LDw0;)V
    .locals 0

    iput-object p1, p0, LDw0$i;->g:LDw0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LDw0$i;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Lco/bird/android/model/persistence/Tutorial;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/Tutorial;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Tutorial;->getPages()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/TutorialPage;

    iget-object v0, p0, LDw0$i;->g:LDw0;

    invoke-static {v0}, LDw0;->access$getCurrentPageRelay$p(LDw0;)Lma4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    iget-object v0, p0, LDw0$i;->g:LDw0;

    new-instance v1, LsA5;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/TutorialPage;->getType()Lco/bird/android/model/constant/ConfigurableTutorialType;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/constant/ConfigurableTutorialType;->CHAPTER_OPTIONAL:Lco/bird/android/model/constant/ConfigurableTutorialType;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne v2, v3, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v5

    :goto_0
    invoke-direct {v1, v2}, LsA5;-><init>(Z)V

    invoke-virtual {v0, v1}, Lf1;->h(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/TutorialPage;->getButtonText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, LDw0$i;->g:LDw0;

    new-instance v2, LNv5;

    invoke-direct {v2, v0}, LNv5;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lf1;->h(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/TutorialPage;->getType()Lco/bird/android/model/constant/ConfigurableTutorialType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/ConfigurableTutorialType;->QUIZ:Lco/bird/android/model/constant/ConfigurableTutorialType;

    if-ne v0, v1, :cond_2

    const-string v0, "hiding button due to quiz page being shown"

    new-array v1, v5, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LDw0$i;->g:LDw0;

    sget-object v1, LIM1;->a:LIM1;

    invoke-virtual {v0, v1}, Lf1;->h(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    const-string v0, "showing button due to non-quiz page being shown"

    new-array v1, v5, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LDw0$i;->g:LDw0;

    sget-object v1, LZz5;->a:LZz5;

    invoke-virtual {v0, v1}, Lf1;->h(Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/TutorialPage;->getHelpButtonText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/TutorialPage;->getZendeskHelpUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    move v4, v5

    :cond_4
    :goto_2
    if-nez v4, :cond_5

    if-eqz v0, :cond_5

    iget-object p1, p0, LDw0$i;->g:LDw0;

    new-instance v1, LXv5;

    invoke-direct {v1, v0}, LXv5;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lf1;->h(Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    iget-object p1, p0, LDw0$i;->g:LDw0;

    sget-object v0, LJM1;->a:LJM1;

    invoke-virtual {p1, v0}, Lf1;->h(Ljava/lang/Object;)V

    :goto_3
    return-void
.end method
