.class public final LCH4$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCH4;->B(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LCH4$f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/ComplaintSchemaResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/ComplaintSchemaResponse;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(Lco/bird/api/response/ComplaintSchemaResponse;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LCH4;


# direct methods
.method public constructor <init>(LCH4;)V
    .locals 0

    iput-object p1, p0, LCH4$f;->g:LCH4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/ComplaintSchemaResponse;)V
    .locals 10

    iget-object v0, p0, LCH4$f;->g:LCH4;

    invoke-static {v0}, LCH4;->access$getType$p(LCH4;)Lco/bird/android/model/ComplaintType;

    move-result-object v1

    const-string v2, "type"

    const/4 v3, 0x0

    if-nez v1, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v3

    :cond_0
    sget-object v4, LCH4$f$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v4, v1

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const-string v7, "sections"

    if-eq v1, v6, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    iget-object p1, p0, LCH4$f;->g:LCH4;

    invoke-static {p1}, LCH4;->access$getSections$p(LCH4;)Ljava/util/ArrayList;

    move-result-object p1

    if-nez p1, :cond_4

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v3

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lco/bird/api/response/ComplaintSchemaResponse;->getBadRiding()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lco/bird/api/response/ComplaintSchemaResponse;->getBadParking()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lco/bird/api/response/ComplaintSchemaResponse;->getDamaged()Ljava/util/List;

    move-result-object p1

    :cond_4
    :goto_0
    invoke-static {p1}, Llm0;->a(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {v0, p1}, LCH4;->access$setSections$p(LCH4;Ljava/util/ArrayList;)V

    iget-object p1, p0, LCH4$f;->g:LCH4;

    invoke-static {p1}, LCH4;->access$getSections$p(LCH4;)Ljava/util/ArrayList;

    move-result-object p1

    if-nez p1, :cond_5

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v3

    :cond_5
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/ComplaintSection;

    invoke-virtual {v0}, Lco/bird/android/model/ComplaintSection;->getType()Lco/bird/android/model/ComplaintSectionType;

    move-result-object v1

    sget-object v8, LCH4$f$a;->$EnumSwitchMapping$1:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v8, v1

    if-eq v1, v6, :cond_7

    if-eq v1, v5, :cond_7

    if-eq v1, v4, :cond_6

    goto :goto_1

    :cond_6
    iget-object v1, p0, LCH4$f;->g:LCH4;

    new-instance v8, Lkotlin/Pair;

    invoke-virtual {v0}, Lco/bird/android/model/ComplaintSection;->getPlaceholder()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Lco/bird/android/model/ComplaintSection;->getProperty()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v9, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v8}, LCH4;->access$setTextComplaintSection$p(LCH4;Lkotlin/Pair;)V

    goto :goto_1

    :cond_7
    iget-object v1, p0, LCH4$f;->g:LCH4;

    invoke-virtual {v0}, Lco/bird/android/model/ComplaintSection;->getOptions()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_8

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    goto :goto_2

    :cond_8
    move-object v0, v3

    :goto_2
    invoke-static {v1, v0}, LCH4;->access$setComplaintOptions$p(LCH4;Ljava/util/List;)V

    goto :goto_1

    :cond_9
    iget-object p1, p0, LCH4$f;->g:LCH4;

    invoke-static {p1}, LCH4;->access$getUi$p(LCH4;)LHH4;

    move-result-object p1

    iget-object v0, p0, LCH4$f;->g:LCH4;

    invoke-static {v0}, LCH4;->access$getSections$p(LCH4;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_a

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_a
    iget-object v1, p0, LCH4$f;->g:LCH4;

    invoke-static {v1}, LCH4;->access$getType$p(LCH4;)Lco/bird/android/model/ComplaintType;

    move-result-object v1

    if-nez v1, :cond_b

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_3

    :cond_b
    move-object v3, v1

    :goto_3
    invoke-interface {p1, v0, v3}, LHH4;->Mb(Ljava/util/List;Lco/bird/android/model/ComplaintType;)V

    iget-object p1, p0, LCH4$f;->g:LCH4;

    invoke-static {p1}, LCH4;->access$listenForOptionClicks(LCH4;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/ComplaintSchemaResponse;

    invoke-virtual {p0, p1}, LCH4$f;->a(Lco/bird/api/response/ComplaintSchemaResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
