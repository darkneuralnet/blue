.class final enum Lbo/app/g1$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbo/app/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbo/app/g1$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum d:Lbo/app/g1$a;

.field public static final enum e:Lbo/app/g1$a;

.field private static final synthetic f:[Lbo/app/g1$a;


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lbo/app/g1$a;

    const-string v1, "read_cards_set"

    const-string v2, "read_cards_flat"

    const-string v3, "READ_CARDS"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lbo/app/g1$a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lbo/app/g1$a;->d:Lbo/app/g1$a;

    new-instance v1, Lbo/app/g1$a;

    const-string v2, "viewed_cards_set"

    const-string v3, "viewed_cards_flat"

    const-string v5, "VIEWED_CARDS"

    const/4 v6, 0x1

    invoke-direct {v1, v5, v6, v2, v3}, Lbo/app/g1$a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v1, Lbo/app/g1$a;->e:Lbo/app/g1$a;

    const/4 v2, 0x2

    new-array v2, v2, [Lbo/app/g1$a;

    aput-object v0, v2, v4

    aput-object v1, v2, v6

    sput-object v2, Lbo/app/g1$a;->f:[Lbo/app/g1$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lbo/app/g1$a;->b:Ljava/lang/String;

    iput-object p4, p0, Lbo/app/g1$a;->c:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lbo/app/g1$a;
    .locals 1

    const-class v0, Lbo/app/g1$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbo/app/g1$a;

    return-object p0
.end method

.method public static values()[Lbo/app/g1$a;
    .locals 1

    sget-object v0, Lbo/app/g1$a;->f:[Lbo/app/g1$a;

    invoke-virtual {v0}, [Lbo/app/g1$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbo/app/g1$a;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbo/app/g1$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbo/app/g1$a;->b:Ljava/lang/String;

    return-object v0
.end method
