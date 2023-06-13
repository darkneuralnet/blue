.class public final enum LRD1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LRD1;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LRD1;

.field public static final enum c:LRD1;

.field public static final synthetic d:[LRD1;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LRD1;

    const-string v1, "LINEAR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LRD1;-><init>(Ljava/lang/String;I)V

    sput-object v0, LRD1;->b:LRD1;

    new-instance v0, LRD1;

    const-string v1, "RADIAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LRD1;-><init>(Ljava/lang/String;I)V

    sput-object v0, LRD1;->c:LRD1;

    invoke-static {}, LRD1;->a()[LRD1;

    move-result-object v0

    sput-object v0, LRD1;->d:[LRD1;

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

.method public static synthetic a()[LRD1;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LRD1;

    const/4 v1, 0x0

    sget-object v2, LRD1;->b:LRD1;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LRD1;->c:LRD1;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LRD1;
    .locals 1

    const-class v0, LRD1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LRD1;

    return-object p0
.end method

.method public static values()[LRD1;
    .locals 1

    sget-object v0, LRD1;->d:[LRD1;

    invoke-virtual {v0}, [LRD1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LRD1;

    return-object v0
.end method
