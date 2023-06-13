.class public abstract Lcom/stripe/android/view/AuthActivityStarterHost;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/AuthActivityStarterHost$Companion;,
        Lcom/stripe/android/view/AuthActivityStarterHost$ActivityHost;,
        Lcom/stripe/android/view/AuthActivityStarterHost$FragmentHost;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00132\u00020\u0001:\u0003\u0014\u0013\u0015B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J$\u0010\t\u001a\u00020\u00082\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&R\u0016\u0010\u000c\u001a\u0004\u0018\u00010\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u0082\u0001\u0002\u0016\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/view/AuthActivityStarterHost;",
        "",
        "Ljava/lang/Class;",
        "target",
        "Landroid/os/Bundle;",
        "extras",
        "",
        "requestCode",
        "",
        "startActivityForResult",
        "getStatusBarColor",
        "()Ljava/lang/Integer;",
        "statusBarColor",
        "LLifecycleOwner;",
        "getLifecycleOwner",
        "()LLifecycleOwner;",
        "lifecycleOwner",
        "<init>",
        "()V",
        "Companion",
        "ActivityHost",
        "FragmentHost",
        "Lcom/stripe/android/view/AuthActivityStarterHost$ActivityHost;",
        "Lcom/stripe/android/view/AuthActivityStarterHost$FragmentHost;",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/view/AuthActivityStarterHost$Companion;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/view/AuthActivityStarterHost$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/view/AuthActivityStarterHost$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/view/AuthActivityStarterHost;->Companion:Lcom/stripe/android/view/AuthActivityStarterHost$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/AuthActivityStarterHost;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getLifecycleOwner()LLifecycleOwner;
.end method

.method public abstract getStatusBarColor()Ljava/lang/Integer;
.end method

.method public abstract startActivityForResult(Ljava/lang/Class;Landroid/os/Bundle;I)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Landroid/os/Bundle;",
            "I)V"
        }
    .end annotation
.end method
