.class public final enum Lfy0$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfy0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfy0$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum d:Lfy0$a;

.field public static final enum e:Lfy0$a;

.field public static final synthetic f:[Lfy0$a;


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lfy0$a;

    const-string v1, "GET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1, v2}, Lfy0$a;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lfy0$a;->d:Lfy0$a;

    new-instance v1, Lfy0$a;

    const-string v3, "POST"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v3, v4}, Lfy0$a;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v1, Lfy0$a;->e:Lfy0$a;

    const/4 v3, 0x2

    new-array v3, v3, [Lfy0$a;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lfy0$a;->f:[Lfy0$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lfy0$a;->b:Ljava/lang/String;

    iput-boolean p4, p0, Lfy0$a;->c:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lfy0$a;
    .locals 1

    const-class v0, Lfy0$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfy0$a;

    return-object p0
.end method

.method public static values()[Lfy0$a;
    .locals 1

    sget-object v0, Lfy0$a;->f:[Lfy0$a;

    invoke-virtual {v0}, [Lfy0$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfy0$a;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfy0$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lfy0$a;->c:Z

    return v0
.end method
