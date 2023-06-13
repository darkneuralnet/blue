.class final Lco/bird/android/model/PlanItemDescription$BEST_VALUE;
.super Lco/bird/android/model/PlanItemDescription;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/PlanItemDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BEST_VALUE"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u00c6\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lco/bird/android/model/PlanItemDescription$BEST_VALUE;",
        "Lco/bird/android/model/PlanItemDescription;",
        "text",
        "",
        "getText",
        "()I",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final text:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lco/bird/android/model/PlanItemDescription;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget p1, Lnl4;->autopay_v2_plan_best_value:I

    iput p1, p0, Lco/bird/android/model/PlanItemDescription$BEST_VALUE;->text:I

    return-void
.end method


# virtual methods
.method public getText()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/PlanItemDescription$BEST_VALUE;->text:I

    return v0
.end method
