.class public final LB92;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA92;
.implements LSx6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0008\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u0015\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0001J\u0008\u0010\u0007\u001a\u00020\u0005H\u0016J\"\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u001b\u001a\u0004\u0008!\u0010\u001d\"\u0004\u0008\"\u0010\u001f\u00a8\u0006%"
    }
    d2 = {
        "LB92;",
        "LA92;",
        "LSx6;",
        "LRx6;",
        "listener",
        "",
        "d",
        "onResume",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "onActivityResult",
        "LD92;",
        "a",
        "LD92;",
        "ui",
        "Le13;",
        "b",
        "Le13;",
        "navigator",
        "Liy6;",
        "c",
        "Liy6;",
        "warehouseChecker",
        "",
        "Z",
        "e",
        "()Z",
        "f",
        "(Z)V",
        "hasGoneToBarcodeScanner",
        "isWarehouseVerified",
        "g",
        "<init>",
        "(LD92;Le13;Liy6;)V",
        "servicecenter_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LD92;

.field public final b:Le13;

.field public final c:Liy6;

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>(LD92;Le13;Liy6;)V
    .locals 1

    const-string v0, "ui"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "warehouseChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB92;->a:LD92;

    iput-object p2, p0, LB92;->b:Le13;

    iput-object p3, p0, LB92;->c:Liy6;

    invoke-virtual {p3, p1}, Liy6;->B(LVx6;)V

    return-void
.end method

.method public static final synthetic access$getNavigator$p(LB92;)Le13;
    .locals 0

    iget-object p0, p0, LB92;->b:Le13;

    return-object p0
.end method

.method public static final synthetic access$getUi$p(LB92;)LD92;
    .locals 0

    iget-object p0, p0, LB92;->a:LD92;

    return-object p0
.end method


# virtual methods
.method public d(LRx6;)V
    .locals 1

    iget-object v0, p0, LB92;->c:Liy6;

    invoke-virtual {v0, p1}, Liy6;->d(LRx6;)V

    return-void
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, LB92;->d:Z

    return v0
.end method

.method public final f(Z)V
    .locals 0

    iput-boolean p1, p0, LB92;->d:Z

    return-void
.end method

.method public final g(Z)V
    .locals 0

    iput-boolean p1, p0, LB92;->e:Z

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    const/16 v0, 0x2719

    const/4 v1, -0x1

    if-eq p1, v0, :cond_4

    const/16 v0, 0x2721

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    if-ne p2, v1, :cond_2

    if-eqz p3, :cond_2

    const-string p1, "raw_scan_result_unexpected"

    const/4 p2, 0x0

    invoke-virtual {p3, p1, p2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    iget-object p1, p0, LB92;->b:Le13;

    sget-object p2, Lco/bird/android/model/BarcodeScanType;->RAW:Lco/bird/android/model/BarcodeScanType;

    sget p3, Lnl4;->inventory:I

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Le13;->Y3(Lco/bird/android/model/BarcodeScanType;Ljava/lang/Integer;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, LB92;->b:Le13;

    invoke-interface {p1}, Le13;->e3()V

    goto :goto_0

    :cond_2
    if-nez p2, :cond_3

    iget-object p1, p0, LB92;->b:Le13;

    sget-object p2, Lco/bird/android/model/BarcodeScanType;->RAW:Lco/bird/android/model/BarcodeScanType;

    sget p3, Lnl4;->inventory:I

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Le13;->Y3(Lco/bird/android/model/BarcodeScanType;Ljava/lang/Integer;)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, LB92;->b:Le13;

    invoke-interface {p1}, Le13;->e3()V

    goto :goto_0

    :cond_4
    if-ne p2, v1, :cond_5

    if-eqz p3, :cond_5

    iget-object p1, p0, LB92;->b:Le13;

    const-string p2, "code"

    invoke-virtual {p3, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Le13;->R2(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    iget-object p1, p0, LB92;->b:Le13;

    invoke-interface {p1}, Le13;->e3()V

    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 2

    new-instance v0, LB92$a;

    invoke-direct {v0, p0}, LB92$a;-><init>(LB92;)V

    iget-boolean v1, p0, LB92;->e:Z

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, LB92;->d(LRx6;)V

    :cond_0
    return-void
.end method
