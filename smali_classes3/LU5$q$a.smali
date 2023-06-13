.class public final LLU5$q$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLU5$q;->a(Lco/bird/api/response/NestSuggestionResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LOU5;",
        "LOU5;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LOU5;",
        "state",
        "a",
        "(LOU5;)LOU5;"
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
        "SMAP\nSuggestNestPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestPresenter.kt\nco/bird/android/feature/suggestanest/SuggestNestPresenter$consume$24$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1#2:253\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/api/response/NestSuggestionResponse;


# direct methods
.method public constructor <init>(Lco/bird/api/response/NestSuggestionResponse;)V
    .locals 0

    iput-object p1, p0, LLU5$q$a;->g:Lco/bird/api/response/NestSuggestionResponse;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LOU5;)LOU5;
    .locals 17

    move-object/from16 v0, p1

    const-string v1, "state"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x1fff

    const/16 v16, 0x0

    invoke-static/range {v0 .. v16}, LOU5;->copy$default(LOU5;ILjava/util/List;Ljava/util/List;Landroid/location/Location;Ljava/lang/Float;DLBj6;Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)LOU5;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v2, v1, LLU5$q$a;->g:Lco/bird/api/response/NestSuggestionResponse;

    invoke-virtual {v2}, Lco/bird/api/response/NestSuggestionResponse;->getMessage()Lco/bird/android/model/wire/WireNestSuggestionMessage;

    move-result-object v2

    invoke-virtual {v0, v2}, LOU5;->s(Lco/bird/android/model/wire/WireNestSuggestionMessage;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LOU5;

    invoke-virtual {p0, p1}, LLU5$q$a;->a(LOU5;)LOU5;

    move-result-object p1

    return-object p1
.end method
