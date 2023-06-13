.class public final enum LAy5$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LAy5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LAy5$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LAy5$a;

.field public static final enum c:LAy5$a;

.field public static final synthetic d:[LAy5$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LAy5$a;

    const-string v1, "SIMULTANEOUSLY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LAy5$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LAy5$a;->b:LAy5$a;

    new-instance v0, LAy5$a;

    const-string v1, "INDIVIDUALLY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LAy5$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LAy5$a;->c:LAy5$a;

    invoke-static {}, LAy5$a;->a()[LAy5$a;

    move-result-object v0

    sput-object v0, LAy5$a;->d:[LAy5$a;

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

.method public static synthetic a()[LAy5$a;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LAy5$a;

    const/4 v1, 0x0

    sget-object v2, LAy5$a;->b:LAy5$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LAy5$a;->c:LAy5$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static b(I)LAy5$a;
    .locals 3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget-object p0, LAy5$a;->c:LAy5$a;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown trim path type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, LAy5$a;->b:LAy5$a;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LAy5$a;
    .locals 1

    const-class v0, LAy5$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LAy5$a;

    return-object p0
.end method

.method public static values()[LAy5$a;
    .locals 1

    sget-object v0, LAy5$a;->d:[LAy5$a;

    invoke-virtual {v0}, [LAy5$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LAy5$a;

    return-object v0
.end method
