.class public final Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/PaymentAuthConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Stripe3ds2ToolbarCustomization"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008\u0008J\u0013\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;",
        "",
        "toolbarCustomization",
        "Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;",
        "(Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;)V",
        "getToolbarCustomization$payments_core_release",
        "()Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;",
        "component1",
        "component1$payments_core_release",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "Builder",
        "payments-core_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;)V
    .locals 1

    const-string v0, "toolbarCustomization"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;ILjava/lang/Object;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;->copy(Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1$payments_core_release()Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;
    .locals 1

    const-string v0, "toolbarCustomization"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;

    invoke-direct {v0, p1}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;-><init>(Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;

    iget-object v1, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    iget-object p1, p1, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getToolbarCustomization$payments_core_release()Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;->toolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Stripe3ds2ToolbarCustomization(toolbarCustomization="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
