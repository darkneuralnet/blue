.class public final enum LEG8;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LdR7;


# static fields
.field public static final enum c:LEG8;

.field public static final enum d:LEG8;

.field public static final enum e:LEG8;

.field public static final enum f:LEG8;

.field public static final synthetic g:[LEG8;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, LEG8;

    const-string v1, "TYPE_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LEG8;-><init>(Ljava/lang/String;II)V

    sput-object v0, LEG8;->c:LEG8;

    new-instance v1, LEG8;

    const-string v3, "TYPE_THIN"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, LEG8;-><init>(Ljava/lang/String;II)V

    sput-object v1, LEG8;->d:LEG8;

    new-instance v3, LEG8;

    const-string v5, "TYPE_THICK"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, LEG8;-><init>(Ljava/lang/String;II)V

    sput-object v3, LEG8;->e:LEG8;

    new-instance v5, LEG8;

    const-string v7, "TYPE_GMV"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, LEG8;-><init>(Ljava/lang/String;II)V

    sput-object v5, LEG8;->f:LEG8;

    const/4 v7, 0x4

    new-array v7, v7, [LEG8;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, LEG8;->g:[LEG8;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LEG8;->b:I

    return-void
.end method

.method public static values()[LEG8;
    .locals 1

    sget-object v0, LEG8;->g:[LEG8;

    invoke-virtual {v0}, [LEG8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LEG8;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, LEG8;->b:I

    return v0
.end method
