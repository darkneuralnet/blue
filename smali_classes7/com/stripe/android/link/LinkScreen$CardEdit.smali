.class public final Lcom/stripe/android/link/LinkScreen$CardEdit;
.super Lcom/stripe/android/link/LinkScreen;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/LinkScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CardEdit"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/LinkScreen$CardEdit$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\n\n\u0002\u0008\u0008\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkScreen$CardEdit;",
        "Lcom/stripe/android/link/LinkScreen;",
        "paymentDetailsId",
        "",
        "(Ljava/lang/String;)V",
        "route",
        "getRoute",
        "()Ljava/lang/String;",
        "route$1",
        "Companion",
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
.field public static final $stable:I = 0x0

.field public static final Companion:Lcom/stripe/android/link/LinkScreen$CardEdit$Companion;

.field public static final idArg:Ljava/lang/String; = "id"

.field public static final route:Ljava/lang/String; = "CardEdit?id={id}"


# instance fields
.field private final route$1:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/LinkScreen$CardEdit$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/LinkScreen$CardEdit$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/LinkScreen$CardEdit;->Companion:Lcom/stripe/android/link/LinkScreen$CardEdit$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const-string v0, "paymentDetailsId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/stripe/android/link/LinkScreenKt;->access$urlEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CardEdit?id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/link/LinkScreen;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-super {p0}, Lcom/stripe/android/link/LinkScreen;->getRoute()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkScreen$CardEdit;->route$1:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getRoute()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkScreen$CardEdit;->route$1:Ljava/lang/String;

    return-object v0
.end method
