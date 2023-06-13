.class public abstract Lcom/stripe/android/link/ui/LinkLogoutMenuItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/link/ui/menus/LinkMenuItem;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/ui/LinkLogoutMenuItem$Logout;,
        Lcom/stripe/android/link/ui/LinkLogoutMenuItem$Cancel;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0019\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\t\u0082\u0001\u0002\u000c\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/LinkLogoutMenuItem;",
        "Lcom/stripe/android/link/ui/menus/LinkMenuItem;",
        "textResId",
        "",
        "isDestructive",
        "",
        "(IZ)V",
        "()Z",
        "getTextResId",
        "()I",
        "Cancel",
        "Logout",
        "Lcom/stripe/android/link/ui/LinkLogoutMenuItem$Cancel;",
        "Lcom/stripe/android/link/ui/LinkLogoutMenuItem$Logout;",
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


# instance fields
.field private final isDestructive:Z

.field private final textResId:I


# direct methods
.method private constructor <init>(IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/link/ui/LinkLogoutMenuItem;->textResId:I

    iput-boolean p2, p0, Lcom/stripe/android/link/ui/LinkLogoutMenuItem;->isDestructive:Z

    return-void
.end method

.method public synthetic constructor <init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/LinkLogoutMenuItem;-><init>(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/ui/LinkLogoutMenuItem;-><init>(IZ)V

    return-void
.end method


# virtual methods
.method public getTextResId()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/link/ui/LinkLogoutMenuItem;->textResId:I

    return v0
.end method

.method public isDestructive()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/LinkLogoutMenuItem;->isDestructive:Z

    return v0
.end method
