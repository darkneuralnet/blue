.class public final enum LuD8;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LdR7;


# static fields
.field public static final enum c:LuD8;

.field public static final enum d:LuD8;

.field public static final enum e:LuD8;

.field public static final synthetic f:[LuD8;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, LuD8;

    const-string v1, "UNKNOWN_CLASSIFICATIONS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LuD8;-><init>(Ljava/lang/String;II)V

    sput-object v0, LuD8;->c:LuD8;

    new-instance v1, LuD8;

    const-string v3, "NO_CLASSIFICATIONS"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, LuD8;-><init>(Ljava/lang/String;II)V

    sput-object v1, LuD8;->d:LuD8;

    new-instance v3, LuD8;

    const-string v5, "ALL_CLASSIFICATIONS"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, LuD8;-><init>(Ljava/lang/String;II)V

    sput-object v3, LuD8;->e:LuD8;

    const/4 v5, 0x3

    new-array v5, v5, [LuD8;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, LuD8;->f:[LuD8;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LuD8;->b:I

    return-void
.end method

.method public static values()[LuD8;
    .locals 1

    sget-object v0, LuD8;->f:[LuD8;

    invoke-virtual {v0}, [LuD8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LuD8;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, LuD8;->b:I

    return v0
.end method
