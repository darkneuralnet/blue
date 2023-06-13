.class public final enum Ltp6$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltp6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltp6$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Ltp6$a;

.field public static final enum c:Ltp6$a;

.field public static final enum d:Ltp6$a;

.field public static final synthetic e:[Ltp6$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ltp6$a;

    const-string v1, "ACTIVE_STREAMING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ltp6$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltp6$a;->b:Ltp6$a;

    new-instance v0, Ltp6$a;

    const-string v1, "ACTIVE_NON_STREAMING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ltp6$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltp6$a;->c:Ltp6$a;

    new-instance v0, Ltp6$a;

    const-string v1, "INACTIVE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ltp6$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltp6$a;->d:Ltp6$a;

    invoke-static {}, Ltp6$a;->a()[Ltp6$a;

    move-result-object v0

    sput-object v0, Ltp6$a;->e:[Ltp6$a;

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

.method public static synthetic a()[Ltp6$a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ltp6$a;

    const/4 v1, 0x0

    sget-object v2, Ltp6$a;->b:Ltp6$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Ltp6$a;->c:Ltp6$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Ltp6$a;->d:Ltp6$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ltp6$a;
    .locals 1

    const-class v0, Ltp6$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ltp6$a;

    return-object p0
.end method

.method public static values()[Ltp6$a;
    .locals 1

    sget-object v0, Ltp6$a;->e:[Ltp6$a;

    invoke-virtual {v0}, [Ltp6$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltp6$a;

    return-object v0
.end method
