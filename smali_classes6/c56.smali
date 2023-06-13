.class public abstract enum Lc56;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ld56;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc56;",
        ">;",
        "Ld56;"
    }
.end annotation


# static fields
.field public static final enum b:Lc56;

.field public static final enum c:Lc56;

.field public static final enum d:Lc56;

.field public static final enum e:Lc56;

.field public static final synthetic f:[Lc56;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lc56$a;

    const-string v1, "DOUBLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc56$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc56;->b:Lc56;

    new-instance v1, Lc56$b;

    const-string v3, "LAZILY_PARSED_NUMBER"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lc56$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lc56;->c:Lc56;

    new-instance v3, Lc56$c;

    const-string v5, "LONG_OR_DOUBLE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lc56$c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lc56;->d:Lc56;

    new-instance v5, Lc56$d;

    const-string v7, "BIG_DECIMAL"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lc56$d;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lc56;->e:Lc56;

    const/4 v7, 0x4

    new-array v7, v7, [Lc56;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lc56;->f:[Lc56;

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

.method public synthetic constructor <init>(Ljava/lang/String;ILc56$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lc56;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lc56;
    .locals 1

    const-class v0, Lc56;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc56;

    return-object p0
.end method

.method public static values()[Lc56;
    .locals 1

    sget-object v0, Lc56;->f:[Lc56;

    invoke-virtual {v0}, [Lc56;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc56;

    return-object v0
.end method
