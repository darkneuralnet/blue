.class public final enum LDV5$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDV5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LDV5$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LDV5$b;

.field public static final enum c:LDV5$b;

.field public static final enum d:LDV5$b;

.field public static final enum e:LDV5$b;

.field public static final synthetic f:[LDV5$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LDV5$b;

    const-string v1, "PRIV"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LDV5$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LDV5$b;->b:LDV5$b;

    new-instance v0, LDV5$b;

    const-string v1, "YUV"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LDV5$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LDV5$b;->c:LDV5$b;

    new-instance v0, LDV5$b;

    const-string v1, "JPEG"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LDV5$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LDV5$b;->d:LDV5$b;

    new-instance v0, LDV5$b;

    const-string v1, "RAW"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LDV5$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LDV5$b;->e:LDV5$b;

    invoke-static {}, LDV5$b;->a()[LDV5$b;

    move-result-object v0

    sput-object v0, LDV5$b;->f:[LDV5$b;

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

.method public static synthetic a()[LDV5$b;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LDV5$b;

    const/4 v1, 0x0

    sget-object v2, LDV5$b;->b:LDV5$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LDV5$b;->c:LDV5$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LDV5$b;->d:LDV5$b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LDV5$b;->e:LDV5$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LDV5$b;
    .locals 1

    const-class v0, LDV5$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LDV5$b;

    return-object p0
.end method

.method public static values()[LDV5$b;
    .locals 1

    sget-object v0, LDV5$b;->f:[LDV5$b;

    invoke-virtual {v0}, [LDV5$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LDV5$b;

    return-object v0
.end method
