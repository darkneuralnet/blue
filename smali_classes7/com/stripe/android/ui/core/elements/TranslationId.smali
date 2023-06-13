.class public final enum Lcom/stripe/android/ui/core/elements/TranslationId;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/elements/TranslationId$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/ui/core/elements/TranslationId;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\n\u0008\u0087\u0001\u0018\u0000 \u000c2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000cB\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/TranslationId;",
        "",
        "resourceId",
        "",
        "(Ljava/lang/String;II)V",
        "getResourceId",
        "()I",
        "IdealBank",
        "P24Bank",
        "EpsBank",
        "AddressName",
        "AuBecsAccountName",
        "Companion",
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
.field private static final synthetic $VALUES:[Lcom/stripe/android/ui/core/elements/TranslationId;

.field private static final $cachedSerializer$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "LKj2<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final enum AddressName:Lcom/stripe/android/ui/core/elements/TranslationId;
    .annotation runtime LVs5;
        value = "address.label.name"
    .end annotation
.end field

.field public static final enum AuBecsAccountName:Lcom/stripe/android/ui/core/elements/TranslationId;
    .annotation runtime LVs5;
        value = "upe.labels.name.onAccount"
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/ui/core/elements/TranslationId$Companion;

.field public static final enum EpsBank:Lcom/stripe/android/ui/core/elements/TranslationId;
    .annotation runtime LVs5;
        value = "upe.labels.eps.bank"
    .end annotation
.end field

.field public static final enum IdealBank:Lcom/stripe/android/ui/core/elements/TranslationId;
    .annotation runtime LVs5;
        value = "upe.labels.ideal.bank"
    .end annotation
.end field

.field public static final enum P24Bank:Lcom/stripe/android/ui/core/elements/TranslationId;
    .annotation runtime LVs5;
        value = "upe.labels.p24.bank"
    .end annotation
.end field


# instance fields
.field private final resourceId:I


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/ui/core/elements/TranslationId;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/stripe/android/ui/core/elements/TranslationId;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/ui/core/elements/TranslationId;->IdealBank:Lcom/stripe/android/ui/core/elements/TranslationId;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/ui/core/elements/TranslationId;->P24Bank:Lcom/stripe/android/ui/core/elements/TranslationId;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/ui/core/elements/TranslationId;->EpsBank:Lcom/stripe/android/ui/core/elements/TranslationId;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/stripe/android/ui/core/elements/TranslationId;->AddressName:Lcom/stripe/android/ui/core/elements/TranslationId;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/stripe/android/ui/core/elements/TranslationId;->AuBecsAccountName:Lcom/stripe/android/ui/core/elements/TranslationId;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/ui/core/elements/TranslationId;

    const/4 v1, 0x0

    sget v2, Lcom/stripe/android/ui/core/R$string;->ideal_bank:I

    const-string v3, "IdealBank"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/TranslationId;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->IdealBank:Lcom/stripe/android/ui/core/elements/TranslationId;

    new-instance v0, Lcom/stripe/android/ui/core/elements/TranslationId;

    const/4 v1, 0x1

    sget v2, Lcom/stripe/android/ui/core/R$string;->p24_bank:I

    const-string v3, "P24Bank"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/TranslationId;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->P24Bank:Lcom/stripe/android/ui/core/elements/TranslationId;

    new-instance v0, Lcom/stripe/android/ui/core/elements/TranslationId;

    const/4 v1, 0x2

    sget v2, Lcom/stripe/android/ui/core/R$string;->eps_bank:I

    const-string v3, "EpsBank"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/TranslationId;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->EpsBank:Lcom/stripe/android/ui/core/elements/TranslationId;

    new-instance v0, Lcom/stripe/android/ui/core/elements/TranslationId;

    const/4 v1, 0x3

    sget v2, Lcom/stripe/android/ui/core/R$string;->address_label_full_name:I

    const-string v3, "AddressName"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/TranslationId;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->AddressName:Lcom/stripe/android/ui/core/elements/TranslationId;

    new-instance v0, Lcom/stripe/android/ui/core/elements/TranslationId;

    const/4 v1, 0x4

    sget v2, Lcom/stripe/android/ui/core/R$string;->au_becs_account_name:I

    const-string v3, "AuBecsAccountName"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/TranslationId;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->AuBecsAccountName:Lcom/stripe/android/ui/core/elements/TranslationId;

    invoke-static {}, Lcom/stripe/android/ui/core/elements/TranslationId;->$values()[Lcom/stripe/android/ui/core/elements/TranslationId;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->$VALUES:[Lcom/stripe/android/ui/core/elements/TranslationId;

    new-instance v0, Lcom/stripe/android/ui/core/elements/TranslationId$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/ui/core/elements/TranslationId$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->Companion:Lcom/stripe/android/ui/core/elements/TranslationId$Companion;

    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    sget-object v1, Lcom/stripe/android/ui/core/elements/TranslationId$Companion$$cachedSerializer$delegate$1;->INSTANCE:Lcom/stripe/android/ui/core/elements/TranslationId$Companion$$cachedSerializer$delegate$1;

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/stripe/android/ui/core/elements/TranslationId;->resourceId:I

    return-void
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/ui/core/elements/TranslationId;
    .locals 1

    const-class v0, Lcom/stripe/android/ui/core/elements/TranslationId;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/ui/core/elements/TranslationId;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/ui/core/elements/TranslationId;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->$VALUES:[Lcom/stripe/android/ui/core/elements/TranslationId;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/ui/core/elements/TranslationId;

    return-object v0
.end method


# virtual methods
.method public final getResourceId()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/ui/core/elements/TranslationId;->resourceId:I

    return v0
.end method
