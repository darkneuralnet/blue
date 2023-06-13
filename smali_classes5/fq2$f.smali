.class public final enum Lfq2$f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfq2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfq2$f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lfq2$f;

.field public static final enum c:Lfq2$f;

.field public static final enum d:Lfq2$f;

.field public static final synthetic e:[Lfq2$f;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lfq2$f;

    const-string v1, "TOP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfq2$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfq2$f;->b:Lfq2$f;

    new-instance v1, Lfq2$f;

    const-string v3, "CENTER"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lfq2$f;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lfq2$f;->c:Lfq2$f;

    new-instance v3, Lfq2$f;

    const-string v5, "BOTTOM"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lfq2$f;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lfq2$f;->d:Lfq2$f;

    const/4 v5, 0x3

    new-array v5, v5, [Lfq2$f;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lfq2$f;->e:[Lfq2$f;

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

.method public static valueOf(Ljava/lang/String;)Lfq2$f;
    .locals 1

    const-class v0, Lfq2$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfq2$f;

    return-object p0
.end method

.method public static values()[Lfq2$f;
    .locals 1

    sget-object v0, Lfq2$f;->e:[Lfq2$f;

    invoke-virtual {v0}, [Lfq2$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfq2$f;

    return-object v0
.end method
