.class public final enum Lrp6$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrp6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lrp6$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lrp6$c;

.field public static final enum c:Lrp6$c;

.field public static final enum d:Lrp6$c;

.field public static final enum e:Lrp6$c;

.field public static final enum f:Lrp6$c;

.field public static final synthetic g:[Lrp6$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lrp6$c;

    const-string v1, "NOT_INITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lrp6$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrp6$c;->b:Lrp6$c;

    new-instance v0, Lrp6$c;

    const-string v1, "INITIALIZING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lrp6$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrp6$c;->c:Lrp6$c;

    new-instance v0, Lrp6$c;

    const-string v1, "PENDING_RELEASE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lrp6$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrp6$c;->d:Lrp6$c;

    new-instance v0, Lrp6$c;

    const-string v1, "READY"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lrp6$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrp6$c;->e:Lrp6$c;

    new-instance v0, Lrp6$c;

    const-string v1, "RELEASED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lrp6$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrp6$c;->f:Lrp6$c;

    invoke-static {}, Lrp6$c;->a()[Lrp6$c;

    move-result-object v0

    sput-object v0, Lrp6$c;->g:[Lrp6$c;

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

.method public static synthetic a()[Lrp6$c;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lrp6$c;

    const/4 v1, 0x0

    sget-object v2, Lrp6$c;->b:Lrp6$c;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lrp6$c;->c:Lrp6$c;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lrp6$c;->d:Lrp6$c;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lrp6$c;->e:Lrp6$c;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lrp6$c;->f:Lrp6$c;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lrp6$c;
    .locals 1

    const-class v0, Lrp6$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lrp6$c;

    return-object p0
.end method

.method public static values()[Lrp6$c;
    .locals 1

    sget-object v0, Lrp6$c;->g:[Lrp6$c;

    invoke-virtual {v0}, [Lrp6$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrp6$c;

    return-object v0
.end method
