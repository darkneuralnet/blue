.class public final enum Lfg1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfg1;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lfg1;

.field public static final enum d:Lfg1;

.field public static final enum e:Lfg1;

.field public static final enum f:Lfg1;

.field public static final g:[Lfg1;

.field public static final synthetic h:[Lfg1;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    new-instance v0, Lfg1;

    const-string v1, "L"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lfg1;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lfg1;->c:Lfg1;

    new-instance v1, Lfg1;

    const-string v4, "M"

    invoke-direct {v1, v4, v3, v2}, Lfg1;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lfg1;->d:Lfg1;

    new-instance v4, Lfg1;

    const-string v5, "Q"

    const/4 v6, 0x2

    const/4 v7, 0x3

    invoke-direct {v4, v5, v6, v7}, Lfg1;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lfg1;->e:Lfg1;

    new-instance v5, Lfg1;

    const-string v8, "H"

    invoke-direct {v5, v8, v7, v6}, Lfg1;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lfg1;->f:Lfg1;

    const/4 v8, 0x4

    new-array v9, v8, [Lfg1;

    aput-object v0, v9, v2

    aput-object v1, v9, v3

    aput-object v4, v9, v6

    aput-object v5, v9, v7

    sput-object v9, Lfg1;->h:[Lfg1;

    new-array v8, v8, [Lfg1;

    aput-object v1, v8, v2

    aput-object v0, v8, v3

    aput-object v5, v8, v6

    aput-object v4, v8, v7

    sput-object v8, Lfg1;->g:[Lfg1;

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

    iput p3, p0, Lfg1;->b:I

    return-void
.end method

.method public static a(I)Lfg1;
    .locals 2

    if-ltz p0, :cond_0

    sget-object v0, Lfg1;->g:[Lfg1;

    array-length v1, v0

    if-ge p0, v1, :cond_0

    aget-object p0, v0, p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)Lfg1;
    .locals 1

    const-class v0, Lfg1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfg1;

    return-object p0
.end method

.method public static values()[Lfg1;
    .locals 1

    sget-object v0, Lfg1;->h:[Lfg1;

    invoke-virtual {v0}, [Lfg1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfg1;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lfg1;->b:I

    return v0
.end method
