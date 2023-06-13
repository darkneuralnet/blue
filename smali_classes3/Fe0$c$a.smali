.class public final LFe0$c$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFe0$c;-><init>(LFe0;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/view/View;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/view/View;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCaptureBulkScannerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureBulkScannerAdapter.kt\nco/bird/android/feature/bulkscanner/scan/capture/adapters/CaptureBulkScannerAdapter$VehicleViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,114:1\n1#2:115\n18#3:116\n9#4,4:117\n*S KotlinDebug\n*F\n+ 1 CaptureBulkScannerAdapter.kt\nco/bird/android/feature/bulkscanner/scan/capture/adapters/CaptureBulkScannerAdapter$VehicleViewHolder$1\n*L\n87#1:116\n87#1:117,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LFe0$c;

.field public final synthetic h:LFe0;


# direct methods
.method public constructor <init>(LFe0$c;LFe0;)V
    .locals 0

    iput-object p1, p0, LFe0$c$a;->g:LFe0$c;

    iput-object p2, p0, LFe0$c$a;->h:LFe0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LFe0$c$a;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, LFe0$c$a;->g:LFe0$c;

    invoke-virtual {p1}, Lw1;->getSafePosition()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, LFe0$c$a;->h:LFe0;

    invoke-static {v0}, LFe0;->access$getAdapterData(LFe0;)LE6;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/wire/WireCaptureValidation;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/wire/WireCaptureValidation;

    if-eqz p1, :cond_1

    iget-object v0, p0, LFe0$c$a;->h:LFe0;

    invoke-virtual {v0}, LFe0;->x()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
