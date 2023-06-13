.class final Lco/bird/android/model/Banner$CONNECTIVITY;
.super Lco/bird/android/model/Banner;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/Banner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CONNECTIVITY"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u00c6\u0001\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0017J\r\u0010\u0004\u001a\u00020\u0003H\u0017\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\u0006\u001a\u00020\u0003H\u0017\u00a8\u0006\u0007"
    }
    d2 = {
        "Lco/bird/android/model/Banner$CONNECTIVITY;",
        "Lco/bird/android/model/Banner;",
        "backgroundColor",
        "",
        "icon",
        "()Ljava/lang/Integer;",
        "textColor",
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


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    sget v0, Lnl4;->banner_connectivity:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lco/bird/android/model/Banner;-><init>(Ljava/lang/String;ILjava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public backgroundColor()I
    .locals 1

    sget v0, LDf4;->warning:I

    return v0
.end method

.method public icon()Ljava/lang/Integer;
    .locals 1

    sget v0, Lrg4;->ic_warning:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public textColor()I
    .locals 1

    sget v0, LDf4;->black:I

    return v0
.end method
