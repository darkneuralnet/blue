.class public final enum Lj91$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj91;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lj91$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lj91$a;

.field public static final enum c:Lj91$a;

.field public static final enum d:Lj91$a;

.field public static final enum e:Lj91$a;

.field public static final synthetic f:[Lj91$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lj91$a;

    const-string v1, "UID"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lj91$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj91$a;->b:Lj91$a;

    new-instance v1, Lj91$a;

    const-string v3, "URL"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lj91$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lj91$a;->c:Lj91$a;

    new-instance v3, Lj91$a;

    const-string v5, "TLM"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lj91$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lj91$a;->d:Lj91$a;

    new-instance v5, Lj91$a;

    const-string v7, "EID"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lj91$a;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lj91$a;->e:Lj91$a;

    const/4 v7, 0x4

    new-array v7, v7, [Lj91$a;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lj91$a;->f:[Lj91$a;

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

.method public static valueOf(Ljava/lang/String;)Lj91$a;
    .locals 1

    const-class v0, Lj91$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj91$a;

    return-object p0
.end method

.method public static values()[Lj91$a;
    .locals 1

    sget-object v0, Lj91$a;->f:[Lj91$a;

    invoke-virtual {v0}, [Lj91$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj91$a;

    return-object v0
.end method
