.class public final Lcom/stripe/android/financialconnections/model/BalanceRefresh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/core/model/StripeModel;
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;,
        Lcom/stripe/android/financialconnections/model/BalanceRefresh$$serializer;,
        Lcom/stripe/android/financialconnections/model/BalanceRefresh$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0003-.,B\u001b\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008&\u0010\'B1\u0008\u0017\u0012\u0006\u0010(\u001a\u00020\u000c\u0012\n\u0008\u0001\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u000c\u0012\u0008\u0010*\u001a\u0004\u0018\u00010)\u00a2\u0006\u0004\u0008&\u0010+J!\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u00c7\u0001J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010\r\u001a\u00020\u000cH\u00c6\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000cH\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u000cH\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u000cH\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u00082\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000cH\u00d6\u0001R\"\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u001d\u0012\u0004\u0008 \u0010!\u001a\u0004\u0008\u001e\u0010\u001fR \u0010\u000f\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\"\u0012\u0004\u0008%\u0010!\u001a\u0004\u0008#\u0010$\u00a8\u0006/"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/BalanceRefresh;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "Landroid/os/Parcelable;",
        "self",
        "LUt0;",
        "output",
        "LMs5;",
        "serialDesc",
        "",
        "write$Self",
        "Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;",
        "component1",
        "",
        "component2",
        "status",
        "lastAttemptedAt",
        "copy",
        "",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "describeContents",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "writeToParcel",
        "Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;",
        "getStatus",
        "()Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;",
        "getStatus$annotations",
        "()V",
        "I",
        "getLastAttemptedAt",
        "()I",
        "getLastAttemptedAt$annotations",
        "<init>",
        "(Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;I)V",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(ILcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;ILbt5;)V",
        "Companion",
        "$serializer",
        "BalanceRefreshStatus",
        "financial-connections_release"
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

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/financialconnections/model/BalanceRefresh;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/BalanceRefresh$Companion;


# instance fields
.field private final lastAttemptedAt:I

.field private final status:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/BalanceRefresh$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->Companion:Lcom/stripe/android/financialconnections/model/BalanceRefresh$Companion;

    new-instance v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/BalanceRefresh$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;ILbt5;)V
    .locals 1
    .param p2    # Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;
        .annotation runtime LVs5;
            value = "status"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime LVs5;
            value = "last_attempted_at"
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "This synthesized declaration should not be used directly"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = ""
            imports = {}
        .end subannotation
    .end annotation

    and-int/lit8 p4, p1, 0x2

    const/4 v0, 0x2

    if-eq v0, p4, :cond_0

    sget-object p4, Lcom/stripe/android/financialconnections/model/BalanceRefresh$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/BalanceRefresh$$serializer;

    invoke-virtual {p4}, Lcom/stripe/android/financialconnections/model/BalanceRefresh$$serializer;->getDescriptor()LMs5;

    move-result-object p4

    invoke-static {p1, v0, p4}, LzW3;->b(IILMs5;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p1, p1, 0x1

    if-nez p1, :cond_1

    sget-object p1, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->UNKNOWN:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->status:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->status:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    :goto_0
    iput p3, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->lastAttemptedAt:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->status:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    iput p2, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->lastAttemptedAt:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    sget-object p1, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->UNKNOWN:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/model/BalanceRefresh;-><init>(Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;I)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/BalanceRefresh;Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;IILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/BalanceRefresh;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->status:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->lastAttemptedAt:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->copy(Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;I)Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getLastAttemptedAt$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "last_attempted_at"
    .end annotation

    return-void
.end method

.method public static synthetic getStatus$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "status"
    .end annotation

    return-void
.end method

.method public static final write$Self(Lcom/stripe/android/financialconnections/model/BalanceRefresh;LUt0;LMs5;)V
    .locals 4
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->status:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    sget-object v3, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->UNKNOWN:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    if-eq v1, v3, :cond_1

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_1
    if-eqz v1, :cond_2

    sget-object v1, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->Companion:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus$Companion;->serializer()LKj2;

    move-result-object v1

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->status:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    invoke-interface {p1, p2, v0, v1, v3}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_2
    iget p0, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->lastAttemptedAt:I

    invoke-interface {p1, p2, v2, p0}, LUt0;->e(LMs5;II)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->status:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->lastAttemptedAt:I

    return v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;I)Lcom/stripe/android/financialconnections/model/BalanceRefresh;
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/BalanceRefresh;-><init>(Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;I)V

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->status:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->status:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->lastAttemptedAt:I

    iget p1, p1, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->lastAttemptedAt:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getLastAttemptedAt()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->lastAttemptedAt:I

    return v0
.end method

.method public final getStatus()Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->status:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->status:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->lastAttemptedAt:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->status:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    iget v1, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->lastAttemptedAt:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BalanceRefresh(status="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", lastAttemptedAt="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->status:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_0
    iget p2, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->lastAttemptedAt:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
