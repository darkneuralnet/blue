.class public final enum LvY8;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LqP7;


# static fields
.field public static final enum c:LvY8;

.field public static final enum d:LvY8;

.field public static final enum e:LvY8;

.field public static final enum f:LvY8;

.field public static final enum g:LvY8;

.field public static final enum h:LvY8;

.field public static final enum i:LvY8;

.field public static final synthetic j:[LvY8;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 15

    new-instance v0, LvY8;

    const-string v1, "CATEGORY_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LvY8;-><init>(Ljava/lang/String;II)V

    sput-object v0, LvY8;->c:LvY8;

    new-instance v1, LvY8;

    const-string v3, "CATEGORY_HOME_GOOD"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, LvY8;-><init>(Ljava/lang/String;II)V

    sput-object v1, LvY8;->d:LvY8;

    new-instance v3, LvY8;

    const-string v5, "CATEGORY_FASHION_GOOD"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, LvY8;-><init>(Ljava/lang/String;II)V

    sput-object v3, LvY8;->e:LvY8;

    new-instance v5, LvY8;

    const-string v7, "CATEGORY_ANIMAL"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, LvY8;-><init>(Ljava/lang/String;II)V

    sput-object v5, LvY8;->f:LvY8;

    new-instance v7, LvY8;

    const-string v9, "CATEGORY_FOOD"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, LvY8;-><init>(Ljava/lang/String;II)V

    sput-object v7, LvY8;->g:LvY8;

    new-instance v9, LvY8;

    const-string v11, "CATEGORY_PLACE"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, LvY8;-><init>(Ljava/lang/String;II)V

    sput-object v9, LvY8;->h:LvY8;

    new-instance v11, LvY8;

    const-string v13, "CATEGORY_PLANT"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14, v14}, LvY8;-><init>(Ljava/lang/String;II)V

    sput-object v11, LvY8;->i:LvY8;

    const/4 v13, 0x7

    new-array v13, v13, [LvY8;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    sput-object v13, LvY8;->j:[LvY8;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LvY8;->b:I

    return-void
.end method

.method public static values()[LvY8;
    .locals 1

    sget-object v0, LvY8;->j:[LvY8;

    invoke-virtual {v0}, [LvY8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LvY8;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, LvY8;->b:I

    return v0
.end method
