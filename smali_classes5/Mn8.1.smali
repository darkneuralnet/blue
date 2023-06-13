.class public final enum LMn8;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LpT7;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LMn8;",
        ">;",
        "LpT7;"
    }
.end annotation


# static fields
.field public static final enum c:LMn8;

.field public static final enum d:LMn8;

.field public static final enum e:LMn8;

.field public static final enum f:LMn8;

.field public static final enum g:LMn8;

.field public static final h:LDT7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LDT7<",
            "LMn8;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic i:[LMn8;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    new-instance v0, LMn8;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LMn8;-><init>(Ljava/lang/String;II)V

    sput-object v0, LMn8;->c:LMn8;

    new-instance v1, LMn8;

    const-string v3, "UNMETERED_ONLY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, LMn8;-><init>(Ljava/lang/String;II)V

    sput-object v1, LMn8;->d:LMn8;

    new-instance v3, LMn8;

    const-string v5, "UNMETERED_OR_DAILY"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, LMn8;-><init>(Ljava/lang/String;II)V

    sput-object v3, LMn8;->e:LMn8;

    new-instance v5, LMn8;

    const-string v7, "FAST_IF_RADIO_AWAKE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, LMn8;-><init>(Ljava/lang/String;II)V

    sput-object v5, LMn8;->f:LMn8;

    new-instance v7, LMn8;

    const-string v9, "NEVER"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, LMn8;-><init>(Ljava/lang/String;II)V

    sput-object v7, LMn8;->g:LMn8;

    const/4 v9, 0x5

    new-array v9, v9, [LMn8;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, LMn8;->i:[LMn8;

    new-instance v0, LUq8;

    invoke-direct {v0}, LUq8;-><init>()V

    sput-object v0, LMn8;->h:LDT7;

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

    iput p3, p0, LMn8;->b:I

    return-void
.end method

.method public static a(I)LMn8;
    .locals 1

    if-eqz p0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LMn8;->g:LMn8;

    return-object p0

    :cond_1
    sget-object p0, LMn8;->f:LMn8;

    return-object p0

    :cond_2
    sget-object p0, LMn8;->e:LMn8;

    return-object p0

    :cond_3
    sget-object p0, LMn8;->d:LMn8;

    return-object p0

    :cond_4
    sget-object p0, LMn8;->c:LMn8;

    return-object p0
.end method

.method public static values()[LMn8;
    .locals 1

    sget-object v0, LMn8;->i:[LMn8;

    invoke-virtual {v0}, [LMn8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LMn8;

    return-object v0
.end method


# virtual methods
.method public final zzc()I
    .locals 1

    iget v0, p0, LMn8;->b:I

    return v0
.end method
