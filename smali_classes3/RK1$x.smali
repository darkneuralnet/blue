.class public final LRK1$x;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRK1;->m0()V
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
.field public final synthetic g:LRK1;


# direct methods
.method public constructor <init>(LRK1;)V
    .locals 0

    iput-object p1, p0, LRK1$x;->g:LRK1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LRK1$x;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, LRK1$x;->g:LRK1;

    invoke-static {v1}, LRK1;->access$getAnalyticsManager$p(LRK1;)LEa;

    move-result-object v1

    iget-object v2, v0, LRK1$x;->g:LRK1;

    invoke-static {v2}, LRK1;->access$getAppPreference$p(LRK1;)Lgl;

    move-result-object v2

    invoke-virtual {v2}, Lgl;->s0()Lco/bird/android/model/UserRoleItem;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/UserRoleItem;->getUserRole()Lco/bird/android/model/constant/UserRole;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    const-string v4, "getDefault()"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v10

    const-string v2, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LGL1;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v9, "helmet_lease"

    const-string v11, "zendesk"

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-string v14, "360030668292"

    const/4 v15, 0x0

    const/16 v16, 0x7

    const/16 v17, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v17}, LGL1;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v2}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    iget-object v1, v0, LRK1$x;->g:LRK1;

    invoke-static {v1}, LRK1;->access$getNavigator$p(LRK1;)Le13;

    move-result-object v1

    const-wide v2, 0x53d3800604L

    invoke-interface {v1, v2, v3}, Le13;->w3(J)V

    return-void
.end method
