.class public final enum Lyc0$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyc0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lyc0$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lyc0$a;

.field public static final enum c:Lyc0$a;

.field public static final enum d:Lyc0$a;

.field public static final enum e:Lyc0$a;

.field public static final enum f:Lyc0$a;

.field public static final synthetic g:[Lyc0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lyc0$a;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lyc0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyc0$a;->b:Lyc0$a;

    new-instance v0, Lyc0$a;

    const-string v1, "INITIALIZING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lyc0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyc0$a;->c:Lyc0$a;

    new-instance v0, Lyc0$a;

    const-string v1, "INITIALIZING_ERROR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lyc0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyc0$a;->d:Lyc0$a;

    new-instance v0, Lyc0$a;

    const-string v1, "INITIALIZED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lyc0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyc0$a;->e:Lyc0$a;

    new-instance v0, Lyc0$a;

    const-string v1, "SHUTDOWN"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lyc0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyc0$a;->f:Lyc0$a;

    invoke-static {}, Lyc0$a;->a()[Lyc0$a;

    move-result-object v0

    sput-object v0, Lyc0$a;->g:[Lyc0$a;

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

.method public static synthetic a()[Lyc0$a;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lyc0$a;

    const/4 v1, 0x0

    sget-object v2, Lyc0$a;->b:Lyc0$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lyc0$a;->c:Lyc0$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lyc0$a;->d:Lyc0$a;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lyc0$a;->e:Lyc0$a;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lyc0$a;->f:Lyc0$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lyc0$a;
    .locals 1

    const-class v0, Lyc0$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lyc0$a;

    return-object p0
.end method

.method public static values()[Lyc0$a;
    .locals 1

    sget-object v0, Lyc0$a;->g:[Lyc0$a;

    invoke-virtual {v0}, [Lyc0$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lyc0$a;

    return-object v0
.end method
