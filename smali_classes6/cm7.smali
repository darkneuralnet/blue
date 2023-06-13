.class public final enum Lcm7;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum c:Lcm7;

.field public static final enum d:Lcm7;

.field public static final e:[Lcm7;

.field public static final synthetic f:[Lcm7;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcm7;

    const-string v1, "AD_STORAGE"

    const/4 v2, 0x0

    const-string v3, "ad_storage"

    invoke-direct {v0, v1, v2, v3}, Lcm7;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcm7;->c:Lcm7;

    new-instance v1, Lcm7;

    const-string v3, "ANALYTICS_STORAGE"

    const/4 v4, 0x1

    const-string v5, "analytics_storage"

    invoke-direct {v1, v3, v4, v5}, Lcm7;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcm7;->d:Lcm7;

    const/4 v3, 0x2

    new-array v5, v3, [Lcm7;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    sput-object v5, Lcm7;->f:[Lcm7;

    new-array v3, v3, [Lcm7;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lcm7;->e:[Lcm7;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcm7;->b:Ljava/lang/String;

    return-void
.end method

.method public static values()[Lcm7;
    .locals 1

    sget-object v0, Lcm7;->f:[Lcm7;

    invoke-virtual {v0}, [Lcm7;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcm7;

    return-object v0
.end method
