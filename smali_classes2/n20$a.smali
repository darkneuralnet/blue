.class public final enum Ln20$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln20;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln20$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Ln20$a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
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
.field public static final enum b:Ln20$a;

.field public static final enum c:Ln20$a;

.field public static final enum d:Ln20$a;

.field public static final synthetic e:[Ln20$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln20$a;

    const-string v1, "CONTENT_CARDS_SYNC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln20$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln20$a;->b:Ln20$a;

    new-instance v0, Ln20$a;

    const-string v1, "NEWS_FEED_SYNC"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln20$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln20$a;->c:Ln20$a;

    new-instance v0, Ln20$a;

    const-string v1, "OTHER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ln20$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln20$a;->d:Ln20$a;

    invoke-static {}, Ln20$a;->a()[Ln20$a;

    move-result-object v0

    sput-object v0, Ln20$a;->e:[Ln20$a;

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

.method public static final synthetic a()[Ln20$a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ln20$a;

    sget-object v1, Ln20$a;->b:Ln20$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ln20$a;->c:Ln20$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ln20$a;->d:Ln20$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln20$a;
    .locals 1

    const-class v0, Ln20$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln20$a;

    return-object p0
.end method

.method public static values()[Ln20$a;
    .locals 1

    sget-object v0, Ln20$a;->e:[Ln20$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln20$a;

    return-object v0
.end method
