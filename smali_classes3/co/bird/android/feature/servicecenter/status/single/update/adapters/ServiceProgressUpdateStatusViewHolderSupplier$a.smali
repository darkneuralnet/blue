.class public final Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier$a;
.super LeT0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000f"
    }
    d2 = {
        "Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier$a;",
        "LeT0;",
        "LG6;",
        "item",
        "",
        "a",
        "Landroid/widget/TextView;",
        "kotlin.jvm.PlatformType",
        "c",
        "Landroid/widget/TextView;",
        "message",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier;Landroid/view/View;)V",
        "servicecenter_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nServiceProgressUpdateStatusViewHolderSupplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceProgressUpdateStatusViewHolderSupplier.kt\nco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier$MessageViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,48:1\n18#2:49\n9#3,4:50\n*S KotlinDebug\n*F\n+ 1 ServiceProgressUpdateStatusViewHolderSupplier.kt\nco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier$MessageViewHolder\n*L\n42#1:49\n42#1:50,4\n*E\n"
    }
.end annotation


# instance fields
.field public final c:Landroid/widget/TextView;

.field public final synthetic d:Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier$a;->d:Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier;

    invoke-direct {p0, p2}, LeT0;-><init>(Landroid/view/View;)V

    sget p1, Lxi4;->message:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier$a;->c:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public a(LG6;)V
    .locals 3

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/wire/WireServiceCenterStatus;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/wire/WireServiceCenterStatus;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateStatusViewHolderSupplier$a;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireServiceCenterStatus;->getDisplayName()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method
