.class public final Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;
.super Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ForData"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;",
        "configuration",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
        "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V",
        "getConfiguration",
        "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
        "component1",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "financial-connections_release"
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

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;->getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;->copy(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;->getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    move-result-object v0

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;->getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;->getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;->getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;->getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ForData(configuration="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
