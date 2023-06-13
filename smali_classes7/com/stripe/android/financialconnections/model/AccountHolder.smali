.class public final Lcom/stripe/android/financialconnections/model/AccountHolder;
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
        Lcom/stripe/android/financialconnections/model/AccountHolder$Type;,
        Lcom/stripe/android/financialconnections/model/AccountHolder$$serializer;,
        Lcom/stripe/android/financialconnections/model/AccountHolder$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u0000 02\u00020\u00012\u00020\u0002:\u0003102B)\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008*\u0010+B?\u0008\u0017\u0012\u0006\u0010,\u001a\u00020\u0014\u0012\n\u0008\u0001\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010.\u001a\u0004\u0018\u00010-\u00a2\u0006\u0004\u0008*\u0010/J!\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u00c7\u0001J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J+\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u000f\u001a\u00020\n2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u000cH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0014H\u00d6\u0001J\u0019\u0010\u001e\u001a\u00020\u00082\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0014H\u00d6\u0001R \u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u001f\u0012\u0004\u0008\"\u0010#\u001a\u0004\u0008 \u0010!R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010$\u0012\u0004\u0008\'\u0010#\u001a\u0004\u0008%\u0010&R\"\u0010\u0011\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010$\u0012\u0004\u0008)\u0010#\u001a\u0004\u0008(\u0010&\u00a8\u00063"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/AccountHolder;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "Landroid/os/Parcelable;",
        "self",
        "LUt0;",
        "output",
        "LMs5;",
        "serialDesc",
        "",
        "write$Self",
        "Lcom/stripe/android/financialconnections/model/AccountHolder$Type;",
        "component1",
        "",
        "component2",
        "component3",
        "type",
        "account",
        "customer",
        "copy",
        "toString",
        "",
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
        "Lcom/stripe/android/financialconnections/model/AccountHolder$Type;",
        "getType",
        "()Lcom/stripe/android/financialconnections/model/AccountHolder$Type;",
        "getType$annotations",
        "()V",
        "Ljava/lang/String;",
        "getAccount",
        "()Ljava/lang/String;",
        "getAccount$annotations",
        "getCustomer",
        "getCustomer$annotations",
        "<init>",
        "(Lcom/stripe/android/financialconnections/model/AccountHolder$Type;Ljava/lang/String;Ljava/lang/String;)V",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(ILcom/stripe/android/financialconnections/model/AccountHolder$Type;Ljava/lang/String;Ljava/lang/String;Lbt5;)V",
        "Companion",
        "$serializer",
        "Type",
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
            "Lcom/stripe/android/financialconnections/model/AccountHolder;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/AccountHolder$Companion;


# instance fields
.field private final account:Ljava/lang/String;

.field private final customer:Ljava/lang/String;

.field private final type:Lcom/stripe/android/financialconnections/model/AccountHolder$Type;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/model/AccountHolder$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/AccountHolder$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/AccountHolder;->Companion:Lcom/stripe/android/financialconnections/model/AccountHolder$Companion;

    new-instance v0, Lcom/stripe/android/financialconnections/model/AccountHolder$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/AccountHolder$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/AccountHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/model/AccountHolder;-><init>(Lcom/stripe/android/financialconnections/model/AccountHolder$Type;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/financialconnections/model/AccountHolder$Type;Ljava/lang/String;Ljava/lang/String;Lbt5;)V
    .locals 1
    .param p2    # Lcom/stripe/android/financialconnections/model/AccountHolder$Type;
        .annotation runtime LVs5;
            value = "type"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "account"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "customer"
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

    and-int/lit8 p5, p1, 0x0

    if-eqz p5, :cond_0

    sget-object p5, Lcom/stripe/android/financialconnections/model/AccountHolder$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/AccountHolder$$serializer;

    invoke-virtual {p5}, Lcom/stripe/android/financialconnections/model/AccountHolder$$serializer;->getDescriptor()LMs5;

    move-result-object p5

    const/4 v0, 0x0

    invoke-static {p1, v0, p5}, LzW3;->b(IILMs5;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p5, p1, 0x1

    if-nez p5, :cond_1

    sget-object p2, Lcom/stripe/android/financialconnections/model/AccountHolder$Type;->UNKNOWN:Lcom/stripe/android/financialconnections/model/AccountHolder$Type;

    :cond_1
    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->type:Lcom/stripe/android/financialconnections/model/AccountHolder$Type;

    and-int/lit8 p2, p1, 0x2

    const/4 p5, 0x0

    if-nez p2, :cond_2

    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->account:Ljava/lang/String;

    goto :goto_0

    :cond_2
    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->account:Ljava/lang/String;

    :goto_0
    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_3

    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->customer:Ljava/lang/String;

    goto :goto_1

    :cond_3
    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->customer:Ljava/lang/String;

    :goto_1
    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/AccountHolder$Type;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->type:Lcom/stripe/android/financialconnections/model/AccountHolder$Type;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->account:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->customer:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/model/AccountHolder$Type;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Lcom/stripe/android/financialconnections/model/AccountHolder$Type;->UNKNOWN:Lcom/stripe/android/financialconnections/model/AccountHolder$Type;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/model/AccountHolder;-><init>(Lcom/stripe/android/financialconnections/model/AccountHolder$Type;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/AccountHolder;Lcom/stripe/android/financialconnections/model/AccountHolder$Type;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/AccountHolder;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->type:Lcom/stripe/android/financialconnections/model/AccountHolder$Type;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->account:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->customer:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/model/AccountHolder;->copy(Lcom/stripe/android/financialconnections/model/AccountHolder$Type;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/AccountHolder;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAccount$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "account"
    .end annotation

    return-void
.end method

.method public static synthetic getCustomer$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "customer"
    .end annotation

    return-void
.end method

.method public static synthetic getType$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "type"
    .end annotation

    return-void
.end method

.method public static final write$Self(Lcom/stripe/android/financialconnections/model/AccountHolder;LUt0;LMs5;)V
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
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->type:Lcom/stripe/android/financialconnections/model/AccountHolder$Type;

    sget-object v3, Lcom/stripe/android/financialconnections/model/AccountHolder$Type;->UNKNOWN:Lcom/stripe/android/financialconnections/model/AccountHolder$Type;

    if-eq v1, v3, :cond_1

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_1
    if-eqz v1, :cond_2

    sget-object v1, Lcom/stripe/android/financialconnections/model/AccountHolder$Type;->Companion:Lcom/stripe/android/financialconnections/model/AccountHolder$Type$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/AccountHolder$Type$Companion;->serializer()LKj2;

    move-result-object v1

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->type:Lcom/stripe/android/financialconnections/model/AccountHolder$Type;

    invoke-interface {p1, p2, v0, v1, v3}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p1, p2, v2}, LUt0;->s(LMs5;I)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_2
    move v1, v2

    goto :goto_3

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->account:Ljava/lang/String;

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    move v1, v0

    :goto_3
    if-eqz v1, :cond_5

    sget-object v1, LgS5;->a:LgS5;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->account:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_6

    :goto_4
    move v0, v2

    goto :goto_5

    :cond_6
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->customer:Ljava/lang/String;

    if-eqz v3, :cond_7

    goto :goto_4

    :cond_7
    :goto_5
    if-eqz v0, :cond_8

    sget-object v0, LgS5;->a:LgS5;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->customer:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, p0}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_8
    return-void
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/model/AccountHolder$Type;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->type:Lcom/stripe/android/financialconnections/model/AccountHolder$Type;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->account:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->customer:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/model/AccountHolder$Type;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/AccountHolder;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/AccountHolder;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/financialconnections/model/AccountHolder;-><init>(Lcom/stripe/android/financialconnections/model/AccountHolder$Type;Ljava/lang/String;Ljava/lang/String;)V

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/AccountHolder;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/AccountHolder;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->type:Lcom/stripe/android/financialconnections/model/AccountHolder$Type;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/AccountHolder;->type:Lcom/stripe/android/financialconnections/model/AccountHolder$Type;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->account:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/AccountHolder;->account:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->customer:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/AccountHolder;->customer:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAccount()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->account:Ljava/lang/String;

    return-object v0
.end method

.method public final getCustomer()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->customer:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Lcom/stripe/android/financialconnections/model/AccountHolder$Type;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->type:Lcom/stripe/android/financialconnections/model/AccountHolder$Type;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->type:Lcom/stripe/android/financialconnections/model/AccountHolder$Type;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->account:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->customer:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->type:Lcom/stripe/android/financialconnections/model/AccountHolder$Type;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->account:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->customer:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AccountHolder(type="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", account="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", customer="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->type:Lcom/stripe/android/financialconnections/model/AccountHolder$Type;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->account:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/AccountHolder;->customer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
