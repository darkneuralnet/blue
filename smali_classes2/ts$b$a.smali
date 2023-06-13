.class public final Lts$b$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lts$b;->b()Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/google/android/material/tabs/TabLayout$g;",
        "Lco/bird/android/model/PlanItemModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lcom/google/android/material/tabs/TabLayout$g;",
        "tab",
        "Lco/bird/android/model/PlanItemModel;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lcom/google/android/material/tabs/TabLayout$g;)Lco/bird/android/model/PlanItemModel;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lts$b$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lts$b$a;

    invoke-direct {v0}, Lts$b$a;-><init>()V

    sput-object v0, Lts$b$a;->g:Lts$b$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/material/tabs/TabLayout$g;)Lco/bird/android/model/PlanItemModel;
    .locals 1

    const-string v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$g;->e()Landroid/view/View;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type co.bird.android.autopayv2plan.PlanLayoutItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lco/bird/android/autopayv2plan/PlanLayoutItem;

    invoke-virtual {p1}, Lco/bird/android/autopayv2plan/PlanLayoutItem;->b()Lco/bird/android/model/PlanItemModel;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/material/tabs/TabLayout$g;

    invoke-virtual {p0, p1}, Lts$b$a;->a(Lcom/google/android/material/tabs/TabLayout$g;)Lco/bird/android/model/PlanItemModel;

    move-result-object p1

    return-object p1
.end method
