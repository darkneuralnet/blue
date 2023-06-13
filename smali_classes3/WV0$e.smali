.class public final LWV0$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWV0;->d(Lio/reactivex/p;Z)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LPL4;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LPL4;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(LPL4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LWV0;


# direct methods
.method public constructor <init>(LWV0;)V
    .locals 0

    iput-object p1, p0, LWV0$e;->g:LWV0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LPL4;)V
    .locals 16

    invoke-virtual/range {p1 .. p1}, LPL4;->a()LcW0;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, LPL4;->b()LMV0;

    move-result-object v1

    if-eqz v1, :cond_8

    instance-of v1, v0, LKV0;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, LKV0;

    move-object/from16 v3, p0

    goto :goto_0

    :cond_0
    move-object/from16 v3, p0

    move-object v1, v2

    :goto_0
    iget-object v4, v3, LWV0$e;->g:LWV0;

    invoke-static {v4}, LWV0;->access$getAnalyticsManager$p(LWV0;)LEa;

    move-result-object v4

    new-instance v15, LnW0;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LKV0;->b()Landroid/net/Uri;

    move-result-object v2

    :cond_1
    if-nez v2, :cond_3

    instance-of v0, v0, Lcf6;

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v0, 0x1

    :goto_2
    move v9, v0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v0, ""

    if-eqz v1, :cond_5

    invoke-virtual {v1}, LKV0;->c()Landroid/net/Uri;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    move-object v12, v2

    goto :goto_4

    :cond_5
    :goto_3
    move-object v12, v0

    :goto_4
    if-eqz v1, :cond_7

    invoke-virtual {v1}, LKV0;->b()Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_5

    :cond_6
    move-object v13, v1

    goto :goto_6

    :cond_7
    :goto_5
    move-object v13, v0

    :goto_6
    const/4 v14, 0x7

    const/4 v0, 0x0

    move-object v5, v15

    move-object v1, v15

    move-object v15, v0

    invoke-direct/range {v5 .. v15}, LnW0;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v4, v1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    goto :goto_7

    :cond_8
    move-object/from16 v3, p0

    :goto_7
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LPL4;

    invoke-virtual {p0, p1}, LWV0$e;->a(LPL4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
