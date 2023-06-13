.class public final LVw5$K;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVw5;->c(Landroid/content/Intent;LsJ4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/User;",
        "+",
        "Ljava/lang/String;",
        ">;",
        "LHM4<",
        "+",
        "Lco/bird/android/model/Warehouse;",
        ">;",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/User;",
        "+",
        "Lco/bird/android/model/Warehouse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\u0018\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00002\u001a\u0010\u0004\u001a\u0016\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u00030\u00002\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0008\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00060\u00060\u0005H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/model/User;",
        "kotlin.jvm.PlatformType",
        "",
        "<name for destructuring parameter 0>",
        "LHM4;",
        "Lco/bird/android/model/Warehouse;",
        "warehouse",
        "a",
        "(Lkotlin/Pair;LHM4;)Lkotlin/Pair;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LVw5$K;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LVw5$K;

    invoke-direct {v0}, LVw5$K;-><init>()V

    sput-object v0, LVw5$K;->g:LVw5$K;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Pair;LHM4;)Lkotlin/Pair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/User;",
            "Ljava/lang/String;",
            ">;",
            "LHM4<",
            "+",
            "Lco/bird/android/model/Warehouse;",
            ">;)",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/User;",
            "Lco/bird/android/model/Warehouse;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "warehouse"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/User;

    invoke-virtual {p2}, LHM4;->a()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    check-cast p2, LHM4;

    invoke-virtual {p0, p1, p2}, LVw5$K;->a(Lkotlin/Pair;LHM4;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
