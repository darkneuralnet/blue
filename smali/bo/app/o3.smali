.class public final enum Lbo/app/o3;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbo/app/o3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0003\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lbo/app/o3;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "android-sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:Lbo/app/o3;

.field public static final enum c:Lbo/app/o3;

.field public static final enum d:Lbo/app/o3;

.field public static final enum e:Lbo/app/o3;

.field private static final synthetic f:[Lbo/app/o3;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lbo/app/o3;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbo/app/o3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbo/app/o3;->b:Lbo/app/o3;

    new-instance v0, Lbo/app/o3;

    const-string v1, "BAD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lbo/app/o3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbo/app/o3;->c:Lbo/app/o3;

    new-instance v0, Lbo/app/o3;

    const-string v1, "GOOD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lbo/app/o3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbo/app/o3;->d:Lbo/app/o3;

    new-instance v0, Lbo/app/o3;

    const-string v1, "GREAT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lbo/app/o3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbo/app/o3;->e:Lbo/app/o3;

    invoke-static {}, Lbo/app/o3;->a()[Lbo/app/o3;

    move-result-object v0

    sput-object v0, Lbo/app/o3;->f:[Lbo/app/o3;

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

.method private static final synthetic a()[Lbo/app/o3;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lbo/app/o3;

    sget-object v1, Lbo/app/o3;->b:Lbo/app/o3;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lbo/app/o3;->c:Lbo/app/o3;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lbo/app/o3;->d:Lbo/app/o3;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lbo/app/o3;->e:Lbo/app/o3;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lbo/app/o3;
    .locals 1

    const-class v0, Lbo/app/o3;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbo/app/o3;

    return-object p0
.end method

.method public static values()[Lbo/app/o3;
    .locals 1

    sget-object v0, Lbo/app/o3;->f:[Lbo/app/o3;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbo/app/o3;

    return-object v0
.end method
