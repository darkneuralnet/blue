.class public final LqB6$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LqB6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:LD32;

.field public final b:LD32;


# direct methods
.method public constructor <init>(LD32;LD32;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LqB6$a;->a:LD32;

    iput-object p2, p0, LqB6$a;->b:LD32;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsAnimation$Bounds;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LqB6$d;->f(Landroid/view/WindowInsetsAnimation$Bounds;)LD32;

    move-result-object v0

    iput-object v0, p0, LqB6$a;->a:LD32;

    invoke-static {p1}, LqB6$d;->e(Landroid/view/WindowInsetsAnimation$Bounds;)LD32;

    move-result-object p1

    iput-object p1, p0, LqB6$a;->b:LD32;

    return-void
.end method

.method public static d(Landroid/view/WindowInsetsAnimation$Bounds;)LqB6$a;
    .locals 1

    new-instance v0, LqB6$a;

    invoke-direct {v0, p0}, LqB6$a;-><init>(Landroid/view/WindowInsetsAnimation$Bounds;)V

    return-object v0
.end method


# virtual methods
.method public a()LD32;
    .locals 1

    iget-object v0, p0, LqB6$a;->a:LD32;

    return-object v0
.end method

.method public b()LD32;
    .locals 1

    iget-object v0, p0, LqB6$a;->b:LD32;

    return-object v0
.end method

.method public c()Landroid/view/WindowInsetsAnimation$Bounds;
    .locals 1

    invoke-static {p0}, LqB6$d;->d(LqB6$a;)Landroid/view/WindowInsetsAnimation$Bounds;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bounds{lower="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LqB6$a;->a:LD32;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " upper="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LqB6$a;->b:LD32;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
