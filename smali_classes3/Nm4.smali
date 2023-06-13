.class public final enum LNm4;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LNm4;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "LNm4;",
        "",
        "",
        "toString",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "rx_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:LNm4;

.field public static final enum c:LNm4;

.field public static final enum d:LNm4;

.field public static final synthetic e:[LNm4;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LNm4;

    const-string v1, "BLUETOOTH"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LNm4;-><init>(Ljava/lang/String;I)V

    sput-object v0, LNm4;->b:LNm4;

    new-instance v0, LNm4;

    const-string v1, "CELLULAR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LNm4;-><init>(Ljava/lang/String;I)V

    sput-object v0, LNm4;->c:LNm4;

    new-instance v0, LNm4;

    const-string v1, "SCAN_ONLY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LNm4;-><init>(Ljava/lang/String;I)V

    sput-object v0, LNm4;->d:LNm4;

    invoke-static {}, LNm4;->a()[LNm4;

    move-result-object v0

    sput-object v0, LNm4;->e:[LNm4;

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

.method public static final synthetic a()[LNm4;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LNm4;

    const/4 v1, 0x0

    sget-object v2, LNm4;->b:LNm4;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LNm4;->c:LNm4;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LNm4;->d:LNm4;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LNm4;
    .locals 1

    const-class v0, LNm4;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LNm4;

    return-object p0
.end method

.method public static values()[LNm4;
    .locals 1

    sget-object v0, LNm4;->e:[LNm4;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LNm4;

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
