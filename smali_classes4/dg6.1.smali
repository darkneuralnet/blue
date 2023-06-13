.class public final enum Ldg6;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldg6;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000f\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Ldg6;",
        "",
        "",
        "toString",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "l",
        "model-analytics_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:Ldg6;

.field public static final enum c:Ldg6;

.field public static final enum d:Ldg6;

.field public static final enum e:Ldg6;

.field public static final enum f:Ldg6;

.field public static final enum g:Ldg6;

.field public static final enum h:Ldg6;

.field public static final enum i:Ldg6;

.field public static final enum j:Ldg6;

.field public static final enum k:Ldg6;

.field public static final enum l:Ldg6;

.field public static final synthetic m:[Ldg6;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ldg6;

    const-string v1, "LIGHTS_ON"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ldg6;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldg6;->b:Ldg6;

    new-instance v0, Ldg6;

    const-string v1, "LIGHTS_OFF"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ldg6;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldg6;->c:Ldg6;

    new-instance v0, Ldg6;

    const-string v1, "LOCK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ldg6;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldg6;->d:Ldg6;

    new-instance v0, Ldg6;

    const-string v1, "UNLOCK"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ldg6;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldg6;->e:Ldg6;

    new-instance v0, Ldg6;

    const-string v1, "SLEEP"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ldg6;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldg6;->f:Ldg6;

    new-instance v0, Ldg6;

    const-string v1, "WAKE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ldg6;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldg6;->g:Ldg6;

    new-instance v0, Ldg6;

    const-string v1, "UNPAIR"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Ldg6;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldg6;->h:Ldg6;

    new-instance v0, Ldg6;

    const-string v1, "PAIR"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Ldg6;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldg6;->i:Ldg6;

    new-instance v0, Ldg6;

    const-string v1, "CHIRP"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Ldg6;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldg6;->j:Ldg6;

    new-instance v0, Ldg6;

    const-string v1, "TAMPER_ON"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Ldg6;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldg6;->k:Ldg6;

    new-instance v0, Ldg6;

    const-string v1, "TAMPER_OFF"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Ldg6;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldg6;->l:Ldg6;

    invoke-static {}, Ldg6;->a()[Ldg6;

    move-result-object v0

    sput-object v0, Ldg6;->m:[Ldg6;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic a()[Ldg6;
    .locals 3

    const/16 v0, 0xb

    new-array v0, v0, [Ldg6;

    const/4 v1, 0x0

    sget-object v2, Ldg6;->b:Ldg6;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Ldg6;->c:Ldg6;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Ldg6;->d:Ldg6;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Ldg6;->e:Ldg6;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Ldg6;->f:Ldg6;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Ldg6;->g:Ldg6;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Ldg6;->h:Ldg6;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Ldg6;->i:Ldg6;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Ldg6;->j:Ldg6;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Ldg6;->k:Ldg6;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Ldg6;->l:Ldg6;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ldg6;
    .locals 1

    const-class v0, Ldg6;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldg6;

    return-object p0
.end method

.method public static values()[Ldg6;
    .locals 1

    sget-object v0, Ldg6;->m:[Ldg6;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldg6;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String).toLowerCase()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
