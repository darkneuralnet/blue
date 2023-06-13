.class public final enum Ljc0$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljc0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljc0$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Ljc0$b;

.field public static final enum c:Ljc0$b;

.field public static final enum d:Ljc0$b;

.field public static final enum e:Ljc0$b;

.field public static final enum f:Ljc0$b;

.field public static final synthetic g:[Ljc0$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljc0$b;

    const-string v1, "PENDING_OPEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljc0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljc0$b;->b:Ljc0$b;

    new-instance v0, Ljc0$b;

    const-string v1, "OPENING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljc0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljc0$b;->c:Ljc0$b;

    new-instance v0, Ljc0$b;

    const-string v1, "OPEN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ljc0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljc0$b;->d:Ljc0$b;

    new-instance v0, Ljc0$b;

    const-string v1, "CLOSING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ljc0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljc0$b;->e:Ljc0$b;

    new-instance v0, Ljc0$b;

    const-string v1, "CLOSED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ljc0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljc0$b;->f:Ljc0$b;

    invoke-static {}, Ljc0$b;->a()[Ljc0$b;

    move-result-object v0

    sput-object v0, Ljc0$b;->g:[Ljc0$b;

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

.method public static synthetic a()[Ljc0$b;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ljc0$b;

    const/4 v1, 0x0

    sget-object v2, Ljc0$b;->b:Ljc0$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Ljc0$b;->c:Ljc0$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Ljc0$b;->d:Ljc0$b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Ljc0$b;->e:Ljc0$b;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Ljc0$b;->f:Ljc0$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljc0$b;
    .locals 1

    const-class v0, Ljc0$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljc0$b;

    return-object p0
.end method

.method public static values()[Ljc0$b;
    .locals 1

    sget-object v0, Ljc0$b;->g:[Ljc0$b;

    invoke-virtual {v0}, [Ljc0$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljc0$b;

    return-object v0
.end method
