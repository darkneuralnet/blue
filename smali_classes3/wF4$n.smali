.class public final LwF4$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LwF4;->x(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LwF4$n$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireQuickLink;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireQuickLink;",
        "kotlin.jvm.PlatformType",
        "quickLink",
        "",
        "a",
        "(Lco/bird/android/model/wire/WireQuickLink;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LwF4;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LwF4;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LwF4$n;->g:LwF4;

    iput-object p2, p0, LwF4$n;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireQuickLink;)V
    .locals 13

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireQuickLink;->getLinkBehavior()Lco/bird/android/model/constant/QuickLinkBehavior;

    move-result-object v0

    sget-object v1, LwF4$n$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 p1, 0x2

    if-eq v0, p1, :cond_1

    const/4 p1, 0x3

    if-eq v0, p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, LwF4$n;->g:LwF4;

    invoke-static {p1}, LwF4;->access$getNavigator$p(LwF4;)Le13;

    move-result-object p1

    iget-object v0, p0, LwF4$n;->h:Ljava/lang/String;

    invoke-interface {p1, v0}, Le13;->K(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, LwF4$n;->g:LwF4;

    invoke-static {p1}, LwF4;->access$getNavigator$p(LwF4;)Le13;

    move-result-object v0

    iget-object v1, p0, LwF4$n;->h:Ljava/lang/String;

    sget-object v2, Lco/bird/android/model/constant/InspectionContext;->SCANNER:Lco/bird/android/model/constant/InspectionContext;

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Le13$a;->goToInspectionV3$default(Le13;Ljava/lang/String;Lco/bird/android/model/constant/InspectionContext;Ljava/lang/Integer;ILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lco/bird/android/model/wire/WireQuickLink;->getUrl()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_3

    iget-object v0, p0, LwF4$n;->g:LwF4;

    invoke-static {v0}, LwF4;->access$getNavigator$p(LwF4;)Le13;

    move-result-object v6

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireQuickLink;->getDisplay()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xc

    const/4 v12, 0x0

    invoke-static/range {v6 .. v12}, Le13$a;->goToWebView$default(Le13;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZILjava/lang/Object;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireQuickLink;

    invoke-virtual {p0, p1}, LwF4$n;->a(Lco/bird/android/model/wire/WireQuickLink;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
