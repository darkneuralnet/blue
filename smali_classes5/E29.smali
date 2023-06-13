.class public final enum LE29;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LqP7;


# static fields
.field public static final enum c:LE29;

.field public static final enum d:LE29;

.field public static final enum e:LE29;

.field public static final synthetic f:[LE29;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, LE29;

    const-string v1, "MODE_UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LE29;-><init>(Ljava/lang/String;II)V

    sput-object v0, LE29;->c:LE29;

    new-instance v1, LE29;

    const-string v3, "STREAM"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, LE29;-><init>(Ljava/lang/String;II)V

    sput-object v1, LE29;->d:LE29;

    new-instance v3, LE29;

    const-string v5, "SINGLE_IMAGE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, LE29;-><init>(Ljava/lang/String;II)V

    sput-object v3, LE29;->e:LE29;

    const/4 v5, 0x3

    new-array v5, v5, [LE29;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, LE29;->f:[LE29;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LE29;->b:I

    return-void
.end method

.method public static values()[LE29;
    .locals 1

    sget-object v0, LE29;->f:[LE29;

    invoke-virtual {v0}, [LE29;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LE29;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, LE29;->b:I

    return v0
.end method
