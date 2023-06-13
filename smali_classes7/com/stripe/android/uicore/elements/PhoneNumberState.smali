.class public final enum Lcom/stripe/android/uicore/elements/PhoneNumberState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/elements/PhoneNumberState$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/uicore/elements/PhoneNumberState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0087\u0001\u0018\u0000 \u00062\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/PhoneNumberState;",
        "",
        "(Ljava/lang/String;I)V",
        "HIDDEN",
        "OPTIONAL",
        "REQUIRED",
        "Companion",
        "stripe-ui-core_release"
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
.field private static final synthetic $VALUES:[Lcom/stripe/android/uicore/elements/PhoneNumberState;

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

.field public static final Companion:Lcom/stripe/android/uicore/elements/PhoneNumberState$Companion;

.field public static final enum HIDDEN:Lcom/stripe/android/uicore/elements/PhoneNumberState;
    .annotation runtime LVs5;
        value = "hidden"
    .end annotation
.end field

.field public static final enum OPTIONAL:Lcom/stripe/android/uicore/elements/PhoneNumberState;
    .annotation runtime LVs5;
        value = "optional"
    .end annotation
.end field

.field public static final enum REQUIRED:Lcom/stripe/android/uicore/elements/PhoneNumberState;
    .annotation runtime LVs5;
        value = "required"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/uicore/elements/PhoneNumberState;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/stripe/android/uicore/elements/PhoneNumberState;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/uicore/elements/PhoneNumberState;->HIDDEN:Lcom/stripe/android/uicore/elements/PhoneNumberState;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/uicore/elements/PhoneNumberState;->OPTIONAL:Lcom/stripe/android/uicore/elements/PhoneNumberState;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/uicore/elements/PhoneNumberState;->REQUIRED:Lcom/stripe/android/uicore/elements/PhoneNumberState;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberState;

    const-string v1, "HIDDEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberState;->HIDDEN:Lcom/stripe/android/uicore/elements/PhoneNumberState;

    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberState;

    const-string v1, "OPTIONAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberState;->OPTIONAL:Lcom/stripe/android/uicore/elements/PhoneNumberState;

    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberState;

    const-string v1, "REQUIRED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberState;->REQUIRED:Lcom/stripe/android/uicore/elements/PhoneNumberState;

    invoke-static {}, Lcom/stripe/android/uicore/elements/PhoneNumberState;->$values()[Lcom/stripe/android/uicore/elements/PhoneNumberState;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberState;->$VALUES:[Lcom/stripe/android/uicore/elements/PhoneNumberState;

    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/elements/PhoneNumberState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberState;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberState$Companion;

    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    sget-object v1, Lcom/stripe/android/uicore/elements/PhoneNumberState$Companion$$cachedSerializer$delegate$1;->INSTANCE:Lcom/stripe/android/uicore/elements/PhoneNumberState$Companion$$cachedSerializer$delegate$1;

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberState;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberState;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/PhoneNumberState;
    .locals 1

    const-class v0, Lcom/stripe/android/uicore/elements/PhoneNumberState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/uicore/elements/PhoneNumberState;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/uicore/elements/PhoneNumberState;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberState;->$VALUES:[Lcom/stripe/android/uicore/elements/PhoneNumberState;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/uicore/elements/PhoneNumberState;

    return-object v0
.end method
