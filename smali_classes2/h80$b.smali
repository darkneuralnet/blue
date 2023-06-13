.class public final enum Lh80$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh80;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lh80$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005\u00a8\u0006\t"
    }
    d2 = {
        "Lh80$b;",
        "",
        "",
        "b",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "type",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "android-sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final enum c:Lh80$b;

.field public static final enum d:Lh80$b;

.field public static final enum e:Lh80$b;

.field public static final enum f:Lh80$b;

.field public static final enum g:Lh80$b;

.field public static final enum h:Lh80$b;

.field public static final synthetic i:[Lh80$b;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lh80$b;

    const/4 v1, 0x0

    const-string v2, "integer"

    const-string v3, "INTEGER"

    invoke-direct {v0, v3, v1, v2}, Lh80$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lh80$b;->c:Lh80$b;

    new-instance v0, Lh80$b;

    const/4 v1, 0x1

    const-string v2, "color"

    const-string v3, "COLOR"

    invoke-direct {v0, v3, v1, v2}, Lh80$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lh80$b;->d:Lh80$b;

    new-instance v0, Lh80$b;

    const/4 v1, 0x2

    const-string v2, "bool"

    const-string v3, "BOOLEAN"

    invoke-direct {v0, v3, v1, v2}, Lh80$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lh80$b;->e:Lh80$b;

    new-instance v0, Lh80$b;

    const/4 v1, 0x3

    const-string v2, "string"

    const-string v3, "STRING"

    invoke-direct {v0, v3, v1, v2}, Lh80$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lh80$b;->f:Lh80$b;

    new-instance v0, Lh80$b;

    const/4 v1, 0x4

    const-string v2, "drawable"

    const-string v3, "DRAWABLE_IDENTIFIER"

    invoke-direct {v0, v3, v1, v2}, Lh80$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lh80$b;->g:Lh80$b;

    new-instance v0, Lh80$b;

    const/4 v1, 0x5

    const-string v2, "array"

    const-string v3, "STRING_ARRAY"

    invoke-direct {v0, v3, v1, v2}, Lh80$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lh80$b;->h:Lh80$b;

    invoke-static {}, Lh80$b;->a()[Lh80$b;

    move-result-object v0

    sput-object v0, Lh80$b;->i:[Lh80$b;

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

    iput-object p3, p0, Lh80$b;->b:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()[Lh80$b;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lh80$b;

    sget-object v1, Lh80$b;->c:Lh80$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lh80$b;->d:Lh80$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lh80$b;->e:Lh80$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lh80$b;->f:Lh80$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lh80$b;->g:Lh80$b;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lh80$b;->h:Lh80$b;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lh80$b;
    .locals 1

    const-class v0, Lh80$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lh80$b;

    return-object p0
.end method

.method public static values()[Lh80$b;
    .locals 1

    sget-object v0, Lh80$b;->i:[Lh80$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh80$b;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh80$b;->b:Ljava/lang/String;

    return-object v0
.end method
