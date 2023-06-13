.class public final enum LGv9;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LQm9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LGv9;",
        ">;",
        "LQm9;"
    }
.end annotation


# static fields
.field public static final enum c:LGv9;

.field public static final enum d:LGv9;

.field public static final enum e:LGv9;

.field public static final enum f:LGv9;

.field public static final g:LWm9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWm9<",
            "LGv9;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic h:[LGv9;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    new-instance v0, LGv9;

    const-string v1, "ARM7"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, LGv9;-><init>(Ljava/lang/String;II)V

    sput-object v0, LGv9;->c:LGv9;

    new-instance v1, LGv9;

    const-string v4, "X86"

    const/4 v5, 0x1

    const/4 v6, 0x4

    invoke-direct {v1, v4, v5, v6}, LGv9;-><init>(Ljava/lang/String;II)V

    sput-object v1, LGv9;->d:LGv9;

    new-instance v4, LGv9;

    const-string v7, "ARM64"

    const/4 v8, 0x5

    invoke-direct {v4, v7, v3, v8}, LGv9;-><init>(Ljava/lang/String;II)V

    sput-object v4, LGv9;->e:LGv9;

    new-instance v7, LGv9;

    const/4 v8, 0x6

    const-string v9, "X86_64"

    const/4 v10, 0x3

    invoke-direct {v7, v9, v10, v8}, LGv9;-><init>(Ljava/lang/String;II)V

    sput-object v7, LGv9;->f:LGv9;

    new-array v6, v6, [LGv9;

    aput-object v0, v6, v2

    aput-object v1, v6, v5

    aput-object v4, v6, v3

    aput-object v7, v6, v10

    sput-object v6, LGv9;->h:[LGv9;

    new-instance v0, LYu9;

    invoke-direct {v0}, LYu9;-><init>()V

    sput-object v0, LGv9;->g:LWm9;

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

    iput p3, p0, LGv9;->b:I

    return-void
.end method

.method public static a()Lcn9;
    .locals 1

    sget-object v0, Lav9;->a:Lcn9;

    return-object v0
.end method

.method public static b(I)LGv9;
    .locals 1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x4

    if-eq p0, v0, :cond_2

    const/4 v0, 0x5

    if-eq p0, v0, :cond_1

    const/4 v0, 0x6

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LGv9;->f:LGv9;

    return-object p0

    :cond_1
    sget-object p0, LGv9;->e:LGv9;

    return-object p0

    :cond_2
    sget-object p0, LGv9;->d:LGv9;

    return-object p0

    :cond_3
    sget-object p0, LGv9;->c:LGv9;

    return-object p0
.end method

.method public static values()[LGv9;
    .locals 1

    sget-object v0, LGv9;->h:[LGv9;

    invoke-virtual {v0}, [LGv9;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LGv9;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v1, LGv9;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " number="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LGv9;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, LGv9;->b:I

    return v0
.end method
