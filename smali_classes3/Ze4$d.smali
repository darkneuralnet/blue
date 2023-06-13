.class public final LZe4$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZe4;->onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;",
        "kotlin.jvm.PlatformType",
        "updatedAnswer",
        "",
        "a",
        "(Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;)V"
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
        "SMAP\nQuizAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuizAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/QuizAdapter$onAttachedToRecyclerView$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n350#2,7:157\n1#3:164\n*S KotlinDebug\n*F\n+ 1 QuizAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/QuizAdapter$onAttachedToRecyclerView$4\n*L\n78#1:157,7\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LZe4;


# direct methods
.method public constructor <init>(LZe4;)V
    .locals 0

    iput-object p1, p0, LZe4$d;->g:LZe4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;)V
    .locals 8

    iget-object v0, p0, LZe4$d;->g:LZe4;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "check change updated answer: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for data "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LZe4$d;->g:LZe4;

    invoke-static {v0}, LZe4;->access$getAdapterData(LZe4;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, -0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LG6;

    invoke-virtual {v3}, LG6;->c()Ljava/lang/Object;

    move-result-object v3

    instance-of v6, v3, Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;

    if-eqz v6, :cond_0

    check-cast v3, Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;

    goto :goto_1

    :cond_0
    move-object v3, v5

    :goto_1
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;->getAnswer()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_1
    move-object v3, v5

    :goto_2
    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;->getAnswer()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    move v2, v4

    :goto_3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-eq v2, v4, :cond_4

    const/4 v1, 0x1

    :cond_4
    if-eqz v1, :cond_5

    move-object v5, v0

    :cond_5
    if-eqz v5, :cond_6

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, LZe4$d;->g:LZe4;

    invoke-static {v1}, LZe4;->access$getAdapterData(LZe4;)LE6;

    move-result-object v1

    invoke-virtual {v1, v0}, LE6;->e(I)LG6;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v3, p1

    invoke-static/range {v2 .. v7}, LG6;->copy$default(LG6;Ljava/lang/Object;IZILjava/lang/Object;)LG6;

    move-result-object p1

    iget-object v1, p0, LZe4$d;->g:LZe4;

    invoke-static {v1}, LZe4;->access$getAdapterData(LZe4;)LE6;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, LE6;->l(ILG6;)Z

    iget-object p1, p0, LZe4$d;->g:LZe4;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyDataSetChanged()V

    :cond_6
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;

    invoke-virtual {p0, p1}, LZe4$d;->a(Lco/bird/android/model/persistence/nestedstructures/TutorialQuizAnswer;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
