.class public final enum Lc61$g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc61;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc61$g;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lc61$g;

.field public static final enum c:Lc61$g;

.field public static final synthetic d:[Lc61$g;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lc61$g;

    const-string v1, "MEMORY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc61$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc61$g;->b:Lc61$g;

    new-instance v1, Lc61$g;

    const-string v3, "QUALITY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lc61$g;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lc61$g;->c:Lc61$g;

    const/4 v3, 0x2

    new-array v3, v3, [Lc61$g;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lc61$g;->d:[Lc61$g;

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

.method public static valueOf(Ljava/lang/String;)Lc61$g;
    .locals 1

    const-class v0, Lc61$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc61$g;

    return-object p0
.end method

.method public static values()[Lc61$g;
    .locals 1

    sget-object v0, Lc61$g;->d:[Lc61$g;

    invoke-virtual {v0}, [Lc61$g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc61$g;

    return-object v0
.end method
