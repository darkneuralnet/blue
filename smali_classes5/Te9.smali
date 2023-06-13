.class public final enum LTe9;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LgX7;


# static fields
.field public static final enum c:LTe9;

.field public static final enum d:LTe9;

.field public static final enum e:LTe9;

.field public static final enum f:LTe9;

.field public static final enum g:LTe9;

.field public static final enum h:LTe9;

.field public static final enum i:LTe9;

.field public static final enum j:LTe9;

.field public static final synthetic k:[LTe9;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, LTe9;

    const-string v1, "TYPE_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LTe9;-><init>(Ljava/lang/String;II)V

    sput-object v0, LTe9;->c:LTe9;

    new-instance v1, LTe9;

    const-string v3, "LATIN"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, LTe9;-><init>(Ljava/lang/String;II)V

    sput-object v1, LTe9;->d:LTe9;

    new-instance v3, LTe9;

    const-string v5, "LATIN_AND_CHINESE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, LTe9;-><init>(Ljava/lang/String;II)V

    sput-object v3, LTe9;->e:LTe9;

    new-instance v5, LTe9;

    const-string v7, "LATIN_AND_DEVANAGARI"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, LTe9;-><init>(Ljava/lang/String;II)V

    sput-object v5, LTe9;->f:LTe9;

    new-instance v7, LTe9;

    const-string v9, "LATIN_AND_JAPANESE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, LTe9;-><init>(Ljava/lang/String;II)V

    sput-object v7, LTe9;->g:LTe9;

    new-instance v9, LTe9;

    const-string v11, "LATIN_AND_KOREAN"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, LTe9;-><init>(Ljava/lang/String;II)V

    sput-object v9, LTe9;->h:LTe9;

    new-instance v11, LTe9;

    const-string v13, "CREDIT_CARD"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14, v14}, LTe9;-><init>(Ljava/lang/String;II)V

    sput-object v11, LTe9;->i:LTe9;

    new-instance v13, LTe9;

    const-string v15, "DOCUMENT"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14, v14}, LTe9;-><init>(Ljava/lang/String;II)V

    sput-object v13, LTe9;->j:LTe9;

    const/16 v15, 0x8

    new-array v15, v15, [LTe9;

    aput-object v0, v15, v2

    aput-object v1, v15, v4

    aput-object v3, v15, v6

    aput-object v5, v15, v8

    aput-object v7, v15, v10

    aput-object v9, v15, v12

    const/4 v0, 0x6

    aput-object v11, v15, v0

    aput-object v13, v15, v14

    sput-object v15, LTe9;->k:[LTe9;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LTe9;->b:I

    return-void
.end method

.method public static values()[LTe9;
    .locals 1

    sget-object v0, LTe9;->k:[LTe9;

    invoke-virtual {v0}, [LTe9;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LTe9;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, LTe9;->b:I

    return v0
.end method
