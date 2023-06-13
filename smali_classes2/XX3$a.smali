.class public final enum LXX3$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXX3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LXX3$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LXX3$a;

.field public static final enum d:LXX3$a;

.field public static final synthetic e:[LXX3$a;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, LXX3$a;

    const-string v1, "STAR"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, LXX3$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LXX3$a;->c:LXX3$a;

    new-instance v0, LXX3$a;

    const-string v1, "POLYGON"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, LXX3$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LXX3$a;->d:LXX3$a;

    invoke-static {}, LXX3$a;->a()[LXX3$a;

    move-result-object v0

    sput-object v0, LXX3$a;->e:[LXX3$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LXX3$a;->b:I

    return-void
.end method

.method public static synthetic a()[LXX3$a;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LXX3$a;

    const/4 v1, 0x0

    sget-object v2, LXX3$a;->c:LXX3$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LXX3$a;->d:LXX3$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static b(I)LXX3$a;
    .locals 5

    invoke-static {}, LXX3$a;->values()[LXX3$a;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget v4, v3, LXX3$a;->b:I

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LXX3$a;
    .locals 1

    const-class v0, LXX3$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LXX3$a;

    return-object p0
.end method

.method public static values()[LXX3$a;
    .locals 1

    sget-object v0, LXX3$a;->e:[LXX3$a;

    invoke-virtual {v0}, [LXX3$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LXX3$a;

    return-object v0
.end method
