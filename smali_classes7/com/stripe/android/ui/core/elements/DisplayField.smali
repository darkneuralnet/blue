.class public final enum Lcom/stripe/android/ui/core/elements/DisplayField;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/elements/DisplayField$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/ui/core/elements/DisplayField;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0004\u0008\u0087\u0001\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/DisplayField;",
        "",
        "(Ljava/lang/String;I)V",
        "Country",
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
.field private static final synthetic $VALUES:[Lcom/stripe/android/ui/core/elements/DisplayField;

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

.field public static final Companion:Lcom/stripe/android/ui/core/elements/DisplayField$Companion;

.field public static final enum Country:Lcom/stripe/android/ui/core/elements/DisplayField;
    .annotation runtime LVs5;
        value = "country"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/ui/core/elements/DisplayField;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/stripe/android/ui/core/elements/DisplayField;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/ui/core/elements/DisplayField;->Country:Lcom/stripe/android/ui/core/elements/DisplayField;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/ui/core/elements/DisplayField;

    const-string v1, "Country"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/DisplayField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/DisplayField;->Country:Lcom/stripe/android/ui/core/elements/DisplayField;

    invoke-static {}, Lcom/stripe/android/ui/core/elements/DisplayField;->$values()[Lcom/stripe/android/ui/core/elements/DisplayField;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/DisplayField;->$VALUES:[Lcom/stripe/android/ui/core/elements/DisplayField;

    new-instance v0, Lcom/stripe/android/ui/core/elements/DisplayField$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/ui/core/elements/DisplayField$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/DisplayField;->Companion:Lcom/stripe/android/ui/core/elements/DisplayField$Companion;

    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    sget-object v1, Lcom/stripe/android/ui/core/elements/DisplayField$Companion$$cachedSerializer$delegate$1;->INSTANCE:Lcom/stripe/android/ui/core/elements/DisplayField$Companion$$cachedSerializer$delegate$1;

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/DisplayField;->$cachedSerializer$delegate:Lkotlin/Lazy;

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

    sget-object v0, Lcom/stripe/android/ui/core/elements/DisplayField;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/ui/core/elements/DisplayField;
    .locals 1

    const-class v0, Lcom/stripe/android/ui/core/elements/DisplayField;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/ui/core/elements/DisplayField;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/ui/core/elements/DisplayField;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/DisplayField;->$VALUES:[Lcom/stripe/android/ui/core/elements/DisplayField;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/ui/core/elements/DisplayField;

    return-object v0
.end method
