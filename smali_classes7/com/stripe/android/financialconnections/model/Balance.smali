.class public final Lcom/stripe/android/financialconnections/model/Balance;
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
        Lcom/stripe/android/financialconnections/model/Balance$Type;,
        Lcom/stripe/android/financialconnections/model/Balance$$serializer;,
        Lcom/stripe/android/financialconnections/model/Balance$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0003BACBE\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u000c\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u000f\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008;\u0010<Ba\u0008\u0017\u0012\u0006\u0010=\u001a\u00020\n\u0012\u0008\u0008\u0001\u0010\u0015\u001a\u00020\n\u0012\u0016\u0008\u0001\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\u000c\u0012\n\u0008\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010?\u001a\u0004\u0018\u00010>\u00a2\u0006\u0004\u0008;\u0010@J!\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u00c7\u0001J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u000cH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000fH\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003JK\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0015\u001a\u00020\n2\u0014\u0008\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u000c2\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001J\t\u0010\u001b\u001a\u00020\rH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\nH\u00d6\u0001J\u0013\u0010 \u001a\u00020\u001f2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010!\u001a\u00020\nH\u00d6\u0001J\u0019\u0010%\u001a\u00020\u00082\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\nH\u00d6\u0001R \u0010\u0015\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010&\u0012\u0004\u0008)\u0010*\u001a\u0004\u0008\'\u0010(R,\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010+\u0012\u0004\u0008.\u0010*\u001a\u0004\u0008,\u0010-R \u0010\u0017\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010/\u0012\u0004\u00082\u0010*\u001a\u0004\u00080\u00101R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0018\u00103\u0012\u0004\u00086\u0010*\u001a\u0004\u00084\u00105R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0019\u00107\u0012\u0004\u0008:\u0010*\u001a\u0004\u00088\u00109\u00a8\u0006D"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/Balance;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "Landroid/os/Parcelable;",
        "self",
        "LUt0;",
        "output",
        "LMs5;",
        "serialDesc",
        "",
        "write$Self",
        "",
        "component1",
        "",
        "",
        "component2",
        "Lcom/stripe/android/financialconnections/model/Balance$Type;",
        "component3",
        "Lcom/stripe/android/financialconnections/model/CashBalance;",
        "component4",
        "Lcom/stripe/android/financialconnections/model/CreditBalance;",
        "component5",
        "asOf",
        "current",
        "type",
        "cash",
        "credit",
        "copy",
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
        "I",
        "getAsOf",
        "()I",
        "getAsOf$annotations",
        "()V",
        "Ljava/util/Map;",
        "getCurrent",
        "()Ljava/util/Map;",
        "getCurrent$annotations",
        "Lcom/stripe/android/financialconnections/model/Balance$Type;",
        "getType",
        "()Lcom/stripe/android/financialconnections/model/Balance$Type;",
        "getType$annotations",
        "Lcom/stripe/android/financialconnections/model/CashBalance;",
        "getCash",
        "()Lcom/stripe/android/financialconnections/model/CashBalance;",
        "getCash$annotations",
        "Lcom/stripe/android/financialconnections/model/CreditBalance;",
        "getCredit",
        "()Lcom/stripe/android/financialconnections/model/CreditBalance;",
        "getCredit$annotations",
        "<init>",
        "(ILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;)V",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(IILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;Lbt5;)V",
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
            "Lcom/stripe/android/financialconnections/model/Balance;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/Balance$Companion;


# instance fields
.field private final asOf:I

.field private final cash:Lcom/stripe/android/financialconnections/model/CashBalance;

.field private final credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

.field private final current:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final type:Lcom/stripe/android/financialconnections/model/Balance$Type;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/model/Balance$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/Balance$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/Balance;->Companion:Lcom/stripe/android/financialconnections/model/Balance$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/model/Balance;->$stable:I

    new-instance v0, Lcom/stripe/android/financialconnections/model/Balance$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/Balance$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/Balance;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;Lbt5;)V
    .locals 1
    .param p2    # I
        .annotation runtime LVs5;
            value = "as_of"
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation runtime LVs5;
            value = "current"
        .end annotation
    .end param
    .param p4    # Lcom/stripe/android/financialconnections/model/Balance$Type;
        .annotation runtime LVs5;
            value = "type"
        .end annotation
    .end param
    .param p5    # Lcom/stripe/android/financialconnections/model/CashBalance;
        .annotation runtime LVs5;
            value = "cash"
        .end annotation
    .end param
    .param p6    # Lcom/stripe/android/financialconnections/model/CreditBalance;
        .annotation runtime LVs5;
            value = "credit"
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

    and-int/lit8 p7, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p7, :cond_0

    sget-object p7, Lcom/stripe/android/financialconnections/model/Balance$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/Balance$$serializer;

    invoke-virtual {p7}, Lcom/stripe/android/financialconnections/model/Balance$$serializer;->getDescriptor()LMs5;

    move-result-object p7

    invoke-static {p1, v0, p7}, LzW3;->b(IILMs5;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/stripe/android/financialconnections/model/Balance;->asOf:I

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/Balance;->current:Ljava/util/Map;

    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_1

    sget-object p2, Lcom/stripe/android/financialconnections/model/Balance$Type;->UNKNOWN:Lcom/stripe/android/financialconnections/model/Balance$Type;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    :goto_0
    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    :goto_1
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    :goto_2
    return-void
.end method

.method public constructor <init>(ILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/Balance$Type;",
            "Lcom/stripe/android/financialconnections/model/CashBalance;",
            "Lcom/stripe/android/financialconnections/model/CreditBalance;",
            ")V"
        }
    .end annotation

    const-string v0, "current"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/financialconnections/model/Balance;->asOf:I

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/Balance;->current:Ljava/util/Map;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    sget-object p3, Lcom/stripe/android/financialconnections/model/Balance$Type;->UNKNOWN:Lcom/stripe/android/financialconnections/model/Balance$Type;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    const/4 p7, 0x0

    if-eqz p3, :cond_1

    move-object v4, p7

    goto :goto_0

    :cond_1
    move-object v4, p4

    :goto_0
    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    move-object v5, p7

    goto :goto_1

    :cond_2
    move-object v5, p5

    :goto_1
    move-object v0, p0

    move v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/model/Balance;-><init>(ILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/Balance;ILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/Balance;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/stripe/android/financialconnections/model/Balance;->asOf:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/Balance;->current:Ljava/util/Map;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lcom/stripe/android/financialconnections/model/Balance;->copy(ILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;)Lcom/stripe/android/financialconnections/model/Balance;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAsOf$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "as_of"
    .end annotation

    return-void
.end method

.method public static synthetic getCash$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "cash"
    .end annotation

    return-void
.end method

.method public static synthetic getCredit$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "credit"
    .end annotation

    return-void
.end method

.method public static synthetic getCurrent$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "current"
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

.method public static final write$Self(Lcom/stripe/android/financialconnections/model/Balance;LUt0;LMs5;)V
    .locals 5
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->asOf:I

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0}, LUt0;->e(LMs5;II)V

    new-instance v0, LQr2;

    sget-object v2, LgS5;->a:LgS5;

    sget-object v3, LF52;->a:LF52;

    invoke-direct {v0, v2, v3}, LQr2;-><init>(LKj2;LKj2;)V

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/Balance;->current:Ljava/util/Map;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v0, v2}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    move v2, v3

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    sget-object v4, Lcom/stripe/android/financialconnections/model/Balance$Type;->UNKNOWN:Lcom/stripe/android/financialconnections/model/Balance$Type;

    if-eq v2, v4, :cond_1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_1
    if-eqz v2, :cond_2

    sget-object v2, Lcom/stripe/android/financialconnections/model/Balance$Type;->Companion:Lcom/stripe/android/financialconnections/model/Balance$Type$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/Balance$Type$Companion;->serializer()LKj2;

    move-result-object v2

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    invoke-interface {p1, p2, v0, v2, v4}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_2
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_3

    :goto_2
    move v2, v3

    goto :goto_3

    :cond_3
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    move v2, v1

    :goto_3
    if-eqz v2, :cond_5

    sget-object v2, Lcom/stripe/android/financialconnections/model/CashBalance$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/CashBalance$$serializer;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    invoke-interface {p1, p2, v0, v2, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_6

    :goto_4
    move v1, v3

    goto :goto_5

    :cond_6
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    if-eqz v2, :cond_7

    goto :goto_4

    :cond_7
    :goto_5
    if-eqz v1, :cond_8

    sget-object v1, Lcom/stripe/android/financialconnections/model/CreditBalance$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/CreditBalance$$serializer;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    invoke-interface {p1, p2, v0, v1, p0}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_8
    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->asOf:I

    return v0
.end method

.method public final component2()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->current:Ljava/util/Map;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/financialconnections/model/Balance$Type;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/financialconnections/model/CashBalance;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/financialconnections/model/CreditBalance;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    return-object v0
.end method

.method public final copy(ILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;)Lcom/stripe/android/financialconnections/model/Balance;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/Balance$Type;",
            "Lcom/stripe/android/financialconnections/model/CashBalance;",
            "Lcom/stripe/android/financialconnections/model/CreditBalance;",
            ")",
            "Lcom/stripe/android/financialconnections/model/Balance;"
        }
    .end annotation

    const-string v0, "current"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/Balance;

    move-object v1, v0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/financialconnections/model/Balance;-><init>(ILjava/util/Map;Lcom/stripe/android/financialconnections/model/Balance$Type;Lcom/stripe/android/financialconnections/model/CashBalance;Lcom/stripe/android/financialconnections/model/CreditBalance;)V

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/Balance;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/Balance;

    iget v1, p0, Lcom/stripe/android/financialconnections/model/Balance;->asOf:I

    iget v3, p1, Lcom/stripe/android/financialconnections/model/Balance;->asOf:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/Balance;->current:Ljava/util/Map;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/Balance;->current:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAsOf()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->asOf:I

    return v0
.end method

.method public final getCash()Lcom/stripe/android/financialconnections/model/CashBalance;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    return-object v0
.end method

.method public final getCredit()Lcom/stripe/android/financialconnections/model/CreditBalance;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    return-object v0
.end method

.method public final getCurrent()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->current:Ljava/util/Map;

    return-object v0
.end method

.method public final getType()Lcom/stripe/android/financialconnections/model/Balance$Type;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->asOf:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/Balance;->current:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/CashBalance;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/CreditBalance;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->asOf:I

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/Balance;->current:Ljava/util/Map;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Balance(asOf="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", current="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cash="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", credit="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->asOf:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->current:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->type:Lcom/stripe/android/financialconnections/model/Balance$Type;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->cash:Lcom/stripe/android/financialconnections/model/CashBalance;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/CashBalance;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/Balance;->credit:Lcom/stripe/android/financialconnections/model/CreditBalance;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/CreditBalance;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    return-void
.end method
