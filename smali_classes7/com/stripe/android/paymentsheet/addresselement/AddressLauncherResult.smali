.class public abstract Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;,
        Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Canceled;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0002\u0007\u0008B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;",
        "Landroid/os/Parcelable;",
        "()V",
        "resultCode",
        "",
        "getResultCode$paymentsheet_release",
        "()I",
        "Canceled",
        "Succeeded",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Canceled;",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getResultCode$paymentsheet_release()I
.end method