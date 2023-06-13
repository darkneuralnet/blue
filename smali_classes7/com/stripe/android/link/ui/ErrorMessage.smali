.class public abstract Lcom/stripe/android/link/ui/ErrorMessage;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/ui/ErrorMessage$FromResources;,
        Lcom/stripe/android/link/ui/ErrorMessage$Raw;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u00002\u00020\u0001:\u0002\u0007\u0008B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/ErrorMessage;",
        "Landroid/os/Parcelable;",
        "()V",
        "getMessage",
        "",
        "resources",
        "Landroid/content/res/Resources;",
        "FromResources",
        "Raw",
        "Lcom/stripe/android/link/ui/ErrorMessage$FromResources;",
        "Lcom/stripe/android/link/ui/ErrorMessage$Raw;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/link/ui/ErrorMessage;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getMessage(Landroid/content/res/Resources;)Ljava/lang/String;
.end method
