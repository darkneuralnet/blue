.class public final Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements$$serializer;,
        Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u0000 .2\u00020\u0001:\u0002/.B1\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008(\u0010)BK\u0008\u0017\u0012\u0006\u0010*\u001a\u00020\u001b\u0012\u0010\u0008\u0001\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0010\u0008\u0001\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u0012\n\u0008\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010,\u001a\u0004\u0018\u00010+\u00a2\u0006\u0004\u0008(\u0010-J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c2\u0003\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u00c7\u0001J\u0012\u0010\u000f\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\u000cj\u0002`\rJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u00c6\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010H\u00c6\u0003J@\u0010\u0018\u001a\u00020\u00002\u0010\u0008\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0010\u0008\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00102\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\t\u0010\u001a\u001a\u00020\u000cH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001bH\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\u00022\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R(\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u001f\u0012\u0004\u0008\"\u0010#\u001a\u0004\u0008 \u0010!R(\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\u001f\u0012\u0004\u0008%\u0010#\u001a\u0004\u0008$\u0010!R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010&\u0012\u0004\u0008\'\u0010#\u00a8\u00060"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;",
        "",
        "",
        "component3",
        "()Ljava/lang/Boolean;",
        "self",
        "LUt0;",
        "output",
        "LMs5;",
        "serialDesc",
        "",
        "write$Self",
        "",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "code",
        "getConfirmPMFromCustomer",
        "",
        "Lcom/stripe/android/paymentsheet/forms/PIRequirement;",
        "component1",
        "Lcom/stripe/android/paymentsheet/forms/SIRequirement;",
        "component2",
        "piRequirements",
        "siRequirements",
        "confirmPMFromCustomer",
        "copy",
        "(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;",
        "toString",
        "",
        "hashCode",
        "other",
        "equals",
        "Ljava/util/Set;",
        "getPiRequirements",
        "()Ljava/util/Set;",
        "getPiRequirements$annotations",
        "()V",
        "getSiRequirements",
        "getSiRequirements$annotations",
        "Ljava/lang/Boolean;",
        "getConfirmPMFromCustomer$annotations",
        "<init>",
        "(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(ILjava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;Lbt5;)V",
        "Companion",
        "$serializer",
        "payments-ui-core_release"
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

.field public static final Companion:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements$Companion;


# instance fields
.field private final confirmPMFromCustomer:Ljava/lang/Boolean;

.field private final piRequirements:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/stripe/android/paymentsheet/forms/PIRequirement;",
            ">;"
        }
    .end annotation
.end field

.field private final siRequirements:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/stripe/android/paymentsheet/forms/SIRequirement;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->Companion:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;Lbt5;)V
    .locals 1
    .param p2    # Ljava/util/Set;
        .annotation runtime LVs5;
            value = "pi_requirements"
        .end annotation
    .end param
    .param p3    # Ljava/util/Set;
        .annotation runtime LVs5;
            value = "si_requirements"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Boolean;
        .annotation runtime LVs5;
            value = "confirm_pm_from_customer"
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

    and-int/lit8 p5, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p5, :cond_0

    sget-object p5, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements$$serializer;->INSTANCE:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements$$serializer;

    invoke-virtual {p5}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements$$serializer;->getDescriptor()LMs5;

    move-result-object p5

    invoke-static {p1, v0, p5}, LzW3;->b(IILMs5;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->piRequirements:Ljava/util/Set;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->siRequirements:Ljava/util/Set;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->confirmPMFromCustomer:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Lcom/stripe/android/paymentsheet/forms/PIRequirement;",
            ">;",
            "Ljava/util/Set<",
            "+",
            "Lcom/stripe/android/paymentsheet/forms/SIRequirement;",
            ">;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->piRequirements:Ljava/util/Set;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->siRequirements:Ljava/util/Set;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->confirmPMFromCustomer:Ljava/lang/Boolean;

    return-void
.end method

.method private final component3()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->confirmPMFromCustomer:Ljava/lang/Boolean;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->piRequirements:Ljava/util/Set;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->siRequirements:Ljava/util/Set;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->confirmPMFromCustomer:Ljava/lang/Boolean;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->copy(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic getConfirmPMFromCustomer$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "confirm_pm_from_customer"
    .end annotation

    return-void
.end method

.method public static synthetic getPiRequirements$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "pi_requirements"
    .end annotation

    return-void
.end method

.method public static synthetic getSiRequirements$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "si_requirements"
    .end annotation

    return-void
.end method

.method public static final write$Self(Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;LUt0;LMs5;)V
    .locals 5
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LSr2;

    new-instance v1, LQX3;

    const-class v2, Lcom/stripe/android/paymentsheet/forms/PIRequirement;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v1, v2, v4}, LQX3;-><init>(Lkotlin/reflect/KClass;[Ljava/lang/annotation/Annotation;)V

    invoke-direct {v0, v1}, LSr2;-><init>(LKj2;)V

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->piRequirements:Ljava/util/Set;

    invoke-interface {p1, p2, v3, v0, v1}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    new-instance v0, LSr2;

    new-instance v1, LQX3;

    const-class v2, Lcom/stripe/android/paymentsheet/forms/SIRequirement;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v1, v2, v3}, LQX3;-><init>(Lkotlin/reflect/KClass;[Ljava/lang/annotation/Annotation;)V

    invoke-direct {v0, v1}, LSr2;-><init>(LKj2;)V

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->siRequirements:Ljava/util/Set;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    sget-object v0, LYY;->a:LYY;

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->confirmPMFromCustomer:Ljava/lang/Boolean;

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1, v0, p0}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/stripe/android/paymentsheet/forms/PIRequirement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->piRequirements:Ljava/util/Set;

    return-object v0
.end method

.method public final component2()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/stripe/android/paymentsheet/forms/SIRequirement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->siRequirements:Ljava/util/Set;

    return-object v0
.end method

.method public final copy(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Lcom/stripe/android/paymentsheet/forms/PIRequirement;",
            ">;",
            "Ljava/util/Set<",
            "+",
            "Lcom/stripe/android/paymentsheet/forms/SIRequirement;",
            ">;",
            "Ljava/lang/Boolean;",
            ")",
            "Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->piRequirements:Ljava/util/Set;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->piRequirements:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->siRequirements:Ljava/util/Set;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->siRequirements:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->confirmPMFromCustomer:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->confirmPMFromCustomer:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getConfirmPMFromCustomer(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/model/PaymentMethod$Type;->Companion:Lcom/stripe/android/model/PaymentMethod$Type$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/model/PaymentMethod$Type$Companion;->fromCode(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Type;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->confirmPMFromCustomer:Ljava/lang/Boolean;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final getPiRequirements()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/stripe/android/paymentsheet/forms/PIRequirement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->piRequirements:Ljava/util/Set;

    return-object v0
.end method

.method public final getSiRequirements()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/stripe/android/paymentsheet/forms/SIRequirement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->siRequirements:Ljava/util/Set;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->piRequirements:Ljava/util/Set;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->siRequirements:Ljava/util/Set;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->confirmPMFromCustomer:Ljava/lang/Boolean;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->piRequirements:Ljava/util/Set;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->siRequirements:Ljava/util/Set;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->confirmPMFromCustomer:Ljava/lang/Boolean;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "PaymentMethodRequirements(piRequirements="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", siRequirements="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", confirmPMFromCustomer="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
