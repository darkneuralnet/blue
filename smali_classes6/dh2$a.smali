.class public final enum Ldh2$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldh2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldh2$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Ldh2$a;

.field public static final enum c:Ldh2$a;

.field public static final enum d:Ldh2$a;

.field public static final synthetic e:[Ldh2$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Ldh2$a;

    const-string v1, "UNENCRYPTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ldh2$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldh2$a;->b:Ldh2$a;

    new-instance v1, Ldh2$a;

    const-string v3, "ENCRYPTED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ldh2$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ldh2$a;->c:Ldh2$a;

    new-instance v3, Ldh2$a;

    const-string v5, "DECRYPTED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ldh2$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ldh2$a;->d:Ldh2$a;

    const/4 v5, 0x3

    new-array v5, v5, [Ldh2$a;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Ldh2$a;->e:[Ldh2$a;

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

.method public static valueOf(Ljava/lang/String;)Ldh2$a;
    .locals 1

    const-class v0, Ldh2$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldh2$a;

    return-object p0
.end method

.method public static values()[Ldh2$a;
    .locals 1

    sget-object v0, Ldh2$a;->e:[Ldh2$a;

    invoke-virtual {v0}, [Ldh2$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldh2$a;

    return-object v0
.end method
