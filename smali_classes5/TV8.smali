.class public final enum LTV8;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LqP7;


# static fields
.field public static final enum c:LTV8;

.field public static final enum d:LTV8;

.field public static final enum e:LTV8;

.field public static final enum f:LTV8;

.field public static final synthetic g:[LTV8;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, LTV8;

    const-string v1, "TYPE_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LTV8;-><init>(Ljava/lang/String;II)V

    sput-object v0, LTV8;->c:LTV8;

    new-instance v1, LTV8;

    const-string v3, "TYPE_THIN"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, LTV8;-><init>(Ljava/lang/String;II)V

    sput-object v1, LTV8;->d:LTV8;

    new-instance v3, LTV8;

    const-string v5, "TYPE_THICK"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, LTV8;-><init>(Ljava/lang/String;II)V

    sput-object v3, LTV8;->e:LTV8;

    new-instance v5, LTV8;

    const-string v7, "TYPE_GMV"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, LTV8;-><init>(Ljava/lang/String;II)V

    sput-object v5, LTV8;->f:LTV8;

    const/4 v7, 0x4

    new-array v7, v7, [LTV8;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, LTV8;->g:[LTV8;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LTV8;->b:I

    return-void
.end method

.method public static values()[LTV8;
    .locals 1

    sget-object v0, LTV8;->g:[LTV8;

    invoke-virtual {v0}, [LTV8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LTV8;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, LTV8;->b:I

    return v0
.end method
