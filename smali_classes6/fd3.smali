.class public final enum Lfd3;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfd3;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lfd3;

.field public static final enum c:Lfd3;

.field public static final enum d:Lfd3;

.field public static final synthetic e:[Lfd3;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lfd3;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfd3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfd3;->b:Lfd3;

    new-instance v1, Lfd3;

    const-string v3, "COMPAT"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lfd3;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lfd3;->c:Lfd3;

    new-instance v3, Lfd3;

    const-string v5, "QUICK_SETUP"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lfd3;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lfd3;->d:Lfd3;

    const/4 v5, 0x3

    new-array v5, v5, [Lfd3;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lfd3;->e:[Lfd3;

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

.method public static valueOf(Ljava/lang/String;)Lfd3;
    .locals 1

    const-class v0, Lfd3;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfd3;

    return-object p0
.end method

.method public static values()[Lfd3;
    .locals 1

    sget-object v0, Lfd3;->e:[Lfd3;

    invoke-virtual {v0}, [Lfd3;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfd3;

    return-object v0
.end method
