.class public abstract Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ui/core/forms/resources/LpmRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ServerSpecState"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$Uninitialized;,
        Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$NoServerSpec;,
        Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$ServerParsed;,
        Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$ServerNotParsed;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0004\u0007\u0008\t\nB\u0011\u0008\u0004\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0004\u000b\u000c\r\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;",
        "",
        "serverLpmSpecs",
        "",
        "(Ljava/lang/String;)V",
        "getServerLpmSpecs",
        "()Ljava/lang/String;",
        "NoServerSpec",
        "ServerNotParsed",
        "ServerParsed",
        "Uninitialized",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$NoServerSpec;",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$ServerNotParsed;",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$ServerParsed;",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$Uninitialized;",
        "payments-ui-core_release"
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
.field private final serverLpmSpecs:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;->serverLpmSpecs:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getServerLpmSpecs()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;->serverLpmSpecs:Ljava/lang/String;

    return-object v0
.end method
