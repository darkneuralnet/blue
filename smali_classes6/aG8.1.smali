.class public final enum LaG8;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LaG8;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LaG8;

.field public static final enum d:LaG8;

.field public static final enum e:LaG8;

.field public static final enum f:LaG8;

.field public static final synthetic g:[LaG8;


# instance fields
.field public final b:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, LaG8;

    const-string v1, "SCALAR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LaG8;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LaG8;->c:LaG8;

    new-instance v1, LaG8;

    const-string v3, "VECTOR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, LaG8;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, LaG8;->d:LaG8;

    new-instance v3, LaG8;

    const-string v5, "PACKED_VECTOR"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v4}, LaG8;-><init>(Ljava/lang/String;IZ)V

    sput-object v3, LaG8;->e:LaG8;

    new-instance v5, LaG8;

    const-string v7, "MAP"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v2}, LaG8;-><init>(Ljava/lang/String;IZ)V

    sput-object v5, LaG8;->f:LaG8;

    const/4 v7, 0x4

    new-array v7, v7, [LaG8;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, LaG8;->g:[LaG8;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, LaG8;->b:Z

    return-void
.end method

.method public static values()[LaG8;
    .locals 1

    sget-object v0, LaG8;->g:[LaG8;

    invoke-virtual {v0}, [LaG8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LaG8;

    return-object v0
.end method
