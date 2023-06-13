.class public final enum Lfe6;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfe6;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lfe6;

.field public static final enum c:Lfe6;

.field public static final enum d:Lfe6;

.field public static final enum e:Lfe6;

.field public static final enum f:Lfe6;

.field public static final synthetic g:[Lfe6;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    new-instance v0, Lfe6;

    const-string v1, "NAME"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfe6;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfe6;->b:Lfe6;

    new-instance v1, Lfe6;

    const-string v3, "SYMBOL"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lfe6;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lfe6;->c:Lfe6;

    new-instance v3, Lfe6;

    const-string v5, "LABEL"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lfe6;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lfe6;->d:Lfe6;

    new-instance v5, Lfe6;

    const-string v7, "NAME_AND_SYMBOL"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lfe6;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lfe6;->e:Lfe6;

    new-instance v7, Lfe6;

    const-string v9, "SYMBOL_AND_LABEL"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lfe6;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lfe6;->f:Lfe6;

    const/4 v9, 0x5

    new-array v9, v9, [Lfe6;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lfe6;->g:[Lfe6;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lfe6;
    .locals 1

    const-class v0, Lfe6;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfe6;

    return-object p0
.end method

.method public static values()[Lfe6;
    .locals 1

    sget-object v0, Lfe6;->g:[Lfe6;

    invoke-virtual {v0}, [Lfe6;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfe6;

    return-object v0
.end method
