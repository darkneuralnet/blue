.class public final enum Lyy5$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyy5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lyy5$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lyy5$c;

.field public static final enum c:Lyy5$c;

.field public static final enum d:Lyy5$c;

.field public static final synthetic e:[Lyy5$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lyy5$c;

    const-string v1, "MITER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lyy5$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyy5$c;->b:Lyy5$c;

    new-instance v0, Lyy5$c;

    const-string v1, "ROUND"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lyy5$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyy5$c;->c:Lyy5$c;

    new-instance v0, Lyy5$c;

    const-string v1, "BEVEL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lyy5$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyy5$c;->d:Lyy5$c;

    invoke-static {}, Lyy5$c;->a()[Lyy5$c;

    move-result-object v0

    sput-object v0, Lyy5$c;->e:[Lyy5$c;

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

.method public static synthetic a()[Lyy5$c;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lyy5$c;

    const/4 v1, 0x0

    sget-object v2, Lyy5$c;->b:Lyy5$c;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lyy5$c;->c:Lyy5$c;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lyy5$c;->d:Lyy5$c;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lyy5$c;
    .locals 1

    const-class v0, Lyy5$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lyy5$c;

    return-object p0
.end method

.method public static values()[Lyy5$c;
    .locals 1

    sget-object v0, Lyy5$c;->e:[Lyy5$c;

    invoke-virtual {v0}, [Lyy5$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lyy5$c;

    return-object v0
.end method


# virtual methods
.method public b()Landroid/graphics/Paint$Join;
    .locals 2

    sget-object v0, Lyy5$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    sget-object v0, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    return-object v0

    :cond_1
    sget-object v0, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    return-object v0

    :cond_2
    sget-object v0, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    return-object v0
.end method
