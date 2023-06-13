.class public final LpT$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCQ3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LpT;->G(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "pT$a",
        "LCQ3;",
        "Lco/bird/android/model/constant/Permission;",
        "permission",
        "",
        "a",
        "b",
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
.field public final synthetic a:Z

.field public final synthetic b:LpT;


# direct methods
.method public constructor <init>(ZLpT;)V
    .locals 0

    iput-boolean p1, p0, LpT$a;->a:Z

    iput-object p2, p0, LpT$a;->b:LpT;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/model/constant/Permission;)V
    .locals 9

    const-string v0, "permission"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, LpT$a;->a:Z

    if-nez p1, :cond_0

    sget-object p1, Lco/bird/android/model/ScanType;->SERIAL_NUMBER:Lco/bird/android/model/ScanType;

    goto :goto_0

    :cond_0
    sget-object p1, Lco/bird/android/model/ScanType;->NEW_QR_CODE:Lco/bird/android/model/ScanType;

    :goto_0
    move-object v1, p1

    iget-object p1, p0, LpT$a;->b:LpT;

    invoke-static {p1}, LpT;->access$getNavigator$p(LpT;)Le13;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object p1, p0, LpT$a;->b:LpT;

    invoke-static {p1}, LpT;->access$getPreference$p(LpT;)Lgl;

    move-result-object p1

    invoke-virtual {p1}, Lgl;->t0()Lco/bird/android/model/constant/MapMode;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x36

    const/4 v8, 0x0

    invoke-static/range {v0 .. v8}, Le13$a;->goToLegacyScanBird$default(Le13;Lco/bird/android/model/ScanType;Ljava/lang/String;Lco/bird/android/model/constant/BirdAction;Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/constant/ScanIntention;ZILjava/lang/Object;)V

    return-void
.end method

.method public b(Lco/bird/android/model/constant/Permission;)V
    .locals 1

    const-string v0, "permission"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "User denied camera permission!"

    invoke-static {v0, p1}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
