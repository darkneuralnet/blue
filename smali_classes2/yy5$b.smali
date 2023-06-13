.class public final enum Lyy5$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyy5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lyy5$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lyy5$b;

.field public static final enum c:Lyy5$b;

.field public static final enum d:Lyy5$b;

.field public static final synthetic e:[Lyy5$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lyy5$b;

    const-string v1, "BUTT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lyy5$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyy5$b;->b:Lyy5$b;

    new-instance v0, Lyy5$b;

    const-string v1, "ROUND"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lyy5$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyy5$b;->c:Lyy5$b;

    new-instance v0, Lyy5$b;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lyy5$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyy5$b;->d:Lyy5$b;

    invoke-static {}, Lyy5$b;->a()[Lyy5$b;

    move-result-object v0

    sput-object v0, Lyy5$b;->e:[Lyy5$b;

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

.method public static synthetic a()[Lyy5$b;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lyy5$b;

    const/4 v1, 0x0

    sget-object v2, Lyy5$b;->b:Lyy5$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lyy5$b;->c:Lyy5$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lyy5$b;->d:Lyy5$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lyy5$b;
    .locals 1

    const-class v0, Lyy5$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lyy5$b;

    return-object p0
.end method

.method public static values()[Lyy5$b;
    .locals 1

    sget-object v0, Lyy5$b;->e:[Lyy5$b;

    invoke-virtual {v0}, [Lyy5$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lyy5$b;

    return-object v0
.end method


# virtual methods
.method public b()Landroid/graphics/Paint$Cap;
    .locals 2

    sget-object v0, Lyy5$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    sget-object v0, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    return-object v0

    :cond_0
    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    return-object v0

    :cond_1
    sget-object v0, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    return-object v0
.end method
