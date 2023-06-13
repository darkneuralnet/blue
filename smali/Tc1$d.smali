.class public final enum LTc1$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LTc1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LTc1$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LTc1$d;

.field public static final synthetic d:[LTc1$d;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LTc1$d;

    const-string v1, "AES256_SIV"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, LTc1$d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LTc1$d;->c:LTc1$d;

    invoke-static {}, LTc1$d;->a()[LTc1$d;

    move-result-object v0

    sput-object v0, LTc1$d;->d:[LTc1$d;

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

    iput-object p3, p0, LTc1$d;->b:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a()[LTc1$d;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [LTc1$d;

    const/4 v1, 0x0

    sget-object v2, LTc1$d;->c:LTc1$d;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LTc1$d;
    .locals 1

    const-class v0, LTc1$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LTc1$d;

    return-object p0
.end method

.method public static values()[LTc1$d;
    .locals 1

    sget-object v0, LTc1$d;->d:[LTc1$d;

    invoke-virtual {v0}, [LTc1$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LTc1$d;

    return-object v0
.end method


# virtual methods
.method public b()LJk2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    iget-object v0, p0, LTc1$d;->b:Ljava/lang/String;

    invoke-static {v0}, LLk2;->a(Ljava/lang/String;)LJk2;

    move-result-object v0

    return-object v0
.end method
