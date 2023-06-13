.class public final LAC2$a;
.super Lg9;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAC2;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "AC2$a",
        "Lg9;",
        "Lio/reactivex/c;",
        "a",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic f:LAC2;


# direct methods
.method public constructor <init>(LAC2;[Lco/bird/android/model/AgreementRole;Z)V
    .locals 8

    iput-object p1, p0, LAC2$a;->f:LAC2;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x18

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p2

    move v2, p3

    invoke-direct/range {v0 .. v7}, Lg9;-><init>([Lco/bird/android/model/AgreementRole;ZLjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic g(LAC2;)V
    .locals 0

    invoke-static {p0}, LAC2$a;->h(LAC2;)V

    return-void
.end method

.method public static final h(LAC2;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LAC2;->access$getProceed$p(LAC2;)Lma4;

    move-result-object p0

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p0, v0}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()Lio/reactivex/c;
    .locals 2

    iget-object v0, p0, LAC2$a;->f:LAC2;

    new-instance v1, LzC2;

    invoke-direct {v1, v0}, LzC2;-><init>(LAC2;)V

    invoke-static {v1}, Lio/reactivex/c;->J(Ljava/lang/Runnable;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "fromRunnable {\n         \u2026ed.accept(Unit)\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
