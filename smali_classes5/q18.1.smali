.class public final enum Lq18;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:Lq18;

.field public static final enum c:Lq18;

.field public static final enum d:Lq18;

.field public static final synthetic e:[Lq18;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lq18;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lq18;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq18;->b:Lq18;

    new-instance v1, Lq18;

    const-string v3, "SIGNED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lq18;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lq18;->c:Lq18;

    new-instance v3, Lq18;

    const-string v5, "FIXED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lq18;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lq18;->d:Lq18;

    const/4 v5, 0x3

    new-array v5, v5, [Lq18;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lq18;->e:[Lq18;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lq18;
    .locals 1

    sget-object v0, Lq18;->e:[Lq18;

    invoke-virtual {v0}, [Lq18;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq18;

    return-object v0
.end method
