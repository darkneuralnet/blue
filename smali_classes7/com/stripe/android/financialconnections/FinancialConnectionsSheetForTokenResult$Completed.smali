.class public final Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;
.super Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Completed"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;",
        "financialConnectionsSession",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
        "token",
        "Lcom/stripe/android/model/Token;",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lcom/stripe/android/model/Token;)V",
        "getFinancialConnectionsSession",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
        "getToken",
        "()Lcom/stripe/android/model/Token;",
        "component1",
        "component2",
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
.field public static final $stable:I = 0x8

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final financialConnectionsSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

.field private final token:Lcom/stripe/android/model/Token;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lcom/stripe/android/model/Token;)V
    .locals 1

    const-string v0, "financialConnectionsSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "token"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;->financialConnectionsSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;->token:Lcom/stripe/android/model/Token;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lcom/stripe/android/model/Token;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;->financialConnectionsSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;->token:Lcom/stripe/android/model/Token;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;->copy(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lcom/stripe/android/model/Token;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;->financialConnectionsSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/model/Token;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;->token:Lcom/stripe/android/model/Token;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lcom/stripe/android/model/Token;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;
    .locals 1

    const-string v0, "financialConnectionsSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "token"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lcom/stripe/android/model/Token;)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;->financialConnectionsSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;->financialConnectionsSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;->token:Lcom/stripe/android/model/Token;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;->token:Lcom/stripe/android/model/Token;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getFinancialConnectionsSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;->financialConnectionsSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    return-object v0
.end method

.method public final getToken()Lcom/stripe/android/model/Token;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;->token:Lcom/stripe/android/model/Token;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;->financialConnectionsSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;->token:Lcom/stripe/android/model/Token;

    invoke-virtual {v1}, Lcom/stripe/android/model/Token;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;->financialConnectionsSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;->token:Lcom/stripe/android/model/Token;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Completed(financialConnectionsSession="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", token="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;->financialConnectionsSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;->token:Lcom/stripe/android/model/Token;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
