.class public abstract Lco/bird/android/model/DrawableFlightSheetButton;
.super Lco/bird/android/model/FlightSheetButton;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0006R\u0014\u0010\t\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u0006R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\u0006\u0082\u0001\u0001\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lco/bird/android/model/DrawableFlightSheetButton;",
        "Lco/bird/android/model/FlightSheetButton;",
        "()V",
        "drawableBottom",
        "Landroid/graphics/drawable/Drawable;",
        "getDrawableBottom",
        "()Landroid/graphics/drawable/Drawable;",
        "drawableEnd",
        "getDrawableEnd",
        "drawableStart",
        "getDrawableStart",
        "drawableTop",
        "getDrawableTop",
        "Lco/bird/android/model/RideHistoryButton;",
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
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lco/bird/android/model/FlightSheetButton;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/model/DrawableFlightSheetButton;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getDrawableBottom()Landroid/graphics/drawable/Drawable;
.end method

.method public abstract getDrawableEnd()Landroid/graphics/drawable/Drawable;
.end method

.method public abstract getDrawableStart()Landroid/graphics/drawable/Drawable;
.end method

.method public abstract getDrawableTop()Landroid/graphics/drawable/Drawable;
.end method
