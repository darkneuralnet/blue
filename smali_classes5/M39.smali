.class public final enum LM39;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LgX7;


# static fields
.field public static final enum c:LM39;

.field public static final enum d:LM39;

.field public static final enum e:LM39;

.field public static final enum f:LM39;

.field public static final synthetic g:[LM39;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, LM39;

    const-string v1, "TYPE_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LM39;-><init>(Ljava/lang/String;II)V

    sput-object v0, LM39;->c:LM39;

    new-instance v1, LM39;

    const-string v3, "TYPE_THIN"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, LM39;-><init>(Ljava/lang/String;II)V

    sput-object v1, LM39;->d:LM39;

    new-instance v3, LM39;

    const-string v5, "TYPE_THICK"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, LM39;-><init>(Ljava/lang/String;II)V

    sput-object v3, LM39;->e:LM39;

    new-instance v5, LM39;

    const-string v7, "TYPE_GMV"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, LM39;-><init>(Ljava/lang/String;II)V

    sput-object v5, LM39;->f:LM39;

    const/4 v7, 0x4

    new-array v7, v7, [LM39;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, LM39;->g:[LM39;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LM39;->b:I

    return-void
.end method

.method public static values()[LM39;
    .locals 1

    sget-object v0, LM39;->g:[LM39;

    invoke-virtual {v0}, [LM39;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LM39;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, LM39;->b:I

    return v0
.end method
