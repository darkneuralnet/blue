.class public final enum Lfq2$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfq2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfq2$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lfq2$e;

.field public static final enum c:Lfq2$e;

.field public static final synthetic d:[Lfq2$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lfq2$e;

    const-string v1, "HORIZONTAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfq2$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfq2$e;->b:Lfq2$e;

    new-instance v1, Lfq2$e;

    const-string v3, "VERTICAL"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lfq2$e;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lfq2$e;->c:Lfq2$e;

    const/4 v3, 0x2

    new-array v3, v3, [Lfq2$e;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lfq2$e;->d:[Lfq2$e;

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

.method public static valueOf(Ljava/lang/String;)Lfq2$e;
    .locals 1

    const-class v0, Lfq2$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfq2$e;

    return-object p0
.end method

.method public static values()[Lfq2$e;
    .locals 1

    sget-object v0, Lfq2$e;->d:[Lfq2$e;

    invoke-virtual {v0}, [Lfq2$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfq2$e;

    return-object v0
.end method
