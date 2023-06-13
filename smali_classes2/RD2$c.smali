.class public final enum LRD2$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LRD2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LRD2$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LRD2$c;

.field public static final enum c:LRD2$c;

.field public static final enum d:LRD2$c;

.field public static final synthetic e:[LRD2$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LRD2$c;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LRD2$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LRD2$c;->b:LRD2$c;

    new-instance v0, LRD2$c;

    const-string v1, "PLAY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LRD2$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LRD2$c;->c:LRD2$c;

    new-instance v0, LRD2$c;

    const-string v1, "RESUME"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LRD2$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LRD2$c;->d:LRD2$c;

    invoke-static {}, LRD2$c;->a()[LRD2$c;

    move-result-object v0

    sput-object v0, LRD2$c;->e:[LRD2$c;

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

.method public static synthetic a()[LRD2$c;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LRD2$c;

    const/4 v1, 0x0

    sget-object v2, LRD2$c;->b:LRD2$c;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LRD2$c;->c:LRD2$c;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LRD2$c;->d:LRD2$c;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LRD2$c;
    .locals 1

    const-class v0, LRD2$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LRD2$c;

    return-object p0
.end method

.method public static values()[LRD2$c;
    .locals 1

    sget-object v0, LRD2$c;->e:[LRD2$c;

    invoke-virtual {v0}, [LRD2$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LRD2$c;

    return-object v0
.end method
