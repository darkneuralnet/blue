.class public final enum LWL6$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LWL6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LWL6$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LWL6$b;

.field public static final enum d:LWL6$b;

.field public static final synthetic e:[LWL6$b;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, LWL6$b;

    const-string v1, "total_sd"

    const-string v2, "TOTAL_SD"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LWL6$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LWL6$b;->c:LWL6$b;

    new-instance v1, LWL6$b;

    const-string v2, "total_ud"

    const-string v4, "TOTAL_UD"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, LWL6$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LWL6$b;->d:LWL6$b;

    const/4 v2, 0x2

    new-array v2, v2, [LWL6$b;

    aput-object v0, v2, v3

    aput-object v1, v2, v5

    sput-object v2, LWL6$b;->e:[LWL6$b;

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

    iput-object p3, p0, LWL6$b;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LWL6$b;
    .locals 1

    const-class v0, LWL6$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LWL6$b;

    return-object p0
.end method

.method public static values()[LWL6$b;
    .locals 1

    sget-object v0, LWL6$b;->e:[LWL6$b;

    invoke-virtual {v0}, [LWL6$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LWL6$b;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, LWL6$b;->b:Ljava/lang/String;

    return-object v0
.end method
