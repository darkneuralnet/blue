.class public final enum Lcom/stripe/android/ui/core/elements/KeyboardType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/elements/KeyboardType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/ui/core/elements/KeyboardType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000b\u0008\u0087\u0001\u0018\u0000 \u000b2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/KeyboardType;",
        "",
        "(Ljava/lang/String;I)V",
        "Text",
        "Ascii",
        "Number",
        "Phone",
        "Uri",
        "Email",
        "Password",
        "NumberPassword",
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
.field private static final synthetic $VALUES:[Lcom/stripe/android/ui/core/elements/KeyboardType;

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

.field public static final enum Ascii:Lcom/stripe/android/ui/core/elements/KeyboardType;
    .annotation runtime LVs5;
        value = "ascii"
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/ui/core/elements/KeyboardType$Companion;

.field public static final enum Email:Lcom/stripe/android/ui/core/elements/KeyboardType;
    .annotation runtime LVs5;
        value = "email"
    .end annotation
.end field

.field public static final enum Number:Lcom/stripe/android/ui/core/elements/KeyboardType;
    .annotation runtime LVs5;
        value = "number"
    .end annotation
.end field

.field public static final enum NumberPassword:Lcom/stripe/android/ui/core/elements/KeyboardType;
    .annotation runtime LVs5;
        value = "number_password"
    .end annotation
.end field

.field public static final enum Password:Lcom/stripe/android/ui/core/elements/KeyboardType;
    .annotation runtime LVs5;
        value = "password"
    .end annotation
.end field

.field public static final enum Phone:Lcom/stripe/android/ui/core/elements/KeyboardType;
    .annotation runtime LVs5;
        value = "phone"
    .end annotation
.end field

.field public static final enum Text:Lcom/stripe/android/ui/core/elements/KeyboardType;
    .annotation runtime LVs5;
        value = "text"
    .end annotation
.end field

.field public static final enum Uri:Lcom/stripe/android/ui/core/elements/KeyboardType;
    .annotation runtime LVs5;
        value = "uri"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/ui/core/elements/KeyboardType;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Lcom/stripe/android/ui/core/elements/KeyboardType;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/ui/core/elements/KeyboardType;->Text:Lcom/stripe/android/ui/core/elements/KeyboardType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/ui/core/elements/KeyboardType;->Ascii:Lcom/stripe/android/ui/core/elements/KeyboardType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/ui/core/elements/KeyboardType;->Number:Lcom/stripe/android/ui/core/elements/KeyboardType;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/stripe/android/ui/core/elements/KeyboardType;->Phone:Lcom/stripe/android/ui/core/elements/KeyboardType;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/stripe/android/ui/core/elements/KeyboardType;->Uri:Lcom/stripe/android/ui/core/elements/KeyboardType;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/stripe/android/ui/core/elements/KeyboardType;->Email:Lcom/stripe/android/ui/core/elements/KeyboardType;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/stripe/android/ui/core/elements/KeyboardType;->Password:Lcom/stripe/android/ui/core/elements/KeyboardType;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/stripe/android/ui/core/elements/KeyboardType;->NumberPassword:Lcom/stripe/android/ui/core/elements/KeyboardType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/ui/core/elements/KeyboardType;

    const-string v1, "Text"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/KeyboardType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/KeyboardType;->Text:Lcom/stripe/android/ui/core/elements/KeyboardType;

    new-instance v0, Lcom/stripe/android/ui/core/elements/KeyboardType;

    const-string v1, "Ascii"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/KeyboardType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/KeyboardType;->Ascii:Lcom/stripe/android/ui/core/elements/KeyboardType;

    new-instance v0, Lcom/stripe/android/ui/core/elements/KeyboardType;

    const-string v1, "Number"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/KeyboardType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/KeyboardType;->Number:Lcom/stripe/android/ui/core/elements/KeyboardType;

    new-instance v0, Lcom/stripe/android/ui/core/elements/KeyboardType;

    const-string v1, "Phone"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/KeyboardType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/KeyboardType;->Phone:Lcom/stripe/android/ui/core/elements/KeyboardType;

    new-instance v0, Lcom/stripe/android/ui/core/elements/KeyboardType;

    const-string v1, "Uri"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/KeyboardType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/KeyboardType;->Uri:Lcom/stripe/android/ui/core/elements/KeyboardType;

    new-instance v0, Lcom/stripe/android/ui/core/elements/KeyboardType;

    const-string v1, "Email"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/KeyboardType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/KeyboardType;->Email:Lcom/stripe/android/ui/core/elements/KeyboardType;

    new-instance v0, Lcom/stripe/android/ui/core/elements/KeyboardType;

    const-string v1, "Password"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/KeyboardType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/KeyboardType;->Password:Lcom/stripe/android/ui/core/elements/KeyboardType;

    new-instance v0, Lcom/stripe/android/ui/core/elements/KeyboardType;

    const-string v1, "NumberPassword"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/KeyboardType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/KeyboardType;->NumberPassword:Lcom/stripe/android/ui/core/elements/KeyboardType;

    invoke-static {}, Lcom/stripe/android/ui/core/elements/KeyboardType;->$values()[Lcom/stripe/android/ui/core/elements/KeyboardType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/KeyboardType;->$VALUES:[Lcom/stripe/android/ui/core/elements/KeyboardType;

    new-instance v0, Lcom/stripe/android/ui/core/elements/KeyboardType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/ui/core/elements/KeyboardType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/KeyboardType;->Companion:Lcom/stripe/android/ui/core/elements/KeyboardType$Companion;

    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    sget-object v1, Lcom/stripe/android/ui/core/elements/KeyboardType$Companion$$cachedSerializer$delegate$1;->INSTANCE:Lcom/stripe/android/ui/core/elements/KeyboardType$Companion$$cachedSerializer$delegate$1;

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/KeyboardType;->$cachedSerializer$delegate:Lkotlin/Lazy;

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

    sget-object v0, Lcom/stripe/android/ui/core/elements/KeyboardType;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/ui/core/elements/KeyboardType;
    .locals 1

    const-class v0, Lcom/stripe/android/ui/core/elements/KeyboardType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/ui/core/elements/KeyboardType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/ui/core/elements/KeyboardType;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/KeyboardType;->$VALUES:[Lcom/stripe/android/ui/core/elements/KeyboardType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/ui/core/elements/KeyboardType;

    return-object v0
.end method
