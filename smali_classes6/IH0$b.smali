.class public final LIH0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgk0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIH0;
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

.method public synthetic constructor <init>(LIH0$a;)V
    .locals 0

    invoke-direct {p0}, LIH0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/content/Context;)Lgk0$a;
    .locals 0

    invoke-virtual {p0, p1}, LIH0$b;->b(Landroid/content/Context;)LIH0$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/content/Context;)LIH0$b;
    .locals 0

    invoke-static {p1}, LyZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, LIH0$b;->a:Landroid/content/Context;

    return-object p0
.end method

.method public build()Lgk0;
    .locals 3

    iget-object v0, p0, LIH0$b;->a:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, LyZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, LIH0$c;

    iget-object v1, p0, LIH0$b;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LIH0$c;-><init>(Landroid/content/Context;LIH0$a;)V

    return-object v0
.end method
