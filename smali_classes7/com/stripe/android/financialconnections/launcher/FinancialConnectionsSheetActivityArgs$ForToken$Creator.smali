.class public final Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;
    .locals 2

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;

    sget-object v1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;
    .locals 0

    new-array p1, p1, [Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken$Creator;->newArray(I)[Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;

    move-result-object p1

    return-object p1
.end method
