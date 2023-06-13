.class public abstract Lcom/stripe/android/link/LinkActivityResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/LinkActivityResult$Completed;,
        Lcom/stripe/android/link/LinkActivityResult$Canceled;,
        Lcom/stripe/android/link/LinkActivityResult$Failed;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0003\u0007\u0008\tB\u000f\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkActivityResult;",
        "Landroid/os/Parcelable;",
        "resultCode",
        "",
        "(I)V",
        "getResultCode",
        "()I",
        "Canceled",
        "Completed",
        "Failed",
        "Lcom/stripe/android/link/LinkActivityResult$Canceled;",
        "Lcom/stripe/android/link/LinkActivityResult$Completed;",
        "Lcom/stripe/android/link/LinkActivityResult$Failed;",
        "link_release"
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


# instance fields
.field private final resultCode:I


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/link/LinkActivityResult;->resultCode:I

    return-void
.end method

.method public synthetic constructor <init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkActivityResult;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final getResultCode()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/link/LinkActivityResult;->resultCode:I

    return v0
.end method
