.class public final enum LaM6;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LaM6;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LaM6;

.field public static final enum d:LaM6;

.field public static final synthetic e:[LaM6;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, LaM6;

    const-string v1, "POST"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, LaM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LaM6;->c:LaM6;

    new-instance v1, LaM6;

    const-string v3, "GET"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v3}, LaM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LaM6;->d:LaM6;

    const/4 v3, 0x2

    new-array v3, v3, [LaM6;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, LaM6;->e:[LaM6;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LaM6;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LaM6;
    .locals 1

    const-class v0, LaM6;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LaM6;

    return-object p0
.end method

.method public static values()[LaM6;
    .locals 1

    sget-object v0, LaM6;->e:[LaM6;

    invoke-virtual {v0}, [LaM6;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LaM6;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, LaM6;->b:Ljava/lang/String;

    return-object v0
.end method
