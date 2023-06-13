.class public final LDw$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDw;->b(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)V"
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
.field public final synthetic g:LDw;


# direct methods
.method public constructor <init>(LDw;)V
    .locals 0

    iput-object p1, p0, LDw$f;->g:LDw;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LDw$f;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 9

    iget-object p1, p0, LDw$f;->g:LDw;

    invoke-static {p1}, LDw;->access$getNavigator$p(LDw;)Le13;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/ComplaintType;->BAD_RIDING:Lco/bird/android/model/ComplaintType;

    iget-object p1, p0, LDw$f;->g:LDw;

    invoke-static {p1}, LDw;->access$getSections$p(LDw;)Ljava/util/ArrayList;

    move-result-object p1

    const/4 v2, 0x0

    if-nez p1, :cond_0

    const-string p1, "sections"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v2

    :cond_0
    const/4 v3, 0x0

    iget-object v4, p0, LDw$f;->g:LDw;

    invoke-static {v4}, LDw;->access$getRole$p(LDw;)Lco/bird/android/model/constant/MapMode;

    move-result-object v4

    if-nez v4, :cond_1

    const-string v4, "role"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v2

    :cond_1
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x34

    const/4 v8, 0x0

    move-object v2, p1

    invoke-static/range {v0 .. v8}, Le13$a;->goToReport$default(Le13;Lco/bird/android/model/ComplaintType;Ljava/util/ArrayList;Ljava/lang/String;Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/wire/WireBird;ZILjava/lang/Object;)V

    return-void
.end method
