.class public final LiR0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lja6$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LiR0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LiR0$a;)V
    .locals 0

    invoke-direct {p0}, LiR0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/content/Context;)Lja6$a;
    .locals 0

    invoke-virtual {p0, p1}, LiR0$b;->b(Landroid/content/Context;)LiR0$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/content/Context;)LiR0$b;
    .locals 0

    invoke-static {p1}, LCZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, LiR0$b;->a:Landroid/content/Context;

    return-object p0
.end method

.method public build()Lja6;
    .locals 3

    iget-object v0, p0, LiR0$b;->a:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, LCZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, LiR0;

    iget-object v1, p0, LiR0$b;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LiR0;-><init>(Landroid/content/Context;LiR0$a;)V

    return-object v0
.end method
