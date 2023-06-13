.class public final LaI3$a$c;
.super Ld36;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LaI3$a;->bind(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "aI3$a$c",
        "Ld36;",
        "Landroid/text/Editable;",
        "s",
        "",
        "afterTextChanged",
        "co.bird.android.feature.operator-inventory"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:LaI3;

.field public final synthetic c:LaI3$a;

.field public final synthetic d:Lco/bird/android/model/wire/WireInventoryPart;


# direct methods
.method public constructor <init>(LaI3;LaI3$a;Lco/bird/android/model/wire/WireInventoryPart;)V
    .locals 0

    iput-object p1, p0, LaI3$a$c;->b:LaI3;

    iput-object p2, p0, LaI3$a$c;->c:LaI3$a;

    iput-object p3, p0, LaI3$a$c;->d:Lco/bird/android/model/wire/WireInventoryPart;

    invoke-direct {p0}, Ld36;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iget-object v0, p0, LaI3$a$c;->b:LaI3;

    invoke-static {v0}, LaI3;->access$getPartCountSubject$p(LaI3;)Lio/reactivex/subjects/d;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, LaI3$a$c;->c:LaI3$a;

    iget-object v1, p0, LaI3$a$c;->d:Lco/bird/android/model/wire/WireInventoryPart;

    invoke-virtual {v1, p1}, Lco/bird/android/model/wire/WireInventoryPart;->healthyLevel(I)Lco/bird/android/model/constant/HealthStatus;

    move-result-object p1

    invoke-virtual {v0, p1}, LaI3$a;->b(Lco/bird/android/model/constant/HealthStatus;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
