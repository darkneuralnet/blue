.class public final LSs3$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSs3;->m(Lcom/uber/autodispose/ScopeProvider;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/OperatorScanIntent;",
        "+",
        "Lco/bird/android/model/DemandAreaAnalyticsInfo;",
        ">;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/OperatorScanIntent;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/model/OperatorScanIntent;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/DemandAreaAnalyticsInfo;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/u;",
        "c",
        "(Lkotlin/Pair;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LSs3;


# direct methods
.method public constructor <init>(LSs3;)V
    .locals 0

    iput-object p1, p0, LSs3$f;->g:LSs3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, LSs3$f;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/OperatorScanIntent;
    .locals 0

    invoke-static {p0, p1}, LSs3$f;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/OperatorScanIntent;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/OperatorScanIntent;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/OperatorScanIntent;

    return-object p0
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final c(Lkotlin/Pair;)Lio/reactivex/u;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "Lco/bird/android/model/OperatorScanIntent;",
            "Lco/bird/android/model/DemandAreaAnalyticsInfo;",
            ">;)",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/OperatorScanIntent;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/OperatorScanIntent;

    iget-object v0, p0, LSs3$f;->g:LSs3;

    invoke-static {v0}, LSs3;->access$getPermissionManager$p(LSs3;)LDQ3;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/Permission;->CAMERA:Lco/bird/android/model/constant/Permission;

    invoke-virtual {v0, v1}, LDQ3;->l(Lco/bird/android/model/constant/Permission;)Lio/reactivex/F;

    move-result-object v0

    sget-object v1, LSs3$f$a;->g:LSs3$f$a;

    new-instance v2, LTs3;

    invoke-direct {v2, v1}, LTs3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->z(Lio/reactivex/functions/q;)Lio/reactivex/p;

    move-result-object v0

    new-instance v1, LSs3$f$b;

    invoke-direct {v1, p1}, LSs3$f$b;-><init>(Lco/bird/android/model/OperatorScanIntent;)V

    new-instance p1, LUs3;

    invoke-direct {p1, v1}, LUs3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/p;->H(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LSs3$f;->c(Lkotlin/Pair;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
