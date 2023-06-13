.class public final LwF4$c;
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

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/RepairIssue;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/RepairIssue;",
        "kotlin.jvm.PlatformType",
        "issue",
        "",
        "a",
        "(Lco/bird/android/model/RepairIssue;)V"
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

    iput-object p1, p0, LwF4$c;->g:LwF4;

    iput-object p2, p0, LwF4$c;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/RepairIssue;)V
    .locals 7

    iget-object v0, p0, LwF4$c;->g:LwF4;

    invoke-static {v0}, LwF4;->access$getNavigator$p(LwF4;)Le13;

    move-result-object v1

    iget-object v2, p0, LwF4$c;->h:Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v4, p1

    invoke-static/range {v1 .. v6}, Le13$a;->goToRepairV3Issue$default(Le13;Ljava/lang/String;Lco/bird/android/model/RepairCategory;Lco/bird/android/model/RepairIssue;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/RepairIssue;

    invoke-virtual {p0, p1}, LwF4$c;->a(Lco/bird/android/model/RepairIssue;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
