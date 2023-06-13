.class public final LYq1$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYq1;->u(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LYq1$a;",
        "Lkotlin/Triple<",
        "+",
        "Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;",
        "+",
        "Ljava/util/List<",
        "LH6;",
        ">;+",
        "Ljava/lang/Boolean;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0008\u001a>\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006 \u0007*\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "LYq1$a;",
        "<name for destructuring parameter 0>",
        "Lkotlin/Triple;",
        "Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;",
        "",
        "LH6;",
        "",
        "kotlin.jvm.PlatformType",
        "a",
        "(LYq1$a;)Lkotlin/Triple;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LYq1$h;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LYq1$h;

    invoke-direct {v0}, LYq1$h;-><init>()V

    sput-object v0, LYq1$h;->g:LYq1$h;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LYq1$a;)Lkotlin/Triple;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYq1$a;",
            ")",
            "Lkotlin/Triple<",
            "Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;",
            "Ljava/util/List<",
            "LH6;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYq1$a;->a()Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;

    move-result-object v0

    invoke-virtual {p1}, LYq1$a;->b()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, LYq1$a;->c()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, LYq1$a;->d()Z

    move-result p1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v1

    if-eqz v2, :cond_0

    check-cast v2, Ljava/util/Collection;

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    const/4 v3, 0x0

    invoke-interface {v1, v3, v2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    new-instance v2, Lkotlin/Triple;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v2, v0, v1, p1}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYq1$a;

    invoke-virtual {p0, p1}, LYq1$h;->a(LYq1$a;)Lkotlin/Triple;

    move-result-object p1

    return-object p1
.end method
