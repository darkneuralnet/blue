.class public final enum Lx24;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lx24;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lx24;",
        "",
        "",
        "toString",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "e",
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
.field public static final enum b:Lx24;

.field public static final enum c:Lx24;

.field public static final enum d:Lx24;

.field public static final enum e:Lx24;

.field public static final synthetic f:[Lx24;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lx24;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lx24;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx24;->b:Lx24;

    new-instance v0, Lx24;

    const-string v1, "SEE_PRICING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lx24;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx24;->c:Lx24;

    new-instance v0, Lx24;

    const-string v1, "SEE_UPDATED_PRICING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lx24;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx24;->d:Lx24;

    new-instance v0, Lx24;

    const-string v1, "LEGACY"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lx24;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx24;->e:Lx24;

    invoke-static {}, Lx24;->a()[Lx24;

    move-result-object v0

    sput-object v0, Lx24;->f:[Lx24;

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

.method public static final synthetic a()[Lx24;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lx24;

    const/4 v1, 0x0

    sget-object v2, Lx24;->b:Lx24;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lx24;->c:Lx24;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lx24;->d:Lx24;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lx24;->e:Lx24;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lx24;
    .locals 1

    const-class v0, Lx24;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lx24;

    return-object p0
.end method

.method public static values()[Lx24;
    .locals 1

    sget-object v0, Lx24;->f:[Lx24;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx24;

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
