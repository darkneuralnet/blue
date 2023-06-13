.class public final Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ui/core/forms/resources/LpmRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LpmRepositoryArguments"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0005H\u00c6\u0003J\u001f\u0010\u000c\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;",
        "",
        "resources",
        "Landroid/content/res/Resources;",
        "isFinancialConnectionsAvailable",
        "Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;",
        "(Landroid/content/res/Resources;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;)V",
        "()Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;",
        "getResources",
        "()Landroid/content/res/Resources;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final isFinancialConnectionsAvailable:Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;

.field private final resources:Landroid/content/res/Resources;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/res/Resources;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;)V
    .locals 1

    const-string v0, "isFinancialConnectionsAvailable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;->resources:Landroid/content/res/Resources;

    iput-object p2, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;->isFinancialConnectionsAvailable:Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/res/Resources;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Lcom/stripe/android/payments/financialconnections/DefaultIsFinancialConnectionsAvailable;

    invoke-direct {p2}, Lcom/stripe/android/payments/financialconnections/DefaultIsFinancialConnectionsAvailable;-><init>()V

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;-><init>(Landroid/content/res/Resources;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;Landroid/content/res/Resources;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;ILjava/lang/Object;)Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;->resources:Landroid/content/res/Resources;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;->isFinancialConnectionsAvailable:Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;->copy(Landroid/content/res/Resources;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;)Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Landroid/content/res/Resources;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;->resources:Landroid/content/res/Resources;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;->isFinancialConnectionsAvailable:Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;

    return-object v0
.end method

.method public final copy(Landroid/content/res/Resources;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;)Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;
    .locals 1

    const-string v0, "isFinancialConnectionsAvailable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;-><init>(Landroid/content/res/Resources;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;

    iget-object v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;->resources:Landroid/content/res/Resources;

    iget-object v3, p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;->resources:Landroid/content/res/Resources;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;->isFinancialConnectionsAvailable:Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;

    iget-object p1, p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;->isFinancialConnectionsAvailable:Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;->resources:Landroid/content/res/Resources;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;->resources:Landroid/content/res/Resources;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;->isFinancialConnectionsAvailable:Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isFinancialConnectionsAvailable()Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;->isFinancialConnectionsAvailable:Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;->resources:Landroid/content/res/Resources;

    iget-object v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;->isFinancialConnectionsAvailable:Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "LpmRepositoryArguments(resources="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isFinancialConnectionsAvailable="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
