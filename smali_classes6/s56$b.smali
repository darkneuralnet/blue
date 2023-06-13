.class public final enum Ls56$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls56;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ls56$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Ls56$b;

.field public static final enum c:Ls56$b;

.field public static final enum d:Ls56$b;

.field public static final synthetic e:[Ls56$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Ls56$b;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ls56$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls56$b;->b:Ls56$b;

    new-instance v1, Ls56$b;

    const-string v3, "BAD_CONFIG"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ls56$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ls56$b;->c:Ls56$b;

    new-instance v3, Ls56$b;

    const-string v5, "AUTH_ERROR"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ls56$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ls56$b;->d:Ls56$b;

    const/4 v5, 0x3

    new-array v5, v5, [Ls56$b;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Ls56$b;->e:[Ls56$b;

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

.method public static valueOf(Ljava/lang/String;)Ls56$b;
    .locals 1

    const-class v0, Ls56$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ls56$b;

    return-object p0
.end method

.method public static values()[Ls56$b;
    .locals 1

    sget-object v0, Ls56$b;->e:[Ls56$b;

    invoke-virtual {v0}, [Ls56$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls56$b;

    return-object v0
.end method
