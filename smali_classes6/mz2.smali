.class public abstract enum Lmz2;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmz2;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lmz2;

.field public static final enum c:Lmz2;

.field public static final synthetic d:[Lmz2;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lmz2$a;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lmz2$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmz2;->b:Lmz2;

    new-instance v1, Lmz2$b;

    const-string v3, "STRING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lmz2$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lmz2;->c:Lmz2;

    const/4 v3, 0x2

    new-array v3, v3, [Lmz2;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lmz2;->d:[Lmz2;

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

.method public synthetic constructor <init>(Ljava/lang/String;ILmz2$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lmz2;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lmz2;
    .locals 1

    const-class v0, Lmz2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmz2;

    return-object p0
.end method

.method public static values()[Lmz2;
    .locals 1

    sget-object v0, Lmz2;->d:[Lmz2;

    invoke-virtual {v0}, [Lmz2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmz2;

    return-object v0
.end method
