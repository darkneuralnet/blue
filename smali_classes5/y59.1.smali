.class public final enum Ly59;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lb18;


# static fields
.field public static final enum c:Ly59;

.field public static final enum d:Ly59;

.field public static final enum e:Ly59;

.field public static final enum f:Ly59;

.field public static final synthetic g:[Ly59;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Ly59;

    const-string v1, "TYPE_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ly59;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ly59;->c:Ly59;

    new-instance v1, Ly59;

    const-string v3, "TYPE_THIN"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Ly59;-><init>(Ljava/lang/String;II)V

    sput-object v1, Ly59;->d:Ly59;

    new-instance v3, Ly59;

    const-string v5, "TYPE_THICK"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Ly59;-><init>(Ljava/lang/String;II)V

    sput-object v3, Ly59;->e:Ly59;

    new-instance v5, Ly59;

    const-string v7, "TYPE_GMV"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Ly59;-><init>(Ljava/lang/String;II)V

    sput-object v5, Ly59;->f:Ly59;

    const/4 v7, 0x4

    new-array v7, v7, [Ly59;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Ly59;->g:[Ly59;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Ly59;->b:I

    return-void
.end method

.method public static values()[Ly59;
    .locals 1

    sget-object v0, Ly59;->g:[Ly59;

    invoke-virtual {v0}, [Ly59;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly59;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Ly59;->b:I

    return v0
.end method
